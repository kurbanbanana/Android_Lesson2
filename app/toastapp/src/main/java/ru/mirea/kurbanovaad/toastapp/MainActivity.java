package ru.mirea.kurbanovaad.toastapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        String inputText = editText.getText().toString();
        int count = inputText.length();

        String message = "СТУДЕНТ №12 X ГРУППА БСБО-09-21 X Количество символов - " + count;
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.show();
        count = 0;
    }
}