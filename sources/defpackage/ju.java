package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ju implements ttb, bub {
    public final /* synthetic */ ek2 a;

    public /* synthetic */ ju(ek2 ek2Var) {
        this.a = ek2Var;
    }

    @Override // defpackage.bub
    public void a(Object obj) {
        ek2 ek2Var = this.a;
        if (ek2Var.t() instanceof hib) {
            ek2Var.resumeWith(obj);
        }
    }

    @Override // defpackage.ttb
    public void onFailure(Exception exc) {
        this.a.resumeWith(Boolean.FALSE);
    }
}
