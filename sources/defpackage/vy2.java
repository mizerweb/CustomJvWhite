package defpackage;

import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vy2 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final m8b e;
    public final LinkedHashSet f;
    public final Set g;
    public final Set h;
    public final u8b i;
    public final Long j;
    public final b9b k;
    public final u8b l;
    public final Long m;

    public vy2(String str, String str2, long j, String str3, m8b m8bVar, LinkedHashSet linkedHashSet, EnumSet enumSet, EnumSet enumSet2, u8b u8bVar, Long l, b9b b9bVar, u8b u8bVar2, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = m8bVar;
        this.f = linkedHashSet;
        this.g = enumSet;
        this.h = enumSet2;
        this.i = u8bVar;
        this.j = l;
        this.k = b9bVar;
        this.l = u8bVar2;
        this.m = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy2)) {
            return false;
        }
        vy2 vy2Var = (vy2) obj;
        return this.a.equals(vy2Var.a) && this.b.equals(vy2Var.b) && this.c == vy2Var.c && cqk.d(this.d, vy2Var.d) && cqk.d(this.e, vy2Var.e) && this.f.equals(vy2Var.f) && cqk.d(this.g, vy2Var.g) && cqk.d(this.h, vy2Var.h) && cqk.d(this.i, vy2Var.i) && cqk.d(this.j, vy2Var.j) && this.k.equals(vy2Var.k) && cqk.d(this.l, vy2Var.l) && cqk.d(this.m, vy2Var.m);
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (this.i.hashCode() + nbh.o(this.h, nbh.o(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31)) * 31;
        Long l = this.j;
        int iHashCode2 = (this.l.hashCode() + ((this.k.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31;
        Long l2 = this.m;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("ChatFolderV2(id='", this.a, "', title='", gm0.c() ? this.b : "****", "', updateTime=");
        qv1.s(this.c, ", emoji=", this.d, sbQ);
        sbQ.append(", include=");
        sbQ.append(this.e);
        sbQ.append(", favorites=");
        sbQ.append(this.f);
        sbQ.append(", filters=");
        sbQ.append(this.g);
        sbQ.append(", options=");
        sbQ.append(this.h);
        sbQ.append(", elements=");
        sbQ.append(this.i);
        sbQ.append(", templateId=");
        sbQ.append(this.j);
        sbQ.append(", filterSubjects=");
        sbQ.append(this.k);
        sbQ.append(", widgets=");
        sbQ.append(this.l);
        sbQ.append(", sourceId=");
        sbQ.append(this.m);
        sbQ.append(")");
        return sbQ.toString();
    }
}
