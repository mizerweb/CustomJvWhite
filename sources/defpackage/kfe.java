package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kfe implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public kfe(RecyclerView recyclerView) {
        this.g = recyclerView;
        mee meeVar = RecyclerView.h2;
        this.d = meeVar;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), meeVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.g;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.d;
        mee meeVar = RecyclerView.h2;
        if (interpolator != meeVar) {
            this.d = meeVar;
            this.c = new OverScroller(recyclerView.getContext(), meeVar);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = i7j.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.h2;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.g;
        int[] iArr = recyclerView.S1;
        if (recyclerView.n == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.q();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.a;
            int i7 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int iP = RecyclerView.p(i6, recyclerView.I, recyclerView.K, recyclerView.getWidth());
            int iP2 = RecyclerView.p(i7, recyclerView.J, recyclerView.n1, recyclerView.getHeight());
            int[] iArr2 = recyclerView.S1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.w(iP, iP2, 1, iArr2, null)) {
                iP -= iArr[0];
                iP2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(iP, iP2);
            }
            if (recyclerView.m != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.v0(iP, iP2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iP - i8;
                int i11 = iP2 - i9;
                a29 a29Var = recyclerView.n.e;
                if (a29Var != null && !a29Var.j() && a29Var.k()) {
                    int iB = recyclerView.G1.b();
                    if (iB == 0) {
                        a29Var.s();
                    } else if (a29Var.h() >= iB) {
                        a29Var.q(iB - 1);
                        a29Var.l(i8, i9);
                    } else {
                        a29Var.l(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iP;
                i2 = iP2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.S1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.x(i3, i4, i, i2, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.y(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            a29 a29Var2 = recyclerView.n.e;
            if ((a29Var2 == null || !a29Var2.j()) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.A();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.B();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.C();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.z();
                        if (recyclerView.n1.isFinished()) {
                            recyclerView.n1.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = i7j.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f2) {
                    nk5 nk5Var = recyclerView.F1;
                    int[] iArr4 = (int[]) nk5Var.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    nk5Var.c = 0;
                }
            } else {
                b();
                ij7 ij7Var = recyclerView.E1;
                if (ij7Var != null) {
                    ij7Var.a(recyclerView, i3, i4);
                }
            }
        }
        a29 a29Var3 = recyclerView.n.e;
        if (a29Var3 != null && a29Var3.j()) {
            a29Var3.l(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.D0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = i7j.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
