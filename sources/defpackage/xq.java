package defpackage;

import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class xq implements ou {
    public final u9c a;
    public final String b;
    public final ny8 c;
    public volatile uq d;
    public sgg e;
    public final dq4 f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final uq i;

    public xq(ny8 ny8Var, xhh xhhVar, u9c u9cVar) {
        this.a = u9cVar;
        String name = xq.class.getName();
        this.b = name;
        this.c = ny8Var;
        this.d = new uq(63, 0L, 0L);
        this.f = cqk.a(((n0c) xhhVar).a().R0(1, "clock-dump-updater"));
        this.g = new AtomicBoolean(true);
        this.h = new AtomicBoolean(false);
        uq uqVar = (uq) u9cVar.k.m(u9cVar, u9c.l[7]);
        this.i = uqVar;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "Loaded for previous session -> " + uqVar, null);
        }
    }

    public final void a(Long l, boolean z) {
        je9 je9Var = je9.d;
        uq uqVar = this.d;
        uqVar.d = SystemClock.uptimeMillis();
        uqVar.c = SystemClock.elapsedRealtime();
        if (this.g.compareAndSet(true, false)) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Taking from first callback just initial state", null);
            }
            uqVar.f = z;
        } else if (l == null) {
            String str2 = this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "No need for updating visibility array", null);
            }
        } else if (l.longValue() == 0) {
            String str3 = this.b;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str3, "Ignoring zero elapsedRealtime", null);
                }
            }
        } else {
            uqVar.e.a(l.longValue());
        }
        String str4 = this.b;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            a4cVar4.c(je9Var, str4, "updateAndSaveLastClocks: updating clocks -> " + uqVar, null);
        }
        u9c u9cVar = this.a;
        u9cVar.k.B(u9cVar, u9c.l[7], uqVar);
    }

    @Override // defpackage.ou
    public final void h(long j) throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.e;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.e = yab.i0(this.f, null, 0, new wq(this, j, (lq4) null), 3);
    }

    @Override // defpackage.ou
    public final void w(long j) throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.e;
        lq4 lq4Var = null;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.e = yab.i0(this.f, null, 0, new vq(this, j, lq4Var, 0), 3);
    }
}
