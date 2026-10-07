package defpackage;

import android.R;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class fo7 extends go7 {
    public static final Object c = new Object();
    public static final fo7 d = new fo7();

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        flk flkVarA = flk.a(super.b(i, googleApiActivity, "d"), googleApiActivity);
        AlertDialog alertDialogCreate = null;
        if (i != 0) {
            TypedValue typedValue = new TypedValue();
            googleApiActivity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(googleApiActivity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(googleApiActivity);
            }
            builder.setMessage(wkk.c(googleApiActivity, i));
            builder.setOnCancelListener(googleApiActivity2);
            String strB = wkk.b(googleApiActivity, i);
            if (strB != null) {
                builder.setPositiveButton(strB, flkVarA);
            }
            String strF = wkk.f(googleApiActivity, i);
            if (strF != null) {
                builder.setTitle(strF);
            }
            Log.w("GoogleApiAvailability", zo5.h(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
            alertDialogCreate = builder.create();
        }
        if (alertDialogCreate == null) {
            return;
        }
        pa6.a(alertDialogCreate, googleApiActivity2).show(googleApiActivity.getFragmentManager(), "GooglePlayServicesErrorDialog");
    }

    public final void e(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", c0a.k(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new hlk(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = wkk.e(context, i);
        String strD = wkk.d(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        yab.s(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        qlb qlbVar = new qlb(context, null);
        qlbVar.v = true;
        qlbVar.f(16, true);
        qlbVar.e = qlb.c(strE);
        olb olbVar = new olb();
        olbVar.e = qlb.c(strD);
        qlbVar.i(olbVar);
        PackageManager packageManager = context.getPackageManager();
        if (tre.h == null) {
            tre.h = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (tre.h.booleanValue()) {
            qlbVar.G.icon = context.getApplicationInfo().icon;
            qlbVar.k = 2;
            if (tre.k0(context)) {
                qlbVar.b.add(new klb(IconCompat.c(null, "", ru.oneme.app.R.drawable.common_full_open_on_phone), resources.getString(ru.oneme.app.R.string.common_open_on_phone), pendingIntent));
            } else {
                qlbVar.g = pendingIntent;
            }
        } else {
            qlbVar.G.icon = R.drawable.stat_sys_warning;
            String string = resources.getString(ru.oneme.app.R.string.common_google_play_services_notification_ticker);
            qlbVar.G.tickerText = qlb.c(string);
            qlbVar.G.when = System.currentTimeMillis();
            qlbVar.g = pendingIntent;
            qlbVar.d(strD);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string2 = context.getResources().getString(ru.oneme.app.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string2, 4));
        } else if (!string2.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        qlbVar.A = "com.google.android.gms.availability";
        Notification notificationA = qlbVar.a();
        if (i == 1 || i == 2 || i == 3) {
            xo7.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }
}
