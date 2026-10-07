package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class qlh {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(qlh.class, Object.class, "reader$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    private volatile /* synthetic */ Object _value$volatile = null;
    private volatile /* synthetic */ Object exceptionWhenReading$volatile;
    private volatile /* synthetic */ Object reader$volatile;
    private volatile /* synthetic */ int readers$volatile;
    private volatile /* synthetic */ Object writer$volatile;

    static {
        Unsafe unsafe = bl0.a;
        h = unsafe.objectFieldOffset(qlh.class.getDeclaredField("reader$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(qlh.class, "readers$volatile");
        c = AtomicReferenceFieldUpdater.newUpdater(qlh.class, Object.class, "writer$volatile");
        i = unsafe.objectFieldOffset(qlh.class.getDeclaredField("writer$volatile"));
        d = AtomicReferenceFieldUpdater.newUpdater(qlh.class, Object.class, "exceptionWhenReading$volatile");
        g = unsafe.objectFieldOffset(qlh.class.getDeclaredField("exceptionWhenReading$volatile"));
        e = AtomicReferenceFieldUpdater.newUpdater(qlh.class, Object.class, "_value$volatile");
        f = unsafe.objectFieldOffset(qlh.class.getDeclaredField("_value$volatile"));
    }

    public final Object a() {
        Throwable th = new Throwable("reader location");
        a.getClass();
        Unsafe unsafe = bl0.a;
        unsafe.putObjectVolatile(this, h, th);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.incrementAndGet(this);
        c.getClass();
        Throwable th2 = (Throwable) unsafe.getObjectVolatile(this, i);
        if (th2 != null) {
            IllegalStateException illegalStateException = new IllegalStateException("Dispatchers.Main is used concurrently with setting it", th2);
            d.getClass();
            unsafe.putObjectVolatile(this, g, illegalStateException);
        }
        e.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, f);
        atomicIntegerFieldUpdater.decrementAndGet(this);
        return objectVolatile;
    }
}
