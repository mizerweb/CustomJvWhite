package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oc6 extends qc6 {
    public final ek2 c;
    public final /* synthetic */ sc6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc6(sc6 sc6Var, long j, ek2 ek2Var) {
        super(j);
        this.d = sc6Var;
        this.c = ek2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.E(this.d);
    }

    @Override // defpackage.qc6
    public final String toString() {
        return super.toString() + this.c;
    }
}
