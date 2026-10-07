package defpackage;

import android.net.Uri;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class v7a extends x7a {
    public final long a;
    public final long b;
    public final long c;
    public final Uri d;
    public final int e;
    public final Long f;
    public final String g;
    public final boolean h;
    public final Uri i;
    public final boolean j;
    public final Long k;
    public final Long l;
    public final boolean m;

    public v7a(long j, long j2, long j3, Uri uri, int i, Long l, String str, boolean z, Uri uri2, boolean z2, Long l2, Long l3, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = uri;
        this.e = i;
        this.f = l;
        this.g = str;
        this.h = z;
        this.i = uri2;
        this.j = z2;
        this.k = l2;
        this.l = l3;
        this.m = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7a)) {
            return false;
        }
        v7a v7aVar = (v7a) obj;
        return this.a == v7aVar.a && this.b == v7aVar.b && this.c == v7aVar.c && cqk.d(this.d, v7aVar.d) && this.e == v7aVar.e && cqk.d(this.f, v7aVar.f) && cqk.d(this.g, v7aVar.g) && this.h == v7aVar.h && cqk.d(this.i, v7aVar.i) && this.j == v7aVar.j && cqk.d(this.k, v7aVar.k) && cqk.d(this.l, v7aVar.l) && this.m == v7aVar.m;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Uri uri = this.d;
        int iF = c0a.f(this.e, (iG + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        Long l = this.f;
        int iN = nbh.n(zo5.d((iF + (l == null ? 0 : l.hashCode())) * 31, 31, this.g), 31, this.h);
        Uri uri2 = this.i;
        int iN2 = nbh.n((iN + (uri2 == null ? 0 : uri2.hashCode())) * 31, 31, this.j);
        Long l2 = this.k;
        int iHashCode = (iN2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.l;
        return Boolean.hashCode(this.m) + ((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    @Override // defpackage.x7a
    public final boolean i() {
        return this.m;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.profile_media_view_type_photo_video;
    }

    @Override // defpackage.x7a
    public final long k() {
        return this.c;
    }

    @Override // defpackage.x7a
    public final long l() {
        return this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sbS = qt4.s(this.a, "PhotoVideo(itemId=", ", messageId=");
        sbS.append(this.b);
        qt4.z(this.c, ", attachId=", ", previewUri=", sbS);
        sbS.append(this.d);
        sbS.append(", type=");
        int i = this.e;
        if (i == 1) {
            str = "PHOTO";
        } else if (i != 2) {
            str = i != 3 ? "null" : "GIF";
        } else {
            str = "VIDEO";
        }
        sbS.append(str);
        sbS.append(", duration=");
        sbS.append(this.f);
        sbS.append(", attachLocalId=");
        sbS.append(this.g);
        sbS.append(", isInCollage=");
        sbS.append(this.h);
        sbS.append(", lowResUri=");
        sbS.append(this.i);
        sbS.append(", isAutoloadDisabled=");
        sbS.append(this.j);
        sbS.append(", chatId=");
        sbS.append(this.k);
        sbS.append(", messageServerId=");
        sbS.append(this.l);
        sbS.append(", isContentLevel=");
        sbS.append(this.m);
        sbS.append(")");
        return sbS.toString();
    }

    public /* synthetic */ v7a(long j, long j2, long j3, Uri uri, Long l, String str, boolean z, Uri uri2, boolean z2, boolean z3) {
        this(j, j2, j3, uri, 2, l, str, z, uri2, z2, null, null, z3);
    }
}
