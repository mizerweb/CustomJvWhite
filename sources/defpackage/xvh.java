package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class xvh extends BroadcastReceiver {
    public yvh a;
    public final /* synthetic */ yvh b;

    public xvh(yvh yvhVar, yvh yvhVar2) {
        this.b = yvhVar;
        this.a = yvhVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((Context) this.b.c).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            yvh yvhVar = this.a;
            if (yvhVar == null) {
                return;
            }
            if (yvhVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                yvh yvhVar2 = this.a;
                ((wvh) yvhVar2.f).f.schedule(yvhVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
