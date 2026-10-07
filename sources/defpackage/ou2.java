package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ou2 extends kih {
    public List c;
    public HashMap d;

    public ou2(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("commands")) {
            this.c = d01.a(fkaVar);
            return;
        }
        if (!str.equals("contacts")) {
            fkaVar.x();
            return;
        }
        this.d = new HashMap();
        int iU = ch3.U(fkaVar);
        for (int i = 0; i < iU; i++) {
            long jI0 = fkaVar.I0();
            this.d.put(Long.valueOf(jI0), pj4.e(fkaVar));
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.u("{commands=", tre.O(this.c), ", contacts=", tre.p0(this.d), "}");
    }
}
