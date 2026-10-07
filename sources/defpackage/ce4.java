package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ce4 implements ug4, cg7 {
    public static final ce4 a = new ce4();

    @Override // defpackage.ug4
    public final void accept(Object obj) {
        ((vd4) obj).c();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ug4) && (obj instanceof cg7)) {
            return getFunctionDelegate().equals(((cg7) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return new fg7(1, vd4.class, "onBackgroundDataEnabledChange", "onBackgroundDataEnabledChange()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
