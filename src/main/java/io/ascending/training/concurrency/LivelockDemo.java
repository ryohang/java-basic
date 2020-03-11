package io.ascending.training.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class LivelockDemo {
    public static void main(String[] args) {
        Account acct1 = new Account(101, 5000);
        Account acct2 = new Account(102, 7000);
        // Creating two threads
        Thread thread1 = new Thread(new Operation(acct1, acct2, 100));
        Thread thread2 = new Thread(new Operation(acct2, acct1, 100));

        thread1.start();
        thread2.start();
    }
}
class Account {
    int acctNum;
    int balance;
    ReentrantLock lock = new ReentrantLock();

    Account(int acctNum, int balance) {
        this.acctNum = acctNum;
        this.balance = balance;
    }

    /**
     * Method for depositing amount
     *
     * @param amount
     * @return
     */
    public boolean deposit(int amount) {
        System.out.println("In deposit method");
        if (this.lock.tryLock()) {
            try {
                // Simulating some delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("deposit in " + this.acctNum + " for "
                    + Thread.currentThread().getName());
            this.balance = balance + amount;
            return true;
        }
        return false;
    }

    /**
     * Method for withdrawing amount
     *
     * @param amount
     * @return
     */
    public boolean withdraw(int amount) {
        System.out.println("In withdraw method");
        if (this.lock.tryLock()) {
            try {
                // Simulating some delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Withdrawn from " + this.acctNum + " for "
                    + Thread.currentThread().getName());
            this.balance = balance - amount;
            return true;
        }
        return false;
    }
// thread 1 account1.transact(account2){
//        account1.withdraw(100)  account1.lock
    //  account2.deposit(100)      account2.lock
//}
    //thread 2 account2.trasact(account1){
        //account2.withdraw(100) account2.lock
        //account1.deposit(100) account1.lock
    //}
    public boolean transact(Account targetAcct, int amount){
        //System.out.println("In transact method " + targetAcct);
        boolean flag = false;
        // If you can withdraw from the source account and
        // deposit it into target account then only return true
        // this=account1 , targetAcct = account2;
        if(this.withdraw(amount) && targetAcct.deposit(amount)){
            flag = true;
        }else{
            // Rollback and deposit the withdrawn amount back in source account
            System.out.println("Failed to deposit in " + targetAcct.acctNum +
                    " depositing back in account " + this.acctNum);
            this.deposit(amount);

        }
        return flag;
    }
}

class Operation implements Runnable{
    Account sourceAccount;
    Account targetAccount;
    int amount;
    Operation(Account sourceAccount, Account targetAccount, int amount){
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.amount = amount;
    }

    @Override
    public void run() {

        sourceAccount.transact(targetAccount, amount);
//        while(!sourceAccount.transact(targetAccount, amount)){
//            continue;
//        }
    }

}
