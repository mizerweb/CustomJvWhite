package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mtc extends kih {
    public String c;
    public pj4 d;
    public Long e;
    public int f;

    public mtc(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        switch (str) {
            case "profile":
                this.d = pj4.e(fkaVar);
                break;
            case "phone":
                this.e = Long.valueOf(ch3.T(fkaVar, 0L));
                break;
            case "token":
                this.c = ch3.W(fkaVar);
                break;
            case "tokenType":
                this.f = iic.x(ch3.W(fkaVar));
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str = this.c;
        String strValueOf = String.valueOf(this.d);
        Long l = this.e;
        String strU = iic.u(this.f);
        StringBuilder sbQ = qv1.q("{token='", str, "', profile=", strValueOf, ", phone=");
        sbQ.append(l);
        sbQ.append(", tokenType=");
        sbQ.append(strU);
        sbQ.append("}");
        return sbQ.toString();
    }
}
