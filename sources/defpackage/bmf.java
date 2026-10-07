package defpackage;

import android.os.StrictMode;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Locale;
import one.me.sdk.net.client.api.ConnectingCanceledException;

/* JADX INFO: loaded from: classes.dex */
public final class bmf implements Runnable {
    public final String a;
    public final Locale b = Locale.ENGLISH;
    public long c;
    public long d;
    public final /* synthetic */ agb e;

    public bmf(agb agbVar) {
        this.e = agbVar;
        this.a = zo5.h(agbVar.m, "[CONN_WATCHDOG]#");
    }

    public final int a() {
        if (this.d > 0) {
            return this.e.l.get();
        }
        return -1;
    }

    public final void b(String str) {
        gm0.m(this.e.a, "%s: %s", this.a, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b("started ->");
        this.c = System.currentTimeMillis();
        long j = -1;
        long j2 = -1;
        while (this.e.o()) {
            s74 s74Var = this.e.x;
            s74Var.getClass();
            try {
                s74Var.p(j2);
                if (!this.e.o()) {
                    gm0.W(this.e.a, "%s: %s", this.a, String.format(this.b, "detect CLOSED session in %dms, EXIT", Long.valueOf(System.currentTimeMillis() - this.c)));
                    break;
                }
                int i = this.e.c.get();
                if (i != 0) {
                    if (i == 1) {
                        b(String.format(this.b, "active_conn#%d, detect connected status", Integer.valueOf(a())));
                    } else if (i == 2) {
                        b(String.format(this.b, "active_conn#%d, detect loggedIn status", Integer.valueOf(a())));
                    }
                    j = -1;
                    j2 = -1;
                } else {
                    gm0.W(this.e.a, "%s: %s", this.a, String.format(this.b, "active_conn#%d, detect disconnected status", Integer.valueOf(a())));
                }
                if (this.e.f.get()) {
                    b(String.format(this.b, "active_conn#%d, detect tryToConnect status ...", Integer.valueOf(a())));
                    id4 id4Var = this.e.I.m;
                    id4Var.getClass();
                    vfe vfeVar = new vfe();
                    ghb ghbVar = ew5.b;
                    vfeVar.a = 0L;
                    id4Var.d(new hd4(id4Var, vfeVar, ((hcb) id4Var.h).d.h(), 0));
                    long jG = ew5.g(vfeVar.a);
                    b(String.format(this.b, "next conn_delay=%dms", Long.valueOf(jG)));
                    if (jG > 0) {
                        b(String.format(this.b, "setup waiting timeout=%dms", Long.valueOf(jG)));
                        j2 = jG;
                    } else if (this.e.o()) {
                        agb agbVar = this.e;
                        if (agbVar.n()) {
                            if (this.d > 0) {
                                gm0.W(this.e.a, "%s: %s", this.a, String.format(this.b, "active_conn#%d, finished in %dms <-", Integer.valueOf(agbVar.l.get()), Long.valueOf(System.currentTimeMillis() - this.d)));
                            }
                            this.d = j;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        agb agbVar2 = this.e;
                        je9 je9Var = je9.d;
                        if (agbVar2.n()) {
                            int iIncrementAndGet = agbVar2.l.incrementAndGet();
                            if (agbVar2.o()) {
                                rnf rnfVar = agbVar2.s;
                                String string = Integer.toString(agbVar2.m);
                                String str = rnfVar.f;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "onConnectStarted for sessionId=".concat(string), null);
                                }
                                rnfVar.p.obtainMessage(-1, string).sendToTarget();
                            }
                            try {
                                String str2 = agbVar2.a;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                    a4cVar2.c(je9Var, str2, "Connect", null);
                                }
                                agbVar2.J.close();
                                pq3 pq3VarB = agbVar2.I.b();
                                ((vc4) pq3VarB.c).d = iIncrementAndGet;
                                agbVar2.K = ((vc4) pq3VarB.c).a.a();
                                agbVar2.J = pq3VarB;
                                agbVar2.e.set(System.currentTimeMillis());
                                agbVar2.u(1);
                                agbVar2.r(iIncrementAndGet);
                                agb agbVar3 = this.e;
                                if (agbVar3.k.compareAndSet(false, true)) {
                                    gm0.n(agbVar3.a, "tryToCreateOtherThreads");
                                    String str3 = agbVar3.a;
                                    a4c a4cVar3 = gm0.f;
                                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                        a4cVar3.c(je9Var, str3, "startTimeoutHandler", null);
                                    }
                                    agbVar3.G.a(new p0(agbVar3), "session-timeout-handler").start();
                                    String str4 = agbVar3.a;
                                    a4c a4cVar4 = gm0.f;
                                    if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                        a4cVar4.c(je9Var, str4, "startPacketReader", null);
                                    }
                                    agbVar3.G.a(new zfb(agbVar3, 0), "session-reader-packet").start();
                                    String str5 = agbVar3.a;
                                    a4c a4cVar5 = gm0.f;
                                    if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                                        a4cVar5.c(je9Var, str5, "startPacketSender", null);
                                    }
                                    agbVar3.G.a(new zfb(agbVar3, 1), "session-sender-packet").start();
                                }
                                agb agbVar4 = this.e;
                                vc4 vc4Var = agbVar4.p.f;
                                vc4Var.d = agbVar4.l.get();
                                b(String.format(this.b, "connectToSocket() took %dms, perf_metrics=%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), vc4Var.a()));
                                this.d = System.currentTimeMillis();
                                b(String.format(this.b, "active_conn#%d, started ->", Integer.valueOf(this.e.l.get())));
                            } catch (ConnectException e) {
                                agbVar2.u(0);
                                agbVar2.s(om5.c);
                                agbVar2.t(e, false);
                                if (agbVar2.E != null) {
                                    gm0.x("TTSession", "disableConnProblems", null);
                                    f5h f5hVar = f5h.a;
                                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                }
                                gm0.V(agbVar2.a, "connectToSocket failure!", e);
                            } catch (SocketException e2) {
                                agbVar2.u(0);
                                agbVar2.s(om5.d);
                                agbVar2.t(e2, false);
                                gm0.V(agbVar2.a, "connectToSocket failure!", e2);
                            } catch (UnknownHostException e3) {
                                agbVar2.u(0);
                                agbVar2.s(om5.b);
                                agbVar2.t(e3, false);
                                gm0.V(agbVar2.a, "connectToSocket failure!", e3);
                            } catch (ConnectingCanceledException unused) {
                                agbVar2.u(0);
                                agbVar2.s(om5.a);
                                String str6 = agbVar2.a;
                                a4c a4cVar6 = gm0.f;
                                if (a4cVar6 != null) {
                                    je9 je9Var2 = je9.f;
                                    if (a4cVar6.b(je9Var2)) {
                                        a4cVar6.c(je9Var2, str6, "connectToSocket canceled", null);
                                    }
                                }
                            } catch (Exception e4) {
                                agbVar2.u(0);
                                agbVar2.s(om5.e);
                                agbVar2.t(e4, false);
                                gm0.V(agbVar2.a, "connectToSocket failure!", e4);
                            }
                        }
                    }
                }
                j = -1;
                j2 = -1;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                gm0.s(this.e.a, "%s: %s", this.a, String.format(this.b, "waiting was interrupted in %dms, EXIT", Long.valueOf(System.currentTimeMillis() - this.c)));
            }
        }
        b(String.format(this.b, "finished in %dms <-", Long.valueOf(System.currentTimeMillis() - this.c)));
        agb.b(this.e);
        agb.f(this.e);
    }
}
