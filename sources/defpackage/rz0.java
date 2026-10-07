package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rz0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((sz0) obj).c();
                break;
            default:
                xg6 xg6Var = (xg6) obj;
                if (!xg6Var.l && xg6Var.getMeasuredWidth() > 0) {
                    xg6Var.b(xg6Var.getMeasuredWidth());
                    xg6Var.l = true;
                    xg6Var.requestLayout();
                }
                if (xg6Var.l) {
                    xg6Var.getViewTreeObserver().removeOnPreDrawListener(xg6Var.p);
                    xg6Var.p = null;
                }
                break;
        }
        return true;
    }
}
