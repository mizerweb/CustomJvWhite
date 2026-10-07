package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class le5 extends te5 implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final pe5 h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final boolean r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    /* JADX WARN: Code duplicated, block: B:120:0x0190  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0145  */
    /* JADX WARN: Code duplicated, block: B:90:0x0147  */
    public le5(int i, hyh hyhVar, int i2, pe5 pe5Var, int i3, boolean z, ke5 ke5Var, int i4) {
        int i5;
        int iF;
        boolean z2;
        int iF2;
        boolean z3;
        boolean z4;
        boolean z5;
        super(i, hyhVar, i2);
        this.h = pe5Var;
        boolean z6 = pe5Var.z0;
        c98 c98Var = pe5Var.v;
        c98 c98Var2 = pe5Var.q;
        int i6 = z6 ? 24 : 16;
        int i7 = 0;
        this.n = false;
        this.g = ve5.i(this.d.d);
        this.i = ks0.k(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= c98Var2.size()) {
                iF = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iF = ve5.f(this.d, (String) c98Var2.get(i8), false);
                if (iF > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.k = i8;
        this.j = iF;
        int i9 = this.d.f;
        int i10 = pe5Var.s;
        this.l = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.m = ve5.d(this.d, pe5Var.r);
        b87 b87Var = this.d;
        int i11 = b87Var.f;
        this.o = i11 == 0 || (i11 & 1) != 0;
        this.r = (b87Var.e & 1) != 0;
        String str = b87Var.n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.y = z2;
        int i12 = b87Var.F;
        this.s = i12;
        this.t = b87Var.G;
        int i13 = b87Var.j;
        this.u = i13;
        this.f = (i13 == -1 || i13 <= pe5Var.u) && (i12 == -1 || i12 <= pe5Var.t) && ke5Var.apply(b87Var);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            strArrSplit[i14] = vqi.Y(strArrSplit[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 < strArrSplit.length) {
                iF2 = ve5.f(this.d, strArrSplit[i15], false);
                if (iF2 <= 0) {
                    i15++;
                }
            } else {
                iF2 = 0;
                i15 = Integer.MAX_VALUE;
            }
        }
        this.p = i15;
        this.q = iF2;
        for (int i16 = 0; i16 < c98Var.size(); i16++) {
            String str2 = this.d.n;
            if (str2 != null && str2.equals(c98Var.get(i16))) {
                i5 = i16;
                this.v = i5;
                if ((i3 & 384) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.w = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.x = z4;
                b87 b87Var2 = this.d;
                boolean z7 = this.f;
                pe5 pe5Var2 = this.h;
                z5 = pe5Var2.B0;
                pyh pyhVar = pe5Var2.w;
                if (ks0.k(i3, z5) && ((z7 || pe5Var2.y0) && (pyhVar.a != 2 || ve5.j(pe5Var2, i3, b87Var2)))) {
                    if (ks0.k(i3, false) || !z7 || b87Var2.j == -1 || pe5Var2.G || pe5Var2.F || ((!pe5Var2.C0 && z) || pyhVar.a == 2 || (i6 & i3) == 0)) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                }
                this.e = i7;
            }
        }
        this.v = i5;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.w = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.x = z4;
        b87 b87Var3 = this.d;
        boolean z8 = this.f;
        pe5 pe5Var3 = this.h;
        z5 = pe5Var3.B0;
        pyh pyhVar2 = pe5Var3.w;
        if (ks0.k(i3, z5)) {
            if (ks0.k(i3, false)) {
                i7 = 1;
            } else {
                i7 = 1;
            }
        }
        this.e = i7;
    }

    @Override // defpackage.te5
    public final int a() {
        return this.e;
    }

    @Override // defpackage.te5
    public final boolean b(te5 te5Var) {
        int i;
        String str;
        le5 le5Var = (le5) te5Var;
        b87 b87Var = le5Var.d;
        this.h.getClass();
        b87 b87Var2 = this.d;
        int i2 = b87Var2.F;
        if (i2 == -1 || i2 != b87Var.F) {
            return false;
        }
        return (this.n || ((str = b87Var2.n) != null && TextUtils.equals(str, b87Var.n))) && (i = b87Var2.G) != -1 && i == b87Var.G && this.w == le5Var.w && this.x == le5Var.x;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(le5 le5Var) {
        boolean z = this.i;
        boolean z2 = this.f;
        ohc ohcVarA = (z2 && z) ? ve5.k : ve5.k.a();
        boolean z3 = le5Var.i;
        int i = le5Var.u;
        a54 a54VarD = a54.a.d(z, z3);
        Integer numValueOf = Integer.valueOf(this.k);
        Integer numValueOf2 = Integer.valueOf(le5Var.k);
        qpe qpeVar = qpe.a;
        a54 a54VarC = a54VarD.c(numValueOf, numValueOf2, qpeVar).a(this.j, le5Var.j).a(this.l, le5Var.l).c(Integer.valueOf(this.m), Integer.valueOf(le5Var.m), qpeVar).d(this.r, le5Var.r).d(this.o, le5Var.o).c(Integer.valueOf(this.p), Integer.valueOf(le5Var.p), qpeVar).a(this.q, le5Var.q).d(z2, le5Var.f).c(Integer.valueOf(this.v), Integer.valueOf(le5Var.v), qpeVar);
        boolean z4 = this.h.F;
        int i2 = this.u;
        if (z4) {
            a54VarC = a54VarC.c(Integer.valueOf(i2), Integer.valueOf(i), ve5.k.a());
        }
        a54 a54VarC2 = a54VarC.d(this.w, le5Var.w).d(this.x, le5Var.x).d(this.y, le5Var.y).c(Integer.valueOf(this.s), Integer.valueOf(le5Var.s), ohcVarA).c(Integer.valueOf(this.t), Integer.valueOf(le5Var.t), ohcVarA);
        if (Objects.equals(this.g, le5Var.g)) {
            a54VarC2 = a54VarC2.c(Integer.valueOf(i2), Integer.valueOf(i), ohcVarA);
        }
        return a54VarC2.f();
    }
}
