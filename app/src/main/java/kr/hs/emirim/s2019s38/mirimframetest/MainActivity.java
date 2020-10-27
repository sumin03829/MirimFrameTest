package kr.hs.emirim.s2019s38.mirimframetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linerGirl,linerChung,linerSu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linerGirl=findViewById(R.id.liner_girl);
        linerChung=findViewById(R.id.liner_chung);
        linerSu=findViewById(R.id.liner_su);

        Button btnGirl=findViewById(R.id.btn_girl);
        Button btnChung=findViewById(R.id.btn_chung);
        Button btnSu=findViewById(R.id.btn_su);

        btnGirl.setOnClickListener(btnListener);
        btnChung.setOnClickListener(btnListener);
        btnSu.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            linerGirl.setVisibility(View.INVISIBLE);
            linerChung.setVisibility(View.INVISIBLE);
            linerSu.setVisibility(View.INVISIBLE);
            switch (view.getId()){
                case R.id.btn_girl:
                    linerGirl.setVisibility(View.INVISIBLE);
                    break;
                case R.id.btn_chung:
                    linerChung.setVisibility(View.INVISIBLE);
                    break;
                case R.id.btn_su:
                    linerSu.setVisibility(View.INVISIBLE);
                    break;
            }
        }
    };
}