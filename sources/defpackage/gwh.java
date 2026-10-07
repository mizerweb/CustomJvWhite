package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class gwh implements fwh {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.fwh
    public final void a(bwh bwhVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fwh) it.next()).a(bwhVar);
        }
    }
}
