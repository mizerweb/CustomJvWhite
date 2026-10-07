package defpackage;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class bn9 {
    public final ny8 a;
    public final ny8 b;
    public final long c;
    public final Object d;
    public Object e;
    public Object f;

    public bn9() {
        ed7 ed7Var = new ed7(14);
        ed7Var.b = 0;
        this.d = ed7Var;
        this.a = rx8.P(3, new o0j(2));
        this.b = rx8.P(3, new o0j(3));
        this.c = -1L;
    }

    public dee a() {
        ExecutorService executorService = (ExecutorService) this.e;
        ed7 ed7Var = (ed7) this.d;
        o5a o5aVar = new o5a((n4j) ed7Var.d, (xb0) ed7Var.c, ed7Var.b);
        z76 z76Var = (v1j) this.f;
        ny8 ny8Var = this.a;
        if (z76Var == null) {
            z76Var = (z76) ny8Var.getValue();
        }
        return new dee(executorService, o5aVar, z76Var, (z76) ny8Var.getValue(), (vde) this.b.getValue(), new px8(), this.c);
    }

    public void b() {
        ed7 ed7Var = (ed7) this.d;
        ed7Var.c = new xb0(1, ((xb0) ed7Var.c).b);
    }

    public void c() {
        ed7 ed7Var = (ed7) this.d;
        ed7Var.c = new xb0(((xb0) ed7Var.c).a, "audio/mp4a-latm");
    }

    public void d(m1e m1eVar) {
        ed7 ed7Var = (ed7) this.d;
        n4j n4jVar = (n4j) ed7Var.d;
        n4jVar.getClass();
        n4j n4jVar2 = n4j.e;
        n4j n4jVar3 = n4j.e;
        ed7Var.d = new n4j(m1eVar, n4jVar.b, n4jVar.c, n4jVar.d);
    }

    public void e(int i) {
        ed7 ed7Var = (ed7) this.d;
        n4j n4jVar = (n4j) ed7Var.d;
        n4jVar.getClass();
        n4j n4jVar2 = n4j.e;
        n4j n4jVar3 = n4j.e;
        ed7Var.d = new n4j(n4jVar.a, i, n4jVar.c, n4jVar.d);
    }

    public bn9(ny8 ny8Var, ny8 ny8Var2, eg8 eg8Var, ny8 ny8Var3, long j) {
        this.c = j;
        this.d = bn9.class.getName();
        this.a = ny8Var;
        this.b = ny8Var2;
        this.f = eg8Var;
        this.e = ny8Var3;
    }
}
