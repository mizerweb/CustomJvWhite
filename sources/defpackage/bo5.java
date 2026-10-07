package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class bo5 implements y9j {
    public final cq4 a;
    public final View b;
    public final int c;
    public final int d;
    public final Float e;
    public final boolean f;
    public final View g;
    public final float h;
    public final float i;
    public final boolean j;
    public final yp4 k;
    public final Rect l = new Rect();
    public final int[] m = new int[2];
    public final Rect n = new Rect();
    public final Rect o = new Rect();
    public boolean p = true;
    public boolean q;

    public bo5(cq4 cq4Var, View view, int i, int i2, Float f, boolean z, View view2, float f2, float f3, boolean z2, yp4 yp4Var) {
        this.a = cq4Var;
        this.b = view;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = z;
        this.g = view2;
        this.h = f2;
        this.i = f3;
        this.j = z2;
        this.k = yp4Var;
    }

    @Override // defpackage.y9j
    public final void a(Rect rect, View view) {
        if (this.q) {
            return;
        }
        Rect rect2 = this.l;
        if (cqk.d(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        View view2 = this.b;
        int width = view2.getWidth();
        int height = view2.getHeight();
        Rect rect3 = this.n;
        rect3.set(0, 0, width, height);
        WeakHashMap weakHashMap = i7j.a;
        ixj ixjVarA = z6j.a(view);
        mi8 mi8VarF = ixjVarA != null ? ixjVarA.a.f(519) : null;
        do5 do5VarE = ixjVarA != null ? ixjVarA.a.e() : null;
        int iMax = Math.max(mi8VarF != null ? mi8VarF.a : 0, do5VarE != null ? do5VarE.b() : 0);
        int[] iArr = this.m;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        cq4 cq4Var = this.a;
        cq4Var.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = i - i3;
        int i6 = i2 - i4;
        rect.set(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
        Rect rect4 = this.o;
        view.getWindowVisibleDisplayFrame(rect4);
        rect4.offset(-i3, -i4);
        if (iMax != 0) {
            int i7 = -iMax;
            rect4.offset(i7, 0);
            rect.offset(i7, 0);
        }
        float f = this.h;
        float fWidth = f >= 0.0f ? f - iMax : -1.0f;
        int i8 = this.c;
        rect4.inset(i8, i8);
        char c = rect4.centerX() < ((fWidth > 0.0f ? 1 : (fWidth == 0.0f ? 0 : -1)) >= 0 ? (int) fWidth : rect.centerX()) ? (char) 5 : (char) 3;
        if (fWidth >= 0.0f) {
            if (c == 5) {
                fWidth -= rect3.width();
            }
            rect3.offsetTo((int) fWidth, rect3.top);
        } else if (c == 5) {
            rect3.offsetTo(rect.right - rect3.width(), rect3.top);
        } else {
            rect3.offsetTo(rect.left, rect3.top);
        }
        View view3 = this.g;
        if (view3 != null) {
            LinearLayout linearLayout = view2 instanceof LinearLayout ? (LinearLayout) view2 : null;
            if (linearLayout != null) {
                linearLayout.setGravity(c == 5 ? 8388613 : 8388611);
            }
        }
        Float f2 = this.e;
        if (f2 != null) {
            int top = view3 != null ? view3.getTop() : 0;
            int height2 = view3 != null ? view3.getHeight() : view2.getHeight();
            float f3 = this.i;
            rect3.offsetTo(rect3.left, ((f3 >= 0.0f ? oc9.v((int) f3, rect.top, rect.bottom) : rect.centerY()) - top) - ((int) (f2.floatValue() * height2)));
        } else {
            int iCenterY = rect4.centerY();
            int iCenterY2 = rect.centerY();
            int i9 = rect3.left;
            int i10 = this.d;
            if (iCenterY < iCenterY2) {
                rect3.offsetTo(i9, (rect.top - rect3.height()) - i10);
            } else {
                rect3.offsetTo(i9, rect.bottom + i10);
            }
        }
        int i11 = rect3.left;
        int i12 = rect4.left;
        if (i11 < i12) {
            rect3.offsetTo(i12, rect3.top);
        }
        int i13 = rect3.top;
        int i14 = rect4.top;
        if (i13 < i14) {
            rect3.offsetTo(rect3.left, i14);
        }
        int i15 = rect3.bottom;
        int i16 = rect4.bottom;
        if (i15 > i16) {
            rect3.offsetTo(rect3.left, i16 - rect3.height());
        }
        int i17 = rect3.right;
        int i18 = rect4.right;
        if (i17 > i18) {
            rect3.offsetTo(i18 - rect3.width(), rect3.top);
        }
        view2.setX(rect3.left);
        view2.setY(rect3.top);
        if (this.p) {
            this.p = false;
            this.q = this.j;
            this.k.invoke();
            if (this.f) {
                view2.setPivotX(c == 5 ? view2.getWidth() : 0.0f);
                view2.setPivotY(0.0f);
                view2.setScaleX(0.75f);
                view2.setScaleY(0.75f);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.2f);
                view2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(150L).setInterpolator(decelerateInterpolator).start();
                Drawable background = cq4Var.getBackground();
                ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
                if (colorDrawable != null) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
                    valueAnimatorOfInt.setDuration(150L);
                    valueAnimatorOfInt.setInterpolator(decelerateInterpolator);
                    valueAnimatorOfInt.addUpdateListener(new ak(11, colorDrawable));
                    valueAnimatorOfInt.start();
                }
            }
        }
    }

    @Override // defpackage.y9j
    public final void b() {
    }
}
