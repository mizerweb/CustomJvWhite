package defpackage;

import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u97 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final v56 b = new v56((Looper) null);

    public final void a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.K(new dx4((u97) it.next(), 17, str));
        }
    }
}
