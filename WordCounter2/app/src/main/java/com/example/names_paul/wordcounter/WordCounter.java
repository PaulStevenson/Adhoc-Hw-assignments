package com.example.names_paul.wordcounter;

import android.text.Editable;

/**
 * Created by names-paul on 28/05/2018.
 */

public class WordCounter {

    String sentence;
    String[] wordList;


    public WordCounter(Editable sentence){
        this.sentence = sentence;
        this.wordList = null;
    }


    public int countWordsInList() {
        this.wordList = this.sentence.split(" ");
        return wordList.length;
    }
};

