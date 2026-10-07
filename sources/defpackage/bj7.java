package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bj7 {
    public final /* synthetic */ ej7 a;

    public bj7(ej7 ej7Var) {
        this.a = ej7Var;
    }

    public final void a(kef kefVar) {
        gm0.n("ej7", "onMediaSelect()");
        ej7 ej7Var = this.a;
        if (ej7Var.x) {
            gm0.Y("ej7", "Early return in onMediaSelect cuz of isItemSelectInProcess");
        } else {
            ej7Var.F(h1h.c(kefVar.a), false);
        }
    }
}
