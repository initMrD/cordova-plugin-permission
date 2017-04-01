package com.initmrd.cordova.plugin;

import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by initMrd@gmail.com on 2017/4/1.
 */

public class Permission extends CordovaPlugin {
    private static final String TAG = "Permission";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("requestPermission")) {
            JSONObject mObject = args.getJSONObject(0);

            Log.d(TAG, "成功进入android requestPermission");
            String[] premissionList = (String[]) mObject.get("PremissionList");
            Log.d(TAG, premissionList.toString());
//            List<String> requestpremissionList = new ArrayList<String>();
//            for (String premissionStr : premissionList) {
//                if (ContextCompat.checkSelfPermission(cordova.getActivity(), premissionStr) == PackageManager.PERMISSION_DENIED) {
//                    requestpremissionList.add(premissionStr);
//                }
//            }
//            ActivityCompat.requestPermissions(cordova.getActivity(),requestpremissionList.toArray(new String[requestpremissionList.size()]),1);
            return true;
        }
        return false;
    }
}
