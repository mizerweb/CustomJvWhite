package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n6g {
    public final int a;
    public final ynh b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public n6g(int i, ynh ynhVar, Integer num, Integer num2, Integer num3) {
        this.a = i;
        this.b = ynhVar;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6g)) {
            return false;
        }
        n6g n6gVar = (n6g) obj;
        return this.a == n6gVar.a && this.b.equals(n6gVar.b) && cqk.d(this.c, n6gVar.c) && cqk.d(this.d, n6gVar.d) && cqk.d(this.e, n6gVar.e);
    }

    public final int hashCode() {
        int iH = bc1.h(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iH + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "SimpleContextMenuAction(id=" + this.a + ", text=" + this.b + ", textColor=" + this.c + ", icon=" + this.d + ", iconColor=" + this.e + ")";
    }
}
