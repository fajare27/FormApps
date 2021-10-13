package net.ariflaksito.formapps;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.idInputName);
        EditText inputEmail = (EditText) findViewById(R.id.idInputEmail);
        EditText inputPhone = (EditText) findViewById(R.id.idInputPhone);
        EditText inputPassword = (EditText) findViewById(R.id.idInputPass);

        Button btnSave = (Button) findViewById(R.id.idButtonSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("--Name--", inputName.getText().toString());
                Log.d("--Email--", inputEmail.getText().toString());
                Log.d("--Phone--", inputPhone.getText().toString());
                Log.d("--Password--", inputPassword.getText().toString());

            }
        });


    }
}