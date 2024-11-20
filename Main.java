package com.robert;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.LinkedList;
import java.util.List;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public  static String[] findWords(String[] words) {
        List<String> list = new LinkedList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (String word : words){
            if(row1.contains(String.valueOf(word.charAt(0)).toLowerCase())){
                for(int i = 1; i < word.length(); i++){
                    if(!row1.contains(String.valueOf(word.charAt(i)).toLowerCase())){
                        break;
                    }
                    if((i == word.length() - 1)){
                        list.add(word);
                    }
                }
                if(word.length() == 1) {
                    list.add(word);
                }
            }
            else if(row2.contains(String.valueOf(word.charAt(0)).toLowerCase())){
                for(int i = 1; i < word.length(); i++){
                    if(!row2.contains(String.valueOf(word.charAt(i)).toLowerCase())){
                        break;
                    }
                    if(i == word.length()-1){
                        list.add(word);
                    }
                }
                if(word.length() == 1) {
                    list.add(word);
                }
            }
            else if(row3.contains(String.valueOf(word.charAt(0)).toLowerCase())){
                for(int i = 1; i < word.length(); i++){
                    if(!row3.contains(String.valueOf(word.charAt(i)).toLowerCase())){
                        break;
                    }
                    if(i == word.length()-1){
                        list.add(word);
                    }
                }
                if(word.length() == 1) {
                    list.add(word);
                }
            }
        }

        return list.toArray(new String[0]);
    }

}