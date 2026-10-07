package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.b1k;
import defpackage.cca;
import defpackage.i1m;
import defpackage.j8;
import defpackage.l8;
import defpackage.m8;
import defpackage.n8;
import defpackage.o8;
import defpackage.p8;
import defpackage.r9j;
import defpackage.rca;
import defpackage.t19;
import defpackage.u19;
import defpackage.xba;
import defpackage.yba;
import defpackage.zpe;

/* JADX INFO: loaded from: classes2.dex */
public class ActionMenuView extends u19 implements xba, rca {
    public yba p;
    public Context q;
    public int r;
    public boolean s;
    public m8 t;
    public i1m u;
    public boolean v;
    public int w;
    public final int x;
    public final int y;
    public p8 z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.x = (int) (56.0f * f);
        this.y = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }

    public static o8 i() {
        o8 o8Var = new o8(-2, -2);
        o8Var.a = false;
        ((LinearLayout.LayoutParams) o8Var).gravity = 16;
        return o8Var;
    }

    public static o8 j(ViewGroup.LayoutParams layoutParams) {
        o8 o8Var;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof o8) {
            o8 o8Var2 = (o8) layoutParams;
            o8Var = new o8(o8Var2);
            o8Var.a = o8Var2.a;
        } else {
            o8Var = new o8(layoutParams);
        }
        if (((LinearLayout.LayoutParams) o8Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) o8Var).gravity = 16;
        }
        return o8Var;
    }

    @Override // defpackage.rca
    public final void a(yba ybaVar) {
        this.p = ybaVar;
    }

    @Override // defpackage.xba
    public final boolean b(cca ccaVar) {
        return this.p.r(ccaVar, null, 0);
    }

    @Override // defpackage.u19, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o8;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.u19
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ t19 generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.u19
    /* JADX INFO: renamed from: f */
    public final t19 generateLayoutParams(AttributeSet attributeSet) {
        return new o8(getContext(), attributeSet);
    }

    @Override // defpackage.u19
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ t19 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.u19, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.u19, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o8(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            yba ybaVar = new yba(context);
            this.p = ybaVar;
            ybaVar.e = new b1k(1, this);
            m8 m8Var = new m8(context);
            this.t = m8Var;
            m8Var.l = true;
            m8Var.m = true;
            m8Var.e = new zpe(15);
            this.p.c(m8Var, this.q);
            m8 m8Var2 = this.t;
            m8Var2.h = this;
            this.p = m8Var2.c;
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        m8 m8Var = this.t;
        l8 l8Var = m8Var.i;
        if (l8Var != null) {
            return l8Var.getDrawable();
        }
        if (m8Var.k) {
            return m8Var.j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zC = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof n8)) {
            zC = ((n8) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof n8)) ? zC : ((n8) childAt2).d() | zC;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m8 m8Var = this.t;
        if (m8Var != null) {
            m8Var.e();
            if (this.t.k()) {
                this.t.j();
                this.t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8 m8Var = this.t;
        if (m8Var != null) {
            m8Var.j();
            j8 j8Var = m8Var.t;
            if (j8Var == null || !j8Var.b()) {
                return;
            }
            j8Var.i.dismiss();
        }
    }

    @Override // defpackage.u19, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.v) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = r9j.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                o8 o8Var = (o8) childAt.getLayoutParams();
                if (o8Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) o8Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) o8Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) o8Var).leftMargin) + ((LinearLayout.LayoutParams) o8Var).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                o8 o8Var2 = (o8) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !o8Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) o8Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) o8Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            o8 o8Var3 = (o8) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !o8Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) o8Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) o8Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.u19, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        yba ybaVar;
        boolean z = this.v;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.v = z2;
        if (z != z2) {
            this.w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.v && (ybaVar = this.p) != null && size != this.w) {
            this.w = size;
            ybaVar.q(true);
        }
        int childCount = getChildCount();
        if (!this.v || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                o8 o8Var = (o8) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) o8Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) o8Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.x;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.y;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                o8 o8Var2 = (o8) childAt.getLayoutParams();
                o8Var2.f = false;
                o8Var2.c = 0;
                o8Var2.b = 0;
                o8Var2.d = false;
                ((LinearLayout.LayoutParams) o8Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) o8Var2).rightMargin = 0;
                o8Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = o8Var2.a ? 1 : i10;
                o8 o8Var3 = (o8) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                o8Var3.d = !o8Var3.a && z6;
                o8Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (o8Var2.d) {
                    i15++;
                }
                if (o8Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                o8 o8Var4 = (o8) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (o8Var4.d) {
                    int i28 = o8Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                o8 o8Var5 = (o8) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && o8Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    o8Var5.b += r11;
                    o8Var5.f = r11;
                    i23--;
                } else if (o8Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((o8) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((o8) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    o8 o8Var6 = (o8) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        o8Var6.c = i32;
                        o8Var6.f = true;
                        if (i33 == 0 && !o8Var6.e) {
                            ((LinearLayout.LayoutParams) o8Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (o8Var6.a) {
                        o8Var6.c = i32;
                        o8Var6.f = true;
                        ((LinearLayout.LayoutParams) o8Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) o8Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) o8Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                o8 o8Var7 = (o8) childAt4.getLayoutParams();
                if (o8Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((o8Var7.b * i22) + o8Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.q = z;
    }

    public void setOnMenuItemClickListener(p8 p8Var) {
        this.z = p8Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        m8 m8Var = this.t;
        l8 l8Var = m8Var.i;
        if (l8Var != null) {
            l8Var.setImageDrawable(drawable);
        } else {
            m8Var.k = true;
            m8Var.j = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(m8 m8Var) {
        this.t = m8Var;
        m8Var.h = this;
        this.p = m8Var.c;
    }

    @Override // defpackage.u19, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
