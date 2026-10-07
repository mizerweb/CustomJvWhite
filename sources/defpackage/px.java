package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class px implements rb1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.rb1
    public final void onAsrRecordStarted(pb1 pb1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rb1) it.next()).onAsrRecordStarted(pb1Var);
        }
    }

    @Override // defpackage.rb1
    public final void onAsrRecordStopped(qb1 qb1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rb1) it.next()).onAsrRecordStopped(qb1Var);
        }
    }
}
