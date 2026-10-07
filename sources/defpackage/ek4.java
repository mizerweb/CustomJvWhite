package defpackage;

import android.net.Uri;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class ek4 implements k79 {
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final List d;
    public final ynh e;
    public final ynh f;
    public final Uri g;
    public final boolean h;
    public final boolean i;
    public final CharSequence j;
    public final boolean k;
    public final ktc l;
    public final Boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;

    public /* synthetic */ ek4(long j, String str, String str2, List list, ynh ynhVar, tnh tnhVar, Uri uri, boolean z, boolean z2, CharSequence charSequence, boolean z3, ktc ktcVar, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2) {
        this(j, str, str2, list, ynhVar, tnhVar, uri, z, z2, charSequence, (i2 & 1024) != 0 ? false : z3, (i2 & np0.q) != 0 ? null : ktcVar, null, false, (i2 & 16384) != 0, (32768 & i2) != 0 ? 0 : i, z4, z5, z6, (524288 & i2) != 0 ? false : z7, (i2 & 1048576) != 0 ? true : z8);
    }

    public static ek4 i(ek4 ek4Var, ynh ynhVar, boolean z, int i) {
        return new ek4(ek4Var.a, ek4Var.b, ek4Var.c, ek4Var.d, (i & 16) != 0 ? ek4Var.e : ynhVar, ek4Var.f, ek4Var.g, (i & np0.m) != 0 ? ek4Var.h : z, ek4Var.i, ek4Var.j, ek4Var.k, ek4Var.l, ek4Var.m, (i & 8192) != 0 ? ek4Var.n : true, ek4Var.o, ek4Var.p, ek4Var.q, ek4Var.r, ek4Var.s, ek4Var.t, ek4Var.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek4)) {
            return false;
        }
        ek4 ek4Var = (ek4) obj;
        return this.a == ek4Var.a && cqk.d(this.b, ek4Var.b) && cqk.d(this.c, ek4Var.c) && cqk.d(this.d, ek4Var.d) && cqk.d(this.e, ek4Var.e) && cqk.d(this.f, ek4Var.f) && cqk.d(this.g, ek4Var.g) && this.h == ek4Var.h && this.i == ek4Var.i && cqk.d(this.j, ek4Var.j) && this.k == ek4Var.k && cqk.d(this.l, ek4Var.l) && cqk.d(this.m, ek4Var.m) && this.n == ek4Var.n && this.o == ek4Var.o && this.p == ek4Var.p && this.q == ek4Var.q && this.r == ek4Var.r && this.s == ek4Var.s && this.t == ek4Var.t && this.u == ek4Var.u;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iF = mw7.f(Long.hashCode(this.a) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iHashCode = (iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ynh ynhVar = this.e;
        int iHashCode3 = (iHashCode2 + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        ynh ynhVar2 = this.f;
        int iHashCode4 = (iHashCode3 + (ynhVar2 == null ? 0 : ynhVar2.hashCode())) * 31;
        Uri uri = this.g;
        int iN = nbh.n(mw7.f(nbh.n(nbh.n((iHashCode4 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        ktc ktcVar = this.l;
        int iHashCode5 = (iN + (ktcVar == null ? 0 : ktcVar.hashCode())) * 31;
        Boolean bool = this.m;
        return Boolean.hashCode(this.u) + nbh.n(nbh.n(nbh.n(nbh.n(zo5.c(this.p, nbh.n(nbh.n((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.n), 31, this.o), 31), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.v;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        ek4 ek4Var = k79Var instanceof ek4 ? (ek4) k79Var : null;
        if (ek4Var != null) {
            Boolean bool = ek4Var.m;
            if (!cqk.d(this.m, bool)) {
                return new dk4(bool);
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactListItem(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", shortName=");
        sb.append((Object) this.c);
        sb.append(", phones=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", button=");
        sb.append(this.f);
        sb.append(", avatar=");
        sb.append(this.g);
        sb.append(", isOnline=");
        sb.append(this.h);
        sb.append(", isVerified=");
        sb.append(this.i);
        sb.append(", abbreviation=");
        sb.append((Object) this.j);
        sb.append(", isSelf=");
        sb.append(this.k);
        sb.append(", availablePhone=");
        sb.append(this.l);
        sb.append(", isSelected=");
        sb.append(this.m);
        sb.append(", hasCallActions=");
        sb.append(this.n);
        sb.append(", isContact=");
        sb.append(this.o);
        sb.append(", presence=");
        sb.append(this.p);
        qv1.v(", isBot=", ", isRestricted=", sb, this.q, this.r);
        qv1.v(", isNoForward=", ", isPortalBlocked=", sb, this.s, this.t);
        return nbh.z(sb, ", isAccountActive=", this.u, ")");
    }

    public ek4(long j, CharSequence charSequence, CharSequence charSequence2, List list, ynh ynhVar, ynh ynhVar2, Uri uri, boolean z, boolean z2, CharSequence charSequence3, boolean z3, ktc ktcVar, Boolean bool, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = list;
        this.e = ynhVar;
        this.f = ynhVar2;
        this.g = uri;
        this.h = z;
        this.i = z2;
        this.j = charSequence3;
        this.k = z3;
        this.l = ktcVar;
        this.m = bool;
        this.n = z4;
        this.o = z5;
        this.p = i;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = z9;
        this.u = z10;
        this.v = ynhVar2 == null ? R.id.oneme_contactlist_contact_view_type : R.id.oneme_contactlist_phonebook_contact_view_type;
    }
}
