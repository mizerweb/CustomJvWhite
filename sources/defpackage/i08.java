package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i08 implements kag {
    public final oa7 a;
    public boolean b;
    public final /* synthetic */ ma c;

    public i08(ma maVar) {
        this.c = maVar;
        this.a = new oa7(((x41) maVar.e).m());
    }

    @Override // defpackage.kag
    public final void X(long j, l31 l31Var) {
        x41 x41Var = (x41) this.c.e;
        if (this.b) {
            ore.k("closed");
        } else {
            if (j == 0) {
                return;
            }
            x41Var.A0(j);
            x41Var.L("\r\n");
            x41Var.X(j, l31Var);
            x41Var.L("\r\n");
        }
    }

    @Override // defpackage.kag, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((x41) this.c.e).L("0\r\n\r\n");
        oa7 oa7Var = this.a;
        xsh xshVar = oa7Var.e;
        oa7Var.e = xsh.d;
        xshVar.a();
        xshVar.b();
        this.c.a = 3;
    }

    @Override // defpackage.kag, java.io.Flushable
    public final synchronized void flush() {
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
