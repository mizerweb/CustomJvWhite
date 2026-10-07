package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b20 implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ d20 e;

    public b20(d20 d20Var, List list, List list2, int i, Runnable runnable) {
        this.e = d20Var;
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.c.execute(new p0(this, 1, tre.J(new a20(this))));
    }
}
