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
                    put(R.drawable.neko2, "おでん");
                    put(R.drawable.neko3, "トムヤンクン");
                    put(R.drawable.neko4, "ビーフストロガロフ");
                    put(R.drawable.neko5, "ラーメン");
                    put(R.drawable.neko6, "コロッケ");
                    put(R.drawable.neko7, "ヒョットヤーケ");
                    put(R.drawable.neko8, "もってのほか");
                    put(R.drawable.neko9, "シシカバブ");
                    put(R.drawable.neko10, "クレームブリュレ");
                    put(R.drawable.neko11, "ニュンベルクソーセージ");
                    put(R.drawable.neko12, "ドルマ");
                    put(R.drawable.waru, "何もなし");

                }
            };

    public static final HashMap<String, Integer> FOOD_DATA =
            new HashMap<String, Integer>() {
                {
                    put("オムライス",R.drawable.omu);
                    put("おでん",R.drawable.oden);
                    put("トムヤンクン",R.drawable.tomu);
                    put("ビーフストロガロフ",R.drawable.beaf);
                    put("ラーメン",R.drawable.men);
                    put("コロッケ",R.drawable.korokke);
                    put("ヒョットヤーケ",R.drawable.hyotto);
                    put( "もってのほか",R.drawable.motte);
                    put("シシカバブ",R.drawable.sisikababu);
                    put("クレームブリュレ",R.drawable.kuri);
                    put( "ニュンベルクソーセージ",R.drawable.sausage);
                    put("ドルマ",R.drawable.doruma);
                    put("何もなし",R.drawable.kara2);


                }
            };
}
