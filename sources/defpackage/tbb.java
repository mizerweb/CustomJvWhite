package defpackage;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class tbb {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final dq4 g;
    public final String h;
    public final l9b i;
    public final AtomicInteger j;
    public volatile long k;
    public final AtomicReference l;
    public final AtomicReference m;
    public final AtomicReference n;

    public tbb(xhh xhhVar, gue gueVar, okg okgVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var5;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var6;
        dq4 dq4VarA = cqk.a(((n0c) xhhVar).b());
        this.g = dq4VarA;
        this.h = tbb.class.getName();
        this.i = new l9b();
        this.j = new AtomicInteger(1);
        this.l = new AtomicReference();
        this.m = new AtomicReference();
        this.n = new AtomicReference(nkg.a);
        gueVar.c(new pu(2, this));
        e9i.j0(new fz6(okgVar.b, new xm3(2, this, tbb.class, "onNewCondition", "onNewCondition(Lone/me/sdk/statistics/conditions/StatsExternalConditions$ConditionType;)V", 4, 4), 3), dq4VarA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(tbb tbbVar, nq4 nq4Var) {
        sbb sbbVar;
        l9b l9bVar;
        tbbVar.getClass();
        if (nq4Var instanceof sbb) {
            sbbVar = (sbb) nq4Var;
            int i = sbbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbbVar.g = i - Integer.MIN_VALUE;
            } else {
                sbbVar = new sbb(tbbVar, nq4Var);
            }
        } else {
            sbbVar = new sbb(tbbVar, nq4Var);
        }
        Object obj = sbbVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = sbbVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            tbbVar.m.set(null);
            tbbVar.l.set(null);
            tbbVar.j.set(1);
            tbbVar.k = 0L;
            l9b l9bVar2 = tbbVar.i;
            sbbVar.d = l9bVar2;
            sbbVar.g = 1;
            if (l9bVar2.b(sbbVar) == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = sbbVar.d;
            ch3.d0(obj);
        }
        try {
            long jY = ((xb9) ((et3) tbbVar.a.getValue())).Y() + 1;
            xb9 xb9Var = (xb9) ((et3) tbbVar.a.getValue());
            xb9Var.A0.B(xb9Var, xb9.g1[17], Long.valueOf(jY));
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    public static void e(ul9 ul9Var, nkg nkgVar) {
        nkgVar.getClass();
        nkg nkgVar2 = nkg.b;
        if (nkgVar == nkgVar2 || nkgVar == nkg.c) {
            ul9Var.put("pip", Integer.valueOf(nkgVar == nkgVar2 ? q1d.CALL.a() : q1d.VIDEO.a()));
        }
    }

    public static void g(tbb tbbVar, y3f y3fVar) {
        tbbVar.f(y3fVar, lmc.h);
    }

    public final ul9 b(int i, mbb mbbVar, lmc lmcVar) {
        Map map;
        ul9 ul9Var = new ul9();
        ul9Var.put("action_id", Integer.valueOf(this.j.getAndIncrement()));
        ul9Var.put("screen_to", Integer.valueOf(i));
        Object obj = (mbbVar == null || (map = mbbVar.c) == null) ? null : map.get("screen_to");
        if (obj != null) {
            ul9Var.put("prev_time", Long.valueOf(mbbVar.d));
            ul9Var.put("screen_from", obj);
        }
        nkg nkgVar = (nkg) this.n.get();
        if (cqk.d(lmcVar, lmc.h)) {
            e(ul9Var, nkgVar);
        } else {
            q1d q1dVar = lmcVar.a;
            rdg rdgVar = lmcVar.c;
            if (q1dVar != null) {
                ul9Var.put("pip", Integer.valueOf(q1dVar.a()));
            } else {
                e(ul9Var, nkgVar);
            }
            int i2 = lmcVar.b;
            if (i2 != 0) {
                ul9Var.put("reason", Integer.valueOf(r5a.a(i2)));
            }
            Long l = lmcVar.d;
            if (l != null && rdgVar != null) {
                ul9Var.put("source_id", l);
                ul9Var.put("source_type", Integer.valueOf(rdgVar.a));
            }
            Long l2 = lmcVar.e;
            if (l2 != null) {
                ul9Var.put("expGroup", l2);
            }
            int i3 = lmcVar.g;
            if (i3 != 0) {
                int i4 = 1;
                if (i3 != 1) {
                    i4 = 2;
                    if (i3 != 2) {
                        throw null;
                    }
                }
                ul9Var.put("tab_config", Integer.valueOf(i4));
            }
        }
        mw mwVar = lmcVar.f;
        if (mwVar != null && !gnl.d(mwVar)) {
            ul9Var.put("reason_meta", gnl.e(mwVar));
        }
        return ul9Var.b();
    }

    public final Integer c() {
        Map map;
        mbb mbbVar = (mbb) this.m.get();
        Object obj = (mbbVar == null || (map = mbbVar.c) == null) ? null : map.get("screen_to");
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    public final boolean d() {
        return SystemClock.elapsedRealtime() - this.k < ((Number) ((g5d) ((gjf) this.b.getValue())).a.R1.a(e5d.S6[146]).i()).longValue();
    }

    public final void f(y3f y3fVar, lmc lmcVar) {
        int i;
        Map map;
        mbb mbbVar = (mbb) this.m.get();
        if (mbbVar == null) {
            i = ((yte) this.f.getValue()).a ? 2 : 1;
        } else {
            i = 3;
        }
        ((yte) this.f.getValue()).a = true;
        Object obj = (mbbVar == null || (map = mbbVar.c) == null) ? null : map.get("screen_to");
        if (cqk.d(obj, 1) && !d()) {
            nkg nkgVar = (nkg) this.n.get();
            nkgVar.getClass();
            if (nkgVar != nkg.b && nkgVar != nkg.c) {
                return;
            }
        }
        yab.i0(this.g, null, 0, new h2c(mbbVar, this, y3fVar, i, lmcVar, null), 3);
        if (obj == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(y3fVar.a);
        je9 je9Var = je9.f;
        if (obj.equals(numValueOf)) {
            String str = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Sending perf stat is invalid on same screens", null);
                return;
            }
            return;
        }
        boolean zEquals = numValueOf.equals(1);
        if (obj.equals(150)) {
            u03 u03Var = (u03) this.d.getValue();
            String str2 = u03Var.g;
            owh owhVar = str2 != null ? new owh(str2) : null;
            String str3 = owhVar != null ? owhVar.a : null;
            if (str3 != null) {
                qrc.o(u03.i, zEquals ? t03.LEAVE_APP : t03.LEAVE_SCREEN, str3, null, null, 28);
                return;
            }
            String str4 = u03Var.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str4, "Invoked 'failMetricOnLeave', but traceId is null or empty!", null);
                return;
            }
            return;
        }
        if (obj.equals(350)) {
            e93 e93Var = (e93) this.e.getValue();
            String str5 = e93Var.g;
            owh owhVar2 = str5 != null ? new owh(str5) : null;
            String str6 = owhVar2 != null ? owhVar2.a : null;
            if (str6 != null) {
                qrc.o(e93.i, zEquals ? c93.LEAVE_APP : c93.LEAVE_SCREEN, str6, null, null, 28);
                return;
            }
            String str7 = e93Var.b;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str7, "Invoked 'failMetricOnLeave', but traceId is null or empty!", null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    public final void h(int i, mbb mbbVar, int i2, lmc lmcVar) {
        boolean zD;
        String str;
        Map map;
        if (mbbVar == null || (map = mbbVar.c) == null) {
            zD = false;
        } else {
            Object obj = map.get("screen_to");
            if ((obj instanceof Integer) && i == ((Number) obj).intValue()) {
                Object obj2 = map.get("pip");
                q1d q1dVar = lmcVar.a;
                if (cqk.d(q1dVar != null ? Integer.valueOf(q1dVar.a()) : null, obj2)) {
                    Object obj3 = map.get("reason");
                    int i3 = lmcVar.b;
                    if (cqk.d(i3 != 0 ? Integer.valueOf(r5a.a(i3)) : null, obj3)) {
                        Object obj4 = map.get("source_type");
                        rdg rdgVar = lmcVar.c;
                        if (!cqk.d(rdgVar != null ? Integer.valueOf(rdgVar.a) : null, obj4)) {
                            zD = false;
                        } else if (!cqk.d(lmcVar.d, map.get("source_id"))) {
                            zD = false;
                        } else if (cqk.d(lmcVar.e, map.get("expGroup"))) {
                            Object obj5 = map.get("reason_meta");
                            mw mwVar = lmcVar.f;
                            zD = cqk.d(obj5, mwVar != null ? gnl.e(mwVar) : null);
                        } else {
                            zD = false;
                        }
                    } else {
                        zD = false;
                    }
                } else {
                    zD = false;
                }
            } else {
                zD = false;
            }
        }
        if (zD) {
            return;
        }
        ul9 ul9VarB = b(i, mbbVar, lmcVar);
        if (i2 == 1) {
            str = "COLD_START";
        } else if (i2 == 2) {
            str = "WARM_START";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "GO";
        }
        mbb mbbVar2 = new mbb(str, ul9VarB);
        this.m.updateAndGet(new cz(3, mbbVar2));
        if (i != 1) {
            this.l.updateAndGet(new cz(4, lmcVar));
        }
        ((ae9) this.c.getValue()).j(mbbVar2.a, mbbVar2.b, mbbVar2.c, i2 == 1 || i2 == 2);
    }
}
