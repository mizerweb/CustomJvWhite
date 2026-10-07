package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class iy7 implements rui {
    public final String a;
    public final c70 b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final Uri l;
    public final long m;
    public final String n = "video/hls";

    public iy7(String str, c70 c70Var, long j, long j2, long j3, boolean z, boolean z2, int i, int i2, int i3, String str2) {
        this.a = str;
        this.b = c70Var;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = str2;
        this.l = Uri.parse(str);
        this.m = j2;
    }

    @Override // defpackage.rui
    public final long a() {
        return this.m;
    }

    @Override // defpackage.rui
    public final long c() {
        return this.e;
    }

    @Override // defpackage.rui
    public final Uri d() {
        return this.l;
    }

    @Override // defpackage.rui
    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy7)) {
            return false;
        }
        iy7 iy7Var = (iy7) obj;
        return cqk.d(this.a, iy7Var.a) && cqk.d(this.b, iy7Var.b) && this.c == iy7Var.c && this.d == iy7Var.d && this.e == iy7Var.e && this.f == iy7Var.f && this.g == iy7Var.g && this.h == iy7Var.h && this.i == iy7Var.i && this.j == iy7Var.j && cqk.d(this.k, iy7Var.k);
    }

    @Override // defpackage.rui
    public final rui f(long j) {
        return new iy7(this.a, this.b, this.c, this.d, j, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.rui
    public final c70 g() {
        return this.b;
    }

    @Override // defpackage.rui
    public final String getContentType() {
        return this.n;
    }

    @Override // defpackage.rui
    public final long getDuration() {
        return this.d;
    }

    @Override // defpackage.rui
    public final int getHeight() {
        return this.i;
    }

    @Override // defpackage.rui
    public final int getType() {
        return this.j;
    }

    @Override // defpackage.rui
    public final int getWidth() {
        return this.h;
    }

    @Override // defpackage.rui
    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        c70 c70Var = this.b;
        int iF = c0a.f(this.j, zo5.c(this.i, zo5.c(this.h, nbh.n(nbh.n(qt4.g(qt4.g(qt4.g((iHashCode + (c70Var == null ? 0 : c70Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31), 31);
        String str = this.k;
        return iF + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.rui
    public final String i() {
        return this.k;
    }

    @Override // defpackage.rui
    public final long j() {
        return 0L;
    }

    @Override // defpackage.rui
    public final long k() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsVideoContent(url=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        qt4.z(this.d, ", duration=", ", initSeekPos=", sb);
        sb.append(this.e);
        sb.append(", isLive=");
        sb.append(this.f);
        sb.append(", isMute=");
        sb.append(this.g);
        sb.append(", width=");
        sb.append(this.h);
        sb.append(", height=");
        sb.append(this.i);
        sb.append(", type=");
        sb.append(v0h.r(this.j));
        return qt4.q(sb, ", failoverHost=", this.k, ")");
    }
}
