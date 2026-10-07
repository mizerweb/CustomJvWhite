package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q4b extends kih {
    public gda c;
    public st2 d;
    public String e;

    public q4b(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        switch (str) {
            case "chatAccessToken":
                this.e = ch3.W(fkaVar);
                break;
            case "chat":
                this.d = st2.b(fkaVar);
                break;
            case "message":
                this.c = yab.q0(fkaVar);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.w("Response{, message=", String.valueOf(this.c), ", chat=", String.valueOf(this.d), "}");
    }
}
