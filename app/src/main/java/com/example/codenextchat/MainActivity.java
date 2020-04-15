package com.example.codenextchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    ArrayList<String> messages = new ArrayList<>();
    ArrayAdapter<String> messagesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);

        ListView listView = findViewById(R.id.list_view);
        messagesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, messages);
        listView.setAdapter(messagesAdapter);
    }

    public void sendMessage(View view) {
        //get the string from the edittext field
        //push the message as a child to the messages object in the db
        String message = editText.getText().toString();
        editText.setText("");
        messages.add(message);
        messagesAdapter.notifyDataSetChanged();
    }
}
