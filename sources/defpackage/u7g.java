package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u7g {
    public final String a;
    public final int b;
    public final boolean c;
    public final double d;
    public final int e;
    public final int f;
    public final int g;
    public final Integer h;
    public final int i;
    public final int j;

    public u7g(String str, int i, boolean z, double d, int i2, int i3, int i4, int i5, int i6, int i7) {
        z = (i7 & 4) != 0 ? true : z;
        d = (i7 & 8) != 0 ? 1.0d : d;
        i2 = (i7 & 16) != 0 ? 0 : i2;
        i3 = (i7 & 32) != 0 ? 0 : i3;
        i4 = (i7 & 64) != 0 ? 0 : i4;
        Integer num = (i7 & np0.m) != 0 ? null : 1;
        i5 = (i7 & np0.n) != 0 ? 0 : i5;
        i6 = (i7 & np0.o) != 0 ? 0 : i6;
        str.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = num;
        this.i = i5;
        this.j = i6;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        int i = this.i;
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        ylc ylcVar = new ylc("max-width", numValueOf);
        int i2 = this.j;
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i2 <= 0) {
            numValueOf2 = null;
        }
        ylc ylcVar2 = new ylc("max-height", numValueOf2);
        int i3 = this.g;
        Integer numValueOf3 = Integer.valueOf(i3);
        if (i3 <= 0) {
            numValueOf3 = null;
        }
        ylc ylcVar3 = new ylc("max-fps", numValueOf3);
        int i4 = this.e;
        for (ylc ylcVar4 : xw3.P0(ylcVar, ylcVar2, ylcVar3, new ylc("max-br", i4 > 0 ? Integer.valueOf(i4) : null))) {
            String str = (String) ylcVar4.a;
            Integer num = (Integer) ylcVar4.b;
            if (num != null) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str + "=" + num);
            }
        }
        String string = sb.toString();
        int length = string.length();
        String str2 = this.a;
        int i5 = this.b;
        if (length <= 0) {
            return qv1.l("a=rid:", str2, " ", pye.b(i5));
        }
        StringBuilder sbQ = qv1.q("a=rid:", str2, " ", pye.b(i5), " ");
        sbQ.append(string);
        return sbQ.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7g)) {
            return false;
        }
        u7g u7gVar = (u7g) obj;
        return cqk.d(this.a, u7gVar.a) && this.b == u7gVar.b && this.c == u7gVar.c && Double.compare(this.d, u7gVar.d) == 0 && this.e == u7gVar.e && this.f == u7gVar.f && this.g == u7gVar.g && cqk.d(this.h, u7gVar.h) && this.i == u7gVar.i && this.j == u7gVar.j;
    }

    public final int hashCode() {
        int iA = spc.a(this.g, spc.a(this.f, spc.a(this.e, tfb.a(pwe.b(c0a.f(this.b, this.a.hashCode() * 31, 31), this.c), this.d))));
        Integer num = this.h;
        return Integer.hashCode(this.j) + spc.a(this.i, (iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sbV = qt4.v("SimulcastLayerInfo(rid=", this.a, ", direction=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "RECV";
        } else {
            str = "SEND";
        }
        sbV.append(str);
        sbV.append(", isActive=");
        sbV.append(this.c);
        sbV.append(", resolutionScale=");
        sbV.append(this.d);
        sbV.append(", maxBitrate=");
        sbV.append(this.e);
        zo5.C(this.f, this.g, ", minBitrate=", ", maxFps=", sbV);
        sbV.append(", numTemporalLayers=");
        sbV.append(this.h);
        sbV.append(", width=");
        sbV.append(this.i);
        return qv1.o(sbV, ", height=", this.j, ")");
    }
}
