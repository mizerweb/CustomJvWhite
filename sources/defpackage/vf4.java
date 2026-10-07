package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class vf4 {
    public final wf4 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ wf4 h;

    public vf4(wf4 wf4Var, wf4 wf4Var2) {
        this.h = wf4Var;
        this.a = wf4Var2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(hg4 hg4Var, mt0 mt0Var) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z;
        int baseline;
        int i;
        of4 of4Var = hg4Var.J;
        of4 of4Var2 = hg4Var.H;
        if (hg4Var.f0 == 8) {
            mt0Var.e = 0;
            mt0Var.f = 0;
            mt0Var.g = 0;
            return;
        }
        if (hg4Var.S == null) {
            return;
        }
        int i2 = mt0Var.a;
        int i3 = mt0Var.b;
        int i4 = mt0Var.c;
        int i5 = mt0Var.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = hg4Var.e0;
        int iD = qt4.D(i2);
        if (iD == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iD == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (iD == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = hg4Var.r == 1;
            int i8 = mt0Var.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == hg4Var.i();
                if (mt0Var.j == 2 || !z2 || ((z2 && z3) || hg4Var.y())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hg4Var.o(), 1073741824);
                }
            }
        } else if (iD != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = of4Var2 != null ? of4Var2.g : 0;
            if (of4Var != null) {
                i10 += of4Var.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iD2 = qt4.D(i3);
        if (iD2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iD2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (iD2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = hg4Var.s == 1;
            int i11 = mt0Var.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == hg4Var.o();
                if (mt0Var.j == 2 || !z4 || ((z4 && z5) || hg4Var.z())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hg4Var.i(), 1073741824);
                }
            }
        } else if (iD2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = of4Var2 != null ? hg4Var.I.g : 0;
            if (of4Var != null) {
                i13 += hg4Var.K.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        ig4 ig4Var = (ig4) hg4Var.S;
        wf4 wf4Var = this.h;
        if (ig4Var != null && sb8.q(wf4Var.i, np0.n) && view.getMeasuredWidth() == hg4Var.o() && view.getMeasuredWidth() < ig4Var.o() && view.getMeasuredHeight() == hg4Var.i() && view.getMeasuredHeight() < ig4Var.i() && view.getBaseline() == hg4Var.Z && !hg4Var.x() && a(hg4Var.F, iMakeMeasureSpec, hg4Var.o()) && a(hg4Var.G, iMakeMeasureSpec2, hg4Var.i())) {
            mt0Var.e = hg4Var.o();
            mt0Var.f = hg4Var.i();
            mt0Var.g = hg4Var.Z;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && hg4Var.V > 0.0f;
        boolean z11 = z7 && hg4Var.V > 0.0f;
        if (view == null) {
            return;
        }
        uf4 uf4Var = (uf4) view.getLayoutParams();
        int i14 = mt0Var.j;
        if (i14 != 1 && i14 != 2 && z6 && hg4Var.r == 0 && z7 && hg4Var.s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            iMax2 = 0;
            iMax = 0;
        } else {
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            hg4Var.F = iMakeMeasureSpec;
            hg4Var.G = iMakeMeasureSpec2;
            hg4Var.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = hg4Var.u;
            iMax = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = hg4Var.v;
            if (i16 > 0) {
                iMax = Math.min(i16, iMax);
            }
            int i17 = hg4Var.x;
            iMax2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = hg4Var.y;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            if (!sb8.q(wf4Var.i, 1)) {
                if (z10 && z8) {
                    iMax = (int) ((iMax2 * hg4Var.V) + 0.5f);
                } else if (z11 && z9) {
                    iMax2 = (int) ((iMax / hg4Var.V) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                hg4Var.F = iMakeMeasureSpec;
                hg4Var.G = iMakeMeasureSpec3;
                z = false;
                hg4Var.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        mt0Var.i = (iMax == mt0Var.c && iMax2 == mt0Var.d) ? z : true;
        boolean z13 = uf4Var.c0 ? true : z12;
        if (z13 && baseline != -1 && hg4Var.Z != baseline) {
            mt0Var.i = true;
        }
        mt0Var.e = iMax;
        mt0Var.f = iMax2;
        mt0Var.h = z13;
        mt0Var.g = baseline;
    }
}
