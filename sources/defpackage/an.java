package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class an implements zl {
    public final nl a;
    public final d0c b;
    public volatile Integer c;
    public volatile f25 d;
    public volatile h25 e;
    public final zm f;
    public volatile i46 g;
    public volatile long h;

    /* JADX WARN: Type inference failed for: r2v1, types: [zm] */
    public an(nl nlVar, d0c d0cVar, Integer num) {
        d0cVar.getClass();
        this.a = nlVar;
        this.b = d0cVar;
        this.c = num;
        this.f = new awe() { // from class: zm
            @Override // defpackage.awe
            public final void a(f25 f25Var, boolean z) {
                i46 i46Var = this.a.g;
                if (i46Var != null) {
                    i46Var.b();
                }
            }
        };
        Integer num2 = this.c;
        this.g = (num2 != null && num2.intValue() == 1) ? null : new i46(this);
        if (nlVar.i) {
            nlVar.g.add(this);
            Integer num3 = nlVar.k;
            if (num3 != null) {
                e(num3.intValue());
            }
        }
    }

    @Override // defpackage.zl
    public final void a(Double[] dArr) {
        dArr.getClass();
        i46 i46Var = this.g;
        Integer num = this.c;
        if (i46Var != null) {
            i46Var.c = dArr;
            return;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            int length = dArr.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = (float) dArr[i].doubleValue();
            }
            c(iIntValue, new rl(fArr));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        CidLogger cidLogger = this.a.b;
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        cidLogger.reportException("AniSend", message, illegalStateException);
        i46 i46Var2 = new i46(this);
        i46Var2.c = dArr;
        this.g = i46Var2;
    }

    @Override // defpackage.zl
    public final void b() {
        i46 i46Var = this.g;
        Integer num = this.c;
        if (i46Var != null) {
            this.g = new i46(this);
            return;
        }
        if (num != null) {
            c(num.intValue(), ul.a);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        CidLogger cidLogger = this.a.b;
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        cidLogger.reportException("AniSend", message, illegalStateException);
        i46 i46Var2 = new i46(this);
        this.g = new i46(this);
        this.g = i46Var2;
    }

    public final void c(int i, sl slVar) {
        String strK;
        h25 h25Var;
        boolean z;
        Boolean boolValueOf = null;
        ym ymVar = (i == 1 && (slVar instanceof tl)) ? null : new ym(i, (int) (SystemClock.elapsedRealtime() - this.h), slVar);
        if (ymVar != null && (h25Var = this.e) != null) {
            d0c d0cVar = h25Var.a;
            AtomicInteger atomicInteger = h25Var.e;
            if (atomicInteger.get() > h25Var.b) {
                ((AtomicInteger) d0cVar.c).incrementAndGet();
                z = false;
            } else {
                h25Var.d.add(ymVar);
                ((AtomicInteger) d0cVar.d).incrementAndGet();
                atomicInteger.incrementAndGet();
                ReentrantLock reentrantLock = h25Var.h;
                reentrantLock.lock();
                try {
                    h25Var.i.signal();
                    reentrantLock.unlock();
                    z = true;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            boolValueOf = Boolean.valueOf(z);
        }
        if (cqk.d(boolValueOf, Boolean.TRUE)) {
            return;
        }
        if (slVar instanceof rl) {
            float[] fArr = ((rl) slVar).a;
            int length = fArr.length;
            strK = "lmarks: (" + length + ") " + TextUtils.join(",", new s18(1, yhf.u0(fArr.length == 0 ? b76.a : new tw(0, fArr), 4))) + "...";
        } else if (slVar instanceof tl) {
            long j = ((long) ((tl) slVar).a) & 4294967295L;
            tre.M(16);
            String string = Long.toString(j, 16);
            string.getClass();
            strK = qv1.k("bgColor: 0x", r5h.c1(string, string.length() > 6 ? 8 : 6, '0'));
        } else {
            if (!(slVar instanceof ul)) {
                ore.o();
                return;
            }
            strK = "EOS";
        }
        this.a.b.log("AniSend", "package was not sent: ".concat(strK));
    }

    public final void d() {
        f25 f25Var = this.d;
        if (f25Var != null) {
            f25Var.c.remove(this.f);
        }
        this.d = null;
        h25 h25Var = this.e;
        if (h25Var != null) {
            if (!h25Var.k) {
                h25Var.k = true;
                h25Var.interrupt();
            }
            ReentrantLock reentrantLock = h25Var.j;
            reentrantLock.lock();
            try {
                h25Var.c = null;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.e = null;
    }

    public final void e(int i) {
        i46 i46Var = this.g;
        Integer num = this.c;
        if (i46Var != null) {
            i46Var.b = Integer.valueOf(i);
            i46Var.b();
            return;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 2) {
                c(iIntValue, new tl(i));
                return;
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        CidLogger cidLogger = this.a.b;
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        cidLogger.reportException("AniSend", message, illegalStateException);
        i46 i46Var2 = new i46(this);
        i46Var2.b = Integer.valueOf(i);
        i46Var2.b();
        this.g = i46Var2;
    }

    public final void f(f25 f25Var) {
        d();
        this.d = f25Var;
        f25Var.c.add(this.f);
        this.h = SystemClock.elapsedRealtime();
        d0c d0cVar = this.b;
        ((AtomicInteger) d0cVar.a).set(0);
        ((AtomicInteger) d0cVar.b).set(0);
        ((AtomicInteger) d0cVar.c).set(0);
        ((AtomicInteger) d0cVar.d).set(0);
        this.e = new h25(f25Var, this.b);
        h25 h25Var = this.e;
        if (h25Var != null) {
            h25Var.start();
        }
        i46 i46Var = this.g;
        if (i46Var != null) {
            i46Var.b();
        }
    }
}
