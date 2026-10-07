package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class mq extends l4 {
    public final /* synthetic */ rq d;
    public final /* synthetic */ et4 e;
    public final /* synthetic */ AppBarLayout$BaseBehavior f;

    public mq(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, rq rqVar, et4 et4Var) {
        this.f = appBarLayout$BaseBehavior;
        this.d = rqVar;
        this.e = et4Var;
    }

    @Override // defpackage.l4
    public final void d(View view, x4 x4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, x4Var.a);
        x4Var.h(ScrollView.class.getName());
        rq rqVar = this.d;
        if (rqVar.getTotalScrollRange() == 0) {
            return;
        }
        et4 et4Var = this.e;
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.f;
        View viewU = AppBarLayout$BaseBehavior.u(appBarLayout$BaseBehavior, et4Var);
        if (viewU == null) {
            return;
        }
        int childCount = rqVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((pq) rqVar.getChildAt(i).getLayoutParams()).a != 0) {
                if (appBarLayout$BaseBehavior.x() != (-rqVar.getTotalScrollRange())) {
                    x4Var.b(s4.f);
                    x4Var.j(true);
                }
                if (appBarLayout$BaseBehavior.x() != 0) {
                    if (!viewU.canScrollVertically(-1)) {
                        x4Var.b(s4.g);
                        x4Var.j(true);
                        return;
                    } else {
                        if ((-rqVar.getDownNestedPreScrollRange()) != 0) {
                            x4Var.b(s4.g);
                            x4Var.j(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.l4
    public final boolean g(View view, int i, Bundle bundle) {
        rq rqVar = this.d;
        if (i == 4096) {
            rqVar.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.f;
        if (appBarLayout$BaseBehavior.x() != 0) {
            et4 et4Var = this.e;
            View viewU = AppBarLayout$BaseBehavior.u(appBarLayout$BaseBehavior, et4Var);
            if (!viewU.canScrollVertically(-1)) {
                rqVar.setExpanded(true);
                return true;
            }
            int i2 = -rqVar.getDownNestedPreScrollRange();
            if (i2 != 0) {
                appBarLayout$BaseBehavior.z(et4Var, this.d, viewU, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
