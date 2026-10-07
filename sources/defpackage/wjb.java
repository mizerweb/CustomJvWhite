package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wjb extends kih {
    public long c;
    public String d;
    public wc9 e;

    public wjb(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        switch (str) {
            case "userId":
                this.c = ch3.T(fkaVar, 0L);
                break;
            case "deviceId":
                this.d = ch3.W(fkaVar);
                break;
            case "location":
                this.e = wc9.a(fkaVar);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        long j = this.c;
        String str = this.d;
        return qt4.q(qt4.t(j, "Response{userId=", ", deviceId='", str), "', location=", String.valueOf(this.e), "}");
    }
}
