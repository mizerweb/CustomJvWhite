package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d70 {
    public static final d70 w = new d70(new z60());
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final String i;
    public final String j;
    public final byte[] k;
    public final byte[] l;
    public final long m;
    public final b70 n;
    public final String o;
    public final c70 p;
    public final boolean q;
    public final int r;
    public final int s;
    public final byte[] t;
    public final String u;
    public final x60 v;

    public d70(z60 z60Var) {
        this.a = z60Var.a;
        this.b = z60Var.s;
        this.c = z60Var.b;
        this.d = z60Var.c;
        this.e = z60Var.d;
        this.f = z60Var.e;
        this.g = z60Var.f;
        this.h = z60Var.g;
        this.i = z60Var.h;
        this.j = z60Var.i;
        this.k = z60Var.j;
        this.l = z60Var.k;
        this.m = z60Var.l;
        this.n = z60Var.m;
        this.o = z60Var.n;
        this.p = z60Var.o;
        this.q = z60Var.p;
        this.r = z60Var.q;
        this.s = z60Var.r;
        this.t = z60Var.t;
        this.u = z60Var.u;
        this.v = z60Var.v;
    }

    public final z60 a() {
        z60 z60Var = new z60();
        z60Var.a = this.a;
        z60Var.s = this.b;
        z60Var.b = this.c;
        z60Var.c = this.d;
        z60Var.d = this.e;
        z60Var.e = this.f;
        z60Var.f = this.g;
        z60Var.g = this.h;
        z60Var.h = this.i;
        z60Var.i = this.j;
        z60Var.j = this.k;
        z60Var.k = this.l;
        z60Var.l = this.m;
        z60Var.m = this.n;
        z60Var.n = this.o;
        z60Var.o = this.p;
        z60Var.p = this.q;
        z60Var.q = this.r;
        z60Var.r = this.s;
        z60Var.t = this.t;
        z60Var.u = this.u;
        z60Var.v = this.v;
        return z60Var;
    }

    public final String toString() {
        String strF = qt4.F(this.b);
        byte[] bArr = this.t;
        int length = bArr != null ? bArr.length : -1;
        String string = Arrays.toString(this.k);
        String string2 = Arrays.toString(this.l);
        String strValueOf = String.valueOf(this.n);
        String strValueOf2 = String.valueOf(this.p);
        x60 x60Var = this.v;
        String strName = x60Var != null ? x60Var.name() : null;
        StringBuilder sbT = qt4.t(this.a, "Video{videoId=", ", videoType=", strF);
        qt4.z(this.c, ", duration=", ", size=", sbT);
        c0a.w(sbT, this.d, ", wave.size=", length);
        sbT.append(", thumbnail='");
        sbT.append(this.e);
        sbT.append("', width=");
        sbT.append(this.f);
        sbT.append(", height=");
        sbT.append(this.g);
        sbT.append(", live=");
        sbT.append(this.h);
        nbh.G(sbT, ", embedUrl='", this.i, "', externalSiteName='", this.j);
        nbh.G(sbT, "', previewData=", string, ", thumbhashData=", string2);
        qt4.z(this.m, ", startTime=", ", convertOptions=", sbT);
        nbh.G(sbT, strValueOf, ", token='", this.o, "', videoCollage=");
        sbT.append(strValueOf2);
        sbT.append(", ignoreAutoplay=");
        sbT.append(this.q);
        sbT.append(", audioTrackIndex=");
        qt4.x(this.r, this.s, ", audioGroupIndex=", ", transcription =", sbT);
        return nbh.y(sbT, this.u, ", transcriptionStatus =", strName, "}");
    }
}
