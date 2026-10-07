package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ov3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv3 b;
    public final /* synthetic */ xv3 c;
    public final /* synthetic */ yu3 d;

    public /* synthetic */ ov3(jv3 jv3Var, xv3 xv3Var, yu3 yu3Var, int i) {
        this.a = i;
        this.b = jv3Var;
        this.c = xv3Var;
        this.d = yu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        yu3 yu3Var = this.d;
        xv3 xv3Var = this.c;
        jv3 jv3Var = this.b;
        switch (i) {
            case 0:
                jv3Var.a();
                xv3Var.b.postInvalidate();
                xv3Var.j.invoke(yu3Var.k());
                break;
            default:
                jv3Var.a();
                xv3Var.b.postInvalidate();
                xv3Var.j.invoke(yu3Var.k());
                break;
        }
    }
}
