package com.example.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        private static final String TAG = "Main_Activity";

        private EditText ptResult;
        private Button btn[]=new Button[16];
        private int i=0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                init();
                initListener();
        }

        private void init(){
                btn[0]=findViewById(R.id.num_0);
                btn[1]=findViewById(R.id.num_1);
                btn[2]=findViewById(R.id.num_2);
                btn[3]=findViewById(R.id.num_3);
                btn[4]=findViewById(R.id.num_4);
                btn[5]=findViewById(R.id.num_5);
                btn[6]=findViewById(R.id.num_6);
                btn[7]=findViewById(R.id.num_7);
                btn[8]=findViewById(R.id.num_8);
                btn[9]=findViewById(R.id.num_9);

                btn[10]=findViewById(R.id.btn_plus);
                btn[11]=findViewById(R.id.btn_minus);
                btn[12]=findViewById(R.id.btn_multiple);
                btn[13]=findViewById(R.id.btn_slush);
                btn[14]=findViewById(R.id.btn_clear);
                btn[15]=findViewById(R.id.btn_result);
                ptResult=findViewById(R.id.et_result);

        }

        private void initListener(){
                for (int i=0; i<14;i++){
                        btn[i].setOnClickListener((View view)-> {
                                Button btn = (Button) view;
                                ptResult.append(btn.getText().toString());
                        });
                }
                btn[14].setOnClickListener((View view)-> {
                        ptResult.setText("");
                });
                btn[15].setOnClickListener((View view)-> {
                        String result=ptResult.getText().toString();
                        ptResult.setText(Eval.cal(result));
                });
        }
}