package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class dv6 implements wi1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.wi1
    public final void onCallParticipantFingerprint(du1 du1Var, long j) {
        du1Var.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wi1) it.next()).onCallParticipantFingerprint(du1Var, j);
        }
    }
}
