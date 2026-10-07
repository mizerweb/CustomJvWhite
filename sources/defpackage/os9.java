package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class os9 extends g85 {
    public final /* synthetic */ y3a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os9(y3a y3aVar) {
        super(y3aVar);
        this.g = y3aVar;
    }

    @Override // defpackage.g85
    public final p3a F() {
        y3a y3aVar = this.g;
        ms9 ms9Var = y3aVar.f;
        if (ms9Var == null) {
            ore.k("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
        if (ms9Var != y3aVar.c) {
            return ms9Var.d;
        }
        ns9 ns9Var = (ns9) this.b;
        ns9Var.getClass();
        return new p3a(ns9Var.getCurrentBrowserInfo());
    }
}
