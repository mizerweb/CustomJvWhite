package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

/* JADX INFO: loaded from: classes3.dex */
public final class czh implements o31 {
    public final am5 a;
    public final LongAdder b = new LongAdder();
    public final LongAdder c = new LongAdder();
    public final AtomicLong d = new AtomicLong();
    public final LongAccumulator e = new LongAccumulator(new bzh(), 0);
    public final LongAdder f = new LongAdder();
    public final LongAdder g = new LongAdder();

    public czh(am5 am5Var) {
        this.a = am5Var;
    }

    @Override // defpackage.o31
    public final ByteBuffer a(int i) {
        long j = i;
        this.b.add(j);
        this.d.addAndGet(j);
        this.f.increment();
        return ByteBuffer.allocateDirect(i);
    }

    @Override // defpackage.o31
    public final void b(ByteBuffer byteBuffer) throws IllegalAccessException, InvocationTargetException {
        long jCapacity = byteBuffer.capacity();
        this.c.add(jCapacity);
        AtomicLong atomicLong = this.d;
        this.e.accumulate(atomicLong.longValue());
        atomicLong.addAndGet(-jCapacity);
        this.g.increment();
        this.a.b(byteBuffer);
    }
}
