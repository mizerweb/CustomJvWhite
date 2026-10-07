package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class g5g {
    public final y3e a;
    public final z3e b;
    public final boolean c;
    public final String d;
    public final re9 e;
    public final re9 f;

    public g5g(y3e y3eVar, z3e z3eVar, esh eshVar, String str, boolean z) {
        y3eVar.getClass();
        z3eVar.getClass();
        eshVar.getClass();
        str.getClass();
        this.a = y3eVar;
        this.b = z3eVar;
        this.c = z;
        String strO = c0a.o("OK", str, "Signaling");
        this.d = strO;
        if (!z || !z3eVar.shouldThrottleSignalingLogs()) {
            this.e = null;
            this.f = null;
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = looperMyLooper != null ? new Handler(looperMyLooper) : null;
        if (handler == null) {
            y3eVar.log(strO, "Thread has no Looper, Handler won't be created for log throttlers");
        }
        final int i = 0;
        this.e = new re9(handler, eshVar, new cf7(this) { // from class: f5g
            public final /* synthetic */ g5g b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i2 = i;
                sbi sbiVar = sbi.a;
                g5g g5gVar = this.b;
                qe9 qe9Var = (qe9) obj;
                switch (i2) {
                    case 0:
                        qe9Var.getClass();
                        g5gVar.c(y5g.PING, qe9Var);
                        break;
                    default:
                        qe9Var.getClass();
                        g5gVar.b(y5g.PONG, qe9Var);
                        break;
                }
                return sbiVar;
            }
        });
        final int i2 = 1;
        this.f = new re9(handler, eshVar, new cf7(this) { // from class: f5g
            public final /* synthetic */ g5g b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                g5g g5gVar = this.b;
                qe9 qe9Var = (qe9) obj;
                switch (i3) {
                    case 0:
                        qe9Var.getClass();
                        g5gVar.c(y5g.PING, qe9Var);
                        break;
                    default:
                        qe9Var.getClass();
                        g5gVar.b(y5g.PONG, qe9Var);
                        break;
                }
                return sbiVar;
            }
        });
    }

    public static String a(qe9 qe9Var) {
        int i = qe9Var.a;
        long j = qe9Var.b;
        long j2 = qe9Var.c;
        long j3 = qe9Var.d;
        StringBuilder sbX = zo5.x(i, j, "(", " times over ");
        qt4.z(j2, "ms; intervals from ", "ms to ", sbX);
        return c0a.m(j3, "ms)", sbX);
    }

    public final void b(String str, qe9 qe9Var) {
        this.a.log(this.d, qv1.l(" -> ", str, " ", qe9Var != null ? a(qe9Var) : ""));
    }

    public final void c(String str, qe9 qe9Var) {
        this.a.log(this.d, qv1.l(" <- ", str, " ", qe9Var != null ? a(qe9Var) : ""));
    }

    public final void d(String str) {
        this.a.log(this.d, str);
    }

    public final void e(String str) {
        z3e z3eVar = this.b;
        str.getClass();
        if (!this.c) {
            if (!z3eVar.shouldThrottleSignalingLogs()) {
                this.a.log(this.d, " -> ".concat(str));
                return;
            }
            String strC = lql.c(str);
            strC.getClass();
            this.a.log(this.d, " -> ".concat(strC));
            return;
        }
        re9 re9Var = this.f;
        if (re9Var == null || !(str.equals(y5g.PING) || str.equals(y5g.PONG))) {
            if (!z3eVar.shouldHideSensitiveInformation()) {
                b(str, null);
                return;
            }
            String strC2 = lql.c(str);
            strC2.getClass();
            b(strC2, null);
            return;
        }
        ggk ggkVar = re9Var.c;
        if (ggkVar == null) {
            re9Var.a();
            return;
        }
        synchronized (ggkVar.b) {
            re9Var.a();
        }
    }
}
