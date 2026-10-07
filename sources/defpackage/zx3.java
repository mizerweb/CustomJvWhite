package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zx3 implements cle {
    public final LinkedHashMap a = new LinkedHashMap();
    public volatile Map b = s66.a;

    @Override // defpackage.cle
    public final void A(jme jmeVar, long j, xg xgVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new xx3((cle) entry.getKey(), jmeVar, j, xgVar, 1));
        }
    }

    @Override // defpackage.cle
    public final void E(jme jmeVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new wx3((cle) entry.getKey(), jmeVar, 1));
        }
    }

    @Override // defpackage.cle
    public final void I(jme jmeVar, long j) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new xc2((cle) entry.getKey(), jmeVar, j, 1));
        }
    }

    @Override // defpackage.cle
    public final void K(jme jmeVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new wx3((cle) entry.getKey(), jmeVar, 0));
        }
    }

    @Override // defpackage.cle
    public final void P(jme jmeVar, long j, long j2) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new mb0((cle) entry.getKey(), jmeVar, j, j2, 1));
        }
    }

    @Override // defpackage.cle
    public final void W(jme jmeVar, long j, wg wgVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new vx3((cle) entry.getKey(), jmeVar, j, wgVar, 1));
        }
    }

    @Override // defpackage.cle
    public final void Y(jme jmeVar, long j, eme emeVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new xx3((cle) entry.getKey(), jmeVar, j, emeVar, 0));
        }
    }

    public final void a(cle cleVar, gc0 gc0Var) {
        if (this.b.containsKey(cleVar)) {
            throw new IllegalStateException((cleVar + " was already registered!").toString());
        }
        synchronized (this.a) {
            this.a.put(cleVar, gc0Var);
            this.b = wm9.X0(this.a);
        }
    }

    @Override // defpackage.cle
    public final void b(final jme jmeVar, final long j, final int i, final int i2) {
        for (Map.Entry entry : this.b.entrySet()) {
            final cle cleVar = (cle) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: yx3
                @Override // java.lang.Runnable
                public final void run() {
                    cleVar.b(jmeVar, j, i, i2);
                }
            });
        }
    }

    public final void c(cle cleVar) {
        synchronized (this.a) {
            this.a.remove(cleVar);
            this.b = wm9.X0(this.a);
        }
    }

    @Override // defpackage.cle
    public final void k0(jme jmeVar, long j, wg wgVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new vx3((cle) entry.getKey(), jmeVar, j, wgVar, 0));
        }
    }

    @Override // defpackage.cle
    public final void o0(fle fleVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new f92((cle) entry.getKey(), 15, fleVar));
        }
    }

    @Override // defpackage.cle
    public final void y(jme jmeVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new wx3((cle) entry.getKey(), jmeVar, 2));
        }
    }
}
