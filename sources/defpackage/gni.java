package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gni implements q42 {
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public gni(long j, CharSequence charSequence, CharSequence charSequence2, String str, boolean z, boolean z2) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = z;
        this.e = str;
        this.f = z2;
    }

    @Override // defpackage.q42
    public final String a() {
        return this.e;
    }

    @Override // defpackage.q42
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gni)) {
            return false;
        }
        gni gniVar = (gni) obj;
        return this.a == gniVar.a && this.b.equals(gniVar.b) && this.c.equals(gniVar.c) && this.d == gniVar.d && cqk.d(this.e, gniVar.e) && this.f == gniVar.f;
    }

    @Override // defpackage.q42
    public final CharSequence g() {
        return this.c;
    }

    @Override // defpackage.q42
    public final CharSequence getName() {
        return this.b;
    }

    public final int hashCode() {
        int iN = nbh.n(mw7.f(mw7.f(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iN + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // defpackage.q42
    public final boolean o() {
        return this.d;
    }

    @Override // defpackage.q42
    public final long p() {
        return this.a;
    }

    public final String toString() {
        return "UserInfo(serverId=" + this.a + ", name=" + ((Object) this.b) + ", abbreviation=" + ((Object) this.c) + ", isUnknown=" + this.d + ", avatar=" + this.e + ", isOfficial=" + this.f + ")";
    }
}
