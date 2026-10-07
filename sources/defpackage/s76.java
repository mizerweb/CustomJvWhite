package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class s76 extends tye implements sp7 {
    public static final ByteBuffer o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    public final b87 e;
    public final long f;
    public final AtomicLong g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentLinkedQueue i;
    public volatile boolean j;
    public long k;
    public boolean l;
    public long m;
    public u55 n;

    public s76(b87 b87Var, b2i b2iVar, t9b t9bVar, g85 g85Var, long j) {
        super(b87Var, t9bVar);
        this.e = b87Var;
        this.f = j;
        this.g = new AtomicLong();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentLinkedQueue();
        g85Var.M(b2iVar);
    }

    @Override // defpackage.rye
    public final u55 a() {
        if (this.n == null) {
            u55 u55Var = (u55) this.h.poll();
            this.n = u55Var;
            if (!this.l) {
                if (u55Var == null) {
                    u55 u55Var2 = new u55(2);
                    this.n = u55Var2;
                    u55Var2.d = o;
                } else {
                    long j = this.m;
                    ByteBuffer byteBuffer = u55Var.d;
                    byteBuffer.getClass();
                    this.m = j - ((long) byteBuffer.capacity());
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.wtb
    public final void b(s26 s26Var, long j, b87 b87Var, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        atomicLong.addAndGet(j);
    }

    @Override // defpackage.rye
    public final boolean c() {
        u55 u55Var = this.n;
        u55Var.getClass();
        this.n = null;
        if (u55Var.d(4)) {
            this.j = true;
        } else {
            u55Var.f = this.k + this.f + u55Var.f;
            this.i.add(u55Var);
        }
        if (!this.l) {
            int size = this.i.size() + this.h.size();
            long j = this.m;
            ByteBuffer byteBuffer = u55Var.d;
            byteBuffer.getClass();
            long jCapacity = j + ((long) byteBuffer.capacity());
            this.m = jCapacity;
            this.l = size >= 10 && (size >= 200 || jCapacity >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        }
        return true;
    }

    @Override // defpackage.tye
    public final sp7 i(s26 s26Var, b87 b87Var, int i) {
        return this;
    }

    @Override // defpackage.tye
    public final u55 j() {
        return (u55) this.i.peek();
    }

    @Override // defpackage.tye
    public final b87 k() {
        return this.e;
    }

    @Override // defpackage.tye
    public final boolean l() {
        return this.j && this.i.isEmpty();
    }

    @Override // defpackage.tye
    public final void n() {
    }

    @Override // defpackage.tye
    public final void o() {
        u55 u55Var = (u55) this.i.remove();
        u55Var.q();
        u55Var.f = 0L;
        this.h.add(u55Var);
    }
}
