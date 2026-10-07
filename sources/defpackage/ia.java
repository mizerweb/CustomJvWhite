package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class ia implements be2 {
    public final be2 b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ia(be2 be2Var, vuf vufVar) {
        this(be2Var, (byte) 0);
        this.c = 1;
        this.d = vufVar;
    }

    @Override // defpackage.be2
    public final void a(hmf hmfVar) {
        this.b.a(hmfVar);
    }

    @Override // defpackage.be2
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.be2
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.be2
    public e89 d(float f) {
        switch (this.c) {
            case 0:
                return ((be2) this.d).d(f);
            default:
                return this.b.d(f);
        }
    }

    @Override // defpackage.be2
    public final void e(t94 t94Var) {
        this.b.e(t94Var);
    }

    @Override // defpackage.be2
    public e89 f(float f) {
        switch (this.c) {
            case 0:
                return ((be2) this.d).f(f);
            default:
                return this.b.f(f);
        }
    }

    @Override // defpackage.be2
    public final void g(int i) {
        this.b.g(i);
    }

    @Override // defpackage.be2
    public final void h(x58 x58Var) {
        this.b.h(x58Var);
    }

    @Override // defpackage.be2
    public e89 i(q36 q36Var) {
        switch (this.c) {
            case 0:
                return ((be2) this.d).i(q36Var);
            default:
                return this.b.i(q36Var);
        }
    }

    @Override // defpackage.be2
    public e89 j(boolean z) {
        switch (this.c) {
            case 0:
                return ((be2) this.d).j(z);
            default:
                return this.b.j(z);
        }
    }

    @Override // defpackage.be2
    public final t94 k() {
        return this.b.k();
    }

    @Override // defpackage.be2
    public final void l() {
        this.b.l();
    }

    @Override // defpackage.be2
    public e89 m(ArrayList arrayList, int i, int i2) {
        int i3 = this.c;
        be2 be2Var = this.b;
        switch (i3) {
            case 1:
                qyj.h("Only support one capture config.", arrayList.size() == 1);
                e89 e89VarO = be2Var.o(i);
                return new j79(new ArrayList(Collections.singletonList(o9b.j(o9b.j(o9b.j(lg7.c(e89VarO), new mg7(e89VarO, 1), zjl.a()), new c5f(this, 13, arrayList), zjl.a()), new mg7(e89VarO, 2), zjl.a()))), true, zjl.a());
            default:
                return be2Var.m(arrayList, i, i2);
        }
    }

    @Override // defpackage.be2
    public final void n() {
        this.b.n();
    }

    @Override // defpackage.be2
    public final e89 o(int i) {
        return this.b.o(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ia(be2 be2Var) {
        this(be2Var, (byte) 0);
        this.c = 0;
        this.d = be2Var;
    }

    public ia(be2 be2Var, byte b) {
        this.b = be2Var;
    }
}
