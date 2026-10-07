package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f73 extends kih {
    public st2 c;
    public gda d;
    public List e;

    public f73(fka fkaVar) {
        super(fkaVar);
        if (this.e == null) {
            this.e = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        ArrayList arrayList;
        str.getClass();
        switch (str) {
            case "deletedMessageIds":
                if (fkaVar.y().a() == 7) {
                    arrayList = new ArrayList();
                    int iT0 = fkaVar.t0();
                    for (int i = 0; i < iT0; i++) {
                        arrayList.add(Long.valueOf(ch3.T(fkaVar, 0L)));
                    }
                } else {
                    fkaVar.x();
                    arrayList = null;
                }
                this.e = arrayList;
                break;
            case "chat":
                this.c = st2.b(fkaVar);
                break;
            case "message":
                this.d = yab.q0(fkaVar);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        return zo5.t(qv1.q("{chat=", strValueOf, ", message=", strValueOf2, ", deletedMessageIds="), tre.O(this.e), "}");
    }
}
