package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mb0(Object obj, Object obj2, long j, long j2, int i) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ob0 ob0Var = (ob0) ((v2a) obj2).c;
                String str = vqi.a;
                ob0Var.t(this.b, this.c, (String) obj);
                break;
            case 1:
                ((cle) obj2).P((jme) obj, this.b, this.c);
                break;
            default:
                y3j y3jVar = (y3j) ((fbc) obj2).c;
                String str2 = vqi.a;
                y3jVar.F(this.b, this.c, (String) obj);
                break;
        }
    }
}
