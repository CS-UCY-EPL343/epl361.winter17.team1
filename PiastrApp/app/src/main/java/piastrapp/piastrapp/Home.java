package piastrapp.piastrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;



public class Home extends AppCompatActivity {

    private static Button button_contactus;
    private static Button button_design;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        onClickButtonListener();
    }


    public void onClickButtonListener() {

        button_design = (Button) findViewById(R.id.button_design);
        button_design.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent1 = new Intent(Home.this, Design.class);
                                                 startActivity(intent1);
                                             }
                                         }
        );

        button_contactus = (Button) findViewById(R.id.button_contactus);
        button_contactus.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent1 = new Intent(Home.this, ContactUs.class);
                                                 startActivity(intent1);
                                             }
                                         }
        );


    }
}
