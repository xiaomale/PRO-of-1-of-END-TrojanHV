package com.google.security;

import com.google.security.tools.WebCommucationService;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class WebStartService extends Service{

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Intent i = new Intent(getApplicationContext(),
				WebCommucationService.class);
		stopService(i);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startService(i);
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
