package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r2j implements no5 {
    public final /* synthetic */ cyi a;
    public final /* synthetic */ b62 b;

    public r2j(cyi cyiVar, b62 b62Var) {
        this.a = cyiVar;
        this.b = b62Var;
    }

    @Override // defpackage.no5
    public final void dispose() {
        this.a.removeOnLayoutChangeListener(this.b);
    }
}
