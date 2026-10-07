package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m58 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t58 b;

    public /* synthetic */ m58(t58 t58Var, int i) {
        this.a = i;
        this.b = t58Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j58 j58Var = j58.a;
        i58 i58Var = i58.a;
        k58 k58Var = k58.a;
        t58 t58Var = this.b;
        switch (i) {
            case 0:
                t58Var.requestLayout();
                break;
            case 1:
                t58Var.setRemoteImageState(k58Var);
                break;
            case 2:
                t58Var.setRemoteImageState(k58Var);
                break;
            case 3:
                t58Var.setRemoteImageState(k58Var);
                break;
            case 4:
                t58Var.setRemoteImageState(k58Var);
                break;
            case 5:
                if (t58Var.getShowProgress()) {
                    t58Var.setRemoteImageState(j58Var);
                }
                break;
            case 6:
                if (t58Var.getShowProgress()) {
                    t58Var.setRemoteImageState(j58Var);
                }
                break;
            case 7:
                t58Var.setRemoteImageState(i58Var);
                break;
            default:
                t58Var.setRemoteImageState(i58Var);
                break;
        }
    }
}
