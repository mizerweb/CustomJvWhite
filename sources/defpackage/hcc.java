package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hcc implements lcc {
    public final int a;
    public final boolean b;
    public final Integer c;
    public final cf7 d;

    public hcc(int i, boolean z, Integer num, cf7 cf7Var) {
        this.a = i;
        this.b = z;
        this.c = num;
        this.d = cf7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcc)) {
            return false;
        }
        hcc hccVar = (hcc) obj;
        return this.a == hccVar.a && cqk.d(this.c, hccVar.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.c;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public /* synthetic */ hcc(int i, cf7 cf7Var) {
        this(i, false, null, cf7Var);
    }
}
