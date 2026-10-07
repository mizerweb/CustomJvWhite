package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ie2 {
    static xf5 b(cf2 cf2Var, oe oeVar, pe peVar, ql0 ql0Var, List list, List list2, List list3, int i) {
        oe oeVar2 = (i & 1) != 0 ? null : oeVar;
        pe peVar2 = (i & 2) != 0 ? null : peVar;
        ql0 ql0Var2 = (i & 4) != 0 ? null : ql0Var;
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        if (!cf2Var.a.a()) {
            return ar4.b(cf2Var.c, oeVar2, peVar2, ql0Var2, null, list4, list5, list6, 8);
        }
        c.p(cf2Var, " after close.", "Cannot call update3A on ");
        return null;
    }
}
