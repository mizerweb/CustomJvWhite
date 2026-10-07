package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ilg extends kih {
    public dlg c;

    public ilg(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        if (str.equals("sticker")) {
            this.c = dlg.a(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{sticker = ", this.c.toString(), "}");
    }
}
