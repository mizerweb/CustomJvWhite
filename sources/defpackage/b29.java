package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b29 {
    public static boolean p = false;
    public static int q = 1000;
    public final xhd c;
    public ow[] f;
    public final vbf l;
    public ow o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public adg[] m = new adg[q];
    public int n = 0;

    public b29() {
        this.f = null;
        this.f = new ow[32];
        s();
        vbf vbfVar = new vbf();
        vbfVar.a = new rbd();
        vbfVar.b = new rbd();
        vbfVar.c = new adg[32];
        this.l = vbfVar;
        xhd xhdVar = new xhd(vbfVar);
        xhdVar.f = new adg[np0.m];
        xhdVar.g = 0;
        xhdVar.h = new fbc(xhdVar);
        this.c = xhdVar;
        this.o = new ow(vbfVar);
    }

    public static int n(Object obj) {
        adg adgVar = ((of4) obj).i;
        if (adgVar != null) {
            return (int) (adgVar.e + 0.5f);
        }
        return 0;
    }

    public final adg a(int i) {
        rbd rbdVar = (rbd) this.l.b;
        int i2 = rbdVar.b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = rbdVar.a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            rbdVar.b = i3;
            obj = obj2;
        }
        adg adgVar = (adg) obj;
        if (adgVar == null) {
            adgVar = new adg(i);
            adgVar.l = i;
        } else {
            adgVar.h();
            adgVar.l = i;
        }
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (adg[]) Arrays.copyOf(this.m, i6);
        }
        adg[] adgVarArr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        adgVarArr[i7] = adgVar;
        return adgVar;
    }

    public final void b(adg adgVar, adg adgVar2, int i, float f, adg adgVar3, adg adgVar4, int i2, int i3) {
        ow owVarL = l();
        if (adgVar2 == adgVar3) {
            owVarL.d.g(adgVar, 1.0f);
            owVarL.d.g(adgVar4, 1.0f);
            owVarL.d.g(adgVar2, -2.0f);
        } else {
            cw cwVar = owVarL.d;
            if (f == 0.5f) {
                cwVar.g(adgVar, 1.0f);
                owVarL.d.g(adgVar2, -1.0f);
                owVarL.d.g(adgVar3, -1.0f);
                owVarL.d.g(adgVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    owVarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                cwVar.g(adgVar, -1.0f);
                owVarL.d.g(adgVar2, 1.0f);
                owVarL.b = i;
            } else if (f >= 1.0f) {
                cwVar.g(adgVar4, -1.0f);
                owVarL.d.g(adgVar3, 1.0f);
                owVarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                cwVar.g(adgVar, f2 * 1.0f);
                owVarL.d.g(adgVar2, f2 * (-1.0f));
                owVarL.d.g(adgVar3, (-1.0f) * f);
                owVarL.d.g(adgVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    owVarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            owVarL.a(this, i3);
        }
        c(owVarL);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    public final void c(ow owVar) {
        boolean z;
        boolean z2;
        adg adgVarF;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (owVar.e) {
            z = false;
        } else {
            ArrayList arrayList = owVar.c;
            if (this.f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = owVar.d.d();
                    for (int i = 0; i < iD; i++) {
                        adg adgVarE = owVar.d.e(i);
                        if (adgVarE.c != -1 || adgVarE.f) {
                            arrayList.add(adgVarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            adg adgVar = (adg) arrayList.get(i2);
                            if (adgVar.f) {
                                owVar.h(this, adgVar, true);
                            } else {
                                owVar.i(this, this.f[adgVar.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (owVar.a != null && owVar.d.d() == 0) {
                    owVar.e = true;
                    this.a = true;
                }
            }
            if (owVar.e()) {
                return;
            }
            float f = owVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                owVar.b = f * (-1.0f);
                cw cwVar = owVar.d;
                int i3 = cwVar.h;
                for (int i4 = 0; i3 != -1 && i4 < cwVar.a; i4++) {
                    float[] fArr = cwVar.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = cwVar.f[i3];
                }
            }
            int iD2 = owVar.d.d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            adg adgVar2 = null;
            adg adgVar3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iD2) {
                float f5 = owVar.d.f(i5);
                adg adgVarE2 = owVar.d.e(i5);
                float f6 = f2;
                if (adgVarE2.l == 1) {
                    if (adgVar2 == null) {
                        if (adgVarE2.k <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        adgVar2 = adgVarE2;
                        f3 = f5;
                    } else {
                        if (f3 > f5) {
                            if (adgVarE2.k > 1) {
                                z4 = false;
                            }
                            adgVar2 = adgVarE2;
                            f3 = f5;
                        } else if (z4 || adgVarE2.k > 1) {
                        }
                        z4 = true;
                        adgVar2 = adgVarE2;
                        f3 = f5;
                    }
                } else if (adgVar2 == null && f5 < f6) {
                    if (adgVar3 == null) {
                        if (adgVarE2.k <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        adgVar3 = adgVarE2;
                        f4 = f5;
                    } else {
                        if (f4 > f5) {
                            if (adgVarE2.k > 1) {
                                z5 = false;
                            }
                            adgVar3 = adgVarE2;
                            f4 = f5;
                        } else if (z5 || adgVarE2.k > 1) {
                        }
                        z5 = true;
                        adgVar3 = adgVarE2;
                        f4 = f5;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = f2;
            if (adgVar2 == null) {
                adgVar2 = adgVar3;
            }
            if (adgVar2 == null) {
                z2 = true;
            } else {
                owVar.g(adgVar2);
                z2 = false;
            }
            if (owVar.d.d() == 0) {
                owVar.e = true;
            }
            if (z2) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                adg adgVarA = a(3);
                int i6 = this.b + 1;
                this.b = i6;
                this.i++;
                adgVarA.b = i6;
                vbf vbfVar = this.l;
                ((adg[]) vbfVar.c)[i6] = adgVarA;
                owVar.a = adgVarA;
                int i7 = this.j;
                h(owVar);
                if (this.j == i7 + 1) {
                    ow owVar2 = this.o;
                    owVar2.a = null;
                    owVar2.d.b();
                    for (int i8 = 0; i8 < owVar.d.d(); i8++) {
                        owVar2.d.a(owVar.d.e(i8), owVar.d.f(i8), true);
                    }
                    r(this.o);
                    if (adgVarA.c == -1) {
                        if (owVar.a == adgVarA && (adgVarF = owVar.f(null, adgVarA)) != null) {
                            owVar.g(adgVarF);
                        }
                        if (!owVar.e) {
                            owVar.a.k(this, owVar);
                        }
                        ((rbd) vbfVar.a).b(owVar);
                        this.j--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            adg adgVar4 = owVar.a;
            if (adgVar4 == null) {
                return;
            }
            if (adgVar4.l != 1 && owVar.b < f7) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(owVar);
    }

    public final void d(adg adgVar, int i) {
        int i2 = adgVar.c;
        if (i2 == -1) {
            adgVar.i(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                adg adgVar2 = ((adg[]) this.l.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            ow owVarL = l();
            owVarL.a = adgVar;
            float f = i;
            adgVar.e = f;
            owVarL.b = f;
            owVarL.e = true;
            c(owVarL);
            return;
        }
        ow owVar = this.f[i2];
        if (owVar.e) {
            owVar.b = i;
            return;
        }
        if (owVar.d.d() == 0) {
            owVar.e = true;
            owVar.b = i;
            return;
        }
        ow owVarL2 = l();
        if (i < 0) {
            owVarL2.b = i * (-1);
            owVarL2.d.g(adgVar, 1.0f);
        } else {
            owVarL2.b = i;
            owVarL2.d.g(adgVar, -1.0f);
        }
        c(owVarL2);
    }

    public final void e(adg adgVar, adg adgVar2, int i, int i2) {
        if (i2 == 8 && adgVar2.f && adgVar.c == -1) {
            adgVar.i(this, adgVar2.e + i);
            return;
        }
        ow owVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            owVarL.b = i;
        }
        cw cwVar = owVarL.d;
        if (z) {
            cwVar.g(adgVar, 1.0f);
            owVarL.d.g(adgVar2, -1.0f);
        } else {
            cwVar.g(adgVar, -1.0f);
            owVarL.d.g(adgVar2, 1.0f);
        }
        if (i2 != 8) {
            owVarL.a(this, i2);
        }
        c(owVarL);
    }

    public final void f(adg adgVar, adg adgVar2, int i, int i2) {
        ow owVarL = l();
        adg adgVarM = m();
        adgVarM.d = 0;
        owVarL.b(adgVar, adgVar2, adgVarM, i);
        if (i2 != 8) {
            owVarL.d.g(j(i2), (int) (owVarL.d.c(adgVarM) * (-1.0f)));
        }
        c(owVarL);
    }

    public final void g(adg adgVar, adg adgVar2, int i, int i2) {
        ow owVarL = l();
        adg adgVarM = m();
        adgVarM.d = 0;
        owVarL.c(adgVar, adgVar2, adgVarM, i);
        if (i2 != 8) {
            owVarL.d.g(j(i2), (int) (owVarL.d.c(adgVarM) * (-1.0f)));
        }
        c(owVarL);
    }

    public final void h(ow owVar) {
        int i;
        if (owVar.e) {
            owVar.a.i(this, owVar.b);
        } else {
            ow[] owVarArr = this.f;
            int i2 = this.j;
            owVarArr[i2] = owVar;
            adg adgVar = owVar.a;
            adgVar.c = i2;
            this.j = i2 + 1;
            adgVar.k(this, owVar);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                ow owVar2 = this.f[i3];
                if (owVar2 != null && owVar2.e) {
                    owVar2.a.i(this, owVar2.b);
                    ((rbd) this.l.a).b(owVar2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        ow[] owVarArr2 = this.f;
                        int i6 = i4 - 1;
                        ow owVar3 = owVarArr2[i4];
                        owVarArr2[i6] = owVar3;
                        adg adgVar2 = owVar3.a;
                        if (adgVar2.c == i4) {
                            adgVar2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            ow owVar = this.f[i];
            owVar.a.e = owVar.b;
        }
    }

    public final adg j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        adg adgVarA = a(4);
        float[] fArr = adgVarA.h;
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        adgVarA.b = i2;
        adgVarA.d = i;
        ((adg[]) this.l.c)[i2] = adgVarA;
        xhd xhdVar = this.c;
        xhdVar.h.b = adgVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[adgVarA.d] = 1.0f;
        xhdVar.j(adgVarA);
        return adgVarA;
    }

    public final adg k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof of4)) {
            return null;
        }
        of4 of4Var = (of4) obj;
        adg adgVar = of4Var.i;
        if (adgVar == null) {
            of4Var.h();
            adgVar = of4Var.i;
        }
        int i = adgVar.b;
        vbf vbfVar = this.l;
        if (i != -1 && i <= this.b && ((adg[]) vbfVar.c)[i] != null) {
            return adgVar;
        }
        if (i != -1) {
            adgVar.h();
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        adgVar.b = i2;
        adgVar.l = 1;
        ((adg[]) vbfVar.c)[i2] = adgVar;
        return adgVar;
    }

    public final ow l() {
        Object obj;
        vbf vbfVar = this.l;
        rbd rbdVar = (rbd) vbfVar.a;
        int i = rbdVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = rbdVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            rbdVar.b = i2;
        } else {
            obj = null;
        }
        ow owVar = (ow) obj;
        if (owVar == null) {
            return new ow(vbfVar);
        }
        owVar.a = null;
        owVar.d.b();
        owVar.b = 0.0f;
        owVar.e = false;
        return owVar;
    }

    public final adg m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        adg adgVarA = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        adgVarA.b = i;
        ((adg[]) this.l.c)[i] = adgVarA;
        return adgVarA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (ow[]) Arrays.copyOf(this.f, i);
        vbf vbfVar = this.l;
        vbfVar.c = (adg[]) Arrays.copyOf((adg[]) vbfVar.c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        xhd xhdVar = this.c;
        if (xhdVar.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(xhdVar);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(xhdVar);
                return;
            }
        }
        i();
    }

    public final void q(xhd xhdVar) {
        for (int i = 0; i < this.j; i++) {
            ow owVar = this.f[i];
            int i2 = 1;
            if (owVar.a.l != 1) {
                float f = 0.0f;
                if (owVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            ow owVar2 = this.f[i6];
                            if (owVar2.a.l != i2 && !owVar2.e && owVar2.b < f) {
                                int iD = owVar2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    adg adgVarE = owVar2.d.e(i8);
                                    float fC = owVar2.d.c(adgVarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = adgVarE.g[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = adgVarE.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            ow owVar3 = this.f[i4];
                            owVar3.a.c = -1;
                            owVar3.g(((adg[]) this.l.c)[i5]);
                            adg adgVar = owVar3.a;
                            adgVar.c = i4;
                            adgVar.k(this, owVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(xhdVar);
        i();
    }

    public final void r(ow owVar) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.i * 2) {
                return;
            }
            adg adgVar = owVar.a;
            if (adgVar != null) {
                this.h[adgVar.b] = true;
            }
            adg adgVarD = owVar.d(this.h);
            if (adgVarD != null) {
                boolean[] zArr = this.h;
                int i4 = adgVarD.b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (adgVarD != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.j) {
                    ow owVar2 = this.f[i5];
                    if (owVar2.a.l != 1 && !owVar2.e) {
                        cw cwVar = owVar2.d;
                        int i7 = cwVar.h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= cwVar.a) {
                                z = false;
                                break;
                            } else if (cwVar.e[i7] == adgVarD.b) {
                                z = true;
                                break;
                            } else {
                                i7 = cwVar.f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fC = owVar2.d.c(adgVarD);
                            if (fC < 0.0f) {
                                float f2 = (-owVar2.b) / fC;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    ow owVar3 = this.f[i6];
                    owVar3.a.c = -1;
                    owVar3.g(adgVarD);
                    adg adgVar2 = owVar3.a;
                    adgVar2.c = i6;
                    adgVar2.k(this, owVar3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            ow owVar = this.f[i];
            if (owVar != null) {
                ((rbd) this.l.a).b(owVar);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        vbf vbfVar;
        int i = 0;
        while (true) {
            vbfVar = this.l;
            adg[] adgVarArr = (adg[]) vbfVar.c;
            if (i >= adgVarArr.length) {
                break;
            }
            adg adgVar = adgVarArr[i];
            if (adgVar != null) {
                adgVar.h();
            }
            i++;
        }
        rbd rbdVar = (rbd) vbfVar.b;
        adg[] adgVarArr2 = this.m;
        int length = this.n;
        rbdVar.getClass();
        if (length > adgVarArr2.length) {
            length = adgVarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            adg adgVar2 = adgVarArr2[i2];
            int i3 = rbdVar.b;
            Object[] objArr = rbdVar.a;
            if (i3 < objArr.length) {
                objArr[i3] = adgVar2;
                rbdVar.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((adg[]) vbfVar.c, (Object) null);
        this.b = 0;
        xhd xhdVar = this.c;
        xhdVar.g = 0;
        xhdVar.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            ow owVar = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new ow(vbfVar);
    }
}
