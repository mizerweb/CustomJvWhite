package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.n1g;
import defpackage.oyj;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = n1g.Z("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n1g.x().p(a, "Received intent " + intent);
        try {
            oyj oyjVarD = oyj.d(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            oyjVarD.getClass();
            synchronized (oyj.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = oyjVarD.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    oyjVarD.i = pendingResultGoAsync;
                    if (oyjVarD.h) {
                        pendingResultGoAsync.finish();
                        oyjVarD.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            n1g.x().t(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
