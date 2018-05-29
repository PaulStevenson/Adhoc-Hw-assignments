package com.example.names_paul.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText sentenceEditText;
    Button countWordsButton;
    TextView answerText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        sentenceEditText = findViewById(R.id.sentence_input);
        countWordsButton = findViewById(R.id.count_words);
        answerText = findViewById(R.id.answer);
    }

    public void setCountWordsButtonClicked(View button){

        Editable sentence = sentenceEditText.getText();

        WordCounter wordCounter = new WordCounter(sentence);

        int answer = wordCounter.countWordsInList();

        answerText.setText(answer);
    }
}
