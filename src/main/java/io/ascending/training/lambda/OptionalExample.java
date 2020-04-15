package io.ascending.training.lambda;

import io.ascending.training.collection.Employee;
import io.ascending.training.collection.Manager;

import java.sql.Array;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalExample {
    public class Computer {
        private Optional<Soundcard> soundcard;
        public Optional<Soundcard> getSoundcard() {
            return this.soundcard;
        }

        public void setSoundcard(Optional<Soundcard> soundcard) {
            this.soundcard = soundcard;
        }
    }

    public class Soundcard {
        private Optional<USB> usb;
        public Optional<USB> getUSB() {
            return this.usb;
        };

        public void setUsb(Optional<USB> usb) {
            this.usb = usb;
        }
    }
    public class USB{
        public USB(String version) {
            this.version = version;
        }

        private String version;
        public String getVersion(){
            return version;
        }
    }

    public <U extends Employee> void methodType(U t){
        System.out.println(t);
        super.hashCode();
    }
    public static void copy(List<? super Manager> dest, List<? extends Manager> src) {
        for (int i = 0; i < src.size(); i++)
            dest.set(i, src.get(i));
    }

    public static void main(String[] args){
        OptionalExample example = new OptionalExample();
        USB usb = example.new USB("1.1");

        Soundcard sc = example.new Soundcard();
        sc.setUsb(Optional.of(usb));

        Computer c = example.new Computer();
        c.setSoundcard(Optional.of(sc));
//        c.setSoundcard(Optional.empty());

//        Optional<Computer> oc = Optional.of(c);
//        == oc.get().getSoundcard();
        String name = Optional.of(c).flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
//        System.out.println(name);
//        OptionalExample<String> ex = new OptionalExample();
//        Manager m = new Manager();
//        StandardDeck sd = new StandardDeck();
//        ex.methodType(m);
//
//        List<Manager> ms= new ArrayList();
//        List<Employee> es = new ArrayList();
//        copy(ms,ms);
        List<Integer> l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        List<List<Integer>> twoD = new ArrayList<>();
        twoD.add(l1);
        twoD.add(l2);

//        List<List<List<Integer>>> result2 = new ArrayList<>();
//        [[[0,1],[0,1],[0,1]],[[0,1],[0,1],[0,1]]]
//        [[0,1],[0,1],[0,1],[0,1],[0,1],[0,1]]
//        [0,1,0,1,0,1,0,1,0,1,0,1]
//        result2.stream().flatMap(l->l.stream()).flatMap(l5->l5.stream()).filter()
       List<List<Integer>> result2 = new ArrayList<>();

        List<Integer> result = twoD.stream().flatMap(l->l.stream())
                .map(e->e+1).collect(Collectors.toList());
        System.out.println("======== result 1 ==========");
        System.out.println(result);
        //[[2,3][4,5]]
        twoD.stream().forEach(e->{
            result2.add(e.stream().map(i->i+1).collect(Collectors.toList()));
        });
        System.out.println("======== result 2 ==========");
        System.out.println(result2);

        System.out.println("======== result 3 ==========");
        List<List<Integer>> result3 = twoD.stream().map(l->l.stream().map(i->i+1).collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println(result3);

        List<? extends Number> foo3 = new ArrayList<Number>();
        List<? super Number> foo4 = new ArrayList<>();
    }

}
