package com.vvit.myappcsec;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
public class MyAsyncTask extends AsyncTask<Void,Void,String> {
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected String doInBackground(Void... voids) {
        String result = "";
        try {
            result = NetworkUtils.getResponseFromHttpUrl();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
   @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(s);
            JSONArray jsonArray = jsonObject.getJSONArray("results");
            for(int i=0; i< jsonArray.length();i++){
                JSONObject o = jsonArray.getJSONObject(i);
                Log.d("Movie",o.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
