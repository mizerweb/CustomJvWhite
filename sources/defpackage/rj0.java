package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rj0 extends f83 {
    public final /* synthetic */ sj0 c;
    public final /* synthetic */ kbc d;

    /* JADX WARN: Illegal instructions before constructor call */
    public rj0(sj0 sj0Var, kbc kbcVar) {
        Boolean bool = Boolean.TRUE;
        this.c = sj0Var;
        this.d = kbcVar;
        super(4, bool);
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i;
        if (cqk.d(obj, obj2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj).getClass();
        kbc kbcVar = this.d;
        if (zBooleanValue) {
            kbcVar.getText();
            i = -1;
        } else {
            i = kbcVar.getText().b;
        }
        sj0 sj0Var = this.c;
        sj0Var.l = i;
        sj0Var.b();
        sj0Var.invalidateSelf();
    }
}
