package defpackage;

import android.view.View;
import android.view.Window;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class tm1 implements sb5 {
    public final /* synthetic */ ym1 a;

    public tm1(ym1 ym1Var) {
        this.a = ym1Var;
    }

    @Override // defpackage.sb5
    public final void onDestroy(g19 g19Var) {
        g19Var.f().f(this);
    }

    @Override // defpackage.sb5
    public final void onResume(g19 g19Var) {
        Window window;
        View decorView;
        g19Var.f().f(this);
        ym1 ym1Var = this.a;
        MainActivity mainActivity = ym1Var.n;
        if (mainActivity == null || (window = mainActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new c3(20, ym1Var));
    }
}
