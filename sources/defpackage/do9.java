package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class do9 extends LinearLayout {
    public final ArrayList a;
    public final ks9 b;
    public final LinkedHashSet c;
    public final mu1 d;
    public Integer[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final int i;
    public HashSet j;

    public do9(Context context) {
        super(p90.T(context, null, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), null, R.attr.materialButtonToggleGroupStyle);
        this.a = new ArrayList();
        this.b = new ks9(19, this);
        this.c = new LinkedHashSet();
        this.d = new mu1(6, this);
        this.f = false;
        this.j = new HashSet();
        TypedArray typedArrayB = ch3.B(getContext(), null, k3e.r, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayB.getBoolean(3, false));
        this.i = typedArrayB.getResourceId(1, -1);
        this.h = typedArrayB.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayB.getBoolean(0, true));
        typedArrayB.recycle();
        WeakHashMap weakHashMap = i7j.a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof zn9) && c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(zn9 zn9Var) {
        if (zn9Var.getId() == -1) {
            WeakHashMap weakHashMap = i7j.a;
            zn9Var.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(zn9 zn9Var) {
        zn9Var.setMaxLines(1);
        zn9Var.setEllipsize(TextUtils.TruncateAt.END);
        zn9Var.setCheckable(true);
        zn9Var.setOnPressedChangeListenerInternal(this.b);
        zn9Var.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            zn9 zn9Var = (zn9) getChildAt(i);
            int iMin = Math.min(zn9Var.getStrokeWidth(), ((zn9) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = zn9Var.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            zn9Var.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((zn9) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof zn9)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        zn9 zn9Var = (zn9) view;
        setGeneratedIdIfNeeded(zn9Var);
        setupButtonChild(zn9Var);
        b(zn9Var.getId(), zn9Var.o);
        ywf shapeAppearanceModel = zn9Var.getShapeAppearanceModel();
        this.a.add(new co9(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
        zn9Var.setEnabled(isEnabled());
        i7j.l(zn9Var, new bo9(this));
    }

    public final void b(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.j;
        this.j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((zn9) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof zn9) {
                this.f = true;
                ((zn9) viewFindViewById).setChecked(zContains);
                this.f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean zContains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = ((yu) it.next()).a;
                    zv8[] zv8VarArr = AppearanceSettingsMultiThemeScreen.i;
                    if (zContains2) {
                        lv lvVarO1 = appearanceSettingsMultiThemeScreen.o1();
                        a8j.t(lvVarO1, ((n0c) lvVarO1.H()).a(), new kv(id, lvVarO1, null), 2);
                    }
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((zn9) getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i;
        co9 co9Var;
        mt4 mt4Var;
        mt4 f0Var;
        mt4 f0Var2;
        mt4 f0Var3;
        do9 do9Var = this;
        int childCount = do9Var.getChildCount();
        int firstVisibleChildIndex = do9Var.getFirstVisibleChildIndex();
        int lastVisibleChildIndex = do9Var.getLastVisibleChildIndex();
        int i2 = 0;
        while (i2 < childCount) {
            zn9 zn9Var = (zn9) do9Var.getChildAt(i2);
            if (zn9Var.getVisibility() == 8) {
                i = childCount;
            } else {
                ywf shapeAppearanceModel = zn9Var.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                yab yabVar = shapeAppearanceModel.a;
                yab yabVar2 = shapeAppearanceModel.b;
                yab yabVar3 = shapeAppearanceModel.c;
                yab yabVar4 = shapeAppearanceModel.d;
                cy5 cy5Var = shapeAppearanceModel.i;
                cy5 cy5Var2 = shapeAppearanceModel.j;
                cy5 cy5Var3 = shapeAppearanceModel.k;
                cy5 cy5Var4 = shapeAppearanceModel.l;
                co9 co9Var2 = (co9) do9Var.a.get(i2);
                if (firstVisibleChildIndex == lastVisibleChildIndex) {
                    i = childCount;
                } else {
                    boolean z = do9Var.getOrientation() == 0;
                    f0 f0Var4 = co9.e;
                    if (i2 != firstVisibleChildIndex) {
                        i = childCount;
                        if (i2 != lastVisibleChildIndex) {
                            co9Var2 = null;
                        } else if (z) {
                            co9Var = e9i.h0(this) ? new co9(co9Var2.a, co9Var2.d, f0Var4, f0Var4) : new co9(f0Var4, f0Var4, co9Var2.b, co9Var2.c);
                        } else {
                            co9Var = new co9(f0Var4, co9Var2.d, f0Var4, co9Var2.c);
                        }
                    } else if (!z) {
                        i = childCount;
                        co9Var = new co9(co9Var2.a, f0Var4, co9Var2.b, f0Var4);
                    } else if (e9i.h0(do9Var)) {
                        i = childCount;
                        co9Var = new co9(f0Var4, f0Var4, co9Var2.b, co9Var2.c);
                    } else {
                        i = childCount;
                        co9Var = new co9(co9Var2.a, co9Var2.d, f0Var4, f0Var4);
                    }
                    co9Var2 = co9Var;
                }
                if (co9Var2 == null) {
                    f0 f0Var5 = new f0(0.0f);
                    f0Var2 = new f0(0.0f);
                    f0Var3 = new f0(0.0f);
                    f0Var = new f0(0.0f);
                    mt4Var = f0Var5;
                } else {
                    mt4Var = co9Var2.a;
                    f0Var = co9Var2.d;
                    f0Var2 = co9Var2.b;
                    f0Var3 = co9Var2.c;
                }
                ywf ywfVar = new ywf();
                ywfVar.a = yabVar;
                ywfVar.b = yabVar2;
                ywfVar.c = yabVar3;
                ywfVar.d = yabVar4;
                ywfVar.e = mt4Var;
                ywfVar.f = f0Var2;
                ywfVar.g = f0Var3;
                ywfVar.h = f0Var;
                ywfVar.i = cy5Var;
                ywfVar.j = cy5Var2;
                ywfVar.k = cy5Var3;
                ywfVar.l = cy5Var4;
                zn9Var.setShapeAppearanceModel(ywfVar);
            }
            i2++;
            do9Var = this;
            firstVisibleChildIndex = firstVisibleChildIndex;
            childCount = i;
        }
    }

    public int getCheckedButtonId() {
        if (!this.g || this.j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((zn9) getChildAt(i)).getId();
            if (this.j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) w4.m(1, getVisibleButtonCount(), this.g ? 1 : 2).a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof zn9) {
            ((zn9) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.a.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((zn9) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.h = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.g != z) {
            this.g = z;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((zn9) getChildAt(i)).setA11yClassName((this.g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
