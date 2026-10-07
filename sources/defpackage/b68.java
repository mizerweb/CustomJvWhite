package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class b68 {
    public final Uri a;
    public final boolean b;
    public final Uri c;
    public final Long d;
    public final Long e;
    public final Long f;

    public /* synthetic */ b68(Uri uri, boolean z, Uri uri2, int i) {
        this(uri, z, (i & 4) != 0 ? null : uri2, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b68)) {
            return false;
        }
        b68 b68Var = (b68) obj;
        return cqk.d(this.a, b68Var.a) && this.b == b68Var.b && cqk.d(this.c, b68Var.c) && cqk.d(this.d, b68Var.d) && cqk.d(this.e, b68Var.e) && cqk.d(this.f, b68Var.f);
    }

    public final int hashCode() {
        int iN = nbh.n(this.a.hashCode() * 31, 31, this.b);
        Uri uri = this.c;
        int iHashCode = (iN + (uri == null ? 0 : uri.hashCode())) * 31;
        Long l = this.d;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        return iHashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "ImageConfig(uri=" + this.a + ", isGif=" + this.b + ", lowResUri=" + this.c + ", chatId=" + this.d + ", messageId=" + this.e + ", photoId=" + this.f + ")";
    }

    public b68(Uri uri, boolean z, Uri uri2, Long l, Long l2, Long l3) {
        this.a = uri;
        this.b = z;
        this.c = uri2;
        this.d = l;
        this.e = l2;
        this.f = l3;
    }
}
