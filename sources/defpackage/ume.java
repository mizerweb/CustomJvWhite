package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ume implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vme b;

    public /* synthetic */ ume(vme vmeVar, int i) {
        this.a = i;
        this.b = vmeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vme vmeVar = this.b;
        switch (i) {
            case 0:
                ake akeVar = vmeVar.c;
                if (((vme) akeVar.f) != null) {
                    akeVar.b();
                }
                break;
            default:
                ake akeVar2 = vmeVar.c;
                if (((vme) akeVar2.f) != null && (akeVar2.a & 3) != 0) {
                    akeVar2.b();
                    break;
                }
                break;
        }
    }
}
