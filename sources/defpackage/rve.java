package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.protocol.exceptions.RtcRetryLimitExceedException;

/* JADX INFO: loaded from: classes3.dex */
public final class rve {
    public final uve a;
    public final HandlerThread e;
    public final Handler f;
    public final dc9 n;
    public final y3e o;
    public final AtomicReference b = new AtomicReference(null);
    public final o3k c = new o3k(this);
    public final p3k d = new p3k(2, this);
    public final Handler g = new Handler(Looper.getMainLooper());
    public final Handler h = new Handler(Looper.getMainLooper());
    public final foc i = new foc();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public long k = 0;
    public final LongSparseArray l = new LongSparseArray();
    public final LinkedList m = new LinkedList();

    public rve(kzi kziVar) {
        uve uveVar = (uve) kziVar.b;
        if (uveVar == null) {
            ore.p("Illegal 'serializer' value: null");
            throw null;
        }
        this.a = uveVar;
        y3e y3eVar = (y3e) kziVar.a;
        this.o = y3eVar;
        this.n = new dc9(y3eVar);
        HandlerThread handlerThread = new HandlerThread("RtcCommExec");
        this.e = handlerThread;
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        this.g.removeCallbacksAndMessages(null);
        LinkedList linkedList = this.m;
        linkedList.clear();
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.l;
            if (i >= longSparseArray.size()) {
                return;
            }
            long jKeyAt = longSparseArray.keyAt(i);
            vek vekVar = (vek) longSparseArray.valueAt(i);
            vekVar.e = 0L;
            vekVar.f = 0L;
            linkedList.offer(Long.valueOf(jKeyAt));
            i++;
        }
    }

    public final void b() {
        Handler handler = this.h;
        dc9 dc9Var = this.n;
        f25 f25Var = (f25) this.b.get();
        if (f25Var == null || !f25Var.b()) {
            return;
        }
        LinkedList linkedList = this.m;
        for (Long l = (Long) linkedList.poll(); l != null; l = (Long) linkedList.poll()) {
            long jLongValue = l.longValue();
            LongSparseArray longSparseArray = this.l;
            vek vekVar = (vek) longSparseArray.get(jLongValue);
            if (vekVar != null) {
                try {
                    qp5 qp5VarT = this.a.t(vekVar.b, vekVar.c);
                    boolean zE = f25Var.e(qp5VarT.c, qp5VarT.b);
                    if (zE) {
                        pve pveVar = vekVar.c;
                        dc9Var.getClass();
                        ((Handler) dc9Var.d).post(new nfk(dc9Var, pveVar, 2));
                        ((Handler) dc9Var.d).post(new ofk(dc9Var, qp5VarT.b, qp5VarT.c, 1));
                    }
                    if (zE) {
                        if (vekVar.c.a()) {
                            dc9Var.s(vekVar.c);
                            longSparseArray.remove(vekVar.b);
                        }
                        handler.post(new ff(vekVar));
                    } else {
                        c(vekVar.b);
                    }
                } catch (Throwable th) {
                    pve pveVar2 = vekVar.c;
                    dc9Var.getClass();
                    ((Handler) dc9Var.d).post(new alg(dc9Var, pveVar2, th, 11));
                    dc9Var.s(vekVar.c);
                    handler.post(new v1k(vekVar, 9, th));
                    longSparseArray.remove(vekVar.b);
                }
            }
        }
    }

    public final void c(long j) {
        LongSparseArray longSparseArray = this.l;
        vek vekVar = (vek) longSparseArray.get(j);
        if (vekVar == null || this.j.get()) {
            return;
        }
        pve pveVar = (pve) vekVar.d.b;
        foc focVar = this.i;
        focVar.getClass();
        focVar.a = 0.1f;
        long j2 = vekVar.f;
        if (j2 < 0) {
            ore.p(zo5.j(j2, "Illegal 'latestRetryTimeout' value: "));
            return;
        }
        vekVar.e++;
        float fMax = Math.max(200L, Math.min((long) (j2 * 2.0f), 4000.0f));
        long jNextGaussian = (long) (fMax + ((float) (((Random) focVar.b).nextGaussian() * ((double) fMax) * ((double) focVar.a))));
        vekVar.f = jNextGaussian;
        if (vekVar.e < 0) {
            this.g.postDelayed(new qve(this, j, 1), jNextGaussian);
            return;
        }
        RtcRetryLimitExceedException rtcRetryLimitExceedException = new RtcRetryLimitExceedException();
        dc9 dc9Var = this.n;
        dc9Var.getClass();
        ((Handler) dc9Var.d).post(new alg(dc9Var, pveVar, rtcRetryLimitExceedException, 11));
        dc9Var.s(pveVar);
        this.h.post(new v1k(vekVar, 9, rtcRetryLimitExceedException));
        longSparseArray.remove(j);
    }

    public final void d(dc9 dc9Var) {
        if (this.j.get()) {
            this.o.log("RTCCommand", "execute on disposed");
        }
        this.f.post(new yde(this, 2, dc9Var));
    }
}
