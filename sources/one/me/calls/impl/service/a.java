package one.me.calls.impl.service;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import defpackage.c0a;
import defpackage.ga2;
import defpackage.gm0;
import defpackage.i0;
import defpackage.jjf;
import defpackage.k42;
import defpackage.n42;
import defpackage.ore;
import defpackage.ww3;
import defpackage.x02;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final void a(Context context, Intent intent, k42 k42Var) {
        Handler handler = b.b;
        if (Looper.getMainLooper().isCurrentThread()) {
            b(context, intent, k42Var);
        } else {
            e().post(new i0(context, intent, k42Var, 10));
        }
    }

    public static final void b(Context context, Intent intent, k42 k42Var) {
        try {
            x02 x02VarF = new ga2(2).b().f();
            if (x02VarF == null || !x02VarF.C()) {
                return;
            }
            context.startForegroundService(intent);
        } catch (Throwable th) {
            CallServiceImpl.CallServiceException callServiceException = new CallServiceImpl.CallServiceException("cant start foreground service...", th);
            gm0.V("CallServiceTag", callServiceException.getMessage(), callServiceException);
            ((n42) k42Var).c().t();
        }
    }

    public static String c(int i) {
        if (i == jjf.b) {
            return "mediaPlayback";
        }
        if (i == jjf.f) {
            return "manifest";
        }
        if (i == jjf.c) {
            return "mediaProjection";
        }
        if (i == jjf.e) {
            return "microphone";
        }
        if (i == jjf.d) {
            return "camera";
        }
        return i == 0 ? "none" : c0a.k(i, "unknown(", ")");
    }

    public static String d(int i) {
        int i2 = jjf.a;
        if (i == 0) {
            return c(0);
        }
        if (i == -1) {
            return c(jjf.f);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = b.c.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue != jjf.f && (i & iIntValue) != 0) {
                arrayList.add(c(iIntValue));
            }
        }
        return ww3.z1(arrayList, "|", null, null, null, 62);
    }

    public static Handler e() {
        if (b.b == null) {
            b.b = new Handler(Looper.getMainLooper());
        }
        Handler handler = b.b;
        if (handler != null) {
            return handler;
        }
        ore.p("Required value was null.");
        return null;
    }
}
