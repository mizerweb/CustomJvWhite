package defpackage;

import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lyid;", "", "Lsid;", "k", "()J", "mask", "Lsbi;", "m", "(J)V", "i", "", "l", "(J)Z", "", "j", "(J)I", "d", "a", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yid {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static volatile yid e;
    public final tu0 a;
    public final String b = yid.class.getName();
    public final AtomicIntegerArray c = new AtomicIntegerArray(64);

    /* JADX INFO: renamed from: yid$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyid$a;", "", "Ltu0;", "logger", "Lyid;", "b", "(Ltu0;)Lyid;", "a", "singleton", "Lyid;", "batterylib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(j95 j95Var) {
        }

        public final yid a(tu0 logger) {
            return new yid(logger, null);
        }

        public final yid b(tu0 logger) {
            yid yidVar;
            yid yidVar2 = yid.e;
            if (yidVar2 != null) {
                return yidVar2;
            }
            synchronized (this) {
                yidVar = yid.e;
                if (yidVar == null) {
                    yidVar = new yid(logger, null);
                    yid.e = yidVar;
                }
            }
            return yidVar;
        }
    }

    public yid(tu0 tu0Var, j95 j95Var) {
        this.a = tu0Var;
    }

    public static final String a() {
        return "Finishing non started process!";
    }

    public static final String b(long j) {
        return "Finishing process->" + ((Object) sid.i(j)) + " (last)";
    }

    public static final String c(long j, int i) {
        return "Finishing process->" + ((Object) sid.i(j)) + " (count=" + i + ')';
    }

    public static final String f(long j) {
        return "Current processes->" + ((Object) sid.i(j));
    }

    public static final String g(long j, int i) {
        StringBuilder sb = new StringBuilder("Starting process->");
        sb.append((Object) sid.i(j));
        sb.append(" (count=");
        return qt4.p(sb, i + 1, ')');
    }

    public static final String h(long j) {
        return "Starting process->" + ((Object) sid.i(j)) + " (first)";
    }

    public final void i(long mask) {
        int i;
        int i2;
        int iE = sid.e(mask);
        do {
            i = this.c.get(iE);
            if (i <= 0) {
                s2f.b(this.a, null, this.b, new vbd(3), 1);
                return;
            }
            i2 = i - 1;
        } while (!this.c.compareAndSet(iE, i, i2));
        tu0 tu0Var = this.a;
        String str = this.b;
        if (i2 == 0) {
            s2f.a(tu0Var, str, new wid(mask, 1));
        } else {
            s2f.a(tu0Var, str, new xid(i2, 0, mask));
        }
    }

    public final int j(long mask) {
        return this.c.get(sid.e(mask));
    }

    public final long k() {
        long j = 0;
        for (int i = 0; i < 64; i++) {
            if (this.c.get(i) > 0) {
                j |= 1 << i;
            }
        }
        long jA = sid.INSTANCE.a(j);
        s2f.a(this.a, this.b, new wid(jA, 0));
        return jA;
    }

    public final boolean l(long mask) {
        return this.c.get(sid.e(mask)) > 0;
    }

    public final void m(long mask) {
        int andIncrement = this.c.getAndIncrement(sid.e(mask));
        tu0 tu0Var = this.a;
        String str = this.b;
        if (andIncrement == 0) {
            s2f.a(tu0Var, str, new wid(mask, 2));
        } else {
            s2f.a(tu0Var, str, new xid(andIncrement, 1, mask));
        }
    }
}
