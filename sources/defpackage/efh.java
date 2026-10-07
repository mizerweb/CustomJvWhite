package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class efh extends kih {
    public List c;
    public Map d;

    public efh(fka fkaVar) {
        super(fkaVar);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
        if (this.d == null) {
            this.d = Collections.EMPTY_MAP;
        }
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (!str.equals("phones")) {
            if (str.equals("contacts")) {
                this.c = b50.c(fkaVar);
                return;
            } else {
                fkaVar.x();
                return;
            }
        }
        this.d = new HashMap();
        int iU = ch3.U(fkaVar);
        for (int i = 0; i < iU; i++) {
            this.d.put(fkaVar.S0(), Long.valueOf(fkaVar.I0()));
        }
    }

    public final List h() {
        List list = this.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            try {
                if (((pj4) obj) != oj4.t) {
                    arrayList.add(obj);
                }
            } catch (Throwable th) {
                qr7.o(th);
                return null;
            }
        }
        return arrayList;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.u("{contacts=", tre.O(this.c), ", phones=", tre.p0(this.d), "}");
    }
}
