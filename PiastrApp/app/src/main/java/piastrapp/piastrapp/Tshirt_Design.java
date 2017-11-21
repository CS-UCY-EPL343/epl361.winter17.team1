package piastrapp.piastrapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Tshirt_Design extends AppCompatActivity {

    private EditText drag_text;
    private TextView text_total;
    private ViewGroup mainLayout;
    private int xDelta;
    private int yDelta;
    private static Button button_submit;
    private static Button button_cancel;
    private static Button button_size_info;
    private static Button button_text;
    private ImageView sw,img_view;
    private ImageButton b1,b2,b3,b4,b5,b6,b7,b8;
    private Spinner spinner,spinner2;
    public int temp = 0;
    public int size = 0;
    public int vis = 0;
    public int photo = 0;
    public int textvis = 0;
    private String price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirt__design);

        mainLayout = (RelativeLayout) findViewById(R.id.tshirt);
        drag_text = (EditText) findViewById(R.id.editText2);
        drag_text.setOnTouchListener(onTouchListener());
        //text_total = (EditText) findViewById(R.id.text_total);
        sw=(ImageView) findViewById(R.id.img);
        img_view=(ImageView) findViewById(R.id.img2);
        b1=(ImageButton) findViewById(R.id.imageButton);
        b2=(ImageButton) findViewById(R.id.imageButton2);
        b3=(ImageButton) findViewById(R.id.imageButton3);

        b4=(ImageButton) findViewById(R.id.imageButton4);
        b5=(ImageButton) findViewById(R.id.imageButton5);
        b6=(ImageButton) findViewById(R.id.imageButton6);
        b7=(ImageButton) findViewById(R.id.imageButton7);
        b8=(ImageButton) findViewById(R.id.imageButton8);

        button_text = (Button) findViewById(R.id.button_text);

        spinner = (Spinner)findViewById(R.id.spinner2);
        spinner2 = (Spinner)findViewById(R.id.spinner3);


        onClickButtonListener();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.drawable.smile);
                temp=0;
                price = culculateTotal(temp,size,vis,textvis);
                TextView textView = (TextView) findViewById(R.id.text_total);
                textView.setText(price);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.drawable.vtshirt);
                temp=1;
                price = culculateTotal(temp,size,vis,textvis);
                //setContentView(R.layout.activity_tshirt__design);
                TextView textView = (TextView) findViewById(R.id.text_total);
                textView.setText(price);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.drawable.white_long_sleeve);
                temp=2;
                price = culculateTotal(temp,size,vis,textvis);
                //setContentView(R.layout.activity_tshirt__design);
                TextView textView = (TextView) findViewById(R.id.text_total);
                textView.setText(price);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vis == 0) {
                    img_view.setVisibility(View.VISIBLE);
                    img_view.setImageResource(R.drawable.heart);
                    photo = 1;
                    vis = 1;
                    price = culculateTotal(temp,size,vis,textvis);
                   // setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 1){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    price = culculateTotal(temp,size,vis,textvis);
                   // setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else{
                    img_view.setImageResource(R.drawable.heart);
                    photo = 1;

                }

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vis == 0) {
                    img_view.setVisibility(View.VISIBLE);
                    img_view.setImageResource(R.drawable.wings);
                    photo = 2;
                    vis = 1;
                    price = culculateTotal(temp,size,vis,textvis);
                    //setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 2){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    price = culculateTotal(temp,size,vis,textvis);
                    //setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else{
                    img_view.setImageResource(R.drawable.wings);
                    photo = 2;

                }

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vis == 0) {
                    img_view.setVisibility(View.VISIBLE);
                    img_view.setImageResource(R.drawable.bow);
                    photo = 3;
                    vis = 1;
                    price = culculateTotal(temp,size,vis,textvis);
                    //setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 3){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    price = culculateTotal(temp,size,vis,textvis);
                    //setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else{
                    img_view.setImageResource(R.drawable.bow);
                    photo = 3;

                }

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vis == 0) {
                    img_view.setVisibility(View.VISIBLE);
                    img_view.setImageResource(R.drawable.tree);
                    photo = 4;
                    vis = 1;
                    price = culculateTotal(temp,size,vis,textvis);
                    //setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 4){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    price = culculateTotal(temp,size,vis,textvis);
                    //setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else{
                    img_view.setImageResource(R.drawable.tree);
                    photo = 4;
                }

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vis == 0) {
                    img_view.setVisibility(View.VISIBLE);
                    img_view.setImageResource(R.drawable.flower);
                    photo = 5;
                    vis = 1;
                    price = culculateTotal(temp,size,vis,textvis);
                    //setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 5){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    price = culculateTotal(temp,size,vis,textvis);
                    //setContentView(R.layout.activity_tshirt__design);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else{
                    img_view.setImageResource(R.drawable.flower);
                    photo = 5;
                }

            }
        });

        List<String> list = new ArrayList<String>();
        list.add("<Choose Color>");
        list.add("Green");
        list.add("Pink");
        list.add("Red");
        list.add("Black");
        list.add("Yellow");
        list.add("Orange");
        list.add("Blue");
        list.add("White");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (temp==0){               //smile
                    switch(i){
                        case 0: sw.setImageResource(R.drawable.smile);
                                break;
                        case 1: sw.setImageResource(R.drawable.green_regular);
                                break;
                        case 2: sw.setImageResource(R.drawable.pink_regular);
                                break;
                        case 3: sw.setImageResource(R.drawable.red_regular);
                                break;
                        case 4: sw.setImageResource(R.drawable.black_regular);
                                break;
                        case 5: sw.setImageResource(R.drawable.yellow_regular);
                                break;
                        case 6: sw.setImageResource(R.drawable.orange_regular);
                                break;
                        case 7: sw.setImageResource(R.drawable.blue_regular);
                                break;
                        case 8: sw.setImageResource(R.drawable.white_regular);
                                break;
                    }

                }else if (temp==1){         //v
                    switch(i) {
                        case 0: sw.setImageResource(R.drawable.vtshirt);
                                break;
                        case 1: sw.setImageResource(R.drawable.green_v_tshirt);
                                break;
                        case 2: sw.setImageResource(R.drawable.pink_v_tshirt);
                                break;
                        case 3: sw.setImageResource(R.drawable.red_v_tshirt);
                                break;
                        case 4: sw.setImageResource(R.drawable.black_v_tshirt);
                                break;
                        case 5: sw.setImageResource(R.drawable.yellow_v_tshirt);
                                break;
                        case 6: sw.setImageResource(R.drawable.orange_v_tshirt);
                                break;
                        case 7: sw.setImageResource(R.drawable.blue_v_tshirt);
                                break;
                        case 8: sw.setImageResource(R.drawable.white_v_tshirt);
                                break;
                    }

                }else{                      //long
                        switch(i){
                            case 0: sw.setImageResource(R.drawable.white_long_sleeve);
                                    break;
                            case 1: sw.setImageResource(R.drawable.green_long_sleeve);
                                    break;
                            case 2: sw.setImageResource(R.drawable.pink_long_sleeve);
                                    break;
                            case 3: sw.setImageResource(R.drawable.red_long_sleeve);
                                    break;
                            case 4: sw.setImageResource(R.drawable.black_long_sleeve);
                                    break;
                            case 5: sw.setImageResource(R.drawable.yellow_long_sleeve);
                                    break;
                            case 6: sw.setImageResource(R.drawable.orange_long_sleeve);
                                    break;
                            case 7: sw.setImageResource(R.drawable.blue_long_sleeve);
                                    break;
                            case 8: sw.setImageResource(R.drawable.white_long_sleeve);
                                    break;
                        }

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        List<String> list2 = new ArrayList<String>();
        list2.add("<Choose Size>");
        list2.add("S");
        list2.add("M");
        list2.add("L");
        list2.add("XL");
        list2.add("XXL");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                size=i-1;
                if(size!=-1){
                    price = culculateTotal(temp,size,vis,textvis);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }
                else size=0;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }
        });

        button_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textvis==0){
                    drag_text.setVisibility(View.VISIBLE);
                    textvis=1;
                    price = culculateTotal(temp,size,vis,textvis);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else{
                    drag_text.setVisibility(View.GONE);
                    textvis=0;
                    price = culculateTotal(temp,size,vis,textvis);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }
            }
        });

    }

    public void onClickButtonListener() {

        button_cancel = (Button) findViewById(R.id.button_cancel);
        button_cancel.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Intent intent1 = new Intent(Tshirt_Design.this, Design.class);
                                                    startActivity(intent1);
                                                }
                                            }
        );

        button_submit = (Button) findViewById(R.id.button_submit);
        button_submit.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent1 = new Intent(Tshirt_Design.this, Order.class);
                                                 startActivity(intent1);
                                             }
                                         }
        );

        button_size_info = (Button) findViewById(R.id.button_size_info);
        button_size_info.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent1 = new Intent(Tshirt_Design.this, size_info.class);
                                                 startActivity(intent1);
                                             }
                                         }
        );
    }
