package defpackage;

import android.app.AppOpsManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.RemoteInput;
import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class io {
    public static void a(NotificationChannel notificationChannel) {
        notificationChannel.canBubble();
    }

    public static int b(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static AudioRecordingConfiguration c(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static String d(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager e(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static boolean f(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static void g(Resources.Theme theme) {
        theme.rebase();
    }

    public static void h(AudioRecord audioRecord, eif eifVar, zb0 zb0Var) {
        audioRecord.registerAudioRecordingCallback(eifVar, zb0Var);
    }

    public static void i(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }

    public static void j(Service service, int i, Notification notification, int i2) {
        if (i2 == 0 || i2 == -1) {
            service.startForeground(i, notification, i2);
        } else {
            service.startForeground(i, notification, i2 & 255);
        }
    }

    public static void k(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void l(Service service, int i, Notification notification, int i2) {
        if (i2 == 0 || i2 == -1) {
            service.startForeground(i, notification, i2);
        } else {
            service.startForeground(i, notification, i2 & 1073745919);
        }
    }

    public static void m(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            n1g.x().k0(SystemForegroundService.e, "Unable to start foreground service", e);
        } catch (SecurityException e2) {
            n1g.x().k0(SystemForegroundService.e, "Unable to start foreground service", e2);
        }
    }

    public static void n(AudioRecord audioRecord, zb0 zb0Var) {
        audioRecord.unregisterAudioRecordingCallback(zb0Var);
    }
}
