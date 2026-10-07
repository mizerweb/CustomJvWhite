package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class gl6 {
    public final hcb a;
    public final xe4 b;
    public final xd5 c;
    public final boolean d;
    public final ud4 e;
    public final vc4 f;
    public final ConcurrentHashMap g;
    public final vo5 h;
    public final t3a i;
    public final boolean j;
    public final ic1 k;
    public final r70 l;
    public final id4 m;
    public final CopyOnWriteArrayList n;

    static {
        Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public gl6(hcb hcbVar, xd5 xd5Var, xe4 xe4Var, vo5 vo5Var, t3a t3aVar, boolean z, ic1 ic1Var, boolean z2, boolean z3) {
        String str;
        w69 w69Var = hcbVar.e;
        zed zedVar = hcbVar.c;
        xb9 xb9Var = zedVar.a;
        xb9 xb9Var2 = zedVar.a;
        String strW = xb9Var.W();
        if (strW == null) {
            w69Var.getClass();
            strW = "api2.oneme.ru";
        } else {
            strW = strW.length() <= 0 ? null : strW;
            if (strW == null) {
                w69Var.getClass();
                strW = "api2.oneme.ru";
            }
        }
        String strX = xb9Var2.X();
        if (strX == null) {
            w69Var.getClass();
            str = "443";
        } else {
            str = strX.length() > 0 ? strX : null;
            if (str == null) {
                w69Var.getClass();
                str = "443";
            }
        }
        ud4 ud4Var = new ud4(strW, str, xb9Var2.Z());
        this.f = new vc4(new pfh(0));
        this.g = new ConcurrentHashMap();
        this.a = hcbVar;
        this.b = xe4Var;
        this.c = xd5Var;
        this.d = z2;
        this.e = ud4Var;
        this.h = vo5Var;
        this.i = t3aVar;
        this.j = z;
        this.k = ic1Var;
        r70 r70Var = new r70();
        r70Var.d = this;
        r70Var.b = new pfh(3);
        r70Var.a = this.j;
        r70Var.c = this.h;
        this.l = r70Var;
        lw5 lw5Var = lw5.SECONDS;
        ghb ghbVar = ew5.b;
        this.m = new id4(hcbVar, new pfh(2), z ? qe7.O(1, lw5Var) : qe7.O(500, lw5.MILLISECONDS), z ? qe7.O(10, lw5Var) : qe7.O(3, lw5Var), qe7.O(z ? 100 : 96, lw5Var), z3);
        this.n = new CopyOnWriteArrayList();
    }

    public static void a(Socket socket) {
        if (socket != null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.c;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "gl6", String.format(Locale.ROOT, "closeSocketSafely, %s", socket), null);
                }
            }
            try {
                socket.close();
            } catch (IOException e) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    return;
                }
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, "gl6", String.format(Locale.ROOT, "closeSocketSafely, failed for %s", socket), e);
                }
            }
        }
    }

    public final pq3 b() {
        je9 je9Var = je9.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            ud4 ud4Var = this.e;
            String str = ud4Var.a;
            int iIntValue = ((Number) ud4Var.d.getValue()).intValue();
            boolean z = this.j;
            StringBuilder sbR = c0a.r(iIntValue, "createConnection -> to ", str, ":", ", with rbc=");
            sbR.append(z);
            a4cVar.c(je9Var, "FastClient", sbR.toString(), null);
        }
        elh elhVar = new elh(this.l);
        fl6 fl6Var = new fl6(elhVar);
        this.n.add(fl6Var);
        try {
            try {
                ud4 ud4Var2 = this.e;
                String str2 = ud4Var2.a;
                int iIntValue2 = ((Number) ud4Var2.d.getValue()).intValue();
                ghb ghbVar = ew5.b;
                pq3 pq3VarB = elhVar.b(qe7.O(15000, lw5.MILLISECONDS), str2, iIntValue2);
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "FastClient", "<- createConnection, SUCCESS for " + pq3VarB, null);
                    }
                }
                this.m.c();
                if (this.j) {
                    pq3VarB.d = this.m;
                }
                this.n.remove(fl6Var);
                return pq3VarB;
            } catch (IOException e) {
                if (e.getCause() instanceof SocketTimeoutException) {
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var3 = je9.f;
                        if (a4cVar3.b(je9Var3)) {
                            a4cVar3.c(je9Var3, "FastClient", "createConnection, reset dns after socket timeout", null);
                        }
                    }
                    vo5 vo5Var = this.h;
                    String str3 = this.e.a;
                    String str4 = vo5Var.e;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                        a4cVar4.c(je9Var, str4, "resetHost, ".concat(str3), null);
                    }
                    ez7 ez7VarA = vo5Var.a(str3);
                    if (ez7VarA != null) {
                        ez7VarA.b();
                    }
                }
                this.m.b();
                throw e;
            }
        } catch (Throwable th) {
            this.n.remove(fl6Var);
            throw th;
        }
    }

    public final void c() {
        xe4 xe4Var = this.b;
        ((AtomicInteger) xe4Var.c).incrementAndGet();
        String name = xe4.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, zo5.h(((AtomicInteger) xe4Var.c).get(), "tryNextRequestTimeout "), null);
        }
    }

    public final void d(boolean z) {
        blh blhVar;
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            elh elhVar = ((fl6) it.next()).a;
            String str = elhVar.m;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.c;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.s("setTryToConnect, ", z), null);
                }
            }
            boolean z2 = !z;
            if (z && (blhVar = (blh) elhVar.h.get()) != null && ((gl6) elhVar.a.d).a.a.e() && !blhVar.c && elhVar.d()) {
                synchronized (elhVar.c) {
                    if (elhVar.d()) {
                        if (elhVar.j.get() < elhVar.k.get()) {
                            elhVar.l.set(true);
                            elhVar.c.notifyAll();
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            String str2 = elhVar.m;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9 je9Var2 = je9.f;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, str2, "setTryToConnect, force new connect", null);
                                }
                            }
                        }
                    }
                }
            }
            if (z2 && !elhVar.e.get()) {
                synchronized (elhVar.c) {
                    if (elhVar.e.compareAndSet(false, true)) {
                        elhVar.c.notifyAll();
                        String str3 = elhVar.m;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var3 = je9.f;
                            if (a4cVar3.b(je9Var3)) {
                                a4cVar3.c(je9Var3, str3, "abort", null);
                            }
                        }
                    }
                }
            }
        }
    }
}
