package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class m84 extends y2f {
    public final f79 a;
    public final w74 b;
    public final f79 c;
    public final o84 d;
    public volatile boolean e;

    public m84(o84 o84Var) {
        this.d = o84Var;
        f79 f79Var = new f79();
        this.a = f79Var;
        w74 w74Var = new w74();
        this.b = w74Var;
        f79 f79Var2 = new f79();
        this.c = f79Var2;
        f79Var2.a(f79Var);
        f79Var2.a(w74Var);
    }

    @Override // defpackage.y2f
    public final ko5 a(Runnable runnable) {
        return this.e ? l66.a : this.d.d(runnable, 0L, TimeUnit.MILLISECONDS, this.a);
    }

    @Override // defpackage.y2f
    public final ko5 b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.e ? l66.a : this.d.d(runnable, j, timeUnit, this.b);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.c.dispose();
    }
}
