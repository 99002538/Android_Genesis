package com.lnt.myfirstapp;
        import android.content.Intent;
        import android.view.View;
        import android.os.Bundle;
        import android.widget.EditText;
        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.lnt.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {

        Intent intent = new Intent(this, displaymessage.class);

        EditText editText = (EditText) findViewById(R.id.Message);

        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);

    }

}