package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nr4 implements fr4 {
    public final String a;
    public final q11 b;
    public final q11 c;

    public nr4(String str, q11 q11Var, q11 q11Var2) {
        this.a = str;
        this.b = q11Var;
        this.c = q11Var2;
    }

    @Override // defpackage.fr4
    public final void W0(br4 br4Var, br4 br4Var2, boolean z) {
        if (!cqk.d(br4Var2 != null ? br4Var2.getInstanceId() : null, this.a) || z) {
            return;
        }
        this.c.invoke();
    }

    @Override // defpackage.fr4
    public final void w(br4 br4Var, br4 br4Var2, boolean z) {
        if (cqk.d(br4Var != null ? br4Var.getInstanceId() : null, this.a) && z) {
            this.b.invoke();
        }
    }
}
