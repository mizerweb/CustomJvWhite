package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.telecom.CallAudioState;
import android.telecom.CallEndpoint;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.impl.service.telecom.TelecomCallService;

/* JADX INFO: loaded from: classes4.dex */
public final class ue1 {
    public static final /* synthetic */ zv8[] t;
    public final Context a;
    public final ha9 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public volatile boolean k;
    public rd4 l;
    public j22 m;
    public w14 n;
    public xni o;
    public volatile CallEndpoint q;
    public volatile CallAudioState r;
    public final wme s;
    public final p3c g = qyj.S();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap.KeySetView j = ConcurrentHashMap.newKeySet();
    public volatile List p = r66.a;

    static {
        z8b z8bVar = new z8b(ue1.class, "observeDisplayingData", "getObserveDisplayingData()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        t = new zv8[]{z8bVar};
    }

    public ue1(Context context, ha9 ha9Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = context;
        this.b = ha9Var;
        this.c = ny8Var3;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var4;
        this.s = new wme(new w40(ny8Var3, 2));
    }

    public static void h(ue1 ue1Var, String str) {
        je9 je9Var = je9.d;
        re1 re1Var = (re1) ue1Var.i.get(new z02(str));
        if (re1Var == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", c0a.o("notifyCallEnded: no connection for sessionId=", str, ", mark session ended"), null);
            }
            ue1Var.j.add(new z02(str));
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallConnectionController", "Make telecom connection ended! " + re1Var, null);
        }
        re1Var.a(2);
        ue1Var.i.remove(new z02(str));
    }

