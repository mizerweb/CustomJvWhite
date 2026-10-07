package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class kf4 implements gqb {
    public static final kf4 b = new kf4(null);
    public final g88 a;

    public kf4(Object obj) {
        this.a = o9b.f(obj);
    }

    @Override // defpackage.gqb
    public final e89 f() {
        return this.a;
    }

    @Override // defpackage.gqb
    public final void j(eqb eqbVar) {
    }

    @Override // defpackage.gqb
    public final void n(Executor executor, eqb eqbVar) {
        this.a.b(new f92(this, 16, eqbVar), executor);
    }
}
