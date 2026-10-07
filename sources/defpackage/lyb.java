package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lyb {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final boolean f;

    public /* synthetic */ lyb(int i, Integer num, Integer num2, Integer num3, Integer num4, int i2) {
        this(i, num, (i2 & 4) != 0 ? null : num2, num3, (i2 & 16) != 0 ? null : num4, true);
    }

    public static lyb a(lyb lybVar, boolean z) {
        return new lyb(lybVar.a, lybVar.b, lybVar.c, lybVar.d, lybVar.e, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyb)) {
            return false;
        }
        lyb lybVar = (lyb) obj;
        return this.a == lybVar.a && cqk.d(this.b, lybVar.b) && cqk.d(this.c, lybVar.c) && cqk.d(this.d, lybVar.d) && cqk.d(this.e, lybVar.e) && this.f == lybVar.f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ButtonData(id=" + this.a + ", textRes=" + this.b + ", textColor=" + this.c + ", iconRes=" + this.d + ", iconColor=" + this.e + ", isEnabled=" + this.f + ")";
    }

    public lyb(int i, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = z;
    }
}
