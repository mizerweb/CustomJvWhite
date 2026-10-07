package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zdb {
    public final int a;
    public final Integer b;

    public zdb(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdb)) {
            return false;
        }
        zdb zdbVar = (zdb) obj;
        return this.a == zdbVar.a && cqk.d(this.b, zdbVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "NeuroAvatarScrollEvent(tabIndex=" + this.a + ", firstIndex=" + this.b + ")";
    }
}