    public final re1 a() {
        Object next;
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((re1) next).getState() != 5) {
                return (re1) next;
            }
        }
        next = null;
        return (re1) next;
    }

    public final pw1 b() {
        return (pw1) this.f.getValue();
    }

    public final boolean c() {
        return ((Boolean) ((e5d) this.c.getValue()).d6.a(e5d.S6[369]).i()).booleanValue();
    }

    public final PhoneAccountHandle d() {
        return new PhoneAccountHandle(new ComponentName(this.a, (Class<?>) (((Boolean) ((e5d) this.c.getValue()).A().i()).booleanValue() ? TelecomCallService.class : CallServiceImpl.class)), zo5.h(this.b.a, "oneme_calls_"));
    }

    public final llh e() {
        return (llh) ((e5d) this.c.getValue()).s().i();
    }

    public final void f(String str) {
        re1 re1Var = (re1) this.i.get(new z02(str));
        if (re1Var != null) {
            je9 je9Var = je9.d;
            if (re1Var.getState() == 4) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallConnection", "markOnHold!", null);
                }
                re1Var.setOnHold();
                return;
            }
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallConnection", zo5.h(re1Var.getState(), "markOnHold skipped because of state, state="), null);
            }
        }
    }

    public final void g(String str) {
        re1 re1Var = (re1) this.i.get(new z02(str));
        if (re1Var != null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallConnectionController", "Make telecom connection active! " + re1Var, null);
                }
            }
            re1Var.b();
        }
    }

    public final void i(String str, boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", qt4.n("onAnswerFromConnection session=", str, " isVideo=", z), null);
            }
        }
        p85 p85Var = (p85) this.h.get(new z02(str));
        if (p85Var != null) {
            y85 y85Var = p85Var.a;
            y85Var.B(z);
            yab.i0(y85Var.c, ((n0c) y85Var.W()).c().S0(), 0, new o85(0, null, y85Var), 2);
        }
    }

    public final boolean j(re1 re1Var) {
        je9 je9Var = je9.d;
        boolean zRemove = this.j.remove(new z02(re1Var.b));
        boolean z = ((llh) ((e5d) this.c.getValue()).s().i()).c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            StringBuilder sbA = zo5.A("onConnectionCreated for ", re1Var.b, ", endedBeforeCreate=", ", earlyDestroyEnabled=", zRemove);
            sbA.append(z);
            a4cVar.c(je9Var, "CallConnectionController", sbA.toString(), null);
        }
        if (!z || !zRemove) {
            re1 re1Var2 = (re1) this.i.put(new z02(re1Var.b), re1Var);
            if (re1Var2 != null) {
                re1Var2.a(2);
            }
            return true;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "CallConnectionController", qv1.k("onConnectionCreated: call ended for ", re1Var.b), null);
        }
        re1Var.a(2);
        return false;
    }

    public final void k(String str) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", "onConnectionFailed — telecom rejected call ".concat(str), null);
            }
        }
        this.j.add(new z02(str));
        re1 re1Var = (re1) this.i.remove(new z02(str));
        if (re1Var != null) {
            int i = re1.d;
            re1Var.a(2);
        }
    }

    public final void l() {
        sgg sggVarJ0 = e9i.j0(new fz6(((ku1) this.d.getValue()).d, new sfd(this, (lq4) null, 26), 3), (y82) this.e.getValue());
        this.g.B(this, t[0], sggVarJ0);
    }

    public final void m(String str) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", "onNotificationShown ".concat(str), null);
            }
        }
        p85 p85Var = (p85) this.h.get(new z02(str));
        if (p85Var != null) {
            y85 y85Var = p85Var.a;
            if (y85Var.k()) {
                y85Var.f0();
            }
        }
    }

    public final void n(String str) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", "onRejectFromConnection session=".concat(str), null);
            }
        }
        p85 p85Var = (p85) this.h.get(new z02(str));
        if (p85Var != null) {
            y85 y85Var = p85Var.a;
            y85Var.p(y85Var.K().g ? it7.e : it7.c);
        }
    }

    public final boolean o() {
        if (this.k) {
            return true;
        }
        TelecomManager telecomManagerQ = q();
        if (telecomManagerQ == null) {
            return false;
        }
        try {
            telecomManagerQ.registerPhoneAccount(PhoneAccount.builder(d(), "OneMe Calls").setCapabilities(np0.q).addSupportedUriScheme("sip").addSupportedUriScheme("tel").build());
            this.k = true;
            gm0.n("CallConnectionController", "PhoneAccount registered");
            return true;
        } catch (Throwable th) {
            se1 se1Var = new se1("Failed to register PhoneAccount", th);
            gm0.V("CallConnectionController", se1Var.getMessage(), se1Var);
            return false;
        }
    }

    public final void p(String str) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallConnectionController", "release session ".concat(str), null);
            }
        }
        this.h.remove(new z02(str));
        pw1 pw1VarB = b();
        ha9 ha9Var = this.b;
        boolean z = e().b;
        boolean zBooleanValue = ((Boolean) this.s.getValue()).booleanValue();
        pw1VarB.getClass();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        pw1VarB.b.compute(ha9Var, new mw1(0, new lw1(str, ha9Var, atomicBoolean, z)));
        if (atomicBoolean.get() && z) {
            pw1VarB.c(ha9Var, pw1VarB.a(ha9Var, zBooleanValue));
        }
        this.s.a();
        re1 re1Var = (re1) this.i.remove(new z02(str));
        if (re1Var != null) {
            int i = re1.d;
            re1Var.a(2);
        }
        if (this.h.isEmpty()) {
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = r66.a;
            this.q = null;
            this.r = null;
            if (e().g) {
                this.g.B(this, t[0], null);
            }
            if (((llh) ((e5d) this.c.getValue()).s().i()).b) {
                try {
                    TelecomManager telecomManagerQ = q();
                    if (telecomManagerQ != null) {
                        telecomManagerQ.unregisterPhoneAccount(d());
                        this.k = false;
                    }
                } catch (RuntimeException e) {
                    gm0.V("CallConnectionController", e.getMessage(), new te1("Failed to unregister phone account", e));
                }
            }
        }
    }

    public final TelecomManager q() {
        TelecomManager telecomManager = (TelecomManager) this.a.getSystemService(TelecomManager.class);
        if (telecomManager != null) {
            return telecomManager;
        }
        gm0.Y("CallConnectionController", "There is no TelecomManager system service");
        return null;
    }

    public final void r(String str) {
        re1 re1Var = (re1) this.i.get(new z02(str));
        if (re1Var != null && re1Var.getState() == 5) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "CallConnectionController", "resuming from hold ".concat(str), null);
                }
            }
            re1Var.b();
        }
    }
}
