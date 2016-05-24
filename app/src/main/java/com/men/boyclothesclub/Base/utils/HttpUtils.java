package com.men.boyclothesclub.Base.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



import android.util.Log;


public class HttpUtils {

	public static byte[] doGetHttpRequest(String urlStr) throws IOException {
		byte[] b = null;

		URL url = new URL(urlStr);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setConnectTimeout(5*1000);
		conn.setRequestMethod("GET");
		int respCode = conn.getResponseCode();
		if(respCode==HttpURLConnection.HTTP_OK){
			InputStream in = conn.getInputStream();
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] buff = new byte[100];
			int rc = 0;
			while ((rc = in.read(buff)) > 0) {
				bos.write(buff, 0, rc);
			}
			b = bos.toByteArray();
			return b;
		}
		return b;

	}
}
