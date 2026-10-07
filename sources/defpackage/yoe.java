package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yoe extends gp8 {
    public final ek2 h;

    public yoe(ek2 ek2Var) {
        this.h = ek2Var;
    }

    @Override // defpackage.gp8
    public final boolean o() {
        return false;
    }

    @Override // defpackage.gp8
    public final void p(Throwable th) {
        this.h.resumeWith(sbi.a);
    }
}
