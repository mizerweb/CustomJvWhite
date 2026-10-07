package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x5f {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final i5f d;
    public final boolean e;
    public final int f;
    public final long g;
    public final int h;

    public /* synthetic */ x5f(long j, boolean z, i5f i5fVar, boolean z2, long j2, int i, int i2) {
        this(j, true, z, i5fVar, z2, -1, (i2 & 64) != 0 ? -1L : j2, (i2 & np0.m) != 0 ? 0 : i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5f)) {
            return false;
        }
        x5f x5fVar = (x5f) obj;
        return this.a == x5fVar.a && this.b == x5fVar.b && this.c == x5fVar.c && this.d == x5fVar.d && this.e == x5fVar.e && this.f == x5fVar.f && this.g == x5fVar.g && this.h == x5fVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + qt4.g(zo5.c(this.f, nbh.n((this.d.hashCode() + nbh.n(nbh.n(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "ScrollEvent(mark=", ", isAlreadyLoaded=", this.b);
        sbU.append(", isSmoothScroll=");
        sbU.append(this.c);
        sbU.append(", alignment=");
        sbU.append(this.d);
        sbU.append(", highlightScrollAnchor=");
        sbU.append(this.e);
        sbU.append(", approximateIndex=");
        sbU.append(this.f);
        qt4.z(this.g, ", msgId=", ", offset=", sbU);
        return zo5.t(sbU, this.h, ")");
    }

    public x5f(long j, boolean z, boolean z2, i5f i5fVar, boolean z3, int i, long j2, int i2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = i5fVar;
        this.e = z3;
        this.f = i;
        this.g = j2;
        this.h = i2;
    }
}
