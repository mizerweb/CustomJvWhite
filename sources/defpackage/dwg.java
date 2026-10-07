package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dwg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwg b;

    public /* synthetic */ dwg(fwg fwgVar, int i) {
        this.a = i;
        this.b = fwgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        fwg fwgVar = this.b;
        switch (i) {
            case 0:
                fwgVar.e = null;
                break;
            case 1:
                fwgVar.g = null;
                break;
            case 2:
                fwgVar.h = null;
                break;
            default:
                fwgVar.f = null;
                break;
        }
    }
}
