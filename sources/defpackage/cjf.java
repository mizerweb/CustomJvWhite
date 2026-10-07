package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cjf implements cg7 {
    public final /* synthetic */ b08 a;

    public cjf(b08 b08Var) {
        this.a = b08Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cjf) {
            return getFunctionDelegate().equals(((cg7) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return new ha(1, 8, b08.class, this.a, "onNewHost", "onNewHost(Ljava/lang/String;)Lkotlinx/coroutines/Job;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
