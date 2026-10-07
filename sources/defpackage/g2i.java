package defpackage;

import android.content.Context;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class g2i {
    public static final long A;
    public final Context a;
    public final b2i b;
    public final c98 c;
    public final boolean d;
    public final long e;
    public final int f;
    public final u89 g;
    public final so2 h;
    public final rwi i;
    public final iu3 j;
    public final p9b k;
    public final Looper l;
    public final p51 m;
    public final qt3 n;
    public final sfh o;
    public final wv5 q;
    public final i1m r;
    public k2i s;
    public t9b t;
    public k84 u;
    public k84 v;
    public String w;
    public w26 y;
    public q36 z;
    public int x = 0;
    public final vog p = new vog(this);

    static {
        sz9.a("media3.transformer");
        A = vqi.S() ? 25000L : 10000L;
    }

    public g2i(Context context, b2i b2iVar, c98 c98Var, boolean z, long j, int i, u89 u89Var, so2 so2Var, lf5 lf5Var, iu3 iu3Var, p9b p9bVar, Looper looper, p51 p51Var, nfh nfhVar, i1m i1mVar) {
        this.a = context;
        this.b = b2iVar;
        this.c = c98Var;
        this.d = z;
        this.e = j;
        this.f = i;
        this.g = u89Var;
        this.h = so2Var;
        this.i = lf5Var;
        this.j = iu3Var;
        this.k = p9bVar;
        this.l = looper;
        this.m = p51Var;
        this.n = nfhVar;
        this.r = i1mVar;
        this.o = nfhVar.a(looper, null);
        wv5 wv5Var = new wv5();
        wv5Var.c();
        this.q = wv5Var;
    }

    public static void a(g2i g2iVar) {
        EditingSession editingSession;
        g2iVar.g();
        nh6 nh6VarA = g2iVar.q.a();
        g2iVar.g.f(-1, new c5f(g2iVar, 9, nh6VarA));
        if (g2iVar.b()) {
            w26 w26Var = g2iVar.y;
            w26Var.getClass();
            boolean zF = g2iVar.f();
            v26 v26Var = w26Var.e;
            EditingEndedEvent.Builder finalProgressPercent = w26Var.a(1).setFinalProgressPercent(100.0f);
            w26Var.f(finalProgressPercent, nh6VarA, zF);
            ArrayList arrayListC = w26.c(nh6VarA.s);
            for (int i = 0; i < arrayListC.size(); i++) {
                finalProgressPercent.addInputMediaItemInfo(u26.i(arrayListC.get(i)));
            }
            finalProgressPercent.setOutputMediaItemInfo(w26.d(nh6VarA));
            EditingEndedEvent editingEndedEventBuild = finalProgressPercent.build();
            if (!v26Var.b && (editingSession = v26Var.a) != null) {
                editingSession.reportEditingEndedEvent(editingEndedEventBuild);
                v26Var.b = true;
            }
            try {
                x05.l(v26Var);
            } catch (Exception e) {
                lvb.l0("EditingMetricsCollector", "error while closing the metrics reporter", e);
            }
        }
        g2iVar.x = 0;
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 35 && this.d;
    }

    public final void c() {
        int i;
        j();
        k2i k2iVar = this.s;
        if (k2iVar == null) {
            g();
            return;
        }
        try {
            k2iVar.a();
            ww6 ww6Var = new ww6(15);
            int iE = e(ww6Var);
            this.s = null;
            if (b()) {
                i = iE == 2 ? ww6Var.b : -1;
                w26 w26Var = this.y;
                w26Var.getClass();
                w26Var.e(i);
            }
            g();
        } catch (Throwable th) {
            ww6 ww6Var2 = new ww6(15);
            int iE2 = e(ww6Var2);
            this.s = null;
            if (b()) {
                i = iE2 == 2 ? ww6Var2.b : -1;
                w26 w26Var2 = this.y;
                w26Var2.getClass();
                w26Var2.e(i);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0046 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0047 A[RETURN] */
    public final int d(float f, float f2, ww6 ww6Var) {
        int i;
        k2i k2iVar = this.s;
        if (k2iVar == null) {
            ww6Var.b = Math.round(f);
            if (f == 0.0f) {
                return 1;
            }
            return 2;
        }
        synchronized (k2iVar.r) {
            try {
                i = k2iVar.B;
                if (i == 2) {
                    ww6Var.b = k2iVar.C;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i == 0 || i == 1) {
            ww6Var.b = Math.round(f);
            if (f == 0.0f) {
                return 1;
            }
            return 2;
        }
        if (i == 2) {
            ww6Var.b = Math.round((ww6Var.b * f2) + f);
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        c.t();
        return 0;
    }

    public final int e(ww6 ww6Var) {
        int i;
        j();
        boolean zF = f();
        int i2 = this.x;
        if (zF) {
            if (i2 == 1) {
                return d(0.0f, 0.15f, ww6Var);
            }
            if (i2 == 2) {
                return d(15.000001f, 0.4f, ww6Var);
            }
            if (i2 == 3) {
                return d(55.0f, 0.3f, ww6Var);
            }
            ww6Var.b = Math.round(85.0f);
            return 2;
        }
        if (i2 == 5 || i2 == 6) {
            return 1;
        }
        k2i k2iVar = this.s;
        if (k2iVar == null) {
            return 0;
        }
        synchronized (k2iVar.r) {
            try {
                i = k2iVar.B;
                if (i == 2) {
                    ww6Var.b = k2iVar.C;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final boolean f() {
        int i = this.x;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final void g() {
        q36 q36Var = this.z;
        if (q36Var != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) q36Var.d;
            scheduledFuture.getClass();
            scheduledFuture.cancel(false);
            ((ScheduledExecutorService) q36Var.c).shutdownNow();
            this.z = null;
        }
    }

    public final void h(k84 k84Var, String str) {
        t26 t26Var;
        j();
        long j = this.e;
        if (j != -9223372036854775807L) {
            vuf vufVar = new vuf(17, this);
            q36 q36Var = new q36();
            q36Var.a = j;
            q36Var.b = vufVar;
            String str2 = vqi.a;
            q36Var.c = Executors.newSingleThreadScheduledExecutor(new g94("WatchdogTimer", 1));
            this.z = q36Var;
            q36Var.d = ((ScheduledExecutorService) q36Var.c).schedule(new f4g(28, vufVar), j, TimeUnit.MILLISECONDS);
        }
        this.v = k84Var;
        ArrayList arrayList = new ArrayList();
        a98 a98VarListIterator = ((c98) k84Var.b).listIterator(0);
        while (a98VarListIterator.hasNext()) {
            t26 t26Var2 = (t26) a98VarListIterator.next();
            ArrayList arrayList2 = new ArrayList();
            a98 a98VarListIterator2 = t26Var2.a.listIterator(0);
            while (a98VarListIterator2.hasNext()) {
                s26 s26Var = (s26) a98VarListIterator2.next();
                l6m l6mVar = s26Var.g;
                if (l6mVar == l6m.r) {
                    arrayList2.add(s26Var);
                } else {
                    reg regVar = new reg(l6mVar);
                    fth fthVar = new fth(new vuf(16, regVar), l6mVar);
                    r26 r26VarA = s26Var.a();
                    lvb.R(regVar.c == l6mVar);
                    r26VarA.h = true;
                    z88 z88Var = new z88(4);
                    z88Var.c(regVar);
                    z88Var.f(r26VarA.f.a);
                    ghe gheVarH = z88Var.h();
                    z88 z88Var2 = new z88(4);
                    z88Var2.c(fthVar);
                    z88Var2.f(r26VarA.f.b);
                    r26VarA.f = new j36(gheVarH, z88Var2.h());
                    arrayList2.add(new s26(r26VarA));
                }
            }
            lvb.R(!arrayList2.isEmpty());
            u98 u98Var = t26Var2.b;
            if (u98Var.contains(-2)) {
                kzi kziVar = new kzi();
                int i = u98.c;
                kziVar.b = new jag(-2);
                z88 z88Var3 = new z88(4);
                z88Var3.f(arrayList2);
                kziVar.a = z88Var3;
                boolean z = t26Var2.c;
                lvb.b0(((u98) kziVar.b).contains(-2));
                if (z) {
                    t98 t98Var = new t98(4);
                    t98Var.i((u98) kziVar.b);
                    t98Var.c(1);
                    kziVar.b = t98Var.j();
                } else {
                    u98 u98Var2 = (u98) kziVar.b;
                    int i2 = u98.c;
                    jag jagVar = new jag(1);
                    lvb.W(u98Var2, "set1");
                    kziVar.b = u98.m(new hof(u98Var2, jagVar, 1));
                }
                boolean z2 = t26Var2.d;
                lvb.b0(((u98) kziVar.b).contains(-2));
                if (z2) {
                    t98 t98Var2 = new t98(4);
                    t98Var2.i((u98) kziVar.b);
                    t98Var2.c(2);
                    kziVar.b = t98Var2.j();
                } else {
                    u98 u98Var3 = (u98) kziVar.b;
                    int i3 = u98.c;
                    jag jagVar2 = new jag(2);
                    lvb.W(u98Var3, "set1");
                    kziVar.b = u98.m(new hof(u98Var3, jagVar2, 1));
                }
                t26Var = new t26(kziVar);
            } else {
                kzi kziVar2 = new kzi(u98Var);
                ((z88) kziVar2.a).f(arrayList2);
                t26Var = new t26(kziVar2);
            }
            arrayList.add(t26Var);
        }
        k84 k84VarC = k84Var.c();
        k84VarC.d(arrayList);
        this.u = k84VarC.a();
        this.w = str;
        this.q.c();
        i(this.u, new t9b(this.w, this.k, this.p, 0, null), this.p, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    public final void i(k84 k84Var, t9b t9bVar, vog vogVar, long j) {
        LogSessionId logSessionId;
        boolean z;
        boolean z2;
        lvb.Z("There is already an export in progress.", this.s == null);
        b2i b2iVarC = this.b;
        if (k84Var.g != 0) {
            p21 p21VarA = b2iVarC.a();
            p21VarA.b = k84Var.g;
            b2iVarC = p21VarA.c();
        }
        String str = null;
        if (b()) {
            i1m i1mVar = this.r;
            i1mVar.getClass();
            Context context = (Context) i1mVar.a;
            v26 v26Var = new v26();
            MediaMetricsManager mediaMetricsManagerD = oi2.d(context.getSystemService("media_metrics"));
            if (mediaMetricsManagerD != null) {
                v26Var.a = mediaMetricsManagerD.createEditingSession();
            }
            EditingSession editingSession = v26Var.a;
            LogSessionId sessionId = editingSession != null ? editingSession.getSessionId() : null;
            p9b p9bVar = this.k;
            if ((p9bVar instanceof da8) || (p9bVar instanceof ba8)) {
                str = "androidx.media3:media3-muxer:1.9.3";
            } else if (p9bVar instanceof mc5) {
                str = nc5.b;
            }
            k84 k84Var2 = this.u;
            k84Var2.getClass();
            if (((j36) k84Var2.d).a.isEmpty()) {
                k84 k84Var3 = this.u;
                k84Var3.getClass();
                if (np4.a((c98) k84Var3.b, new fb5(4))) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            k84 k84Var4 = this.u;
            k84Var4.getClass();
            if (((j36) k84Var4.d).b.isEmpty()) {
                k84 k84Var5 = this.u;
                k84Var5.getClass();
                if (np4.a((c98) k84Var5.b, new fb5(5))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            this.y = new w26(v26Var, str, z, z2);
            logSessionId = sessionId;
        } else {
            logSessionId = null;
        }
        this.v.getClass();
        u89 u89Var = this.g;
        sfh sfhVar = this.o;
        g85 g85Var = new g85();
        g85Var.a = u89Var;
        g85Var.b = sfhVar;
        g85Var.c = b2iVarC;
        g85Var.e = b2iVarC;
        g85Var.d = new AtomicInteger();
        LinkedHashMap linkedHashMap = g55.a;
        synchronized (g55.class) {
            g55.a.clear();
            SystemClock.elapsedRealtime();
        }
        k2i k2iVar = new k2i(this.a, k84Var, b2iVarC, this.h, this.i, this.j, this.c, this.f, t9bVar, vogVar, g85Var, this.o, this.m, this.n, j, logSessionId, false);
        this.s = k2iVar;
        k2iVar.e();
        k2iVar.j.i(1);
        synchronized (k2iVar.r) {
            k2iVar.B = 1;
            k2iVar.C = 0;
        }
        String str2 = vqi.a;
        synchronized (g55.class) {
        }
    }

    public final void j() {
        if (Looper.myLooper() == this.l) {
            return;
        }
        ore.k("Transformer is accessed on the wrong thread.");
    }
}
