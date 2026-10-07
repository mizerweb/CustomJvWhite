package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hm4 extends ArrayList {
    public static final /* synthetic */ int a = 0;

    public static hm4 a(fka fkaVar) {
        hm4 hm4Var = new hm4();
        int iJ = ch3.J(fkaVar);
        for (int i = 0; i < iJ; i++) {
            hm4Var.add(yab.q0(fkaVar));
        }
        return hm4Var;
    }

    public static hm4 b(fka fkaVar) throws IOException {
        int iJ = ch3.J(fkaVar);
        hm4 hm4Var = new hm4(iJ);
        for (int i = 0; i < iJ; i++) {
            int iU = ch3.U(fkaVar);
            String strS0 = null;
            ArrayList arrayList = null;
            gda gdaVarQ0 = null;
            long jI0 = 0;
            for (int i2 = 0; i2 < iU; i2++) {
                String strS1 = fkaVar.S0();
                strS1.getClass();
                switch (strS1) {
                    case "chatId":
                        jI0 = fkaVar.I0();
                        break;
                    case "feedback":
                        strS0 = fkaVar.S0();
                        break;
                    case "highlights":
                        int iJ2 = ch3.J(fkaVar);
                        ArrayList arrayList2 = new ArrayList(iJ2);
                        for (int i3 = 0; i3 < iJ2; i3++) {
                            arrayList2.add(fkaVar.S0());
                        }
                        arrayList = arrayList2;
                        break;
                    case "message":
                        gdaVarQ0 = yab.q0(fkaVar);
                        break;
                    default:
                        fkaVar.x();
                        break;
                }
            }
            tja tjaVar = new tja(strS0, arrayList, jI0, gdaVarQ0);
            if (gdaVarQ0 != null) {
                hm4Var.add(tjaVar);
            }
        }
        return hm4Var;
    }
}
