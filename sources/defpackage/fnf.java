package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class fnf implements c12 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.c12
    public final void a(kzi kziVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c12) it.next()).a(kziVar);
        }
    }
}
