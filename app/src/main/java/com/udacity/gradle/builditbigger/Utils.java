package com.udacity.gradle.builditbigger;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by Mohamed Elgendy on 6/5/2017.
 */

public class Utils {

    public static ProgressDialog getProgressDialog(
            Context context, String message, boolean canCancelable,
            boolean canceledOnTouchOutside) {

        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(canCancelable);
        progressDialog.setCanceledOnTouchOutside(canceledOnTouchOutside);
        progressDialog.setMessage(message);
        return progressDialog;
    }
}
