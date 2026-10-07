package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class yig {
    public final CidLogger a;
    public final e91 b;
    public final e91 c;
    public final o3j d;
    public final esh e;
    public final boolean f;
    public final Handler g;
    public final LinkedHashSet h;
    public final HashMap i;
    public vx8 j;
    public boolean k;
    public final xig l;

    public yig(CidLogger cidLogger, e91 e91Var, e91 e91Var2, o3j o3jVar, esh eshVar, boolean z) {
        eshVar.getClass();
        this.a = cidLogger;
        this.b = e91Var;
        this.c = e91Var2;
        this.d = o3jVar;
        this.e = eshVar;
        this.f = z;
        this.g = new Handler(Looper.getMainLooper());
        this.h = new LinkedHashSet();
        this.i = new HashMap();
        this.l = new xig(this);
    }

    public final void a(bkg bkgVar, long j, TimeUnit timeUnit) {
        bkgVar.getClass();
        timeUnit.getClass();
        this.i.put(bkgVar, new gkk(j, timeUnit));
    }

    public final void b(aak aakVar) {
        aakVar.getClass();
        Handler handler = this.g;
        if (!cqk.d(handler.getLooper().getThread(), Thread.currentThread())) {
            handler.post(new uig(this, aakVar, 0));
        } else {
            if (this.k) {
                return;
            }
            this.h.add(aakVar);
        }
    }
}
