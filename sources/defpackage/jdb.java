package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class jdb implements ds1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.ds1
    public final void onCallParticipantNetworkStatusChanged(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ds1) it.next()).onCallParticipantNetworkStatusChanged(list);
        }
    }
}
