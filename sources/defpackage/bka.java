package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bka implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ bka(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
        return sbiVar;
    }
}
