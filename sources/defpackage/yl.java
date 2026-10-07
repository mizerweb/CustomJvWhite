package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yl {
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public yl(int i, int i2, long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
    }

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl)) {
            return false;
        }
        yl ylVar = (yl) obj;
        return this.a == ylVar.a && cqk.d(this.b, ylVar.b) && cqk.d(this.c, ylVar.c) && this.d == ylVar.d && this.e == ylVar.e;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Integer.hashCode(this.e) + zo5.c(this.d, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "AnimojiKey(id=", ", staticUrl=", this.b);
        sbT.append(", lottieUrl=");
        sbT.append(this.c);
        sbT.append(", size=");
        sbT.append(this.d);
        return qv1.o(sbT, ", autoRepeatMode=", this.e, ")");
    }
}
