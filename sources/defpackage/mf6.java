package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class mf6 implements xje {
    public final gj2 a = new gj2(12);
    public final boolean b;
    public final boolean c;
    public final kr6 d;
    public final int e;
    public final dy f;
    public final LogSessionId g;

    public mf6(boolean z, boolean z2, kr6 kr6Var, int i, dy dyVar, LogSessionId logSessionId) {
        this.b = z;
        this.c = z2;
        this.d = kr6Var;
        this.e = i;
        this.f = dyVar;
        this.g = logSessionId;
    }

    @Override // defpackage.xje
    public final ks0[] a(Handler handler, y3j y3jVar, ob0 ob0Var, inh inhVar, vwa vwaVar) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.b;
        kr6 kr6Var = this.d;
        if (!z) {
            arrayList.add(new ze6(kr6Var, this.a, this.f, this.g));
        }
        if (!this.c) {
            arrayList.add(new bf6(kr6Var, this.e, this.a, this.f, this.g));
        }
        return (ks0[]) arrayList.toArray(new ks0[0]);
    }
}
