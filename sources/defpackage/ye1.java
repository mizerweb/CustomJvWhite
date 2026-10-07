package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class ye1 implements xe1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.xe1
    public final void onDecorativeParticipantIdChanged(we1 we1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xe1) it.next()).onDecorativeParticipantIdChanged(we1Var);
        }
    }
}
