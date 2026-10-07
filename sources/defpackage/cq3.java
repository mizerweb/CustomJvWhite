package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class cq3 extends er implements kxf, Checkable {
    public static final Rect x = new Rect();
    public static final int[] y = {R.attr.state_selected};
    public static final int[] z = {R.attr.state_checkable};
    public dq3 e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public go9 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public CharSequence r;
    public final bq3 s;
    public boolean t;
    public final Rect u;
    public final RectF v;
    public final aq3 w;

    public cq3(ContextThemeWrapper contextThemeWrapper) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(p90.T(contextThemeWrapper, null, ru.oneme.app.R.attr.chipStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Chip_Action), null, ru.oneme.app.R.attr.chipStyle);
        this.u = new Rect();
        this.v = new RectF();
        this.w = new aq3(0, this);
        Context context = getContext();
        dq3 dq3Var = new dq3(context);
        Context context2 = dq3Var.E1;
        int[] iArr = k3e.g;
        TypedArray typedArrayB = ch3.B(context2, null, iArr, ru.oneme.app.R.attr.chipStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        dq3Var.e2 = typedArrayB.hasValue(37);
        Context context3 = dq3Var.E1;
        ColorStateList colorStateListR = cqk.r(context3, typedArrayB, 24);
        if (dq3Var.y != colorStateListR) {
            dq3Var.y = colorStateListR;
            dq3Var.onStateChange(dq3Var.getState());
        }
        ColorStateList colorStateListR2 = cqk.r(context3, typedArrayB, 11);
        if (dq3Var.z != colorStateListR2) {
            dq3Var.z = colorStateListR2;
            dq3Var.onStateChange(dq3Var.getState());
        }
        float dimension = typedArrayB.getDimension(19, 0.0f);
        if (dq3Var.A != dimension) {
            dq3Var.A = dimension;
            dq3Var.invalidateSelf();
            dq3Var.u();
        }
        if (typedArrayB.hasValue(12)) {
            dq3Var.A(typedArrayB.getDimension(12, 0.0f));
        }
        dq3Var.F(cqk.r(context3, typedArrayB, 22));
        dq3Var.G(typedArrayB.getDimension(23, 0.0f));
        dq3Var.P(cqk.r(context3, typedArrayB, 36));
        String text = typedArrayB.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(dq3Var.F, text);
        gmh gmhVar = dq3Var.K1;
        if (!zEquals) {
            dq3Var.F = text;
            gmhVar.e = true;
            dq3Var.invalidateSelf();
            dq3Var.u();
        }
        o1b o1bVarA = null;
        zlh zlhVar = (!typedArrayB.hasValue(0) || (resourceId3 = typedArrayB.getResourceId(0, 0)) == 0) ? null : new zlh(context3, resourceId3);
        zlhVar.k = typedArrayB.getDimension(1, zlhVar.k);
        gmhVar.b(zlhVar, context3);
        int i = typedArrayB.getInt(3, 0);
        if (i == 1) {
            dq3Var.b2 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            dq3Var.b2 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            dq3Var.b2 = TextUtils.TruncateAt.END;
        }
        dq3Var.E(typedArrayB.getBoolean(18, false));
        dq3Var.B(cqk.t(context3, typedArrayB, 14));
        if (typedArrayB.hasValue(17)) {
            dq3Var.D(cqk.r(context3, typedArrayB, 17));
        }
        dq3Var.C(typedArrayB.getDimension(16, -1.0f));
        dq3Var.M(typedArrayB.getBoolean(31, false));
        dq3Var.H(cqk.t(context3, typedArrayB, 25));
        dq3Var.L(cqk.r(context3, typedArrayB, 30));
        dq3Var.J(typedArrayB.getDimension(28, 0.0f));
        dq3Var.w(typedArrayB.getBoolean(6, false));
        dq3Var.z(typedArrayB.getBoolean(10, false));
        dq3Var.x(cqk.t(context3, typedArrayB, 7));
        if (typedArrayB.hasValue(9)) {
            dq3Var.y(cqk.r(context3, typedArrayB, 9));
        }
        dq3Var.u1 = (!typedArrayB.hasValue(39) || (resourceId2 = typedArrayB.getResourceId(39, 0)) == 0) ? null : o1b.a(context3, resourceId2);
        if (typedArrayB.hasValue(33) && (resourceId = typedArrayB.getResourceId(33, 0)) != 0) {
            o1bVarA = o1b.a(context3, resourceId);
        }
        dq3Var.v1 = o1bVarA;
        float dimension2 = typedArrayB.getDimension(21, 0.0f);
        if (dq3Var.w1 != dimension2) {
            dq3Var.w1 = dimension2;
            dq3Var.invalidateSelf();
            dq3Var.u();
        }
        dq3Var.O(typedArrayB.getDimension(35, 0.0f));
        dq3Var.N(typedArrayB.getDimension(34, 0.0f));
        float dimension3 = typedArrayB.getDimension(41, 0.0f);
        if (dq3Var.z1 != dimension3) {
            dq3Var.z1 = dimension3;
            dq3Var.invalidateSelf();
            dq3Var.u();
        }
        float dimension4 = typedArrayB.getDimension(40, 0.0f);
        if (dq3Var.A1 != dimension4) {
            dq3Var.A1 = dimension4;
            dq3Var.invalidateSelf();
            dq3Var.u();
        }
        dq3Var.K(typedArrayB.getDimension(29, 0.0f));
        dq3Var.I(typedArrayB.getDimension(27, 0.0f));
        float dimension5 = typedArrayB.getDimension(13, 0.0f);
        if (dq3Var.D1 != dimension5) {
            dq3Var.D1 = dimension5;
            dq3Var.invalidateSelf();
            dq3Var.u();
        }
        dq3Var.d2 = typedArrayB.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayB.recycle();
        ch3.d(context, null, ru.oneme.app.R.attr.chipStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Chip_Action);
        ch3.f(context, null, iArr, ru.oneme.app.R.attr.chipStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, ru.oneme.app.R.attr.chipStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Chip_Action);
        this.o = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.q = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(e9i.J(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(dq3Var);
        dq3Var.i(y6j.e(this));
        ch3.d(context, null, ru.oneme.app.R.attr.chipStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Chip_Action);
        ch3.f(context, null, iArr, ru.oneme.app.R.attr.chipStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, iArr, ru.oneme.app.R.attr.chipStyle, ru.oneme.app.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.s = new bq3(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new b7(1, this));
        }
        setChecked(this.k);
        setText(dq3Var.F);
        setEllipsize(dq3Var.b2);
        g();
        if (!this.e.c2) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.o) {
            setMinHeight(this.q);
        }
        this.p = getLayoutDirection();
        super.setOnCheckedChangeListener(new xo3(this, 1));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.v;
        rectF.setEmpty();
        if (c() && this.h != null) {
            dq3 dq3Var = this.e;
            Rect bounds = dq3Var.getBounds();
            rectF.setEmpty();
            if (dq3Var.S()) {
                float f = dq3Var.D1 + dq3Var.C1 + dq3Var.o1 + dq3Var.B1 + dq3Var.A1;
                if (dq3Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.u;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private zlh getTextAppearance() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.K1.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.m != z2) {
            this.m = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.l != z2) {
            this.l = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.q = i;
        if (!this.o) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                int[] iArr = pqe.a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = pqe.a;
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.e.A));
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                int[] iArr3 = pqe.a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = pqe.a;
                    e();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = pqe.a;
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        int[] iArr6 = pqe.a;
        e();
    }

    public final boolean c() {
        dq3 dq3Var = this.e;
        if (dq3Var == null) {
            return false;
        }
        Drawable drawable = dq3Var.Y;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        dq3 dq3Var;
        if (!c() || (dq3Var = this.e) == null || !dq3Var.X || this.h == null) {
            i7j.l(this, null);
            this.t = false;
        } else {
            i7j.l(this, this.s);
            this.t = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.t) {
            return super.dispatchHoverEvent(motionEvent);
        }
        bq3 bq3Var = this.s;
        AccessibilityManager accessibilityManager = bq3Var.h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                cq3 cq3Var = bq3Var.n;
                if (cq3Var.c() && cq3Var.getCloseIconTouchBounds().contains(x2, y2)) {
                    i2 = 1;
                }
                int i3 = bq3Var.m;
                if (i3 != i2) {
                    bq3Var.m = i2;
                    bq3Var.p(i2, np0.m);
                    bq3Var.p(i3, np0.n);
                    return true;
                }
            } else if (action == 10 && (i = bq3Var.m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    bq3Var.m = Integer.MIN_VALUE;
                    bq3Var.p(Integer.MIN_VALUE, np0.m);
                    bq3Var.p(i, np0.n);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        cq3 cq3Var;
        View.OnClickListener onClickListener;
        if (!this.t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        bq3 bq3Var = this.s;
        bq3Var.getClass();
        boolean zM = false;
        int i2 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i2 < repeatCount && bq3Var.m(i3, null)) {
                                    i2++;
                                    z2 = true;
                                }
                                zM = z2;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = bq3Var.l;
                                if (i != Integer.MIN_VALUE) {
                                    cq3Var = bq3Var.n;
                                    if (i == 0) {
                                        cq3Var.performClick();
                                    } else if (i == 1) {
                                        cq3Var.playSoundEffect(0);
                                        onClickListener = cq3Var.h;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(cq3Var);
                                        }
                                        if (cq3Var.t) {
                                            cq3Var.s.p(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = bq3Var.l;
                    if (i != Integer.MIN_VALUE) {
                        cq3Var = bq3Var.n;
                        if (i == 0) {
                            cq3Var.performClick();
                        } else if (i == 1) {
                            cq3Var.playSoundEffect(0);
                            onClickListener = cq3Var.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(cq3Var);
                            }
                            if (cq3Var.t) {
                                cq3Var.s.p(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = bq3Var.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = bq3Var.m(1, null);
            }
        }
        if (!zM || bq3Var.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.er, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        dq3 dq3Var = this.e;
        boolean zV = false;
        if (dq3Var != null && dq3.t(dq3Var.Y)) {
            dq3 dq3Var2 = this.e;
            ?? IsEnabled = isEnabled();
            if (this.n) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.m) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.n) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.m) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.l) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(dq3Var2.Y1, iArr)) {
                dq3Var2.Y1 = iArr;
                if (dq3Var2.S()) {
                    zV = dq3Var2.v(dq3Var2.getState(), iArr);
                }
            }
        }
        if (zV) {
            invalidate();
        }
    }

    public final void e() {
        this.g = new RippleDrawable(pqe.c(this.e.E), getBackgroundDrawable(), null);
        this.e.getClass();
        RippleDrawable rippleDrawable = this.g;
        WeakHashMap weakHashMap = i7j.a;
        setBackground(rippleDrawable);
        f();
    }

    public final void f() {
        dq3 dq3Var;
        if (TextUtils.isEmpty(getText()) || (dq3Var = this.e) == null) {
            return;
        }
        int iQ = (int) (dq3Var.q() + dq3Var.D1 + dq3Var.A1);
        dq3 dq3Var2 = this.e;
        int iP = (int) (dq3Var2.p() + dq3Var2.w1 + dq3Var2.z1);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            iP += rect.left;
            iQ += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = i7j.a;
        setPaddingRelative(iP, paddingTop, iQ, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            paint.drawableState = dq3Var.getState();
        }
        zlh textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.w);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.r)) {
            return this.r;
        }
        dq3 dq3Var = this.e;
        if (dq3Var == null || !dq3Var.q1) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof iq3) && ((iq3) parent).h.d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.s1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.t1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return Math.max(0.0f, dq3Var.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.D1;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        dq3 dq3Var = this.e;
        if (dq3Var == null || (drawable = dq3Var.H) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.I;
        }
        return null;
    }

    public float getChipMinHeight() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.w1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        dq3 dq3Var = this.e;
        if (dq3Var == null || (drawable = dq3Var.Y) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.p1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.C1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.o1;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.B1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.n1;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.b2;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.t) {
            bq3 bq3Var = this.s;
            if (bq3Var.l == 1 || bq3Var.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public o1b getHideMotionSpec() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.v1;
        }
        return null;
    }

    public float getIconEndPadding() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.y1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.x1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.E;
        }
        return null;
    }

    public ywf getShapeAppearanceModel() {
        return this.e.a.a;
    }

    public o1b getShowMotionSpec() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.u1;
        }
        return null;
    }

    public float getTextEndPadding() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.A1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            return dq3Var.z1;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p90.P(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y);
        }
        dq3 dq3Var = this.e;
        if (dq3Var != null && dq3Var.q1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.t) {
            bq3 bq3Var = this.s;
            int i2 = bq3Var.l;
            if (i2 != Integer.MIN_VALUE) {
                bq3Var.j(i2);
            }
            if (z2) {
                bq3Var.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        dq3 dq3Var = this.e;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(dq3Var != null && dq3Var.q1);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof iq3) {
            iq3 iq3Var = (iq3) getParent();
            if (!iq3Var.c) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i2 >= iq3Var.getChildCount()) {
                    i = -1;
                    break;
                }
                View childAt = iq3Var.getChildAt(i2);
                if ((childAt instanceof cq3) && iq3Var.getChildAt(i2).getVisibility() == 0) {
                    if (((cq3) childAt) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i2++;
            }
            Object tag = getTag(ru.oneme.app.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) pgg.u(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.p != i) {
            this.p = i;
            f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.l) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z2 = true;
                }
                z2 = false;
            } else {
                if (this.l) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.t) {
                        this.s.p(1, 1);
                    }
                    z2 = true;
                }
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.er, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.er, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.w(z2);
        }
    }

    public void setCheckableResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.w(dq3Var.E1.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        dq3 dq3Var = this.e;
        if (dq3Var == null) {
            this.k = z2;
        } else if (dq3Var.q1) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.x(wk8.o(dq3Var.E1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.y(np4.l(dq3Var.E1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.z(dq3Var.E1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        dq3 dq3Var = this.e;
        if (dq3Var == null || dq3Var.z == colorStateList) {
            return;
        }
        dq3Var.z = colorStateList;
        dq3Var.onStateChange(dq3Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListL;
        dq3 dq3Var = this.e;
        if (dq3Var == null || dq3Var.z == (colorStateListL = np4.l(dq3Var.E1, i))) {
            return;
        }
        dq3Var.z = colorStateListL;
        dq3Var.onStateChange(dq3Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.A(dq3Var.E1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(dq3 dq3Var) {
        dq3 dq3Var2 = this.e;
        if (dq3Var2 != dq3Var) {
            if (dq3Var2 != null) {
                dq3Var2.a2 = new WeakReference(null);
            }
            this.e = dq3Var;
            dq3Var.c2 = false;
            dq3Var.a2 = new WeakReference(this);
            b(this.q);
        }
    }

    public void setChipEndPadding(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var == null || dq3Var.D1 == f) {
            return;
        }
        dq3Var.D1 = f;
        dq3Var.invalidateSelf();
        dq3Var.u();
    }

    public void setChipEndPaddingResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            float dimension = dq3Var.E1.getResources().getDimension(i);
            if (dq3Var.D1 != dimension) {
                dq3Var.D1 = dimension;
                dq3Var.invalidateSelf();
                dq3Var.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.B(wk8.o(dq3Var.E1, i));
        }
    }

    public void setChipIconSize(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.C(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.C(dq3Var.E1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.D(np4.l(dq3Var.E1, i));
        }
    }

    public void setChipIconVisible(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.E(dq3Var.E1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var == null || dq3Var.A == f) {
            return;
        }
        dq3Var.A = f;
        dq3Var.invalidateSelf();
        dq3Var.u();
    }

    public void setChipMinHeightResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            float dimension = dq3Var.E1.getResources().getDimension(i);
            if (dq3Var.A != dimension) {
                dq3Var.A = dimension;
                dq3Var.invalidateSelf();
                dq3Var.u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var == null || dq3Var.w1 == f) {
            return;
        }
        dq3Var.w1 = f;
        dq3Var.invalidateSelf();
        dq3Var.u();
    }

    public void setChipStartPaddingResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            float dimension = dq3Var.E1.getResources().getDimension(i);
            if (dq3Var.w1 != dimension) {
                dq3Var.w1 = dimension;
                dq3Var.invalidateSelf();
                dq3Var.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.F(np4.l(dq3Var.E1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.G(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.G(dq3Var.E1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        dq3 dq3Var = this.e;
        if (dq3Var == null || dq3Var.p1 == charSequence) {
            return;
        }
        String str2 = wv0.b;
        wv0 wv0Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? wv0.e : wv0.d;
        wv0Var.getClass();
        cmh cmhVar = emh.c;
        String str3 = wv0.c;
        String str4 = wv0.b;
        boolean z2 = wv0Var.a;
        if (charSequence == null) {
            spannableStringBuilder = null;
        } else {
            boolean zN = cmhVar.n(charSequence.length(), charSequence);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean zN2 = (zN ? emh.b : emh.a).n(charSequence.length(), charSequence);
            if (z2 || !(zN2 || wv0.a(charSequence) == 1)) {
                str = (!z2 || (zN2 && wv0.a(charSequence) != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder2.append((CharSequence) str);
            if (zN != z2) {
                spannableStringBuilder2.append(zN ? (char) 8235 : (char) 8234);
                spannableStringBuilder2.append(charSequence);
                spannableStringBuilder2.append((char) 8236);
            } else {
                spannableStringBuilder2.append(charSequence);
            }
            boolean zN3 = (zN ? emh.b : emh.a).n(charSequence.length(), charSequence);
            if (!z2 && (zN3 || wv0.b(charSequence) == 1)) {
                str3 = str4;
            } else if (!z2 || (zN3 && wv0.b(charSequence) != -1)) {
                str3 = "";
            }
            spannableStringBuilder2.append((CharSequence) str3);
            spannableStringBuilder = spannableStringBuilder2;
        }
        dq3Var.p1 = spannableStringBuilder;
        dq3Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.I(dq3Var.E1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.H(wk8.o(dq3Var.E1, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.J(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.J(dq3Var.E1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.K(dq3Var.E1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.L(np4.l(dq3Var.E1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.er, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            c.i("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            c.i("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.er, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            c.i("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            c.i("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            c.i("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            c.i("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            c.i("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            c.i("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            c.i("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.b2 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.o = z2;
        b(this.q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(o1b o1bVar) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.v1 = o1bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.v1 = o1b.a(dq3Var.E1, i);
        }
    }

    public void setIconEndPadding(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.N(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.N(dq3Var.E1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.O(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.O(dq3Var.E1.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(go9 go9Var) {
        this.j = go9Var;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            c.i("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            c.i("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.d2 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            c.i("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.P(colorStateList);
        }
        this.e.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.P(np4.l(dq3Var.E1, i));
            this.e.getClass();
            e();
        }
    }

    @Override // defpackage.kxf
    public void setShapeAppearanceModel(ywf ywfVar) {
        this.e.setShapeAppearanceModel(ywfVar);
    }

    public void setShowMotionSpec(o1b o1bVar) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.u1 = o1bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.u1 = o1b.a(dq3Var.E1, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
        } else {
            c.i("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        dq3 dq3Var = this.e;
        if (dq3Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(dq3Var.c2 ? null : charSequence, bufferType);
        dq3 dq3Var2 = this.e;
        if (dq3Var2 == null || TextUtils.equals(dq3Var2.F, charSequence)) {
            return;
        }
        dq3Var2.F = charSequence;
        dq3Var2.K1.e = true;
        dq3Var2.invalidateSelf();
        dq3Var2.u();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            Context context2 = dq3Var.E1;
            dq3Var.K1.b(new zlh(context2, i), context2);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var == null || dq3Var.A1 == f) {
            return;
        }
        dq3Var.A1 = f;
        dq3Var.invalidateSelf();
        dq3Var.u();
    }

    public void setTextEndPaddingResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            float dimension = dq3Var.E1.getResources().getDimension(i);
            if (dq3Var.A1 != dimension) {
                dq3Var.A1 = dimension;
                dq3Var.invalidateSelf();
                dq3Var.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            gmh gmhVar = dq3Var.K1;
            zlh zlhVar = gmhVar.g;
            if (zlhVar != null) {
                zlhVar.k = fApplyDimension;
                gmhVar.a.setTextSize(fApplyDimension);
                dq3Var.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        dq3 dq3Var = this.e;
        if (dq3Var == null || dq3Var.z1 == f) {
            return;
        }
        dq3Var.z1 = f;
        dq3Var.invalidateSelf();
        dq3Var.u();
    }

    public void setTextStartPaddingResource(int i) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            float dimension = dq3Var.E1.getResources().getDimension(i);
            if (dq3Var.z1 != dimension) {
                dq3Var.z1 = dimension;
                dq3Var.invalidateSelf();
                dq3Var.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.M(z2);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z2) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.E(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            c.i("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            c.i("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            c.i("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            c.i("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(zlh zlhVar) {
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            dq3Var.K1.b(zlhVar, dq3Var.E1);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        dq3 dq3Var = this.e;
        if (dq3Var != null) {
            Context context = dq3Var.E1;
            dq3Var.K1.b(new zlh(context, i), context);
        }
        g();
    }
}
