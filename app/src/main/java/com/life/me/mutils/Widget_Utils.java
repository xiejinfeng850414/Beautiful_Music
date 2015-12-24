package com.life.me.mutils;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;

import com.life.me.R;

/**
 * Created by cuiyang on 15/12/22.
 */
public class Widget_Utils {
    private static AlertDialog.Builder dialog;

    public static void showSnacker(View view, String message) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
    }

    public static void showDialog(Context mContext, String Content) {
        dialog = new AlertDialog.Builder(mContext);
        dialog.setMessage(Content);
        dialog.setNegativeButton("好的", null);
        dialog.show();
    }
}
