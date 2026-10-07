package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xhd extends ow {
    public adg[] f;
    public int g;
    public fbc h;

    @Override // defpackage.ow
    public final adg d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.g; i2++) {
            adg[] adgVarArr = this.f;
            adg adgVar = adgVarArr[i2];
            if (!zArr[adgVar.b]) {
                fbc fbcVar = this.h;
                fbcVar.b = adgVar;
                int i3 = 8;
                if (i != -1) {
                    adg adgVar2 = adgVarArr[i];
                    while (i3 >= 0) {
                        float f = adgVar2.h[i3];
                        float f2 = ((adg) fbcVar.b).h[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((adg) fbcVar.b).h[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.ow
    public final boolean e() {
        return this.g == 0;
    }

    @Override // defpackage.ow
    public final void i(b29 b29Var, ow owVar, boolean z) {
        adg adgVar = owVar.a;
        if (adgVar == null) {
            return;
        }
        float[] fArr = adgVar.h;
        cw cwVar = owVar.d;
        int iD = cwVar.d();
        for (int i = 0; i < iD; i++) {
            adg adgVarE = cwVar.e(i);
            float f = cwVar.f(i);
            fbc fbcVar = this.h;
            fbcVar.b = adgVarE;
            if (adgVarE.a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((adg) fbcVar.b).h;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((adg) fbcVar.b).h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((xhd) fbcVar.c).k((adg) fbcVar.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((adg) fbcVar.b).h[i3] = f4;
                    } else {
                        ((adg) fbcVar.b).h[i3] = 0.0f;
                    }
                }
                j(adgVarE);
            }
            this.b = (owVar.b * f) + this.b;
        }
        k(adgVar);
    }

    public final void j(adg adgVar) {
        int i = this.g + 1;
        adg[] adgVarArr = this.f;
        if (i > adgVarArr.length) {
            adg[] adgVarArr2 = (adg[]) Arrays.copyOf(adgVarArr, adgVarArr.length * 2);
            this.f = adgVarArr2;
        }
        adg[] adgVarArr3 = this.f;
        int i2 = this.g;
        adgVarArr3[i2] = adgVar;
        int i3 = i2 + 1;
        this.g = i3;
        if (i3 > 1) {
            int i4 = adgVar.b;
        }
        adgVar.a = true;
        adgVar.a(this);
    }

    public final void k(adg adgVar) {
        int i = 0;
        while (i < this.g) {
            if (this.f[i] == adgVar) {
                while (true) {
                    int i2 = this.g;
                    if (i >= i2 - 1) {
                        this.g = i2 - 1;
                        adgVar.a = false;
                        return;
                    } else {
                        adg[] adgVarArr = this.f;
                        int i3 = i + 1;
                        adgVarArr[i] = adgVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.ow
    public final String toString() {
        fbc fbcVar = this.h;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.g; i++) {
            fbcVar.b = this.f[i];
            str = str + fbcVar + " ";
        }
        return str;
    }
}
