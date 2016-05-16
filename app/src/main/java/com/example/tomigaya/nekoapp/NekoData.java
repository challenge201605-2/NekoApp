package com.example.tomigaya.nekoapp;

import java.util.HashMap;

/**
 * Created by katsuyafujii on 5/16/16.
 */
public class NekoData {
    public static final HashMap<Integer, String> NEKO_DATA =
            new HashMap<Integer, String>() {
                {
                    put(R.drawable.neko1, "オムライス");
                    put(R.drawable.neko2, "うどん");
                    put(R.drawable.neko3, "トムヤンクン");
                    put(R.drawable.neko4, "ビーフストロガロフ");
                    put(R.drawable.neko5, "北京ダック");
                    put(R.drawable.neko6, "ジャーマンポテト");
                    put(R.drawable.neko7, "ヒョットヤーケ");
                    put(R.drawable.neko8, "もってのかも");
                    put(R.drawable.neko9, "シシカバブ");
                    put(R.drawable.neko10, "クレームブリュレ");
                    put(R.drawable.neko11, "ニュンベルクソーセージ");
                    put(R.drawable.neko12, "ドルマ");
                }
            };

    public static final HashMap<String, Integer> FOOD_DATA =
            new HashMap<String, Integer>() {
                {
                    put("オムライス",R.drawable.neko1 );
                    put("うどん",R.drawable.neko2);
                    put("トムヤンクン",R.drawable.neko3);
                    put("ビーフストロガロフ",R.drawable.neko4);
                    put("北京ダック",R.drawable.neko5);
                    put("ジャーマンポテト",R.drawable.neko6);
                    put("ヒョットヤーケ",R.drawable.neko7);
                    put( "もってのほか",R.drawable.neko8);
                    put("シシカバブ",R.drawable.neko9);
                    put("クレームブリュレ",R.drawable.neko10);
                    put( "ニュンベルクソーセージ",R.drawable.neko11);
                    put("ドルマ",R.drawable.neko12);
                }
            };
}
