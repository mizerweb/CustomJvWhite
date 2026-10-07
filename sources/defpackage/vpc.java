package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vpc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final ypc f;
    public final int g;
    public final int h;
    public final String i;

    public vpc(int i, int i2, int i3, int i4, String str, ypc ypcVar, int i5, int i6, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = ypcVar;
        this.g = i5;
        this.h = i6;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !vpc.class.equals(obj.getClass())) {
            return false;
        }
        vpc vpcVar = (vpc) obj;
        if (this.a == vpcVar.a && this.b == vpcVar.b && this.c == vpcVar.c && this.d == vpcVar.d && this.h == vpcVar.h && cqk.d(this.i, vpcVar.i) && cqk.d(this.f, vpcVar.f) && this.g == vpcVar.g) {
            return cqk.d(this.e, vpcVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.h) * 31;
        String str = this.e;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        ypc ypcVar = this.f;
        int iHashCode2 = (((iHashCode + (ypcVar != null ? ypcVar.a.hashCode() : 0)) * 31) + this.g) * 31;
        String str2 = this.i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("PeerVideoSettings{maxDimension=", this.a, ", initialMaxDimension=", this.b, ", maxBitrateK=");
        qt4.x(this.c, this.d, ", maxFrameRate=", ", temporalLayersCount=", sbP);
        sbP.append(this.h);
        sbP.append(", degradationPreference='");
        sbP.append(this.e);
        sbP.append("', bitrateTable=");
        sbP.append(this.f);
        sbP.append(", mediaAdaptationScale=");
        sbP.append(this.g);
        sbP.append(", source='");
        return zo5.w(sbP, this.i, "'}");
    }
}
