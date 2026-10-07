package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class c90 implements sp7 {
    public final cb0 a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final ConcurrentLinkedQueue d;
    public final AtomicLong e;
    public kr6 f;
    public u55 g;
    public bb0 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;

    public c90(cb0 cb0Var, s26 s26Var, b87 b87Var) throws AudioProcessor$UnhandledAudioFormatException {
        cb0 cb0Var2 = new cb0(b87Var);
        lvb.O(cb0Var2, (cb0Var2.c == -1 || cb0Var2.a == -1 || cb0Var2.b == -1) ? false : true);
        this.b = new ConcurrentLinkedQueue();
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            u55 u55Var = new u55(2);
            u55Var.d = byteBufferOrder;
            this.b.add(u55Var);
        }
        this.c = new ConcurrentLinkedQueue();
        this.d = new ConcurrentLinkedQueue();
        this.f = new kr6(cb0Var2);
        bb0 bb0VarJ = j(s26Var, b87Var, cb0Var2, cb0Var);
        this.h = bb0VarJ;
        bb0VarJ.c(db0.b);
        cb0 cb0Var3 = this.h.d;
        this.a = cb0Var3;
        lvb.O(cb0Var3, cb0Var3.c == 2);
        this.e = new AtomicLong(-9223372036854775807L);
        this.l = -9223372036854775807L;
    }

    public static bb0 j(s26 s26Var, b87 b87Var, cb0 cb0Var, cb0 cb0Var2) throws AudioProcessor$UnhandledAudioFormatException {
        int i;
        z88 z88Var = new z88(4);
        s26Var.getClass();
        z88Var.f(s26Var.f.a);
        int i2 = cb0Var2.a;
        int i3 = cb0Var2.b;
        if (i2 != -1) {
            fdg fdgVar = new fdg(false);
            lvb.R(i2 == -1 || i2 > 0);
            fdgVar.c = i2;
            z88Var.c(fdgVar);
        }
        if (i3 == 1 || i3 == 2) {
            wr2 wr2Var = new wr2();
            xr2 xr2VarA = xr2.a(1, i3);
            int i4 = xr2VarA.a;
            SparseArray sparseArray = wr2Var.i;
            sparseArray.put(i4, xr2VarA);
            xr2 xr2VarA2 = xr2.a(2, i3);
            sparseArray.put(xr2VarA2.a, xr2VarA2);
            z88Var.c(wr2Var);
        }
        bb0 bb0Var = new bb0(z88Var.h());
        cb0 cb0VarA = bb0Var.a(cb0Var);
        if ((i2 == -1 || i2 == cb0VarA.a) && ((i3 == -1 || i3 == cb0VarA.b) && ((i = cb0Var2.c) == -1 || i == cb0VarA.c))) {
            return bb0Var;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Audio can not be modified to match downstream format", cb0Var);
    }

    @Override // defpackage.rye
    public final u55 a() {
        if (this.d.isEmpty()) {
            return (u55) this.b.peek();
        }
        return null;
    }

    @Override // defpackage.wtb
    public final void b(s26 s26Var, long j, b87 b87Var, boolean z) {
        boolean z2 = false;
        if (b87Var == null) {
            lvb.Z("Could not generate silent audio because duration is unknown.", j != -9223372036854775807L);
        } else {
            lvb.b0(uya.i(b87Var.n));
            cb0 cb0Var = new cb0(b87Var);
            if (cb0Var.c != -1 && cb0Var.a != -1 && cb0Var.b != -1) {
                z2 = true;
            }
            lvb.Z(cb0Var, z2);
        }
        this.d.add(new b90(s26Var, j, b87Var, z));
    }

    @Override // defpackage.rye
    public final boolean c() {
        lvb.b0(this.d.isEmpty());
        u55 u55Var = (u55) this.b.remove();
        this.c.add(u55Var);
        this.e.compareAndSet(-9223372036854775807L, u55Var.f);
        return true;
    }

    public final void h() {
        kr6 kr6Var = this.f;
        long j = this.l;
        long j2 = this.m;
        cb0 cb0Var = (cb0) kr6Var.a;
        long jG0 = j - vqi.g0(cb0Var.a, j2 / ((long) cb0Var.d));
        cb0 cb0Var2 = (cb0) kr6Var.a;
        ((AtomicLong) kr6Var.c).addAndGet(((long) cb0Var2.d) * vqi.r(cb0Var2.a, jG0));
        this.n = true;
        if (this.o) {
            this.k = true;
        }
    }

    public final void i(u55 u55Var) {
        u55Var.q();
        u55Var.f = 0L;
        this.b.add(u55Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    public final ByteBuffer k() {
        ByteBuffer byteBufferE;
        u55 u55Var;
        ByteBuffer byteBuffer;
        cb0 cb0Var;
        boolean z = this.i;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
        if (z) {
            boolean zG = this.h.g();
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.c;
            if (zG) {
                while (true) {
                    if (this.f.H()) {
                        ByteBuffer byteBufferE2 = this.f.E();
                        this.h.j(byteBufferE2);
                        if (byteBufferE2.hasRemaining()) {
                            break;
                        }
                        if (!this.f.H()) {
                            this.h.i();
                            break;
                        }
                    } else {
                        u55 u55Var2 = (u55) concurrentLinkedQueue2.peek();
                        if (u55Var2 == null) {
                            if (!concurrentLinkedQueue.isEmpty()) {
                                if (!m()) {
                                    this.h.i();
                                    break;
                                }
                                h();
                            } else {
                                break;
                            }
                        } else if (!u55Var2.d(4)) {
                            ByteBuffer byteBuffer2 = u55Var2.d;
                            byteBuffer2.getClass();
                            long jRemaining = byteBuffer2.remaining();
                            this.h.j(byteBuffer2);
                            this.m += jRemaining - ((long) byteBuffer2.remaining());
                            if (byteBuffer2.hasRemaining()) {
                                break;
                            }
                            i((u55) concurrentLinkedQueue2.remove());
                        } else {
                            if (!m()) {
                                this.h.i();
                                this.j = true;
                                i((u55) concurrentLinkedQueue2.remove());
                                break;
                            }
                            h();
                            i((u55) concurrentLinkedQueue2.remove());
                        }
                    }
                }
                byteBufferE = this.h.e();
            } else if (this.f.H()) {
                byteBufferE = this.f.E();
            } else {
                u55 u55Var3 = this.g;
                if (u55Var3 != null) {
                    byteBufferE = u55Var3.d;
                    byteBufferE.getClass();
                    if (!byteBufferE.hasRemaining()) {
                        u55 u55Var4 = this.g;
                        u55Var4.getClass();
                        i(u55Var4);
                        this.g = null;
                        u55Var = (u55) concurrentLinkedQueue2.poll();
                        if (u55Var == null) {
                            if (!concurrentLinkedQueue.isEmpty() && m()) {
                                h();
                            }
                            byteBufferE = fb0.a;
                        } else {
                            byteBuffer = u55Var.d;
                            this.j = u55Var.d(4);
                            if (byteBuffer == null && byteBuffer.hasRemaining() && !this.j) {
                                this.g = u55Var;
                                this.m += (long) byteBuffer.remaining();
                                byteBufferE = byteBuffer;
                            } else {
                                i(u55Var);
                                if (this.j && m()) {
                                    h();
                                }
                                byteBufferE = fb0.a;
                            }
                        }
                    }
                } else {
                    u55Var = (u55) concurrentLinkedQueue2.poll();
                    if (u55Var == null) {
                        if (!concurrentLinkedQueue.isEmpty()) {
                            h();
                        }
                        byteBufferE = fb0.a;
                    } else {
                        byteBuffer = u55Var.d;
                        this.j = u55Var.d(4);
                        if (byteBuffer == null) {
                            i(u55Var);
                            if (this.j) {
                                h();
                            }
                            byteBufferE = fb0.a;
                        } else {
                            i(u55Var);
                            if (this.j) {
                                h();
                            }
                            byteBufferE = fb0.a;
                        }
                    }
                }
            }
        } else {
            byteBufferE = fb0.a;
        }
        if (byteBufferE.hasRemaining()) {
            return byteBufferE;
        }
        if (!l() && !concurrentLinkedQueue.isEmpty()) {
            b90 b90Var = (b90) concurrentLinkedQueue.poll();
            b90Var.getClass();
            s26 s26Var = b90Var.a;
            long j = b90Var.b;
            this.m = 0L;
            this.o = b90Var.d;
            this.n = false;
            b87 b87Var = b90Var.c;
            if (b87Var != null) {
                this.l = j;
                cb0Var = new cb0(b87Var);
                this.f = new kr6(cb0Var);
            } else {
                if (s26Var.f.a.isEmpty()) {
                    this.l = s26Var.b(j);
                } else {
                    this.l = j;
                }
                cb0Var = (cb0) this.f.a;
                this.e.compareAndSet(-9223372036854775807L, 0L);
                h();
            }
            if (this.i) {
                this.h = j(s26Var, b87Var, cb0Var, this.a);
            }
            this.h.c(new db0(0L));
            this.j = false;
            this.i = true;
        }
        return fb0.a;
    }

    public final boolean l() {
        ByteBuffer byteBuffer;
        if (!this.i) {
            return false;
        }
        u55 u55Var = this.g;
        if ((u55Var == null || (byteBuffer = u55Var.d) == null || !byteBuffer.hasRemaining()) && !this.f.H() && this.c.isEmpty()) {
            return this.h.g() && !this.h.f();
        }
        return true;
    }

    public final boolean m() {
        if (this.n) {
            return false;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return false;
        }
        long j2 = this.m;
        cb0 cb0Var = (cb0) this.f.a;
        return j - vqi.g0(cb0Var.a, j2 / ((long) cb0Var.d)) > 2000;
    }
}
