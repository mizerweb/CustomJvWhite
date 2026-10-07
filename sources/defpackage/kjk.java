package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kjk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ljk b;

    public /* synthetic */ kjk(ljk ljkVar, int i) {
        this.a = i;
        this.b = ljkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ljk ljkVar = this.b;
        switch (i) {
            case 0:
                qid.i.f.f(ljkVar.k);
                break;
            default:
                qid.i.f.a(ljkVar.k);
                break;
        }
    }
}
