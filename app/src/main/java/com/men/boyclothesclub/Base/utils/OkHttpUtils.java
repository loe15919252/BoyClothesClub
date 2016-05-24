package com.men.boyclothesclub.Base.utils;


import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * created dpb on 16/5/20.
 * <p/>
 * e_mail  dengpbs@163.com.
 */
public class OkHttpUtils {
    private static final OkHttpClient okHttpClient = new OkHttpClient();

    /**
     * 同步请求
     *
     * @param request
     * @return
     * @throws IOException
     */
    public static Response excute(Request request) throws IOException {
        return okHttpClient.newCall(request).execute();
    }

    /**
     * 异步请求
     *
     * @param request
     * @param callback
     */
    public static void excute(Request request, Callback callback) {
        okHttpClient.newCall(request).enqueue(callback);
    }


    public static void getRequest(String urlStr,  Callback reqCallBack) {
        // 获取Request对象
        Request request = new Request.Builder()
                .url(urlStr)
                .build();
        // 需要获取Call对象
        Call call = okHttpClient.newCall(request);
        // 将请求提交到队列中
        call.enqueue(reqCallBack);
    }
}
