package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class prb {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;
    public final ReentrantLock a = new ReentrantLock();
    public final ReentrantLock e = new ReentrantLock();

    public prb(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }

    public final boolean a(int[] iArr) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    this.d = true;
                    z = true;
                }
            }
            return z || this.d || this.f;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(int[] iArr) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    this.d = true;
                    z = true;
                }
            }
            return z || this.d || this.f;
        } finally {
            reentrantLock.unlock();
        }
    }
}
