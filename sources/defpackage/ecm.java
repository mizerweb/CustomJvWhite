package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ecm {
    private static final bo7 s = new bo7("AutoZoom", null);
    final gcm a;
    private final AtomicBoolean b;
    private final Object c;
    final zsk d;
    private final ScheduledExecutorService e;
    private final sqk f;
    private final dbm g;
    private final String h;
    private Executor i;
    private float j;
    private float k;
    private long l;
    private long m;
    ScheduledFuture n;
    String o;
    private boolean p;
    int q;
    private o1l r;

    private ecm(Context context, gcm gcmVar, String str) {
        x8l.a();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        sqk sqkVarA = zok.a();
        dbm dbmVar = new dbm(context, new a0g(context), new wam(context, vam.d("scanner-auto-zoom").c()), "scanner-auto-zoom");
        this.c = new Object();
        this.a = gcmVar;
        this.b = new AtomicBoolean(false);
        this.d = zsk.z();
        this.e = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        this.f = sqkVarA;
        this.g = dbmVar;
        this.h = str;
        this.q = 1;
        this.j = 1.0f;
        this.k = -1.0f;
        this.l = sqkVarA.a();
    }

    public static ecm d(Context context, String str) {
        return new ecm(context, gcm.a, str);
    }

    public static /* synthetic */ void f(ecm ecmVar) {
        ScheduledFuture scheduledFuture;
        synchronized (ecmVar.c) {
            try {
                if (ecmVar.q == 2 && !ecmVar.b.get() && (scheduledFuture = ecmVar.n) != null && !scheduledFuture.isCancelled()) {
                    if (ecmVar.j > 1.0f && ecmVar.a() >= ecmVar.a.i()) {
                        s.d("AutoZoom", "Reset zoom = 1");
                        ecmVar.l(1.0f, p3m.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void g(ecm ecmVar, float f) {
        synchronized (ecmVar.c) {
            ecmVar.j = f;
            ecmVar.r(false);
        }
    }

    private final float p(float f) {
        float f2 = this.k;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (f2 <= 0.0f || f <= f2) ? f : f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(p3m p3mVar, float f, float f2, hcm hcmVar) {
        long jA;
        if (this.o != null) {
            o8m o8mVar = new o8m();
            o8mVar.a(this.h);
            String str = this.o;
            str.getClass();
            o8mVar.e(str);
            o8mVar.f(Float.valueOf(f));
            o8mVar.c(Float.valueOf(f2));
            synchronized (this.c) {
                jA = (this.f.a() - this.m) / 1000000;
            }
            o8mVar.b(Long.valueOf(jA));
            if (hcmVar != null) {
                p8m p8mVar = new p8m();
                p8mVar.c(Float.valueOf(hcmVar.c()));
                p8mVar.e(Float.valueOf(hcmVar.e()));
                p8mVar.b(Float.valueOf(hcmVar.b()));
                p8mVar.d(Float.valueOf(hcmVar.d()));
                p8mVar.a(Float.valueOf(0.0f));
                o8mVar.d(p8mVar.f());
            }
            dbm dbmVar = this.g;
            r3m r3mVar = new r3m();
            r3mVar.i(o8mVar.h());
            dbmVar.d(gbm.e(r3mVar), p3mVar);
        }
    }

    private final void r(boolean z) {
        ScheduledFuture scheduledFuture;
        synchronized (this.c) {
            try {
                this.d.h();
                this.l = this.f.a();
                if (z && (scheduledFuture = this.n) != null) {
                    scheduledFuture.cancel(false);
                    this.n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long a() {
        long jA;
        synchronized (this.c) {
            jA = (this.f.a() - this.l) / 1000000;
        }
        return jA;
    }

    public final /* synthetic */ e4l c(float f) throws Exception {
        o1l o1lVar = this.r;
        float fP = p(f);
        s1k s1kVar = o1lVar.a;
        int i = bcl.n;
        if (true != s1kVar.b().a(fP)) {
            fP = 0.0f;
        }
        return y2l.a(Float.valueOf(fP));
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0247 A[Catch: all -> 0x0199, TryCatch #0 {all -> 0x0199, blocks: (B:51:0x0188, B:53:0x0196, B:57:0x019c, B:58:0x01c8, B:60:0x01ce, B:63:0x01f7, B:65:0x0206, B:67:0x0215, B:69:0x0220, B:70:0x0245, B:72:0x0247, B:73:0x0264), top: B:82:0x0188, outer: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0247, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i, hcm hcmVar) {
        float f;
        synchronized (this.c) {
            try {
                if (this.q != 2) {
                    return;
                }
                if (hcmVar.h() && (!this.a.l() || this.a.b() <= 0.0f)) {
                    if (!this.p) {
                        p3m p3mVar = p3m.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f2 = this.j;
                        q(p3mVar, f2, f2, hcmVar);
                        this.p = true;
                    }
                    bo7 bo7Var = s;
                    Locale locale = Locale.getDefault();
                    Float fValueOf = Float.valueOf(hcmVar.c());
                    Float fValueOf2 = Float.valueOf(hcmVar.e());
                    Float fValueOf3 = Float.valueOf(hcmVar.b());
                    Float fValueOf4 = Float.valueOf(hcmVar.d());
                    Float fValueOf5 = Float.valueOf(0.0f);
                    Integer numValueOf = Integer.valueOf(i);
                    bo7Var.d("AutoZoom", String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, numValueOf));
                    this.d.f(numValueOf, hcmVar);
                    Set setC = this.d.c();
                    if (setC.size() - 1 > this.a.h()) {
                        Iterator it = setC.iterator();
                        int i2 = i;
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            if (i2 > iIntValue) {
                                i2 = iIntValue;
                            }
                        }
                        s.d("AutoZoom", "Removing recent frameIndex = " + i2);
                        this.d.y(Integer.valueOf(i2));
                    }
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : this.d.m()) {
                        if (((Integer) entry.getKey()).intValue() != i) {
                            hcm hcmVar2 = (hcm) entry.getValue();
                            if (hcmVar2.h() && hcmVar.h()) {
                                acm acmVar = new acm(Math.max(hcmVar2.c(), hcmVar.c()), Math.max(hcmVar2.e(), hcmVar.e()), Math.min(hcmVar2.b(), hcmVar.b()), Math.min(hcmVar2.d(), hcmVar.d()), 0.0f);
                                f = acmVar.f() / ((hcmVar2.f() + hcmVar.f()) - acmVar.f());
                            } else {
                                f = 0.0f;
                            }
                            if (f >= this.a.d()) {
                                hashSet.add((Integer) entry.getKey());
                            }
                        }
                    }
                    if (hashSet.size() >= this.a.g() || (this.a.l() && this.a.a() <= 0.0f)) {
                        synchronized (this.c) {
                            try {
                                if (a() >= this.a.j()) {
                                    i0l i0lVarListIterator = iwk.l(Float.valueOf(hcmVar.c()), Float.valueOf(hcmVar.e()), Float.valueOf(hcmVar.b()), Float.valueOf(hcmVar.d())).listIterator(0);
                                    float f3 = 1.0E9f;
                                    while (i0lVarListIterator.hasNext()) {
                                        float fC = (this.a.c() / 2.0f) / Math.max(Math.abs(((Float) i0lVarListIterator.next()).floatValue() - 0.5f), 0.001f);
                                        if (f3 > fC) {
                                            f3 = fC;
                                        }
                                    }
                                    float fP = p(this.j * f3);
                                    if (this.a.k()) {
                                        float f4 = this.j;
                                        float f5 = (fP - f4) / f4;
                                        if (f5 > this.a.e() || f5 < (-this.a.f())) {
                                            s.d("AutoZoom", "Going to set zoom = " + fP);
                                            l(fP, p3m.SCANNER_AUTO_ZOOM_AUTO_ZOOM, hcmVar);
                                        } else {
                                            s.d("AutoZoom", "Auto zoom to " + fP + " is filtered by threshold");
                                            this.l = this.f.a();
                                        }
                                    } else {
                                        s.d("AutoZoom", "Going to set zoom = " + fP);
                                        l(fP, p3m.SCANNER_AUTO_ZOOM_AUTO_ZOOM, hcmVar);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.c) {
            try {
                if (this.q == 4) {
                    return;
                }
                n(false);
                this.e.shutdown();
                this.q = 4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(float f) {
        synchronized (this.c) {
            vpk.d(f >= 1.0f);
            this.k = f;
        }
    }

    public final void l(float f, p3m p3mVar, hcm hcmVar) {
        synchronized (this.c) {
            try {
                if (this.i != null && this.r != null && this.q == 2) {
                    if (this.b.compareAndSet(false, true)) {
                        y2l.b(y2l.c(new bcm(this, f), this.i), new dcm(this, p3mVar, this.j, hcmVar, f), h4l.a());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        synchronized (this.c) {
            try {
                int i = this.q;
                if (i != 2 && i != 4) {
                    r(true);
                    this.n = this.e.scheduleWithFixedDelay(new Runnable() { // from class: ccm
                        @Override // java.lang.Runnable
                        public final void run() {
                            ecm.f(this.a);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.q == 1) {
                        this.o = UUID.randomUUID().toString();
                        this.m = this.f.a();
                        this.p = false;
                        p3m p3mVar = p3m.SCANNER_AUTO_ZOOM_START;
                        float f = this.j;
                        q(p3mVar, f, f, null);
                    } else {
                        p3m p3mVar2 = p3m.SCANNER_AUTO_ZOOM_RESUME;
                        float f2 = this.j;
                        q(p3mVar2, f2, f2, null);
                    }
                    this.q = 2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(boolean z) {
        synchronized (this.c) {
            try {
                int i = this.q;
                if (i != 1 && i != 4) {
                    r(true);
                    if (z) {
                        if (!this.p) {
                            p3m p3mVar = p3m.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f = this.j;
                            q(p3mVar, f, f, null);
                        }
                        p3m p3mVar2 = p3m.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f2 = this.j;
                        q(p3mVar2, f2, f2, null);
                    } else {
                        p3m p3mVar3 = p3m.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f3 = this.j;
                        q(p3mVar3, f3, f3, null);
                    }
                    this.p = false;
                    this.q = 1;
                    this.o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(o1l o1lVar, Executor executor) {
        this.r = o1lVar;
        this.i = executor;
    }
}
