package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cf2 implements ie2, AutoCloseable {
    public final m9b a;
    public final yp7 b;
    public final ar4 c;
    public final af2 d;
    public final bf2 e;
    public final int f;

    public cf2(m9b m9bVar, yp7 yp7Var, ar4 ar4Var, af2 af2Var, bf2 bf2Var) {
        this.a = m9bVar;
        this.b = yp7Var;
        this.c = ar4Var;
        this.d = af2Var;
        this.e = bf2Var;
        g40 g40Var = df2.a;
        g40Var.getClass();
        this.f = g40.b.incrementAndGet(g40Var);
    }

    public static i64 I(cf2 cf2Var, long j, int i) {
        Object obj;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        Boolean bool3 = (i & 4) != 0 ? null : bool;
        long j2 = (i & 32) != 0 ? 3000000000L : j;
        if (cf2Var.a.a()) {
            c.p(cf2Var, " after close.", "Cannot call unlock3A on ");
            return null;
        }
        ar4 ar4Var = cf2Var.c;
        Long l = new Long(j2);
        i64 i64Var = ar4.r;
        yp7 yp7Var = ar4Var.a;
        ag2 ag2Var = bg2.U;
        bg2 bg2Var = ar4Var.b;
        ag2Var.getClass();
        Boolean bool4 = !ag2.a(bg2Var) ? null : bool;
        if (!cqk.d(bool2, bool) && !cqk.d(bool4, bool) && !cqk.d(bool3, bool)) {
            return qyj.a(new toe(0, null));
        }
        if (yp7Var.c.l() == null) {
            return i64Var;
        }
        if (cqk.d(bool4, bool)) {
            Log.d("CXCP", "unlock3A - sending a request to unlock af first.");
            if (!yp7Var.e(ar4.o)) {
                Log.d("CXCP", "unlock3A - failed to send a request to unlock af first.");
                return i64Var;
            }
            gq7.b(ar4Var.c, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
        }
        boolean zD = cqk.d(bool2, bool);
        boolean zD2 = cqk.d(bool4, bool);
        boolean zD3 = cqk.d(bool3, bool);
        if (zD || zD2 || zD3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (zD) {
                linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, ar4.s);
            }
            if (zD2) {
                linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, ar4.t);
            }
            if (zD3) {
                linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, ar4.u);
            }
            obj = linkedHashMap;
        } else {
            obj = s66.a;
        }
        uoe uoeVar = new uoe(new p7d(19, obj), 60, l);
        ar4Var.d.e(uoeVar);
        Boolean bool5 = cqk.d(bool2, bool) ? Boolean.FALSE : null;
        Boolean bool6 = cqk.d(bool3, bool) ? Boolean.FALSE : null;
        if (bool5 != null || bool6 != null) {
            Log.d("CXCP", "unlock3A - updating graph state, aeLock=" + bool5 + ", awbLock=" + bool6);
            gq7.b(ar4Var.c, null, null, null, null, null, null, null, bool5, null, bool6, 383);
        }
        yp7Var.f(ar4Var.c.a());
        return uoeVar.d;
    }

    public static Object g(cf2 cf2Var, List list, List list2, List list3, jd9 jd9Var, jd9 jd9Var2, jd9 jd9Var3, oe oeVar, b52 b52Var, long j, long j2, nq4 nq4Var, int i) {
        List list4 = (i & 8) != 0 ? null : list;
        List list5 = (i & 16) != 0 ? null : list2;
        List list6 = (i & 32) != 0 ? null : list3;
        oe oeVar2 = (i & np0.o) != 0 ? null : oeVar;
        b52 b52Var2 = (i & 1024) != 0 ? null : b52Var;
        if (!cf2Var.a.a()) {
            return cf2Var.c.a(list4, list5, list6, jd9Var, jd9Var2, jd9Var3, oeVar2, b52Var2, 60, new Long(j), new Long(j2), nq4Var);
        }
        c.p(cf2Var, " after close.", "Cannot call lock3A on ");
        return null;
    }

    public static i64 l(cf2 cf2Var, final boolean z, final boolean z2, long j) {
        if (cf2Var.a.a()) {
            c.p(cf2Var, " after close.", "Cannot call lock3AForCapture on ");
            return null;
        }
        ar4 ar4Var = cf2Var.c;
        ar4Var.getClass();
        Map map = ar4.q;
        Map map2 = z ? map : ar4.p;
        cf7 cf7Var = new cf7() { // from class: yq4
            /* JADX WARN: Code duplicated, block: B:11:0x002d  */
            /* JADX WARN: Code duplicated, block: B:28:0x006d  */
            /* JADX WARN: Code duplicated, block: B:42:0x009d  */
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                boolean zJ1;
                boolean z3;
                boolean zContains;
                CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
                CaptureResult captureResult = ((xg) obj).a;
                Integer num = (Integer) captureResult.get(key);
                if (num != null) {
                    int iIntValue = num.intValue();
                    List list = pe.b;
                    if (iIntValue == 0) {
                        zJ1 = true;
                    } else if (z) {
                        Object obj2 = captureResult.get(CaptureResult.CONTROL_AF_STATE);
                        List list2 = ar4.k;
                        if (obj2 != null) {
                            zJ1 = list2.contains(obj2);
                        } else {
                            zJ1 = true;
                        }
                    } else if (iIntValue == 3 || iIntValue == 4) {
                        zJ1 = ww3.j1(ar4.h, captureResult.get(CaptureResult.CONTROL_AF_STATE));
                    } else {
                        zJ1 = true;
                    }
                } else {
                    zJ1 = false;
                }
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    List list3 = oe.b;
                    if (iIntValue2 != 0) {
                        Object obj3 = captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (!(obj3 != null ? ar4.l.contains(obj3) : true)) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                List list4 = ql0.b;
                boolean z4 = z2;
                if (z4 && num3 == null) {
                    zContains = false;
                } else if (!z4 || iIntValue3 == 0) {
                    zContains = true;
                } else {
                    Object obj4 = captureResult.get(CaptureResult.CONTROL_AWB_STATE);
                    List list5 = ar4.m;
                    if (obj4 != null) {
                        zContains = list5.contains(obj4);
                    } else {
                        zContains = true;
                    }
                }
                Log.d("CXCP", "lock3AForCapture state " + ((Object) tc7.a(captureResult.getFrameNumber())) + ": meetsAeCondition = " + z3 + ", meetsAfCondition = " + zJ1 + ", meetsAwbCondition = " + zContains);
                return Boolean.valueOf(z3 && zJ1 && zContains);
            }
        };
        n89 n89Var = ar4Var.d;
        i64 i64Var = ar4.r;
        yp7 yp7Var = ar4Var.a;
        if (yp7Var.c.l() == null) {
            return i64Var;
        }
        if (map2 != null) {
            map = map2;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            cqk.d(((Map.Entry) it.next()).getValue(), 1);
        }
        uoe uoeVar = new uoe(cf7Var, 60, Long.valueOf(j));
        n89Var.e(uoeVar);
        Log.d("CXCP", "lock3AForCapture - sending a request to trigger ae precapture metering and af.");
        if (yp7Var.e(map)) {
            yp7Var.f(ar4Var.c.a());
            return uoeVar.d;
        }
        n89Var.a.remove(uoeVar);
        return i64Var;
    }

    public final void A() {
        if (this.a.a()) {
            c.p(this, " after close.", "Cannot call stopRepeating on ");
        } else {
            this.b.d(null);
        }
    }

    public final void E(ArrayList arrayList) {
        Object next;
        if (this.a.a()) {
            c.p(this, " after close.", "Cannot call submit on ");
            return;
        }
        if (arrayList.isEmpty()) {
            ore.k("Cannot call submit with an empty list of Requests!");
            return;
        }
        yp7 yp7Var = this.b;
        yp7Var.getClass();
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((fle) next).f == null);
        fle fleVar = (fle) next;
        if (fleVar == null || yp7Var.b.d != null) {
            xp7 xp7Var = yp7Var.c;
            if (xp7Var.g.V(new lp7(arrayList))) {
                return;
            }
            xp7Var.b(arrayList);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot submit ");
        sb.append(fleVar);
        di8 di8Var = fleVar.f;
        sb.append(" with input request ");
        sb.append(di8Var);
        sb.append(" to ");
        sb.append(yp7Var);
        sb.append(" because CameraGraph was not configured to support reprocessing");
        throw new IllegalStateException(sb.toString().toString());
    }

    public final i64 K(boolean z) {
        if (this.a.a()) {
            c.p(this, " after close.", "Cannot call unlock3APostCapture on ");
            return null;
        }
        i64 i64Var = ar4.r;
        ar4 ar4Var = this.c;
        yp7 yp7Var = ar4Var.a;
        if (yp7Var.c.l() != null) {
            Log.d("CXCP", "unlock3APostCapture - sending a request to reset af and ae precapture metering.");
            if (yp7Var.e(z ? ar4.w : ar4.v)) {
                uoe uoeVar = z ? new uoe(ar4.x, null, null) : new uoe(s66.a);
                ar4Var.d.e(uoeVar);
                yp7Var.f(ar4Var.c.a());
                return uoeVar.d;
            }
        }
        return i64Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d.a) {
        }
        synchronized (this.e.a) {
        }
        this.a.b();
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.f;
    }

    public final i64 y() {
        oe oeVar = null;
        if (this.a.a()) {
            c.p(this, " after close.", "Cannot call setTorchOn on ");
            return null;
        }
        ar4 ar4Var = this.c;
        oe oeVar2 = ((djg) ar4Var.c.a.a).a;
        List list = oe.b;
        if ((oeVar2 == null || oeVar2.a != 1) && (oeVar2 == null || oeVar2.a != 0)) {
            oeVar = new oe(1);
        }
        return ar4.b(ar4Var, oeVar, null, null, new jx6(2), null, null, null, 118);
    }
}
