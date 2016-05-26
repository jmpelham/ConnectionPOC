package com.morethanwinners.Service;

import java.io.IOException;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.VoiceInteractor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

/**
 * Created by ShanitaP on 5/25/2016.
 */
public class JsonService extends AsyncTask<URL, Void, Long> {

    JSONObject json = null;
    String str = "";
    HttpResponse response;
    HttpClient myClient = new DefaultHttpClient();
    HttpPost myConnection = new HttpPost("http://demos.tricksofit.com/files/json.php");

    @Override
    protected Long doInBackground(URL... params) {
        return null;
    }

    public JsonService() {
    }

    public String getJsonFromUrl(){

        try

        {
            response = myClient.execute(myConnection);
            str = EntityUtils.toString(response.getEntity(), "UTF-8");

        }

        catch(
        ClientProtocolException e
        )

        {
            e.printStackTrace();
        }

        catch( IOException e )
        {
            e.printStackTrace();
            return e.toString();
        }

        try

        {
            JSONArray jArray = new JSONArray(str);
            json = jArray.getJSONObject(0);

            //wid.setText(json.getString("id"));
            //name.setText(json.getString("name"));
            //url.setText(json.getString("url"));
            return json.getString("name");
        }

        catch( JSONException e )
        {
            e.printStackTrace();
            return e.toString();
        }

    }
}
