package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class mv6 implements dm0 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.dm0
    public final void a(boolean z) {
        synchronized (ov6.j) {
            try {
                for (ov6 ov6Var : new ArrayList(ov6.k.values())) {
                    if (ov6Var.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = ov6Var.i.iterator();
                        while (it.hasNext()) {
                            ov6 ov6Var2 = ((lv6) it.next()).a;
                            if (!z) {
                                ((za5) ov6Var2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
