package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Hashmap {
    private Assertions Assert;

    @Test
    public void givenASentence_WhenThreeWordsAdded_ShouldReturnWordFrequency(){
        String sentence= "To be or not to be";
        MyHashmap<String, Integer> myHashmap = new MyHashmap<>();
        String[] words = sentence.toLowerCase().split("");
        for(String word:words){
            myHashmap.get(word);
            Integer value = myHashmap.get(word);
            if(value == null)value=1;
            else value=value+1;
            myHashmap.add(word,value);
        }
        int frequency = myHashmap.get("to");
        System.out.println(myHashmap);
        Assert.assertEquals(2,frequency);
    }
}
