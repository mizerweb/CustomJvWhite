package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iq3 extends s07 {
    public int e;
    public int f;
    public gq3 g;
    public final sp3 h;
    public final int i;
    public final hq3 j;

    /* JADX WARN: Illegal instructions before constructor call */
    public iq3(Context context) {
        Context contextT = p90.T(context, null, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextT, null, R.attr.chipGroupStyle);
        this.c = false;
        TypedArray typedArrayObtainStyledAttributes = contextT.getTheme().obtainStyledAttributes(null, k3e.n, 0, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        sp3 sp3Var = new sp3();
        this.h = sp3Var;
        vzb vzbVar = (vzb) this;
        hq3 hq3Var = new hq3(vzbVar);
        this.j = hq3Var;
        TypedArray typedArrayB = ch3.B(getContext(), null, k3e.h, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayB.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayB.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayB.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayB.getBoolean(5, false));
        setSingleSelection(typedArrayB.getBoolean(6, false));
        setSelectionRequired(typedArrayB.getBoolean(4, false));
        this.i = typedArrayB.getResourceId(0, -1);
        typedArrayB.recycle();
        sp3Var.c = new vn7(10, vzbVar);
        super.setOnHierarchyChangeListener(hq3Var);
        WeakHashMap weakHashMap = i7j.a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof cq3) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof eq3);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new eq3(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new eq3(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.h.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.h.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.e;
    }

    public int getChipSpacingVertical() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            sp3 sp3Var = this.h;
            cq3 cq3Var = (cq3) sp3Var.a.get(Integer.valueOf(i));
            if (cq3Var != null && sp3Var.a(cq3Var)) {
                sp3Var.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) w4.m(getRowCount(), this.c ? getVisibleChipCount() : -1, this.h.d ? 1 : 2).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.e != i) {
            this.e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f != i) {
            this.f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(fq3 fq3Var) {
        if (fq3Var == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new zo7(10, this));
        }
    }

    public void setOnCheckedStateChangeListener(gq3 gq3Var) {
        this.g = gq3Var;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.h.e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        sp3 sp3Var = this.h;
        if (sp3Var.d != z) {
            sp3Var.d = z;
            boolean zIsEmpty = sp3Var.b.isEmpty();
            Iterator it = sp3Var.a.values().iterator();
            while (it.hasNext()) {
                sp3Var.e((cq3) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            sp3Var.d();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new eq3(layoutParams);
    }

    @Override // defpackage.s07
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
