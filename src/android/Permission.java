package com.initmrd.cordova.plugin;

import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by initMrd@gmail.com on 2017/4/1.
 */

public class Permission extends CordovaPlugin {
    private static final String TAG = "Permission";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("requestPermission")) {
            JSONArray mObject = args.getJSONArray(0);
            Log.d(TAG, "成功进入android requestPermission");
            List<String> requestpremissionList = new ArrayList<String>();
            for (int i = 0; i<mObject.length();i++) {
                if (ContextCompat.checkSelfPermission(cordova.getActivity(), mObject.get(i)+"") == PackageManager.PERMISSION_DENIED) {
                    requestpremissionList.add(mObject.get(i)+"");
                }
            }
            if(requestpremissionList.size()!=0){
                ActivityCompat.requestPermissions(cordova.getActivity(),requestpremissionList.toArray(new String[requestpremissionList.size()]),1);
            }
            return true;
        }
        return false;
    }
}
