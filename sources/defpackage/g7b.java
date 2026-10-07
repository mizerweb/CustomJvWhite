package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g7b implements en7 {
    public final /* synthetic */ n7b a;

    public /* synthetic */ g7b(n7b n7bVar) {
        this.a = n7bVar;
    }

    @Override // defpackage.en7
    public void a(fn7 fn7Var, dn7 dn7Var, long j) {
        n7b n7bVar = this.a;
        lvb.b0(!n7bVar.r);
        g55.a();
        n7bVar.j.add(new osh(dn7Var, j));
        n7bVar.k.put(dn7Var.a, new l7b(fn7Var, j));
        n7bVar.p();
    }
}
