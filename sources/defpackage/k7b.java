package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k7b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ swi d;

    public /* synthetic */ k7b(swi swiVar, long j, boolean z, int i) {
        this.a = i;
        this.d = swiVar;
        this.b = j;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.c;
        long j = this.b;
        swi swiVar = this.d;
        switch (i) {
            case 0:
                ((n7b) ((i1m) swiVar).a).e.e(j, z);
                break;
            default:
                ((n8g) ((gj2) swiVar).c).d.e(j, z);
                break;
        }
    }
}
