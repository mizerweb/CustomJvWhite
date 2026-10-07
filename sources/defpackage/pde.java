package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class pde implements jw1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.jw1
    public final void onRecordStarted(hw1 hw1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jw1) it.next()).onRecordStarted(hw1Var);
        }
    }

    @Override // defpackage.jw1
    public final void onRecordStopped(iw1 iw1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jw1) it.next()).onRecordStopped(iw1Var);
        }
    }
}
