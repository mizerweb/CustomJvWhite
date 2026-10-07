package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class c5i implements rui {
    public final v2b a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final int f;
    public final long g;
    public final Uri h;
    public final String i = "video/mp4";
    public final int j;
    public final int k;

    public c5i(v2b v2bVar, long j, long j2, boolean z, int i) {
        this.a = v2bVar;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j2 - j;
        this.f = i;
        this.g = j;
        this.h = Uri.parse(v2bVar.a);
        this.j = v2bVar.b;
        this.k = v2bVar.c;
    }

    @Override // defpackage.rui
    public final long a() {
        return this.c;
    }

    @Override // defpackage.rui
    public final long c() {
        return this.g;
    }

    @Override // defpackage.rui
    public final Uri d() {
        return this.h;
    }

    @Override // defpackage.rui
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5i)) {
            return false;
        }
        c5i c5iVar = (c5i) obj;
        return this.a.equals(c5iVar.a) && this.b == c5iVar.b && this.c == c5iVar.c && this.d == c5iVar.d && this.e == c5iVar.e && this.f == c5iVar.f;
    }

    @Override // defpackage.rui
    public final String getContentType() {
        return this.i;
    }

    @Override // defpackage.rui
    public final long getDuration() {
        return this.e;
    }

    @Override // defpackage.rui
    public final int getHeight() {
        return this.k;
    }

    @Override // defpackage.rui
    public final int getType() {
        return this.f;
    }

    @Override // defpackage.rui
    public final int getWidth() {
        return this.j;
    }

    @Override // defpackage.rui
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return qt4.D(this.f) + qt4.g(nbh.n(qt4.g(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // defpackage.rui
    public final String i() {
        return null;
    }

    @Override // defpackage.rui
    public final long j() {
        return this.b;
    }

    @Override // defpackage.rui
    public final long k() {
        return 0L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrimmedMp4VideoContent(item=");
        sb.append(this.a);
        sb.append(", startPosition=");
        sb.append(this.b);
        qt4.z(this.c, ", endPosition=", ", isMute=", sb);
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(v0h.r(this.f));
        sb.append(")");
        return sb.toString();
    }
}
