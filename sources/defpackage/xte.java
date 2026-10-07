package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class xte implements ou {
    public static final /* synthetic */ zv8[] B;
    public static final long C;
    public static final long D;
    public final r8e A;
    public final Context a;
    public final xhh b;
    public final String c = zo5.p(xte.class.getName(), "#", av7.g(System.identityHashCode(this)));
    public final dq4 d;
    public volatile sgg e;
    public int f;
    public iu9 g;
    public ute h;
    public final CopyOnWriteArraySet i;
    public final LinkedHashMap j;
    public Handler k;
    public final hed l;
    public final mjg m;
    public final r8e n;
    public final mjg o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final float t;
    public ry9 u;
    public b0a v;
    public long w;
    public float x;
    public final p3c y;
    public final mjg z;

    static {
        z8b z8bVar = new z8b(xte.class, "playAttachJob", "getPlayAttachJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        B = new zv8[]{z8bVar};
        ghb ghbVar = ew5.b;
        lw5 lw5Var = lw5.SECONDS;
        C = qe7.O(1, lw5Var);
        D = qe7.O(3, lw5Var);
    }

    public xte(Context context, xhh xhhVar, gue gueVar, yt4 yt4Var) {
        this.a = context;
        this.b = xhhVar;
        lk9 lk9VarS0 = ((n0c) xhhVar).c().S0();
        nah nahVarA = wk8.a();
        lk9VarS0.getClass();
        this.d = cqk.a(lvb.x0(lk9VarS0, nahVarA).u0(yt4Var));
        this.i = new CopyOnWriteArraySet();
        this.j = new LinkedHashMap();
        this.l = new hed(4, this);
        mjg mjgVarA = p90.a(-1L);
        this.m = mjgVarA;
        this.n = new r8e(mjgVarA);
        this.o = p90.a(-1L);
        this.p = 1;
        this.t = 1.0f;
        this.w = -1L;
        this.x = 1.0f;
        this.y = qyj.S();
        gueVar.c(this);
        if (gueVar.e()) {
            d();
        }
        mjg mjgVarA2 = p90.a(Float.valueOf(0.0f));
        this.z = mjgVarA2;
        this.A = new r8e(mjgVarA2);
    }

    public static final void a(xte xteVar, int i) {
        iu9 iu9Var;
        if (i == -1 || (iu9Var = xteVar.g) == null) {
            return;
        }
        ry9 ry9Var = iu9Var.v().m(i, iu9Var.b, 0L).b;
    }

    public static final void e(xte xteVar) {
        gm0.n(xteVar.c, "afterConnect");
        xteVar.f = 0;
        yab.i0(xteVar.d, null, 0, new wyj(xteVar, null, 14), 3);
        if (xteVar.h == null) {
            ute uteVar = new ute(xteVar);
            iu9 iu9Var = xteVar.g;
            if (iu9Var != null) {
                iu9Var.d(uteVar);
            }
            xteVar.h = uteVar;
        }
        String str = xteVar.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "notifyListeners: onConnectedToMediaSession", null);
            }
        }
        synchronized (xteVar.i) {
            for (tte tteVar : xteVar.i) {
                xteVar.g();
                xteVar.i();
                tteVar.getClass();
            }
        }
    }

    public final void b() {
        gm0.n(this.c, "cancelPositionObserving");
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacks(this.l);
        }
    }

    public final void c() throws IllegalAccessException, InvocationTargetException {
        gm0.n(this.c, "cancelScheduledConnectionAction");
        sgg sggVar = this.e;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.e = null;
    }

    public final void d() {
        c();
        this.e = yab.i0(this.d, null, 0, new qn6(this, (lq4) null, 28), 3);
    }

    public final void f(boolean z) {
        gm0.n(this.c, "disconnectNow started");
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacks(this.l);
        }
        this.k = null;
        yab.i0(this.d, null, 0, new wyj(this, null, 14), 3);
        if (z) {
            c();
        }
    }

    public final long g() {
        String str;
        Long lC0;
        ry9 ry9Var = this.u;
        if (ry9Var == null || (str = ry9Var.a) == null || (lC0 = y5h.C0(str)) == null) {
            return -1L;
        }
        return lC0.longValue();
    }

    @Override // defpackage.ou
    public final void h(long j) {
        d();
    }

    public final ty9 i() {
        Object next;
        b0a b0aVar;
        Integer num;
        ry9 ry9Var = this.u;
        int iIntValue = (ry9Var == null || (b0aVar = ry9Var.d) == null || (num = b0aVar.H) == null) ? -1 : num.intValue();
        y1 y1Var = new y1(0, ty9.f);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((ty9) next).ordinal() != iIntValue);
        ty9 ty9Var = (ty9) next;
        return ty9Var == null ? ty9.a : ty9Var;
    }

    public final u7b j() {
        b0a b0aVar = this.v;
        Map map = null;
        if (b0aVar == null) {
            return null;
        }
        CharSequence charSequence = b0aVar.b;
        CharSequence charSequence2 = b0aVar.a;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        Bundle bundle = b0aVar.I;
        if (bundle != null) {
            Set<String> setKeySet = bundle.keySet();
            int iP0 = wm9.P0(yw3.W0(setKeySet, 10));
            if (iP0 < 16) {
                iP0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
            for (String str : setKeySet) {
                linkedHashMap.put(str, bundle.get(str));
            }
            map = linkedHashMap;
        }
        if (map == null) {
            map = s66.a;
        }
        return new u7b(charSequence, charSequence2, map);
    }

    public final boolean k() {
        b0a b0aVar;
        Integer num;
        ry9 ry9Var = this.u;
        return (ry9Var == null || (b0aVar = ry9Var.d) == null || (num = b0aVar.H) == null || num.intValue() != 2) ? false : true;
    }

    public final boolean l() {
        b0a b0aVar;
        Integer num;
        ry9 ry9Var = this.u;
        return (ry9Var == null || (b0aVar = ry9Var.d) == null || (num = b0aVar.H) == null || num.intValue() != 3) ? false : true;
    }

    public final boolean m() {
        return !(this.r || this.q || ((Number) this.A.a.getValue()).floatValue() != 1.0f) || this.p == 4;
    }

    public final void n() {
        gm0.n(this.c, "tryToStartPositionObserving");
        b();
        if (this.k == null) {
            this.k = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.k;
        if (handler != null) {
            handler.post(this.l);
        }
    }

    @Override // defpackage.ou
    public final void w(long j) throws IllegalAccessException, InvocationTargetException {
        gm0.n(this.c, "disconnect: ");
        c();
        this.e = yab.i0(this.d, null, 0, new ur8(this, null, 27), 3);
    }
}
