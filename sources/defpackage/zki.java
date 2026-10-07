package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class zki implements p42 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.p42
    public final void onUrlSharingInfoUpdated(o42 o42Var) {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((p42) it.next()).onUrlSharingInfoUpdated(o42Var);
        }
    }
}
