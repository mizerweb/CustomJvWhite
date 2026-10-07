package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes4.dex */
final class utk extends BroadcastReceiver {
    private final long a;
    private final qjh b;
    final /* synthetic */ gie c;

    public /* synthetic */ utk(gie gieVar, long j, qjh qjhVar, hqk hqkVar) {
        this.c = gieVar;
        this.a = j;
        this.b = qjhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.a) {
            return;
        }
        gie gieVar = this.c;
        Integer numE = gieVar.e();
        synchronized (gieVar) {
            try {
                this.c.c.b().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                bo7 bo7Var = gie.m;
                if (Log.isLoggable(bo7Var.a, 5)) {
                    Log.w("ModelDownloadManager", bo7Var.f("Exception thrown while trying to unregister the broadcast receiver for the download"), e);
                }
            }
            this.c.a.remove(this.a);
            this.c.b.remove(this.a);
        }
        if (numE != null) {
            if (numE.intValue() == 16) {
                gie gieVar2 = this.c;
                s5m s5mVar = gieVar2.g;
                wze wzeVarL = wze.l();
                fie fieVar = gieVar2.e;
                Long lValueOf = Long.valueOf(longExtra);
                s5mVar.b(wzeVarL, fieVar, gieVar2.f(lValueOf));
                this.b.a(this.c.x(lValueOf));
                return;
            }
            if (numE.intValue() == 8) {
                gie gieVar3 = this.c;
                s5m s5mVar2 = gieVar3.g;
                wze wzeVarL2 = wze.l();
                fie fieVar2 = gieVar3.e;
                z4m z4mVarA = c5m.a();
                z4mVarA.a = ytl.NO_ERROR;
                z4mVarA.c = true;
                z4mVarA.g = (byte) (z4mVarA.g | 2);
                u0b u0bVarE = this.c.e.e();
                if (u0bVarE == null) {
                    ore.n("Null modelType");
                    return;
                }
                z4mVarA.d = u0bVarE;
                z4mVarA.e = tul.SUCCEEDED;
                c5m c5mVarA = z4mVarA.a();
                s5mVar2.getClass();
                zj9.g().execute(new wn2(s5mVar2, wzeVarL2, c5mVarA, fieVar2, 6, false));
                this.b.b(null);
                return;
            }
        }
        gie gieVar4 = this.c;
        gieVar4.g.b(wze.l(), gieVar4.e, 0);
        this.b.a(new MlKitException("Model downloading failed", 13));
    }
}
