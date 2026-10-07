package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ft6 extends kih {
    public List c;

    public ft6(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) throws IOException {
        str.getClass();
        if (!str.equals("info")) {
            fkaVar.x();
            return;
        }
        int iJ = ch3.J(fkaVar);
        this.c = new ArrayList(iJ);
        for (int i = 0; i < iJ; i++) {
            List list = this.c;
            int iU = ch3.U(fkaVar);
            String strW = null;
            jt6 jt6Var = null;
            if (iU != 0) {
                String strW2 = null;
                long jT = 0;
                for (int i2 = 0; i2 < iU; i2++) {
                    String strS0 = fkaVar.S0();
                    strS0.getClass();
                    switch (strS0) {
                        case "fileId":
                            jT = ch3.T(fkaVar, 0L);
                            break;
                        case "url":
                            strW2 = ch3.W(fkaVar);
                            break;
                        case "token":
                            strW = ch3.W(fkaVar);
                            break;
                        default:
                            fkaVar.x();
                            break;
                    }
                }
                jt6Var = new jt6(jT, strW, strW2);
            }
            list.add(jt6Var);
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{info=", String.valueOf(this.c), "}");
    }
}
