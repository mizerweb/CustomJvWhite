package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ypf implements aqf {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final ifh e = new ifh(new ize(13, this));

    public ypf(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypf)) {
            return false;
        }
        ypf ypfVar = (ypf) obj;
        return cqk.d(this.a, ypfVar.a) && this.b == ypfVar.b && this.c == ypfVar.c && this.d == ypfVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + zo5.c(this.c, c0a.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbV = qt4.v("Media(iconUrl=", this.a, ", alignment=");
        sbV.append(pye.r(this.b));
        sbV.append(", width=");
        sbV.append(this.c);
        sbV.append(", height=");
        return zo5.t(sbV, this.d, ")");
    }
}
