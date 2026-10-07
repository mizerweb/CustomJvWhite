package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes.dex */
public final class amf extends mjf implements btc {
    public static final AtomicInteger f = new AtomicInteger(0);
    public static volatile amf g;
    public final long b;
    public long c;
    public final CopyOnWriteArrayList d;
    public final String e;

    public amf(long j, long j2, List list) {
        this.b = j;
        this.c = j2;
        this.d = new CopyOnWriteArrayList(list);
        this.e = "TYPE_WARM_CHAT_HISTORY(#" + j + '/' + list.size() + ')';
    }

    @Override // defpackage.mjf
    public final void A() {
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        this.c = ((s7f) njfVar.c()).f();
    }

    @Override // defpackage.mjf
    public final void B() {
        Object poeVar;
        je9 je9Var = je9.e;
        try {
            poeVar = (Long) this.d.get(0);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        Long l = (Long) poeVar;
        if (l == null) {
            C();
            return;
        }
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        njfVar.b().a(8, this.d.size());
        njf njfVar2 = this.a;
        if (njfVar2 == null) {
            njfVar2 = null;
        }
        pd6 pd6Var = (pd6) ((rjf) njfVar2.T.getValue()).b.getValue();
        rt2 rt2Var = (rt2) k().k(l.longValue()).a.getValue();
        long jH = (rt2Var == null || rt2Var.b.b() <= 99) ? 0L : i4e.b.h(500L, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.j(jH, "process: initialDelay="), null);
        }
        boolean zIsEmpty = this.d.isEmpty();
        String str2 = this.e;
        if (zIsEmpty) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "schedule: ids are empty!", null);
            }
            C();
            return;
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, str2, zo5.h(this.d.size(), "schedule "), null);
            }
        }
        g = this;
        njf njfVar3 = this.a;
        if (njfVar3 == null) {
            njfVar3 = null;
        }
        wmi wmiVarI = njfVar3.i();
        njf njfVar4 = this.a;
        if (njfVar4 == null) {
            njfVar4 = null;
        }
        yt4 yt4Var = (yt4) njfVar4.q.getValue();
        pd6Var.getClass();
        yab.i0(wmiVarI, lvb.x0(pd6Var, yt4Var), 0, new ylf(jH, this, null), 2).Y(new yre(5, this));
    }

    public final void C() {
        gm0.x(this.e, "finishTask", null);
        u().d(this.b);
    }

    @Override // defpackage.btc
    public final void d() {
        u().d(this.b);
    }

    @Override // defpackage.btc
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amf) {
            return cqk.d(this.d, ((amf) obj).d);
        }
        return false;
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.WarmChatHistory warmChatHistory = new Tasks.WarmChatHistory();
        warmChatHistory.taskId = this.b;
        warmChatHistory.chatIds = ww3.U1(this.d);
        warmChatHistory.lastFailTime = this.c;
        return sia.toByteArray(warmChatHistory);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_WARM_CHAT_HISTORY;
    }

    public final int hashCode() {
        return this.d.hashCode() + (amf.class.hashCode() * 31);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0168  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e A[LOOP:1: B:81:0x0178->B:83:0x017e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c8  */
    @Override // defpackage.btc
    public final atc j() {
        njf njfVar;
        njf njfVar2;
        njf njfVar3;
        njf njfVar4;
        long jO;
        long jO2;
        njf njfVar5;
        List<tjh> listK;
        l8b l8bVar;
        njf njfVar6;
        String str;
        a4c a4cVar;
        btc btcVar;
        amf amfVar;
        int iOrdinal;
        Iterator it;
        String str2;
        a4c a4cVar2;
        je9 je9Var;
        atc atcVar = atc.a;
        atc atcVar2 = atc.b;
        atc atcVar3 = atc.c;
        je9 je9Var2 = je9.e;
        njf njfVar7 = this.a;
        if (njfVar7 == null) {
            njfVar7 = null;
        }
        b5d b5dVar = ((zed) njfVar7.e.getValue()).b.a().a.A3;
        zv8[] zv8VarArr = e5d.S6;
        long jLongValue = ((Number) b5dVar.a(zv8VarArr[236]).i()).longValue();
        String str3 = this.e;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
            a4cVar3.c(je9Var2, str3, zo5.j(jLongValue, "pms.chat-history-login-count="), null);
        }
        if (jLongValue > 0) {
            AtomicInteger atomicInteger = f;
            if (atomicInteger.get() >= jLongValue) {
                String str4 = this.e;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                    a4cVar4.c(je9Var2, str4, zo5.g(atomicInteger.get(), jLongValue, "onPreExecute: remove; pms.chat-history-login-count=", ", chatHistoryOnLoginSyncCount="), null);
                    return atcVar3;
                }
            } else if (!this.d.isEmpty()) {
                njfVar = this.a;
                if (njfVar == null) {
                    njfVar = null;
                }
                if (njfVar.a().b()) {
                    njfVar2 = this.a;
                    if (njfVar2 == null) {
                        njfVar2 = null;
                    }
                    if (njfVar2.e().d()) {
                        ghb ghbVar = ew5.b;
                        njfVar3 = this.a;
                        if (njfVar3 == null) {
                            njfVar3 = null;
                        }
                        long jF = ((s7f) njfVar3.c()).f();
                        lw5 lw5Var = lw5.MILLISECONDS;
                        long jP = qe7.P(jF, lw5Var);
                        njfVar4 = this.a;
                        if (njfVar4 == null) {
                            njfVar4 = null;
                        }
                        jO = qe7.O(((Number) ((g5d) ((gjf) njfVar4.f.getValue())).a.v3.a(zv8VarArr[231]).i()).intValue(), lw5.SECONDS);
                        jO2 = ew5.o(jP, qe7.P(this.c, lw5Var));
                        if (ew5.d(jO2, jO) < 0) {
                            njfVar5 = this.a;
                            if (njfVar5 == null) {
                                njfVar5 = null;
                            }
                            listK = njfVar5.h().k(Collections.singletonList(ctc.TYPE_WARM_CHAT_HISTORY));
                            if (!listK.isEmpty()) {
                                l8bVar = new l8b(listK.size());
                                for (tjh tjhVar : listK) {
                                    btcVar = tjhVar.f;
                                    if (btcVar instanceof amf) {
                                        amfVar = (amf) btcVar;
                                    } else {
                                        amfVar = null;
                                    }
                                    if (amfVar != null) {
                                        iOrdinal = tjhVar.b.ordinal();
                                        if (iOrdinal == 0) {
                                            if (iOrdinal != 1) {
                                                it = amfVar.d.iterator();
                                                while (it.hasNext()) {
                                                    this.d.remove((Long) it.next());
                                                }
                                            } else if (iOrdinal != 2) {
                                                ore.o();
                                                return null;
                                            }
                                        }
                                        amfVar.d.removeIf(new u6(16, new p7d(27, this)));
                                        l8bVar.l(tjhVar.a, amfVar);
                                    }
                                }
                                njfVar6 = this.a;
                                if (njfVar6 == null) {
                                    njfVar6 = null;
                                }
                                str = this.e;
                                a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var2)) {
                                    a4cVar.c(je9Var2, str, zo5.h(l8bVar.e, "tryToUpdateTasks: "), null);
                                }
                                if (!l8bVar.h()) {
                                    wmi wmiVarI = njfVar6.i();
                                    xt4 xt4VarB = ((n0c) njfVar6.f()).b();
                                    yt4 yt4Var = (yt4) njfVar6.q.getValue();
                                    xt4VarB.getClass();
                                    yab.i0(wmiVarI, lvb.x0(xt4VarB, yt4Var), 0, new zlf(l8bVar, njfVar6, null), 2);
                                }
                                if (this.d.isEmpty()) {
                                }
                            }
                            return atcVar;
                        }
                        str2 = this.e;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9Var = je9.f;
                            if (a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, qv1.l("skip task! timeout after fail is too small: diff=", ew5.t(jO2), ", chat-history-warm-fail-interval=", ew5.t(jO)), null);
                            }
                        }
                    }
                    return atcVar2;
                }
            }
        } else if (!this.d.isEmpty()) {
            njfVar = this.a;
            if (njfVar == null) {
                njfVar = null;
            }
            if (njfVar.a().b()) {
                njfVar2 = this.a;
                if (njfVar2 == null) {
                    njfVar2 = null;
                }
                if (njfVar2.e().d()) {
                    ghb ghbVar2 = ew5.b;
                    njfVar3 = this.a;
                    if (njfVar3 == null) {
                        njfVar3 = null;
                    }
                    long jF2 = ((s7f) njfVar3.c()).f();
                    lw5 lw5Var2 = lw5.MILLISECONDS;
                    long jP2 = qe7.P(jF2, lw5Var2);
                    njfVar4 = this.a;
                    if (njfVar4 == null) {
                        njfVar4 = null;
                    }
                    jO = qe7.O(((Number) ((g5d) ((gjf) njfVar4.f.getValue())).a.v3.a(zv8VarArr[231]).i()).intValue(), lw5.SECONDS);
                    jO2 = ew5.o(jP2, qe7.P(this.c, lw5Var2));
                    if (ew5.d(jO2, jO) < 0) {
                        njfVar5 = this.a;
                        if (njfVar5 == null) {
                            njfVar5 = null;
                        }
                        listK = njfVar5.h().k(Collections.singletonList(ctc.TYPE_WARM_CHAT_HISTORY));
                        if (!listK.isEmpty()) {
                            l8bVar = new l8b(listK.size());
                            while (r1.hasNext()) {
                                btcVar = tjhVar.f;
                                if (btcVar instanceof amf) {
                                    amfVar = (amf) btcVar;
                                } else {
                                    amfVar = null;
                                }
                                if (amfVar != null) {
                                    iOrdinal = tjhVar.b.ordinal();
                                    if (iOrdinal == 0) {
                                        if (iOrdinal != 1) {
                                            it = amfVar.d.iterator();
                                            while (it.hasNext()) {
                                                this.d.remove((Long) it.next());
                                            }
                                        } else if (iOrdinal != 2) {
                                            ore.o();
                                            return null;
                                        }
                                    }
                                    amfVar.d.removeIf(new u6(16, new p7d(27, this)));
                                    l8bVar.l(tjhVar.a, amfVar);
                                }
                            }
                            njfVar6 = this.a;
                            if (njfVar6 == null) {
                                njfVar6 = null;
                            }
                            str = this.e;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var2, str, zo5.h(l8bVar.e, "tryToUpdateTasks: "), null);
                            }
                            if (!l8bVar.h()) {
                                wmi wmiVarI2 = njfVar6.i();
                                xt4 xt4VarB2 = ((n0c) njfVar6.f()).b();
                                yt4 yt4Var2 = (yt4) njfVar6.q.getValue();
                                xt4VarB2.getClass();
                                yab.i0(wmiVarI2, lvb.x0(xt4VarB2, yt4Var2), 0, new zlf(l8bVar, njfVar6, null), 2);
                            }
                            if (this.d.isEmpty()) {
                            }
                        }
                        return atcVar;
                    }
                    str2 = this.e;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9Var = je9.f;
                        if (a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, qv1.l("skip task! timeout after fail is too small: diff=", ew5.t(jO2), ", chat-history-warm-fail-interval=", ew5.t(jO)), null);
                        }
                    }
                }
                return atcVar2;
            }
        }
        return atcVar3;
    }

    @Override // defpackage.btc
    public final int l() {
        return 2;
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
        StringBuilder sbC = nbh.C("TYPE_WARM_CHAT_HISTORY(#");
        sbC.append(this.b);
        sbC.append(',');
        if (this.c != 0) {
            sbC.append("lastFailTime=");
            sbC.append(this.c);
            sbC.append(',');
        }
        sbC.append("ids=[");
        ww3.y1(this.d, sbC, null, null, 126);
        sbC.append(']');
        sbC.append(')');
        return sbC.toString();
    }

    @Override // defpackage.mjf
    public final boolean y() {
        return true;
    }

    @Override // defpackage.mjf
    public final boolean z() {
        return true;
    }
}
