package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class se extends vrk {
    @Override // defpackage.vrk
    public final int a(ux3 ux3Var) {
        int i;
        synchronized (ux3Var) {
            i = ux3Var.i - 1;
            ux3Var.i = i;
        }
        return i;
    }
}
