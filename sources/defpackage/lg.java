package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class lg extends CameraDevice.StateCallback {
    public final String a;
    public final bg2 b;
    public final int c;
    public final long d;
    public final jgh e;
    public final ic2 f;
    public final gc2 g;
    public final lc2 h;
    public final zqh i;
    public final pb0 j;
    public final CameraDevice.StateCallback k;
    public final xp9 l;
    public final int m;
    public final Object n;
    public boolean o;
    public kg p;
    public boolean q;
    public final CountDownLatch r;
    public final long s;
    public ith t;
    public final mjg u;

    public lg(String str, bg2 bg2Var, int i, long j, jgh jghVar, ic2 ic2Var, gc2 gc2Var, lc2 lc2Var, zqh zqhVar, pb0 pb0Var, CameraDevice.StateCallback stateCallback, xp9 xp9Var) {
        this.a = str;
        this.b = bg2Var;
        this.c = i;
        this.d = j;
        this.e = jghVar;
        this.f = ic2Var;
        this.g = gc2Var;
        this.h = lc2Var;
        this.i = zqhVar;
        this.j = pb0Var;
        this.k = stateCallback;
        this.l = xp9Var;
        g40 g40Var = haj.b;
        g40Var.getClass();
        this.m = g40.b.incrementAndGet(g40Var);
        this.n = new Object();
        this.r = new CountDownLatch(1);
        this.u = p90.a(uh2.a);
        Log.i("CXCP", "Opening " + ((Object) ef2.b(str)));
        this.s = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    public static boolean e(lc2 lc2Var, String str, ne2 ne2Var) {
        lc2Var.b.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            return false;
        }
        ag2 ag2Var = bg2.U;
        bg2 bg2VarD = lc2Var.a.d(str);
        ag2Var.getClass();
        return ag2.b(bg2VarD) && ne2Var == null;
    }

    public final void a() {
        jh2 jh2Var = (jh2) this.u.getValue();
        le2 le2Var = jh2Var instanceof oh2 ? ((oh2) jh2Var).a : null;
        b(le2Var != null ? (CameraDevice) le2Var.W(zfe.a(CameraDevice.class)) : null, new kg(1, null, null, 14));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    public final void b(CameraDevice cameraDevice, kg kgVar) {
        lg lgVar;
        jh2 jh2Var = (jh2) this.u.getValue();
        le2 le2Var = jh2Var instanceof oh2 ? ((oh2) jh2Var).a : null;
        synchronized (this.n) {
            if (this.p == null) {
                this.p = kgVar;
                if (this.o) {
                    kgVar = null;
                }
            } else {
                kgVar = null;
            }
        }
        if (kgVar != null) {
            ne2 ne2Var = kgVar.c;
            if (ne2Var != null && kgVar.a != 6) {
                this.f.a(this.a, ne2Var.a, false);
            }
            mjg mjgVar = this.u;
            nh2 nh2Var = new nh2(kgVar.c);
            mjgVar.getClass();
            mjgVar.j(null, nh2Var);
            if (kgVar.a != 3) {
                lc2 lc2Var = this.h;
                String str = this.a;
                boolean z = e(lc2Var, str, kgVar.c) && lc2Var.a(str);
                if (z) {
                    synchronized (this.n) {
                        this.q = true;
                    }
                }
                lgVar = this;
                this.g.b(le2Var, cameraDevice, lgVar, this.j, z, e(this.h, this.a, kgVar.c));
            } else {
                lgVar = this;
            }
            mjg mjgVar2 = lgVar.u;
            mh2 mh2VarC = lgVar.c(kgVar);
            mjgVar2.getClass();
            mjgVar2.j(null, mh2VarC);
        }
    }

    public final mh2 c(kg kgVar) {
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        ith ithVar = this.t;
        long j = kgVar.b;
        hw5 hw5Var = ithVar != null ? new hw5(ithVar.a - this.d) : null;
        hw5 hw5Var2 = ithVar != null ? new hw5(ithVar.a - this.s) : null;
        hw5 hw5Var3 = ithVar == null ? null : new hw5(j - ithVar.a);
        long j2 = jElapsedRealtimeNanos - j;
        int i = kgVar.a;
        int i2 = this.c - 1;
        return new mh2(this.a, i, Integer.valueOf(i2), hw5Var, kgVar.d, hw5Var2, hw5Var3, new hw5(j2), kgVar.c);
    }

    public final void d(CameraDevice cameraDevice) {
        Trace.beginSection(((Object) ef2.b(this.a)) + "#onFinalized");
        Log.d("CXCP", this + ": onFinalized");
        b(cameraDevice, new kg(3, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        if (!cqk.d(cameraDevice.getId(), this.a)) {
            ore.k("Check failed.");
            return;
        }
        Log.d("CXCP", ((Object) ef2.b(this.a)) + ": onClosed");
        this.r.countDown();
        synchronized (this.n) {
            if (!this.q) {
                d(cameraDevice);
                return;
            }
            Log.i("CXCP", this + "#onClosed: Delaying finalizing.");
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        String id = cameraDevice.getId();
        String str = this.a;
        if (!cqk.d(id, str)) {
            ore.k("Check failed.");
            return;
        }
        Trace.beginSection(((Object) ef2.b(str)) + "#onDisconnected");
        Log.d("CXCP", ((Object) ef2.b(str)) + ": onDisconnected");
        this.r.countDown();
        b(cameraDevice, new kg(4, new ne2(6), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        String id = cameraDevice.getId();
        String str = this.a;
        if (!cqk.d(id, str)) {
            ore.k("Check failed.");
            return;
        }
        Trace.beginSection(((Object) ef2.b(str)) + "#onError-" + i);
        Log.d("CXCP", ((Object) ef2.b(str)) + ": onError " + i);
        this.r.countDown();
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            ore.p(zo5.h(i, "Unexpected StateCallback error code: "));
                            return;
                        }
                        i2 = 5;
                    }
                }
            }
        }
        b(cameraDevice, new kg(5, new ne2(i2), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String strT;
        kg kgVar;
        kg kgVar2;
        if (!cqk.d(cameraDevice.getId(), this.a)) {
            ore.k("Check failed.");
            return;
        }
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.t = new ith(jElapsedRealtimeNanos);
        Trace.beginSection(((Object) ef2.b(this.a)) + "#onOpened");
        long j = jElapsedRealtimeNanos - this.s;
        long j2 = jElapsedRealtimeNanos - this.d;
        int i = this.c;
        String str = this.a;
        if (i == 1) {
            StringBuilder sb = new StringBuilder("Opened ");
            sb.append((Object) ef2.b(str));
            sb.append(" in ");
            strT = p.f(new Object[]{Double.valueOf(j / 1000000.0d)}, 1, null, "%.3f ms", sb);
        } else {
            StringBuilder sb2 = new StringBuilder("Opened ");
            sb2.append((Object) ef2.b(str));
            sb2.append(" in ");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
            sb2.append(" (");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)));
            sb2.append(" total) after ");
            strT = zo5.t(sb2, this.c, " attempts.");
        }
        Log.i("CXCP", strT);
        synchronized (this.n) {
            kgVar = this.p;
            if (kgVar == null) {
                this.o = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (kgVar != null) {
            gc2 gc2Var = this.g;
            pb0 pb0Var = this.j;
            lc2 lc2Var = this.h;
            String str2 = this.a;
            gc2Var.b(null, cameraDevice, this, pb0Var, e(lc2Var, str2, kgVar.c) && lc2Var.a(str2), e(this.h, this.a, kgVar.c));
            return;
        }
        gg ggVar = new gg(this.b, cameraDevice, this.a, this.f, this.l, this.i);
        pb0 pb0Var2 = this.j;
        if (Build.VERSION.SDK_INT < 30) {
            pb0Var2.getClass();
        } else {
            synchronized (pb0Var2.c) {
                pb0Var2.e.add(ggVar);
                qb0 qb0VarA = pb0Var2.a();
                if (qb0VarA != null) {
                    yab.i0(pb0Var2.a, null, 4, new xra(pb0Var2.b, new sfd(ggVar, qb0VarA, (lq4) null, 16), (lq4) null, 3), 1);
                }
            }
        }
        mjg mjgVar = this.u;
        oh2 oh2Var = new oh2(ggVar);
        mjgVar.getClass();
        mjgVar.j(null, oh2Var);
        synchronized (this.n) {
            this.o = false;
            kgVar2 = this.p;
        }
        if (kgVar2 != null) {
            mjg mjgVar2 = this.u;
            nh2 nh2Var = new nh2(kgVar2.c);
            mjgVar2.getClass();
            mjgVar2.j(null, nh2Var);
            gc2 gc2Var2 = this.g;
            pb0 pb0Var3 = this.j;
            lc2 lc2Var2 = this.h;
            String str3 = this.a;
            gc2Var2.b(ggVar, cameraDevice, this, pb0Var3, e(lc2Var2, str3, kgVar2.c) && lc2Var2.a(str3), e(this.h, this.a, kgVar2.c));
            mjg mjgVar3 = this.u;
            mh2 mh2VarC = c(kgVar2);
            mjgVar3.getClass();
            mjgVar3.j(null, mh2VarC);
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.m;
    }
}
