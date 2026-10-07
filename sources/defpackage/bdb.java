package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bdb implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ af7 b;

    public /* synthetic */ bdb(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        af7 af7Var = this.b;
        switch (i) {
            case 0:
                af7Var.invoke();
                return sbi.a;
            case 1:
                return (Handler) af7Var.invoke();
            case 2:
                return Integer.valueOf(((kbc) af7Var.invoke()).k().f);
            default:
                return Integer.valueOf(((kbc) af7Var.invoke()).getIcon().b);
        }
    }
}
