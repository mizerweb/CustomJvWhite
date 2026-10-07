package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ib0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2a b;
    public final /* synthetic */ t55 c;

    public /* synthetic */ ib0(v2a v2aVar, t55 t55Var, int i) {
        this.a = i;
        this.b = v2aVar;
        this.c = t55Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v2a v2aVar = this.b;
                t55 t55Var = this.c;
                synchronized (t55Var) {
                }
                ob0 ob0Var = (ob0) v2aVar.c;
                String str = vqi.a;
                ob0Var.x(t55Var);
                break;
            default:
                v2a v2aVar2 = this.b;
                t55 t55Var2 = this.c;
                ob0 ob0Var2 = (ob0) v2aVar2.c;
                String str2 = vqi.a;
                ob0Var2.H(t55Var2);
                break;
        }
    }
}
