package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class g11 extends l4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ g11(ViewGroup viewGroup, int i) {
        this.d = i;
        this.e = viewGroup;
    }

    @Override // defpackage.l4
    public final void d(View view, x4 x4Var) {
        int i = this.d;
        ViewGroup viewGroup = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = x4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                x4Var.h(wgh.class.getName());
                h11 h11Var = (h11) viewGroup;
                ViewParent parent = h11Var.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                x4Var.i(pgg.u(h11Var.isSelected(), 0, 1, viewGroup2 != null ? viewGroup2.indexOfChild(h11Var) : -1, 1));
                accessibilityNodeInfo.setSelected(h11Var.isSelected());
                accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", np4.q(h11Var.getContext(), R.string.bottom_bar_view_accessibility_tab_role_description));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = x4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) w4.m(1, ((txb) viewGroup).getChildCount(), 1).a);
                break;
        }
    }
}
