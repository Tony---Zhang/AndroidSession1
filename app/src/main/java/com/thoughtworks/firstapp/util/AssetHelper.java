package com.thoughtworks.firstapp.util;

import android.content.Context;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

public class AssetHelper {

    public static <T> T readAssetResource(Context context, String fileName, Class<T> tClass) {
        try {
            InputStream inputStream = context.getAssets().open(fileName);
            Gson gson = new Gson();
            T t = gson.fromJson(new InputStreamReader(inputStream), tClass);
            inputStream.close();
            return t;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T readAssetResource(Context context, String fileName, Type typeOfT) {
        try {
            InputStream inputStream = context.getAssets().open(fileName);
            Gson gson = new Gson();
            T t = gson.fromJson(new InputStreamReader(inputStream), typeOfT);
            inputStream.close();
            return t;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
