package defpackage;

import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class cu5 {
    public static final cu5 b = new cu5();
    public static final boolean c = true;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(20);

    public final void a(bu5 bu5Var) {
        if (!c) {
            return;
        }
        int i = 5;
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.a;
            if (arrayBlockingQueue.offer(bu5Var) || i <= 0) {
                return;
            }
            arrayBlockingQueue.poll();
            i--;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
