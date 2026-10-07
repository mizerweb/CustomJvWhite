package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xzd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public xzd(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public static int k(int i, float f) {
        return Math.max(1, gm0.K(i * f));
    }

    public final int a(uzd uzdVar) {
        return uzdVar.a.getHeight() + this.b + uzdVar.e + this.e + uzdVar.c + uzdVar.d + this.d + this.g + this.f;
    }

    public final int b() {
        return this.g;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.h;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzd)) {
            return false;
        }
        xzd xzdVar = (xzd) obj;
        return this.a == xzdVar.a && this.b == xzdVar.b && this.c == xzdVar.c && this.d == xzdVar.d && this.e == xzdVar.e && this.f == xzdVar.f && this.g == xzdVar.g && this.h == xzdVar.h && this.i == xzdVar.i;
    }

    public final int f() {
        return this.c;
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + zo5.c(this.h, zo5.c(this.g, zo5.c(this.f, zo5.c(this.e, zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final int i() {
        return this.a;
    }

    public final xzd j(float f) {
        float f2 = 1.0f;
        if (f < 1.0f) {
            float fC = c0a.c(1.0f, f, 0.25f, f);
            if (fC <= 1.0f) {
                f2 = fC;
            }
        }
        return new xzd(k(this.a, f2), k(this.b, f), k(this.c, f), k(this.d, f), k(this.e, f), k(this.f, f), k(this.g, f), k(this.h, f), k(this.i, f));
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("Metrics(verticalMargin=", this.a, ", qrCodeMargin=", this.b, ", textHorizontalMargin=");
        qt4.x(this.c, this.d, ", textTopMargin=", ", textBottomMargin=", sbP);
        qt4.x(this.e, this.f, ", avatarTopMargin=", ", avatarSize=", sbP);
        qt4.x(this.g, this.h, ", qrSize=", ", titleSubtitleMargin=", sbP);
        return zo5.t(sbP, this.i, ")");
    }
}
