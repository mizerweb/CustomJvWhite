package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xt7 implements fif {
    public final String a;
    public final fif b;
    public final fif c;

    public xt7(String str, fif fifVar, fif fifVar2) {
        this.a = str;
        this.b = fifVar;
        this.c = fifVar2;
    }

    @Override // defpackage.fif
    public final boolean b() {
        return false;
    }

    @Override // defpackage.fif
    public final int c(String str) {
        Integer numB0 = y5h.B0(str);
        if (numB0 != null) {
            return numB0.intValue();
        }
        ore.p(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.fif
    public final lvb d() {
        return c6h.h;
    }

    @Override // defpackage.fif
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt7)) {
            return false;
        }
        xt7 xt7Var = (xt7) obj;
        return this.a.equals(xt7Var.a) && cqk.d(this.b, xt7Var.b) && cqk.d(this.c, xt7Var.c);
    }

    @Override // defpackage.fif
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.fif
    public final List g(int i) {
        if (i >= 0) {
            return r66.a;
        }
        c.o(zo5.w(zo5.y(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.fif
    public final List getAnnotations() {
        return r66.a;
    }

    @Override // defpackage.fif
    public final fif h(int i) {
        if (i < 0) {
            c.o(zo5.w(zo5.y(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        ore.k("Unreached");
        return null;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.fif
    public final String i() {
        return this.a;
    }

    @Override // defpackage.fif
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.fif
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        c.o(zo5.w(zo5.y(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }

    public xt7(fif fifVar, fif fifVar2) {
        this("kotlin.collections.HashMap", fifVar, fifVar2);
    }
}
