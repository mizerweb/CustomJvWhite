package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class zve implements tw1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.tw1
    public final void onRtcStats(a4e a4eVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tw1) it.next()).onRtcStats(a4eVar);
        }
    }
}
