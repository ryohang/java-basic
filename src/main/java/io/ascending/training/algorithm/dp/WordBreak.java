package io.ascending.training.algorithm.dp;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    public boolean run(String s, Set<String> dict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        /* First DP
        for(int i = 1; i <= s.length(); i++){
            for(String str: dict){
                if(str.length() <= i){
                    if(f[i - str.length()]){
                        if(s.substring(i-str.length(), i).equals(str)){
                            f[i] = true;
                            break;
                        }
                    }
                }
            }
        }*/
        //Second DP
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && dict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }
    public static void main(String[] args){
        String s ="applepenapple";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("apple");
        wordDict.add("pen");
        WordBreak wb = new WordBreak();
        Boolean result = wb.run(s,wordDict);
        System.out.println(result);
    }
}
