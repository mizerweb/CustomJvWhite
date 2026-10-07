package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p8g extends v7g {
    public final /* synthetic */ int a;
    public final v7g b;
    public final sf7 c;

    public /* synthetic */ p8g(v7g v7gVar, sf7 sf7Var, int i) {
        this.a = i;
        this.b = v7gVar;
        this.c = sf7Var;
    }

    @Override // defpackage.v7g
    public final void i(s8g s8gVar) {
        int i = this.a;
        v7g v7gVar = this.b;
        switch (i) {
            case 0:
                v7gVar.h(new cmf(s8gVar, this.c, false, 2));
                break;
            default:
                v7gVar.h(new ewe(this, 3, s8gVar));
                break;
        }
    }
}
