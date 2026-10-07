package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class st1 {
    public static final st1 g;
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final CharSequence e;
    public final boolean f;

    static {
        r66 r66Var = r66.a;
        g = new st1(r66Var, r66Var, r66Var, false, "", false);
    }

    public st1(List list, List list2, List list3, boolean z, CharSequence charSequence, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
        this.e = charSequence;
        this.f = z2;
    }

    public static st1 a(st1 st1Var, List list, c79 c79Var, List list2, boolean z, CharSequence charSequence, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = st1Var.a;
        }
        List list3 = list;
        List list4 = c79Var;
        if ((i & 2) != 0) {
            list4 = st1Var.b;
        }
        List list5 = list4;
        if ((i & 4) != 0) {
            list2 = st1Var.c;
        }
        List list6 = list2;
        if ((i & 8) != 0) {
            z = st1Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            charSequence = st1Var.e;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 32) != 0) {
            z2 = st1Var.f;
        }
        st1Var.getClass();
        return new st1(list3, list5, list6, z3, charSequence2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st1)) {
            return false;
        }
        st1 st1Var = (st1) obj;
        return this.a.equals(st1Var.a) && this.b.equals(st1Var.b) && this.c.equals(st1Var.c) && this.d == st1Var.d && this.e.equals(st1Var.e) && this.f == st1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + mw7.f(nbh.n(qv1.c(qv1.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "CallOpponentsState(opponents=" + this.a + ", buttons=" + this.b + ", contextMenuButtons=" + this.c + ", isMoreButtonEnabled=" + this.d + ", title=" + ((Object) this.e) + ", canOpenSettings=" + this.f + ")";
    }
}
