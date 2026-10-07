package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ln5 implements fr4 {
    public final String a;
    public final af7 b;

    public ln5(br4 br4Var, af7 af7Var) {
        this.a = br4Var.getInstanceId();
        this.b = af7Var;
    }

    @Override // defpackage.fr4
    public final void W0(br4 br4Var, br4 br4Var2, boolean z) {
        if (!cqk.d(br4Var2 != null ? br4Var2.getInstanceId() : null, this.a) || z) {
            return;
        }
        br4Var2.getRouter().M(this);
    }

    @Override // defpackage.fr4
    public final void w(br4 br4Var, br4 br4Var2, boolean z) {
        if (!cqk.d(br4Var2 != null ? br4Var2.getInstanceId() : null, this.a) || z) {
            return;
        }
        this.b.invoke();
    }
}
