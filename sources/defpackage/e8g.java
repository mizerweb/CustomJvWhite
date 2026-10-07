package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e8g extends v7g {
    public final /* synthetic */ int a;
    public final v7g b;
    public final rg4 c;

    public /* synthetic */ e8g(v7g v7gVar, rg4 rg4Var, int i) {
        this.a = i;
        this.b = v7gVar;
        this.c = rg4Var;
    }

    @Override // defpackage.v7g
    public final void i(s8g s8gVar) {
        int i = this.a;
        v7g v7gVar = this.b;
        switch (i) {
            case 0:
                v7gVar.h(new cmf(this, 1, s8gVar));
                break;
            case 1:
                v7gVar.h(new ch(s8gVar, 9, this.c));
                break;
            default:
                v7gVar.h(new wze(this, s8gVar, false, 2));
                break;
        }
    }
}
