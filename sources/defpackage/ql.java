package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class ql {
    public final rre a;
    public final pl b = new pl(0);

    public ql(rre rreVar) {
        this.a = rreVar;
    }

    public final Object a(Collection collection, nq4 nq4Var) {
        StringBuilder sbC = nbh.C("SELECT * FROM animoji WHERE id IN (");
        vd7.b(sbC, collection.size());
        sbC.append(")");
        return ch3.I(nq4Var, this.a, true, false, new ol(sbC.toString(), 0, collection));
    }
}
