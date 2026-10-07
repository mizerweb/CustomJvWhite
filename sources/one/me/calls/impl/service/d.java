package one.me.calls.impl.service;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import defpackage.ewg;
import defpackage.ga2;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.k42;
import defpackage.m02;
import defpackage.n42;
import defpackage.ny8;
import defpackage.o0j;
import defpackage.ore;
import defpackage.rx8;
import defpackage.sc2;
import defpackage.x02;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements m02 {
    public static Handler d;
    public final ha9 a;
    public final String b = d.class.getName();
    public final ny8 c = rx8.P(3, new o0j(7));

    public d(ha9 ha9Var) {
        this.a = ha9Var;
    }

    public static final void g(d dVar, Context context, Intent intent, k42 k42Var) {
        try {
            x02 x02VarF = ((ga2) dVar.c.getValue()).b().f();
            if (x02VarF == null || !x02VarF.C()) {
                return;
            }
            context.startForegroundService(intent);
        } catch (Throwable th) {
            VoIpCallService.VoIpCallServiceException voIpCallServiceException = new VoIpCallService.VoIpCallServiceException("cant start foreground service", th);
            gm0.V(dVar.b, voIpCallServiceException.getMessage(), voIpCallServiceException);
            ((n42) k42Var).c().t();
        }
    }

    @Override // defpackage.m02
    public final void a(Context context, k42 k42Var) {
        f(context, h(context).putExtra("ACTION", 3), k42Var);
    }

    @Override // defpackage.m02
    public final void c(Context context, k42 k42Var) {
        f(context, h(context).putExtra("ACTION", 0), k42Var);
    }

    @Override // defpackage.m02
    public final void d(Context context) {
        if (d == null) {
            d = new Handler(Looper.getMainLooper());
        }
        Handler handler = d;
        if (handler != null) {
            handler.post(new ewg(this, 27, context));
        } else {
            ore.p("Required value was null.");
        }
    }

    @Override // defpackage.m02
    public final void e(Context context, k42 k42Var) {
        f(context, h(context).putExtra("ACTION", 5), k42Var);
    }

    public final void f(Context context, Intent intent, k42 k42Var) {
        if (Looper.getMainLooper().isCurrentThread()) {
            g(this, context, intent, k42Var);
            return;
        }
        if (d == null) {
            d = new Handler(Looper.getMainLooper());
        }
        Handler handler = d;
        if (handler != null) {
            handler.post(new sc2(this, context, intent, k42Var, 16));
        } else {
            ore.p("Required value was null.");
        }
    }

    public final Intent h(Context context) {
        Intent intent = new Intent(context, (Class<?>) VoIpCallService.class);
        intent.putExtra("LOCAL_ACCOUNT_ID", this.a.a);
        return intent;
    }
}
