package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q6g extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ s55 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q6g(s55 s55Var, int i) {
        super("ExoPlayer:SimpleDecoder");
        this.a = i;
        this.b = s55Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = this.a;
        s55 s55Var = this.b;
        switch (i) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException unused) {
                        return;
                    }
                    break;
                } while (((mec) s55Var).g());
                break;
            default:
                do {
                    try {
                    } catch (InterruptedException e) {
                        qr7.w(e);
                    }
                    break;
                } while (((r6g) s55Var).j());
                break;
        }
    }
}
