package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r17 implements Comparable {
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Set d;
    public final Set e;
    public final List f;
    public final Map g;
    public final List h;
    public final Set i;
    public final LinkedHashSet j;
    public final long k;
    public final Long l;
    public final Long m;
    public final boolean n;
    public final String o;
    public final Set p;
    public final Set q;
    public final boolean r;
    public final boolean s;

    public r17(String str, CharSequence charSequence, int i, Set set, Set set2, List list, Map map, List list2, Set set3, LinkedHashSet linkedHashSet, long j, Long l, Long l2, boolean z, String str2, Set set4, Set set5) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = set;
        this.e = set2;
        this.f = list;
        this.g = map;
        this.h = list2;
        this.i = set3;
        this.j = linkedHashSet;
        this.k = j;
        this.l = l;
        this.m = l2;
        this.n = z;
        this.o = str2;
        this.p = set4;
        this.q = set5;
        this.r = set3.contains(s37.NO_DELETE);
        this.s = set3.contains(s37.CHAT_SUGGEST);
    }

    public final boolean a() {
        return cqk.d(this.a, "all.chat.folder");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return cqk.i(this.c, ((r17) obj).c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r17)) {
            return false;
        }
        r17 r17Var = (r17) obj;
        if (!cqk.d(this.a, r17Var.a) || !this.b.equals(r17Var.b) || this.c != r17Var.c || !cqk.d(this.d, r17Var.d) || !this.e.equals(r17Var.e) || !this.f.equals(r17Var.f)) {
            return false;
        }
        LinkedHashSet linkedHashSet = i37.b;
        return f55.b(this.g, r17Var.g) && this.h.equals(r17Var.h) && this.i.equals(r17Var.i) && this.j.equals(r17Var.j) && this.k == r17Var.k && cqk.d(this.l, r17Var.l) && cqk.d(this.m, r17Var.m) && this.n == r17Var.n && cqk.d(this.o, r17Var.o) && this.p.equals(r17Var.p) && this.q.equals(r17Var.q);
    }

    public final int hashCode() {
        int iC = qv1.c(nbh.o(this.e, nbh.o(this.d, mw7.f(zo5.d(this.c * 31, 31, this.a), 31, this.b), 31), 31), 31, this.f);
        LinkedHashSet linkedHashSet = i37.b;
        int iG = qt4.g((this.j.hashCode() + nbh.o(this.i, qv1.c((f55.u(this.g) + iC) * 31, 31, this.h), 31)) * 31, 31, this.k);
        Long l = this.l;
        int iHashCode = (iG + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.m;
        int iN = nbh.n((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.n);
        String str = this.o;
        return this.q.hashCode() + nbh.o(this.p, (iN + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Folder(id='");
        sb.append(this.a);
        sb.append("', includedChats=");
        sb.append(this.e.size());
        sb.append(", title='");
        sb.append(this.b);
        sb.append(", order=");
        sb.append(this.c);
        sb.append(", filters=");
        sb.append(this.d);
        sb.append(", elements=");
        sb.append(this.f.size());
        sb.append(", filterSubjects=");
        sb.append(this.g.size());
        sb.append(", widgets=");
        sb.append(ww3.z1(this.h, "[", "]", null, null, 60));
        sb.append(", options=");
        sb.append(ww3.z1(this.i, "[", "]", null, null, 60));
        sb.append(", favorites=");
        sb.append(ww3.z1(this.j, "[", "]", null, null, 60));
        sb.append(", templateId=");
        sb.append(this.l);
        sb.append(", sourceId=");
        sb.append(this.m);
        sb.append(", updateTime=");
        return c0a.m(this.k, ")", sb);
    }
}
