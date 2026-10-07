package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jg0 {
    public final rre a;
    public final ig0 b = new ig0(0);

    public jg0(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(gof gofVar, nq4 nq4Var) {
        gg0 gg0Var;
        if (nq4Var instanceof gg0) {
            gg0Var = (gg0) nq4Var;
            int i = gg0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gg0Var.g = i - Integer.MIN_VALUE;
            } else {
                gg0Var = new gg0(this, nq4Var);
            }
        } else {
            gg0Var = new gg0(this, nq4Var);
        }
        Object objI = gg0Var.e;
        int i2 = gg0Var.g;
        if (i2 == 0) {
            ch3.d0(objI);
            if (gofVar.a.isEmpty()) {
                return c76.a;
            }
            final ArrayList arrayList = new ArrayList(yw3.W0(gofVar, 10));
            Object it = gofVar.iterator();
            while (((sl9) it).hasNext()) {
                c0a.t(((fg0) ((ql9) it).next()).a(), arrayList);
            }
            final ArrayList arrayList2 = new ArrayList(yw3.W0(gofVar, 10));
            Object it2 = gofVar.iterator();
            while (((sl9) it2).hasNext()) {
                arrayList2.add(new Integer(((fg0) ((ql9) it2).next()).b()));
            }
            gg0Var.d = gofVar;
            gg0Var.g = 1;
            StringBuilder sbC = nbh.C("\n        SELECT attach_id, type\n        FROM gallery_saved_index\n        WHERE attach_id IN (");
            final int size = arrayList.size();
            vd7.b(sbC, size);
            sbC.append(") AND type IN (");
            vd7.b(sbC, arrayList2.size());
            sbC.append(")");
            sbC.append("\n");
            sbC.append("        ");
            final String string = sbC.toString();
            objI = ch3.I(gg0Var, this.a, true, false, new cf7() { // from class: hg0
                @Override // defpackage.cf7
                public final Object invoke(Object obj) throws Exception {
                    ArrayList arrayList3 = arrayList;
                    int i3 = size;
                    ArrayList arrayList4 = arrayList2;
                    vxe vxeVarO0 = ((qxe) obj).O0(string);
                    try {
                        Iterator it3 = arrayList3.iterator();
                        int i4 = 1;
                        while (it3.hasNext()) {
                            vxeVarO0.c(i4, ((Number) it3.next()).longValue());
                            i4++;
                        }
                        int i5 = i3 + 1;
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            vxeVarO0.c(i5, ((Number) it4.next()).intValue());
                            i5++;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        while (vxeVarO0.M0()) {
                            arrayList5.add(new fg0(vxeVarO0.getLong(0), (int) vxeVarO0.getLong(1)));
                        }
                        return arrayList5;
                    } finally {
                        vxeVarO0.close();
                    }
                }
            });
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gofVar = gg0Var.d;
            ch3.d0(objI);
        }
        return lof.Y(gofVar, ww3.X1((Iterable) objI));
    }
}
