package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class k9 implements y91 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.y91
    public final void onActiveParticipantUpdated(x91 x91Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((y91) it.next()).onActiveParticipantUpdated(x91Var);
        }
    }

    @Override // defpackage.y91
    public final void onActiveParticipantsAdded(t91 t91Var) {
        if (t91Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((y91) it.next()).onActiveParticipantsAdded(t91Var);
        }
    }

    @Override // defpackage.y91
    public final void onActiveParticipantsChanged(u91 u91Var) {
        if (u91Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((y91) it.next()).onActiveParticipantsChanged(u91Var);
        }
    }

    @Override // defpackage.y91
    public final void onActiveParticipantsDeAnonimized(v91 v91Var) {
        if (v91Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((y91) it.next()).onActiveParticipantsDeAnonimized(v91Var);
        }
    }

    @Override // defpackage.y91
    public final void onActiveParticipantsRemoved(w91 w91Var) {
        if (w91Var.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((y91) it.next()).onActiveParticipantsRemoved(w91Var);
        }
    }
}
