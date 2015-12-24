package com.life.me.mutils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.util.Log;


import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuiyang on 15-5-12.
 */
public class HttpUtils {
    private static HttpUtils singleton = null;

    private HttpUtils() {
    }

    public static HttpUtils getSingleton() {

        if (singleton == null) {

            singleton = new HttpUtils();
        }
        return singleton;
    }

    public boolean hasNetwork(Context context) {
        ConnectivityManager connectManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectManager.getActiveNetworkInfo();
        return null != networkInfo && networkInfo.isAvailable() && networkInfo.isConnected();
    }

//    public void getPostForByJson(RequestQueue v, String url, final Object object, final RequestCallBack callback) {
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
//                s -> callback.success(Utils.decodeUnicode(s).trim()), null) {
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                StringBuffer sb = new StringBuffer();
//                GsonBuilder gson = new GsonBuilder();
//                gson.disableHtmlEscaping();
//                sb.append(gson.create().toJson(object));
//                Log.e(getClass().getName(), "upjson====" + sb.toString());
//                Map<String, String> map = new HashMap<String, String>();
//                map.put("param", sb.toString());
//                return map;
//            }
//        };
//        //设置请求超时时间
//        stringRequest.setRetryPolicy(new DefaultRetryPolicy(10 * 1000, 1, 1.0f));
//        v.add(stringRequest);
//    }
//
//    public void getResultForHttpGet(RequestQueue v, String url, final RequestCallBack callback) {
//        Log.e(getClass().getName(), "get_url===" + url);
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, s -> callback.success(Utils.decodeUnicode(s).trim())
//                , null);
//        stringRequest.setRetryPolicy(new DefaultRetryPolicy(10 * 1000, 1, 1.0f));
//        v.add(stringRequest);
//    }
//
//    public interface RequestCallBack {
//        void success(String result);
////        void volleyError(String error);
//    }
}
