package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class mih implements nnf, vd4 {
    public final cgb a;
    public final pfh b;
    public final boolean c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final AtomicReference i;
    public final AtomicLong j;
    public final String k;
    public final Set l;

    public mih(cgb cgbVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, onf onfVar, rg9 rg9Var, boolean z) {
        pfh pfhVar = new pfh(2);
        this.a = cgbVar;
        this.b = pfhVar;
        this.c = z;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.j = new AtomicLong(0L);
        this.k = "SessionController";
        this.l = Collections.synchronizedSet(new HashSet());
        this.i = new AtomicReference(f());
        ((rnf) onfVar).c(this);
        ((od4) ny8Var5.getValue()).a().f(this);
        rg9Var.F(!((svb) ny8Var2.getValue()).b());
    }

    @Override // defpackage.vd4
    public final void a() {
        gm0.n(this.k, "onConnectionTypeChange");
        ny8 ny8Var = this.h;
        boolean zH = ((od4) ny8Var.getValue()).a().h();
        AtomicReference atomicReference = this.i;
        if (!zH) {
            ((agb) atomicReference.get()).w(false);
        } else if (((od4) ny8Var.getValue()).e()) {
            ((agb) atomicReference.get()).w(true);
        }
    }

    @Override // defpackage.nnf
    public final void b(int i) {
        AtomicReference atomicReference = this.i;
        String str = this.k;
        if (i == 0) {
            gm0.Y(str, "onNoNet");
            i((agb) atomicReference.get());
            return;
        }
        if (i == 1) {
            gm0.n(str, "onDisconnected");
            i((agb) atomicReference.get());
        } else if (i == 2) {
            gm0.n(str, "onConnected");
        } else if (i == 3) {
            gm0.n(str, "onLoggedIn");
        } else {
            ore.k(nbh.q(i, "Unknown session state="));
        }
    }

    @Override // defpackage.vd4
    public final void c() {
        e(false);
    }

    public final void d(hih hihVar) {
        if (this.c) {
            agb agbVar = (agb) this.i.get();
            gm0.m(agbVar.a, "cancelRequest %s", hihVar);
            if (agbVar.g.get()) {
                gm0.W(agbVar.a, "cancelRequest ignored, session is closed!", new Object[0]);
                return;
            }
            synchronized (agbVar.w) {
                try {
                    for (klc klcVar : agbVar.v) {
                        jlc jlcVar = klcVar.b;
                        if (jlcVar != null && jlcVar.a.equals(hihVar)) {
                            String str = agbVar.a;
                            short sK = klcVar.b.a.k();
                            kfc.c.getClass();
                            gm0.m(str, "cancelRequest(): remove task from mPacketSenderTasks, opcode=%s, requestId=%s", lhb.c(sK), Long.valueOf(klcVar.b.c.g()));
                            agbVar.v.remove(klcVar);
                            klcVar.e = true;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (Map.Entry entry : agbVar.u.entrySet()) {
                jlc jlcVar2 = ((ilc) entry.getValue()).b.b;
                if (jlcVar2 != null && jlcVar2.a.equals(hihVar)) {
                    gm0.m(agbVar.a, "cancelRequest(): remove task from mPacketReaderTasks, seq=%s, requestId=%s", entry.getKey(), Long.valueOf(((ilc) entry.getValue()).a.g()));
                    agbVar.u.remove(entry.getKey());
                    ((ilc) entry.getValue()).e = true;
                    return;
                }
            }
        }
    }

    public final void e(boolean z) {
        if (!z) {
            ny8 ny8Var = this.h;
            if (!((od4) ny8Var.getValue()).a().h() || !((od4) ny8Var.getValue()).e()) {
                return;
            }
        }
        ((agb) this.i.get()).w(true);
    }

    public final agb f() {
        cgb cgbVar = this.a;
        gl6 gl6Var = (gl6) cgbVar.c.getValue();
        vnf vnfVar = (vnf) cgbVar.j.getValue();
        k7f k7fVar = (k7f) cgbVar.f.getValue();
        rc5 rc5Var = (rc5) cgbVar.e.getValue();
        rnf rnfVar = (rnf) cgbVar.d.getValue();
        vwb vwbVar = (vwb) cgbVar.g.getValue();
        dxb dxbVar = (dxb) cgbVar.h.getValue();
        icb icbVar = (icb) cgbVar.i.getValue();
        ifh ifhVar = cgbVar.a;
        boolean z = cgbVar.b;
        ny8 ny8Var = this.d;
        b5d b5dVar = ((zed) ny8Var.getValue()).b.b().a.J1;
        zv8[] zv8VarArr = e5d.S6;
        ((Number) b5dVar.a(zv8VarArr[138]).i()).intValue();
        boolean zBooleanValue = ((Boolean) ((zed) ny8Var.getValue()).b.a().a.D3.a(zv8VarArr[239]).i()).booleanValue();
        boolean z2 = ((zed) ny8Var.getValue()).b.a().z();
        boolean zBooleanValue2 = ((Boolean) ((zed) ny8Var.getValue()).b.a().a.G3.a(zv8VarArr[242]).i()).booleanValue();
        bgb bgbVar = new bgb(gl6Var, vnfVar, k7fVar, rc5Var, rnfVar, vwbVar, dxbVar, icbVar, ifhVar, z);
        bgbVar.k = zBooleanValue;
        bgbVar.l = z2;
        bgbVar.m = zBooleanValue2;
        return new agb(bgbVar);
    }

    public final void g() {
        int iIntValue;
        int size;
        agb agbVar = (agb) this.i.get();
        if (this.l.isEmpty() && (iIntValue = ((Number) ((zed) this.d.getValue()).b.b().a.L.a(e5d.S6[30]).i()).intValue()) > 0 && ((svb) this.e.getValue()).b() && !((gue) this.f.getValue()).e() && ((gue) ((r77) this.g.getValue())).d <= 0) {
            long j = this.j.get();
            long jG = ew5.g(this.b.m());
            lw5 lw5Var = lw5.MILLISECONDS;
            boolean z = ew5.d(ew5.o(qe7.P(jG, lw5Var), qe7.P(j, lw5Var)), qe7.O(iIntValue, lw5Var)) > 0;
            if (j <= 0 || !z) {
                return;
            }
            synchronized (agbVar.w) {
                size = agbVar.v.size();
            }
            if (size != 0) {
                return;
            }
            gm0.n(this.k, "disconnectIfNeeded: timeout expired, disconnect");
            agbVar.w(false);
        }
    }

    public final void h() {
        this.i.getAndUpdate(new ea1(9, this));
        e(false);
    }

    public final void i(agb agbVar) {
        String str = this.k;
        gm0.n(str, "updateSession");
        ny8 ny8Var = this.h;
        if (!((od4) ny8Var.getValue()).a().h()) {
            gm0.Y(str, "updateSession, seems there is NO net");
            agbVar.w(false);
        } else if (((od4) ny8Var.getValue()).e()) {
            agbVar.w(true);
        } else {
            gm0.Y(str, "updateSession, connection is NOT permitted");
            agbVar.w(false);
        }
    }
}
