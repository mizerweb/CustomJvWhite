package one.me.calls.impl.service.telecom;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import defpackage.a4c;
import defpackage.b95;
import defpackage.be1;
import defpackage.c0a;
import defpackage.c95;
import defpackage.dz4;
import defpackage.f00;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hi6;
import defpackage.hs1;
import defpackage.ifh;
import defpackage.ii6;
import defpackage.je9;
import defpackage.k42;
import defpackage.ki6;
import defpackage.m02;
import defpackage.n0c;
import defpackage.ore;
import defpackage.pi6;
import defpackage.t20;
import defpackage.wmi;
import defpackage.x02;
import defpackage.xhh;
import defpackage.y02;
import defpackage.yab;
import defpackage.yde;
import defpackage.yvg;
import one.me.calls.impl.service.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements m02 {
    public final String a = a.class.getName();
    public final ifh b = new ifh(new yvg(14));
    public final c c;

    public a(ha9 ha9Var) {
        this.c = new c(ha9Var);
    }

    @Override // defpackage.m02
    public final void a(Context context, k42 k42Var) {
        x02 x02VarF = f();
        hs1 hs1VarG = g();
        if (hs1VarG != null) {
            String strS = x02VarF.s();
            dz4 dz4Var = (dz4) x02VarF.z().getValue();
            be1 be1Var = (be1) x02VarF.b().getValue();
            pi6 pi6Var = dz4Var.q;
            if ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6)) {
                gm0.n(hs1VarG.a, "restartCallNotification: call is failed or finished, skipping");
            } else {
                yab.i0((wmi) hs1VarG.e.getValue(), ((n0c) ((xhh) hs1VarG.f.getValue())).c().S0(), 0, new f00(7, null, hs1VarG, strS, dz4Var, be1Var), 2);
            }
        }
    }

    @Override // defpackage.m02
    public final void c(Context context, k42 k42Var) {
        gm0.V(this.a, "TelecomCallServiceProvider.start()", new TelecomCallService.TelecomCallServiceException("called — this should not happen in normal flow", null, 2, 0 == true ? 1 : 0));
    }

    @Override // defpackage.m02
    public final void d(Context context) {
        c cVar = this.c;
        cVar.getClass();
        if (c.c == null) {
            c.c = new Handler(Looper.getMainLooper());
        }
        Handler handler = c.c;
        if (handler == null) {
            ore.p("Required value was null.");
            return;
        }
        handler.post(new yde(cVar, 8, context));
        hs1 hs1VarG = g();
        if (hs1VarG != null) {
            ((c95) hs1VarG.c.getValue()).b();
        }
    }

    @Override // defpackage.m02
    public final void e(Context context, k42 k42Var) {
        x02 x02VarF = f();
        hs1 hs1VarG = g();
        if (hs1VarG != null) {
            String strS = x02VarF.s();
            dz4 dz4Var = (dz4) x02VarF.z().getValue();
            be1 be1Var = (be1) x02VarF.b().getValue();
            pi6 pi6Var = dz4Var.q;
            if ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6)) {
                gm0.n(hs1VarG.a, "restartCallNotificationForScreenSharing: call is failed or finished, skipping");
                return;
            }
            yab.i0((wmi) hs1VarG.e.getValue(), ((n0c) ((xhh) hs1VarG.f.getValue())).c().S0(), 0, new t20(hs1VarG, strS, dz4Var, be1Var, this.c, null, 5), 2);
        }
    }

    public final x02 f() {
        ifh ifhVar = this.b;
        x02 x02VarF = ((b95) ifhVar.getValue()).f();
        return x02VarF == null ? (x02) ((b95) ifhVar.getValue()).i.a.getValue() : x02VarF;
    }

    public final hs1 g() {
        a4c a4cVar;
        String strS = f().s();
        y02 y02VarP = ((b95) this.b.getValue()).p(strS);
        if (y02VarP == null && (a4cVar = gm0.f) != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallServiceTag", c0a.o("TelecomCallServiceProvider getNotificationHelper: no live session (id=", strS, "). cancel creating connection"), null);
            }
        }
        if (y02VarP != null) {
            return (hs1) y02VarP.getAccessor().c(729);
        }
        return null;
    }
}
