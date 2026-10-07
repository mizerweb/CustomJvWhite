package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e1a extends i1a {
    public final String b;
    public final int c;
    public final long d;
    public final int e;

    public e1a(long j, String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1a)) {
            return false;
        }
        e1a e1aVar = (e1a) obj;
        return cqk.d(this.b, e1aVar.b) && this.c == e1aVar.c && this.d == e1aVar.d && this.e == e1aVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qt4.g(zo5.c(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.c, "OpenMediaEditScreen(albumId=", this.b, ", uiPosition=", ", initialId=");
        c0a.w(sbR, this.d, ", type=", this.e);
        sbR.append(")");
        return sbR.toString();
    }
}
