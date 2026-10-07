package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s9e implements k79 {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;

    public s9e(long j, String str, String str2, CharSequence charSequence, boolean z, boolean z2, int i) {
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        boolean z3 = (i & 64) == 0;
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9e)) {
            return false;
        }
        s9e s9eVar = (s9e) obj;
        return this.a == s9eVar.a && cqk.d(this.b, s9eVar.b) && cqk.d(this.c, s9eVar.c) && this.d.equals(s9eVar.d) && this.e == s9eVar.e && this.f == s9eVar.f && this.g == s9eVar.g;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.h;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return this.a == k79Var.getItemId();
    }

    public final int hashCode() {
        int iF = mw7.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(false) + nbh.n(nbh.n(nbh.n(mw7.f((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        s9e s9eVar = (s9e) k79Var;
        CharSequence charSequence = s9eVar.d;
        String str = s9eVar.c;
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence2 = s9eVar.b;
        if (!cqk.d(this.b, charSequence2)) {
            arrayList.add(new p9e(charSequence2));
        }
        boolean z = s9eVar.f;
        if (this.f != z) {
            arrayList.add(new r9e(z));
        }
        if (!cqk.d(this.c, str)) {
            arrayList.add(new o9e(str));
        }
        if (!this.d.equals(charSequence)) {
            arrayList.add(new n9e(charSequence));
        }
        boolean z2 = s9eVar.e;
        if (this.e != z2) {
            arrayList.add(new q9e(z2));
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentContactModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append((Object) this.d);
        qv1.v(", isOnline=", ", isVerified=", sb, this.e, this.f);
        return nbh.z(sb, ", isWebapp=", this.g, ", isSavedMessages=false)");
    }
}
