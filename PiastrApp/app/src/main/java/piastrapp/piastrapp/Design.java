package piastrapp.piastrapp;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.content.Intent;
        import android.widget.Button;
        import android.widget.ImageButton;

public class Design extends AppCompatActivity {

    private static Button button_home;
    private static Button button_contactus;
    private static ImageButton button_tshirts;
    private static ImageButton button_cups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_activity);

        onClickButtonListener();
    }


    public void onClickButtonListener() {

        button_contactus = (Button) findViewById(R.id.button_contactus);
        button_contactus.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Intent intent1 = new Intent(Design.this, ContactUs.class);
                                                    startActivity(intent1);
                                                }
                                            }
        );

        button_home = (Button) findViewById(R.id.button_home);
        button_home.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Intent intent1 = new Intent(Design.this, Home.class);
                                                    startActivity(intent1);
                                                }
                                            }
        );

        button_tshirts = (ImageButton) findViewById(R.id.button_tshirts);
        button_tshirts.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent intent1 = new Intent(Design.this, Tshirt_Design.class);
                                               startActivity(intent1);
                                           }
                                       }
        );

        button_cups = (ImageButton) findViewById(R.id.button_cups);
        button_cups.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent intent1 = new Intent(Design.this, Cup_Design.class);
                                               startActivity(intent1);
                                           }
                                       }
        );

    }
}