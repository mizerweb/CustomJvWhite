package defpackage;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fjc implements qf7 {
    public final /* synthetic */ w50 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hjc c;
    public final /* synthetic */ long d;

    public /* synthetic */ fjc(w50 w50Var, long j, hjc hjcVar, long j2) {
        this.a = w50Var;
        this.b = j;
        this.c = hjcVar;
        this.d = j2;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        long j;
        r7a r7aVar = (r7a) obj2;
        if (r7aVar == null) {
            r7aVar = new r7a();
        }
        LinkedBlockingDeque linkedBlockingDeque = r7aVar.a;
        Iterator it = linkedBlockingDeque.iterator();
        do {
            boolean zHasNext = it.hasNext();
            j = this.b;
            if (!zHasNext) {
                linkedBlockingDeque.push(new q7a(j, this.a));
                break;
            }
        } while (((q7a) it.next()).b != j);
        if (!linkedBlockingDeque.isEmpty()) {
            this.c.f(this.d, r7aVar);
        }
        return r7aVar;
    }
}
