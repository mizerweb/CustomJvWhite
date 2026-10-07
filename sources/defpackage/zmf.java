package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class zmf implements b12 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.b12
    public final void a(uvc uvcVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b12) it.next()).a(uvcVar);
        }
    }
}
