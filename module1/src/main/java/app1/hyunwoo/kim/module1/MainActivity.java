package app1.hyunwoo.kim.module1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 네이버 접속
    public void onBtn1Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://naver.com"));
        startActivity(myIntent);
    }

    // 전화 걸기
    public void onBtn2Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:0507-0079-7709"));
        startActivity(myIntent);
    }

    // 새 화면 보여주기
    public void onBtm(View view){
        Intent myIntent = new Intent(getApplicationContext(), NewActivity.class);
        startActivity(myIntent);
    }
}
