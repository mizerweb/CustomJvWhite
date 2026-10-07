package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class clh implements Runnable {
    public final String a;
    public final int b;
    public final zkh c;
    public final InetAddress[] d;
    public final elh e;
    public volatile IOException f;
    public final String g = zo5.h(System.identityHashCode(this), "TcpConnectTask@");

    public clh(String str, int i, zkh zkhVar, InetAddress[] inetAddressArr, elh elhVar) {
        this.a = str;
        this.b = i;
        this.c = zkhVar;
        this.d = inetAddressArr;
        this.e = elhVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027e  */
    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a9 A[Catch: all -> 0x02d3, TryCatch #0 {all -> 0x02d3, blocks: (B:104:0x02a1, B:106:0x02a9, B:107:0x02ab, B:109:0x02b1, B:112:0x02d5), top: B:140:0x02a1 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02d5 A[Catch: all -> 0x02d3, TRY_LEAVE, TryCatch #0 {all -> 0x02d3, blocks: (B:104:0x02a1, B:106:0x02a9, B:107:0x02ab, B:109:0x02b1, B:112:0x02d5), top: B:140:0x02a1 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02db A[EDGE_INSN: B:114:0x02db->B:115:0x02de BREAK  A[LOOP:1: B:107:0x02ab->B:157:?]] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:125:0x0323  */
    /* JADX WARN: Code duplicated, block: B:128:0x0328  */
    /* JADX WARN: Code duplicated, block: B:130:0x0330  */
    /* JADX WARN: Code duplicated, block: B:136:0x0355  */
    /* JADX WARN: Code duplicated, block: B:138:0x035d  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[LOOP:1: B:107:0x02ab->B:157:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0215  */
    /* JADX WARN: Code duplicated, block: B:82:0x021d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0225  */
    /* JADX WARN: Code duplicated, block: B:85:0x0238 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x023a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0241  */
    /* JADX WARN: Code duplicated, block: B:91:0x0249  */
    /* JADX WARN: Code duplicated, block: B:93:0x0269  */
    /* JADX WARN: Code duplicated, block: B:95:0x026f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0276  */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x027e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x02f0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x0330, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:138:0x035d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x01fa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x0225, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x0249, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        String str;
        a4c a4cVar;
        je9 je9Var;
        elh elhVar;
        String str2;
        a4c a4cVar2;
        Socket socket;
        boolean z;
        String str3;
        a4c a4cVar3;
        je9 je9Var2;
        a4c a4cVar4;
        je9 je9Var3;
        AtomicReference atomicReference;
        String str4;
        a4c a4cVar5;
        je9 je9Var4;
        String str5;
        a4c a4cVar6;
        je9 je9Var5;
        String str6;
        a4c a4cVar7;
        je9 je9Var6;
        je9 je9Var7;
        long j;
        String str7 = this.g;
        a4c a4cVar8 = gm0.f;
        if (a4cVar8 != null) {
            je9 je9Var8 = je9.c;
            if (a4cVar8.b(je9Var8)) {
                elh elhVar2 = this.e;
                String name = Thread.currentThread().getName();
                StringBuilder sb = new StringBuilder("run -> ");
                sb.append(this);
                sb.append(" (");
                sb.append(elhVar2);
                sb.append(") on ");
                a4cVar8.c(je9Var8, str7, zo5.w(sb, name, " ..."), null);
            }
        }
        vc4 vc4Var = new vc4(this.e.b);
        long j2 = this.c.b;
        this.e.a.getClass();
        TrafficStats.setThreadStatsTag(Process.myTid());
        long jP = j2;
        int length = 0;
        Socket socketA = null;
        while (socketA == null && this.e.d()) {
            InetAddress inetAddress = this.d[length];
            zkh zkhVar = this.c;
            ew5 ew5Var = (ew5) zkhVar.e.get();
            long jV = 0;
            if (ew5Var != null) {
                j = ew5Var.a;
            } else {
                ghb ghbVar = ew5.b;
                j = 0;
            }
            if (ew5.n(j)) {
                a4c a4cVar9 = gm0.f;
                if (a4cVar9 != null) {
                    je9 je9Var9 = je9.c;
                    if (a4cVar9.b(je9Var9)) {
                        a4cVar9.c(je9Var9, "TcpConnectStrategy.Connect", c0a.o("sleep for ", ew5.t(j), " ..."), null);
                    }
                }
                try {
                    Thread.sleep(ew5.g(j));
                    zkhVar.a();
                    jV = j;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    jV = ew5.v(j);
                }
            } else {
                zkhVar.a();
            }
            if (ew5.n(jV)) {
                if (!this.e.d()) {
                    String str8 = this.g;
                    a4c a4cVar10 = gm0.f;
                    if (a4cVar10 == null) {
                        break;
                    }
                    je9 je9Var10 = je9.f;
                    if (!a4cVar10.b(je9Var10)) {
                        break;
                    }
                    a4cVar10.c(je9Var10, str8, "connect to " + inetAddress + " was canceled", null);
                    break;
                }
                v44 v44VarA = this.e.b.a();
                try {
                    socketA = this.e.a(this.a, this.b, inetAddress, jP, vc4Var);
                } catch (IOException e) {
                    long j3 = ((e2) v44VarA).j();
                    int iD = ew5.d(jP, this.c.a);
                    elh elhVar3 = this.e;
                    if (iD >= 0) {
                        if (!elhVar3.d()) {
                            break;
                        }
                        this.f = e;
                        String str9 = this.g;
                        a4c a4cVar11 = gm0.f;
                        if (a4cVar11 == null) {
                            break;
                        }
                        je9 je9Var11 = je9.f;
                        if (!a4cVar11.b(je9Var11)) {
                            break;
                        }
                        String strT = ew5.t(j3);
                        String strT2 = ew5.t(jP);
                        StringBuilder sb2 = new StringBuilder("failed to connect to ");
                        sb2.append(inetAddress);
                        sb2.append(", timeout=");
                        sb2.append(strT);
                        sb2.append(", expected=");
                        a4cVar11.c(je9Var11, str9, zo5.w(sb2, strT2, ", exit"), null);
                        break;
                        vc4Var.c = vc4Var.a.a();
                        if (socketA != null) {
                            elhVar = this.e;
                            str2 = elhVar.m;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9Var7 = je9.d;
                                if (a4cVar2.b(je9Var7)) {
                                    a4cVar2.c(je9Var7, str2, "handleSocket, " + socketA, null);
                                }
                            }
                            socket = (Socket) elhVar.d.get();
                            if (socket == socketA) {
                                str6 = elhVar.m;
                                a4cVar7 = gm0.f;
                                if (a4cVar7 != null) {
                                    je9Var6 = je9.f;
                                    if (a4cVar7.b(je9Var6)) {
                                        a4cVar7.c(je9Var6, str6, "handleSocket, already has the same " + socket, null);
                                    }
                                }
                            } else if (socket != null) {
                                str5 = elhVar.m;
                                a4cVar6 = gm0.f;
                                if (a4cVar6 != null) {
                                    je9Var5 = je9.f;
                                    if (a4cVar6.b(je9Var5)) {
                                        a4cVar6.c(je9Var5, str5, "handleSocket, already has " + socket + ", close " + socketA, null);
                                    }
                                }
                                elhVar.a.b(socketA);
                            } else if (socketA.isConnected()) {
                                synchronized (elhVar.c) {
                                    try {
                                        if (!elhVar.e.get()) {
                                            z = true;
                                            break;
                                        }
                                        atomicReference = elhVar.d;
                                        while (true) {
                                            if (atomicReference.compareAndSet(null, socketA)) {
                                                vc4 vc4Var2 = elhVar.g;
                                                vc4Var2.e = vc4Var.e;
                                                vc4Var2.f = vc4Var.f;
                                                vc4Var2.g = vc4Var.g;
                                                vc4Var2.h = vc4Var.h;
                                                vc4Var2.i = vc4Var.i;
                                                vc4Var2.d = vc4Var.d;
                                                elhVar.c.notifyAll();
                                                z = false;
                                                break;
                                            }
                                            if (atomicReference.get() != null) {
                                                z = true;
                                                break;
                                            }
                                        }
                                        str3 = elhVar.m;
                                        if (z) {
                                            a4cVar4 = gm0.f;
                                            if (a4cVar4 != null) {
                                                je9Var3 = je9.f;
                                                if (a4cVar4.b(je9Var3)) {
                                                    a4cVar4.c(je9Var3, str3, "handleSocket, already has another " + elhVar.d.get() + " or canceled=" + elhVar.e.get() + ", close " + socketA, null);
                                                }
                                            }
                                            elhVar.a.b(socketA);
                                        } else {
                                            a4cVar3 = gm0.f;
                                            if (a4cVar3 != null) {
                                                je9Var2 = je9.e;
                                                if (a4cVar3.b(je9Var2)) {
                                                    a4cVar3.c(je9Var2, str3, "handleSocket, CONSUMED " + socketA, null);
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else {
                                str4 = elhVar.m;
                                a4cVar5 = gm0.f;
                                if (a4cVar5 != null) {
                                    je9Var4 = je9.f;
                                    if (a4cVar5.b(je9Var4)) {
                                        a4cVar5.c(je9Var4, str4, "handleSocket, " + socketA + " is NOT connected, close " + socketA, null);
                                    }
                                }
                                elhVar.a.b(socketA);
                            }
                        }
                        this.e.a.getClass();
                        TrafficStats.clearThreadStatsTag();
                        str = this.g;
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            return;
                        }
                        je9Var = je9.c;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "<- run, " + this + " (" + this.e + ") on " + Thread.currentThread().getName(), null);
                        }
                    }
                    if (elhVar3.d()) {
                        String str10 = this.g;
                        a4c a4cVar12 = gm0.f;
                        if (a4cVar12 != null) {
                            je9 je9Var12 = je9.f;
                            if (a4cVar12.b(je9Var12)) {
                                a4cVar12.c(je9Var12, str10, "failed to connect to " + inetAddress + ", timeout=" + ew5.t(j3) + ", expected=" + ew5.t(jP), null);
                            }
                        }
                    }
                    length = (length + 1) % this.d.length;
                    socketA = null;
                    jP = ew5.p(jP, this.c.c);
                }
            } else {
                if (ew5.m(jV)) {
                    String str11 = this.g;
                    a4c a4cVar13 = gm0.f;
                    if (a4cVar13 == null) {
                        break;
                    }
                    je9 je9Var13 = je9.f;
                    if (!a4cVar13.b(je9Var13)) {
                        break;
                    }
                    a4cVar13.c(je9Var13, str11, "failed to connect to " + inetAddress + " due to interruption", null);
                    break;
                }
                v44 v44VarA2 = this.e.b.a();
                socketA = this.e.a(this.a, this.b, inetAddress, jP, vc4Var);
            }
        }
        vc4Var.c = vc4Var.a.a();
        if (socketA != null) {
            elhVar = this.e;
            str2 = elhVar.m;
            a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9Var7 = je9.d;
                if (a4cVar2.b(je9Var7)) {
                    a4cVar2.c(je9Var7, str2, "handleSocket, " + socketA, null);
                }
            }
            socket = (Socket) elhVar.d.get();
            if (socket == socketA) {
                str6 = elhVar.m;
                a4cVar7 = gm0.f;
                if (a4cVar7 != null) {
                    je9Var6 = je9.f;
                    if (a4cVar7.b(je9Var6)) {
                        a4cVar7.c(je9Var6, str6, "handleSocket, already has the same " + socket, null);
                    }
                }
            } else if (socket != null) {
                str5 = elhVar.m;
                a4cVar6 = gm0.f;
                if (a4cVar6 != null) {
                    je9Var5 = je9.f;
                    if (a4cVar6.b(je9Var5)) {
                        a4cVar6.c(je9Var5, str5, "handleSocket, already has " + socket + ", close " + socketA, null);
                    }
                }
                elhVar.a.b(socketA);
            } else if (socketA.isConnected()) {
                str4 = elhVar.m;
                a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    je9Var4 = je9.f;
                    if (a4cVar5.b(je9Var4)) {
                        a4cVar5.c(je9Var4, str4, "handleSocket, " + socketA + " is NOT connected, close " + socketA, null);
                    }
                }
                elhVar.a.b(socketA);
            } else {
                synchronized (elhVar.c) {
                    if (!elhVar.e.get()) {
                        z = true;
                        break;
                    }
                    atomicReference = elhVar.d;
                    while (true) {
                        if (atomicReference.compareAndSet(null, socketA)) {
                            vc4 vc4Var3 = elhVar.g;
                            vc4Var3.e = vc4Var.e;
                            vc4Var3.f = vc4Var.f;
                            vc4Var3.g = vc4Var.g;
                            vc4Var3.h = vc4Var.h;
                            vc4Var3.i = vc4Var.i;
                            vc4Var3.d = vc4Var.d;
                            elhVar.c.notifyAll();
                            z = false;
                            break;
                        }
                        if (atomicReference.get() != null) {
                            z = true;
                            break;
                        }
                    }
                }
                str3 = elhVar.m;
                if (z) {
                    a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9Var3 = je9.f;
                        if (a4cVar4.b(je9Var3)) {
                            a4cVar4.c(je9Var3, str3, "handleSocket, already has another " + elhVar.d.get() + " or canceled=" + elhVar.e.get() + ", close " + socketA, null);
                        }
                    }
                    elhVar.a.b(socketA);
                } else {
                    a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9Var2 = je9.e;
                        if (a4cVar3.b(je9Var2)) {
                            a4cVar3.c(je9Var2, str3, "handleSocket, CONSUMED " + socketA, null);
                        }
                    }
                }
            }
        }
        this.e.a.getClass();
        TrafficStats.clearThreadStatsTag();
        str = this.g;
        a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9Var = je9.c;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "<- run, " + this + " (" + this.e + ") on " + Thread.currentThread().getName(), null);
        }
    }

    public final String toString() {
        return this.g + "(" + this.c + "|" + a.h1(this.d, "\n", "addresses=[\n", "\n]", new nre(14), 24) + ")";
    }
}
