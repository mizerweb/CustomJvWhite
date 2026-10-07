package defpackage;

import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class fxa {
    public static final AtomicInteger d = new AtomicInteger(5);
    public final ArrayDeque a = new ArrayDeque();
    public HandlerThread b;
    public int c;

    public final void a() {
        ArrayDeque arrayDeque = this.a;
        if (!arrayDeque.isEmpty() && this.c - arrayDeque.size() < d.get()) {
            exa exaVar = (exa) arrayDeque.removeFirst();
            exaVar.c.c(1, exaVar.b).b();
        }
    }
}
