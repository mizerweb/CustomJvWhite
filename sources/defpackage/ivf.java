package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ivf {
    public static final ivf g = new ivf(-1, null, "", "", "", "");
    public final long a;
    public final String b;
    public final String c;
    public final CharSequence d;
    public final String e;
    public final String f;

    public ivf(long j, String str, String str2, CharSequence charSequence, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivf)) {
            return false;
        }
        ivf ivfVar = (ivf) obj;
        return this.a == ivfVar.a && cqk.d(this.b, ivfVar.b) && this.c.equals(ivfVar.c) && this.d.equals(ivfVar.d) && this.e.equals(ivfVar.e) && this.f.equals(ivfVar.f);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.f.hashCode() + zo5.d(mw7.f(zo5.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "SettingsProfileDataModel(id=", ", avatarUrl=", this.b);
        sbT.append(", fullName=");
        sbT.append(this.c);
        sbT.append(", abbreviation=");
        sbT.append((Object) this.d);
        nbh.G(sbT, ", phone=", this.e, ", nickName=", this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
