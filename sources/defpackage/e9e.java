package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class e9e {
    public final fkh b;
    public final long a = 300000000000L;
    public final d9e c = new d9e(this, zo5.w(new StringBuilder(), uqi.g, " ConnectionPool"));
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();

    public e9e(pkh pkhVar) {
        this.b = pkhVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    public final boolean a(ec ecVar, y8e y8eVar, ArrayList arrayList, boolean z) {
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            c9e c9eVar = (c9e) it.next();
            synchronized (c9eVar) {
                if (z) {
                    try {
                        if (!(c9eVar.g != null)) {
                            continue;
                        } else if (c9eVar.h(ecVar, arrayList)) {
                            y8eVar.b(c9eVar);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (c9eVar.h(ecVar, arrayList)) {
                    y8eVar.b(c9eVar);
                    return true;
                }
            }
        }
    }

    public final int b(c9e c9eVar, long j) {
        byte[] bArr = uqi.a;
        ArrayList arrayList = c9eVar.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c9eVar.b.a.h + " was leaked. Did you forget to close a response body?";
                i2d i2dVar = i2d.a;
                i2d.a.j(((w8e) reference).a, str);
                arrayList.remove(i);
                c9eVar.j = true;
                if (arrayList.isEmpty()) {
                    c9eVar.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
