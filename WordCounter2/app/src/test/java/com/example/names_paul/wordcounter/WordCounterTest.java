package com.example.names_paul.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by names-paul on 28/05/2018.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("My name is Paul");

    }

    @Test
    public void canCountWordList() {
        assertEquals(4, wordCounter.countWordsInList());
    }
}



