package sg.edu.rp.c346.id20024313.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate, btnDisplayTime;
    TextView tvDisplay;
    Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datepicker);
        tp=findViewById(R.id.timepicker);
        btnDisplayDate= findViewById(R.id.buttonDisplayDate);
        btnDisplayTime= findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textViewDisplay);
        reset= findViewById(R.id.reset);

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {;
                String timeis= "Time is " + tp.getCurrentHour()
                        +":"+tp.getCurrentMinute();
                tvDisplay.setText(timeis);
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day= dp.getDayOfMonth();
                int month= dp.getMonth()+1;
                int year= dp.getYear();

                tvDisplay.setText("Date is " + day+"/" + month+ "/"+year);
            }
        });
        reset.set_on_click_listener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2020, 0, 1);
            }
        });
        {
    }
}}