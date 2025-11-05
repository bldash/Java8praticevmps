package com.itv.pratice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String [] args){
        String s="java";
        char a[]=s.toCharArray();
        String maxSubstring=null;
        int maxLength=0;
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],i);
            }
            else{
                i=map.get(a[i]);
                map.clear();
            }
            if(map.size()>maxLength){
                maxLength=map.size();
                maxSubstring=map.keySet().toString();

            }
        }
System.out.println("maxSubstring"+maxSubstring);
    }
}
