package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lk7 {
    public final ny8 a;

    public lk7(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0051 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final boolean a(rt2 rt2Var, List list) {
        sfa sfaVar;
        List<sfa> list2 = list;
        boolean z = list2 instanceof Collection;
        if (z && list2.isEmpty()) {
            if (rt2Var != null) {
                if (list.size() > 1) {
                    sfaVar = (sfa) ww3.t1(list);
                    if (sfaVar != null) {
                        if (sfaVar.q == null) {
                        }
                    }
                } else if (z) {
                    for (sfa sfaVar2 : list2) {
                        if (sfaVar2.q == null) {
                        }
                    }
                } else {
                    while (r7.hasNext()) {
                        if (sfaVar2.q == null) {
                        }
                    }
                }
            }
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((tt7) this.a.getValue()).a((sfa) it.next())) {
            }
        }
        if (rt2Var != null && rt2Var.y0()) {
            if (list.size() > 1) {
                sfaVar = (sfa) ww3.t1(list);
                if (sfaVar != null) {
                    return sfaVar.q == null && sfaVar.o == 2;
                }
            } else if (z || !list2.isEmpty()) {
                while (r7.hasNext()) {
                    if (sfaVar2.q == null && sfaVar2.o == 2) {
                        return true;
                    }
                }
            }
        }
        return true;
        return false;
    }
}
