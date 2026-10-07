package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qm4 extends kih {
    public pj4 c;

    public qm4(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("contact")) {
            this.c = pj4.e(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{contact=", String.valueOf(this.c), "}");
    }
}
