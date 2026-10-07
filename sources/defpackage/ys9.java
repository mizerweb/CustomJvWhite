package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ys9 {
    public final rre a;
    public final ig0 b = new ig0(5);

    public ys9(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e4 A[LOOP:1: B:32:0x00de->B:34:0x00e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0127  */
    /* JADX WARN: Code duplicated, block: B:42:0x0138  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Serializable a(ys9 ys9Var, List list, nq4 nq4Var) {
        vs9 vs9Var;
        List list2;
        ys9 ys9Var2;
        List list3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        if (nq4Var instanceof vs9) {
            vs9Var = (vs9) nq4Var;
            int i = vs9Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                vs9Var.j = i - Integer.MIN_VALUE;
            } else {
                vs9Var = new vs9(ys9Var, nq4Var);
            }
        } else {
            vs9Var = new vs9(ys9Var, nq4Var);
        }
        Object objI = vs9Var.h;
        int i2 = vs9Var.j;
        int i3 = 10;
        int i4 = 3;
        int i5 = 2;
        int i6 = 0;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            vs9Var.d = ys9Var;
            vs9Var.e = list;
            vs9Var.j = 1;
            objI = ch3.I(vs9Var, ys9Var.a, true, false, new tj1(i5, nbh.x(")", nbh.C("SELECT * FROM media_cache WHERE message_id IN ("), list), list));
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            list = vs9Var.e;
            ys9Var = vs9Var.d;
            ch3.d0(objI);
        } else {
            if (i2 == 2) {
                list3 = vs9Var.f;
                List list4 = vs9Var.e;
                ys9Var2 = vs9Var.d;
                ch3.d0(objI);
                list2 = list3;
                ys9Var = ys9Var2;
                arrayList = new ArrayList(list2.size());
                arrayList.addAll(list2);
                List list5 = list2;
                arrayList2 = new ArrayList(yw3.W0(list5, 10));
                it = list5.iterator();
                while (it.hasNext()) {
                    c0a.t(((zs9) it.next()).a(), arrayList2);
                }
                vs9Var.d = null;
                vs9Var.e = null;
                vs9Var.f = null;
                vs9Var.g = arrayList;
                vs9Var.j = 3;
                ys9Var.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT attach_id, COUNT(attach_id) AS attachCount FROM media_cache WHERE attach_id IN (");
                vd7.b(sb, arrayList2.size());
                sb.append(") GROUP BY attach_id");
                objI = ch3.I(vs9Var, ys9Var.a, true, false, new xs9(arrayList2, i6, sb.toString()));
                if (objI != hu4Var) {
                    arrayList3 = arrayList;
                }
                return hu4Var;
            }
            if (i2 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList3 = vs9Var.g;
            List list6 = vs9Var.f;
            List list7 = vs9Var.e;
            ch3.d0(objI);
        }
        for (Map.Entry entry : ((Map) objI).entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                arrayList3.removeIf(new u6(i3, new lh9(4, entry)));
            }
        }
        return arrayList3;
        list2 = (List) objI;
        if (list2.isEmpty()) {
            arrayList = new ArrayList(list2.size());
            arrayList.addAll(list2);
            List list8 = list2;
            arrayList2 = new ArrayList(yw3.W0(list8, 10));
            it = list8.iterator();
            while (it.hasNext()) {
                c0a.t(((zs9) it.next()).a(), arrayList2);
            }
            vs9Var.d = null;
            vs9Var.e = null;
            vs9Var.f = null;
            vs9Var.g = arrayList;
            vs9Var.j = 3;
            ys9Var.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SELECT attach_id, COUNT(attach_id) AS attachCount FROM media_cache WHERE attach_id IN (");
            vd7.b(sb2, arrayList2.size());
            sb2.append(") GROUP BY attach_id");
            objI = ch3.I(vs9Var, ys9Var.a, true, false, new xs9(arrayList2, i6, sb2.toString()));
            if (objI != hu4Var) {
                arrayList3 = arrayList;
                while (r13.hasNext()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        arrayList3.removeIf(new u6(i3, new lh9(4, entry)));
                    }
                }
                return arrayList3;
            }
        } else {
            vs9Var.d = ys9Var;
            vs9Var.e = null;
            vs9Var.f = list2;
            vs9Var.j = 2;
            ys9Var.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DELETE FROM media_cache WHERE message_id IN (");
            Object objI2 = ch3.I(vs9Var, ys9Var.a, false, true, new tj1(i4, nbh.x(")", sb3, list), list));
            if (objI2 != hu4Var) {
                objI2 = sbi.a;
            }
            if (objI2 != hu4Var) {
                ys9Var2 = ys9Var;
                list3 = list2;
                list2 = list3;
                ys9Var = ys9Var2;
                arrayList = new ArrayList(list2.size());
                arrayList.addAll(list2);
                List list9 = list2;
                arrayList2 = new ArrayList(yw3.W0(list9, 10));
                it = list9.iterator();
                while (it.hasNext()) {
                    c0a.t(((zs9) it.next()).a(), arrayList2);
                }
                vs9Var.d = null;
                vs9Var.e = null;
                vs9Var.f = null;
                vs9Var.g = arrayList;
                vs9Var.j = 3;
                ys9Var.getClass();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("SELECT attach_id, COUNT(attach_id) AS attachCount FROM media_cache WHERE attach_id IN (");
                vd7.b(sb4, arrayList2.size());
                sb4.append(") GROUP BY attach_id");
                objI = ch3.I(vs9Var, ys9Var.a, true, false, new xs9(arrayList2, i6, sb4.toString()));
                if (objI != hu4Var) {
                    arrayList3 = arrayList;
                    while (r13.hasNext()) {
                        if (((Number) entry.getValue()).intValue() > 0) {
                            arrayList3.removeIf(new u6(i3, new lh9(4, entry)));
                        }
                    }
                    return arrayList3;
                }
            }
        }
        return hu4Var;
    }
}
