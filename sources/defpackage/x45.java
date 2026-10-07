package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x45 extends kih {
    public ww6 c;
    public List d;

    public x45(fka fkaVar) {
        super(fkaVar);
        if (this.d == null) {
            this.d = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("cmd")) {
            String strW = ch3.W(fkaVar);
            ww6 ww6Var = ww6.e;
            if (strW != null) {
                if (strW.equals("SYNC_CONTACTS")) {
                    ww6Var = ww6.g;
                } else if (strW.equals("SEND_LOG")) {
                    ww6Var = ww6.f;
                }
            }
            this.c = ww6Var;
            return;
        }
        if (!str.equals("args")) {
            fkaVar.x();
            return;
        }
        int iJ = ch3.J(fkaVar);
        this.d = new ArrayList(iJ);
        for (int i = 0; i < iJ; i++) {
            this.d.add(ch3.W(fkaVar));
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.w("{cmd='", String.valueOf(this.c), "', args=", String.valueOf(this.d), "}");
    }
}
