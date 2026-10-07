package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gm4 implements Serializable {
    public final pj4 a;
    public final String b;
    public final rfd c;
    public final List d;
    public final int e;
    public final boolean f;

    public gm4(pj4 pj4Var, String str, rfd rfdVar, ArrayList arrayList, int i, boolean z) {
        this.a = pj4Var;
        this.b = str;
        this.c = rfdVar;
        this.d = arrayList;
        this.e = i;
        this.f = z;
    }

    public static gm4 a(fka fkaVar) throws IOException {
        int iU = ch3.U(fkaVar);
        ArrayList arrayList = null;
        int iD0 = 0;
        boolean zV0 = false;
        pj4 pj4VarE = null;
        String strS0 = null;
        rfd rfdVarI = null;
        for (int i = 0; i < iU; i++) {
            String strS1 = fkaVar.S0();
            strS1.getClass();
            switch (strS1) {
                case "summary":
                    strS0 = fkaVar.S0();
                    break;
                case "restricted":
                    zV0 = fkaVar.v0();
                    break;
                case "presence":
                    rfdVarI = p90.I(fkaVar);
                    break;
                case "friends":
                    int iJ = ch3.J(fkaVar);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < iJ; i2++) {
                        arrayList2.add(Long.valueOf(fkaVar.I0()));
                    }
                    arrayList = arrayList2;
                    break;
                case "friendsCount":
                    iD0 = fkaVar.D0();
                    break;
                case "contact":
                    pj4VarE = pj4.e(fkaVar);
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return new gm4(pj4VarE, strS0, rfdVarI, arrayList, iD0, zV0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strY = ch3.y(this.b);
        int iO = tre.O(this.d);
        StringBuilder sbQ = qv1.q("{contact=", strValueOf, ", summary='", strY, "', friends=");
        qt4.x(iO, this.e, ", friendsCount=", ", restricted=", sbQ);
        return qt4.r(sbQ, this.f, "}");
    }
}
