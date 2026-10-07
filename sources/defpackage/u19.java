package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u19 extends ViewGroup {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public int[] i;
    public int[] j;
    public Drawable k;
    public int l;
    public int m;
    public int n;
    public int o;

    public u19(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = l3e.n;
        vbf vbfVarK = vbf.k(context, attributeSet, iArr, 0);
        i7j.k(this, context, iArr, attributeSet, (TypedArray) vbfVarK.b, 0, 0);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.g = typedArray.getFloat(4, -1.0f);
        this.b = typedArray.getInt(3, -1);
        this.h = typedArray.getBoolean(7, false);
        setDividerDrawable(vbfVarK.d(5));
        this.n = typedArray.getInt(8, 0);
        this.o = typedArray.getDimensionPixelSize(6, 0);
        vbfVarK.l();
    }

    public final void c(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t19;
    }

    public final void d(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public t19 generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new t19(-2, -2);
        }
        if (i == 1) {
            return new t19(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public t19 generateLayoutParams(AttributeSet attributeSet) {
        return new t19(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public t19 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t19) {
            return new t19((t19) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new t19((ViewGroup.MarginLayoutParams) layoutParams) : new t19(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            ore.q("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            ore.q("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int bottom = this.c;
        if (this.d == 1 && (i = this.e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((t19) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.n;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.k == null) {
            return;
        }
        int i2 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((t19) childAt.getLayoutParams())).topMargin) - this.m);
                }
                i2++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.m;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((t19) childAt2.getLayoutParams())).bottomMargin;
                }
                c(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = r9j.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                t19 t19Var = (t19) childAt3.getLayoutParams();
                d(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) t19Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) t19Var).leftMargin) - this.l);
            }
            i2++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                t19 t19Var2 = (t19) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) t19Var2).leftMargin;
                    i = this.l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) t19Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.l;
                right = left - i;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0183  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        char c = 2;
        if (this.d == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i17 = i3 - i;
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i18 = this.e;
            int i19 = i18 & 112;
            int i20 = 8388615 & i18;
            if (i19 != 16) {
                paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f) / 2);
            }
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View childAt = getChildAt(i21);
                if (childAt != null && childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    t19 t19Var = (t19) childAt.getLayoutParams();
                    int i22 = ((LinearLayout.LayoutParams) t19Var).gravity;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i15 = ((LinearLayout.LayoutParams) t19Var).leftMargin + paddingLeft2;
                        } else {
                            i13 = paddingRight - measuredWidth;
                            i14 = ((LinearLayout.LayoutParams) t19Var).rightMargin;
                        }
                        if (h(i21)) {
                            paddingTop += this.m;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) t19Var).topMargin;
                        childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) t19Var).bottomMargin + i23;
                    } else {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) t19Var).leftMargin;
                        i14 = ((LinearLayout.LayoutParams) t19Var).rightMargin;
                    }
                    i15 = i13 - i14;
                    if (h(i21)) {
                        paddingTop += this.m;
                    }
                    int i24 = paddingTop + ((LinearLayout.LayoutParams) t19Var).topMargin;
                    childAt.layout(i15, i24, measuredWidth + i15, i24 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) t19Var).bottomMargin + i24;
                }
                i21++;
                c = c;
                i16 = 8;
            }
            return;
        }
        boolean z2 = r9j.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.e;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z4 = this.a;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.f) / 2);
        }
        if (z3) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i5 * i29) + i6;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    t19 t19Var2 = (t19) childAt2.getLayoutParams();
                    int i31 = paddingLeft;
                    if (z4) {
                        i8 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) t19Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) t19Var2).gravity;
                        if (i9 < 0) {
                            i9 = i28;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i11 = i8 + ((LinearLayout.LayoutParams) t19Var2).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) t19Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (h(i30)) {
                                i12 = i31 + this.l;
                            } else {
                                i12 = i31;
                            }
                            int i32 = i12 + ((LinearLayout.LayoutParams) t19Var2).leftMargin;
                            childAt2.layout(i32, i11, i32 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) t19Var2).rightMargin + i32;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) t19Var2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) t19Var2).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        if (h(i30)) {
                            i12 = i31 + this.l;
                        } else {
                            i12 = i31;
                        }
                        int i33 = i12 + ((LinearLayout.LayoutParams) t19Var2).leftMargin;
                        childAt2.layout(i33, i11, i33 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) t19Var2).rightMargin + i33;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = ((LinearLayout.LayoutParams) t19Var2).gravity;
                    if (i9 < 0) {
                        i9 = i28;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i11 = i8 + ((LinearLayout.LayoutParams) t19Var2).topMargin;
                            if (baseline != -1) {
                                i11 = (iArr[1] - baseline) + i11;
                            }
                        } else if (i10 != 80) {
                            i11 = i8;
                        } else {
                            i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) t19Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (h(i30)) {
                            i12 = i31 + this.l;
                        } else {
                            i12 = i31;
                        }
                        int i34 = i12 + ((LinearLayout.LayoutParams) t19Var2).leftMargin;
                        childAt2.layout(i34, i11, i34 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) t19Var2).rightMargin + i34;
                    } else {
                        i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) t19Var2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) t19Var2).bottomMargin;
                    }
                    i11 -= measuredHeight;
                    if (h(i30)) {
                        i12 = i31 + this.l;
                    } else {
                        i12 = i31;
                    }
                    int i35 = i12 + ((LinearLayout.LayoutParams) t19Var2).leftMargin;
                    childAt2.layout(i35, i11, i35 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) t19Var2).rightMargin + i35;
                }
                i29++;
                i6 = i7;
                paddingTop2 = i8;
            }
            i8 = paddingTop2;
            i29++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:229:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:232:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:234:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:236:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:238:0x051f  */
    /* JADX WARN: Code duplicated, block: B:244:0x052f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0536 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x0539  */
    /* JADX WARN: Code duplicated, block: B:251:0x0540 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0543  */
    /* JADX WARN: Code duplicated, block: B:368:0x0791  */
    /* JADX WARN: Code duplicated, block: B:64:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int baseline;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        t19 t19Var;
        View view;
        int i11;
        int[] iArr2;
        int i12;
        int i13;
        boolean z3;
        int i14;
        int measuredHeight;
        boolean z4;
        boolean z5;
        int iMax2;
        int i15;
        int baseline2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        int i21;
        int i22;
        int i23;
        View view2;
        boolean z7;
        u19 u19Var = this;
        int i24 = -2;
        int iMax3 = 0;
        int i25 = 1073741824;
        int i26 = 8;
        if (u19Var.d == 1) {
            u19Var.f = 0;
            int virtualChildCount = u19Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i27 = u19Var.b;
            boolean z8 = u19Var.h;
            int i28 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z9 = false;
            int i29 = 0;
            boolean z10 = false;
            boolean z11 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i28 < virtualChildCount) {
                int i30 = mode;
                View childAt = u19Var.getChildAt(i28);
                if (childAt == null) {
                    u19Var.f = u19Var.f;
                } else {
                    if (childAt.getVisibility() != i26) {
                        if (u19Var.h(i28)) {
                            u19Var.f += u19Var.m;
                        }
                        t19 t19Var2 = (t19) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) t19Var2).weight;
                        f += f2;
                        if (mode2 == i25 && ((LinearLayout.LayoutParams) t19Var2).height == 0 && f2 > 0.0f) {
                            int i31 = u19Var.f;
                            u19Var.f = Math.max(i31, ((LinearLayout.LayoutParams) t19Var2).topMargin + i31 + ((LinearLayout.LayoutParams) t19Var2).bottomMargin);
                            view2 = childAt;
                            i20 = mode2;
                            i21 = i27;
                            z6 = z8;
                            i22 = i28;
                            z9 = true;
                            i23 = i30;
                        } else {
                            if (((LinearLayout.LayoutParams) t19Var2).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) t19Var2).height = i24;
                                i19 = 0;
                            }
                            i20 = mode2;
                            z6 = z8;
                            i21 = i27;
                            i22 = i28;
                            i23 = i30;
                            u19Var.measureChildWithMargins(childAt, i, 0, i2, f == 0.0f ? u19Var.f : 0);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) t19Var2).height = i19;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i32 = u19Var.f;
                            view2 = childAt;
                            u19Var.f = Math.max(i32, i32 + measuredHeight2 + ((LinearLayout.LayoutParams) t19Var2).topMargin + ((LinearLayout.LayoutParams) t19Var2).bottomMargin);
                            if (z6) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i21 >= 0 && i21 == i22 + 1) {
                            u19Var.c = u19Var.f;
                        }
                        if (i22 < i21 && ((LinearLayout.LayoutParams) t19Var2).weight > 0.0f) {
                            ore.q("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                            return;
                        }
                        if (i23 == 1073741824 || ((LinearLayout.LayoutParams) t19Var2).width != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                            z10 = true;
                        }
                        int i33 = ((LinearLayout.LayoutParams) t19Var2).leftMargin + ((LinearLayout.LayoutParams) t19Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i33;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z12 = z7;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i29, measuredState);
                        if (z11) {
                            i29 = iCombineMeasuredStates;
                            boolean z13 = ((LinearLayout.LayoutParams) t19Var2).width == -1;
                            if (((LinearLayout.LayoutParams) t19Var2).weight > 0.0f) {
                                if (!z12) {
                                    i33 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i33);
                            } else {
                                if (!z12) {
                                    i33 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i33);
                            }
                            z11 = z13;
                        } else {
                            i29 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) t19Var2).weight > 0.0f) {
                            if (!z12) {
                                i33 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i33);
                        } else {
                            if (!z12) {
                                i33 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i33);
                        }
                        z11 = z13;
                    }
                    i28 = i22 + 1;
                    i27 = i21;
                    mode = i23;
                    z8 = z6;
                    mode2 = i20;
                    i24 = -2;
                    i25 = 1073741824;
                    i26 = 8;
                }
                i20 = mode2;
                i21 = i27;
                z6 = z8;
                i22 = i28;
                i23 = i30;
                i28 = i22 + 1;
                i27 = i21;
                mode = i23;
                z8 = z6;
                mode2 = i20;
                i24 = -2;
                i25 = 1073741824;
                i26 = 8;
            }
            int i34 = mode;
            int i35 = mode2;
            boolean z14 = z8;
            int i36 = i29;
            int i37 = i2;
            if (u19Var.f > 0 && u19Var.h(virtualChildCount)) {
                u19Var.f += u19Var.m;
            }
            if (z14 && (i35 == Integer.MIN_VALUE || i35 == 0)) {
                u19Var.f = 0;
                for (int i38 = 0; i38 < virtualChildCount; i38++) {
                    View childAt2 = u19Var.getChildAt(i38);
                    if (childAt2 == null) {
                        u19Var.f = u19Var.f;
                    } else if (childAt2.getVisibility() != 8) {
                        t19 t19Var3 = (t19) childAt2.getLayoutParams();
                        int i39 = u19Var.f;
                        u19Var.f = Math.max(i39, i39 + iMax6 + ((LinearLayout.LayoutParams) t19Var3).topMargin + ((LinearLayout.LayoutParams) t19Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = u19Var.getPaddingBottom() + u19Var.getPaddingTop() + u19Var.f;
            u19Var.f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, u19Var.getSuggestedMinimumHeight()), i37, 0);
            int i40 = (iResolveSizeAndState & 16777215) - u19Var.f;
            if (z9 || (i40 != 0 && f > 0.0f)) {
                float f3 = u19Var.g;
                if (f3 > 0.0f) {
                    f = f3;
                }
                u19Var.f = 0;
                int iCombineMeasuredStates2 = i36;
                int i41 = 0;
                while (i41 < virtualChildCount) {
                    View childAt3 = u19Var.getChildAt(i41);
                    if (childAt3.getVisibility() == 8) {
                        i41 = i41;
                    } else {
                        t19 t19Var4 = (t19) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) t19Var4).weight;
                        if (f4 > 0.0f) {
                            int i42 = (int) ((i40 * f4) / f);
                            f -= f4;
                            i40 -= i42;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, u19Var.getPaddingRight() + u19Var.getPaddingLeft() + ((LinearLayout.LayoutParams) t19Var4).leftMargin + ((LinearLayout.LayoutParams) t19Var4).rightMargin, ((LinearLayout.LayoutParams) t19Var4).width);
                            if (((LinearLayout.LayoutParams) t19Var4).height == 0) {
                                i18 = 1073741824;
                                if (i35 == 1073741824) {
                                    if (i42 <= 0) {
                                        i42 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i18 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i42;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i18));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i43 = ((LinearLayout.LayoutParams) t19Var4).leftMargin + ((LinearLayout.LayoutParams) t19Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i43;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i34 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) t19Var4).width == -1) {
                                measuredWidth2 = i43;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z15 = z11 && ((LinearLayout.LayoutParams) t19Var4).width == i17;
                        int i44 = u19Var.f;
                        u19Var.f = Math.max(i44, childAt3.getMeasuredHeight() + i44 + ((LinearLayout.LayoutParams) t19Var4).topMargin + ((LinearLayout.LayoutParams) t19Var4).bottomMargin);
                        z11 = z15;
                    }
                    i41++;
                }
                u19Var.f = u19Var.getPaddingBottom() + u19Var.getPaddingTop() + u19Var.f;
                i36 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z14 && i35 != 1073741824) {
                    for (int i45 = 0; i45 < virtualChildCount; i45++) {
                        View childAt4 = u19Var.getChildAt(i45);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t19) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z11 || i34 == 1073741824) {
                iMax4 = iMax3;
            }
            u19Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(u19Var.getPaddingRight() + u19Var.getPaddingLeft() + iMax4, u19Var.getSuggestedMinimumWidth()), i, i36), iResolveSizeAndState);
            if (z10) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u19Var.getMeasuredWidth(), 1073741824);
                int i46 = 0;
                while (i46 < virtualChildCount) {
                    View childAt5 = u19Var.getChildAt(i46);
                    if (childAt5.getVisibility() != 8) {
                        t19 t19Var5 = (t19) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) t19Var5).width == -1) {
                            int i47 = ((LinearLayout.LayoutParams) t19Var5).height;
                            ((LinearLayout.LayoutParams) t19Var5).height = childAt5.getMeasuredHeight();
                            u19Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i37, 0);
                            ((LinearLayout.LayoutParams) t19Var5).height = i47;
                        }
                    }
                    i46++;
                    i37 = i2;
                }
                return;
            }
            return;
        }
        int i48 = i;
        u19Var.f = 0;
        int virtualChildCount2 = u19Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i48);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (u19Var.i == null || u19Var.j == null) {
            u19Var.i = new int[4];
            u19Var.j = new int[4];
        }
        int[] iArr3 = u19Var.i;
        int[] iArr4 = u19Var.j;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = u19Var.a;
        boolean z17 = u19Var.h;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i49 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = u19Var.getChildAt(i49);
            if (childAt6 == null) {
                u19Var.f = u19Var.f;
                i10 = i49;
                i15 = i51;
                iArr2 = iArr3;
                iArr = iArr4;
                z = z16;
                z2 = z17;
            } else {
                int i52 = i50;
                if (childAt6.getVisibility() == 8) {
                    i48 = i;
                    i10 = i49;
                    i15 = i51;
                    iArr = iArr4;
                    z = z16;
                    z2 = z17;
                    i50 = i52;
                    iArr2 = iArr3;
                } else {
                    if (u19Var.h(i49)) {
                        u19Var.f += u19Var.l;
                    }
                    t19 t19Var6 = (t19) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) t19Var6).weight;
                    f5 += f6;
                    int i53 = i49;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) t19Var6).width == 0 && f6 > 0.0f) {
                        int i54 = u19Var.f;
                        int i55 = ((LinearLayout.LayoutParams) t19Var6).leftMargin;
                        if (z18) {
                            u19Var.f = i55 + ((LinearLayout.LayoutParams) t19Var6).rightMargin + i54;
                        } else {
                            u19Var.f = Math.max(i54, i54 + i55 + ((LinearLayout.LayoutParams) t19Var6).rightMargin);
                        }
                        if (z16) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            i11 = i52;
                            i10 = i53;
                            t19Var = t19Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i48 = i;
                            i12 = i51;
                            i9 = iMax7;
                        } else {
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            z21 = true;
                            i11 = i52;
                            i10 = i53;
                            i13 = 1073741824;
                            t19Var = t19Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i48 = i;
                            i12 = i51;
                            i9 = iMax7;
                        }
                        if (mode4 == i13 && ((LinearLayout.LayoutParams) t19Var).height == -1) {
                            z3 = true;
                            z20 = true;
                        } else {
                            z3 = false;
                        }
                        i14 = ((LinearLayout.LayoutParams) t19Var).topMargin + ((LinearLayout.LayoutParams) t19Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i14;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                            baseline2 = view.getBaseline();
                            z4 = z3;
                            if (baseline2 != -1) {
                                i16 = ((LinearLayout.LayoutParams) t19Var).gravity;
                                if (i16 < 0) {
                                    i16 = u19Var.e;
                                }
                                int i56 = (((i16 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i56] = Math.max(iArr2[i56], baseline2);
                                iArr[i56] = Math.max(iArr[i56], measuredHeight - baseline2);
                            }
                        } else {
                            z4 = z3;
                        }
                        int iMax9 = Math.max(i11, measuredHeight);
                        if (z19 || ((LinearLayout.LayoutParams) t19Var).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) t19Var).weight > 0.0f) {
                            if (!z4) {
                                i14 = measuredHeight;
                            }
                            iMax7 = Math.max(i9, i14);
                            iMax2 = i12;
                        } else {
                            if (!z4) {
                                i14 = measuredHeight;
                            }
                            iMax2 = Math.max(i12, i14);
                            iMax7 = i9;
                        }
                        int i57 = iMax2;
                        i50 = iMax9;
                        i15 = i57;
                        z19 = z5;
                    } else {
                        if (((LinearLayout.LayoutParams) t19Var6).width != 0 || f6 <= 0.0f) {
                            i8 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) t19Var6).width = -2;
                            i8 = 0;
                        }
                        iArr = iArr4;
                        i9 = iMax7;
                        i10 = i53;
                        z = z16;
                        z2 = z17;
                        int i58 = i8;
                        t19Var = t19Var6;
                        view = childAt6;
                        i11 = i52;
                        i48 = i;
                        iArr2 = iArr3;
                        i12 = i51;
                        u19Var.measureChildWithMargins(view, i48, f5 == 0.0f ? u19Var.f : 0, i2, 0);
                        if (i58 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t19Var).width = i58;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        int i59 = u19Var.f;
                        int i60 = ((LinearLayout.LayoutParams) t19Var).leftMargin;
                        if (z18) {
                            u19Var.f = i60 + measuredWidth3 + ((LinearLayout.LayoutParams) t19Var).rightMargin + i59;
                        } else {
                            u19Var.f = Math.max(i59, i59 + measuredWidth3 + i60 + ((LinearLayout.LayoutParams) t19Var).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i13 = 1073741824;
                    if (mode4 == i13) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i14 = ((LinearLayout.LayoutParams) t19Var).topMargin + ((LinearLayout.LayoutParams) t19Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i14;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z) {
                        baseline2 = view.getBaseline();
                        z4 = z3;
                        if (baseline2 != -1) {
                            i16 = ((LinearLayout.LayoutParams) t19Var).gravity;
                            if (i16 < 0) {
                                i16 = u19Var.e;
                            }
                            int i510 = (((i16 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i510] = Math.max(iArr2[i510], baseline2);
                            iArr[i510] = Math.max(iArr[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z4 = z3;
                    }
                    int iMax10 = Math.max(i11, measuredHeight);
                    if (z19) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) t19Var).weight > 0.0f) {
                        if (!z4) {
                            i14 = measuredHeight;
                        }
                        iMax7 = Math.max(i9, i14);
                        iMax2 = i12;
                    } else {
                        if (!z4) {
                            i14 = measuredHeight;
                        }
                        iMax2 = Math.max(i12, i14);
                        iMax7 = i9;
                    }
                    int i511 = iMax2;
                    i50 = iMax10;
                    i15 = i511;
                    z19 = z5;
                }
            }
            i51 = i15;
            i49 = i10 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z;
            z17 = z2;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z22 = z16;
        boolean z23 = z17;
        int i61 = i50;
        int i62 = i51;
        int i63 = iMax7;
        if (u19Var.f > 0 && u19Var.h(virtualChildCount2)) {
            u19Var.f += u19Var.l;
        }
        int i64 = iArr5[1];
        int iMax11 = (i64 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i61 : Math.max(i61, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i64, iArr5[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            u19Var.f = 0;
            for (int i65 = 0; i65 < virtualChildCount2; i65++) {
                View childAt7 = u19Var.getChildAt(i65);
                if (childAt7 == null) {
                    u19Var.f = u19Var.f;
                } else if (childAt7.getVisibility() != 8) {
                    t19 t19Var7 = (t19) childAt7.getLayoutParams();
                    int i66 = u19Var.f;
                    if (z18) {
                        u19Var.f = ((LinearLayout.LayoutParams) t19Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) t19Var7).rightMargin + i66;
                    } else {
                        u19Var.f = Math.max(i66, i66 + iMax8 + ((LinearLayout.LayoutParams) t19Var7).leftMargin + ((LinearLayout.LayoutParams) t19Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = u19Var.getPaddingRight() + u19Var.getPaddingLeft() + u19Var.f;
        u19Var.f = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, u19Var.getSuggestedMinimumWidth()), i48, 0);
        int i67 = (iResolveSizeAndState2 & 16777215) - u19Var.f;
        if (z21 || (i67 != 0 && f5 > 0.0f)) {
            float f7 = u19Var.g;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            u19Var.f = 0;
            iMax11 = -1;
            int i68 = 0;
            while (i68 < virtualChildCount2) {
                View childAt8 = u19Var.getChildAt(i68);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    t19 t19Var8 = (t19) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) t19Var8).weight;
                    if (f8 > 0.0f) {
                        int i69 = (int) ((i67 * f8) / f5);
                        f5 -= f8;
                        i67 -= i69;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, u19Var.getPaddingBottom() + u19Var.getPaddingTop() + ((LinearLayout.LayoutParams) t19Var8).topMargin + ((LinearLayout.LayoutParams) t19Var8).bottomMargin, ((LinearLayout.LayoutParams) t19Var8).height);
                        if (((LinearLayout.LayoutParams) t19Var8).width == 0) {
                            i7 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i69 <= 0) {
                                    i69 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i69, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i7 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i69;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i7), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    int i70 = u19Var.f;
                    if (z18) {
                        u19Var.f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) t19Var8).leftMargin + ((LinearLayout.LayoutParams) t19Var8).rightMargin + i70;
                    } else {
                        u19Var.f = Math.max(i70, childAt8.getMeasuredWidth() + i70 + ((LinearLayout.LayoutParams) t19Var8).leftMargin + ((LinearLayout.LayoutParams) t19Var8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) t19Var8).height == -1;
                    int i71 = ((LinearLayout.LayoutParams) t19Var8).topMargin + ((LinearLayout.LayoutParams) t19Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i71;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z24) {
                        i71 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i62, i71);
                    if (z19) {
                        i6 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) t19Var8).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i6) {
                            int i72 = ((LinearLayout.LayoutParams) t19Var8).gravity;
                            if (i72 < 0) {
                                i72 = u19Var.e;
                            }
                            int i73 = (((i72 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i73] = Math.max(iArr5[i73], baseline);
                            iArr6[i73] = Math.max(iArr6[i73], measuredHeight4 - baseline);
                        }
                        z19 = z25;
                        i62 = iMax12;
                    } else {
                        i6 = -1;
                    }
                    if (!z22) {
                    }
                    z19 = z25;
                    i62 = iMax12;
                }
                i68++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            u19Var.f = u19Var.getPaddingRight() + u19Var.getPaddingLeft() + u19Var.f;
            int i74 = iArr5[1];
            if (i74 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i74, iArr5[c3]))));
            }
            iMax = i62;
        } else {
            iMax = Math.max(i62, i63);
            if (z23 && mode3 != 1073741824) {
                for (int i75 = 0; i75 < virtualChildCount2; i75++) {
                    View childAt9 = u19Var.getChildAt(i75);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t19) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        u19Var.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(u19Var.getPaddingBottom() + u19Var.getPaddingTop() + iMax11, u19Var.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z20) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(u19Var.getMeasuredHeight(), 1073741824);
            int i76 = i5;
            while (i76 < virtualChildCount2) {
                View childAt10 = u19Var.getChildAt(i76);
                if (childAt10.getVisibility() != 8) {
                    t19 t19Var9 = (t19) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) t19Var9).height == -1) {
                        int i77 = ((LinearLayout.LayoutParams) t19Var9).width;
                        ((LinearLayout.LayoutParams) t19Var9).width = childAt10.getMeasuredWidth();
                        u19Var.measureChildWithMargins(childAt10, i48, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) t19Var9).width = i77;
                    }
                }
                i76++;
                u19Var = this;
                i48 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            c.d(getChildCount(), ")", "base aligned child index out of range (0, ");
        } else {
            this.b = i;
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.e;
        if ((i3 & 112) != i2) {
            this.e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
