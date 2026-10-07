package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class k3j implements w52 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.w52
    public final void j(uik uikVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((w52) it.next()).j(uikVar);
        }
    }
}
