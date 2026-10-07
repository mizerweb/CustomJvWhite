package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class em4 extends kih {
    public List c;
    public int d;

    public em4(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (!str.equals("result")) {
            if (str.equals("total")) {
                this.d = fkaVar.D0();
                return;
            } else {
                fkaVar.x();
                return;
            }
        }
        int i = hm4.a;
        int iJ = ch3.J(fkaVar);
        hm4 hm4Var = new hm4(iJ);
        for (int i2 = 0; i2 < iJ; i2++) {
            hm4Var.add(gm4.a(fkaVar));
        }
        this.c = hm4Var;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.u("{contacts=", tre.O(this.c), ", total=", this.d, "}");
    }
}
