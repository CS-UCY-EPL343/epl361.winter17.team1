package piastrapp.piastrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class size_info extends AppCompatActivity {

    private static Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_info);

        onClickButtonListener();
    }

    public void onClickButtonListener() {

        button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Intent intent1 = new Intent(size_info.this, Tshirt_Design.class);
                                                    startActivity(intent1);
                                                }
                                            }
        );
    }
}
