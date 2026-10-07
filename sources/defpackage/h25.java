package defpackage;

import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class h25 extends Thread {
    public final d0c a;
    public final int b;
    public f25 c;
    public final ConcurrentLinkedQueue d;
    public final AtomicInteger e;
    public ym f;
    public int g;
    public final ReentrantLock h;
    public final Condition i;
    public final ReentrantLock j;
    public volatile boolean k;

    public h25(f25 f25Var, d0c d0cVar) {
        d0cVar.getClass();
        this.a = d0cVar;
        this.b = 30;
        this.c = f25Var;
        this.d = new ConcurrentLinkedQueue();
        this.e = new AtomicInteger(0);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.h = reentrantLock;
        this.i = reentrantLock.newCondition();
        this.j = new ReentrantLock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int length;
        byte[] bArr;
        int i;
        float[] fArr;
        loop0: while (!this.k) {
            ReentrantLock reentrantLock = this.j;
            reentrantLock.lock();
            try {
                f25 f25Var = this.c;
                ?? r5 = f25Var == null;
                long jBufferedAmount = f25Var != null ? f25Var.a.bufferedAmount() : 0L;
                reentrantLock.unlock();
                if (r5 == true) {
                    break;
                }
                while (!this.k && (jBufferedAmount >= 8000000 || (this.f == null && this.d.isEmpty()))) {
                    try {
                        ReentrantLock reentrantLock2 = this.h;
                        reentrantLock2.lock();
                        try {
                            this.i.await(50L, TimeUnit.MILLISECONDS);
                            reentrantLock2.unlock();
                            ReentrantLock reentrantLock3 = this.j;
                            reentrantLock3.lock();
                            try {
                                f25 f25Var2 = this.c;
                                r5 = f25Var2 == null;
                                if (f25Var2 != null) {
                                    jBufferedAmount = f25Var2.a.bufferedAmount();
                                } else {
                                    jBufferedAmount = 0;
                                }
                                reentrantLock3.unlock();
                            } catch (Throwable th) {
                                reentrantLock3.unlock();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            reentrantLock2.unlock();
                            throw th2;
                        }
                    } catch (Throwable unused) {
                    }
                    if (r5 != false) {
                        break loop0;
                    }
                }
                if (this.k) {
                    break;
                }
                if (this.f == null) {
                    ym ymVar = (ym) this.d.poll();
                    this.f = ymVar;
                    if (ymVar == null) {
                        continue;
                    } else {
                        this.e.decrementAndGet();
                    }
                }
                ym ymVar2 = this.f;
                if (ymVar2 != null) {
                    int i2 = this.g;
                    this.g = i2 + 1;
                    int i3 = ymVar2.b;
                    int i4 = ymVar2.a;
                    sl slVar = ymVar2.c;
                    if (i4 == 1) {
                        boolean z = slVar instanceof ul;
                        if (slVar instanceof rl) {
                            fArr = ((rl) slVar).a;
                        } else {
                            if (!z) {
                                if (slVar instanceof tl) {
                                    ore.k("Internal error AnimojiSendDataPackage");
                                    return;
                                } else {
                                    ore.o();
                                    return;
                                }
                            }
                            fArr = new float[0];
                        }
                        bArr = new byte[(fArr.length * 4) + 10];
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        byteBufferWrap.put((byte) 1);
                        byteBufferWrap.putShort((short) i2);
                        byteBufferWrap.putInt(i3);
                        byteBufferWrap.putShort((short) 0);
                        byteBufferWrap.put(z ? (byte) 1 : (byte) 0);
                        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                        for (float f : fArr) {
                            byteBufferWrap.putFloat(f);
                        }
                    } else {
                        boolean z2 = slVar instanceof rl;
                        if (z2) {
                            length = ((rl) slVar).a.length;
                        } else if (slVar instanceof tl) {
                            length = 3;
                        } else {
                            if (!(slVar instanceof ul)) {
                                ore.o();
                                return;
                            }
                            length = 0;
                        }
                        bArr = new byte[length + 12];
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                        if (z2) {
                            i = 0;
                        } else if (slVar instanceof tl) {
                            i = 2;
                        } else {
                            if (!(slVar instanceof ul)) {
                                ore.o();
                                return;
                            }
                            i = 1;
                        }
                        byteBufferWrap2.put((byte) 2);
                        byteBufferWrap2.putShort((short) i2);
                        byteBufferWrap2.putInt(i3);
                        byteBufferWrap2.putInt(0);
                        byteBufferWrap2.put((byte) i);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        if (z2) {
                            for (float f2 : ((rl) slVar).a) {
                                byteBufferWrap2.put((byte) (f2 * 255.0f));
                            }
                        } else if (slVar instanceof tl) {
                            tl tlVar = (tl) slVar;
                            byte bRed = (byte) Color.red(tlVar.a);
                            byte bGreen = (byte) Color.green(tlVar.a);
                            byte bBlue = (byte) Color.blue(tlVar.a);
                            byteBufferWrap2.put(bRed);
                            byteBufferWrap2.put(bGreen);
                            byteBufferWrap2.put(bBlue);
                        } else if (!slVar.equals(ul.a)) {
                            ore.o();
                            return;
                        }
                    }
                    ReentrantLock reentrantLock4 = this.j;
                    reentrantLock4.lock();
                    try {
                        boolean z3 = this.c == null;
                        ((AtomicInteger) this.a.a).addAndGet(bArr.length);
                        f25 f25Var3 = this.c;
                        if (f25Var3 != null) {
                            f25Var3.e(2, bArr);
                        }
                        ((AtomicInteger) this.a.b).incrementAndGet();
                        this.f = null;
                        reentrantLock4.unlock();
                        if (z3) {
                            break;
                        }
                    } catch (Throwable th3) {
                        reentrantLock4.unlock();
                        throw th3;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th4) {
                reentrantLock.unlock();
                throw th4;
            }
        }
        this.f = null;
        this.d.clear();
    }
}
