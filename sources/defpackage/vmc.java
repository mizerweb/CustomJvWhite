package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class vmc implements qu1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.qu1
    public final void onStateChanged(yt1 yt1Var, au1 au1Var) {
        yt1Var.getClass();
        au1Var.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qu1) it.next()).onStateChanged(yt1Var, au1Var);
        }
    }
}
