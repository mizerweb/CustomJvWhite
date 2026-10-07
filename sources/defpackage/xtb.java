package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xtb extends afe {
    public final float a;
    public final ny8 b;
    public final eg8 c;
    public final Rect d;
    public int e;
    public int f;
    public int g;
    public int h;

    public xtb(ifh ifhVar, int i) {
        this(0.3f, (i & 2) != 0 ? new eg8(Boolean.FALSE) : ifhVar, new eg8(Boolean.FALSE));
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        View viewR;
        View viewR2;
        eg8 eg8Var;
        View viewR3;
        View viewR4;
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
        if (linearLayoutManagerE0 == null) {
            ore.k("Only linear layout manger supported");
            return;
        }
        this.e = linearLayoutManagerE0.X0();
        int iZ0 = linearLayoutManagerE0.Z0();
        this.g = iZ0;
        if (this.e == -1 || iZ0 == -1) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.b.getValue()).booleanValue();
        float f = this.a;
        Rect rect = this.d;
        if (!zBooleanValue) {
            int i3 = this.e;
            if (i3 < this.f && (viewR2 = linearLayoutManagerE0.r(i3)) != null) {
                viewR2.getLocalVisibleRect(rect);
                if (rect.height() >= viewR2.getMeasuredHeight() * f && c(viewR2, this.e)) {
                    this.f = this.e;
                }
            }
            int i4 = this.g;
            if (i4 <= this.h || (viewR = linearLayoutManagerE0.r(i4)) == null) {
                return;
            }
            if (!viewR.getLocalVisibleRect(rect) || rect.height() < viewR.getMeasuredHeight() * f) {
                this.g = linearLayoutManagerE0.Y0();
            }
            if (d(viewR, this.g)) {
                this.h = this.g;
                return;
            }
            return;
        }
        int i5 = this.e;
        if (i5 == this.g) {
            View viewR5 = linearLayoutManagerE0.r(i5);
            if (viewR5 == null) {
                return;
            }
            int i6 = this.e;
            if (i6 != this.f && c(viewR5, i6)) {
                this.f = this.e;
            }
            int i7 = this.g;
            if (i7 == this.h || !d(viewR5, i7)) {
                return;
            }
            this.h = this.g;
            return;
        }
        while (true) {
            int i8 = this.e;
            int i9 = this.g;
            eg8Var = this.c;
            if (i8 <= i9 && (viewR4 = linearLayoutManagerE0.r(i8)) != null) {
                if (viewR4.getLocalVisibleRect(rect) && rect.height() >= viewR4.getMeasuredHeight() * f) {
                    boolean zBooleanValue2 = ((Boolean) eg8Var.a).booleanValue();
                    int i10 = this.e;
                    int i11 = this.f;
                    if (!zBooleanValue2) {
                        if (i10 == i11 || !c(viewR4, i10)) {
                            break;
                            break;
                        } else {
                            this.f = this.e;
                            break;
                        }
                    }
                    if (i10 == i11) {
                        break;
                    }
                    boolean zC = c(viewR4, i10);
                    int i12 = this.e;
                    if (zC) {
                        this.f = i12;
                        break;
                    }
                    this.e = i12 + 1;
                } else {
                    this.e++;
                }
            } else {
                break;
            }
        }
        while (true) {
            int i13 = this.g;
            if (i13 < this.e || (viewR3 = linearLayoutManagerE0.r(i13)) == null) {
                return;
            }
            if (!viewR3.getLocalVisibleRect(rect) || rect.height() < viewR3.getMeasuredHeight() * f) {
                this.g--;
            } else {
                boolean zBooleanValue3 = ((Boolean) eg8Var.a).booleanValue();
                int i14 = this.g;
                int i15 = this.h;
                if (!zBooleanValue3) {
                    if (i14 == i15 || !d(viewR3, i14)) {
                        return;
                    }
                    this.h = this.g;
                    return;
                }
                if (i14 == i15) {
                    return;
                }
                boolean zD = d(viewR3, i14);
                int i16 = this.g;
                if (zD) {
                    this.h = i16;
                    return;
                }
                this.g = i16 - 1;
            }
        }
    }

    public abstract boolean c(View view, int i);

    public abstract boolean d(View view, int i);

    public xtb(float f, ny8 ny8Var, eg8 eg8Var) {
        this.a = f;
        this.b = ny8Var;
        this.c = eg8Var;
        this.d = new Rect();
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
    }
}
