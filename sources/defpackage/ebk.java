package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import one.video.calls.sdk_private.by;

/* JADX INFO: loaded from: classes3.dex */
public class ebk extends abk {
    public final pak a;
    public final Object b = new Object();
    public final sak c;
    public final int d;
    public final fpi e;
    public long f;
    public boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile long j;
    public long k;
    public final mak l;
    public volatile boolean m;

    public ebk(pak pakVar, mak makVar, ku8 ku8Var) {
        long j;
        this.a = pakVar;
        this.l = makVar;
        sak sakVar = new sak();
        this.c = sakVar;
        this.d = sakVar.c;
        fpi fpiVar = new fpi();
        fpiVar.b = new ConcurrentLinkedQueue();
        this.e = fpiVar;
        int i = pakVar.a;
        synchronized (makVar) {
            try {
                if (!makVar.g.containsKey(Integer.valueOf(i))) {
                    HashMap map = makVar.g;
                    Integer numValueOf = Integer.valueOf(i);
                    if (pakVar.c()) {
                        j = makVar.d;
                    } else {
                        int i2 = pakVar.a;
                        if ((i2 & 3) == 0) {
                            j = makVar.c;
                        } else {
                            if (!((i2 & 3) == 1)) {
                                throw new by();
                            }
                            j = makVar.b;
                        }
                    }
                    map.put(numValueOf, Long.valueOf(j));
                    makVar.h.put(Integer.valueOf(i), 0L);
                }
                if (i > makVar.j) {
                    makVar.j = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        makVar.i.put(Integer.valueOf(pakVar.a), this);
    }

    public static void A(ebk ebkVar, o8k o8kVar) {
        if (ebkVar.i) {
            return;
        }
        ((ConcurrentLinkedQueue) ebkVar.e.b).add((t8k) o8kVar);
        ebkVar.a.b.k(new bbk(ebkVar, 3), 20, ebkVar.E(), new cbk(ebkVar, 3), true);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    public static o8k y(ebk ebkVar) {
        int i;
        mak makVar = ebkVar.l;
        pak pakVar = ebkVar.a;
        int i2 = pakVar.a;
        if (!makVar.g.containsKey(Integer.valueOf(i2))) {
            i = 3;
        } else if (((Long) makVar.h.get(Integer.valueOf(i2))).equals(makVar.g.get(Integer.valueOf(i2)))) {
            i = 2;
        } else if (makVar.e == makVar.f) {
            i = 1;
        } else {
            i = 3;
        }
        int i3 = dbk.a[qt4.D(i)];
        if (i3 != 1) {
            if (i3 != 2) {
                return null;
            }
            long j = makVar.e;
            h5k h5kVar = new h5k(0);
            h5kVar.b = j;
            return h5kVar;
        }
        int i4 = pakVar.a;
        long j2 = ebkVar.f;
        k5k k5kVar = new k5k(2);
        k5kVar.b = i4;
        k5kVar.c = j2;
        return k5kVar;
    }

    public w4k E() {
        return w4k.d;
    }

    public final t8k I(int i) {
        long jLongValue;
        long jLongValue2;
        boolean z;
        z7k z7kVar;
        bbk bbkVar;
        int iB;
        w4k w4kVarE;
        cbk cbkVar;
        boolean z2;
        int i2;
        t8k t8kVar = null;
        if (this.i) {
            return null;
        }
        synchronized (this.b) {
            this.h = false;
        }
        if (((ConcurrentLinkedQueue) this.e.b).isEmpty()) {
            if (!this.c.a.isEmpty()) {
                mak makVar = this.l;
                pak pakVar = this.a;
                synchronized (makVar) {
                    jLongValue = ((Long) makVar.h.get(Integer.valueOf(pakVar.a))).longValue() + makVar.c(pakVar);
                }
                int i3 = this.c.d.get();
                long j = this.f;
                if (jLongValue > j || i3 == 0) {
                    pak pakVar2 = this.a;
                    pakVar2.getClass();
                    int iMin = Integer.min(i3, (i - new t8k(pakVar2.a, j, new byte[0], 0, 0, false, 0).g) - 1);
                    mak makVar2 = this.l;
                    pak pakVar3 = this.a;
                    long j2 = this.f + ((long) iMin);
                    makVar2.getClass();
                    int i4 = pakVar3.a;
                    synchronized (makVar2) {
                        long jC = makVar2.c(pakVar3);
                        long jLongValue3 = j2 - ((Long) makVar2.h.get(Integer.valueOf(i4))).longValue();
                        long jMin = Long.min(jLongValue3, jC);
                        if (jLongValue3 < 0) {
                            throw new IllegalArgumentException();
                        }
                        makVar2.f += jMin;
                        jLongValue2 = ((Long) makVar2.h.get(Integer.valueOf(i4))).longValue() + jMin;
                        makVar2.h.put(Integer.valueOf(i4), Long.valueOf(jLongValue2));
                    }
                    int iMin2 = Integer.min((int) (jLongValue2 - this.f), iMin);
                    sak sakVar = this.c;
                    pak pakVar4 = this.a;
                    pakVar4.getClass();
                    int i5 = pakVar4.a;
                    long j3 = this.f;
                    ReentrantLock reentrantLock = sakVar.e;
                    ConcurrentLinkedDeque concurrentLinkedDeque = sakVar.a;
                    byte[] bArrCopyOfRange = new byte[iMin2];
                    int i6 = 0;
                    while (i6 < iMin2 && !concurrentLinkedDeque.isEmpty()) {
                        ByteBuffer byteBuffer = (ByteBuffer) concurrentLinkedDeque.peek();
                        int i7 = iMin2 - i6;
                        if (byteBuffer.remaining() <= i7) {
                            int iRemaining = byteBuffer.remaining() + i6;
                            byteBuffer.get(bArrCopyOfRange, i6, byteBuffer.remaining());
                            concurrentLinkedDeque.poll();
                            i6 = iRemaining;
                        } else {
                            byteBuffer.get(bArrCopyOfRange, i6, i7);
                            i6 = iMin2;
                        }
                    }
                    if (concurrentLinkedDeque.isEmpty() || concurrentLinkedDeque.peek() != sakVar.b) {
                        z = false;
                    } else {
                        concurrentLinkedDeque.poll();
                        z = true;
                    }
                    if (i6 != 0 || z) {
                        sakVar.d.getAndAdd(i6 * (-1));
                        reentrantLock.lock();
                        try {
                            sakVar.f.signal();
                            reentrantLock.unlock();
                            if (i6 < iMin2) {
                                bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 0, i6);
                            }
                            t8kVar = new t8k(i5, j3, bArrCopyOfRange, 0, bArrCopyOfRange.length, z, 0);
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    if (t8kVar != null) {
                        this.f += (long) t8kVar.d;
                    }
                    if (t8kVar != null && t8kVar.f) {
                        K();
                    }
                } else if (j != this.k) {
                    this.k = j;
                    Objects.toString(this.a);
                    pak pakVar5 = this.a;
                    z7kVar = pakVar5.b;
                    bbkVar = new bbk(this, 2);
                    iB = ti8.b(pakVar5.a) + 9;
                    w4kVarE = w4k.d;
                    cbkVar = new cbk(this, 2);
                    z2 = true;
                }
            }
            z7kVar.k(bbkVar, iB, w4kVarE, cbkVar, z2);
            return t8kVar;
        }
        fpi fpiVar = this.e;
        if (!((ConcurrentLinkedQueue) fpiVar.b).isEmpty() && (i2 = (t8kVar = (t8k) ((ConcurrentLinkedQueue) fpiVar.b).poll()).g) > i) {
            t8k t8kVar2 = new t8k(t8kVar.b, t8kVar.c, t8kVar.e, 0, t8kVar.d - (i2 - i), false, 0);
            int i8 = t8kVar.b;
            long j4 = t8kVar.c;
            int i9 = t8kVar2.d;
            ((ConcurrentLinkedQueue) fpiVar.b).add(new t8k(i8, j4 + ((long) i9), t8kVar.e, i9, t8kVar.d - i9, t8kVar.f, 0));
            t8kVar = t8kVar2;
        }
        ku8 ku8Var = this.a.d;
        Objects.toString(t8kVar);
        if (t8kVar == null || (this.c.a.isEmpty() && ((ConcurrentLinkedQueue) this.e.b).isEmpty())) {
            return t8kVar;
        }
        synchronized (this.b) {
            this.h = true;
        }
        z7kVar = this.a.b;
        bbkVar = new bbk(this, 3);
        w4kVarE = E();
        cbkVar = new cbk(this, 3);
        z2 = true;
        iB = 20;
        z7kVar.k(bbkVar, iB, w4kVarE, cbkVar, z2);
        return t8kVar;
    }

    public void K() {
        this.l.i.remove(Integer.valueOf(this.a.a));
        mak makVar = this.l;
        pak pakVar = this.a;
        makVar.getClass();
        int i = pakVar.a;
        synchronized (makVar) {
            makVar.h.remove(Integer.valueOf(i));
            makVar.g.remove(Integer.valueOf(i));
        }
        this.a.e();
    }

    public final void P() throws IOException {
        if (this.g || this.i) {
            throw new IOException("output stream ".concat(this.g ? "already closed" : "is reset"));
        }
        if (this.m) {
            qr7.k("output aborted because connection is closed");
        }
    }

    @Override // defpackage.abk
    public final void b(long j) {
        if (this.g || this.i) {
            return;
        }
        this.i = true;
        this.j = j;
        sak sakVar = this.c;
        sakVar.a.clear();
        sakVar.d.set(0);
        pak pakVar = this.a;
        pakVar.b.k(new bbk(this, 0), ti8.b(j) + ti8.b(pakVar.a) + 1 + 8, w4k.d, new cbk(this, 0), true);
        Thread thread = this.c.g;
        if (thread != null) {
            thread.interrupt();
        }
        this.a.e();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g || this.m || this.i) {
            return;
        }
        sak sakVar = this.c;
        sakVar.a.add(sakVar.b);
        this.g = true;
        synchronized (this.b) {
            try {
                if (!this.h) {
                    this.h = true;
                    this.a.b.k(new bbk(this, 1), 20, E(), new cbk(this, 1), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        P();
    }

    @Override // defpackage.abk
    public final void l() {
        this.m = true;
        Thread thread = this.c.g;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        P();
        try {
            int i3 = this.d;
            if (i2 > i3) {
                int i4 = i3 / 2;
                int i5 = i2 / i4;
                for (int i6 = 0; i6 < i5; i6++) {
                    write(bArr, (i6 * i4) + i, i4);
                }
                int i7 = i2 % i4;
                if (i7 > 0) {
                    write(bArr, (i5 * i4) + i, i7);
                    return;
                }
                return;
            }
            sak sakVar = this.c;
            if (i2 > sakVar.c - sakVar.d.get()) {
                sakVar.e.lock();
                sakVar.g = Thread.currentThread();
                while (sakVar.c - sakVar.d.get() < i2) {
                    try {
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedException();
                        }
                        sakVar.f.await();
                    } catch (Throwable th) {
                        sakVar.g = null;
                        sakVar.e.unlock();
                        throw th;
                    }
                }
                sakVar.g = null;
                sakVar.e.unlock();
            }
            sakVar.a.add(ByteBuffer.wrap(Arrays.copyOfRange(bArr, i, i + i2)));
            sakVar.d.getAndAdd(i2);
            synchronized (this.b) {
                try {
                    if (!this.h) {
                        this.h = true;
                        this.a.b.k(new bbk(this, 1), 20, E(), new cbk(this, 1), true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException unused) {
            throw new InterruptedIOException("write failed because stream was ".concat(this.g ? "closed" : this.i ? "reset" : "aborted"));
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
