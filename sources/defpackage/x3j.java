package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x3j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbc b;
    public final /* synthetic */ t55 c;

    public /* synthetic */ x3j(fbc fbcVar, t55 t55Var, int i) {
        this.a = i;
        this.b = fbcVar;
        this.c = t55Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fbc fbcVar = this.b;
                t55 t55Var = this.c;
                y3j y3jVar = (y3j) fbcVar.c;
                String str = vqi.a;
                y3jVar.w(t55Var);
                break;
            default:
                fbc fbcVar2 = this.b;
                t55 t55Var2 = this.c;
                synchronized (t55Var2) {
                }
                y3j y3jVar2 = (y3j) fbcVar2.c;
                String str2 = vqi.a;
                y3jVar2.v(t55Var2);
                break;
        }
    }
}
