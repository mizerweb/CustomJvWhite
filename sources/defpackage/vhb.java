package defpackage;

import org.webrtc.PeerConnectionFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class vhb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final PeerConnectionFactory.EnhancerKind e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Runnable m;
    public final int n;

    public vhb(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, eq0 eq0Var, int i6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = enhancerKind;
        this.f = str;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = z5;
        this.m = eq0Var;
        this.n = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhb)) {
            return false;
        }
        vhb vhbVar = (vhb) obj;
        return this.a == vhbVar.a && this.b == vhbVar.b && this.c == vhbVar.c && this.d == vhbVar.d && this.e == vhbVar.e && cqk.d(this.f, vhbVar.f) && this.g == vhbVar.g && this.h == vhbVar.h && this.i == vhbVar.i && this.j == vhbVar.j && this.k == vhbVar.k && this.l == vhbVar.l && cqk.d(this.m, vhbVar.m) && this.n == vhbVar.n;
    }

    public final int hashCode() {
        int iB = pwe.b(pwe.b(pwe.b(pwe.b(Boolean.hashCode(false) * 31, this.a), this.b), this.c), this.d);
        PeerConnectionFactory.EnhancerKind enhancerKind = this.e;
        int iHashCode = (iB + (enhancerKind == null ? 0 : enhancerKind.hashCode())) * 31;
        String str = this.f;
        int iB2 = pwe.b(spc.a(this.k, spc.a(this.j, spc.a(this.i, spc.a(this.h, spc.a(this.g, (iHashCode + (str == null ? 0 : str.hashCode())) * 31))))), this.l);
        Runnable runnable = this.m;
        int iHashCode2 = (iB2 + (runnable == null ? 0 : runnable.hashCode())) * 31;
        int i = this.n;
        return iHashCode2 + (i != 0 ? qt4.D(i) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sbB = zo5.B("NoiseSuppressorActiveState(noiseSuppressorStuttering=false, serversideBasic=", this.a, ", serversideAnn=", this.b, ", clientsidePlatform=");
        qt4.B(", clientsideAnn=", ", enhancerKind=", sbB, this.c, this.d);
        sbB.append(this.e);
        sbB.append(", filePath=");
        sbB.append(this.f);
        sbB.append(", inputSampleRate=");
        qt4.x(this.g, this.h, ", outputSampleRate=", ", fallbackTimeLimitMillis=", sbB);
        qt4.x(this.i, this.j, ", fallbackStutterCountMillis=", ", fallbackTimeframeMillis=", sbB);
        sbB.append(this.k);
        sbB.append(", logTimings=");
        sbB.append(this.l);
        sbB.append(", onNoiseSuppressorDisabledDueToStutter=");
        sbB.append(this.m);
        sbB.append(", kind=");
        int i = this.n;
        if (i == 1) {
            str = "NONE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "PIPELINE";
        } else {
            str = "BASELINE";
        }
        sbB.append(str);
        sbB.append(")");
        return sbB.toString();
    }
}
