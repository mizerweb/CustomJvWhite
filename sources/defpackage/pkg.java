package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class pkg implements j32 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.j32
    public final void onMediaDataReceived(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((j32) it.next()).onMediaDataReceived(j);
        }
    }
}