//////////////////////////////////////////////////////////////////
    private View.OnTouchListener onTouchListener() {
        return new View.OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                final int x = (int) event.getRawX();
                final int y = (int) event.getRawY();

                switch (event.getAction() & MotionEvent.ACTION_MASK) {

                    case MotionEvent.ACTION_DOWN:
                        RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams)
                                view.getLayoutParams();

                     xDelta = x - lParams.leftMargin;
                     yDelta = y - lParams.topMargin;
                        break;

                    case MotionEvent.ACTION_POINTER_UP: break;

                    case MotionEvent.ACTION_UP: break;

                    case MotionEvent.ACTION_POINTER_DOWN: break;

                    case MotionEvent.ACTION_MOVE:
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view
                                .getLayoutParams();
                        layoutParams.leftMargin = x - xDelta;
                        layoutParams.topMargin = y - yDelta;
                        layoutParams.rightMargin = xDelta -x;
                        layoutParams.bottomMargin = yDelta - y;
                        view.setLayoutParams(layoutParams);
                        break;
                }
                mainLayout.invalidate();
                return true;
            }
        };
    }

    private String culculateTotal(int style, int size, int photo, int txt){
        int[][] prices = {{10,11,12,13,14},
                         {11,12,13,14,15},
                         {12,13,14,15,16}};

        int total=0;
        String sum;
        total += prices[style][size];

         if (photo != 0)
             total+=4;
         if (txt != 0)
             total+=3;
         sum=Integer.toString(total) +" Euro";
         return sum;
    }
}
