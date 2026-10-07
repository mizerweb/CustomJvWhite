package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zkb extends kih {
    public long c;
    public long d;
    public w50 e;

    public zkb(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        switch (str) {
            case "chatId":
                this.c = fkaVar.I0();
                break;
            case "userId":
                this.d = fkaVar.I0();
                break;
            case "type":
                String strW = ch3.W(fkaVar);
                if (strW != null) {
                    this.e = w50.a(strW);
                    break;
                }
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    public final long h() {
        return this.d;
    }

    @Override // defpackage.sq0
    public final String toString() {
        long j = this.c;
        long j2 = this.d;
        String strValueOf = String.valueOf(this.e);
        StringBuilder sbS = qt4.s(j, "{chatId=", ", userId=");
        qv1.s(j2, ", type=", strValueOf, sbS);
        sbS.append("}");
        return sbS.toString();
    }
}
