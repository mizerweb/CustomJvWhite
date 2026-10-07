package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ntc extends kih {
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public ntc(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        int i = 4;
        switch (str) {
            case "codeDelay":
                this.e = ch3.R(fkaVar, 0);
                break;
            case "codeLength":
                this.f = ch3.R(fkaVar, 0);
                break;
            case "callDelay":
                this.g = ch3.R(fkaVar, 0);
                break;
            case "token":
                this.c = ch3.W(fkaVar);
                break;
            case "tokenType":
                this.h = iic.x(ch3.W(fkaVar));
                break;
            case "retries":
                this.d = ch3.R(fkaVar, 0);
                break;
            case "requestType":
                String strW = ch3.W(fkaVar);
                strW.getClass();
                switch (strW) {
                    case "CALL_DELAY":
                        i = 3;
                        break;
                    case "SMS":
                        i = 2;
                        break;
                    case "CALL":
                        break;
                    default:
                        i = 1;
                        break;
                }
                this.i = i;
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str;
        String strY = ch3.y(this.c);
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        String strU = iic.u(this.h);
        int i4 = this.g;
        int i5 = this.i;
        if (i5 == 1) {
            str = "UNKNOWN";
        } else if (i5 == 2) {
            str = "SMS";
        } else if (i5 != 3) {
            str = i5 != 4 ? "null" : "CALL";
        } else {
            str = "CALL_DELAY";
        }
        StringBuilder sbR = c0a.r(i, "{token='", strY, "', retries=", ", codeDelay=");
        qt4.x(i2, i3, ", codeLength=", ", tokenType=", sbR);
        sbR.append(strU);
        sbR.append(", callDelay=");
        sbR.append(i4);
        sbR.append(", requestType=");
        return zo5.w(sbR, str, "}");
    }
}
