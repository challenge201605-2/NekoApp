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

    //結果の計算値に対応するキー名（定数）
    public static final String RESULT_FOOD = "ResultFood";

    // レイアウト(activity_main.xml)より、エディットテキスト(IDがmain_etx_name)を取得
    private EditText etx;

    public ImageButton mNekoButton =  null;

    // 今表示されている猫画像のID
    private int nekoImageID = R.drawable.neko1;


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
                int resultNumber = new java.util.Random().nextInt(13);
                switch(resultNumber) {
                    case 0:
                        mNekoButton.setImageResource(R.drawable.neko1);
                        nekoImageID = R.drawable.neko1;
                        break;
                    case 1:
                        mNekoButton.setImageResource(R.drawable.neko2);
                        nekoImageID = R.drawable.neko2;
                        break;
                    case 2:
                    mNekoButton.setImageResource(R.drawable.neko3);
                        nekoImageID = R.drawable.neko3;
                        break;
                    case 3:
                        mNekoButton.setImageResource(R.drawable.neko4);
                        nekoImageID = R.drawable.neko4;
                        break;
                    case 4:
                        mNekoButton.setImageResource(R.drawable.neko5);
                        nekoImageID = R.drawable.neko5;
                        break;
                    case 5:
                        mNekoButton.setImageResource(R.drawable.neko6);
                        nekoImageID = R.drawable.neko6;
                        break;
                    case 6:
                        mNekoButton.setImageResource(R.drawable.neko7);
                        nekoImageID = R.drawable.neko7;
                        break;
                    case 7:
                        mNekoButton.setImageResource(R.drawable.neko8);
                        nekoImageID = R.drawable.neko8;
                        break;
                    case 8:
                        mNekoButton.setImageResource(R.drawable.neko9);
                        nekoImageID = R.drawable.neko9;
                        break;
                    case 9:
                        mNekoButton.setImageResource(R.drawable.neko10);
                        nekoImageID = R.drawable.neko10;
                        break;
                    case 10:
                        mNekoButton.setImageResource(R.drawable.neko11);
                        nekoImageID = R.drawable.neko11;
                        break;
                    case 11:
                        mNekoButton.setImageResource(R.drawable.neko12);
                        nekoImageID = R.drawable.neko12;
                        break;

                    default:
                        mNekoButton.setImageResource(R.drawable.waru);
                        nekoImageID = R.drawable.waru;
                        break;
                }
            }
        });


        //占うボタンにリスナーの設定
        //this このクラス
        divineBtn.setOnClickListener(this);
    }

    //押されたビュー（テキスト，ボタン等）の情報
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.main_btn_divine:

                //聞いてみるボタンが押された時の処理を書く
                // Intentクラスのオブジェクトを作成
                //this:                 このクラスMainActivity自身
                //ResultActivity.class:遷移先のクラス
                Intent intent = new Intent(this,ResultActivity.class);



                //0-9までのランダムな値を生成する
//                int resultNumber = new java.util.Random().nextInt(10);
//                intent.putExtra(RESULT_FOOD, resultNumber);
                String food = NekoData.NEKO_DATA.get(nekoImageID);
                intent.putExtra(RESULT_FOOD, food);

                // 画面遷移開始

                startActivity(intent);

                break;

        }
    }
}