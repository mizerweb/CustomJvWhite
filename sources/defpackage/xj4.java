package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xj4 extends aq implements qih {
    public final int f;
    public final int g;
    public final int h;

    public xj4(long j, int i) {
        super(j);
        this.f = 1;
        this.g = i;
        this.h = 40;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        List<pj4> list;
        List list2;
        List list3 = ((yj4) kihVar).c;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                try {
                    if (((pj4) obj) != oj4.t) {
                        arrayList.add(obj);
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                    return;
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (pj4 pj4Var : list) {
            if ((pj4Var.s.b & np0.o) != 0) {
                arrayList2.add(pj4Var);
            } else {
                arrayList3.add(pj4Var);
            }
        }
        q().n(arrayList2, ji4.a);
        q().n(arrayList3, ji4.b);
        t51 t51VarO = o();
        if (list.isEmpty()) {
            list2 = r66.a;
        } else {
            List list4 = list;
            ArrayList arrayList4 = new ArrayList(list4.size());
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                try {
                    arrayList4.add(Long.valueOf(((pj4) it.next()).a));
                } catch (Throwable th2) {
                    qr7.o(th2);
                    return;
                }
            }
            list2 = arrayList4;
        }
        t51VarO.c(new bk4(this.a, this.f, this.g, this.h, list2));
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (yhhVar instanceof thh) {
            o().c(new yq0(this.a, yhhVar));
            return;
        }
        o().c(new bk4(this.a, this.f, this.g, this.h, r66.a));
    }

    @Override // defpackage.aq
    public final Object m() {
        String str;
        wy2 wy2Var = new wy2((kfc) null, 21);
        int i = this.f;
        if (i == 1) {
            str = "BLOCKED";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "REMOVED";
        }
        wy2Var.h("status", str);
        int i2 = this.g;
        if (i2 > 0) {
            wy2Var.c(i2, "from");
        }
        int i3 = this.h;
        if (i3 > 0) {
            wy2Var.c(i3, "count");
        }
        return wy2Var;
    }
}
