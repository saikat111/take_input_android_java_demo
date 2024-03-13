package com.s.takeinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name, age, idno ,dep,ad;
    private Button upload;
    private TextView n, a, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        idno = findViewById(R.id.idno);
        dep = findViewById(R.id.dep);
        ad = findViewById(R.id.ad);
        upload = findViewById(R.id.upload);
        n = findViewById(R.id.n);
        a = findViewById(R.id.a);
        i = findViewById(R.id.i);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String takeName;
                takeName = name.getText().toString();
               // n.setText(nn);
                Intent intent = new Intent(MainActivity.this,DataActivity.class );
                intent.putExtra("name", takeName);
                startActivity(intent);
            }
        });



    }
}