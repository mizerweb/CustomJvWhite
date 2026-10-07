package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class j96 extends pee {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final o90 b;
    public final /* synthetic */ k96 c;

    public j96(k96 k96Var) {
        this.c = k96Var;
        this.b = new o90(this, 7, k96Var);
    }

    @Override // defpackage.pee
    public final void a() {
        h();
    }

    @Override // defpackage.pee
    public final void b(int i, int i2) {
        je9 je9Var = je9.d;
        String name = j96.class.getName();
        k96 k96Var = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, zo5.s("onItemRangeInserted start. isComputingLayout:", k96Var.Y()), null);
        }
        h();
        String name2 = j96.class.getName();
        k96 k96Var2 = this.c;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, name2, zo5.s("onItemRangeInserted end. isComputingLayout:", k96Var2.Y()), null);
        }
    }

    @Override // defpackage.pee
    public final void c(int i, int i2, Object obj) {
        h();
    }

    @Override // defpackage.pee
    public final void d(int i, int i2) {
        h();
    }

    @Override // defpackage.pee
    public final void e(int i, int i2) {
        h();
    }

    @Override // defpackage.pee
    public final void f(int i, int i2) {
        h();
    }

    public final void h() {
        n1g.Q(this.c, this.b, null, 5);
    }
}
