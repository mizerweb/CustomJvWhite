package defpackage;

import java.util.Arrays;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class qjf extends pdh {
    public static final /* synthetic */ int h = 0;
    public final long d;
    public final long[] e;
    public long f;
    public final String g;

    public qjf(long j, long[] jArr, long j2) {
        this.d = j;
        this.e = jArr;
        this.f = j2;
        StringBuilder sb = new StringBuilder("TYPE_CALL_HISTORY_CLEAR_BATCH(#");
        sb.append(j);
        sb.append('/');
        this.g = qt4.p(sb, jArr.length, ')');
    }

    @Override // defpackage.mjf
    public final void A() {
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        this.f = ((s7f) njfVar.c()).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.pdh
    public final Object C(gu4 gu4Var, lq4 lq4Var) throws TamErrorException {
        pjf pjfVar;
        sbi sbiVar = sbi.a;
        if (lq4Var instanceof pjf) {
            pjfVar = (pjf) lq4Var;
            int i = pjfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjfVar.f = i - Integer.MIN_VALUE;
            } else {
                pjfVar = new pjf(this, (nq4) lq4Var);
            }
        } else {
            pjfVar = new pjf(this, (nq4) lq4Var);
        }
        Object objD = pjfVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = pjfVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objD);
                long[] jArr = this.e;
                vsb vsbVar = jArr.length == 0 ? new vsb((long[]) null) : new vsb(jArr);
                njf njfVar = this.a;
                if (njfVar == null) {
                    njfVar = null;
                }
                pvb pvbVar = (pvb) njfVar.w.getValue();
                pjfVar.f = 1;
                objD = pvbVar.D(vsbVar, pjfVar);
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ch3.d0(objD);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objD);
            }
            return sbiVar;
        } catch (TamErrorException e) {
            if (!cqk.d(e.a.b, "error.call.history.clear.denied")) {
                throw e;
            }
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "clear denied, resyncing", null);
                }
            }
            njf njfVar2 = this.a;
            kfb kfbVar = (kfb) (njfVar2 != null ? njfVar2 : null).V.getValue();
            pjfVar.f = 2;
            if (kfbVar.c(pjfVar) != hu4Var) {
                return sbiVar;
            }
        }
    }

    @Override // defpackage.btc
    public final void d() {
        u().d(this.d);
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.CallHistoryClearBatch callHistoryClearBatch = new Tasks.CallHistoryClearBatch();
        callHistoryClearBatch.taskId = this.d;
        long[] jArr = this.e;
        callHistoryClearBatch.historyIds = Arrays.copyOf(jArr, jArr.length);
        callHistoryClearBatch.lastFailTime = this.f;
        return sia.toByteArray(callHistoryClearBatch);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.d;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CALL_HISTORY_CLEAR_BATCH;
    }

    @Override // defpackage.pdh, defpackage.btc
    public final atc j() {
        atc atcVar = atc.b;
        atc atcVarJ = super.j();
        atc atcVar2 = atc.a;
        if (atcVarJ != atcVar2) {
            return atcVarJ;
        }
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        if (!njfVar.a().b()) {
            return atc.c;
        }
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
            long jO = ew5.o(jP, qe7.P(this.f, lw5Var));
            if (ew5.d(jO, jP2) >= 0) {
                return atcVar2;
            }
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, qv1.l("skip task! timeout after fail is too small: diff=", ew5.t(jO), ", call-history-clear-batch-fail-interval=", ew5.t(jP2)), null);
                }
            }
        }
        return atcVar;
    }

    @Override // defpackage.btc
    public final int l() {
        return 5;
    }
}
