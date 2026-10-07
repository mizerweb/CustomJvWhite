package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class yed implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ ha9 c;

    public /* synthetic */ yed(h5 h5Var, ha9 ha9Var, int i) {
        this.a = i;
        this.b = h5Var;
        this.c = ha9Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ha9 ha9Var = this.c;
        h5 h5Var = this.b;
        switch (i) {
            case 0:
                return new ry8((Context) h5Var.c(7), new bs6(ha9Var.a("features_prefs", null)), (cs6) h5Var.c(28), new is6("feature_prefs"), null, 40);
            case 1:
                return new ry8((Context) h5Var.c(7), new bs6(ha9Var.a("settings", "prefs")), (cs6) h5Var.c(28), new is6("settings_prefs"), null, 40);
            default:
                return new ry8((Context) h5Var.c(7), new bs6(ha9Var.a("experiments_prefs", null)), (cs6) h5Var.c(28), new is6("experiments_prefs"), null, 40);
        }
    }
}
