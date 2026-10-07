package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vn9 extends br {
    public final w79 e;
    public final AccessibilityManager f;
    public final int g;
    public final float h;
    public ColorStateList i;
    public int j;
    public ColorStateList k;

    public vn9(Context context, AttributeSet attributeSet) {
        super(p90.T(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        new Rect();
        Context context2 = getContext();
        TypedArray typedArrayB = ch3.B(context2, attributeSet, k3e.p, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayB.hasValue(0) && typedArrayB.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.g = typedArrayB.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        int i = 1;
        this.h = typedArrayB.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayB.hasValue(2)) {
            this.i = ColorStateList.valueOf(typedArrayB.getColor(2, 0));
        }
        this.j = typedArrayB.getColor(4, 0);
        this.k = cqk.r(context2, typedArrayB, 5);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        w79 w79Var = new w79(context2, null, R.attr.listPopupWindowStyle, 0);
        this.e = w79Var;
        w79Var.y = true;
        es esVar = w79Var.z;
        esVar.setFocusable(true);
        w79Var.o = this;
        esVar.setInputMethodMode(2);
        w79Var.k(getAdapter());
        w79Var.p = new ps(i, this);
        if (typedArrayB.hasValue(6)) {
            setSimpleItems(typedArrayB.getResourceId(6, 0));
        }
        typedArrayB.recycle();
    }

    public static void a(vn9 vn9Var, Object obj) {
        vn9Var.setText(vn9Var.convertSelectionToString(obj), false);
    }

    public final boolean b() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (b()) {
            this.e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.i;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.h;
    }

    public int getSimpleItemSelectedColor() {
        return this.j;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.k;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            getAdapter();
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (b()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.e.k(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        w79 w79Var = this.e;
        if (w79Var != null) {
            w79Var.o(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof jo9) {
            ((jo9) dropDownBackground).j(this.i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.e.q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.j = i;
        if (getAdapter() instanceof un9) {
            ((un9) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.k = colorStateList;
        if (getAdapter() instanceof un9) {
            ((un9) getAdapter()).a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new un9(this, getContext(), this.g, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (b()) {
            this.e.m();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
