package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class tlg implements k79 {
    public static final tlg n;
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final int l;
    public final int m;

    static {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        long j4 = 0;
        n = new tlg(j, j2, j3, str, str2, str3, i, i2, z, z2, j4, 0, 16382);
    }

    public /* synthetic */ tlg(long j, long j2, long j3, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, long j4, int i3, int i4) {
        this(j, (i4 & 2) != 0 ? 0L : j2, (i4 & 4) != 0 ? 0L : j3, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? null : str3, (i4 & np0.m) != 0 ? 0 : i, (i4 & np0.n) != 0 ? 0 : i2, (i4 & 1024) != 0 ? false : z, (i4 & np0.q) != 0 ? false : z2, (i4 & np0.r) != 0 ? j : j4, (i4 & 8192) != 0 ? 0 : i3);
    }

    public static tlg i(tlg tlgVar, boolean z, boolean z2, int i) {
        return new tlg(tlgVar.a, tlgVar.b, tlgVar.c, tlgVar.d, tlgVar.e, tlgVar.f, tlgVar.g, tlgVar.h, (i & 1024) != 0 ? tlgVar.i : z, (i & np0.q) != 0 ? tlgVar.j : z2, tlgVar.k, tlgVar.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlg)) {
            return false;
        }
        tlg tlgVar = (tlg) obj;
        return this.a == tlgVar.a && this.b == tlgVar.b && this.c == tlgVar.c && cqk.d(this.d, tlgVar.d) && cqk.d(this.e, tlgVar.e) && cqk.d(this.f, tlgVar.f) && this.g == tlgVar.g && this.h == tlgVar.h && this.i == tlgVar.i && this.j == tlgVar.j && this.k == tlgVar.k && this.l == tlgVar.l;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.k;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.k == k79Var.getItemId();
    }

    public final int hashCode() {
        int iG = qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iG2 = qt4.g(nbh.n(nbh.n(nbh.n(zo5.c(this.h, zo5.c(this.g, zo5.c(0, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31, false), 31, this.i), 31, this.j), 31, this.k);
        int i = this.l;
        return iG2 + (i != 0 ? qt4.D(i) : 0);
    }

    @Override // defpackage.k79
    public final int j() {
        return this.m;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        boolean z;
        if ((k79Var instanceof tlg) && this.j != (z = ((tlg) k79Var).j)) {
            return new slg(z);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "StickerModel(id=", ", setId=");
        sbS.append(this.b);
        qt4.z(this.c, ", originalSetId=", ", previewUrl=", sbS);
        nbh.G(sbS, this.d, ", lottieUrl=", this.e, ", videoUrl=");
        sbS.append(this.f);
        sbS.append(", markerType=0, width=");
        sbS.append(this.g);
        sbS.append(", height=");
        sbS.append(this.h);
        sbS.append(", external=false, favorite=");
        sbS.append(this.i);
        sbS.append(", selected=");
        sbS.append(this.j);
        sbS.append(", itemId=");
        sbS.append(this.k);
        sbS.append(", place=");
        sbS.append(pye.l(this.l));
        sbS.append(")");
        return sbS.toString();
    }

    public tlg(long j, long j2, long j3, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, long j4, int i3) {
        int i4;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = z2;
        this.k = j4;
        this.l = i3;
        if (str3 == null || str3.length() == 0) {
            i4 = (str2 == null || str2.length() == 0) ? R.id.oneme_stickers_view_type_sticker : R.id.oneme_stickers_view_type_sticker_lottie;
        } else {
            i4 = R.id.oneme_stickers_view_type_sticker_webm;
        }
        this.m = i4;
    }
}
