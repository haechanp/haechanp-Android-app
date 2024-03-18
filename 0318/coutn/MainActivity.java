package com.example.count;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
        private static final String TAG = "Main_Activity";

        private TextView tvCount;
        private Button btnAdd,  btnMinus;
        private int count=0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                tvCount=findViewById(R.id.tv_count);
                tvCount.setText(count+"");
                btnAdd=findViewById(R.id.btn_add);
                btnMinus=findViewById(R.id.btn_minus);

                btnAdd.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Log.d(TAG, "onClick: btnAdd : "+v.getClass().getName());
                                count++;
                                tvCount.setText(count+"");
                        }
                });

                btnMinus.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                if(count>0) {
                                        count--;
                                        tvCount.setText(count + "");
                                }
                        }
                });

        }
}