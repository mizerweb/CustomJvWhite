package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.android.OneMeApplication;

/* JADX INFO: loaded from: classes.dex */
public final class swh {
    public static volatile boolean b;
    public static m3a c;
    public static Context d;
    public static snf e;
    public static khh f;
    public static final swh a = new swh();
    public static final AtomicBoolean g = new AtomicBoolean();
    public static final ifh h = new ifh(x9.e);
    public static final ifh i = new ifh(x9.d);
    public static volatile Map j = s66.a;

    public static String a() {
        if (b) {
            return null;
        }
        Object obj = c().get(cqk.b);
        if ((obj instanceof lt4 ? (lt4) obj : null) == null) {
            new v2a(18).j();
        }
        Context context = d;
        if (context == null) {
            context = null;
        }
        String strP = oc9.P(context, "tracer_app_token");
        if (strP == null) {
            ore.k("Could not find Tracer's appToken. Is Tracer plugin configured properly?");
            return null;
        }
        if (strP.equals("0000000000000000000000000000000000000000000")) {
            return null;
        }
        return strP;
    }

    public static pv5 b() {
        return (pv5) i.getValue();
    }

    public static Map c() {
        if (g.get()) {
            return j;
        }
        ore.k("Tracer is not initialized");
        return null;
    }

    public static List d(OneMeApplication oneMeApplication) {
        wxb wxbVar = wxb.a;
        v2a v2aVar = new v2a(18);
        v2aVar.c = 2147482647;
        lt4 lt4Var = new lt4(v2aVar);
        fv4 fv4Var = new fv4(new a8g(16));
        dv4 dv4Var = new dv4();
        Boolean bool = Boolean.TRUE;
        dv4Var.a = bool;
        ev4 ev4Var = new ev4(dv4Var);
        dv4 dv4Var2 = new dv4();
        dv4Var2.a = bool;
        ku7 ku7Var = new ku7(dv4Var2);
        dv4 dv4Var3 = new dv4();
        dv4Var3.a = bool;
        in5 in5Var = new in5(dv4Var3);
        aze azeVar = new aze();
        qf4 qf4Var = new qf4();
        qf4Var.c = bool;
        qf4Var.b = 1000;
        return xw3.P0(lt4Var, fv4Var, ev4Var, ku7Var, in5Var, azeVar, new esc(qf4Var));
    }

    public static final void e(String str, String str2) {
        Map mapSingletonMap = Collections.singletonMap(str, str2);
        if (b) {
            return;
        }
        try {
            snf snfVar = e;
            if (snfVar == null) {
                snfVar = null;
            }
            snfVar.e(mapSingletonMap);
        } catch (Exception unused) {
        }
    }
}
