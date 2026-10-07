package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd7 implements n71 {
    public final pzf a;
    public final q8e b;

    public wd7() {
        pzf pzfVarB = e9i.b(0, 64, 1);
        this.a = pzfVarB;
        this.b = new q8e(pzfVarB);
    }

    @Override // defpackage.n71
    public final void a(v2a v2aVar) {
        String strA;
        v71 v71Var = (v71) v2aVar.b;
        if (v71Var == null || (strA = v71Var.a()) == null) {
            return;
        }
        this.a.a(strA);
    }
}
