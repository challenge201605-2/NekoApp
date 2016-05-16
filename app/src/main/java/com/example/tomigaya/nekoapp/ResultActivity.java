package com.example.tomigaya.nekoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //レイアウト（activity_result.xml)より，名前,結果のテキストビューを取得
       // TextView txvName = (TextView) findViewById(R.id.result_txv_name);
        TextView txvDivine = (TextView) findViewById(R.id.result_txv_divine);

        // 遷移元のIntentを取得
        Intent intent=getIntent();

        // 遷移元でセットした氏名を取得し、TextViewに設定する
        String name = intent.getStringExtra(MainActivity.INPUT_NAME);
        //txvName.setText(name);


        //遷移先でセットした結果番号を取得する
        //defaultValue  キーに対応するデータが見つからなかった時，返す値
        String food = intent.getStringExtra(MainActivity.RESULT_FOOD);

        txvDivine.setText(food);








        // レイアウト(activity_result.xml)より、名前と占い結果のテキストビューを取得
        Button divineBtn = (Button) findViewById(R.id.main_btn_divine2);


        //占うボタンにリスナーの設定
        //this このクラス
        divineBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, com.example.tomigaya.nekoapp.MainActivity.class);
        startActivity(intent);
    }
}
