package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class np8 implements qc8 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(np8.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(np8.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final rhb a;

    static {
        Unsafe unsafe = bl0.a;
        f = unsafe.objectFieldOffset(np8.class.getDeclaredField("_rootCause$volatile"));
        d = AtomicReferenceFieldUpdater.newUpdater(np8.class, Object.class, "_exceptionsHolder$volatile");
        e = unsafe.objectFieldOffset(np8.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public np8(rhb rhbVar, Throwable th) {
        this.a = rhbVar;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thD = d();
        if (thD == null) {
            h(th);
            return;
        }
        if (th == thD) {
            return;
        }
        Object objC = c();
        if (objC == null) {
            g(th);
            return;
        }
        if (!(objC instanceof Throwable)) {
            if (objC instanceof ArrayList) {
                ((ArrayList) objC).add(th);
                return;
            } else {
                qr7.v(objC, "State is ");
                return;
            }
        }
        if (th == objC) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objC);
        arrayList.add(th);
        g(arrayList);
    }

    @Override // defpackage.qc8
    public final rhb b() {
        return this.a;
    }

    public final Object c() {
        d.getClass();
        return bl0.a.getObjectVolatile(this, e);
    }

    public final Throwable d() {
        c.getClass();
        return (Throwable) bl0.a.getObjectVolatile(this, f);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Object objC = c();
        if (objC == null) {
            arrayList = new ArrayList(4);
        } else if (objC instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objC);
            arrayList = arrayList2;
        } else {
            if (!(objC instanceof ArrayList)) {
                qr7.v(objC, "State is ");
                return null;
            }
            arrayList = (ArrayList) objC;
        }
        Throwable thD = d();
        if (thD != null) {
            arrayList.add(0, thD);
        }
        if (th != null && !th.equals(thD)) {
            arrayList.add(th);
        }
        g(rx8.i);
        return arrayList;
    }

    public final void g(Object obj) {
        d.getClass();
        bl0.a.putObjectVolatile(this, e, obj);
    }

    public final void h(Throwable th) {
        c.getClass();
        bl0.a.putObjectVolatile(this, f, th);
    }

    @Override // defpackage.qc8
    public final boolean isActive() {
        return d() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(b.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(c());
        sb.append(", list=");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
