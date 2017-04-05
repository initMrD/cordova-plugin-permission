# cordova-plugin-permission
# 针对Android6.0权限的插件
若cordova项目在Android6.0以上无法获取权限，可是使用这个插件手动获取权限。
当然，你不想这么麻烦的话，可以在AndroidManifest.xml中将android:targetSdkVersion修改为22。
### 第一步：
需要在AndroidManifest.xml中添加你需要的权限

``` stylus
<uses-permission android:name="你权限的名称" />
```
例如：

``` stylus
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```


在Android6.0中，权限分为普通权限和危险权限，普通权限只需要在AndroidManifest.xml中添加权限即可。而危险权限则需要本插件的支持。
危险权限列表：

``` stylus
group:android.permission-group.CONTACTS
  permission:android.permission.WRITE_CONTACTS
  permission:android.permission.GET_ACCOUNTS
  permission:android.permission.READ_CONTACTS

group:android.permission-group.PHONE
  permission:android.permission.READ_CALL_LOG
  permission:android.permission.READ_PHONE_STATE
  permission:android.permission.CALL_PHONE
  permission:android.permission.WRITE_CALL_LOG
  permission:android.permission.USE_SIP
  permission:android.permission.PROCESS_OUTGOING_CALLS
  permission:com.android.voicemail.permission.ADD_VOICEMAIL

group:android.permission-group.CALENDAR
  permission:android.permission.READ_CALENDAR
  permission:android.permission.WRITE_CALENDAR

group:android.permission-group.CAMERA
  permission:android.permission.CAMERA

group:android.permission-group.SENSORS
  permission:android.permission.BODY_SENSORS

group:android.permission-group.LOCATION
  permission:android.permission.ACCESS_FINE_LOCATION
  permission:android.permission.ACCESS_COARSE_LOCATION

group:android.permission-group.STORAGE
  permission:android.permission.READ_EXTERNAL_STORAGE
  permission:android.permission.WRITE_EXTERNAL_STORAGE

group:android.permission-group.MICROPHONE
  permission:android.permission.RECORD_AUDIO

group:android.permission-group.SMS
  permission:android.permission.READ_SMS
  permission:android.permission.RECEIVE_WAP_PUSH
  permission:android.permission.RECEIVE_MMS
  permission:android.permission.RECEIVE_SMS
  permission:android.permission.SEND_SMS
  permission:android.permission.READ_CELL_BROADCASTS
```
在该列表内的权限获取才需要这个插件。
需要注意的地方，在同一个group内，只需要拿到其中一个权限，其他的权限则会自动获取。

### 第二步:
安装插件：
``` stylus
cordova plugin add https://github.com/initMrD/cordova-plugin-permission.git
```

### 第三步:
使用：
可同时添加多个权限。
``` stylus
Permission.requestPermission(["你的权限名称1","你的权限名称2"]);
```
例如：

``` stylus
Permission.requestPermission(["android.permission.WRITE_EXTERNAL_STORAGE"]);
```




