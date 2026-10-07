package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class njb extends kih {
    public ia4 c;

    public njb(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("config")) {
            this.c = gm0.F(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{config=", String.valueOf(this.c), "}");
    }
}
