package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z48 implements v97 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z48(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v97
    public final void a(w97 w97Var) {
        v97 v97Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b58 b58Var = (b58) ((WeakReference) ((a58) obj).e).get();
                if (b58Var != null) {
                    b58Var.v.execute(new k36(16, b58Var));
                    return;
                }
                return;
            default:
                ls9 ls9Var = (ls9) obj;
                synchronized (ls9Var.a) {
                    try {
                        int i2 = ls9Var.b - 1;
                        ls9Var.b = i2;
                        if (ls9Var.c && i2 == 0) {
                            ls9Var.close();
                        }
                        v97Var = (v97) ls9Var.f;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (v97Var != null) {
                    v97Var.a(w97Var);
                    return;
                }
                return;
        }
    }
}
