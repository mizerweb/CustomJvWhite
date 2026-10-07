package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yj4 extends kih {
    public List c;

    public yj4(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("contacts")) {
            this.c = b50.c(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.k(tre.O(this.c), "{contactInfos=", "}");
    }
}
