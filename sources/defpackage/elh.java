package defpackage;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import kotlin.collections.a;
import one.me.sdk.net.client.api.ConnectingCanceledException;
import one.me.sdk.net.client.impl.internal.SocketFactoryCreateException;
import one.me.sdk.net.client.impl.internal.tcp.TlsConnectTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class elh {
    public final r70 a;
    public final pfh b;
    public final Object c;
    public final AtomicReference d;
    public final AtomicBoolean e;
    public Exception f;
    public final vc4 g;
    public final AtomicReference h;
    public final AtomicInteger i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    public final AtomicBoolean l;
    public final String m;

    public elh(r70 r70Var) {
        this.a = r70Var;
        pfh pfhVar = (pfh) r70Var.b;
        this.b = pfhVar;
        this.c = new Object();
        this.d = new AtomicReference(null);
        this.e = new AtomicBoolean(false);
        this.g = new vc4(pfhVar);
        this.h = new AtomicReference(null);
        this.i = new AtomicInteger(0);
        this.j = new AtomicInteger(0);
        this.k = new AtomicInteger(0);
        this.l = new AtomicBoolean(false);
        this.m = zo5.h(System.identityHashCode(this), "TcpConnector@");
    }

    public final Socket a(String str, int i, InetAddress inetAddress, long j, vc4 vc4Var) throws IOException {
        r70 r70Var = this.a;
        a4c a4cVar = gm0.f;
        Socket socket = null;
        if (a4cVar != null) {
            r70Var.getClass();
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "FastClient", "connectTcp -> " + inetAddress + ":" + i + ", timeout=" + ew5.t(j), null);
            }
        }
        gl6 gl6Var = (gl6) r70Var.d;
        try {
            SocketFactory socketFactory = (SocketFactory) gl6Var.g.computeIfAbsent(str, new mm(2, gl6Var));
            gm0.n("gl6", "createSocket");
            try {
                Socket socketCreateSocket = socketFactory.createSocket();
                if (socketCreateSocket != null) {
                    try {
                        TrafficStats.tagSocket(socketCreateSocket);
                    } catch (IOException e) {
                        e = e;
                        socket = socketCreateSocket;
                        gl6.a(socket);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        socket = socketCreateSocket;
                        gl6.a(socket);
                        throw new IOException("Failed to create socket", th);
                    }
                }
                socketCreateSocket.setKeepAlive(false);
                socketCreateSocket.setTcpNoDelay(true);
                try {
                    v44 v44VarA = ((pfh) r70Var.b).a();
                    vo5 vo5Var = (vo5) r70Var.c;
                    vo5Var.g(str, inetAddress);
                    try {
                        socketCreateSocket.connect(new InetSocketAddress(inetAddress, i), (int) oc9.x(ew5.s(j, lw5.MILLISECONDS), -2147483648L, 2147483647L));
                        vo5Var.f(str, inetAddress, true);
                        vc4Var.f = Math.max(ew5.g(((e2) v44VarA).j()), 0L);
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.e;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, "FastClient", "<- connectTcp, success, " + socketCreateSocket, null);
                            }
                        }
                        if (!(socketCreateSocket instanceof SSLSocket)) {
                            vc4Var.g = Math.max(0L, 0L);
                            String str2 = this.m;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                je9 je9Var3 = je9.e;
                                if (a4cVar3.b(je9Var3)) {
                                    a4cVar3.c(je9Var3, str2, "connectTls, no tls required for " + socketCreateSocket, null);
                                }
                            }
                            return socketCreateSocket;
                        }
                        alh alhVar = c().a;
                        synchronized (this.c) {
                            long jA = alhVar.a();
                            while (d()) {
                                if (!(ew5.g(jA) > 0) || this.l.get()) {
                                    break;
                                }
                                String str3 = this.m;
                                a4c a4cVar4 = gm0.f;
                                if (a4cVar4 != null) {
                                    je9 je9Var4 = je9.c;
                                    if (a4cVar4.b(je9Var4)) {
                                        a4cVar4.c(je9Var4, str3, "connectTls, delay=" + ew5.t(jA) + ", " + alhVar, null);
                                    }
                                }
                                try {
                                    this.c.wait(ew5.g(jA));
                                    jA = alhVar.a();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    this.e.set(true);
                                    String str4 = this.m;
                                    a4c a4cVar5 = gm0.f;
                                    if (a4cVar5 != null) {
                                        je9 je9Var5 = je9.f;
                                        if (a4cVar5.b(je9Var5)) {
                                            a4cVar5.c(je9Var5, str4, "connectTls, thread was interrupted", null);
                                        }
                                    }
                                }
                            }
                            if (!d()) {
                                this.a.b(socketCreateSocket);
                                String str5 = this.m;
                                a4c a4cVar6 = gm0.f;
                                if (a4cVar6 != null) {
                                    je9 je9Var6 = je9.f;
                                    if (a4cVar6.b(je9Var6)) {
                                        a4cVar6.c(je9Var6, str5, "connectTls, cancel, " + socketCreateSocket, null);
                                    }
                                }
                                throw new ConnectException("Canceled.");
                            }
                            alhVar.g = alhVar.a.a();
                            alhVar.h++;
                            this.c.notifyAll();
                        }
                        try {
                            this.a.c(str, (SSLSocket) socketCreateSocket, vc4Var);
                            synchronized (this.c) {
                                alhVar.h--;
                                alhVar.g = alhVar.a.a();
                                this.c.notifyAll();
                            }
                            return socketCreateSocket;
                        } catch (Throwable th2) {
                            synchronized (this.c) {
                                alhVar.h--;
                                alhVar.i++;
                                this.c.notifyAll();
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        vo5Var.f(str, inetAddress, false);
                        throw th3;
                    }
                } catch (IOException e2) {
                    a4c a4cVar7 = gm0.f;
                    if (a4cVar7 != null) {
                        je9 je9Var7 = je9.f;
                        if (a4cVar7.b(je9Var7)) {
                            a4cVar7.c(je9Var7, "FastClient", "<- connectTcp, failed for " + inetAddress + ":" + i + ", timeout=" + ew5.t(j), e2);
                        }
                    }
                    r70Var.b(socketCreateSocket);
                    throw e2;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (SocketFactoryCreateException e4) {
            throw e4.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x032a  */
    /* JADX WARN: Code duplicated, block: B:155:0x036d  */
    /* JADX WARN: Code duplicated, block: B:175:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:177:0x0401  */
    /* JADX WARN: Code duplicated, block: B:180:0x0410  */
    /* JADX WARN: Code duplicated, block: B:182:0x0418  */
    /* JADX WARN: Code duplicated, block: B:186:0x0471  */
    /* JADX WARN: Code duplicated, block: B:188:0x0479  */
    /* JADX WARN: Code duplicated, block: B:191:0x048e  */
    /* JADX WARN: Code duplicated, block: B:259:0x0493 A[EDGE_INSN: B:259:0x0493->B:192:0x0493 BREAK  A[LOOP:1: B:93:0x024b->B:190:0x0488], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:182:0x0418, please report this as an issue */
    public final pq3 b(long j, String str, int i) throws SocketException, UnknownHostException {
        long jO;
        long j2;
        clh[] clhVarArr;
        boolean z;
        boolean z2;
        boolean zD;
        long j3;
        boolean zCompareAndSet;
        clh clhVar;
        String str2;
        a4c a4cVar;
        String str3;
        a4c a4cVar2;
        je9 je9Var;
        je9 je9Var2;
        String str4 = str;
        int i2 = i;
        String str5 = this.m;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null) {
            je9 je9Var3 = je9.c;
            if (a4cVar3.b(je9Var3)) {
                String strT = ew5.t(j);
                StringBuilder sbR = c0a.r(i2, "createConnection -> to ", str4, ":", ", timeout=");
                sbR.append(strT);
                a4cVar3.c(je9Var3, str5, sbR.toString(), null);
            }
        }
        if (this.e.get()) {
            ore.k("Already ABORTED!");
            return null;
        }
        v44 v44VarA = this.b.a();
        vc4 vc4Var = this.g;
        vc4Var.b = vc4Var.a.a();
        String str6 = this.m;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null) {
            je9 je9Var4 = je9.c;
            if (a4cVar4.b(je9Var4)) {
                String strT2 = ew5.t(j);
                StringBuilder sbR2 = c0a.r(i2, "process -> ", str4, ":", ", timeout=");
                sbR2.append(strT2);
                a4cVar4.c(je9Var4, str6, sbR2.toString(), null);
            }
        }
        xp3 xp3VarD = ((vo5) this.a.c).d(str4);
        String str7 = this.m;
        if (xp3VarD == null) {
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null) {
                je9 je9Var5 = je9.f;
                if (a4cVar5.b(je9Var5)) {
                    a4cVar5.c(je9Var5, str7, "<- process, failed to connect to ".concat(str4), null);
                }
            }
            throw new UnknownHostException(c0a.o("Unable to resolve the ", str4, "."));
        }
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null) {
            je9 je9Var6 = je9.c;
            if (a4cVar6.b(je9Var6)) {
                a4cVar6.c(je9Var6, str7, "process, ".concat(a.h1((InetAddress[]) xp3VarD.c, "\n", "addresses=[\n", "\n]", ba.f, 24)), null);
            }
        }
        AtomicReference atomicReference = this.h;
        pfh pfhVar = this.b;
        r70 r70Var = this.a;
        lw5 lw5Var = lw5.SECONDS;
        boolean zE = ((gl6) r70Var.d).a.a.e();
        boolean z3 = r70Var.a;
        if (!(z3 && zE) && z3) {
            ghb ghbVar = ew5.b;
            jO = qe7.O(3, lw5Var);
        } else {
            ghb ghbVar2 = ew5.b;
            jO = qe7.O(1, lw5Var);
        }
        long jO2 = (!(z3 && zE) && z3) ? qe7.O(3, lw5Var) : qe7.O(1, lw5Var);
        lw5 lw5Var2 = lw5.MILLISECONDS;
        alh alhVar = new alh(pfhVar, r70Var, jO, qe7.O(200, lw5Var2), jO2, j);
        long jO3 = qe7.O(1000, lw5Var2);
        long jO4 = qe7.O(200, lw5Var2);
        if (!(z3 && zE) && z3) {
            j2 = j;
        } else {
            long jO5 = qe7.O(3000, lw5Var2);
            j2 = jO5;
        }
        atomicReference.set(new blh(alhVar, new zkh(j, j2, jO3, jO4), zE));
        InetAddress[] inetAddressArr = (InetAddress[]) xp3VarD.c;
        zkh zkhVar = c().b;
        int iOrdinal = ((gl6) this.a.d).a.d.a().ordinal();
        boolean z4 = false;
        if (iOrdinal == 0 || iOrdinal == 2) {
            String str8 = this.m;
            a4c a4cVar7 = gm0.f;
            if (a4cVar7 != null) {
                je9 je9Var7 = je9.f;
                if (a4cVar7.b(je9Var7)) {
                    a4cVar7.c(je9Var7, str8, "createTasks, connection type is LOW", null);
                }
            }
            int length = inetAddressArr.length;
            clhVarArr = new clh[length];
            for (int i3 = 0; i3 < length; i3++) {
                clhVarArr[i3] = new clh(str, i, zkhVar, inetAddressArr, this);
            }
        } else {
            String str9 = this.m;
            a4c a4cVar8 = gm0.f;
            if (a4cVar8 != null) {
                je9 je9Var8 = je9.e;
                if (a4cVar8.b(je9Var8)) {
                    a4cVar8.c(je9Var8, str9, "createTasks, connection type is NORMAL or FAST", null);
                }
            }
            int length2 = inetAddressArr.length;
            clhVarArr = new clh[length2];
            int i4 = 0;
            while (i4 < length2) {
                hj8 hj8Var = new hj8(i4, i4, 1);
                clhVarArr[i4] = new clh(str4, i2, zkhVar, (InetAddress[]) (hj8Var.isEmpty() ? a.U0(inetAddressArr, 0, 0) : a.U0(inetAddressArr, i4, hj8Var.b + 1)), this);
                i4++;
                str4 = str;
                i2 = i;
            }
        }
        clh[] clhVarArr2 = clhVarArr;
        String str10 = this.m;
        a4c a4cVar9 = gm0.f;
        if (a4cVar9 != null) {
            je9 je9Var9 = je9.c;
            if (a4cVar9.b(je9Var9)) {
                a4cVar9.c(je9Var9, str10, "process, ".concat(a.h1(clhVarArr2, "\n", "tasks=[\n", "\n]", ba.g, 24)), null);
            }
        }
        blh blhVarC = c();
        String str11 = this.m;
        a4c a4cVar10 = gm0.f;
        if (a4cVar10 != null) {
            je9 je9Var10 = je9.d;
            if (a4cVar10.b(je9Var10)) {
                a4cVar10.c(je9Var10, str11, "process, using strategy=" + blhVarC, null);
            }
        }
        this.k.set(clhVarArr2.length);
        this.i.set(0);
        this.j.set(0);
        ghb ghbVar3 = ew5.b;
        long jD = 0;
        while (true) {
            if (d()) {
                if (this.j.get() == 0) {
                    zD = d();
                } else {
                    v44 v44VarA2 = this.b.a();
                    synchronized (this.c) {
                        long jZ0 = jD;
                        while (true) {
                            try {
                                AtomicInteger atomicInteger = this.i;
                                if (!d() || atomicInteger.get() == this.k.get() || atomicInteger.get() == this.j.get() || this.l.get()) {
                                    v44VarA = v44VarA;
                                    clhVarArr2 = clhVarArr2;
                                    break;
                                }
                                try {
                                    ew5 ew5VarE = e();
                                    if (ew5VarE != null) {
                                        ew5 ew5Var = new ew5(jZ0);
                                        if (ew5Var.compareTo(ew5VarE) > 0) {
                                            ew5Var = ew5VarE;
                                        }
                                        long j4 = ew5Var.a;
                                        String str12 = this.m;
                                        a4c a4cVar11 = gm0.f;
                                        if (a4cVar11 == null) {
                                            v44VarA = v44VarA;
                                        } else {
                                            v44VarA = v44VarA;
                                            je9 je9Var11 = je9.c;
                                            if (a4cVar11.b(je9Var11)) {
                                                j3 = j4;
                                                a4cVar11.c(je9Var11, str12, "waitForSocket, max delay=" + ew5.t(ew5VarE.a) + ", remaining delay=" + ew5.t(j3), null);
                                            }
                                            jZ0 = j3;
                                        }
                                        j3 = j4;
                                        jZ0 = j3;
                                    } else {
                                        v44VarA = v44VarA;
                                        clhVarArr2 = clhVarArr2;
                                    }
                                    if (!(ew5.g(jZ0) > 0)) {
                                        break;
                                    }
                                    try {
                                        this.c.wait(ew5.g(jZ0));
                                        jZ0 = yab.z0(v44VarA2, jD);
                                        String str13 = this.m;
                                        a4c a4cVar12 = gm0.f;
                                        if (a4cVar12 != null) {
                                            je9 je9Var12 = je9.c;
                                            if (a4cVar12.b(je9Var12)) {
                                                a4cVar12.c(je9Var12, str13, "waitForSocket, remaining delay=" + ew5.t(jZ0), null);
                                            }
                                        }
                                        v44VarA = v44VarA;
                                        v44VarA2 = v44VarA2;
                                        clhVarArr2 = clhVarArr2;
                                    } catch (InterruptedException e) {
                                        this.f = e;
                                        z = true;
                                    }
                                } catch (SocketTimeoutException e2) {
                                    v44VarA = v44VarA;
                                    clhVarArr2 = clhVarArr2;
                                    this.f = e2;
                                    z = false;
                                    z2 = true;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        z = false;
                        z2 = false;
                    }
                    String str14 = this.m;
                    a4c a4cVar13 = gm0.f;
                    if (a4cVar13 != null) {
                        je9 je9Var13 = je9.d;
                        if (a4cVar13.b(je9Var13)) {
                            boolean zD2 = d();
                            boolean z5 = this.l.get();
                            int i5 = this.k.get();
                            int i6 = this.j.get();
                            int i7 = this.i.get();
                            StringBuilder sbB = zo5.B("\n                waitForSocket, exit:\n                  is_interrupted_due_max_timeout=", z2, "\n                  is_thread_interrupted=", z, "\n                  can_connect=");
                            qt4.B("\n                  force_connect=", "\n                  total_tasks=", sbB, zD2, z5);
                            qt4.x(i5, i6, "\n                  launched_tasks=", "\n                  finished_tasks=", sbB);
                            sbB.append(i7);
                            sbB.append("\n                ");
                            a4cVar13.c(je9Var13, str14, s5h.x0(sbB.toString()), null);
                        }
                    }
                    if (z2 || z) {
                        synchronized (this.c) {
                            this.e.set(true);
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    zD = d() && this.i.get() != this.k.get();
                }
                if (zD) {
                    break;
                }
                if (this.j.get() != this.k.get()) {
                    clhVar = clhVarArr2[this.j.get()];
                    str2 = this.m;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var2 = je9.d;
                        if (a4cVar.b(je9Var2)) {
                            a4cVar.c(je9Var2, str2, "process, create thread for " + clhVar, null);
                        }
                    }
                    ((tih) ((gl6) this.a.d).i.a).a("fast-connect").newThread(new o90(this, 23, clhVar)).start();
                    this.l.set(false);
                    alh alhVar2 = blhVarC.a;
                    int iAddAndGet = this.j.addAndGet(1);
                    r70 r70Var2 = alhVar2.b;
                    ew5 ew5Var2 = new ew5(alhVar2.c);
                    r70Var2.getClass();
                    jD = r70.d(iAddAndGet, ew5Var2, null);
                    str3 = this.m;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9Var = je9.c;
                        if (a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str3, "process, nextConnectDelay=".concat(ew5.t(jD)), null);
                        }
                    }
                } else {
                    jD = jD;
                }
                clhVarArr2 = clhVarArr2;
                z4 = false;
            } else {
                zD = z4;
            }
            clhVarArr2 = clhVarArr2;
            if (zD) {
                break;
                break;
            }
            if (this.j.get() != this.k.get()) {
                clhVar = clhVarArr2[this.j.get()];
                str2 = this.m;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var2 = je9.d;
                    if (a4cVar.b(je9Var2)) {
                        a4cVar.c(je9Var2, str2, "process, create thread for " + clhVar, null);
                    }
                }
                ((tih) ((gl6) this.a.d).i.a).a("fast-connect").newThread(new o90(this, 23, clhVar)).start();
                this.l.set(false);
                alh alhVar3 = blhVarC.a;
                int iAddAndGet2 = this.j.addAndGet(1);
                r70 r70Var3 = alhVar3.b;
                ew5 ew5Var3 = new ew5(alhVar3.c);
                r70Var3.getClass();
                jD = r70.d(iAddAndGet2, ew5Var3, null);
                str3 = this.m;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9Var = je9.c;
                    if (a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str3, "process, nextConnectDelay=".concat(ew5.t(jD)), null);
                    }
                }
            } else {
                jD = jD;
            }
            clhVarArr2 = clhVarArr2;
            z4 = false;
        }
        vc4 vc4Var2 = this.g;
        long j5 = xp3VarD.b;
        vc4Var2.getClass();
        vc4Var2.e = Math.max(j5, 0L);
        String str15 = this.m;
        a4c a4cVar14 = gm0.f;
        if (a4cVar14 != null) {
            je9 je9Var14 = je9.d;
            if (a4cVar14.b(je9Var14)) {
                a4cVar14.c(je9Var14, str15, nbh.u("<- process, (", this.i.get(), "/", this.j.get(), " thread(s) finished)"), null);
            }
        }
        vc4 vc4Var3 = this.g;
        vc4Var3.h = str;
        vc4Var3.i = i;
        synchronized (this.c) {
            zCompareAndSet = this.e.compareAndSet(false, true);
        }
        Socket socket = (Socket) this.d.getAndSet(null);
        if (socket != null) {
            vc4 vc4Var4 = this.g;
            vc4Var4.c = vc4Var4.a.a();
            String str16 = this.m;
            a4c a4cVar15 = gm0.f;
            if (a4cVar15 != null) {
                je9 je9Var15 = je9.c;
                if (a4cVar15.b(je9Var15)) {
                    a4cVar15.c(je9Var15, str16, "<- createConnection, WIN/" + ew5.t(((e2) v44VarA).j()) + " " + socket, null);
                }
            }
            return new pq3(socket, this.g);
        }
        if (!zCompareAndSet && this.f == null) {
            throw new ConnectingCanceledException("Connecting was canceled.");
        }
        if (!zCompareAndSet) {
            SocketException socketException = new SocketException(c0a.l(i, "Failed to connect to ", str, ":", "."));
            socketException.initCause(this.f);
            String str17 = this.m;
            a4c a4cVar16 = gm0.f;
            if (a4cVar16 == null) {
                throw socketException;
            }
            je9 je9Var16 = je9.f;
            if (!a4cVar16.b(je9Var16)) {
                throw socketException;
            }
            a4cVar16.c(je9Var16, str17, nbh.r(i, "<- createConnection, failed to connect to ", str, ":"), null);
            throw socketException;
        }
        SocketException socketException2 = new SocketException(c0a.l(i, "Failed to connect to ", str, ":", "."));
        clh[] clhVarArr3 = clhVarArr2;
        int length3 = clhVarArr3.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length3) {
                socketException2.initCause(new SocketTimeoutException(zo5.w(c0a.r(i, "Connect to ", str, ":", " failed after "), ew5.t(((e2) v44VarA).j()), ".")));
                break;
            }
            if (!(clhVarArr3[i8].f instanceof SocketTimeoutException)) {
                break;
            }
            i8++;
        }
        String str18 = this.m;
        a4c a4cVar17 = gm0.f;
        if (a4cVar17 == null) {
            throw socketException2;
        }
        je9 je9Var17 = je9.f;
        if (!a4cVar17.b(je9Var17)) {
            throw socketException2;
        }
        a4cVar17.c(je9Var17, str18, nbh.r(i, "<- createConnection, failed to connect to ", str, ":"), null);
        throw socketException2;
    }

    public final blh c() {
        Object obj = this.h.get();
        if (obj != null) {
            return (blh) obj;
        }
        ore.k("Tcp connect strategy is required!");
        return null;
    }

    public final boolean d() {
        return !this.e.get() && this.d.get() == null;
    }

    public final ew5 e() throws TlsConnectTimeoutException {
        ew5 ew5Var = null;
        if (!((Boolean) ((gl6) this.a.d).k.invoke()).booleanValue() || this.j.get() != this.k.get()) {
            return null;
        }
        alh alhVar = c().a;
        int i = alhVar.h;
        long j = alhVar.f;
        if (i > 0) {
            v44 v44Var = alhVar.g;
            if (v44Var == null) {
                ore.p("Required value was null.");
                return null;
            }
            ew5Var = new ew5(yab.z0(v44Var, j));
        }
        ghb ghbVar = ew5.b;
        if (ew5Var == null ? false : ew5.f(ew5Var.a, 0L)) {
            throw new TlsConnectTimeoutException(j);
        }
        return ew5Var;
    }

    public final String toString() {
        int i = this.k.get();
        int i2 = this.j.get();
        int i3 = this.i.get();
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append("(t=");
        sb.append(i);
        sb.append("|lt=");
        sb.append(i2);
        return zo5.v(sb, "|ft=", i3);
    }
}
