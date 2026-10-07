package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z3b extends kih {
    public Map c;

    public z3b(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_MAP;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (!str.equals("stats")) {
            fkaVar.x();
            return;
        }
        this.c = new HashMap();
        int iU = ch3.U(fkaVar);
        for (int i = 0; i < iU; i++) {
            this.c.put(Long.valueOf(fkaVar.I0()), vja.a(fkaVar));
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.k(tre.p0(this.c), "{stats=", "}");
    }
}
