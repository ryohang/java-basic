package io.ascending.training.algorithm.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    List<List<String>> resultLst;
    ArrayList<String> currLst;
    private List<String> temResult;

    public List<List<String>> partition(String s) {
        resultLst = new ArrayList<List<String>>();
        currLst = new ArrayList<String>();
        temResult = new ArrayList<>();
        backTrack(s,0);
//        findPalindromComb(s);
        return resultLst;
    }

    public void backTrack(String s, int l) {
        if (currLst.size() > 0 //the initial str could be palindrome
                && l >= s.length()) {
            List<String> r = (ArrayList<String>) currLst.clone();
            resultLst.add(r);
        }
        for (int i = l; i < s.length(); i++) {
            if (isPalindrome(s, l, i)) {
//                if (l == i)
//                    currLst.add(Character.toString(s.charAt(i)));
//                else
                currLst.add(s.substring(l, i + 1));
                backTrack(s, i + 1);
                currLst.remove(currLst.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String str, int l, int r) {
        if (l == r) return true;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }


    public void findPalindromComb(String s) {
        if (temResult.size() > 0 && s.length() == 0) {
            ArrayList<String> cloneArr = (ArrayList) temResult;
            resultLst.add((ArrayList) cloneArr.clone());
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String curString = s.substring(0, i);
            if (isPalindrom(curString)) {
                temResult.add(curString);
                findPalindromComb(s.substring(i, s.length()));
                temResult.remove(temResult.size() - 1);
            }
        }
    }

    public Boolean isPalindrom(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "aaba";
        Palindrome solution = new Palindrome();
        List<List<String>> result = solution.partition(test);
        System.out.println(result);
    }

}
