package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o93 extends kih {
    public st2 c;

    public o93(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("chat")) {
            this.c = st2.b(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{chat=", String.valueOf(this.c), "}");
    }
}
