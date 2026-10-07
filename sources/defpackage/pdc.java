package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pdc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public pdc(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdc)) {
            return false;
        }
        pdc pdcVar = (pdc) obj;
        return this.a == pdcVar.a && this.b == pdcVar.b && this.c == pdcVar.c && this.d == pdcVar.d && this.e == pdcVar.e && this.f == pdcVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + nbh.n(zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("OneVideoLoadControlParams(minBufferMs=", this.a, ", maxBufferMs=", this.b, ", bufferForPlaybackMs=");
        qt4.x(this.c, this.d, ", bufferForPlaybackAfterRebufferMs=", ", prioritizeTimeOverSizeThresholds=", sbP);
        sbP.append(this.e);
        sbP.append(", backBufferDurationMs=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
