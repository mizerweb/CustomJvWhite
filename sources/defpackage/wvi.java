package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wvi {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public wvi(int i, int i2, int i3, int i4, int i5) {
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
        if (!(obj instanceof wvi)) {
            return false;
        }
        wvi wviVar = (wvi) obj;
        return this.a == wviVar.a && this.b == wviVar.b && this.c == wviVar.c && this.d == wviVar.d && this.e == wviVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + spc.a(this.d, spc.a(this.c, spc.a(this.b, Integer.hashCode(this.a) * 31)));
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("VideoDimension(landscapeWidth=", this.a, ", landscapeHeight=", this.b, ", portraitWidth=");
        qt4.x(this.c, this.d, ", portraitHeight=", ", fps=", sbP);
        return zo5.t(sbP, this.e, ")");
    }
}
