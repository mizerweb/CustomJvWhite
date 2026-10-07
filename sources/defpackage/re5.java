package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class re5 extends te5 implements Comparable {
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;

    public re5(int i, hyh hyhVar, int i2, pe5 pe5Var, int i3, String str, String str2) {
        int iF;
        super(i, hyhVar, i2);
        int i4 = 0;
        this.f = ks0.k(i3, false);
        int i5 = this.d.e;
        int i6 = pe5Var.C;
        c98 c98Var = pe5Var.y;
        int i7 = i5 & (~i6);
        this.g = (i7 & 1) != 0;
        this.h = (i7 & 2) != 0;
        c98 c98VarR = str2 != null ? c98.r(str2) : c98Var.isEmpty() ? c98.r("") : c98Var;
        int i8 = 0;
        while (true) {
            if (i8 >= c98VarR.size()) {
                iF = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iF = ve5.f(this.d, (String) c98VarR.get(i8), pe5Var.D);
                if (iF > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.i = i8;
        this.j = iF;
        int i9 = str2 != null ? 1088 : pe5Var.A;
        int i10 = this.d.f;
        ohc ohcVar = ve5.k;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.k = iBitCount;
        b87 b87Var = this.d;
        this.n = (1088 & b87Var.f) != 0;
        int iD = ve5.d(b87Var, pe5Var.z);
        this.l = iD;
        int iF2 = ve5.f(this.d, str, ve5.i(str) == null);
        this.m = iF2;
        boolean z = iF > 0 || (c98Var.isEmpty() && iBitCount > 0) || ((c98Var.isEmpty() && iD != Integer.MAX_VALUE) || this.g || ((this.h && iF2 > 0) || pe5Var.x));
        if (ks0.k(i3, pe5Var.B0) && z) {
            i4 = 1;
        }
        this.e = i4;
    }

    @Override // defpackage.te5
    public final int a() {
        return this.e;
    }

    @Override // defpackage.te5
    public final /* bridge */ /* synthetic */ boolean b(te5 te5Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(re5 re5Var) {
        a54 a54VarD = a54.a.d(this.f, re5Var.f);
        Integer numValueOf = Integer.valueOf(this.i);
        Integer numValueOf2 = Integer.valueOf(re5Var.i);
        Comparator comparator = qpe.a;
        a54 a54VarC = a54VarD.c(numValueOf, numValueOf2, comparator);
        int i = re5Var.j;
        int i2 = this.j;
        a54 a54VarA = a54VarC.a(i2, i);
        int i3 = re5Var.k;
        int i4 = this.k;
        a54 a54VarD2 = a54VarA.a(i4, i3).c(Integer.valueOf(this.l), Integer.valueOf(re5Var.l), comparator).d(this.g, re5Var.g);
        Boolean boolValueOf = Boolean.valueOf(this.h);
        Boolean boolValueOf2 = Boolean.valueOf(re5Var.h);
        if (i2 == 0) {
            comparator = lbb.a;
        }
        a54 a54VarA2 = a54VarD2.c(boolValueOf, boolValueOf2, comparator).a(this.m, re5Var.m);
        if (i4 == 0) {
            a54VarA2 = a54VarA2.e(this.n, re5Var.n);
        }
        return a54VarA2.f();
    }
}
