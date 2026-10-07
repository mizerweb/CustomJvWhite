package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class qi3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri3 b;

    public /* synthetic */ qi3(View view, ri3 ri3Var, int i) {
        this.a = i;
        this.b = ri3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ri3 ri3Var = this.b;
        switch (i) {
            case 0:
                ((sm8) ri3Var.d.getValue()).a("show", "main", "invite_friends");
                if (ri3Var.f) {
                    ri3Var.a.p0(ri3Var);
                }
                break;
            default:
                u03 u03Var = (u03) ri3Var.c.getValue();
                u03 u03Var2 = u03.i;
                u03Var.D(0);
                if (ri3Var.e) {
                    ri3Var.a.p0(ri3Var);
                }
                break;
        }
    }
}
