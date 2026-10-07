package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v62 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ reh b;

    public /* synthetic */ v62(reh rehVar, reh rehVar2, int i) {
        this.a = i;
        this.b = rehVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        reh rehVar = this.b;
        switch (i) {
            case 0:
                rehVar.e();
                break;
            case 1:
                rehVar.e();
                break;
            default:
                rehVar.e();
                break;
        }
    }
}
