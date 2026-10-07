package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class a29 {
    public int a = -1;
    public RecyclerView b;
    public vee c;
    public boolean d;
    public boolean e;
    public View f;
    public final ffe g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public a29(Context context) {
        ffe ffeVar = new ffe();
        ffeVar.d = -1;
        ffeVar.f = false;
        ffeVar.g = 0;
        ffeVar.a = 0;
        ffeVar.b = 0;
        ffeVar.c = Integer.MIN_VALUE;
        ffeVar.e = null;
        this.g = ffeVar;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            ore.p("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        vee veeVar = this.c;
        if (veeVar == null || !veeVar.e()) {
            return 0;
        }
        wee weeVar = (wee) view.getLayoutParams();
        return a(vee.B(view) - ((ViewGroup.MarginLayoutParams) weeVar).leftMargin, vee.E(view) + ((ViewGroup.MarginLayoutParams) weeVar).rightMargin, veeVar.J(), veeVar.n - veeVar.K(), i);
    }

    public int c(View view, int i) {
        vee veeVar = this.c;
        if (veeVar == null || !veeVar.f()) {
            return 0;
        }
        wee weeVar = (wee) view.getLayoutParams();
        return a(vee.F(view) - ((ViewGroup.MarginLayoutParams) weeVar).topMargin, vee.z(view) + ((ViewGroup.MarginLayoutParams) weeVar).bottomMargin, veeVar.L(), veeVar.o - veeVar.I(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int e(int i) {
        return (int) Math.ceil(((double) f(i)) / 0.3356d);
    }

    public int f(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public PointF g(int i) {
        Object obj = this.c;
        if (obj instanceof gfe) {
            return ((gfe) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + gfe.class.getCanonicalName());
        return null;
    }

    public final int h() {
        return this.a;
    }

    public int i() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public final boolean j() {
        return this.d;
    }

    public final boolean k() {
        return this.e;
    }

    public final void l(int i, int i2) {
        PointF pointFG;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            s();
        }
        if (this.d && this.f == null && this.c != null && (pointFG = g(this.a)) != null) {
            float f = pointFG.x;
            if (f != 0.0f || pointFG.y != 0.0f) {
                recyclerView.v0((int) Math.signum(f), (int) Math.signum(pointFG.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        ffe ffeVar = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.R(view) == this.a) {
                p(this.f, recyclerView.G1, ffeVar);
                ffeVar.a(recyclerView);
                s();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            n(i, i2, recyclerView.G1, ffeVar);
            boolean z = ffeVar.d >= 0;
            ffeVar.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.D1.b();
            }
        }
    }

    public final void m(View view) {
        this.b.getClass();
        if (RecyclerView.R(view) == this.a) {
            this.f = view;
            if (RecyclerView.a2) {
                Log.d("RecyclerView", "smooth scroll target view has been attached");
            }
        }
    }

    public void n(int i, int i2, hfe hfeVar, ffe ffeVar) {
        if (this.b.n.w() == 0) {
            s();
            return;
        }
        int i3 = this.o;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.o = i4;
        int i5 = this.p;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.p = i7;
        if (i4 == 0 && i7 == 0) {
            PointF pointFG = g(this.a);
            if (pointFG != null) {
                float f = pointFG.x;
                if (f != 0.0f || pointFG.y != 0.0f) {
                    float f2 = pointFG.y;
                    float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                    float f3 = pointFG.x / fSqrt;
                    pointFG.x = f3;
                    float f4 = pointFG.y / fSqrt;
                    pointFG.y = f4;
                    this.k = pointFG;
                    this.o = (int) (f3 * 10000.0f);
                    this.p = (int) (f4 * 10000.0f);
                    ffeVar.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (f(10000) * 1.2f), this.i);
                    return;
                }
            }
            ffeVar.d = this.a;
            s();
        }
    }

    public void o() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    public void p(View view, hfe hfeVar, ffe ffeVar) {
        int i;
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iB = b(view, i);
        int iC = c(view, i());
        int iE = e((int) Math.sqrt((iC * iC) + (iB * iB)));
        if (iE > 0) {
            ffeVar.b(-iB, -iC, iE, this.j);
        }
    }

    public final void q(int i) {
        this.a = i;
    }

    public final void r(RecyclerView recyclerView, vee veeVar) {
        kfe kfeVar = recyclerView.D1;
        kfeVar.g.removeCallbacks(kfeVar);
        kfeVar.c.abortAnimation();
        if (this.h) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.b = recyclerView;
        this.c = veeVar;
        int i = this.a;
        if (i == -1) {
            ore.p("Invalid target position");
            return;
        }
        recyclerView.G1.a = i;
        this.e = true;
        this.d = true;
        this.f = recyclerView.n.r(i);
        this.b.D1.b();
        this.h = true;
    }

    public final void s() {
        if (this.e) {
            this.e = false;
            o();
            this.b.G1.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            vee veeVar = this.c;
            if (veeVar.e == this) {
                veeVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
