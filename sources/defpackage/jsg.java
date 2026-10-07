package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class jsg implements lsg {
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final Long h;
    public final long i;
    public final long j;
    public final Uri k;
    public final pui l;
    public final boolean m;
    public final u8b n;

    public jsg(long j, int i, int i2, long j2, int i3, int i4, int i5, Long l, long j3, long j4, Uri uri, pui puiVar, boolean z, u8b u8bVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = l;
        this.i = j3;
        this.j = j4;
        this.k = uri;
        this.l = puiVar;
        this.m = z;
        this.n = u8bVar;
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
        if (!(obj instanceof jsg)) {
            return false;
        }
        jsg jsgVar = (jsg) obj;
        return this.a == jsgVar.a && this.b == jsgVar.b && this.c == jsgVar.c && this.d == jsgVar.d && this.e == jsgVar.e && this.f == jsgVar.f && this.g == jsgVar.g && cqk.d(this.h, jsgVar.h) && this.i == jsgVar.i && this.j == jsgVar.j && cqk.d(this.k, jsgVar.k) && this.l.equals(jsgVar.l) && this.m == jsgVar.m && cqk.d(this.n, jsgVar.n);
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
        return this.n.hashCode() + nbh.n((this.l.hashCode() + ((this.k.hashCode() + qt4.g(qt4.g((iF + (l == null ? 0 : l.hashCode())) * 31, 31, this.i), 31, this.j)) * 31)) * 31, 31, this.m);
    }

    @Override // defpackage.lsg
    public final long i() {
        return this.d;
    }

    public final String toString() {
        String strE = v1h.e(this.f);
        StringBuilder sbQ = c0a.q(this.b, this.a, "Video(storyId=", ", playlistPosition=");
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
        sbQ.append(", startPosMillis=");
        sbQ.append(this.i);
        qt4.z(this.j, ", duration=", ", uri=", sbQ);
        sbQ.append(this.k);
        sbQ.append(", previewConfig=");
        sbQ.append(this.l);
        sbQ.append(", useFallbackBlur=");
        sbQ.append(this.m);
        sbQ.append(", layers=");
        sbQ.append(this.n);
        sbQ.append(")");
        return sbQ.toString();
    }
}
