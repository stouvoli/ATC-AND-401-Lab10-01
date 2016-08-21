package com.numeris_ci.notifications;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Button btnMaxPriorityNotification;
    private Button btnHighPriorityNotification;
    private Button btnLowPriorityNotification;
    private Button btnMinPriorityNotification;
    private Button btnDefaultNotification;
    private Button btnOldTypeNotification;
    private Button btnBigTextNotification;
    private Button btnBigImageNotification;
    private Button btnInboxTypeNotification;


    private int NOTIF_REF = 1;
    private NotificationManager manager;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btnMaxPriorityNotification = (Button) findViewById(R.id.btnMaxPriorityNotification);
        btnHighPriorityNotification = (Button) findViewById(R.id.btnHighPriorityNotification);
        btnLowPriorityNotification = (Button) findViewById(R.id.btnLowPriorityNotification);
        btnMinPriorityNotification = (Button) findViewById(R.id.btnMinPriorityNotification);
        btnDefaultNotification = (Button) findViewById(R.id.btnDefaultNotification);
        //btnOldTypeNotification = (Button) findViewById(R.id.btnOldTypeNotification);
        btnBigTextNotification = (Button) findViewById(R.id.btnBigTextNotification);
        btnBigImageNotification = (Button) findViewById(R.id.btnBigImageNotification);
        btnInboxTypeNotification = (Button) findViewById(R.id.btnInboxTypeNotification);

        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        btnMaxPriorityNotification.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Notification notif = null;
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0,
                        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder builder = new Notification.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(System.currentTimeMillis())
                        .setContentText("Android Notifications")
                        .setContentIntent(resultPendingIntent)
                        .setContentTitle("Maximum priority notification")
                        .setPriority(Notification.PRIORITY_MAX);
                sendNotification(builder.build());
            }
        });

        btnHighPriorityNotification.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Notification notif = null;
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0,
                        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder builder = new Notification.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(System.currentTimeMillis())
                        .setContentText("Android Notifications")
                        .setContentIntent(resultPendingIntent)
                        .setContentTitle("High priority notification")
                        .setPriority(Notification.PRIORITY_HIGH);
                sendNotification(builder.build());
            }
        });

        btnLowPriorityNotification.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Notification notif = null;
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0,
                        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder builder = new Notification.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(System.currentTimeMillis())
                        .setContentText("Android Notifications")
                        .setContentIntent(resultPendingIntent)
                        .setContentTitle("Low priority notification")
                        .setPriority(Notification.PRIORITY_LOW);
                sendNotification(builder.build());
            }
        });

        btnMinPriorityNotification.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Notification notif = null;
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0,
                        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder builder = new Notification.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(System.currentTimeMillis())
                        .setContentText("Android Notifications")
                        .setContentIntent(resultPendingIntent)
                        .setContentTitle("Min priority notification")
                        .setPriority(Notification.PRIORITY_MIN);
                sendNotification(builder.build());
            }
        });

        btnDefaultNotification.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Notification notif = null;
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0,
                        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder builder = new Notification.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(System.currentTimeMillis())
                        .setContentText("Android Notifications")
                        .setContentIntent(resultPendingIntent);
                notif = getDefaultNotification(builder);
                sendNotification(notif);
            }
        });

//        btnOldTypeNotification.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Notification notif = null;
//                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
//                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0,
//                        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//                Notification.Builder builder = new Notification.Builder(MainActivity.this)
//                        .setSmallIcon(R.mipmap.ic_launcher)
//                        .setWhen(System.currentTimeMillis())
//                        .setContentText("Android Notifications")
//                        .setContentIntent(resultPendingIntent);
//                notif = getOldNotification(builder);
//                sendNotification(notif);
//            }
//        });

        btnBigTextNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification notif = null;
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0,
                        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder builder = new Notification.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(System.currentTimeMillis())
                        .setContentText("Android Notifications")
                        .setContentIntent(resultPendingIntent);
                notif = getBigTextStyle(builder);
                sendNotification(notif);
            }
        });

        btnBigImageNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification notif = null;
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0,
                        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder builder = new Notification.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(System.currentTimeMillis())
                        .setContentText("Android Notifications")
                        .setContentIntent(resultPendingIntent);
                notif = getBigPicturesStyle(builder);
                sendNotification(notif);
            }
        });

        btnInboxTypeNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification notif = null;
                Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                PendingIntent resultPendingIntent = PendingIntent.getActivity(MainActivity.this, 0,
                        resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder builder = new Notification.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(System.currentTimeMillis())
                        .setContentText("Android Notifications")
                        .setContentIntent(resultPendingIntent);
                inboxStyleNotifications();
            }
        });
    }

    private void inboxStyleNotifications() {
        int ID =1;
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this).setSmallIcon(R.mipmap.ic_launcher);
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        inboxStyle.setSummaryText(getResources().getString(R.string.summary_text));
        mBuilder.setStyle(inboxStyle);
        mBuilder.setNumber(1);

        NotificationManager mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        mNotificationManager.notify(ID, mBuilder.build());
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private Notification getBigPicturesStyle(Notification.Builder builder) {
        Bitmap icon = BitmapFactory.decodeResource(this.getResources(), R.drawable.big_image);
        builder.setContentTitle("Reduced BigPicture title")
                .setContentText("Reduced content")
                .setContentInfo("Info")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(icon);
        return new Notification.BigPictureStyle(builder)
                .bigPicture(icon)
                .bigLargeIcon(icon)
                .setBigContentTitle("Expanded BigPicture title")
                .setSummaryText(getResources().getString(R.string.summary_text))
                .build();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private Notification getBigTextStyle(Notification.Builder builder) {
        Bitmap icon = BitmapFactory.decodeResource(this.getResources(), R.drawable.big_image);
        builder.setContentTitle("Reduced Bigtext title")
                .setContentText("Reduced content")
                .setContentInfo("Info")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(icon);
        return new Notification.BigTextStyle(builder)
                .bigText("")
                .setBigContentTitle("Andrid ATC")
                .setSummaryText(getResources().getString(R.string.summary_text))
                .build();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private Notification getDefaultNotification(Notification.Builder builder) {
        builder
            .setSmallIcon(R.mipmap.ic_launcher)
            .setWhen(System.currentTimeMillis())
            .setContentTitle("Default notification")
            .setContentText("This is random text for default type notifications.")
            .setContentInfo("Info");
        return builder.build();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void sendNotification(Notification notif) {
        manager.notify(NOTIF_REF++, notif);
    }
}
