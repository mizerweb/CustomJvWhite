package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jtb implements z09, bk2 {
    public final i19 a;
    public final dtb b;
    public ktb c;
    public final /* synthetic */ ltb d;

    public jtb(ltb ltbVar, i19 i19Var, dtb dtbVar) {
        this.d = ltbVar;
        this.a = i19Var;
        this.b = dtbVar;
        i19Var.a(this);
    }

    @Override // defpackage.bk2
    public final void cancel() {
        this.a.f(this);
        this.b.b.remove(this);
        ktb ktbVar = this.c;
        if (ktbVar != null) {
            ktbVar.cancel();
        }
        this.c = null;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        if (m09Var == m09.ON_START) {
            this.c = this.d.b(this.b);
            return;
        }
        if (m09Var != m09.ON_STOP) {
            if (m09Var == m09.ON_DESTROY) {
                cancel();
            }
        } else {
            ktb ktbVar = this.c;
            if (ktbVar != null) {
                ktbVar.cancel();
            }
        }
    }
}
