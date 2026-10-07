package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class f13 implements de1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.de1
    public final void onNewMessage(bc8 bc8Var) {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((de1) it.next()).onNewMessage(bc8Var);
        }
    }
}
