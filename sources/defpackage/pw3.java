package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class pw3 implements qq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.oq
    public final void R0(rq rqVar, int i) {
        float f;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                rw3 rw3Var = (rw3) obj;
                nw3 nw3Var = rw3Var.k;
                rw3Var.y = i;
                ixj ixjVar = rw3Var.A;
                int iD = ixjVar != null ? ixjVar.d() : 0;
                int childCount = rw3Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = rw3Var.getChildAt(i3);
                    ow3 ow3Var = (ow3) childAt.getLayoutParams();
                    o8j o8jVarB = rw3.b(childAt);
                    int i4 = ow3Var.a;
                    if (i4 == 1) {
                        o8jVarB.b(np4.f(-i, 0, ((rw3Var.getHeight() - rw3.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((ow3) childAt.getLayoutParams())).bottomMargin));
                    } else if (i4 == 2) {
                        o8jVarB.b(Math.round((-i) * ow3Var.b));
                    }
                }
                rw3Var.d();
                if (rw3Var.p != null && iD > 0) {
                    WeakHashMap weakHashMap = i7j.a;
                    rw3Var.postInvalidateOnAnimation();
                }
                int height = rw3Var.getHeight();
                WeakHashMap weakHashMap2 = i7j.a;
                int minimumHeight = (height - rw3Var.getMinimumHeight()) - iD;
                float scrimVisibleHeightTrigger = height - rw3Var.getScrimVisibleHeightTrigger();
                float f2 = minimumHeight;
                float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f2);
                nw3Var.d = fMin;
                nw3Var.e = c0a.c(1.0f, fMin, 0.5f, fMin);
                nw3Var.f = rw3Var.y + minimumHeight;
                float fE = np4.e(Math.abs(i) / f2, 0.0f, 1.0f);
                if (fE != nw3Var.b) {
                    nw3Var.b = fE;
                    rw3 rw3Var2 = nw3Var.a;
                    TextPaint textPaint = nw3Var.T;
                    Rect rect = nw3Var.h;
                    Rect rect2 = nw3Var.g;
                    boolean z = nw3Var.c;
                    RectF rectF = nw3Var.i;
                    if (z) {
                        if (fE < nw3Var.e) {
                            rect = rect2;
                        }
                        rectF.set(rect);
                    } else {
                        rectF.left = nw3.e(rect2.left, rect.left, fE, nw3Var.V);
                        rectF.top = nw3.e(nw3Var.q, nw3Var.r, fE, nw3Var.V);
                        rectF.right = nw3.e(rect2.right, rect.right, fE, nw3Var.V);
                        rectF.bottom = nw3.e(rect2.bottom, rect.bottom, fE, nw3Var.V);
                    }
                    if (!nw3Var.c) {
                        nw3Var.u = nw3.e(nw3Var.s, nw3Var.t, fE, nw3Var.V);
                        nw3Var.v = nw3.e(nw3Var.q, nw3Var.r, fE, nw3Var.V);
                        nw3Var.l(fE);
                        f = fE;
                    } else if (fE < nw3Var.e) {
                        nw3Var.u = nw3Var.s;
                        nw3Var.v = nw3Var.q;
                        nw3Var.l(0.0f);
                        f = 0.0f;
                    } else {
                        nw3Var.u = nw3Var.t;
                        nw3Var.v = nw3Var.r - Math.max(0, nw3Var.f);
                        nw3Var.l(1.0f);
                        f = 1.0f;
                    }
                    ll6 ll6Var = lk.b;
                    nw3Var.k0 = 1.0f - nw3.e(0.0f, 1.0f, 1.0f - fE, ll6Var);
                    rw3Var2.postInvalidateOnAnimation();
                    nw3Var.l0 = nw3.e(1.0f, 0.0f, fE, ll6Var);
                    rw3Var2.postInvalidateOnAnimation();
                    ColorStateList colorStateList = nw3Var.o;
                    ColorStateList colorStateList2 = nw3Var.n;
                    if (colorStateList != colorStateList2) {
                        textPaint.setColor(nw3.a(nw3Var.d(colorStateList2), f, nw3Var.d(nw3Var.o)));
                    } else {
                        textPaint.setColor(nw3Var.d(colorStateList));
                    }
                    float f3 = nw3Var.f0;
                    float f4 = nw3Var.g0;
                    if (f3 != f4) {
                        textPaint.setLetterSpacing(nw3.e(f4, f3, fE, ll6Var));
                    } else {
                        textPaint.setLetterSpacing(f3);
                    }
                    nw3Var.N = lk.a(nw3Var.b0, nw3Var.X, fE);
                    nw3Var.O = lk.a(nw3Var.c0, nw3Var.Y, fE);
                    nw3Var.P = lk.a(nw3Var.d0, nw3Var.Z, fE);
                    int iA = nw3.a(nw3Var.d(nw3Var.e0), fE, nw3Var.d(nw3Var.a0));
                    nw3Var.Q = iA;
                    textPaint.setShadowLayer(nw3Var.N, nw3Var.O, nw3Var.P, iA);
                    if (nw3Var.c) {
                        int alpha = textPaint.getAlpha();
                        float f5 = nw3Var.e;
                        textPaint.setAlpha((int) ((fE <= f5 ? lk.b(1.0f, 0.0f, nw3Var.d, f5, fE) : lk.b(0.0f, 1.0f, f5, 1.0f, fE)) * alpha));
                        if (Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(nw3Var.N, nw3Var.O, nw3Var.P, qyj.o(nw3Var.Q, textPaint.getAlpha()));
                        }
                    }
                    rw3Var2.postInvalidateOnAnimation();
                }
                break;
            default:
                float fAbs = Math.abs(i) / rqVar.getTotalScrollRange();
                float f6 = 1.0f - fAbs;
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj;
                if (profileChangeLinkScreen.getView() != null) {
                    ((rcc) profileChangeLinkScreen.i.m(profileChangeLinkScreen, ProfileChangeLinkScreen.t[3])).setTitleAlpha(fAbs);
                    profileChangeLinkScreen.p1().setAlpha(f6);
                }
                break;
        }
    }
}
