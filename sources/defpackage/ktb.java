package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ktb implements bk2 {
    public final dtb a;
    public final /* synthetic */ ltb b;

    public ktb(ltb ltbVar, dtb dtbVar) {
        this.b = ltbVar;
        this.a = dtbVar;
    }

    @Override // defpackage.bk2
    public final void cancel() {
        ltb ltbVar = this.b;
        zv zvVar = ltbVar.b;
        dtb dtbVar = this.a;
        zvVar.remove(dtbVar);
        if (cqk.d(ltbVar.c, dtbVar)) {
            dtbVar.a();
            ltbVar.c = null;
        }
        dtbVar.b.remove(this);
        af7 af7Var = dtbVar.c;
        if (af7Var != null) {
            af7Var.invoke();
        }
        dtbVar.c = null;
    }
}
