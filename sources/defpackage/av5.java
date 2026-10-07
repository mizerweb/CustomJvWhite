package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class av5 {
    public final int a;
    public final x4a b;
    public final CopyOnWriteArrayList c;

    public av5(CopyOnWriteArrayList copyOnWriteArrayList, int i, x4a x4aVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = x4aVar;
    }

    public final void a(iw8 iw8Var) {
        for (zu5 zu5Var : this.c) {
            vqi.d0(zu5Var.a, new i0(this, zu5Var.b, iw8Var, 22));
        }
    }

    public final void b() {
        for (zu5 zu5Var : this.c) {
            vqi.d0(zu5Var.a, new yu5(this, zu5Var.b, 1));
        }
    }

    public final void c(int i) {
        for (zu5 zu5Var : this.c) {
            vqi.d0(zu5Var.a, new uc2(this, zu5Var.b, i, 5));
        }
    }

    public final void d(Exception exc) {
        for (zu5 zu5Var : this.c) {
            vqi.d0(zu5Var.a, new i0(this, zu5Var.b, exc, 21));
        }
    }

    public final void e() {
        for (zu5 zu5Var : this.c) {
            vqi.d0(zu5Var.a, new yu5(this, zu5Var.b, 0));
        }
    }
}
