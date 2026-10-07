package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class op4 implements fif {
    public final hif a;
    public final rv8 b;
    public final String c;

    public op4(hif hifVar, rv8 rv8Var) {
        this.a = hifVar;
        this.b = rv8Var;
        this.c = hifVar.a + '<' + ((sr3) rv8Var).h() + '>';
    }

    @Override // defpackage.fif
    public final boolean b() {
        return false;
    }

    @Override // defpackage.fif
    public final int c(String str) {
        return this.a.c(str);
    }

    @Override // defpackage.fif
    public final lvb d() {
        return this.a.b;
    }

    @Override // defpackage.fif
    public final int e() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        op4 op4Var = obj instanceof op4 ? (op4) obj : null;
        return op4Var != null && this.a.equals(op4Var.a) && cqk.d(op4Var.b, this.b);
    }

    @Override // defpackage.fif
    public final String f(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.fif
    public final List g(int i) {
        return this.a.h[i];
    }

    @Override // defpackage.fif
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.fif
    public final fif h(int i) {
        return this.a.g[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (((sr3) this.b).hashCode() * 31);
    }

    @Override // defpackage.fif
    public final String i() {
        return this.c;
    }

    @Override // defpackage.fif
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.fif
    public final boolean j(int i) {
        return this.a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
