package defpackage;

import android.content.Context;
import one.me.calls.impl.service.b;
import one.me.calls.impl.service.d;
import one.me.calls.impl.service.telecom.a;

/* JADX INFO: loaded from: classes2.dex */
public final class syb implements m02 {
    public final b a;
    public final a b;
    public final d c;
    public final e5d d;
    public volatile m02 e;
    public volatile boolean f;

    public syb(b bVar, a aVar, d dVar, e5d e5dVar) {
        this.a = bVar;
        this.b = aVar;
        this.c = dVar;
        this.d = e5dVar;
    }

    @Override // defpackage.m02
    public final void a(Context context, k42 k42Var) {
        m02 m02VarF = this.e;
        if (m02VarF == null) {
            m02VarF = f();
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "OneMeCallService", "restartForeground: using ".concat(m02VarF.getClass().getSimpleName()), null);
            }
        }
        m02VarF.a(context, k42Var);
    }

    @Override // defpackage.m02
    public final void b(boolean z) {
        this.f = z;
    }

    @Override // defpackage.m02
    public final void c(Context context, k42 k42Var) {
        if (!((Boolean) this.d.A().i()).booleanValue()) {
            gm0.n("OneMeCallService", "start: split-call-services disabled");
            this.e = this.a;
            this.a.c(context, k42Var);
        } else if (this.f) {
            this.e = this.b;
            gm0.n("OneMeCallService", "start: telecom captured call, using TelecomCallServiceProvider");
        } else {
            this.e = this.c;
            this.c.c(context, k42Var);
            gm0.n("OneMeCallService", "start: telecom doesn't capture call, fallback to VoIpCallServiceProvider");
        }
    }

    @Override // defpackage.m02
    public final void d(Context context) {
        m02 m02VarF = this.e;
        if (m02VarF == null) {
            m02VarF = f();
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "OneMeCallService", "stopService: using ".concat(m02VarF.getClass().getSimpleName()), null);
            }
        }
        m02VarF.d(context);
        this.e = null;
        this.f = false;
    }

    @Override // defpackage.m02
    public final void e(Context context, k42 k42Var) {
        m02 m02VarF = this.e;
        if (m02VarF == null) {
            m02VarF = f();
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "OneMeCallService", "restartForScreenSharingForeground: using ".concat(m02VarF.getClass().getSimpleName()), null);
            }
        }
        m02VarF.e(context, k42Var);
    }

    public final m02 f() {
        if (((Boolean) this.d.A().i()).booleanValue() && this.f) {
            return this.b;
        }
        return (!((Boolean) this.d.A().i()).booleanValue() || this.f) ? this.a : this.c;
    }
}
