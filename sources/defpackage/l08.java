package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l08 implements kag {
    public final oa7 a;
    public boolean b;
    public final /* synthetic */ ma c;

    public l08(ma maVar) {
        this.c = maVar;
        this.a = new oa7(((x41) maVar.e).m());
    }

    @Override // defpackage.kag
    public final void X(long j, l31 l31Var) {
        if (this.b) {
            ore.k("closed");
        } else {
            uqi.c(l31Var.b, 0L, j);
            ((x41) this.c.e).X(j, l31Var);
        }
    }

    @Override // defpackage.kag, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        oa7 oa7Var = this.a;
        xsh xshVar = oa7Var.e;
        oa7Var.e = xsh.d;
        xshVar.a();
        xshVar.b();
        this.c.a = 3;
    }

    @Override // defpackage.kag, java.io.Flushable
    public final void flush() {
        if (this.b) {
            return;
        }
        ((x41) this.c.e).flush();
    }

    @Override // defpackage.kag
    public final xsh m() {
        return this.a;
    }
}
