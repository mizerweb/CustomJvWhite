package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cfe;
import defpackage.ci1;
import defpackage.dn2;
import defpackage.en2;
import defpackage.fn2;
import defpackage.gfe;
import defpackage.gn2;
import defpackage.hfe;
import defpackage.k3e;
import defpackage.ore;
import defpackage.vee;
import defpackage.wee;
import defpackage.z4b;
import defpackage.zo5;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends vee implements gfe {
    public final z4b p;
    public gn2 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new en2();
        this.r = new ci1(1, this);
        this.p = new z4b();
        x0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3e.f);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            x0();
            O0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.vee
    public final void A(Rect rect, View view) {
        RecyclerView.U(rect, view);
        rect.centerY();
        if (M0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.vee
    public final int A0(int i, cfe cfeVar, hfe hfeVar) {
        if (!f() || w() == 0 || i == 0) {
            return 0;
        }
        T(cfeVar.d(0), 0, 0);
        throw null;
    }

    @Override // defpackage.vee
    public final void J0(RecyclerView recyclerView, int i) {
        dn2 dn2Var = new dn2(this, recyclerView.getContext());
        dn2Var.a = i;
        K0(dn2Var);
    }

    public final boolean M0() {
        return this.q.b == 0;
    }

    public final boolean N0() {
        return M0() && H() == 1;
    }

    public final void O0(int i) {
        fn2 fn2Var;
        if (i != 0 && i != 1) {
            ore.p(zo5.h(i, "invalid orientation:"));
            return;
        }
        d(null);
        gn2 gn2Var = this.q;
        if (gn2Var == null || i != gn2Var.b) {
            if (i == 0) {
                fn2Var = new fn2(this, 1);
            } else {
                if (i != 1) {
                    ore.p("invalid orientation");
                    return;
                }
                fn2Var = new fn2(this, 0);
            }
            this.q = fn2Var;
            x0();
        }
    }

    @Override // defpackage.vee
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.vee
    public final void T(View view, int i, int i2) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.vee
    public final void X(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        z4b z4bVar = this.p;
        float dimension = z4bVar.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        z4bVar.a = dimension;
        float dimension2 = z4bVar.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        z4bVar.b = dimension2;
        x0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.vee
    public final void Y(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    @Override // defpackage.vee
    public final View Z(View view, int i, cfe cfeVar, hfe hfeVar) {
        byte b;
        if (w() != 0) {
            int i2 = this.q.b;
            if (i == 1) {
                b = -1;
            } else if (i == 2) {
                b = 1;
            } else if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        } else if (i2 == 1) {
                            b = 1;
                        }
                        b = -2147483648;
                    } else if (i2 != 0) {
                        b = -2147483648;
                    } else if (N0()) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                } else if (i2 == 1) {
                    b = -1;
                } else {
                    b = -2147483648;
                }
            } else if (i2 != 0) {
                b = -2147483648;
            } else if (N0()) {
                b = 1;
            } else {
                b = -1;
            }
            if (b != -2147483648) {
                if (b == -1) {
                    if (vee.M(view) != 0) {
                        int iM = vee.M(v(0)) - 1;
                        if (iM < 0 || iM >= G()) {
                            return v(N0() ? w() - 1 : 0);
                        }
                        this.q.e();
                        throw null;
                    }
                } else if (vee.M(view) != G() - 1) {
                    int iM2 = vee.M(v(w() - 1)) + 1;
                    if (iM2 < 0 || iM2 >= G()) {
                        return v(N0() ? 0 : w() - 1);
                    }
                    this.q.e();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.gfe
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.vee
    public final void a0(AccessibilityEvent accessibilityEvent) {
        super.a0(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(vee.M(v(0)));
            accessibilityEvent.setToIndex(vee.M(v(w() - 1)));
        }
    }

    @Override // defpackage.vee
    public final boolean e() {
        return M0();
    }

    @Override // defpackage.vee
    public final void e0(int i, int i2) {
        G();
    }

    @Override // defpackage.vee
    public final boolean f() {
        return !M0();
    }

    @Override // defpackage.vee
    public final void h0(int i, int i2) {
        G();
    }

    @Override // defpackage.vee
    public final int k(hfe hfeVar) {
        w();
        return 0;
    }

    @Override // defpackage.vee
    public final void k0(cfe cfeVar, hfe hfeVar) {
        if (hfeVar.b() > 0) {
            if ((M0() ? this.n : this.o) > 0.0f) {
                N0();
                T(cfeVar.d(0), 0, 0);
                throw null;
            }
        }
        r0(cfeVar);
    }

    @Override // defpackage.vee
    public final int l(hfe hfeVar) {
        return 0;
    }

    @Override // defpackage.vee
    public final void l0(hfe hfeVar) {
        if (w() == 0) {
            return;
        }
        vee.M(v(0));
    }

    @Override // defpackage.vee
    public final int m(hfe hfeVar) {
        return 0;
    }

    @Override // defpackage.vee
    public final int n(hfe hfeVar) {
        w();
        return 0;
    }

    @Override // defpackage.vee
    public final int o(hfe hfeVar) {
        return 0;
    }

    @Override // defpackage.vee
    public final int p(hfe hfeVar) {
        return 0;
    }

    @Override // defpackage.vee
    public final wee s() {
        return new wee(-2, -2);
    }

    @Override // defpackage.vee
    public final boolean w0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.vee
    public final int y0(int i, cfe cfeVar, hfe hfeVar) {
        if (!M0() || w() == 0 || i == 0) {
            return 0;
        }
        T(cfeVar.d(0), 0, 0);
        throw null;
    }

    @Override // defpackage.vee
    public final void z0(int i) {
    }

    public CarouselLayoutManager() {
        z4b z4bVar = new z4b();
        new en2();
        this.r = new ci1(1, this);
        this.p = z4bVar;
        x0();
        O0(0);
    }
}
