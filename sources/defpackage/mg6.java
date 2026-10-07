package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class mg6 extends m4d {
    public final oo3 b;

    public mg6(oo3 oo3Var, Iterable iterable) {
        super(iterable);
        this.b = oo3Var;
        Looper looperMyLooper = Looper.myLooper();
        new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        new LinkedList();
    }

    public final f94 d() {
        if (this.a.size() == 0) {
            return null;
        }
        f94 f94Var = new f94(new ur0[0]);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ur0 ur0Var = (ur0) this.b.invoke((m4j) it.next());
            synchronized (f94Var) {
                int size = f94Var.k.size();
                synchronized (f94Var) {
                    f94Var.D(size, Collections.singletonList(ur0Var), null);
                }
            }
        }
        return f94Var;
    }
}
