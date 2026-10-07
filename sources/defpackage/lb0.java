package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2a b;
    public final /* synthetic */ tb0 c;

    public /* synthetic */ lb0(v2a v2aVar, tb0 tb0Var, int i) {
        this.a = i;
        this.b = v2aVar;
        this.c = tb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        tb0 tb0Var = this.c;
        v2a v2aVar = this.b;
        switch (i) {
            case 0:
                ob0 ob0Var = (ob0) v2aVar.c;
                String str = vqi.a;
                ob0Var.m(tb0Var);
                break;
            default:
                ob0 ob0Var2 = (ob0) v2aVar.c;
                String str2 = vqi.a;
                ob0Var2.o(tb0Var);
                break;
        }
    }
}
