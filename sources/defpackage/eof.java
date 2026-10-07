package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eof extends kih {
    public List c;

    public eof(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) throws IOException {
        str.getClass();
        if (!str.equals("sessions")) {
            fkaVar.x();
            return;
        }
        int iJ = ch3.J(fkaVar);
        this.c = new ArrayList(iJ);
        for (int i = 0; i < iJ; i++) {
            List list = this.c;
            int iU = ch3.U(fkaVar);
            dmf dmfVar = null;
            if (iU != 0) {
                boolean zV0 = false;
                String strS0 = null;
                String strS1 = null;
                String strS2 = null;
                long jI0 = 0;
                for (int i2 = 0; i2 < iU; i2++) {
                    String strS3 = fkaVar.S0();
                    strS3.getClass();
                    switch (strS3) {
                        case "client":
                            strS0 = fkaVar.S0();
                            break;
                        case "info":
                            strS1 = fkaVar.S0();
                            break;
                        case "time":
                            jI0 = fkaVar.I0();
                            break;
                        case "current":
                            zV0 = fkaVar.v0();
                            break;
                        case "location":
                            strS2 = fkaVar.S0();
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                }
                dmfVar = new dmf(jI0, strS0, strS1, strS2, zV0);
            }
            list.add(dmfVar);
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.k(tre.O(this.c), "{sessions=", "}");
    }
}
