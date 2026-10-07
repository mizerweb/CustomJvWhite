package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class zn9 extends cr implements Checkable, kxf {
    public static final int[] r = {R.attr.state_checkable};
    public static final int[] s = {R.attr.state_checked};
    public final ao9 d;
    public final LinkedHashSet e;
    public xn9 f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    public zn9(Context context, AttributeSet attributeSet) {
        zn9 zn9Var;
        super(p90.T(context, attributeSet, ru.oneme.app.R.attr.materialButtonStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Button), attributeSet, ru.oneme.app.R.attr.materialButtonStyle);
        this.e = new LinkedHashSet();
        this.o = false;
        this.p = false;
        Context context2 = getContext();
        TypedArray typedArrayB = ch3.B(context2, attributeSet, k3e.q, ru.oneme.app.R.attr.materialButtonStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.n = typedArrayB.getDimensionPixelSize(12, 0);
        int i = typedArrayB.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g = e9i.o0(i, mode);
        this.h = cqk.r(getContext(), typedArrayB, 14);
        this.i = cqk.t(getContext(), typedArrayB, 10);
        this.q = typedArrayB.getInteger(11, 1);
        this.k = typedArrayB.getDimensionPixelSize(13, 0);
        ao9 ao9Var = new ao9(this, ywf.b(context2, attributeSet, ru.oneme.app.R.attr.materialButtonStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Button).d());
        this.d = ao9Var;
        ao9Var.c = typedArrayB.getDimensionPixelOffset(1, 0);
        ao9Var.d = typedArrayB.getDimensionPixelOffset(2, 0);
        ao9Var.e = typedArrayB.getDimensionPixelOffset(3, 0);
        ao9Var.f = typedArrayB.getDimensionPixelOffset(4, 0);
        if (typedArrayB.hasValue(8)) {
            int dimensionPixelSize = typedArrayB.getDimensionPixelSize(8, -1);
            ao9Var.g = dimensionPixelSize;
            ywf ywfVar = ao9Var.b;
            float f = dimensionPixelSize;
            ywfVar.getClass();
            yab yabVar = ywfVar.a;
            yab yabVar2 = ywfVar.b;
            yab yabVar3 = ywfVar.c;
            yab yabVar4 = ywfVar.d;
            cy5 cy5Var = ywfVar.i;
            cy5 cy5Var2 = ywfVar.j;
            cy5 cy5Var3 = ywfVar.k;
            cy5 cy5Var4 = ywfVar.l;
            f0 f0Var = new f0(f);
            f0 f0Var2 = new f0(f);
            f0 f0Var3 = new f0(f);
            f0 f0Var4 = new f0(f);
            ywf ywfVar2 = new ywf();
            ywfVar2.a = yabVar;
            ywfVar2.b = yabVar2;
            ywfVar2.c = yabVar3;
            ywfVar2.d = yabVar4;
            ywfVar2.e = f0Var;
            ywfVar2.f = f0Var2;
            ywfVar2.g = f0Var3;
            ywfVar2.h = f0Var4;
            ywfVar2.i = cy5Var;
            ywfVar2.j = cy5Var2;
            ywfVar2.k = cy5Var3;
            ywfVar2.l = cy5Var4;
            ao9Var.c(ywfVar2);
            ao9Var.p = true;
        }
        ao9Var.h = typedArrayB.getDimensionPixelSize(20, 0);
        ao9Var.i = e9i.o0(typedArrayB.getInt(7, -1), mode);
        ao9Var.j = cqk.r(getContext(), typedArrayB, 6);
        ao9Var.k = cqk.r(getContext(), typedArrayB, 19);
        ao9Var.l = cqk.r(getContext(), typedArrayB, 16);
        ao9Var.q = typedArrayB.getBoolean(5, false);
        ao9Var.t = typedArrayB.getDimensionPixelSize(9, 0);
        ao9Var.r = typedArrayB.getBoolean(21, true);
        WeakHashMap weakHashMap = i7j.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayB.hasValue(0)) {
            ao9Var.o = true;
            zn9Var = this;
            zn9Var.setSupportBackgroundTintList(ao9Var.j);
            zn9Var.setSupportBackgroundTintMode(ao9Var.i);
        } else {
            zn9Var = this;
            ao9Var.e();
        }
        zn9Var.setPaddingRelative(paddingStart + ao9Var.c, paddingTop + ao9Var.e, paddingEnd + ao9Var.d, paddingBottom + ao9Var.f);
        typedArrayB.recycle();
        zn9Var.setCompoundDrawablePadding(zn9Var.n);
        zn9Var.c(zn9Var.i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        ao9 ao9Var = this.d;
        return (ao9Var == null || ao9Var.o) ? false : true;
    }

    public final void b() {
        int i = this.q;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void c(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.i = drawableMutate;
            drawableMutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int intrinsicWidth = this.k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i = this.l;
            int i2 = this.m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.i) || (((i3 == 3 || i3 == 4) && drawable5 != this.i) || ((i3 == 16 || i3 == 32) && drawable4 != this.i))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.q;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.l = 0;
                if (i3 == 16) {
                    this.m = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.n) - getPaddingBottom()) / 2);
                if (this.m != iMax) {
                    this.m = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.l = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = i7j.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.l != paddingEnd) {
            this.l = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        ao9 ao9Var = this.d;
        return ((ao9Var == null || !ao9Var.q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.f;
    }

    public int getInsetTop() {
        return this.d.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.d.l;
        }
        return null;
    }

    public ywf getShapeAppearanceModel() {
        if (a()) {
            return this.d.b;
        }
        ore.k("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // defpackage.cr
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.d.j : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.cr
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            p90.P(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        ao9 ao9Var = this.d;
        if (ao9Var != null && ao9Var.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        if (this.o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.cr, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.o);
    }

    @Override // defpackage.cr, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        ao9 ao9Var = this.d;
        accessibilityNodeInfo.setCheckable(ao9Var != null && ao9Var.q);
        accessibilityNodeInfo.setChecked(this.o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.cr, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof yn9)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yn9 yn9Var = (yn9) parcelable;
        super.onRestoreInstanceState(yn9Var.a);
        setChecked(yn9Var.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        yn9 yn9Var = new yn9(super.onSaveInstanceState());
        yn9Var.c = this.o;
        return yn9Var;
    }

    @Override // defpackage.cr, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        ao9 ao9Var = this.d;
        if (ao9Var.b(false) != null) {
            ao9Var.b(false).setTint(i);
        }
    }

    @Override // defpackage.cr, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        ao9 ao9Var = this.d;
        ao9Var.o = true;
        zn9 zn9Var = ao9Var.a;
        zn9Var.setSupportBackgroundTintList(ao9Var.j);
        zn9Var.setSupportBackgroundTintMode(ao9Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.cr, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? wk8.o(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.d.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        ao9 ao9Var = this.d;
        if (ao9Var == null || !ao9Var.q || !isEnabled() || this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        if (getParent() instanceof do9) {
            do9 do9Var = (do9) getParent();
            boolean z2 = this.o;
            if (!do9Var.f) {
                do9Var.b(getId(), z2);
            }
        }
        if (this.p) {
            return;
        }
        this.p = true;
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw qt4.h(it);
        }
        this.p = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            ao9 ao9Var = this.d;
            if (ao9Var.p && ao9Var.g == i) {
                return;
            }
            ao9Var.g = i;
            ao9Var.p = true;
            ywf ywfVar = ao9Var.b;
            float f = i;
            ywfVar.getClass();
            yab yabVar = ywfVar.a;
            yab yabVar2 = ywfVar.b;
            yab yabVar3 = ywfVar.c;
            yab yabVar4 = ywfVar.d;
            cy5 cy5Var = ywfVar.i;
            cy5 cy5Var2 = ywfVar.j;
            cy5 cy5Var3 = ywfVar.k;
            cy5 cy5Var4 = ywfVar.l;
            f0 f0Var = new f0(f);
            f0 f0Var2 = new f0(f);
            f0 f0Var3 = new f0(f);
            f0 f0Var4 = new f0(f);
            ywf ywfVar2 = new ywf();
            ywfVar2.a = yabVar;
            ywfVar2.b = yabVar2;
            ywfVar2.c = yabVar3;
            ywfVar2.d = yabVar4;
            ywfVar2.e = f0Var;
            ywfVar2.f = f0Var2;
            ywfVar2.g = f0Var3;
            ywfVar2.h = f0Var4;
            ywfVar2.i = cy5Var;
            ywfVar2.j = cy5Var2;
            ywfVar2.k = cy5Var3;
            ywfVar2.l = cy5Var4;
            ao9Var.c(ywfVar2);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.d.b(false).i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? wk8.o(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            ore.p("iconSize cannot be less than 0");
        } else if (this.k != i) {
            this.k = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(np4.l(getContext(), i));
    }

    public void setInsetBottom(int i) {
        ao9 ao9Var = this.d;
        ao9Var.d(ao9Var.e, i);
    }

    public void setInsetTop(int i) {
        ao9 ao9Var = this.d;
        ao9Var.d(i, ao9Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(xn9 xn9Var) {
        this.f = xn9Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        xn9 xn9Var = this.f;
        if (xn9Var != null) {
            ((do9) ((ks9) xn9Var).b).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            ao9 ao9Var = this.d;
            zn9 zn9Var = ao9Var.a;
            if (ao9Var.l != colorStateList) {
                ao9Var.l = colorStateList;
                if (zn9Var.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) zn9Var.getBackground()).setColor(pqe.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(np4.l(getContext(), i));
        }
    }

    @Override // defpackage.kxf
    public void setShapeAppearanceModel(ywf ywfVar) {
        if (a()) {
            this.d.c(ywfVar);
        } else {
            ore.k("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            ao9 ao9Var = this.d;
            ao9Var.n = z;
            ao9Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            ao9 ao9Var = this.d;
            if (ao9Var.k != colorStateList) {
                ao9Var.k = colorStateList;
                ao9Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(np4.l(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            ao9 ao9Var = this.d;
            if (ao9Var.h != i) {
                ao9Var.h = i;
                ao9Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.cr
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        ao9 ao9Var = this.d;
        if (ao9Var.j != colorStateList) {
            ao9Var.j = colorStateList;
            if (ao9Var.b(false) != null) {
                ao9Var.b(false).setTintList(ao9Var.j);
            }
        }
    }

    @Override // defpackage.cr
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        ao9 ao9Var = this.d;
        if (ao9Var.i != mode) {
            ao9Var.i = mode;
            if (ao9Var.b(false) == null || ao9Var.i == null) {
                return;
            }
            ao9Var.b(false).setTintMode(ao9Var.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.o);
    }
}
