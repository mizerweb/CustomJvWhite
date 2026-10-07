package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class bo9 extends l4 {
    public final /* synthetic */ do9 d;

    public bo9(do9 do9Var) {
        this.d = do9Var;
    }

    @Override // defpackage.l4
    public final void d(View view, x4 x4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, x4Var.a);
        int i = -1;
        if (view instanceof zn9) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                do9 do9Var = this.d;
                if (i2 >= do9Var.getChildCount()) {
                    break;
                }
                if (do9Var.getChildAt(i2) == view) {
                    i = i3;
                    break;
                }
                if ((do9Var.getChildAt(i2) instanceof zn9) && do9Var.c(i2)) {
                    i3++;
                }
                i2++;
            }
        }
        x4Var.i(pgg.u(((zn9) view).o, 0, 1, i, 1));
    }
}
