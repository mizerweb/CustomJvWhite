package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eih extends yhh {
    public final String e;
    public final String f;

    public eih(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eih) || this != obj) {
            return false;
        }
        eih eihVar = (eih) obj;
        return cqk.d(this.e, eihVar.e) && cqk.d(this.f, eihVar.f);
    }

    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.yhh, defpackage.sq0
    public final String toString() {
        String simpleName = eih.class.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("{error='");
        sb.append(this.b);
        sb.append("', message='");
        sb.append(this.c);
        nbh.G(sb, "', title='", this.e, "', description='", this.f);
        return qt4.q(sb, "', localizedMessage='", this.d, "'}");
    }
}
