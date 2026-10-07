package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p59 implements cg7 {
    public final /* synthetic */ r59 a;

    public p59(r59 r59Var) {
        this.a = r59Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p59) {
            return getFunctionDelegate().equals(((cg7) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return new fg7(2, 0, r59.class, this.a, "onProfileTagClicked", "onProfileTagClicked(Landroid/view/View;Ljava/lang/String;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
