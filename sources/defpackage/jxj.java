package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class jxj extends ch3 {
    public final Window i;
    public final v56 j;

    public jxj(Window window, v56 v56Var) {
        this.i = window;
        this.j = v56Var;
    }

    @Override // defpackage.ch3
    public final void Z(boolean z) {
        if (!z) {
            m0(16);
            return;
        }
        Window window = this.i;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        l0(16);
    }

    @Override // defpackage.ch3
    public final void a0(boolean z) {
        if (!z) {
            m0(8192);
            return;
        }
        Window window = this.i;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        l0(8192);
    }

    @Override // defpackage.ch3
    public final void b0() {
        this.i.getDecorView().setTag(356039078, 2);
        m0(np0.q);
        l0(np0.r);
    }

    @Override // defpackage.ch3
    public final void c0(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m0(4);
                    this.i.clearFlags(1024);
                } else if (i2 == 2) {
                    m0(2);
                } else if (i2 == 8) {
                    ((p3c) this.j.b).t();
                }
            }
        }
    }

    public final void l0(int i) {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void m0(int i) {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.ch3
    public final void q(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    l0(4);
                } else if (i2 == 2) {
                    l0(2);
                } else if (i2 == 8) {
                    ((p3c) this.j.b).j();
                }
            }
        }
    }
}
