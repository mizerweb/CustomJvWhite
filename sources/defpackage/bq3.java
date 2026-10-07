package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bq3 extends l4 {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final so2 p = new so2(25);
    public static final er3 q = new er3();
    public final AccessibilityManager h;
    public final cq3 i;
    public jh6 j;
    public final /* synthetic */ cq3 n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public bq3(cq3 cq3Var, cq3 cq3Var2) {
        this.n = cq3Var;
        this.i = cq3Var2;
        this.h = (AccessibilityManager) cq3Var2.getContext().getSystemService("accessibility");
        cq3Var2.setFocusable(true);
        WeakHashMap weakHashMap = i7j.a;
        if (cq3Var2.getImportantForAccessibility() == 0) {
            cq3Var2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.l4
    public final ex8 b(View view) {
        if (this.j == null) {
            this.j = new jh6(this);
        }
        return this.j;
    }

    @Override // defpackage.l4
    public final void d(View view, x4 x4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = x4Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        cq3 cq3Var = this.n;
        dq3 dq3Var = cq3Var.e;
        accessibilityNodeInfo.setCheckable(dq3Var != null && dq3Var.q1);
        accessibilityNodeInfo.setClickable(cq3Var.isClickable());
        x4Var.h(cq3Var.getAccessibilityClassName());
        accessibilityNodeInfo.setText(cq3Var.getText());
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        if (i == 1) {
            cq3 cq3Var = this.n;
            cq3Var.n = false;
            cq3Var.refreshDrawableState();
        }
        p(i, 8);
        return true;
    }

    public final x4 k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        x4 x4Var = new x4(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        x4Var.h("android.view.View");
        Rect rect = o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        cq3 cq3Var = this.i;
        accessibilityNodeInfoObtain.setParent(cq3Var);
        AccessibilityNodeInfo accessibilityNodeInfo = x4Var.a;
        if (i == 1) {
            cq3 cq3Var2 = this.n;
            CharSequence closeIconContentDescription = cq3Var2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = cq3Var2.getText();
                accessibilityNodeInfo.setContentDescription(cq3Var2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(cq3Var2.getCloseIconTouchBoundsInt());
            x4Var.b(s4.e);
            accessibilityNodeInfo.setEnabled(cq3Var2.isEnabled());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(cq3.x);
        }
        if (x4Var.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            ore.q("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        x4Var.f(rect2);
        if (rect2.equals(rect)) {
            ore.q("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            ore.q("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & np0.m) != 0) {
            ore.q("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(cq3Var.getContext().getPackageName());
        x4Var.b = i;
        accessibilityNodeInfoObtain.setSource(cq3Var, i);
        if (this.k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            x4Var.a(np0.m);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            x4Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            x4Var.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            x4Var.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        cq3Var.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            x4Var.f(rect3);
            rect3.offset(iArr[0] - cq3Var.getScrollX(), iArr[1] - cq3Var.getScrollY());
        }
        Rect rect4 = this.f;
        if (cq3Var.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - cq3Var.getScrollX(), iArr[1] - cq3Var.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && cq3Var.getWindowVisibility() == 0) {
                    Object parent = cq3Var.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoObtain.setVisibleToUser(true);
                    }
                }
            }
        }
        return x4Var;
    }

    public final void l(ArrayList arrayList) {
        dq3 dq3Var;
        arrayList.add(0);
        cq3 cq3Var = this.n;
        if (!cq3Var.c() || (dq3Var = cq3Var.e) == null || !dq3Var.X || cq3Var.h == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0145  */
    public final boolean m(int i, Rect rect) {
        int i2;
        Object obj;
        x4 x4Var;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        keg kegVar = new keg(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            kegVar.b(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int i5 = Integer.MIN_VALUE;
        x4 x4Var2 = i4 == Integer.MIN_VALUE ? null : (x4) kegVar.a(i4);
        so2 so2Var = p;
        er3 er3Var = q;
        cq3 cq3Var = this.i;
        int i6 = -1;
        if (i == 1 || i == 2) {
            WeakHashMap weakHashMap = i7j.a;
            boolean z = cq3Var.getLayoutDirection() == 1;
            er3Var.getClass();
            int i7 = kegVar.c;
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList2.add((x4) kegVar.c(i8));
            }
            Collections.sort(arrayList2, new q17(z, so2Var));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (x4Var2 != null) {
                    size = arrayList2.indexOf(x4Var2);
                }
                int i9 = size - 1;
                obj = i9 >= 0 ? arrayList2.get(i9) : null;
            } else {
                if (i != 2) {
                    ore.p("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (x4Var2 == null ? -1 : arrayList2.lastIndexOf(x4Var2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            x4Var = (x4) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                ore.p("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i10 = this.l;
            if (i10 != Integer.MIN_VALUE) {
                n(i10).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = cq3Var.getWidth();
                int height = cq3Var.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            er3Var.getClass();
            int i11 = kegVar.c;
            Rect rect4 = new Rect();
            x4Var = null;
            for (int i12 = 0; i12 < i11; i12++) {
                x4 x4Var3 = (x4) kegVar.c(i12);
                if (x4Var3 != x4Var2) {
                    so2Var.getClass();
                    x4Var3.f(rect4);
                    if (myl.d(i, rect2, rect4)) {
                        if (!myl.d(i, rect2, rect3) || myl.a(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            x4Var = x4Var3;
                        } else if (!myl.a(i, rect2, rect3, rect4)) {
                            int iE = myl.e(i, rect2, rect4);
                            int iF = myl.f(i, rect2, rect4);
                            int i13 = (iF * iF) + (iE * 13 * iE);
                            int iE2 = myl.e(i, rect2, rect3);
                            int iF2 = myl.f(i, rect2, rect3);
                            if (i13 < (iF2 * iF2) + (iE2 * 13 * iE2)) {
                                rect3.set(rect4);
                                x4Var = x4Var3;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        x4 x4Var4 = x4Var;
        if (x4Var4 != null) {
            int i14 = kegVar.c;
            for (int i15 = i2; i15 < i14; i15++) {
                if (kegVar.b[i15] == x4Var4) {
                    i6 = i15;
                    break;
                }
            }
            i5 = kegVar.a[i6];
        }
        return o(i5);
    }

    public final x4 n(int i) {
        if (i != -1) {
            return k(i);
        }
        cq3 cq3Var = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(cq3Var);
        x4 x4Var = new x4(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = i7j.a;
        cq3Var.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            ore.q("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            x4Var.a.addChild(cq3Var, ((Integer) arrayList.get(i2)).intValue());
        }
        return x4Var;
    }

    public final boolean o(int i) {
        int i2;
        cq3 cq3Var = this.i;
        if ((!cq3Var.isFocused() && !cq3Var.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        if (i == 1) {
            cq3 cq3Var2 = this.n;
            cq3Var2.n = true;
            cq3Var2.refreshDrawableState();
        }
        p(i, 8);
        return true;
    }

    public final void p(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            x4 x4VarN = n(i);
            accessibilityEventObtain.getText().add(x4VarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = x4VarN.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                ore.q("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                accessibilityEventObtain.setSource(view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
