package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vhc implements aw8 {
    public static final vhc a = new vhc();
    public static final thd b = yab.c("OrgLinkPlacement", phd.g);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.A(0);
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        Object next;
        int i = r55Var.i();
        uhc.Companion.getClass();
        y1 y1Var = new y1(0, uhc.c);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
            ((uhc) next).getClass();
        } while (i != 0);
        uhc uhcVar = (uhc) next;
        return uhcVar == null ? uhc.a : uhcVar;
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
