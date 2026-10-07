package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.a;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.cdc;
import defpackage.n1g;
import defpackage.oyj;

/* JADX INFO: loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = n1g.Z("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        n1g n1gVarX = n1g.x();
        String str = a;
        n1gVarX.p(str, "Requesting diagnostics");
        try {
            oyj.d(context).b((cdc) new a(DiagnosticsWorker.class).build());
        } catch (IllegalStateException e) {
            n1g.x().t(str, "WorkManager is not initialized", e);
        }
    }
}
