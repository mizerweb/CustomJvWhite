package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class az0 implements k79 {
    public final long a;
    public final String b;
    public final String c;
    public final CharSequence d;
    public final Integer e;
    public final boolean f;

    public az0(long j, String str, String str2, CharSequence charSequence, Integer num, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.e = num;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az0)) {
            return false;
        }
        az0 az0Var = (az0) obj;
        return this.a == az0Var.a && cqk.d(this.b, az0Var.b) && this.c.equals(az0Var.c) && this.d.equals(az0Var.d) && cqk.d(this.e, az0Var.e) && this.f == az0Var.f;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iF = mw7.f((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((iF + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "BlackListItem(itemId=", ", avatar=", this.b);
        sbT.append(", name=");
        sbT.append((Object) this.c);
        sbT.append(", abbreviation=");
        sbT.append((Object) this.d);
        sbT.append(", subtitleRes=");
        sbT.append(this.e);
        sbT.append(", isPortalBlocked=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
