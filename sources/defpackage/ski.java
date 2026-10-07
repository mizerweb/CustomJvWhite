package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ski implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vki b;

    public /* synthetic */ ski(vki vkiVar, int i) {
        this.a = i;
        this.b = vkiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vki vkiVar = this.b;
        switch (i) {
            case 0:
                vki.d(vkiVar);
                break;
            case 1:
                eu5 eu5Var = vkiVar.d;
                t1d t1dVar = vd7.a.get();
                t1dVar.e = vkiVar.e;
                t1dVar.f = vkiVar.j;
                t1dVar.j = eu5Var.e;
                t1dVar.i = true;
                t1dVar.b = vkiVar.a;
                eu5Var.i(t1dVar.a());
                ote oteVarD = eu5Var.d();
                if (oteVarD != null) {
                    oteVarD.setCallback(vkiVar.c);
                }
                break;
            case 2:
                vkiVar.d.f();
                vkiVar.f(vkiVar.k, vkiVar.l);
                vkiVar.invalidateSelf();
                break;
            case 3:
                if (vkiVar.i.isEmpty()) {
                    vkiVar.e.a(null);
                    vkiVar.d.g();
                }
                break;
            default:
                ote oteVarD2 = vkiVar.d.d();
                if (oteVarD2 != null) {
                    oteVarD2.setCallback(vkiVar.c);
                }
                vkiVar.invalidateSelf();
                break;
        }
    }
}
