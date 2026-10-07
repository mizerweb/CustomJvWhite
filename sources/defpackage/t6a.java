package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t6a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public t6a(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6a)) {
            return false;
        }
        t6a t6aVar = (t6a) obj;
        return this.a == t6aVar.a && this.b == t6aVar.b && this.c == t6aVar.c && this.d == t6aVar.d && this.e == t6aVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + zo5.c(-1, zo5.c(this.d, zo5.c(-1, zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("MediaTrimSliderColors(backgroundPlaceholderColor=", this.a, ", frameBorderColor=", this.b, ", handleColor=");
        qt4.x(this.c, this.d, ", handleLineColor=-1, overlayColor=", ", playheadColor=-1, playheadShadowColor=", sbP);
        return zo5.t(sbP, this.e, ")");
    }
}
