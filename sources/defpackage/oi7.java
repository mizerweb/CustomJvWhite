package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oi7 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final bne f;
    public final bne g;

    public oi7(int i, int i2, int i3, int i4, int i5, bne bneVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = bneVar;
        this.g = i5 <= 0 ? null : new bne(i5, i5, 0.0f, 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi7)) {
            return false;
        }
        oi7 oi7Var = (oi7) obj;
        return this.a == oi7Var.a && this.b == oi7Var.b && this.c == oi7Var.c && this.d == oi7Var.d && this.e == oi7Var.e && cqk.d(this.f, oi7Var.f);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f.hashCode() + zo5.c(this.e, zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("GalleryUiOptions(cellSize=", this.a, ", threshold=", this.b, ", spanCount=");
        qt4.x(this.c, this.d, ", spanSpacing=", ", thumbnailSize=", sbP);
        sbP.append(this.e);
        sbP.append(", albumsCoverResizeOptions=");
        sbP.append(this.f);
        sbP.append(", isItemAnimatorEnabled=false)");
        return sbP.toString();
    }
}
