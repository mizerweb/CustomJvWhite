package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class dfi extends aq implements qih, btc {
    public static final /* synthetic */ int j = 0;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public dfi(long j2, long j3, long j4, long j5, boolean z) {
        super(j2);
        this.f = j3;
        this.g = j4;
        this.h = j5;
        this.i = z;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        gm0.n("dfi", "onSuccess: " + ((p3b) kihVar));
        sfa sfaVarL = r().l(this.g);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED) {
            return;
        }
        r().p(sfaVarL, xfa.SENT);
        o().c(new kfi(this.f, this.g, false));
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
        sfa sfaVarL = r().l(this.g);
        if (sfaVarL != null) {
            r().p(sfaVarL, xfa.ERROR);
            o().c(new kfi(this.f, this.g, false));
        }
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        gm0.m("dfi", "onFail", yhhVar);
        sfa sfaVarL = r().l(this.g);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED || p90.C(yhhVar.b)) {
            return;
        }
        d();
        o().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.UpdateFireTimeProtoTask updateFireTimeProtoTask = new Tasks.UpdateFireTimeProtoTask();
        updateFireTimeProtoTask.requestId = this.a;
        updateFireTimeProtoTask.chatId = this.f;
        updateFireTimeProtoTask.messageId = this.g;
        updateFireTimeProtoTask.fireTime = this.h;
        updateFireTimeProtoTask.notifySender = this.i;
        return sia.toByteArray(updateFireTimeProtoTask);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_UPDATE_FIRE_TIME;
    }

    @Override // defpackage.btc
    public final atc j() {
        long j2;
        long j3;
        Object next;
        List listH = v().h(this.a, ctc.TYPE_UPDATE_FIRE_TIME);
        ArrayList arrayList = new ArrayList();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add((dfi) ((tjh) it.next()).f);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            j2 = this.g;
            j3 = this.f;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it2.next();
            dfi dfiVar = (dfi) next;
            if (dfiVar.f == j3 && dfiVar.g == j2) {
                break;
            }
        }
        dfi dfiVar2 = (dfi) next;
        atc atcVar = atc.c;
        if (dfiVar2 != null) {
            gm0.n("dfi", "onPreExecute: found later task, REMOVE");
            return atcVar;
        }
        sfa sfaVarL = r().l(j2);
        rt2 rt2VarN = p().N(j3);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED || rt2VarN == null || !(rt2VarN.W() || rt2VarN.o0())) {
            gm0.n("dfi", "onPreExecute: message or chat not found, REMOVE");
            return atcVar;
        }
        if (sfaVarL.b == 0) {
            gm0.n("dfi", "onPreExecute: message serverId == 0, REMOVE");
            return atcVar;
        }
        if (rt2VarN.b.a != 0 || p().V(rt2VarN)) {
            return atc.a;
        }
        gm0.n("dfi", "onPreExecute: chat serverId == 0, SKIP");
        return atc.b;
    }

    @Override // defpackage.aq
    public final Object m() {
        rt2 rt2VarN;
        long j2 = this.f;
        StringBuilder sbS = qt4.s(j2, "createRequest for ", "  ");
        long j3 = this.g;
        sbS.append(j3);
        gm0.n("dfi", sbS.toString());
        sfa sfaVarL = r().l(j3);
        if (sfaVarL == null || (rt2VarN = p().N(j2)) == null) {
            return null;
        }
        ng5 ng5Var = new ng5(this.h, this.i);
        boolean zE = sfaVarL.E();
        nx2 nx2Var = rt2VarN.b;
        if (zE) {
            return new h3b(nx2Var.a, sfaVarL.b, "", (b50) null, (ArrayList) null, ng5Var, (Long) null, 88);
        }
        long j4 = nx2Var.a;
        long j5 = sfaVarL.b;
        String str = sfaVarL.g;
        c46 c46Var = sfaVarL.n;
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        b50 b50VarD = pm9.d(c46Var, (wo6) bqVar.V.getValue());
        if (b50VarD == null) {
            b50VarD = new b50();
        }
        b50 b50Var = b50VarD;
        List list = sfaVarL.D;
        return new h3b(j4, j5, str, b50Var, list != null ? pm9.s(list) : null, ng5Var, (Long) null, 64);
    }
}
