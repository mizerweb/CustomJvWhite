package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ue5 extends te5 {
    public final boolean e;
    public final pe5 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final int w;

    /* JADX WARN: Code duplicated, block: B:120:0x0179  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    public ue5(int i, hyh hyhVar, int i2, pe5 pe5Var, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iF;
        int i6;
        b87 b87Var;
        int i7;
        int i8;
        int i9;
        b87 b87Var2;
        int i10;
        int i11;
        int i12;
        super(i, hyhVar, i2);
        this.f = pe5Var;
        boolean z4 = pe5Var.x0;
        c98 c98Var = pe5Var.m;
        c98 c98Var2 = pe5Var.o;
        int i13 = z4 ? 24 : 16;
        int i14 = 0;
        this.s = false;
        if (!z || (((i10 = (b87Var2 = this.d).u) != -1 && i10 > pe5Var.a) || ((i11 = b87Var2.v) != -1 && i11 > pe5Var.b))) {
            z2 = false;
        } else {
            float f = b87Var2.y;
            if ((f == -1.0f || f <= pe5Var.c) && ((i12 = b87Var2.j) == -1 || i12 <= pe5Var.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.e = z2;
        if (!z || (((i7 = (b87Var = this.d).u) != -1 && i7 < pe5Var.e) || ((i8 = b87Var.v) != -1 && i8 < pe5Var.f))) {
            z3 = false;
        } else {
            float f2 = b87Var.y;
            if ((f2 == -1.0f || f2 >= pe5Var.g) && ((i9 = b87Var.j) == -1 || i9 >= pe5Var.h)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.g = z3;
        this.h = ks0.k(i3, false);
        b87 b87Var3 = this.d;
        float f3 = b87Var3.y;
        this.i = f3 != -1.0f && f3 >= 10.0f;
        this.j = b87Var3.j;
        this.k = b87Var3.b();
        int i15 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i15 >= c98Var2.size()) {
                iF = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iF = ve5.f(this.d, (String) c98Var2.get(i15), false);
                if (iF > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.m = i15;
        this.n = iF;
        int i16 = this.d.f;
        int i17 = pe5Var.p;
        ohc ohcVar = ve5.k;
        this.o = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
        int i18 = this.d.f;
        this.q = i18 == 0 || (i18 & 1) != 0;
        this.r = ve5.f(this.d, str, ve5.i(str) == null);
        for (int i19 = 0; i19 < c98Var.size(); i19++) {
            String str2 = this.d.n;
            if (str2 != null && str2.equals(c98Var.get(i19))) {
                i5 = i19;
                break;
            }
        }
        this.l = i5;
        this.p = ve5.d(this.d, pe5Var.n);
        this.u = (i3 & 384) == 128;
        this.v = (i3 & 64) == 64;
        b87 b87Var4 = this.d;
        String str3 = b87Var4.n;
        if (str3 != null) {
            i6 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.w = i6;
        boolean z5 = this.e;
        pe5 pe5Var2 = this.f;
        if ((b87Var4.f & 16384) == 0 && ks0.k(i3, pe5Var2.B0) && (z5 || pe5Var2.w0)) {
            i14 = (!ks0.k(i3, false) || !this.g || !z5 || b87Var4.j == -1 || pe5Var2.G || pe5Var2.F || (i13 & i3) == 0) ? 1 : 2;
        }
        this.t = i14;
    }

    public static int d(ue5 ue5Var, ue5 ue5Var2) {
        a54 a54VarD = a54.a.d(ue5Var.h, ue5Var2.h);
        Integer numValueOf = Integer.valueOf(ue5Var.m);
        Integer numValueOf2 = Integer.valueOf(ue5Var2.m);
        qpe qpeVar = qpe.a;
        a54 a54VarC = a54VarD.c(numValueOf, numValueOf2, qpeVar).a(ue5Var.n, ue5Var2.n).a(ue5Var.o, ue5Var2.o).c(Integer.valueOf(ue5Var.p), Integer.valueOf(ue5Var2.p), qpeVar).d(ue5Var.q, ue5Var2.q).a(ue5Var.r, ue5Var2.r).d(ue5Var.i, ue5Var2.i).d(ue5Var.e, ue5Var2.e).d(ue5Var.g, ue5Var2.g).c(Integer.valueOf(ue5Var.l), Integer.valueOf(ue5Var2.l), qpeVar);
        boolean z = ue5Var.u;
        a54 a54VarD2 = a54VarC.d(z, ue5Var2.u);
        boolean z2 = ue5Var.v;
        a54 a54VarD3 = a54VarD2.d(z2, ue5Var2.v);
        if (z && z2) {
            a54VarD3 = a54VarD3.a(ue5Var.w, ue5Var2.w);
        }
        return a54VarD3.f();
    }

    @Override // defpackage.te5
    public final int a() {
        return this.t;
    }

    @Override // defpackage.te5
    public final boolean b(te5 te5Var) {
        ue5 ue5Var = (ue5) te5Var;
        if (!this.s && !Objects.equals(this.d.n, ue5Var.d.n)) {
            return false;
        }
        this.f.getClass();
        return this.u == ue5Var.u && this.v == ue5Var.v;
    }
}
