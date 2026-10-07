package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x4b extends kih {
    public b50 c;

    public x4b(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("attachments")) {
            this.c = b50.a(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{attaches=", String.valueOf(this.c), "}");
    }
}
