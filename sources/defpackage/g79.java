package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g79 extends i79 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j, Object obj, int i) {
        List listK;
        List list = (List) ldi.d.i(j, obj);
        if (list.isEmpty()) {
            if (list instanceof zy8) {
                listK = new yy8(i);
            } else {
                listK = ((list instanceof shd) && (list instanceof vj8)) ? ((vj8) list).k(i) : new ArrayList(i);
            }
            ldi.o(j, obj, listK);
            return listK;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            ldi.o(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof rci) {
            rci rciVar = (rci) list;
            yy8 yy8Var = new yy8(rciVar.a.size() + i);
            yy8Var.addAll(rciVar);
            ldi.o(j, obj, yy8Var);
            return yy8Var;
        }
        if ((list instanceof shd) && (list instanceof vj8)) {
            vj8 vj8Var = (vj8) list;
            if (!((r3) vj8Var).a) {
                vj8 vj8VarK = vj8Var.k(list.size() + i);
                ldi.o(j, obj, vj8VarK);
                return vj8VarK;
            }
        }
        return list;
    }

    @Override // defpackage.i79
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) ldi.d.i(j, obj);
        if (list instanceof zy8) {
            objUnmodifiableList = ((zy8) list).p();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof shd) && (list instanceof vj8)) {
                r3 r3Var = (r3) ((vj8) list);
                if (r3Var.a) {
                    r3Var.a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        ldi.o(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.i79
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) ldi.d.i(j, obj2);
        List listD = d(j, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        ldi.o(j, obj, list);
    }

    @Override // defpackage.i79
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
