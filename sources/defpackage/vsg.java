package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class vsg {
    public static final usg Companion = new usg();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public /* synthetic */ vsg(int i, int i2, int i3, int i4, int i5, int i6) {
        if ((i & 1) == 0) {
            this.a = 1080;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 1920;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = 720;
        } else {
            this.c = i4;
        }
        if ((i & 8) == 0) {
            this.d = 1280;
        } else {
            this.d = i5;
        }
        if ((i & 16) == 0) {
            this.e = 1080;
        } else {
            this.e = i6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsg)) {
            return false;
        }
        vsg vsgVar = (vsg) obj;
        return this.a == vsgVar.a && this.b == vsgVar.b && this.c == vsgVar.c && this.d == vsgVar.d && this.e == vsgVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("StoriesPhotoSettings(outputWidth=", this.a, ", outputHeight=", this.b, ", fallbackWidth=");
        qt4.x(this.c, this.d, ", fallbackHeight=", ", maxPreviewSize=", sbP);
        return zo5.t(sbP, this.e, ")");
    }

    public vsg() {
        this.a = 1080;
        this.b = 1920;
        this.c = 720;
        this.d = 1280;
        this.e = 1080;
    }
}
