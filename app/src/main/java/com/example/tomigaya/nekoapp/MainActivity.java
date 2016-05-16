package com.example.tomigaya.nekoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //入力された名前に対応するキー名（定数）
    public static final String INPUT_NAME = "InputName";

    //占い結果の計算値に対応するキー名（定数）
    public static final String RESULT_NUMBER = "ResultNumber";

    // レイアウト(activity_main.xml)より、エディットテキスト(IDがmain_etx_name)を取得
    private EditText etx;

    public ImageButton mNekoButton =  null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //継承元クラスのAppCompatSctivityのonCreateメソッドを呼び出す
        super.onCreate(savedInstanceState);
        //activity_main.xmlを読み込んでいる→画面が表示
        setContentView(R.layout.activity_main);
        //System.out.printlnみたいなもの
        //Log 履歴 情報を残す

        Log.d("LifeCycle", "onCreate");

        // レイアウト(activity_result.xml)より、名前と占い結果のテキストビューを取得
        Button divineBtn = (Button) findViewById(R.id.main_btn_divine);

        mNekoButton = (ImageButton) findViewById(R.id.img_button);
        mNekoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultNumber = new java.util.Random().nextInt(5);
                switch(resultNumber) {
                    case 0:
                        mNekoButton.setImageResource(R.drawable.neko2);
                        break;
                    case 1:
                        mNekoButton.setImageResource(R.drawable.neko3);
                        break;
                    default:
                        mNekoButton.setImageResource(R.drawable.background);
                        break;
                }
            }
        });


        //占うボタンにリスナーの設定
        //this このクラス
        divineBtn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy");
    }


    //押されたビュー（テキスト，ボタン等）の情報
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.main_btn_divine:

                //占うボタンが押された時の処理を書く
                // Intentクラスのオブジェクトを作成
                //this:                 このクラスMainActivity自身
                //ResultActivity.class:遷移先のクラス
                Intent intent = new Intent(this,ResultActivity.class);

                //入力されている名前Stringを文字列として取得
            //    etx = (EditText) findViewById(R.id.main_etx_name);
              //  String inputName = etx.getText().toString();


                //遷移先に渡すデータをセット
                //１取り出すときに指定するキー
                //２実際のデータ
               // intent.putExtra(INPUT_NAME, inputName);

                //0-9までのランダムな値を生成する
                int resultNumber = new java.util.Random().nextInt(10);
                intent.putExtra(RESULT_NUMBER, resultNumber);
                // 画面遷移開始

                startActivity(intent);

                break;


            case R.id.main_btn_divine3:
           //     etx = (EditText) findViewById(R.id.main_etx_name);

                etx.setText("");
                break;
        }
    }
}