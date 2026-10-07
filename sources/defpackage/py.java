package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class py extends kih {
    public boolean c;
    public long d;

    public py(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("success")) {
            this.c = ch3.L(fkaVar);
        } else if (str.equals("updateTime")) {
            this.d = ch3.T(fkaVar, 0L);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response{success=" + this.c + ", updateTime=" + this.d + "}";
    }
}
