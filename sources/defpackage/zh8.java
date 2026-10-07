package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class zh8 extends BroadcastReceiver {
    public final /* synthetic */ bi8 a;
    public final /* synthetic */ pw b;

    public zh8(bi8 bi8Var, pw pwVar) {
        this.a = bi8Var;
        this.b = pwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str = this.a.m;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qv1.k("Received locale change action: ", intent.getAction()), null);
            }
        }
        String action = intent.getAction();
        if (action != null) {
            this.b.add(action);
        }
        if (this.b.c == 2) {
            gm0.n(this.a.m, "Received all locale change actions");
            this.b.clear();
            a8j.x(this.a.i, ph8.b);
        }
    }
}
