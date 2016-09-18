package com.example.amar.webapi;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import adapter.InfoAdapter;

public class MainActivity extends AppCompatActivity {
    Button button;
    String url="http://api.androidhive.info/contacts/";
    ListView listview;
    InfoAdapter infoAdapter;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview =(ListView) findViewById(R.id.lvContact);
        button=(Button)findViewById(R.id.webbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ConnectWebService();

            }
        });

    }

      public  void ConnectWebService(){

          JSONObject params=new JSONObject();

              JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, params, onSucess, onError);
              Volley.newRequestQueue(this).add(jsonObjectRequest);
      }
    Response.Listener<JSONObject> onSucess= new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {
            Log.e("res",response.toString());
            Gson gson=new GsonBuilder().create();
            ContactWrapper contactWrapper=gson.fromJson(response.toString(),ContactWrapper.class);

            for(int i=0;i<contactWrapper.getContactlist().size();i++){
                Log.e("size",contactWrapper.getContactlist().get(i).getId()+"");
                Log.e("size",contactWrapper.getContactlist().get(i).getName()+"");
                Log.e("size",contactWrapper.getContactlist().get(i).getAddress()+"");
                Log.e("size",contactWrapper.getContactlist().get(i).getEmail()+"");
                Log.e("size",contactWrapper.getContactlist().get(i).getGender()+"");
                Log.e("size",contactWrapper.getContactlist().get(i).getPhonenumbers()+"");
            }


        }
    };
    Response.ErrorListener onError=new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Log.e("Error",error.toString());
        }
    };

}
