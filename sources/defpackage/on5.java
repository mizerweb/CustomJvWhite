package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class on5 {
    public boolean b;
    public boolean c;
    public boolean a = true;
    public final ArrayDeque d = new ArrayDeque();

    public final void a() {
        ArrayDeque arrayDeque = this.d;
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (!arrayDeque.isEmpty()) {
                if (!(this.b || !this.a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.c = false;
        }
    }
}
