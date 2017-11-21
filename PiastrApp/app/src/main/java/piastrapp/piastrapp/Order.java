package piastrapp.piastrapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Order extends AppCompatActivity {
    private Button button_cancel;
    private Button button_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        onClickButtonListener();}

    public void onClickButtonListener() {

        button_cancel = (Button) findViewById(R.id.button_cancel);
        button_cancel.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent1 = new Intent(Order.this, Design.class);
                                                 startActivity(intent1);

                                             }
                                         }
        );



        button_submit = (Button) findViewById(R.id.button_submit);
        button_submit.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Toast.makeText(Order.this, "Your order has been send",Toast.LENGTH_SHORT).show();
                                                 Intent intent1 = new Intent(Order.this, Home.class);
                                                 startActivity(intent1);

                                             }
                                         }
        );



    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    break;
            case R.id.radioButton2:
                if (checked)
                    break;
        }
    };
}
