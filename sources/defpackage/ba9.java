package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ba9 extends g8b {
    public final rxk l;
    public g19 m;
    public ca9 n;

    public ba9(rxk rxkVar) {
        this.l = rxkVar;
        if (rxkVar.a == null) {
            rxkVar.a = this;
        } else {
            ore.k("There is already a listener registered");
            throw null;
        }
    }

    @Override // defpackage.b99
    public final void g() {
        rxk rxkVar = this.l;
        rxkVar.b = true;
        rxkVar.d = false;
        rxkVar.c = false;
        rxkVar.i.drainPermits();
        rxkVar.a();
        rxkVar.g = new o30(rxkVar);
        rxkVar.b();
    }

    @Override // defpackage.b99
    public final void h() {
        this.l.b = false;
    }

    @Override // defpackage.b99
    public final void j(srb srbVar) {
        super.j(srbVar);
        this.m = null;
        this.n = null;
    }

    public final void l() {
        g19 g19Var = this.m;
        ca9 ca9Var = this.n;
        if (g19Var == null || ca9Var == null) {
            return;
        }
        super.j(ca9Var);
        e(g19Var, ca9Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        uql.a(sb, this.l);
        sb.append("}}");
        return sb.toString();
    }
}
