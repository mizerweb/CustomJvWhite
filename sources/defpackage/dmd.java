package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dmd extends kih {
    public ujd c;

    public dmd(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        if (str.equals("profile")) {
            this.c = f55.p(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{profile=", String.valueOf(this.c), "}");
    }
}
