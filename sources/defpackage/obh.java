package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes2.dex */
public final class obh {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Range i;
    public final boolean j;

    public obh(int i, int i2, boolean z, int i3, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = range;
        this.j = z6;
    }

    public static obh a(obh obhVar, boolean z, Range range, int i) {
        int i2 = obhVar.a;
        int i3 = obhVar.b;
        boolean z2 = obhVar.c;
        int i4 = obhVar.d;
        boolean z3 = obhVar.e;
        boolean z4 = obhVar.f;
        boolean z5 = obhVar.g;
        if ((i & np0.n) != 0) {
            range = obhVar.i;
        }
        return new obh(i2, i3, z2, i4, z3, z4, z5, z, range, obhVar.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obh)) {
            return false;
        }
        obh obhVar = (obh) obj;
        return this.a == obhVar.a && this.b == obhVar.b && this.c == obhVar.c && this.d == obhVar.d && this.e == obhVar.e && this.f == obhVar.f && this.g == obhVar.g && this.h == obhVar.h && cqk.d(this.i, obhVar.i) && this.j == obhVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + nbh.n(nbh.n(nbh.n(nbh.n(c0a.f(this.d, nbh.n(zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FeatureSettings(cameraMode=");
        sb.append(this.a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.b);
        sb.append(", hasVideoCapture=");
        sb.append(this.c);
        sb.append(", videoStabilization=");
        int i = this.d;
        if (i == 1) {
            str = "UNSPECIFIED";
        } else if (i == 2) {
            str = "OFF";
        } else if (i != 3) {
            str = i != 4 ? "null" : "PREVIEW";
        } else {
            str = "ON";
        }
        sb.append(str);
        sb.append(", isUltraHdrOn=");
        sb.append(this.e);
        sb.append(", isHighSpeedOn=");
        sb.append(this.f);
        sb.append(", isFeatureComboInvocation=");
        sb.append(this.g);
        sb.append(", requiresFeatureComboQuery=");
        sb.append(this.h);
        sb.append(", targetFpsRange=");
        sb.append(this.i);
        sb.append(", isStrictFpsRequired=");
        return c0a.p(sb, this.j, ')');
    }
}
