package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t72 extends y3 {
    public final /* synthetic */ u72 h;

    public t72(u72 u72Var) {
        this.h = u72Var;
    }

    @Override // defpackage.y3
    public final String o() {
        r72 r72Var = (r72) this.h.a.get();
        if (r72Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + r72Var.a + "]";
    }
}
