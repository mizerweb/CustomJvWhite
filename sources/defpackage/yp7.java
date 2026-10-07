package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class yp7 {
    public final xe2 a;
    public final se2 b;
    public final xp7 c;
    public final List d;
    public final mjg e;

    public yp7(zqh zqhVar, xe2 xe2Var, se2 se2Var, n89 n89Var, List list, lc2 lc2Var) {
        this.a = xe2Var;
        this.b = se2Var;
        this.d = se2Var.l;
        Map map = se2Var.j;
        Map map2 = se2Var.m;
        kwa kwaVar = mg2.c;
        Object obj = map.get(kwaVar);
        Boolean bool = Boolean.TRUE;
        if (cqk.d(obj, bool) || cqk.d(map2.get(kwaVar), bool)) {
            Log.i("CXCP", kwaVar + " is set to true, ignoring GraphState3A parameters.");
        }
        ue2 ue2Var = se2Var.o;
        lc2Var.b.getClass();
        ww6 ww6Var = ue2Var.b;
        Set set = (Set) lc2.c.get(Build.MANUFACTURER);
        int iMax = (set == null || !set.contains(Build.DEVICE) || Build.VERSION.SDK_INT >= 34) ? 0 : Math.max(0, 10);
        ww6Var.getClass();
        int iMax2 = Math.max(iMax, ww6Var.b);
        ll2 ll2Var = iMax2 != 0 ? new ll2(iMax2) : null;
        xp7 xp7Var = new xp7(xe2Var, map, map2, ww3.G1(xw3.Q0(ll2Var), list), a.Y0(new Object[]{n89Var, ll2Var}), zqhVar.a, zqhVar.h);
        this.c = xp7Var;
        if (ll2Var != null) {
            if (ll2Var.c != null) {
                ore.k("GraphLoop has already been set!");
                throw null;
            }
            ll2Var.c = xp7Var;
            xp7Var.W(false);
            Log.w("CXCP", "Capture processing has been disabled for " + xp7Var + " until " + ll2Var.a + " frames have been completed.");
        }
        this.e = p90.a(eq7.b);
    }

    public final void a(cq7 cq7Var) {
        mjg mjgVar;
        Object value;
        hq7 hq7Var;
        Log.d("CXCP", this + " onGraphError(" + cq7Var + ')');
        do {
            mjgVar = this.e;
            value = mjgVar.getValue();
            hq7Var = (hq7) value;
        } while (!mjgVar.h(value, ((hq7Var instanceof fq7) || (hq7Var instanceof eq7)) ? eq7.b : cq7Var));
        for (iq7 iq7Var : this.d) {
            lh2 lh2Var = iq7Var.a;
            ze2 ze2Var = iq7Var.b;
            if (ze2Var == null) {
                ze2Var = null;
            }
            lh2Var.b(ze2Var, cq7Var);
        }
    }

    public final void b(j28 j28Var) {
        Log.d("CXCP", this + " onGraphStarted");
        dq7 dq7Var = dq7.b;
        mjg mjgVar = this.e;
        mjgVar.getClass();
        mjgVar.j(null, dq7Var);
        this.c.Y(j28Var);
        for (iq7 iq7Var : this.d) {
            lh2 lh2Var = iq7Var.a;
            ze2 ze2Var = iq7Var.b;
            if (ze2Var == null) {
                ze2Var = null;
            }
            lh2Var.b(ze2Var, dq7Var);
        }
    }

    public final void c() {
        Log.d("CXCP", this + " onGraphStopped");
        mjg mjgVar = this.e;
        mjgVar.getClass();
        eq7 eq7Var = eq7.b;
        mjgVar.j(null, eq7Var);
        this.c.Y(null);
        for (iq7 iq7Var : this.d) {
            lh2 lh2Var = iq7Var.a;
            ze2 ze2Var = iq7Var.b;
            if (ze2Var == null) {
                ze2Var = null;
            }
            lh2Var.b(ze2Var, eq7Var);
        }
    }

    public final void d(fle fleVar) {
        xp7 xp7Var = this.c;
        synchronized (xp7Var.h) {
            try {
                fle fleVar2 = xp7Var.k;
                xp7Var.k = fleVar;
                if (fleVar2 != null || fleVar != null) {
                    g85 g85Var = xp7Var.g;
                    if (fleVar != null) {
                        g85Var.V(new op7(fleVar));
                    } else {
                        g85Var.V(kp7.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fleVar == null) {
            int size = xp7Var.d.size();
            for (int i = 0; i < size; i++) {
                ((tp7) xp7Var.d.get(i)).a();
            }
        }
    }

    public final boolean e(Map map) {
        xp7 xp7Var = this.c;
        if (xp7Var.l() != null) {
            return xp7Var.g.V(new qp7(map));
        }
        ore.k("Cannot submit parameters without an active repeating request!");
        return false;
    }

    public final void f(LinkedHashMap linkedHashMap) {
        xp7 xp7Var = this.c;
        synchronized (xp7Var.h) {
            xp7Var.g.V(new np7(xp7Var.l, linkedHashMap));
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.a + ')';
    }
}
