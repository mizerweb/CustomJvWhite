package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b3d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4j b;

    public /* synthetic */ b3d(h4j h4jVar, int i) {
        this.a = i;
        this.b = h4jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h4j h4jVar = this.b;
        switch (i) {
            case 0:
                h4jVar.d();
                break;
            case 1:
                h4jVar.b();
                break;
            default:
                h4jVar.onFirstFrameRendered();
                break;
        }
    }
}
