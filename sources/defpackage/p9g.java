package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class p9g implements xye {
    public int a;
    public boolean b;
    public final /* synthetic */ r9g c;

    public p9g(r9g r9gVar) {
        this.c = r9gVar;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        r9g r9gVar = this.c;
        r9gVar.e.E(uya.h(r9gVar.j.n), r9gVar.j, 0, null, 0L);
        this.b = true;
    }

    @Override // defpackage.xye
    public final void b() throws IOException {
        r9g r9gVar = this.c;
        if (r9gVar.k) {
            return;
        }
        r9gVar.i.b();
    }

    @Override // defpackage.xye
    public final int f(v2a v2aVar, u55 u55Var, int i) {
        a();
        r9g r9gVar = this.c;
        boolean z = r9gVar.l;
        if (z && r9gVar.m == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            u55Var.a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            v2aVar.c = r9gVar.j;
            this.a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        r9gVar.m.getClass();
        u55Var.a(1);
        u55Var.f = 0L;
        if ((i & 4) == 0) {
            u55Var.s(r9gVar.n);
            u55Var.d.put(r9gVar.m, 0, r9gVar.n);
        }
        if ((i & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }

    @Override // defpackage.xye
    public final boolean m() {
        return this.c.l;
    }

    @Override // defpackage.xye
    public final int o(long j) {
        a();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }
}
