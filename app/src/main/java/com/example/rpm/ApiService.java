package com.example.rpm; // Добавляем package statement в начало файла

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

public class ApiService {
    private static final String BASE_URL = "http://192.168.0.103:5000/api/"; // замените на IP вашего компьютера
    private final RequestQueue requestQueue;

    public ApiService(Context context) {
        requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public void getData(final ApiResponseListener listener) {
        String url = BASE_URL + "data";

        JsonArrayRequest request = new JsonArrayRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        listener.onSuccess(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        String errorMessage = error.getMessage() != null ? error.getMessage() : "Unknown error";
                        listener.onError(errorMessage);
                    }
                }
        );

        requestQueue.add(request);
    }

    public interface ApiResponseListener {
        void onSuccess(JSONArray response);
        void onError(String errorMessage);
    }
}