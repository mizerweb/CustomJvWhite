package defpackage;

import java.util.HashMap;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class tih implements uih {
    public final uih a;
    public final HashMap b = new HashMap();

    public tih(uih uihVar) {
        this.a = uihVar;
    }

    @Override // defpackage.uih
    public final ThreadFactory a(String str) {
        HashMap map = this.b;
        ThreadFactory threadFactory = (ThreadFactory) map.get(str);
        if (threadFactory != null) {
            return threadFactory;
        }
        ThreadFactory threadFactoryA = this.a.a(str);
        map.put(str, threadFactoryA);
        return threadFactoryA;
    }
}
