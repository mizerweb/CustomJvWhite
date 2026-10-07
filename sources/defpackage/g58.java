package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class g58 implements yu3 {
    public static final g58 p = new g58(0, Uri.parse("error"), -1, -1, false, -1, false, null, null, null, null, null, 0, 0, 32256);
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final Uri h;
    public final bne i;
    public final cqk j;
    public final String k;
    public final Uri l;
    public final String m;
    public final long n;
    public final long o;

    public g58(long j, Uri uri, int i, int i2, boolean z, int i3, boolean z2, Uri uri2, bne bneVar, String str, Uri uri3, String str2, long j2, long j3, int i4) {
        bne bneVar2 = (i4 & np0.n) != 0 ? null : bneVar;
        i1f i1fVar = i1f.l;
        String str3 = (i4 & 1024) != 0 ? null : str;
        Uri uri4 = (i4 & np0.q) != 0 ? null : uri3;
        String str4 = (i4 & np0.r) == 0 ? str2 : null;
        long j4 = (i4 & 8192) != 0 ? 0L : j2;
        long j5 = (i4 & 16384) == 0 ? j3 : 0L;
        this.a = j;
        this.b = uri;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = z2;
        this.h = uri2;
        this.i = bneVar2;
        this.j = i1fVar;
        this.k = str3;
        this.l = uri4;
        this.m = str4;
        this.n = j4;
        this.o = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g58)) {
            return false;
        }
        g58 g58Var = (g58) obj;
        return this.a == g58Var.a && cqk.d(this.b, g58Var.b) && this.c == g58Var.c && this.d == g58Var.d && this.e == g58Var.e && this.f == g58Var.f && this.g == g58Var.g && cqk.d(this.h, g58Var.h) && cqk.d(this.i, g58Var.i) && cqk.d(this.j, g58Var.j) && cqk.d(this.k, g58Var.k) && cqk.d(this.l, g58Var.l) && cqk.d(this.m, g58Var.m) && this.n == g58Var.n && this.o == g58Var.o;
    }

    public final int hashCode() {
        int iN = nbh.n(zo5.c(this.f, nbh.n(zo5.c(this.d, zo5.c(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31, this.e), 31), 31, this.g);
        Uri uri = this.h;
        int iHashCode = (iN + (uri == null ? 0 : uri.hashCode())) * 31;
        bne bneVar = this.i;
        int iHashCode2 = (this.j.hashCode() + ((iHashCode + (bneVar == null ? 0 : bneVar.hashCode())) * 31)) * 31;
        String str = this.k;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri2 = this.l;
        int iHashCode4 = (iHashCode3 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        String str2 = this.m;
        return Long.hashCode(this.o) + qt4.g((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.n);
    }

    @Override // defpackage.yu3
    public final String k() {
        return this.k;
    }

    @Override // defpackage.yu3
    public final boolean l() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageAttachConfig(photoId=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        zo5.C(this.c, this.d, ", width=", ", height=", sb);
        sb.append(", isGif=");
        sb.append(this.e);
        sb.append(", maxImageViewHeight=");
        sb.append(this.f);
        sb.append(", isAutoLoadImageDisabled=");
        sb.append(this.g);
        sb.append(", lowResUri=");
        sb.append(this.h);
        sb.append(", resizeOptions=");
        sb.append(this.i);
        sb.append(", scaleType=");
        sb.append(this.j);
        sb.append(", attachId=");
        sb.append(this.k);
        sb.append(", gifUri=");
        sb.append(this.l);
        p.j(sb, ", url=", this.m, ", chaId=");
        sb.append(this.n);
        return zo5.k(this.o, ", messageId=", ")", sb);
    }
}
