package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ub5 implements z09 {
    public final sb5 a;
    public final z09 b;

    public ub5(sb5 sb5Var, z09 z09Var) {
        this.a = sb5Var;
        this.b = z09Var;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        int i = tb5.$EnumSwitchMapping$0[m09Var.ordinal()];
        sb5 sb5Var = this.a;
        switch (i) {
            case 1:
                sb5Var.getClass();
                break;
            case 2:
                sb5Var.onStart(g19Var);
                break;
            case 3:
                sb5Var.onResume(g19Var);
                break;
            case 4:
                sb5Var.onPause(g19Var);
                break;
            case 5:
                sb5Var.onStop(g19Var);
                break;
            case 6:
                sb5Var.onDestroy(g19Var);
                break;
            case 7:
                ore.p("ON_ANY must not been send by anybody");
                return;
        }
        z09 z09Var = this.b;
        if (z09Var != null) {
            z09Var.l(g19Var, m09Var);
        }
    }
}
