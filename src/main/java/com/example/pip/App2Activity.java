package com.example.pip;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class App2Activity extends Activity {

    Button x;
    Button y;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        addListenerOnButton();
    }



    private void addListenerOnButton() {

        final Context context = this;

        x = (Button) findViewById(R.id.b1);

        x.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent1 = new Intent(context, scroll.class);
                startActivity(intent1);

            }

        });
    }

    private void addListenerOnButton2() {

        final Context context = this;

        y = (Button) findViewById(R.id.b2);

        y.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent2 = new Intent(context,examViewHolder.class);
                startActivity(intent2);

            }

        });
    }

}
