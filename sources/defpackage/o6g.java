package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o6g extends PopupWindow {
    public final List a;
    public final cf7 b;
    public boolean c;
    public final float d = 0.5f;

    public o6g(Context context, boolean z, List list, cf7 cf7Var) {
        boolean z2;
        this.a = list;
        this.b = cf7Var;
        setHeight(-2);
        setWidth(gm0.K(250.0f * yl5.d().getDisplayMetrics().density));
        setElevation(yl5.d().getDisplayMetrics().density * 12.0f);
        setOutsideTouchable(true);
        setFocusable(true);
        gcd gcdVar = new gcd(context, z);
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((n6g) it.next()).d != null) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        for (n6g n6gVar : this.a) {
            fcd fcdVar = new fcd(context, z);
            ynh ynhVar = n6gVar.b;
            Integer num = n6gVar.d;
            fcdVar.c(fcdVar, ynhVar, n6gVar.c, num != null, z2);
            fcdVar.b(num, n6gVar.e);
            qe7.H(fcdVar, 300L, new jvf(this, 4, n6gVar));
            gcdVar.addView(fcdVar, -1, -2);
        }
        setContentView(gcdVar);
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        if (this.c) {
            View rootView = getContentView().getRootView();
            ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
            WindowManager.LayoutParams layoutParams2 = null;
            WindowManager.LayoutParams layoutParams3 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams3 != null) {
                layoutParams3.flags |= 2;
                layoutParams3.dimAmount = this.d;
                layoutParams2 = layoutParams3;
            }
            if (layoutParams2 != null) {
                sb8.M(getContentView().getContext()).updateViewLayout(rootView, layoutParams2);
            }
        }
    }
}
