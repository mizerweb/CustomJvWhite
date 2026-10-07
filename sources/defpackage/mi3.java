package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mi3 extends ni3 {
    public final String d;
    public final Set e;
    public final Set f;
    public final Set g;
    public final Set h;
    public final Map i;
    public final zc6 j;
    public final cf7 k;
    public final Comparator l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi3(String str, Set set, Set set2, Set set3, Set set4, Map map, zc6 zc6Var) {
        super(str);
        vv2 vv2Var = qw2.I;
        this.d = str;
        this.e = set;
        this.f = set2;
        this.g = set3;
        this.h = set4;
        this.i = map;
        this.j = zc6Var;
        this.k = ni3.c;
        this.l = vv2Var;
    }

    @Override // defpackage.ni3
    public final Comparator a() {
        return this.l;
    }

    @Override // defpackage.ni3
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi3)) {
            return false;
        }
        mi3 mi3Var = (mi3) obj;
        return cqk.d(this.d, mi3Var.d) && cqk.d(this.e, mi3Var.e) && cqk.d(this.f, mi3Var.f) && cqk.d(this.g, mi3Var.g) && cqk.d(this.h, mi3Var.h) && cqk.d(this.i, mi3Var.i) && cqk.d(this.j, mi3Var.j) && cqk.d(this.k, mi3Var.k) && cqk.d(this.l, mi3Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + v0h.c(this.i, nbh.o(this.h, nbh.o(this.g, nbh.o(this.f, nbh.o(this.e, this.d.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Filter(folderId=" + this.d + ", includedChats=" + this.e + ", includedFilters=" + this.f + ", excludedChats=" + this.g + ", excludedFilters=" + this.h + ", subjects=" + this.i + ", favoritesComparator=" + this.j + ", filterPredicate=" + this.k + ", comparator=" + this.l + ")";
    }
}
