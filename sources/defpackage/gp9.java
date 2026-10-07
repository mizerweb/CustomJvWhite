package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gp9 extends dp9 {
    public final Throwable a;

    public gp9(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.dp9
    public final void c(mp9 mp9Var) {
        mp9Var.c(l66.a);
        mp9Var.onError(this.a);
    }
}
