package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bkd {
    public final long a;
    public final boolean b;
    public final List c;
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final boolean g;
    public final ynh h;
    public final CharSequence i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;
    public final boolean o;

    public /* synthetic */ bkd(long j, boolean z, List list, String str, CharSequence charSequence, CharSequence charSequence2, boolean z2, ynh ynhVar, CharSequence charSequence3, boolean z3, boolean z4, boolean z5, int i, int i2, boolean z6, int i3) {
        this(j, z, list, str, charSequence, charSequence2, (i3 & 64) != 0 ? false : z2, ynhVar, charSequence3, (i3 & np0.o) != 0 ? false : z3, z4, z5, (i3 & np0.r) != 0 ? 0 : i, (i3 & 8192) != 0 ? 0 : i2, (i3 & 16384) != 0 ? false : z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkd)) {
            return false;
        }
        bkd bkdVar = (bkd) obj;
        return this.a == bkdVar.a && this.b == bkdVar.b && cqk.d(this.c, bkdVar.c) && cqk.d(this.d, bkdVar.d) && cqk.d(this.e, bkdVar.e) && cqk.d(this.f, bkdVar.f) && this.g == bkdVar.g && cqk.d(this.h, bkdVar.h) && cqk.d(this.i, bkdVar.i) && this.j == bkdVar.j && this.k == bkdVar.k && this.l == bkdVar.l && this.m == bkdVar.m && this.n == bkdVar.n && this.o == bkdVar.o;
    }

    public final int hashCode() {
        int iN = nbh.n(Long.hashCode(this.a) * 31, 31, this.b);
        List list = this.c;
        int iHashCode = (iN + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int iN2 = nbh.n((iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.g);
        ynh ynhVar = this.h;
        int iHashCode4 = (iN2 + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        CharSequence charSequence3 = this.i;
        return Boolean.hashCode(this.o) + zo5.c(this.n, zo5.c(this.m, nbh.n(nbh.n(nbh.n((iHashCode4 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31, this.l), 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "ProfileAppBarState(idForAvatar=", ", editEnabled=", this.b);
        sbU.append(", avatarUrls=");
        sbU.append(this.c);
        sbU.append(", lowResAvatarUrl=");
        sbU.append(this.d);
        sbU.append(", title=");
        sbU.append((Object) this.e);
        sbU.append(", abbreviation=");
        sbU.append((Object) this.f);
        sbU.append(", showCallOverlay=");
        sbU.append(this.g);
        sbU.append(", subtitle=");
        sbU.append(this.h);
        sbU.append(", link=");
        sbU.append((Object) this.i);
        sbU.append(", isBlocked=");
        sbU.append(this.j);
        qv1.v(", isPortalBlocked=", ", isVerified=", sbU, this.k, this.l);
        zo5.C(this.m, this.n, ", storiesCount=", ", storiesReadCount=", sbU);
        return nbh.z(sbU, ", isStoriesHidden=", this.o, ")");
    }

    public bkd(long j, boolean z, List list, String str, CharSequence charSequence, CharSequence charSequence2, boolean z2, ynh ynhVar, CharSequence charSequence3, boolean z3, boolean z4, boolean z5, int i, int i2, boolean z6) {
        this.a = j;
        this.b = z;
        this.c = list;
        this.d = str;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = z2;
        this.h = ynhVar;
        this.i = charSequence3;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = i;
        this.n = i2;
        this.o = z6;
    }
}
