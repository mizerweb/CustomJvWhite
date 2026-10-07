package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xa0 extends kih {
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public xa0(String str, String str2, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa0)) {
            return false;
        }
        xa0 xa0Var = (xa0) obj;
        return cqk.d(this.c, xa0Var.c) && cqk.d(this.d, xa0Var.d) && cqk.d(this.e, xa0Var.e) && cqk.d(this.f, xa0Var.f);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str = this.c;
        boolean z = !(str == null || str.length() == 0);
        String str2 = this.d;
        boolean z2 = !(str2 == null || str2.length() == 0);
        String str3 = this.e;
        boolean z3 = str3 == null || str3.length() == 0;
        StringBuilder sbB = zo5.B("Response(\n                |opusLinkExist=", z, ", \n                |m4aLinkExist=", z2, ", \n                |mp3LinkExist=");
        sbB.append(!z3);
        sbB.append("\n                |failoverHost='");
        sbB.append(this.f);
        sbB.append("'\n                |)");
        return s5h.y0(sbB.toString());
    }
}
