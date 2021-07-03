package com.example.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.SystemClock;
import android.widget.Toast;

import java.util.Calendar;

public class backgroundprocess extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Ringtone ringtone= RingtoneManager.getRingtone(context,RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));
    ringtone.play();
        Toast.makeText(context, "this is background"+ Calendar.getInstance().getTime().toString(), Toast.LENGTH_LONG).show();
        SystemClock.sleep(2000);
        ringtone.stop();
    }


}
