package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2a b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ hb0(v2a v2aVar, Exception exc, int i) {
        this.a = i;
        this.b = v2aVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Exception exc = this.c;
        v2a v2aVar = this.b;
        switch (i) {
            case 0:
                ob0 ob0Var = (ob0) v2aVar.c;
                String str = vqi.a;
                ob0Var.D(exc);
                break;
            default:
                ob0 ob0Var2 = (ob0) v2aVar.c;
                String str2 = vqi.a;
                ob0Var2.p(exc);
                break;
        }
    }
}
