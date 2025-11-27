package com.DSA.HashMap;

public class KarpRabin {
    private final int PRIME=101;
    private long calculateHash(String str){
        double hash=0;
        for(int i=0; i<str.length(); i++){
            hash =(hash+str.charAt(i)*Math.pow(PRIME, i));
        }
        return (long)hash;
    }
    private long updateHashValue(long prevHashValue, char oldChar, char newChar,int patternLength ){
        long newHash= (prevHashValue-oldChar)/PRIME;
        newHash= (long) (newHash+newChar*Math.pow(PRIME, patternLength-1));
        return newHash;

    }
    public void search(String text, String pattern){
        int patternLength= pattern.length();
        long patterHash=  calculateHash(pattern);
        long textHash= calculateHash(text.substring(0, patternLength));

        for(int i=0; i<=text.length()-patternLength;i++){
            if(textHash==patterHash) {
                if (text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index " + i);
                }
            }
            if(i<text.length()-patternLength){
                textHash= updateHashValue(textHash, text.charAt(i), text.charAt(i+patternLength), patternLength);

            }


        }

    }

}
class Main{
    public static void main(String[] args) {
        KarpRabin alog= new KarpRabin();
        alog.search("ApoorvKunalRahul", "Kunal");
    }
}
