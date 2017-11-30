package piastrapp.piastrapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.content.Intent;
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

public class Cup_Design extends AppCompatActivity {

    private static Button button_cancel;
    private static Button button_submit;
    private static Button button_text;
    private ImageButton b4,b5,b6,b7,b8;
    private ImageView img_view;
    private Spinner spinner,spinner2;
    private EditText drag_text;
    private ViewGroup mainLayout;
    private int xDelta;
    private int yDelta;
    public int imgpos;
    public int vis = 0;
    public int photo = 0;
    public int textvis = 0;
    public int quant = 0;
    private String price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cup__design);
        img_view=(ImageView) findViewById(R.id.img2);
        b4=(ImageButton) findViewById(R.id.imageButton4);
        b5=(ImageButton) findViewById(R.id.imageButton5);
        b6=(ImageButton) findViewById(R.id.imageButton6);
        b7=(ImageButton) findViewById(R.id.imageButton7);
        b8=(ImageButton) findViewById(R.id.imageButton8);
        button_text = (Button) findViewById(R.id.button_text);
        spinner = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        mainLayout = (RelativeLayout) findViewById(R.id.cups);
        drag_text = (EditText) findViewById(R.id.editText2);
        drag_text.setOnTouchListener(onTouchListener());

        onClickButtonListener();


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vis == 0) {
                    img_view.setVisibility(View.VISIBLE);
                    img_view.setImageResource(R.drawable.heart);
                    photo = 1;
                    vis = 1;
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 1){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
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
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 2){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
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
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 3){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
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
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 4){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
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
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else if (vis == 1 && photo == 5){
                    vis = 0;
                    img_view.setVisibility(View.GONE);
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else{
                    img_view.setImageResource(R.drawable.flower);
                    photo = 5;
                }

            }
        });

        button_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textvis==0){
                    drag_text.setVisibility(View.VISIBLE);
                    textvis=1;
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }else{
                    drag_text.setVisibility(View.GONE);
                    textvis=0;
                    if(quant == 0)
                        price = culculateTotal(vis,textvis,1);
                    else
                        price = culculateTotal(vis,textvis,quant);
                    TextView textView = (TextView) findViewById(R.id.text_total);
                    textView.setText(price);
                }
            }
        });

        List<String> list = new ArrayList<String>();
        list.add("<Choose Image Position>");
        list.add("180 Degrees");
        list.add("360 Degrees");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                    imgpos = -1;
                else
                    imgpos = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }
        });

        List<String> list2 = new ArrayList<String>();
        list2.add("<Choose Quantity>");
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.add("7");
        list2.add("8");
        list2.add("9");
        list2.add("10+");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int j, long l) {
                quant = j;
                if (j==0)
                    price = culculateTotal(vis,textvis,1);
                else
                    price = culculateTotal(vis,textvis,quant);
                TextView textView = (TextView) findViewById(R.id.text_total);
                textView.setText(price);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }
        });


    }


    public void onClickButtonListener() {

        button_cancel = (Button) findViewById(R.id.button_cancel);
        button_cancel.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent1 = new Intent(Cup_Design.this, Design.class);
                                                 startActivity(intent1);
                                             }
                                         }
        );

        button_submit = (Button) findViewById(R.id.button_submit);
        button_submit.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent1 = new Intent(Cup_Design.this, Order.class);
                                                 startActivity(intent1);
                                             }
                                         }
        );
    }

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


    private String culculateTotal(int photo, int txt, int quant){

        int total=5;
        String sum;

        if (photo != 0)
            total+=4;
        if (txt != 0)
            total+=3;

        total = total * quant;

        sum=Integer.toString(total) +" Euro";
        return sum;
    }
}