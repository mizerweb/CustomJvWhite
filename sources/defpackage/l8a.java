package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class l8a implements k79 {
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final ynh d;
    public final Uri e;
    public final CharSequence f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final ynh m;

    public l8a(long j, CharSequence charSequence, CharSequence charSequence2, ynh ynhVar, Uri uri, CharSequence charSequence3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, ynh ynhVar2) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = ynhVar;
        this.e = uri;
        this.f = charSequence3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = i;
        this.m = ynhVar2;
    }

    public static l8a i(l8a l8aVar, boolean z) {
        return new l8a(l8aVar.a, l8aVar.b, l8aVar.c, l8aVar.d, l8aVar.e, l8aVar.f, l8aVar.g, l8aVar.h, z, l8aVar.j, l8aVar.k, l8aVar.l, l8aVar.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8a)) {
            return false;
        }
        l8a l8aVar = (l8a) obj;
        return this.a == l8aVar.a && this.b.equals(l8aVar.b) && cqk.d(this.c, l8aVar.c) && cqk.d(this.d, l8aVar.d) && cqk.d(this.e, l8aVar.e) && this.f.equals(l8aVar.f) && this.g == l8aVar.g && this.h == l8aVar.h && this.i == l8aVar.i && this.j == l8aVar.j && this.k == l8aVar.k && this.l == l8aVar.l && cqk.d(this.m, l8aVar.m);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.a == k79Var.getItemId();
    }

    public final int hashCode() {
        int iF = mw7.f(Long.hashCode(this.a) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iH = bc1.h((iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d);
        Uri uri = this.e;
        int iC = zo5.c(this.l, nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(mw7.f((iH + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31);
        ynh ynhVar = this.m;
        return iC + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    @Override // defpackage.k79
    public final int j() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberListItem(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", shortName=");
        sb.append((Object) this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", abbreviation=");
        sb.append((Object) this.f);
        qv1.v(", isVerified=", ", isSelf=", sb, this.g, this.h);
        qv1.v(", isOwner=", ", isEnabled=", sb, this.i, this.j);
        sb.append(", isSelectable=");
        sb.append(this.k);
        sb.append(", presence=");
        sb.append(this.l);
        sb.append(", alias=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
