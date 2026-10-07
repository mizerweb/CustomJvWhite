package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ejc implements qf7 {
    public final /* synthetic */ hjc a;
    public final /* synthetic */ long b;

    public /* synthetic */ ejc(hjc hjcVar, long j) {
        this.a = hjcVar;
        this.b = j;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        r7a r7aVar = (r7a) obj2;
        if (r7aVar == null) {
            r7aVar = new r7a();
        }
        LinkedBlockingDeque linkedBlockingDeque = r7aVar.a;
        if (!linkedBlockingDeque.isEmpty()) {
            try {
                linkedBlockingDeque.pop();
            } catch (NoSuchElementException e) {
                gm0.V(r7a.class.getName(), "removeTopTyping fail", e);
            }
        }
        if (!linkedBlockingDeque.isEmpty()) {
            this.a.f(this.b, r7aVar);
        }
        return r7aVar;
    }
}
