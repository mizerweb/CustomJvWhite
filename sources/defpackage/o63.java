package defpackage;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class o63 implements Serializable {
    public final pj4 a;
    public final rfd b;
    public final long c;
    public final long d;
    public final long e;

    public o63(pj4 pj4Var, rfd rfdVar, long j, long j2, long j3) {
        this.a = pj4Var;
        this.b = rfdVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public static o63 a(fka fkaVar) throws IOException {
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        pj4 pj4VarE = null;
        rfd rfdVarI = null;
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        for (int i = 0; i < iU; i++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "presence":
                    rfdVarI = p90.I(fkaVar);
                    break;
                case "readMark":
                    jT = ch3.T(fkaVar, 0L);
                    break;
                case "blockedCommentsTime":
                    jT2 = ch3.T(fkaVar, 0L);
                    break;
                case "contact":
                    pj4VarE = pj4.e(fkaVar);
                    break;
                case "blockedById":
                    jT3 = ch3.T(fkaVar, 0L);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new o63(pj4VarE, rfdVarI, jT, jT2, jT3);
    }
}
