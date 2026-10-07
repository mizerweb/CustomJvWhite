package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zn6 {
    public final rre a;
    public final ig0 b = new ig0(4);

    public zn6(rre rreVar) {
        this.a = rreVar;
    }

    public final Object a(List list, nq4 nq4Var) {
        return ch3.I(nq4Var, this.a, true, false, new yn6(0, nbh.x(") AND post_id = 0", nbh.C("SELECT * FROM fcm_notifications_history WHERE chat_id IN ("), list), list));
    }
}
