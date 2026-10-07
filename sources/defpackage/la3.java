package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class la3 implements oa3 {
    public final boolean a;
    public final int b;
    public final List c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public la3(boolean z, int i, List list, List list2, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = i;
        this.c = list;
        this.d = list2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public static la3 a(la3 la3Var, boolean z, int i, List list, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = la3Var.a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            i = la3Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = la3Var.c;
        }
        List list2 = list;
        List list3 = la3Var.d;
        if ((i2 & 16) != 0) {
            z2 = la3Var.e;
        }
        boolean z5 = z2;
        if ((i2 & 32) != 0) {
            z3 = la3Var.f;
        }
        return new la3(z4, i3, list2, list3, z5, z3, la3Var.g, la3Var.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la3)) {
            return false;
        }
        la3 la3Var = (la3) obj;
        return this.a == la3Var.a && this.b == la3Var.b && cqk.d(this.c, la3Var.c) && this.d.equals(la3Var.d) && this.e == la3Var.e && this.f == la3Var.f && this.g == la3Var.g && this.h == la3Var.h;
    }

    public final int hashCode() {
        int iC = zo5.c(this.b, Boolean.hashCode(this.a) * 31, 31);
        List list = this.c;
        return Boolean.hashCode(this.h) + nbh.n(nbh.n(nbh.n(qv1.c((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(areReactionsEnabled=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", addedReactions=");
        sb.append(this.c);
        sb.append(", reactions=");
        sb.append(this.d);
        sb.append(", showDefaultButton=");
        qt4.B(", hasUnsavedChanges=", ", showReactionsLoading=", sb, this.e, this.f);
        return bc1.m(", showReactions=", ")", sb, this.g, this.h);
    }
}
