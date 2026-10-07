package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mxf implements t50 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final g58 g;
    public final long h;
    public final String i;
    public final boolean j;
    public final boolean k;

    public mxf(long j, String str, String str2, String str3, String str4, String str5, g58 g58Var, long j2, String str6, boolean z, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = g58Var;
        this.h = j2;
        this.i = str6;
        this.j = z;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxf)) {
            return false;
        }
        mxf mxfVar = (mxf) obj;
        return this.a == mxfVar.a && cqk.d(this.b, mxfVar.b) && cqk.d(this.c, mxfVar.c) && cqk.d(this.d, mxfVar.d) && cqk.d(this.e, mxfVar.e) && cqk.d(this.f, mxfVar.f) && cqk.d(this.g, mxfVar.g) && this.h == mxfVar.h && cqk.d(this.i, mxfVar.i) && this.j == mxfVar.j && this.k == mxfVar.k;
    }

    public final int hashCode() {
        int iD = zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        g58 g58Var = this.g;
        int iG = qt4.g((iHashCode4 + (g58Var == null ? 0 : g58Var.hashCode())) * 31, 31, this.h);
        String str5 = this.i;
        return Boolean.hashCode(this.k) + nbh.n((iG + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "ShareAttachModel(shareId=", ", url=", this.b);
        nbh.G(sbT, ", host=", this.c, ", title=", this.d);
        nbh.G(sbT, ", description=", this.e, ", embedUrl=", this.f);
        sbT.append(", previewConfig=");
        sbT.append(this.g);
        sbT.append(", messageId=");
        qv1.s(this.h, ", attachLocalId=", this.i, sbT);
        qv1.v(", isContentLevel=", ", hasLiveStream=", sbT, this.j, this.k);
        sbT.append(")");
        return sbT.toString();
    }
}
