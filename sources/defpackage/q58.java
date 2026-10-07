package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q58 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t58 b;
    public final /* synthetic */ float c;

    public /* synthetic */ q58(t58 t58Var, float f, int i) {
        this.a = i;
        this.b = t58Var;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        float f = this.c;
        j58 j58Var = j58.a;
        t58 t58Var = this.b;
        switch (i) {
            case 0:
                t58Var.setRemoteImageState(j58Var);
                ny8 ny8Var = t58Var.z;
                if (ny8Var.d()) {
                    ((v50) ny8Var.getValue()).setLevel(gm0.K(f * 10000.0f));
                }
                break;
            default:
                t58Var.setRemoteImageState(j58Var);
                ny8 ny8Var2 = t58Var.z;
                if (ny8Var2.d()) {
                    ((v50) ny8Var2.getValue()).setLevel(gm0.K(f * 10000.0f));
                }
                break;
        }
    }
}
