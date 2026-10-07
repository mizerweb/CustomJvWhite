package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j7b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ swi c;

    public /* synthetic */ j7b(swi swiVar, float f, int i) {
        this.a = i;
        this.c = swiVar;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        float f = this.b;
        swi swiVar = this.c;
        switch (i) {
            case 0:
                ((n7b) ((i1m) swiVar).a).e.l(f);
                break;
            default:
                ((n8g) ((gj2) swiVar).c).d.l(f);
                break;
        }
    }
}
