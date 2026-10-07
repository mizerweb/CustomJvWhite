package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ow {
    public final cw d;
    public adg a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public ow(vbf vbfVar) {
        this.d = new cw(this, vbfVar);
    }

    public final void a(b29 b29Var, int i) {
        adg adgVarJ = b29Var.j(i);
        cw cwVar = this.d;
        cwVar.g(adgVarJ, 1.0f);
        cwVar.g(b29Var.j(i), -1.0f);
    }

    public final void b(adg adgVar, adg adgVar2, adg adgVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        cw cwVar = this.d;
        if (z) {
            cwVar.g(adgVar, 1.0f);
            cwVar.g(adgVar2, -1.0f);
            cwVar.g(adgVar3, -1.0f);
        } else {
            cwVar.g(adgVar, -1.0f);
            cwVar.g(adgVar2, 1.0f);
            cwVar.g(adgVar3, 1.0f);
        }
    }

    public final void c(adg adgVar, adg adgVar2, adg adgVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        cw cwVar = this.d;
        if (z) {
            cwVar.g(adgVar, 1.0f);
            cwVar.g(adgVar2, -1.0f);
            cwVar.g(adgVar3, 1.0f);
        } else {
            cwVar.g(adgVar, -1.0f);
            cwVar.g(adgVar2, 1.0f);
            cwVar.g(adgVar3, -1.0f);
        }
    }

    public adg d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final adg f(boolean[] zArr, adg adgVar) {
        int i;
        cw cwVar = this.d;
        int iD = cwVar.d();
        adg adgVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = cwVar.f(i2);
            if (f2 < 0.0f) {
                adg adgVarE = cwVar.e(i2);
                if ((zArr == null || !zArr[adgVarE.b]) && adgVarE != adgVar && (((i = adgVarE.l) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    adgVar2 = adgVarE;
                }
            }
        }
        return adgVar2;
    }

    public final void g(adg adgVar) {
        adg adgVar2 = this.a;
        cw cwVar = this.d;
        if (adgVar2 != null) {
            cwVar.g(adgVar2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fH = cwVar.h(adgVar, true) * (-1.0f);
        this.a = adgVar;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        int i = cwVar.h;
        for (int i2 = 0; i != -1 && i2 < cwVar.a; i2++) {
            float[] fArr = cwVar.g;
            fArr[i] = fArr[i] / fH;
            i = cwVar.f[i];
        }
    }

    public final void h(b29 b29Var, adg adgVar, boolean z) {
        if (adgVar.f) {
            cw cwVar = this.d;
            float fC = cwVar.c(adgVar);
            this.b = (adgVar.e * fC) + this.b;
            cwVar.h(adgVar, z);
            if (z) {
                adgVar.b(this);
            }
            if (cwVar.d() == 0) {
                this.e = true;
                b29Var.a = true;
            }
        }
    }

    public void i(b29 b29Var, ow owVar, boolean z) {
        cw cwVar = this.d;
        cwVar.getClass();
        float fC = cwVar.c(owVar.a);
        cwVar.h(owVar.a, z);
        cw cwVar2 = owVar.d;
        int iD = cwVar2.d();
        for (int i = 0; i < iD; i++) {
            adg adgVarE = cwVar2.e(i);
            cwVar.a(adgVarE, cwVar2.c(adgVarE) * fC, z);
        }
        this.b = (owVar.b * fC) + this.b;
        if (z) {
            owVar.a.b(this);
        }
        if (this.a == null || cwVar.d() != 0) {
            return;
        }
        this.e = true;
        b29Var.a = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            StringBuilder sbC = nbh.C(strConcat);
            sbC.append(this.b);
            strConcat = sbC.toString();
            z = true;
        } else {
            z = false;
        }
        cw cwVar = this.d;
        int iD = cwVar.d();
        for (int i = 0; i < iD; i++) {
            adg adgVarE = cwVar.e(i);
            if (adgVarE != null) {
                float f = cwVar.f(i);
                if (f != 0.0f) {
                    String string = adgVarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? strConcat.concat(string) : strConcat + f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
