package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l79 implements fif {
    public final fif a;

    public l79(fif fifVar) {
        this.a = fifVar;
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
        ore.p(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.fif
    public final lvb d() {
        return c6h.g;
    }

    @Override // defpackage.fif
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l79)) {
            return false;
        }
        l79 l79Var = (l79) obj;
        return cqk.d(this.a, l79Var.a) && cqk.d(i(), l79Var.i());
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
        StringBuilder sbY = zo5.y(i, "Illegal index ", ", ");
        sbY.append(i());
        sbY.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbY.toString().toString());
    }

    @Override // defpackage.fif
    public final List getAnnotations() {
        return r66.a;
    }

    @Override // defpackage.fif
    public final fif h(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder sbY = zo5.y(i, "Illegal index ", ", ");
        sbY.append(i());
        sbY.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbY.toString().toString());
    }

    public final int hashCode() {
        return i().hashCode() + (this.a.hashCode() * 31);
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
        StringBuilder sbY = zo5.y(i, "Illegal index ", ", ");
        sbY.append(i());
        sbY.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbY.toString().toString());
    }

    public final String toString() {
        return i() + '(' + this.a + ')';
    }
}
