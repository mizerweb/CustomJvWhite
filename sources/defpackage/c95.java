package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c95 {
    public final ny8 a;
    public final ny8 b;
    public final ifh c = new ifh(new pe3(26, this));

    public c95(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final boolean a() {
        boolean z;
        int currentInterruptionFilter = f().b.getCurrentInterruptionFilter();
        boolean z2 = (currentInterruptionFilter == 0 || currentInterruptionFilter == 1 || (currentInterruptionFilter != 2 && currentInterruptionFilter != 3 && currentInterruptionFilter != 4)) ? false : true;
        boolean zAreNotificationsEnabled = f().b.areNotificationsEnabled();
        try {
            StatusBarNotification[] activeNotifications = f().b.getActiveNotifications();
            if (activeNotifications == null) {
                new ArrayList();
            } else {
                Arrays.asList(activeNotifications);
            }
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbB = zo5.B("Notification disabled: isDoNotDisturbModeEnabled=", z2, " areNotificationsEnabledCompat=", zAreNotificationsEnabled, " hasAccessToNotifications=");
                sbB.append(z);
                a4cVar.c(je9Var, "CallsNotificationRoot", sbB.toString(), null);
            }
        }
        if (!zAreNotificationsEnabled || !z) {
            return false;
        }
        umb umbVarF = f();
        ((d95) this.b.getValue()).getClass();
        NotificationChannel notificationChannelB = cdl.b(umbVarF.b, "ru.oneme.app.new.incomingCalls.");
        ww6 ww6Var = notificationChannelB != null ? new ww6(notificationChannelB) : null;
        Integer numValueOf = ww6Var != null ? Integer.valueOf(ww6Var.b) : null;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            return true;
        }
        gm0.n("CallsNotificationRoot", "Notification disabled due to incomingImportance none");
        return false;
    }

    public final void b() {
        gm0.n("CallsNotificationRoot", "cancel all call notifications");
        d(239);
        d(240);
        d(241);
    }

    public final void c(int i) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallsNotificationRoot", zo5.h(i, "cancel all call notifications, except id="), null);
            }
        }
        if (i == 239) {
            d(240);
        } else {
            if (i != 240) {
                return;
            }
            d(239);
        }
    }

    public final void d(int i) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallsNotificationRoot", zo5.h(i, "cancel call notification with id="), null);
            }
        }
        f().b.cancel(null, i);
    }

    public final Notification e() {
        umb umbVarF = f();
        ny8 ny8Var = this.b;
        ((d95) ny8Var.getValue()).getClass();
        NotificationChannel notificationChannelB = cdl.b(umbVarF.b, "ru.oneme.app.new.activeCalls");
        ww6 ww6Var = notificationChannelB != null ? new ww6(notificationChannelB) : null;
        ny8 ny8Var2 = this.a;
        if (ww6Var == null) {
            ((d95) ny8Var.getValue()).getClass();
            Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
            AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
            Context context = (Context) ny8Var2.getValue();
            ((d95) ny8Var.getValue()).getClass();
            String string = context.getString(R.string.tt_notif_category_active_calls);
            umb umbVarF2 = f();
            umbVarF2.getClass();
            NotificationChannel notificationChannel = new NotificationChannel("ru.oneme.app.new.activeCalls", string, 2);
            notificationChannel.setDescription(null);
            notificationChannel.setGroup(null);
            notificationChannel.setShowBadge(true);
            notificationChannel.setSound(null, null);
            notificationChannel.enableLights(false);
            notificationChannel.setLightColor(0);
            notificationChannel.setVibrationPattern(null);
            notificationChannel.enableVibration(false);
            umbVarF2.b.createNotificationChannel(notificationChannel);
        }
        Context context2 = (Context) ny8Var2.getValue();
        ((d95) ny8Var.getValue()).getClass();
        qlb qlbVar = new qlb(context2, "ru.oneme.app.new.activeCalls");
        qlbVar.k = -1;
        qlbVar.G.icon = R.drawable.icon_call_mini;
        qlbVar.e = qlb.c(((Context) ny8Var2.getValue()).getString(R.string.call_notification_name_temp));
        if (Build.VERSION.SDK_INT >= 31) {
            qlbVar.E = 1;
        }
        return qlbVar.a();
    }

    public final umb f() {
        return (umb) this.c.getValue();
    }

    public final void g(int i, Notification notification) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallsNotificationRoot", c0a.k(i, "showNotification id=", " notification"), null);
            }
        }
        f().a(null, i, notification);
    }
}
