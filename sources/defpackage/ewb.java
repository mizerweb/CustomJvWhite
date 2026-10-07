package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ewb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kwb b;

    public /* synthetic */ ewb(kwb kwbVar, int i) {
        this.a = i;
        this.b = kwbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        kwb kwbVar = this.b;
        switch (i) {
            case 0:
                af7 af7Var = kwbVar.B;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                kwbVar.invalidate();
                break;
            default:
                af7 af7Var2 = kwbVar.B;
                if (af7Var2 != null) {
                    af7Var2.invoke();
                }
                kwbVar.invalidate();
                break;
        }
    }
}
