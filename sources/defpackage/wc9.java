package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class wc9 {
    public final vc9 a;
    public final long b;

    public wc9(vc9 vc9Var, long j) {
        this.a = vc9Var;
        this.b = j;
    }

    public static wc9 a(fka fkaVar) throws IOException {
        int iU = ch3.U(fkaVar);
        double dP = 1.401298464324817E-45d;
        double dP2 = 1.401298464324817E-45d;
        long jT = 0;
        double dP3 = 0.0d;
        float fQ = 0.0f;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "alt":
                    dP3 = ch3.P(fkaVar, 0.0d);
                    break;
                case "epu":
                    fQ = ch3.Q(fkaVar);
                    break;
                case "hdn":
                    fQ2 = ch3.Q(fkaVar);
                    break;
                case "lat":
                    dP = ch3.P(fkaVar, 1.401298464324817E-45d);
                    break;
                case "lng":
                    dP2 = ch3.P(fkaVar, 1.401298464324817E-45d);
                    break;
                case "spd":
                    fQ3 = ch3.Q(fkaVar);
                    break;
                case "time":
                    jT = ch3.T(fkaVar, 0L);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new wc9(new vc9(dP, dP2, dP3, fQ, fQ2, fQ3), jT);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "LocationInfo{location=", String.valueOf(this.a), ", time=");
        sbB.append("}");
        return sbB.toString();
    }
}
