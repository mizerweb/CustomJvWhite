package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class agb {
    public static final AtomicInteger M = new AtomicInteger(0);
    public static final AtomicInteger N = new AtomicInteger(0);
    public boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final dxb E;
    public final icb F;
    public final vnf G;
    public final ifh H;
    public final gl6 I;
    public volatile gd4 J;
    public volatile v44 K;
    public final Object L;
    public final String a;
    public final int m;
    public final gl6 p;
    public final k7f q;
    public final vwb r;
    public final rnf s;
    public final rc5 t;
    public final ArrayList v;
    public final s74 x;
    public final s74 y;
    public final int z;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public volatile Long d = null;
    public final AtomicLong e = new AtomicLong(0);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicInteger i = new AtomicInteger(0);
    public final AtomicLong j = new AtomicLong(0);
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicInteger l = new AtomicInteger(0);
    public final AtomicLong n = new AtomicLong(Long.MIN_VALUE);
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final ConcurrentHashMap u = new ConcurrentHashMap();
    public final Object w = new Object();

    public agb(bgb bgbVar) {
        Object reentrantLock = null;
        new AtomicInteger();
        N.incrementAndGet();
        this.H = bgbVar.i;
        int iIncrementAndGet = M.incrementAndGet();
        this.m = iIncrementAndGet;
        this.q = bgbVar.c;
        this.r = bgbVar.f;
        String str = "Session#" + iIncrementAndGet;
        this.a = str;
        this.p = bgbVar.a;
        this.s = bgbVar.e;
        this.t = bgbVar.d;
        this.E = bgbVar.g;
        this.F = bgbVar.h;
        int iMax = Math.max(0, 0);
        this.z = iMax;
        this.B = bgbVar.k;
        this.C = bgbVar.m;
        this.D = bgbVar.j;
        gm0.m(str, "init, sendLimitIfNoSession=%d", Integer.valueOf(iMax));
        this.x = new s74(2);
        this.y = new s74(2);
        vnf vnfVar = bgbVar.b;
        this.G = vnfVar;
        this.v = new ArrayList();
        vnfVar.a(new bmf(this), "session-conn-handler").start();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "init, completed=".concat(String.valueOf(this)), null);
            }
        }
        this.I = bgbVar.n;
        this.J = new j85(20);
        boolean z = this.B;
        if (z && bgbVar.l) {
            reentrantLock = new rfe();
        } else if (z) {
            reentrantLock = new ReentrantLock();
        }
        this.L = reentrantLock;
    }

    public static void a(sfe sfeVar, agb agbVar, int i) {
        sfeVar.a = agbVar.v(i);
    }

    public static void b(agb agbVar) {
        if (!agbVar.o.get() || agbVar.g.get()) {
            return;
        }
        gm0.W(agbVar.a, "closeSessionIfMarkedToDestroy, closing ".concat(String.valueOf(agbVar)), new Object[0]);
        agbVar.h(true);
    }

    public static boolean c(agb agbVar, klc klcVar, Class cls) {
        jlc jlcVar = klcVar.b;
        if (jlcVar == null || !cls.isInstance(jlcVar.a)) {
            ore.k("wrong usage of method 'containsInPacketReader'");
            return false;
        }
        Iterator it = agbVar.u.entrySet().iterator();
        while (it.hasNext()) {
            jlc jlcVar2 = ((ilc) ((Map.Entry) it.next()).getValue()).b.b;
            if (jlcVar2 != null && cls.isInstance(jlcVar2.a)) {
                return true;
            }
        }
        return false;
    }

    public static void d(agb agbVar, hlc hlcVar) {
        synchronized (agbVar.w) {
            ArrayList arrayList = agbVar.v;
            ghb ghbVar = ew5.b;
            arrayList.add(new klc(2, null, qe7.P(System.currentTimeMillis(), lw5.MILLISECONDS), hlcVar));
        }
        agbVar.y.m();
    }

    public static void e(agb agbVar, hlc hlcVar, int i, ilc ilcVar, long j, int i2, long j2) {
        icb icbVar = agbVar.F;
        if (icbVar != null) {
            short s = hlcVar.d;
            kfc.c.getClass();
            String strP = lhb.p(s);
            short s2 = hlcVar.d;
            int i3 = ilcVar != null ? ilcVar.d : 0;
            byte b = hlcVar.e;
            byte b2 = hlcVar.b;
            boolean z = b2 == 2;
            boolean z2 = b2 == 3;
            if (((kcb) ((f5d) ((wo6) icbVar.a.d.getValue())).a.v2.a(e5d.S6[177]).i()).a.d(s2)) {
                rrc rrcVar = icbVar.a;
                ul9 ul9Var = new ul9();
                Integer numValueOf = Integer.valueOf(i3);
                if (i3 == 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    ul9Var.put("sent", Integer.valueOf(numValueOf.intValue()));
                }
                Integer numValueOf2 = Integer.valueOf(i);
                if (i == 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    ul9Var.put("recv", Integer.valueOf(numValueOf2.intValue()));
                }
                Long lValueOf = Long.valueOf(j);
                if (j == 0) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    ul9Var.put("respTime", Long.valueOf(lValueOf.longValue()));
                }
                Integer numValueOf3 = Integer.valueOf(i2);
                if (i2 <= 0) {
                    numValueOf3 = null;
                }
                if (numValueOf3 != null) {
                    ul9Var.put("rawSize", Integer.valueOf(numValueOf3.intValue()));
                }
                Long lQ = sb8.Q(Long.valueOf(j2));
                if (lQ != null) {
                    ul9Var.put("decMs", Long.valueOf(lQ.longValue()));
                }
                Byte bValueOf = Byte.valueOf(b);
                if (b == 0) {
                    bValueOf = null;
                }
                if (bValueOf != null) {
                    ul9Var.put("cof", Byte.valueOf(bValueOf.byteValue()));
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                if (!z) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    ul9Var.put(y5g.URL_TYPE_RETRY, boolValueOf);
                }
                Boolean boolValueOf2 = z2 ? Boolean.valueOf(z2) : null;
                if (boolValueOf2 != null) {
                    ul9Var.put("error", boolValueOf2);
                }
                ul9Var.put("background", Boolean.valueOf(!((gue) icbVar.a.c.getValue()).e()));
                ul9Var.put("conn", ((wd4) icbVar.a.b.getValue()).a().a());
                icbVar.b.getClass();
                if (rg9.j) {
                    ul9Var.put("is_first_login", 1);
                }
                ((ae9) rrcVar.f.getValue()).j("NET", strP, ul9Var.b(), false);
            }
        }
    }

    public static void f(agb agbVar) {
        gm0.n(agbVar.a, String.valueOf(agbVar) + ", " + Thread.currentThread().getName() + " finished");
    }

    public static String k(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i != 1) {
            return i != 2 ? "<UNKNOWN>" : "LOGGED_IN";
        }
        return "CONNECTED";
    }

    public final void g(long j) {
        gm0.m(this.a, "cancelRequest(): %d", Long.valueOf(j));
        synchronized (this.w) {
            try {
                for (klc klcVar : this.v) {
                    jlc jlcVar = klcVar.b;
                    if (jlcVar != null && jlcVar.c.g() == j) {
                        String str = this.a;
                        short sK = klcVar.b.a.k();
                        kfc.c.getClass();
                        gm0.m(str, "cancelRequest(): remove task from mPacketSenderTasks, opcode=%s, requestId=%s", lhb.c(sK), Long.valueOf(klcVar.b.c.g()));
                        this.v.remove(klcVar);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Map.Entry entry : this.u.entrySet()) {
            if (((ilc) entry.getValue()).a.g() == j) {
                gm0.m(this.a, "cancelRequest(): remove task from mPacketReaderTasks, seq=%s, requestId=%s", entry.getKey(), Long.valueOf(((ilc) entry.getValue()).a.g()));
                this.u.remove(entry.getKey());
                return;
            }
        }
    }

    public final void h(boolean z) {
        boolean z2 = false;
        boolean zCompareAndSet = this.g.compareAndSet(false, true);
        String str = this.a;
        if (!zCompareAndSet) {
            gm0.W(str, c0a.o("close, ", String.valueOf(this), " has ALREADY been CLOSED, skip re-closing"), new Object[0]);
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "close, closing the ".concat(String.valueOf(this)), null);
            }
        }
        w(false);
        this.x.m();
        this.y.m();
        if (!this.o.get() && !n()) {
            z2 = true;
        }
        if (this.J.close()) {
            i(true, z, om5.l);
        }
        this.p.getClass();
        if (z2) {
            this.s.b(Integer.toString(this.m), om5.k);
        }
        N.decrementAndGet();
        gm0.n(this.a, "close, " + String.valueOf(this) + " closed");
    }

    public final void i(boolean z, boolean z2, om5 om5Var) {
        ArrayList arrayList;
        gm0.m(this.a, "disconnect: clearSenderTasks %b, reason=%s", Boolean.valueOf(z), om5Var);
        u(0);
        if (!this.o.get()) {
            s(om5Var);
        }
        thh thhVar = new thh("disconnect");
        Iterator it = this.u.entrySet().iterator();
        while (it.hasNext()) {
            ((ilc) ((Map.Entry) it.next()).getValue()).a.f(thhVar);
        }
        this.u.clear();
        if (z) {
            Object obj = this.w;
            if (z2) {
                synchronized (obj) {
                    this.v.clear();
                }
                return;
            }
            synchronized (obj) {
                try {
                    arrayList = null;
                    for (klc klcVar : this.v) {
                        if (klcVar.b != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(1);
                            }
                            arrayList.add(klcVar);
                        }
                    }
                    this.v.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((klc) it2.next()).b.c.f(thhVar);
                }
            }
        }
    }

    public final void j(hih hihVar, boolean z, long j, rhh rhhVar) {
        if (hihVar.k() == 5) {
            return;
        }
        if (hihVar instanceof ah9) {
            gm0.n(this.a, "Received LogoutCmd, clearing all tasks");
            this.u.clear();
            synchronized (this.w) {
                this.v.clear();
            }
        }
        ArrayList arrayList = null;
        if (hihVar.i()) {
            String str = this.a;
            short sK = hihVar.k();
            kfc.c.getClass();
            gm0.m(str, "clearPreviousDuplicatedTasks() opCode=%s", lhb.c(sK));
            synchronized (this.w) {
                try {
                    for (klc klcVar : this.v) {
                        jlc jlcVar = klcVar.b;
                        if (jlcVar != null && jlcVar.a.k() == hihVar.k() && klcVar.b.a.l() == hihVar.l()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(Long.valueOf(klcVar.b.c.g()));
                            String str2 = this.a;
                            short sK2 = klcVar.b.a.k();
                            kfc.c.getClass();
                            gm0.m(str2, "cancel duplicated task: %s", lhb.p(sK2));
                        }
                    }
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            g(((Long) it.next()).longValue());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (hihVar.j()) {
            synchronized (this.w) {
                int iL = hihVar.l();
                for (klc klcVar2 : this.v) {
                    jlc jlcVar2 = klcVar2.b;
                    if (jlcVar2 != null && jlcVar2.a.k() == hihVar.k() && klcVar2.b.a.l() == iL) {
                        String str3 = this.a;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                Locale locale = Locale.US;
                                short sK3 = hihVar.k();
                                kfc.c.getClass();
                                a4cVar.c(je9Var, str3, String.format(locale, "ignore duplicated request: %s, params: %s", lhb.p(sK3), hihVar), null);
                            }
                        }
                        rhhVar.f(new yhh("client.task.ignored", "client.task.ignored", null));
                        return;
                    }
                }
            }
        }
        p(sd9.f, rhhVar.g(), (short) 0, hihVar.k(), true, hihVar.toString());
        jlc jlcVar3 = new jlc(hihVar, z, rhhVar);
        ghb ghbVar = ew5.b;
        klc klcVar3 = new klc(1, jlcVar3, qe7.P(j, lw5.MILLISECONDS), null);
        synchronized (this.w) {
            this.v.add(klcVar3);
        }
        this.y.m();
    }

    public final void l(int i, IOException iOException) {
        String strC;
        hih hihVar;
        om5 om5Var = om5.h;
        je9 je9Var = je9.d;
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            boolean z = this.B;
            StringBuilder sb = new StringBuilder("handleReadIoError(error:");
            sb.append(iOException);
            sb.append(", conn=");
            sb.append(i);
            sb.append(", checkStateBeforeDisconnect=");
            a4cVar.c(je9Var, str, qt4.r(sb, z, ")"), null);
        }
        if (!this.B) {
            i(false, false, om5Var);
            return;
        }
        thh thhVar = new thh("handleReadIoError");
        for (Map.Entry entry : this.u.entrySet()) {
            Short sh = (Short) entry.getKey();
            ilc ilcVar = (ilc) entry.getValue();
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                jlc jlcVar = ilcVar.b.b;
                if (jlcVar == null || (hihVar = jlcVar.a) == null) {
                    strC = null;
                } else {
                    short sK = hihVar.k();
                    kfc.c.getClass();
                    strC = lhb.c(sK);
                }
                StringBuilder sbT = qt4.t(ilcVar.a.g(), "handleReadIoError(): fail requestId = ", ", opcode = ", strC);
                sbT.append(", seq=");
                sbT.append(sh);
                a4cVar2.c(je9Var, str2, sbT.toString(), null);
            }
            ilcVar.a.f(thhVar);
        }
        this.u.clear();
        if (i == this.l.get() && u(0)) {
            s(om5Var);
            return;
        }
        String str3 = this.a;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar3.b(je9Var2)) {
            a4cVar3.c(je9Var2, str3, "handleReadIoError, skip DISCONNECTED status, isDisconnected=" + n() + ", curr_conn=" + this.l.get() + ", expected_conn=" + i, null);
        }
    }

    public final void m(int i) {
        om5 om5Var = om5.g;
        if (!this.B) {
            u(0);
            s(om5Var);
            return;
        }
        if (i == this.l.get() && u(0)) {
            s(om5Var);
            return;
        }
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "handleSendIoError, skip DISCONNECTED status, isDisconnected=" + n() + ", curr_conn=" + this.l.get() + ", expected_conn=" + i, null);
        }
    }

    public final boolean n() {
        return this.c.get() == 0;
    }

    public final boolean o() {
        return (this.g.get() || this.o.get()) ? false : true;
    }

    public final void p(sd9 sd9Var, long j, short s, short s2, boolean z, String str) {
        q(sd9Var, j, s, s2, z, str, null, 0);
    }

    public final void q(sd9 sd9Var, long j, short s, short s2, boolean z, String str, String str2, int i) {
        kfc.c.getClass();
        String strG = lhb.g(s2);
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "->" : "<-");
        sb.append(' ');
        sb.append(sd9Var.a);
        sb.append(' ');
        sb.append(strG);
        if (i != 0) {
            sb.append('/');
            sb.append(i);
            sb.append("B ");
        }
        sb.append('{');
        sb.append(j);
        sb.append(',');
        sb.append((int) s);
        sb.append("} ");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        String string = sb.toString();
        boolean zEquals = false;
        gm0.D(sd9Var.b, this.a, string, new Object[0]);
        if (sd9Var == sd9.g) {
            IllegalStateException illegalStateException = new IllegalStateException(zo5.p(strG, ": ", string));
            if (str2 != null) {
                if (s2 == 64) {
                    zEquals = "attachment.not.ready".equals(str2);
                } else if (s2 == 89) {
                    zEquals = "link.not.found".equals(str2);
                } else if (s2 == 46) {
                    zEquals = "contact.not.found".equals(str2);
                }
            }
            t(illegalStateException, zEquals);
        }
    }

    public final void r(int i) {
        if (o()) {
            rnf rnfVar = this.s;
            String strValueOf = String.valueOf(this.m);
            vc4 vc4VarE = this.J.e();
            vc4VarE.d = i;
            wc4 wc4VarA = vc4VarE.a();
            String str = rnfVar.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onConnected for sessionId=" + strValueOf + ", connectStat=" + wc4VarA, null);
                }
            }
            rnfVar.p.obtainMessage(1, wc4VarA).sendToTarget();
        }
    }

    public final void s(om5 om5Var) {
        if (o()) {
            this.s.b(Integer.toString(this.m), om5Var);
        }
    }

    public final void t(Exception exc, boolean z) {
        if (o()) {
            Integer.toString(this.m);
            this.s.p.obtainMessage(4, z ? 1 : 0, 0, exc).sendToTarget();
        }
    }

    public final String toString() {
        int size = this.v.size();
        StringBuilder sb = new StringBuilder(96);
        sb.append("Session@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append("(");
        sb.append(N.get());
        sb.append('|');
        sb.append(this.g.get() ? "CLOSED" : "OPEN");
        sb.append('|');
        sb.append(k(this.c.get()));
        long j = this.n.get();
        long jMax = j != Long.MIN_VALUE ? Math.max((System.nanoTime() / 1000000) - j, 0L) : Long.MIN_VALUE;
        if (jMax != Long.MIN_VALUE) {
            qt4.z(jMax, "|connecting~", "ms", sb);
        }
        sb.append("|destroy=");
        sb.append(this.o.get());
        sb.append("|send_tasks=");
        sb.append(size);
        sb.append("|checkStateBeforeDisconnect=");
        sb.append(this.B);
        sb.append("|rbc=");
        sb.append(this.C);
        sb.append("|use_execTime=");
        return c0a.p(sb, this.D, ')');
    }

    public final boolean u(final int i) {
        if (!this.B) {
            return v(i);
        }
        final sfe sfeVar = new sfe();
        Object obj = this.L;
        if (obj == null) {
            ore.p("statusLock is null");
            return false;
        }
        if (obj instanceof rfe) {
            ((rfe) obj).a(new af7() { // from class: yfb
                @Override // defpackage.af7
                public final Object invoke() {
                    agb.a(sfeVar, this, i);
                    return sbi.a;
                }
            });
        } else {
            if (!(obj instanceof ReentrantLock)) {
                ore.k("Unexpected status lock type");
                return false;
            }
            Lock lock = (Lock) obj;
            lock.lock();
            try {
                sfeVar.a = v(i);
            } finally {
                lock.unlock();
            }
        }
        return sfeVar.a;
    }

    public final boolean v(int i) {
        int andSet = this.c.getAndSet(i);
        if (i == 0) {
            this.h.set(false);
        }
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qv1.l("setConnectionsStatus, status=", k(i), ", old=", k(andSet)), null);
            }
        }
        this.x.m();
        if (andSet != i && !n()) {
            this.y.m();
        }
        return andSet != i;
    }

    public final void w(boolean z) {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("setTryToConnect, tryToConnect=", z), null);
            }
        }
        if (!this.C || z || !o()) {
            this.I.d(z);
        }
        this.f.set(z);
        if (z) {
            this.x.m();
        }
    }
}
