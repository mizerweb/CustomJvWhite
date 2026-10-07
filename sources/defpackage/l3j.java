package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l3j {
    public final int a;
    public final int b;
    public final int c;

    public l3j(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3j)) {
            return false;
        }
        l3j l3jVar = (l3j) obj;
        return this.a == l3jVar.a && this.b == l3jVar.b && this.c == l3jVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + spc.a(this.b, Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return zo5.t(qv1.p("VideoQualityUpdate(maxBitrate=", this.a, ", maxDimension=", this.b, ", source="), this.c, ")");
    }
}
