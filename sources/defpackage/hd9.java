package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hd9 extends kih {
    public gda c;

    public hd9(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("message")) {
            this.c = yab.q0(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{message=", String.valueOf(this.c), "}");
    }
}
