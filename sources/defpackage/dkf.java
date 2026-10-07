package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class dkf extends pdh {
    public static final /* synthetic */ int h = 0;
    public final long d;
    public long e;
    public final CopyOnWriteArrayList f;
    public final String g;

    public dkf(long j, long j2, m8b m8bVar) {
        this.d = j;
        this.e = j2;
        this.f = new CopyOnWriteArrayList(rx8.l0(m8bVar));
        StringBuilder sb = new StringBuilder("TYPE_CHAT_DELETE_BATCH(#");
        sb.append(j);
        sb.append('/');
        this.g = qt4.p(sb, m8bVar.d, ')');
    }

    @Override // defpackage.mjf
    public final void A() {
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        this.e = ((s7f) njfVar.c()).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0132 -> B:18:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:21:0x0052
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.pdh
    public final java.lang.Object C(defpackage.gu4 r23, defpackage.lq4 r24) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkf.C(gu4, lq4):java.lang.Object");
    }

    public final void D(CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            this.f.remove(Long.valueOf(((Number) it.next()).longValue()));
        }
    }

    @Override // defpackage.btc
    public final void d() {
        u().d(this.d);
    }

    @Override // defpackage.btc
    public final boolean e() {
        return true;
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.DeleteChatsBatch deleteChatsBatch = new Tasks.DeleteChatsBatch();
        deleteChatsBatch.taskId = this.d;
        deleteChatsBatch.chatIds = ww3.U1(this.f);
        deleteChatsBatch.lastFailTime = this.e;
        return sia.toByteArray(deleteChatsBatch);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.d;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_DELETE_BATCH;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x010f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    @Override // defpackage.pdh, defpackage.btc
    public final atc j() {
        atc atcVar = atc.b;
        atc atcVar2 = atc.c;
        atc atcVarJ = super.j();
        atc atcVar3 = atc.a;
        if (atcVarJ != atcVar3) {
            return atcVarJ;
        }
        if (!this.f.isEmpty()) {
            njf njfVar = this.a;
            dkf dkfVar = null;
            if (njfVar == null) {
                njfVar = null;
            }
            if (njfVar.a().b()) {
                njf njfVar2 = this.a;
                if (njfVar2 == null) {
                    njfVar2 = null;
                }
                if (njfVar2.e().d()) {
                    ghb ghbVar = ew5.b;
                    njf njfVar3 = this.a;
                    if (njfVar3 == null) {
                        njfVar3 = null;
                    }
                    long jF = ((s7f) njfVar3.c()).f();
                    lw5 lw5Var = lw5.MILLISECONDS;
                    long jP = qe7.P(jF, lw5Var);
                    long jP2 = qe7.P(2L, lw5.SECONDS);
                    long jO = ew5.o(jP, qe7.P(this.e, lw5Var));
                    int iD = ew5.d(jO, jP2);
                    String str = this.g;
                    if (iD < 0) {
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, qv1.l("skip task! timeout after fail is too small: diff=", ew5.t(jO), ", chat-delete-batch-local-fail-interval=", ew5.t(jP2)), null);
                            }
                        }
                    } else {
                        long j = this.d;
                        njf njfVar4 = this.a;
                        if (njfVar4 == null) {
                            njfVar4 = null;
                        }
                        List<tjh> listK = njfVar4.h().k(Collections.singletonList(ctc.TYPE_CHAT_DELETE_BATCH));
                        if (listK.isEmpty()) {
                            gm0.Y(str, "allTasks is empty");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (tjh tjhVar : listK) {
                                btc btcVar = tjhVar.f;
                                long j2 = tjhVar.a;
                                dkf dkfVar2 = btcVar instanceof dkf ? (dkf) btcVar : dkfVar;
                                if (dkfVar2 != null) {
                                    CopyOnWriteArrayList copyOnWriteArrayList = dkfVar2.f;
                                    if (j2 == j) {
                                        continue;
                                    } else {
                                        int iOrdinal = tjhVar.b.ordinal();
                                        if (iOrdinal == 0) {
                                            if (j2 < j) {
                                                D(copyOnWriteArrayList);
                                            } else {
                                                dkfVar2.D(this.f);
                                                if (copyOnWriteArrayList.isEmpty()) {
                                                    arrayList.add(Long.valueOf(j2));
                                                } else {
                                                    arrayList2.add(dkfVar2);
                                                }
                                            }
                                        } else if (iOrdinal != 1) {
                                            if (iOrdinal != 2) {
                                                ore.o();
                                                return null;
                                            }
                                            if (j2 < j) {
                                                D(copyOnWriteArrayList);
                                            } else {
                                                dkfVar2.D(this.f);
                                                if (copyOnWriteArrayList.isEmpty()) {
                                                    arrayList.add(Long.valueOf(j2));
                                                } else {
                                                    arrayList2.add(dkfVar2);
                                                }
                                            }
                                        } else if (j2 < j) {
                                            D(copyOnWriteArrayList);
                                        }
                                        dkfVar = null;
                                    }
                                }
                            }
                            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                                gm0.Y(str, "tasksToUpdate and taskIdsToRemove are empty");
                            } else {
                                njf njfVar5 = this.a;
                                if (njfVar5 == null) {
                                    njfVar5 = null;
                                }
                                wmi wmiVarI = njfVar5.i();
                                njf njfVar6 = this.a;
                                if (njfVar6 == null) {
                                    njfVar6 = null;
                                }
                                xt4 xt4VarB = ((n0c) njfVar6.f()).b();
                                njf njfVar7 = this.a;
                                if (njfVar7 == null) {
                                    njfVar7 = null;
                                }
                                yt4 yt4Var = (yt4) njfVar7.q.getValue();
                                xt4VarB.getClass();
                                yab.i0(wmiVarI, lvb.x0(xt4VarB, yt4Var), 0, new voc(this, arrayList, arrayList2, null, 26), 2);
                            }
                        }
                        if (!this.f.isEmpty()) {
                            return atcVar3;
                        }
                    }
                }
                return atcVar;
            }
        }
        return atcVar2;
    }

    @Override // defpackage.btc
    public final int l() {
        return 5;
    }
}
