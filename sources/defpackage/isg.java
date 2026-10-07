package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class isg implements lsg {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final Long g;
    public final int h;

    public isg(long j, int i, long j2, int i2, int i3, int i4, Long l, int i5) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = l;
        this.h = i5;
    }

    @Override // defpackage.lsg
    public final int a() {
        return this.f;
    }

    @Override // defpackage.lsg
    public final int b() {
        return this.e;
    }

    @Override // defpackage.lsg
    public final long c() {
        return this.a;
    }

    @Override // defpackage.lsg
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isg)) {
            return false;
        }
        isg isgVar = (isg) obj;
        return this.a == isgVar.a && this.b == isgVar.b && this.c == isgVar.c && this.d == isgVar.d && this.e == isgVar.e && this.f == isgVar.f && cqk.d(this.g, isgVar.g) && this.h == isgVar.h;
    }

    @Override // defpackage.lsg
    public final int f() {
        return this.b;
    }

    @Override // defpackage.lsg
    public final Long g() {
        return this.g;
    }

    public final int hashCode() {
        int iF = c0a.f(this.f, zo5.c(this.e, zo5.c(this.d, qt4.g(zo5.c(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31), 31), 31);
        Long l = this.g;
        return Integer.hashCode(this.h) + ((iF + (l == null ? 0 : l.hashCode())) * 31);
    }

    @Override // defpackage.lsg
    public final long i() {
        return this.c;
    }

    public final String toString() {
        String strE = v1h.e(this.e);
        StringBuilder sbQ = c0a.q(this.b, this.a, "Unsupported(storyId=", ", playlistPosition=");
        qt4.z(this.c, ", time=", ", expiration=", sbQ);
        sbQ.append(this.d);
        sbQ.append(", settings=");
        sbQ.append(strE);
        sbQ.append(", status=");
        sbQ.append(pye.n(this.f));
        sbQ.append(", draftId=");
        sbQ.append(this.g);
        sbQ.append(", internalPlayerPosition=");
        return zo5.t(sbQ, this.h, ")");
    }
}
