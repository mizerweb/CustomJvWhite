package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h7f implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny8 b;

    public /* synthetic */ h7f(ny8 ny8Var, int i) {
        this.a = i;
        this.b = ny8Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ny8 ny8Var = this.b;
        switch (i) {
            case 0:
                return ((xd5) ny8Var.getValue()).a(null);
            case 1:
                return ((xd5) ny8Var.getValue()).b();
            case 2:
                ((xd5) ny8Var.getValue()).getClass();
                return null;
            case 3:
                return ((n0c) ((xhh) ny8Var.getValue())).b();
            case 4:
                return (Boolean) ((e5d) ny8Var.getValue()).V5.a(e5d.S6[361]).i();
            case 5:
                return (Boolean) ((e5d) ny8Var.getValue()).U5.a(e5d.S6[360]).i();
            case 6:
                ((wxb) ny8Var.getValue()).getClass();
                ((wxb) ny8Var.getValue()).getClass();
                return ovb.a;
            case 7:
                return (Boolean) ((e5d) ny8Var.getValue()).b3.a(e5d.S6[211]).i();
            default:
                return Boolean.valueOf(((nni) ny8Var.getValue()).d.getBoolean("app.privacy.online.show", true));
        }
    }
}
