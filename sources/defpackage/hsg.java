package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hsg implements lsg {
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final Long h;
    public final b68 i;
    public final boolean j;
    public final u8b k;

    public hsg(long j, int i, int i2, long j2, int i3, int i4, int i5, Long l, b68 b68Var, boolean z, u8b u8bVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = l;
        this.i = b68Var;
        this.j = z;
        this.k = u8bVar;
    }

    @Override // defpackage.lsg
    public final int a() {
        return this.g;
    }

    @Override // defpackage.lsg
    public final int b() {
        return this.f;
    }

    @Override // defpackage.lsg
    public final long c() {
        return this.a;
    }

    @Override // defpackage.lsg
    public final int d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsg)) {
            return false;
        }
        hsg hsgVar = (hsg) obj;
        return this.a == hsgVar.a && this.b == hsgVar.b && this.c == hsgVar.c && this.d == hsgVar.d && this.e == hsgVar.e && this.f == hsgVar.f && this.g == hsgVar.g && cqk.d(this.h, hsgVar.h) && this.i.equals(hsgVar.i) && this.j == hsgVar.j && cqk.d(this.k, hsgVar.k);
    }

    @Override // defpackage.lsg
    public final int f() {
        return this.b;
    }

    @Override // defpackage.lsg
    public final Long g() {
        return this.h;
    }

    public final int hashCode() {
        int iF = c0a.f(this.g, zo5.c(this.f, zo5.c(this.e, qt4.g(zo5.c(this.c, zo5.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31), 31), 31);
        Long l = this.h;
        return this.k.hashCode() + nbh.n((this.i.hashCode() + ((iF + (l == null ? 0 : l.hashCode())) * 31)) * 31, 31, this.j);
    }

    @Override // defpackage.lsg
    public final long i() {
        return this.d;
    }

    public final String toString() {
        String strE = v1h.e(this.f);
        StringBuilder sbQ = c0a.q(this.b, this.a, "Photo(storyId=", ", playlistPosition=");
        sbQ.append(", internalPlayerPosition=");
        sbQ.append(this.c);
        sbQ.append(", time=");
        c0a.w(sbQ, this.d, ", expiration=", this.e);
        sbQ.append(", settings=");
        sbQ.append(strE);
        sbQ.append(", status=");
        sbQ.append(pye.n(this.g));
        sbQ.append(", draftId=");
        sbQ.append(this.h);
        sbQ.append(", config=");
        sbQ.append(this.i);
        sbQ.append(", useFallbackBlur=");
        sbQ.append(this.j);
        sbQ.append(", layers=");
        sbQ.append(this.k);
        sbQ.append(")");
        return sbQ.toString();
    }
}
