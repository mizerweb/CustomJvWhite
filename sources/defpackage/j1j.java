package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j1j {
    public static final j1j e = new j1j(60, "480", 30, 30);
    public final long a;
    public final String b;
    public final int c;
    public final int d;

    public j1j(long j, String str, int i, int i2) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1j)) {
            return false;
        }
        j1j j1jVar = (j1j) obj;
        return this.a == j1jVar.a && this.b.equals(j1jVar.b) && this.c == j1jVar.c && this.d == j1jVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + zo5.c(this.c, zo5.d(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "VideoMessageServerConfig(maxDuration=", ", quality=", this.b);
        zo5.C(this.c, this.d, ", minFrameRate=", ", maxFrameRate=", sbT);
        sbT.append(")");
        return sbT.toString();
    }
}
