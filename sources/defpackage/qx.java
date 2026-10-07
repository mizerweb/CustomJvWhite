package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class qx implements sb1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.sb1
    public final void onAsrDataPackage(ux uxVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sb1) it.next()).onAsrDataPackage(uxVar);
        }
    }
}
