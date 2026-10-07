package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yib extends kih {
    public String c;
    public String d;
    public long e;
    public long f;
    public a9m g;
    public String h;
    public int i;
    public Boolean j;
    public String k;

    public yib(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        int i = 3;
        switch (str) {
            case "conversationId":
                this.c = ch3.W(fkaVar);
                break;
            case "chatId":
                this.f = ch3.T(fkaVar, 0L);
                break;
            case "callerId":
                this.e = ch3.T(fkaVar, 0L);
                break;
            case "vcp":
                this.d = ch3.W(fkaVar);
                break;
            case "type":
                String strW = ch3.W(fkaVar);
                strW.getClass();
                if (strW.equals("AUDIO")) {
                    i = 2;
                } else if (!strW.equals("VIDEO")) {
                    i = 1;
                }
                this.i = i;
                break;
            case "turnServer":
                this.g = a9m.h(fkaVar);
                break;
            case "isContact":
                this.j = Boolean.valueOf(ch3.L(fkaVar));
                break;
            case "sdpOffer":
                this.h = ch3.W(fkaVar);
                break;
            case "country":
                this.k = ch3.W(fkaVar);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str = this.c;
        String str2 = this.d;
        long j = this.e;
        long j2 = this.f;
        String strValueOf = String.valueOf(this.g);
        String str3 = this.h;
        String strU = bc1.u(this.i);
        Boolean bool = this.j;
        String str4 = this.k;
        StringBuilder sbQ = qv1.q("{conversationId='", str, "'convParams='", str2, "', callerId=");
        sbQ.append(j);
        qt4.z(j2, ", chatId=", ", turnServer=", sbQ);
        nbh.G(sbQ, strValueOf, ", sdpOffer='", str3, "', callType=");
        sbQ.append(strU);
        sbQ.append(", isContact=");
        sbQ.append(bool);
        sbQ.append(", country=");
        return zo5.w(sbQ, str4, "}");
    }
}
