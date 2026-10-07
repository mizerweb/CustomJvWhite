package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ind {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;

    public ind(long j, CharSequence charSequence, CharSequence charSequence2, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
        this.f = z2;
    }

    public static ind a(ind indVar, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = indVar.a;
        }
        String str2 = str;
        long j = indVar.b;
        CharSequence charSequence = indVar.c;
        CharSequence charSequence2 = indVar.d;
        if ((i & 16) != 0) {
            z = indVar.e;
        }
        return new ind(j, charSequence, charSequence2, str2, z, indVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ind)) {
            return false;
        }
        ind indVar = (ind) obj;
        return cqk.d(this.a, indVar.a) && this.b == indVar.b && cqk.d(this.c, indVar.c) && cqk.d(this.d, indVar.d) && this.e == indVar.e && this.f == indVar.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iG = qt4.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iHashCode = (iG + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        return Boolean.hashCode(this.f) + nbh.n((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "ProfileEditAppBarState(avatarUrl=", this.a, ", avatarSourceId=");
        sbB.append(", firstName=");
        sbB.append((Object) this.c);
        sbB.append(", abbreviation=");
        sbB.append((Object) this.d);
        qv1.v(", showAcceptChanges=", ", showAddPhoto=", sbB, this.e, this.f);
        sbB.append(")");
        return sbB.toString();
    }
}
