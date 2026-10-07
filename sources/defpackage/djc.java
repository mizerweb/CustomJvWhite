package defpackage;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class djc implements qf7 {
    public final /* synthetic */ long a;

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        r7a r7aVar = (r7a) obj2;
        if (r7aVar != null) {
            LinkedBlockingDeque linkedBlockingDeque = r7aVar.a;
            Iterator it = linkedBlockingDeque.iterator();
            while (it.hasNext()) {
                if (((q7a) it.next()).b == this.a) {
                    it.remove();
                    break;
                }
            }
            if (!linkedBlockingDeque.isEmpty()) {
                return r7aVar;
            }
            vo8 vo8Var = (vo8) r7aVar.b.getAndSet(null);
            if (vo8Var != null) {
                vo8Var.b(null);
            }
        }
        return null;
    }
}
