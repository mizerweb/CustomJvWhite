package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class emd {
    public final long a;
    public final CharSequence b;
    public final xnh c;
    public final String d;
    public final long e;
    public final CharSequence f;

    public emd(long j, CharSequence charSequence, xnh xnhVar, String str, long j2, CharSequence charSequence2) {
        this.a = j;
        this.b = charSequence;
        this.c = xnhVar;
        this.d = str;
        this.e = j2;
        this.f = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emd)) {
            return false;
        }
        emd emdVar = (emd) obj;
        return this.a == emdVar.a && cqk.d(this.b, emdVar.b) && this.c.equals(emdVar.c) && cqk.d(this.d, emdVar.d) && this.e == emdVar.e && cqk.d(this.f, emdVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + mw7.f(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        String str = this.d;
        return this.f.hashCode() + qt4.g(nbh.n((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileContactCellItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        sb.append(this.d);
        qt4.z(this.e, ", isOnline=false, avatarSourceId=", ", abbreviation=", sb);
        sb.append((Object) this.f);
        sb.append(")");
        return sb.toString();
    }
}
