package com.example.deviceid;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView deviceIdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        deviceIdView = (TextView) findViewById(R.id.device_id);

    }
    
	public void getDeviceId(View v) {
	
        TelephonyManager manager=(TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        String deviceId = manager.getDeviceId();
		deviceIdView.setText(deviceId);
	
		
	}
	

/*	public void thirdPartyCall() {
	
	}

	public void thirdPartyUsesDeviceId(String deviceId) {
		
	}*/
}
