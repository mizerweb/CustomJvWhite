package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jbh implements vxe {
    public final id7 a;
    public final String b;
    public boolean c;

    public jbh(id7 id7Var, String str) {
        this.a = id7Var;
        this.b = str;
    }

    public final void l() {
        if (this.c) {
            n1g.a0(21, "statement is closed");
            throw null;
        }
    }

    @Override // defpackage.vxe
    public void reset() {
        l();
    }

    @Override // defpackage.vxe
    public void u() {
        l();
    }
}
