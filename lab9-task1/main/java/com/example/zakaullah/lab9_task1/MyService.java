package com.example.zakaullah.lab9_task1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class MyService extends Service {
    Notification notification;
    String channelId = "1";

    @Override
    public IBinder onBind(Intent intent){
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Toast.makeText(this, "Service Started!", Toast.LENGTH_LONG).show();
        buildNotification("Ongoing...","Service Running...");
        startForeground(1, notification);
        return START_STICKY;
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        buildNotification2("Destroyed!", "Service Stopped!");
        Toast.makeText(this, "Service Destroyed!", Toast.LENGTH_LONG).show();
    }
    public void buildNotification(String title, String text){

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            CharSequence channelName = "Playback Channel";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel = new NotificationChannel(channelId, channelName, importance);
            notificationManager.createNotificationChannel(notificationChannel);

        }
        notification = new NotificationCompat.Builder(getBaseContext(), channelId)
                .setContentTitle(title)
                .setContentText(text)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentIntent(pendingIntent)
                .setStyle(new NotificationCompat.BigTextStyle())
                .build();

    }
    public void buildNotification2(String title, String text){

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){


            CharSequence channelName = "Playback Channel";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel = new NotificationChannel(channelId, channelName, importance);
            notificationManager.createNotificationChannel(notificationChannel);

        }
        NotificationCompat.Builder notification = new NotificationCompat.Builder(getBaseContext(), channelId)
                .setContentTitle(title)
                .setContentText(text)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentIntent(pendingIntent)
                .setStyle(new NotificationCompat.BigTextStyle());

        notificationManager.notify(1, notification.build());

    }

}
