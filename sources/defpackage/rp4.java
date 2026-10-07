package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rp4 {
    public final int a;
    public final ynh b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ rp4(int i, ynh ynhVar, Integer num, Integer num2, int i2) {
        this(i, ynhVar, (Integer) null, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2);
    }

    public final Integer a() {
        return this.d;
    }

    public final Integer b() {
        return this.e;
    }

    public final int c() {
        return this.a;
    }

    public final ynh d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp4)) {
            return false;
        }
        rp4 rp4Var = (rp4) obj;
        return this.a == rp4Var.a && cqk.d(this.b, rp4Var.b) && cqk.d(this.c, rp4Var.c) && cqk.d(this.d, rp4Var.d) && cqk.d(this.e, rp4Var.e);
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
        return "ContextMenuAction(id=" + this.a + ", text=" + this.b + ", textColor=" + this.c + ", icon=" + this.d + ", iconColor=" + this.e + ")";
    }

    public rp4(int i, ynh ynhVar, Integer num, Integer num2, Integer num3) {
        this.a = i;
        this.b = ynhVar;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }
}
