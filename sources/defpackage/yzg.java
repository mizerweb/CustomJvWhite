package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yzg {
    public final rre a;
    public final pl b = new pl(25, this);

    public yzg(rre rreVar) {
        this.a = rreVar;
    }

    public final Object a(long j, w0h w0hVar, Set set, nq4 nq4Var) {
        StringBuilder sbC = nbh.C("UPDATE story_publish SET status = ? WHERE draft_id = ? AND status IN (");
        vd7.b(sbC, set.size());
        sbC.append(")");
        Object objI = ch3.I(nq4Var, this.a, false, true, new g39(sbC.toString(), this, w0hVar, j, set));
        return objI == hu4.a ? objI : sbi.a;
    }
}
