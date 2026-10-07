package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class kxj extends ch3 {
    public final WindowInsetsController i;
    public final Window j;

    public kxj(Window window, v56 v56Var) {
        this.i = window.getInsetsController();
        this.j = window;
    }

    @Override // defpackage.ch3
    public final void Z(boolean z) {
        Window window = this.j;
        if (z) {
            if (window != null) {
                l0(16);
            }
            this.i.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                m0(16);
            }
            this.i.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.ch3
    public final void a0(boolean z) {
        Window window = this.j;
        if (z) {
            if (window != null) {
                l0(8192);
            }
            this.i.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                m0(8192);
            }
            this.i.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.ch3
    public void b0() {
        Window window = this.j;
        if (window == null) {
            this.i.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        m0(np0.q);
        l0(np0.r);
    }

    @Override // defpackage.ch3
    public final void c0(int i) {
        this.i.show(i & (-9));
    }

    public final void l0(int i) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void m0(int i) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.ch3
    public final void q(int i) {
        this.i.hide(i & (-9));
    }
}
