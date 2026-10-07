package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class l4f extends BroadcastReceiver {
    public final HashSet a = new HashSet();

    public l4f(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            for (gue gueVar : this.a) {
                gueVar.getClass();
                gm0.n("gue", "onScreenOff");
                if (gueVar.g) {
                    gueVar.g = false;
                    if (gueVar.f) {
                        gueVar.a();
                    }
                }
            }
            return;
        }
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            for (gue gueVar2 : this.a) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    gueVar2.getClass();
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "gue", zo5.q("onScreenOn, isAppVisible=", ", isScreenOn=", gueVar2.f, gueVar2.g), null);
                    }
                }
                if (!gueVar2.g) {
                    gueVar2.g = true;
                    if (gueVar2.f) {
                        gueVar2.b();
                    }
                }
            }
        }
    }
}
