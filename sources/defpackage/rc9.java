package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class rc9 extends BroadcastReceiver {
    public final /* synthetic */ sc9 a;
    public final /* synthetic */ pw b;

    public rc9(sc9 sc9Var, pw pwVar) {
        this.a = sc9Var;
        this.b = pwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str = this.a.l;
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
            gm0.n(this.a.l, "Received all locale change actions");
            this.b.clear();
            a8j.x(this.a.m, qc9.b);
        }
    }
}
