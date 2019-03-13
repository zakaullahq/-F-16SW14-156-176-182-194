package com.example.fidah.lab6;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.telephony.SmsMessage;
import android.widget.Toast;

import static android.content.Context.NOTIFICATION_SERVICE;

//public class IncomingSmsBroadcastReceiver extends BroadcastReceiver {
//    @Override
//    public void onReceive(Context context, Intent intent) {
//
//    }
//}





class IncomingSmsBroadcastReceiver extends BroadcastReceiver {
    /*private Bundle bundle;
    private SmsMessage currentSMS;
    private String message;

    private String TAG = IncomingSmsBroadcastReceiver.class.getSimpleName();
*/
    public IncomingSmsBroadcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //Get the data (SMS data) bound to intent
            // NotificationCompat.Builder builder = new NotificationCompat.Builder(context);

            // builder.setContentTitle("SMS Broadcast");
            // builder.setContentText("You have Received New SMS");
            // int notificationId = 001;
            // NotificationManager manager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
            // manager.notify(notificationId, builder.build());
    	Toast.makeText(context,"SMS Has been received!",Toast.LENGTH_SHORT).show();


    }
}