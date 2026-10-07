package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class inf implements h12 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.h12
    public final void onCurrentParticipantActiveRoomChanged(d12 d12Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((h12) it.next()).onCurrentParticipantActiveRoomChanged(d12Var);
        }
    }

    @Override // defpackage.h12
    public final void onCurrentParticipantInvitedToRoom(e12 e12Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((h12) it.next()).onCurrentParticipantInvitedToRoom(e12Var);
        }
    }

    @Override // defpackage.h12
    public final void onRoomRemoved(f12 f12Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((h12) it.next()).onRoomRemoved(f12Var);
        }
    }

    @Override // defpackage.h12
    public final void onRoomUpdated(g12 g12Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((h12) it.next()).onRoomUpdated(g12Var);
        }
    }
}
