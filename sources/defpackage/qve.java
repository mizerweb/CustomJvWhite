package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rve b;
    public final /* synthetic */ long c;

    public /* synthetic */ qve(rve rveVar, long j, int i) {
        this.a = i;
        this.b = rveVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        rve rveVar = this.b;
        switch (i) {
            case 0:
                rveVar.m.offer(Long.valueOf(j));
                rveVar.b();
                break;
            default:
                rveVar.f.post(new qve(rveVar, j, 0));
                break;
        }
    }
}
