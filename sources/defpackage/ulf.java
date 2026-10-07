package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import ru.ok.tamtam.exception.TaskSyncChatHistoryMaxIterationsException;
import ru.ok.tamtam.messages.ChatException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes.dex */
public final class ulf extends mjf implements btc {
    public final long b;
    public final long c;
    public final int d;
    public final mg5 e;
    public final String f;
    public int g;

    public ulf(long j, long j2, int i, mg5 mg5Var) {
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = mg5Var;
        String strName = mg5Var.name();
        StringBuilder sbS = qt4.s(j, "TaskSyncChatHistory(#", ",");
        qv1.s(j2, ",", strName, sbS);
        sbS.append(")");
        this.f = sbS.toString();
        this.g = -1;
    }

    @Override // defpackage.mjf
    public final void B() {
        if (F()) {
            return;
        }
        E();
    }

    public final boolean C() {
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        return ((Boolean) ((zed) njfVar.e.getValue()).b.a().a.z3.a(e5d.S6[235]).i()).booleanValue();
    }

    public final boolean D() {
        je9 je9Var = je9.f;
        rt2 rt2VarN = c().N(this.c);
        if (rt2VarN == null) {
            String str = this.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "needToProcessChat: chat is null!", null);
                return false;
            }
        } else {
            if ((rt2VarN.W() || rt2VarN.o0()) && rt2VarN.C0() && rt2VarN.b.g()) {
                return true;
            }
            String str2 = this.f;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "needToProcessChat: #" + rt2VarN.A() + ", chat.data.status=" + rt2VarN.b.c + ", chat.isSelfParticipant=" + rt2VarN.C0() + ",isSavedMessagesChat=" + c().V(rt2VarN), null);
            }
        }
        return false;
    }

    public final void E() {
        gm0.n(this.f, "tryToRemoveTask");
        long j = this.b;
        if (j > 0) {
            u().d(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x031c  */
    /* JADX WARN: Code duplicated, block: B:147:0x033b  */
    /* JADX WARN: Code duplicated, block: B:172:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:180:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:188:0x0424  */
    /* JADX WARN: Code duplicated, block: B:190:0x0428  */
    /* JADX WARN: Code duplicated, block: B:195:0x0441  */
    /* JADX WARN: Code duplicated, block: B:199:0x044f  */
    /* JADX WARN: Code duplicated, block: B:214:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x03df A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final boolean F() {
        fda fdaVar;
        ArrayList arrayListJ;
        ArrayList arrayListE;
        fda fdaVar2;
        nx2 nx2Var;
        long jT;
        Iterator it;
        int i;
        long j;
        njf njfVar;
        int i2;
        ex2 ex2Var;
        String string;
        je9 je9Var = je9.d;
        gm0.n(this.f, "tryToSync start");
        boolean z = false;
        if (!D()) {
            gm0.x(this.f, "no need to process chat", null);
            return false;
        }
        njf njfVar2 = this.a;
        if (njfVar2 == null) {
            njfVar2 = null;
        }
        this.g = ((Number) ((g5d) ((gjf) njfVar2.f.getValue())).a.u3.a(e5d.S6[230]).i()).intValue();
        if (this.b > 0 && C()) {
            xkh xkhVarB = u().c().b();
            ch3.G(xkhVarB.a, false, true, new wkh(g(), xkhVarB, this.b));
        }
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            int i3 = this.g;
            if (i3 == -1) {
                string = "WarmOptions.All";
            } else {
                StringBuilder sb = new StringBuilder("WarmOptions{value=");
                sb.append(i3);
                sb.append(',');
                if (i3 == -1 || (i3 & 1) != 0) {
                    sb.append("checkReadmarkChunk,");
                }
                if (i3 == -1 || (i3 & 2) != 0) {
                    sb.append("checkBackwardSync,");
                }
                if (i3 == -1 || (i3 & 4) != 0) {
                    sb.append("checkForwardSync,");
                }
                if (i3 == -1 || (i3 & 8) != 0) {
                    sb.append("checkBackwardLastMessageSync");
                }
                sb.append('}');
                string = sb.toString();
            }
            a4cVar.c(je9Var, str, "tryToSync: warmOptions=".concat(string), null);
        }
        String str2 = this.f;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, zo5.j(this.c, "syncMessages: id="), null);
        }
        rt2 rt2VarN = c().N(this.c);
        if (rt2VarN == null) {
            String str3 = this.f;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str3, "syncMessages: chat is null!", null);
                }
            }
        } else if (rt2VarN.a0()) {
            gm0.n(this.f, "current chat is blocked, try to get history from last event time (probably, it's equals to last message time");
            iz2 iz2VarF = f();
            long j2 = rt2VarN.a;
            nx2 nx2Var2 = rt2VarN.b;
            iz2.b(iz2VarF, j2, nx2Var2.a, nx2Var2.k, 0L, 0L, this.e, false);
            njf njfVar3 = this.a;
            if (njfVar3 == null) {
                njfVar3 = null;
            }
            njfVar3.b().a(5, Float.NaN);
        } else {
            fda fdaVar3 = rt2VarN.c;
            if (fdaVar3 != null && fdaVar3.a.h != this.c) {
                ((s7f) m()).E(true);
                gm0.V(this.f, "CRITICAL SITUATION: chat.lastMessage.data.chatId != chatId serverId = " + rt2VarN.b.a + " chat = " + rt2VarN + " lastMessage = " + rt2VarN.c, new ChatException.WrongLastMessage(rt2VarN.a, rt2VarN.c.a));
            }
            int iOrdinal = this.e.ordinal();
            if (iOrdinal == 0) {
                long jZ = rt2VarN.z();
                fda fdaVar4 = rt2VarN.c;
                if (fdaVar4 != null) {
                    long j3 = fdaVar4.a.c;
                    if (jZ > j3) {
                        jZ = j3;
                    }
                }
                ex2 ex2Var2 = (ex2) sb8.w(jZ, rt2VarN.b.n.e(this.e)).b;
                String str4 = this.f;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, str4, qv1.l("syncMessages: readMark=", vd7.K(Long.valueOf(jZ)), ", chunk=", sb8.b0(ex2Var2)), null);
                }
                if (ex2Var2 == null) {
                    long jT2 = rt2VarN.t(jZ, this.e);
                    gm0.n(this.f, "checkReadmarkChunk: chunk is null, request from readmark back and forth");
                    iz2 iz2VarF2 = f();
                    long j4 = rt2VarN.a;
                    long j5 = rt2VarN.b.a;
                    int i4 = this.g;
                    iz2.b(iz2VarF2, j4, j5, jZ, jT2, (i4 != -1 && (i4 & 1) == 0) ? 0L : this.b, this.e, false);
                    njf njfVar4 = this.a;
                    if (njfVar4 == null) {
                        njfVar4 = null;
                    }
                    njfVar4.b().a(1, Float.NaN);
                    int i5 = this.g;
                    if (i5 != -1 && (i5 & 1) == 0) {
                        E();
                    }
                    z = true;
                } else {
                    String str5 = this.f;
                    mg5 mg5Var = mg5.REGULAR;
                    long jT3 = rt2VarN.t(jZ, mg5Var);
                    nx2 nx2Var3 = rt2VarN.b;
                    long j6 = jZ;
                    ArrayList arrayListJ2 = r().j(rt2VarN.a, ex2Var2.a, j6, true, mg5Var);
                    if (arrayListJ2.isEmpty() || arrayListJ2.size() >= 40) {
                        fdaVar = rt2VarN.c;
                        nx2 nx2Var4 = rt2VarN.b;
                        if (fdaVar == null && fdaVar.a.c == j6) {
                            arrayListE = rt2VarN.b.n.e(mg5.REGULAR);
                            fdaVar2 = rt2VarN.c;
                            nx2Var = rt2VarN.b;
                            if (fdaVar2 != null) {
                                jT = rt2VarN.t(fdaVar2.a.c, this.e);
                                it = arrayListE.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        ex2Var = (ex2) it.next();
                                        if (sb8.S(fdaVar2.a.c, ex2Var)) {
                                        }
                                    } else {
                                        gm0.n(this.f, "checkBackwardLastMessageSync: newMessages = " + nx2Var.m);
                                        iz2 iz2VarF3 = f();
                                        long j7 = rt2VarN.a;
                                        long j8 = nx2Var.a;
                                        long j9 = fdaVar2.a.c;
                                        i = this.g;
                                        if (i == -1) {
                                            j = this.b;
                                        } else {
                                            j = 0;
                                        }
                                        iz2.c(iz2VarF3, j7, j8, j9, jT, j, this.e);
                                        njfVar = this.a;
                                        if (njfVar == null) {
                                            njfVar = null;
                                        }
                                        njfVar.b().a(4, Float.NaN);
                                        i2 = this.g;
                                        if (i2 != -1) {
                                            E();
                                        }
                                        z = true;
                                    }
                                }
                            }
                            gm0.x(this.f, "skip sync", null);
                        } else {
                            qfa qfaVarR = r();
                            long j10 = rt2VarN.a;
                            long j11 = ex2Var2.b;
                            mg5 mg5Var2 = mg5.REGULAR;
                            arrayListJ = qfaVarR.j(j10, j6, j11, false, mg5Var2);
                            if (!arrayListJ.isEmpty() || arrayListJ.size() >= 40 || fdaVar == null || sb8.S(fdaVar.a.c, ex2Var2)) {
                                arrayListE = rt2VarN.b.n.e(mg5.REGULAR);
                                fdaVar2 = rt2VarN.c;
                                nx2Var = rt2VarN.b;
                                if (fdaVar2 != null && nx2Var.m >= 40) {
                                    jT = rt2VarN.t(fdaVar2.a.c, this.e);
                                    it = arrayListE.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            ex2Var = (ex2) it.next();
                                            if (sb8.S(fdaVar2.a.c, ex2Var) || ex2Var.a == ex2Var.b) {
                                            }
                                        } else {
                                            gm0.n(this.f, "checkBackwardLastMessageSync: newMessages = " + nx2Var.m);
                                            iz2 iz2VarF4 = f();
                                            long j12 = rt2VarN.a;
                                            long j13 = nx2Var.a;
                                            long j14 = fdaVar2.a.c;
                                            i = this.g;
                                            if (i == -1 && (i & 8) == 0) {
                                                j = 0;
                                            } else {
                                                j = this.b;
                                            }
                                            iz2.c(iz2VarF4, j12, j13, j14, jT, j, this.e);
                                            njfVar = this.a;
                                            if (njfVar == null) {
                                                njfVar = null;
                                            }
                                            njfVar.b().a(4, Float.NaN);
                                            i2 = this.g;
                                            if (i2 != -1 && (i2 & 8) == 0) {
                                                E();
                                            }
                                        }
                                    }
                                }
                                gm0.x(this.f, "skip sync", null);
                            } else {
                                gm0.m(this.f, "checkForwardSync: after.size = %d, chunks = %s, lastMessage = %s", Integer.valueOf(arrayListJ.size()), sb8.c0(nx2Var4.n.e(mg5Var2)), fdaVar);
                                long j15 = ((sfa) arrayListJ.get(arrayListJ.size() - 1)).c;
                                iz2 iz2VarF5 = f();
                                long j16 = rt2VarN.a;
                                long j17 = nx2Var4.a;
                                int i6 = this.g;
                                iz2.a(iz2VarF5, j16, j17, j15, (i6 != -1 && (i6 & 4) == 0) ? 0L : this.b, mg5Var2);
                                njf njfVar5 = this.a;
                                if (njfVar5 == null) {
                                    njfVar5 = null;
                                }
                                njfVar5.b().a(3, Float.NaN);
                                int i7 = this.g;
                                if (i7 != -1 && (i7 & 4) == 0) {
                                    E();
                                }
                            }
                            z = true;
                        }
                    } else {
                        Iterator it2 = arrayListJ2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                sfa sfaVar = (sfa) arrayListJ2.get(0);
                                long j18 = sfaVar.c;
                                Integer numValueOf = Integer.valueOf(arrayListJ2.size());
                                String strK = vd7.K(Long.valueOf(j18));
                                String strK2 = vd7.K(Long.valueOf(jT3));
                                Long lValueOf = Long.valueOf(nx2Var3.y);
                                fx2 fx2Var = nx2Var3.n;
                                mg5 mg5Var3 = mg5.REGULAR;
                                gm0.m(str5, "checkBackwardSync: before.size = %d, from = %s, backward = %s, chat.data.firstMessageId = %d, firstInHistory = %s, chunks = %s", numValueOf, strK, strK2, lValueOf, sfaVar, sb8.c0(fx2Var.e(mg5Var3)));
                                iz2 iz2VarF6 = f();
                                long j19 = rt2VarN.a;
                                long j20 = nx2Var3.a;
                                int i8 = this.g;
                                iz2.c(iz2VarF6, j19, j20, j18, jT3, (i8 != -1 && (i8 & 2) == 0) ? 0L : this.b, mg5Var3);
                                njf njfVar6 = this.a;
                                if (njfVar6 == null) {
                                    njfVar6 = null;
                                }
                                njfVar6.b().a(2, Float.NaN);
                                int i9 = this.g;
                                if (i9 != -1 && (i9 & 2) == 0) {
                                    E();
                                }
                            } else if (((sfa) it2.next()).a == nx2Var3.y) {
                                gm0.n(str5, "checkBackwardSync: first chat message exists in backward history, stop syncing");
                                fdaVar = rt2VarN.c;
                                nx2 nx2Var5 = rt2VarN.b;
                                if (fdaVar == null) {
                                    qfa qfaVarR2 = r();
                                    long j110 = rt2VarN.a;
                                    long j111 = ex2Var2.b;
                                    mg5 mg5Var4 = mg5.REGULAR;
                                    arrayListJ = qfaVarR2.j(j110, j6, j111, false, mg5Var4);
                                    if (arrayListJ.isEmpty()) {
                                        arrayListE = rt2VarN.b.n.e(mg5.REGULAR);
                                        fdaVar2 = rt2VarN.c;
                                        nx2Var = rt2VarN.b;
                                        if (fdaVar2 != null) {
                                            jT = rt2VarN.t(fdaVar2.a.c, this.e);
                                            it = arrayListE.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    ex2Var = (ex2) it.next();
                                                    if (sb8.S(fdaVar2.a.c, ex2Var)) {
                                                    }
                                                } else {
                                                    gm0.n(this.f, "checkBackwardLastMessageSync: newMessages = " + nx2Var.m);
                                                    iz2 iz2VarF7 = f();
                                                    long j112 = rt2VarN.a;
                                                    long j113 = nx2Var.a;
                                                    long j114 = fdaVar2.a.c;
                                                    i = this.g;
                                                    if (i == -1) {
                                                        j = this.b;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    iz2.c(iz2VarF7, j112, j113, j114, jT, j, this.e);
                                                    njfVar = this.a;
                                                    if (njfVar == null) {
                                                        njfVar = null;
                                                    }
                                                    njfVar.b().a(4, Float.NaN);
                                                    i2 = this.g;
                                                    if (i2 != -1) {
                                                        E();
                                                    }
                                                }
                                            }
                                        }
                                        gm0.x(this.f, "skip sync", null);
                                    } else {
                                        arrayListE = rt2VarN.b.n.e(mg5.REGULAR);
                                        fdaVar2 = rt2VarN.c;
                                        nx2Var = rt2VarN.b;
                                        if (fdaVar2 != null) {
                                            jT = rt2VarN.t(fdaVar2.a.c, this.e);
                                            it = arrayListE.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    ex2Var = (ex2) it.next();
                                                    if (sb8.S(fdaVar2.a.c, ex2Var)) {
                                                    }
                                                } else {
                                                    gm0.n(this.f, "checkBackwardLastMessageSync: newMessages = " + nx2Var.m);
                                                    iz2 iz2VarF8 = f();
                                                    long j115 = rt2VarN.a;
                                                    long j116 = nx2Var.a;
                                                    long j117 = fdaVar2.a.c;
                                                    i = this.g;
                                                    if (i == -1) {
                                                        j = this.b;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    iz2.c(iz2VarF8, j115, j116, j117, jT, j, this.e);
                                                    njfVar = this.a;
                                                    if (njfVar == null) {
                                                        njfVar = null;
                                                    }
                                                    njfVar.b().a(4, Float.NaN);
                                                    i2 = this.g;
                                                    if (i2 != -1) {
                                                        E();
                                                    }
                                                }
                                            }
                                        }
                                        gm0.x(this.f, "skip sync", null);
                                    }
                                } else {
                                    qfa qfaVarR3 = r();
                                    long j118 = rt2VarN.a;
                                    long j119 = ex2Var2.b;
                                    mg5 mg5Var5 = mg5.REGULAR;
                                    arrayListJ = qfaVarR3.j(j118, j6, j119, false, mg5Var5);
                                    if (arrayListJ.isEmpty()) {
                                        arrayListE = rt2VarN.b.n.e(mg5.REGULAR);
                                        fdaVar2 = rt2VarN.c;
                                        nx2Var = rt2VarN.b;
                                        if (fdaVar2 != null) {
                                            jT = rt2VarN.t(fdaVar2.a.c, this.e);
                                            it = arrayListE.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    ex2Var = (ex2) it.next();
                                                    if (sb8.S(fdaVar2.a.c, ex2Var)) {
                                                    }
                                                } else {
                                                    gm0.n(this.f, "checkBackwardLastMessageSync: newMessages = " + nx2Var.m);
                                                    iz2 iz2VarF9 = f();
                                                    long j1110 = rt2VarN.a;
                                                    long j1111 = nx2Var.a;
                                                    long j1112 = fdaVar2.a.c;
                                                    i = this.g;
                                                    if (i == -1) {
                                                        j = this.b;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    iz2.c(iz2VarF9, j1110, j1111, j1112, jT, j, this.e);
                                                    njfVar = this.a;
                                                    if (njfVar == null) {
                                                        njfVar = null;
                                                    }
                                                    njfVar.b().a(4, Float.NaN);
                                                    i2 = this.g;
                                                    if (i2 != -1) {
                                                        E();
                                                    }
                                                }
                                            }
                                        }
                                        gm0.x(this.f, "skip sync", null);
                                    } else {
                                        arrayListE = rt2VarN.b.n.e(mg5.REGULAR);
                                        fdaVar2 = rt2VarN.c;
                                        nx2Var = rt2VarN.b;
                                        if (fdaVar2 != null) {
                                            jT = rt2VarN.t(fdaVar2.a.c, this.e);
                                            it = arrayListE.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    ex2Var = (ex2) it.next();
                                                    if (sb8.S(fdaVar2.a.c, ex2Var)) {
                                                    }
                                                } else {
                                                    gm0.n(this.f, "checkBackwardLastMessageSync: newMessages = " + nx2Var.m);
                                                    iz2 iz2VarF10 = f();
                                                    long j1113 = rt2VarN.a;
                                                    long j1114 = nx2Var.a;
                                                    long j1115 = fdaVar2.a.c;
                                                    i = this.g;
                                                    if (i == -1) {
                                                        j = this.b;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    iz2.c(iz2VarF10, j1113, j1114, j1115, jT, j, this.e);
                                                    njfVar = this.a;
                                                    if (njfVar == null) {
                                                        njfVar = null;
                                                    }
                                                    njfVar.b().a(4, Float.NaN);
                                                    i2 = this.g;
                                                    if (i2 != -1) {
                                                        E();
                                                    }
                                                }
                                            }
                                        }
                                        gm0.x(this.f, "skip sync", null);
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                }
            } else if (iOrdinal != 1) {
                ore.o();
                return false;
            }
        }
        String str6 = this.f;
        a4c a4cVar5 = gm0.f;
        if (a4cVar5 != null && a4cVar5.b(je9Var)) {
            long j21 = this.b;
            long j22 = this.c;
            mg5 mg5Var6 = this.e;
            int i10 = this.d;
            StringBuilder sbS = qt4.s(j21, "tryToSync: taskId=", ", chatId=");
            sbS.append(j22);
            sbS.append(",itemType=");
            sbS.append(mg5Var6);
            sbS.append(",needSyncMessage=");
            sbS.append(z);
            sbS.append(",count=");
            sbS.append(i10);
            a4cVar5.c(je9Var, str6, sbS.toString(), null);
        }
        return z;
    }

    @Override // defpackage.btc
    public final void d() {
        E();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ulf.class.equals(obj.getClass())) {
            ulf ulfVar = (ulf) obj;
            if (this.c == ulfVar.c && this.e == ulfVar.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.SyncChatHistory syncChatHistory = new Tasks.SyncChatHistory();
        syncChatHistory.taskId = this.b;
        syncChatHistory.chatId = this.c;
        syncChatHistory.count = this.d;
        syncChatHistory.itemTypeId = this.e.a;
        gm0.n(this.f, "toByteArray");
        return sia.toByteArray(syncChatHistory);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_SYNC_CHAT_HISTORY;
    }

    public final int hashCode() {
        int iHashCode = ulf.class.getName().hashCode() * 31;
        long j = this.c;
        return this.e.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    @Override // defpackage.btc
    public final atc j() {
        nx2 nx2Var;
        String str = this.f;
        gm0.n(str, "onPreExecute");
        njf njfVar = this.a;
        Long lValueOf = null;
        if (njfVar == null) {
            njfVar = null;
        }
        boolean zB = njfVar.a().b();
        atc atcVar = atc.c;
        if (zB) {
            njf njfVar2 = this.a;
            if (njfVar2 == null) {
                njfVar2 = null;
            }
            boolean zD = njfVar2.e().d();
            atc atcVar2 = atc.b;
            if (!zD) {
                return atcVar2;
            }
            if (D()) {
                if (this.d + 1 <= 10) {
                    xkh xkhVarB = u().c().b();
                    if (((Number) ch3.G(xkhVarB.a, true, false, new u8h(7, xkhVarB))).intValue() <= 0) {
                        return atc.a;
                    }
                    gm0.n(str, "hasProcessingTask, skip");
                    return atcVar2;
                }
                rt2 rt2VarN = c().N(this.c);
                if (rt2VarN != null && (nx2Var = rt2VarN.b) != null) {
                    lValueOf = Long.valueOf(nx2Var.a);
                }
                gm0.V(str, "MAX_ITERATION_COUNT reached", new TaskSyncChatHistoryMaxIterationsException(lValueOf));
                return atcVar;
            }
        }
        return atcVar;
    }

    @Override // defpackage.mjf
    public final xt4 n(njf njfVar) {
        return (pd6) ((rjf) njfVar.T.getValue()).b.getValue();
    }

    @Override // defpackage.mjf
    public final ExecutorService o(njf njfVar) {
        return (ScheduledExecutorService) ((rjf) njfVar.T.getValue()).a.getValue();
    }

    public final String toString() {
        return this.f;
    }
}
