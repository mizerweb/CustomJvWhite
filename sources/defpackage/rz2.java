package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rz2 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public rz2(String str, long j, CharSequence charSequence, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz2)) {
            return false;
        }
        rz2 rz2Var = (rz2) obj;
        return cqk.d(this.a, rz2Var.a) && this.b == rz2Var.b && cqk.d(this.c, rz2Var.c) && this.d.equals(rz2Var.d) && cqk.d(this.e, rz2Var.e) && this.f == rz2Var.f && this.g == rz2Var.g && this.h == rz2Var.h;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.h) + nbh.n(nbh.n(zo5.d(zo5.d(mw7.f(qt4.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "ChatItemModel(avatarUrl=", this.a, ", avatarSourceId=");
        sbB.append(", avatarAbbreviation=");
        sbB.append((Object) this.c);
        sbB.append(", chatName=");
        sbB.append(this.d);
        sbB.append(", chatLink=");
        sbB.append(this.e);
        sbB.append(", isLoading=");
        sbB.append(this.f);
        qv1.v(", isPrivate=", ", hasEditLinkPermission=", sbB, this.g, this.h);
        sbB.append(")");
        return sbB.toString();
    }
}
