package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class djg {
    public final oe a;
    public final pe b;
    public final ql0 c;
    public final jx6 d;
    public final List e;
    public final List f;
    public final List g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;

    public djg(oe oeVar, pe peVar, ql0 ql0Var, jx6 jx6Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = oeVar;
        this.b = peVar;
        this.c = ql0Var;
        this.d = jx6Var;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = bool;
        this.i = bool2;
        this.j = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djg)) {
            return false;
        }
        djg djgVar = (djg) obj;
        return cqk.d(this.a, djgVar.a) && cqk.d(this.b, djgVar.b) && cqk.d(this.c, djgVar.c) && cqk.d(this.d, djgVar.d) && cqk.d(this.e, djgVar.e) && cqk.d(this.f, djgVar.f) && cqk.d(this.g, djgVar.g) && cqk.d(this.h, djgVar.h) && cqk.d(this.i, djgVar.i) && cqk.d(this.j, djgVar.j);
    }

    public final int hashCode() {
        oe oeVar = this.a;
        int iHashCode = (oeVar == null ? 0 : Integer.hashCode(oeVar.a)) * 31;
        pe peVar = this.b;
        int iHashCode2 = (iHashCode + (peVar == null ? 0 : Integer.hashCode(peVar.a))) * 31;
        ql0 ql0Var = this.c;
        int iHashCode3 = (iHashCode2 + (ql0Var == null ? 0 : Integer.hashCode(ql0Var.a))) * 31;
        jx6 jx6Var = this.d;
        int iHashCode4 = (iHashCode3 + (jx6Var == null ? 0 : Integer.hashCode(jx6Var.a))) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.g;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "State3A(aeMode=" + this.a + ", afMode=" + this.b + ", awbMode=" + this.c + ", flashMode=" + this.d + ", aeRegions=" + this.e + ", afRegions=" + this.f + ", awbRegions=" + this.g + ", aeLock=" + this.h + ", afLock=" + this.i + ", awbLock=" + this.j + ')';
    }
}
