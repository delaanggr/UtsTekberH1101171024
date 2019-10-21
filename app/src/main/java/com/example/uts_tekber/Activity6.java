package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        Button btnMove = findViewById(R.id.BtnSyntax6);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSyntax6();
            }
        });
    }

    private void moveToSyntax6(){
        Intent intent = new Intent(Activity6.this,Syntax6.class);
        startActivity(intent);
    }

    public void link5(View view){
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/broadcasts"));
        startActivity(browserIntent);
    }
}
