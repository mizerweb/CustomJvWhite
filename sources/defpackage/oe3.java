package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oe3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny8 b;
    public final /* synthetic */ ny8 c;

    public /* synthetic */ oe3(ny8 ny8Var, ny8 ny8Var2, int i) {
        this.a = i;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ny8 ny8Var = this.c;
        ny8 ny8Var2 = this.b;
        switch (i) {
            case 0:
                return new ne3(ny8Var2, ny8Var);
            case 1:
                return new ne3(ny8Var2, ny8Var);
            case 2:
                return new ry8((Context) ny8Var2.getValue(), new bs6("dns_store"), (cs6) ny8Var.getValue(), new l6m(23), null, 40);
            case 3:
                return new i61(ny8Var2, ny8Var);
            case 4:
                return lvb.x0(wk8.a(), ((n0c) ((xhh) ny8Var2.getValue())).b()).u0((vt4) ny8Var.getValue());
            default:
                return new xzi(ny8Var2, ny8Var);
        }
    }
}
