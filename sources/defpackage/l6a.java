package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l6a extends m6a {
    public final String b() {
        String str = c().n;
        return str == null ? "unknown" : str;
    }

    public final nh6 c() {
        Object obj = this.e.f.get();
        if (obj != null) {
            return (nh6) obj;
        }
        ore.p("Required value was null.");
        return null;
    }

    public final long d() {
        return this.e.a() / 1000;
    }

    public final int e() {
        return c().i;
    }

    public final long f() {
        return c().c;
    }

    public final int g() {
        return c().k;
    }

    public final int h() {
        return c().l;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    public final String toString() {
        Float fValueOf;
        String str;
        String str2;
        String str3;
        String strK;
        String strK2;
        int i;
        int i2;
        long j = this.a;
        long j2 = this.b;
        float f = (j2 - j) / 1000.0f;
        String str4 = ((Object) gzl.a(j, j2)) + ", " + f + " s";
        n6a n6aVar = this.e;
        nh6 nh6Var = (nh6) n6aVar.f.get();
        long jA = n6aVar.a();
        Long lValueOf = Long.valueOf(jA);
        if (jA == -9223372036854775807L) {
            lValueOf = null;
        }
        Float fValueOf2 = lValueOf != null ? Float.valueOf(lValueOf.longValue() / 1000000.0f) : null;
        float f2 = f != 0.0f ? nh6Var.c / (1024.0f * f) : 0.0f;
        if (fValueOf2 == null) {
            fValueOf = null;
        } else {
            if (f == 0.0f) {
                fValueOf2 = null;
            }
            if (fValueOf2 != null) {
                fValueOf = Float.valueOf(fValueOf2.floatValue() / f);
            } else {
                fValueOf = null;
            }
        }
        String strF = gzl.f(n6aVar.a.b);
        String strC = gzl.c(n6aVar.c);
        w5a w5aVar = this.d;
        String str5 = w5aVar.c;
        String strD = gzl.d(w5aVar);
        String strE = gzl.e(this.d, "                  ");
        nh6 nh6Var2 = (nh6) n6aVar.f.get();
        StringBuilder sb = new StringBuilder();
        if (nh6Var2 != null) {
            sb.append("\n                  duration=");
            sb.append(nh6Var2.a / 1000.0f);
            sb.append(" s\n                  file_size=");
            sb.append(nh6Var2.c);
            sb.append(" bytes\n                  optimization=");
            sb.append(nh6Var2.p);
        } else {
            sb.append("\n                  duration=?\n                  file_size=?\n                  optimization=?");
        }
        String string = sb.toString();
        nh6 nh6Var3 = (nh6) n6aVar.f.get();
        StringBuilder sb2 = new StringBuilder("\n                      encoder=");
        if (nh6Var3 == null || (str = nh6Var3.g) == null) {
            str = "?";
        }
        sb2.append(str);
        sb2.append("\n                      channels=");
        sb2.append(nh6Var3 != null ? Integer.valueOf(nh6Var3.e) : "?");
        sb2.append("\n                      sample_rate=");
        sb2.append(nh6Var3 != null ? Integer.valueOf(nh6Var3.f) : "?");
        sb2.append("\n                      bitrate=");
        if (nh6Var3 == null || (i2 = nh6Var3.d) <= 0) {
            sb2.append("?");
        } else {
            sb2.append(i2 / 1000.0f);
            sb2.append(" Kbps");
        }
        String string2 = sb2.toString();
        nh6 nh6Var4 = (nh6) n6aVar.f.get();
        StringBuilder sb3 = new StringBuilder("\n                      encoder=");
        if (nh6Var4 == null || (str2 = nh6Var4.n) == null) {
            str2 = "?";
        }
        sb3.append(str2);
        sb3.append("\n                      frames=");
        sb3.append(nh6Var4 != null ? Integer.valueOf(nh6Var4.m) : "?");
        sb3.append("\n                      size=");
        sb3.append(nh6Var4 != null ? Integer.valueOf(nh6Var4.l) : "?");
        sb3.append('x');
        sb3.append(nh6Var4 != null ? Integer.valueOf(nh6Var4.k) : "?");
        sb3.append("\n                      bitrate_mode=");
        int i3 = n6aVar.d;
        Float f3 = fValueOf;
        float f4 = f2;
        if (i3 != 0) {
            str3 = string;
            if (i3 == 1) {
                strK = c0a.k(i3, "VBR(", ")");
            } else if (i3 != 2) {
                strK = i3 != 3 ? c0a.k(i3, "?(", ")") : c0a.k(i3, "CBR-FD(", ")");
            } else {
                strK = c0a.k(i3, "CBR(", ")");
            }
        } else {
            str3 = string;
            strK = c0a.k(i3, "CQ(", ")");
        }
        sb3.append(strK);
        sb3.append("\n                      bitrate=");
        if (nh6Var4 == null || (i = nh6Var4.i) <= 0) {
            sb3.append("?");
        } else {
            sb3.append(i / 1000000.0f);
            sb3.append(" Mbps");
        }
        sb3.append("\n                      hdr_mode=");
        int i4 = n6aVar.e;
        if (i4 == 0) {
            strK2 = c0a.k(i4, "Keep-HDR(", ")");
        } else if (i4 == 1) {
            strK2 = c0a.k(i4, "HDR-to-SDR_mc(", ")");
        } else if (i4 != 2) {
            strK2 = i4 != 3 ? c0a.k(i4, "?(", ")") : c0a.k(i4, "exp_HDR-as-SDR(", ")");
        } else {
            strK2 = c0a.k(i4, "HDR-to-SDR_gl(", ")");
        }
        sb3.append(strK2);
        sb3.append("\n                      hdr=");
        sb3.append(ex3.h(nh6Var4 != null ? nh6Var4.j : null));
        String string3 = sb3.toString();
        Object obj = f3 == null ? "?" : f3;
        StringBuilder sbQ = qv1.q("\n            MediaTransformResult.Success(\n              in={", strF, "\n              }\n              inputMedias={", strC, "\n              }\n              out=");
        nbh.G(sbQ, str5, "\n              request={", strD, "\n                  settings={");
        nbh.G(sbQ, strE, "\n                  }\n              }\n              took=", str4, "\n              out={");
        nbh.G(sbQ, str3, "\n                  audio={", string2, "\n                  }\n                  video={");
        sbQ.append(string3);
        sbQ.append("\n                  }\n              }\n              transform_speed=");
        sbQ.append(f4);
        sbQ.append(" Mbytes/s\n              transform_speed=");
        sbQ.append(obj);
        sbQ.append(" s/s\n            )\n        ");
        return s5h.x0(sbQ.toString());
    }
}
