package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public final class o3b extends aq implements qih, btc {
    public static final /* synthetic */ int p = 0;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final wja j;
    public final List k;
    public final List l;
    public final boolean m;
    public final String n;
    public final String o;

    public o3b(long j, long j2, long j3, long j4, long j5, String str, String str2, wja wjaVar, List list, List list2, boolean z) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = wjaVar;
        this.k = list;
        this.l = list2;
        this.m = z;
        this.n = str == null ? "" : str;
        this.o = str2 == null ? "" : str2;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        gda gdaVar;
        p3b p3bVar = (p3b) kihVar;
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        qfa qfaVarI = bqVar.i();
        long j = this.g;
        sfa sfaVarL = qfaVarI.l(j);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED || (gdaVar = p3bVar.c) == null) {
            return;
        }
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        qfa qfaVarI2 = bqVar2.i();
        ((ose) qfaVarI2.b.c()).e().a(new ja1(qfaVarI2, gdaVar, this, sfaVarL, 7));
        bq bqVar3 = this.e;
        if (bqVar3 == null) {
            bqVar3 = null;
        }
        qw2 qw2VarC = bqVar3.c();
        long j2 = this.f;
        rt2 rt2VarN = qw2VarC.N(j2);
        if (sfaVarL.H.h() && rt2VarN != null && rt2VarN.b.j == j) {
            bq bqVar4 = this.e;
            if (bqVar4 == null) {
                bqVar4 = null;
            }
            bqVar4.c().I(j2);
        }
        bq bqVar5 = this.e;
        (bqVar5 != null ? bqVar5 : null).b().c(new kfi(this.f, sfaVarL.a, false));
    }

    @Override // defpackage.btc
    public final void d() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.k().d(this.a);
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        sfa sfaVarL = bqVar2.i().l(this.g);
        if (sfaVarL != null) {
            bq bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            bqVar3.i().p(sfaVarL, xfa.SENT);
            bq bqVar4 = this.e;
            ((uz5) (bqVar4 != null ? bqVar4 : null).L.getValue()).a(this.g, this.f, this.o, this.l, this.j, this.k, this.m);
        }
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        String str = yhhVar.b;
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        sfa sfaVarL = bqVar.i().l(this.g);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED) {
            return;
        }
        if (!p90.C(str)) {
            if ("attachment.not.ready".equals(str)) {
                bq bqVar2 = this.e;
                if (bqVar2 == null) {
                    bqVar2 = null;
                }
                ((l70) bqVar2.J.getValue()).b(sfaVarL);
            } else {
                d();
                if ("errors.edit-message.send-too-many-edit".equals(str)) {
                    bq bqVar3 = this.e;
                    if (bqVar3 == null) {
                        bqVar3 = null;
                    }
                    bqVar3.b().c(new sz5(this.f, this.a, yhhVar));
                }
            }
        }
        bq bqVar4 = this.e;
        (bqVar4 != null ? bqVar4 : null).b().c(new kfi(this.f, sfaVarL.a, false));
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.MsgEdit msgEdit = new Tasks.MsgEdit();
        msgEdit.requestId = this.a;
        msgEdit.chatId = this.f;
        msgEdit.messageId = this.g;
        msgEdit.chatServerId = this.h;
        msgEdit.messageServerId = this.i;
        msgEdit.text = this.n;
        msgEdit.oldText = this.o;
        msgEdit.oldStatus = this.j.a;
        msgEdit.editAttaches = this.m;
        List list = this.k;
        if (list != null) {
            f70 f70Var = new f70();
            f70Var.a = list;
            msgEdit.oldAttaches = a.f(f70Var.c());
        }
        List list2 = this.l;
        if (list2 != null) {
            msgEdit.oldElements = dga.c(list2);
        }
        return sia.toByteArray(msgEdit);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_MSG_EDIT;
    }

    @Override // defpackage.btc
    public final atc j() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        qfa qfaVarI = bqVar.i();
        long j = this.g;
        sfa sfaVarL = qfaVarI.l(j);
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        qw2 qw2VarC = bqVar2.c();
        long j2 = this.f;
        rt2 rt2VarN = qw2VarC.N(j2);
        bq bqVar3 = this.e;
        if (bqVar3 == null) {
            bqVar3 = null;
        }
        okh okhVarK = bqVar3.k();
        long j3 = this.a;
        ctc ctcVar = ctc.TYPE_MSG_EDIT;
        Iterator it = okhVarK.h(j3, ctcVar).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            atc atcVar = atc.c;
            if (!zHasNext) {
                if (sfaVarL == null || sfaVarL.j == wja.DELETED || rt2VarN == null || !(rt2VarN.W() || rt2VarN.o0())) {
                    gm0.n("o3b", "onPreExecute: message or chat not found, REMOVE");
                    return atcVar;
                }
                long j4 = this.i;
                long j5 = 0;
                if (j4 == 0) {
                    gm0.n("o3b", "onPreExecute: message serverId == 0, REMOVE");
                    return atcVar;
                }
                atc atcVar2 = atc.b;
                boolean z = this.m;
                if (z && sfaVarL.B(y60.c)) {
                    c46 c46Var = sfaVarL.n;
                    List<e70> list = c46Var != null ? (List) c46Var.a : null;
                    if (list == null) {
                        list = r66.a;
                    }
                    for (e70 e70Var : list) {
                        j5 = j5;
                        if (e70Var.e()) {
                            o60 o60Var = e70Var.b;
                            sfa sfaVar = sfaVarL;
                            long j6 = j4;
                            if (o60Var.i != j5 && ch3.r(o60Var.h)) {
                                bq bqVar4 = this.e;
                                if (bqVar4 == null) {
                                    bqVar4 = null;
                                }
                                tjh tjhVarJ = bqVar4.k().j(j3, ctcVar);
                                if (tjhVarJ == null || tjhVarJ.c > 20) {
                                    gm0.n("o3b", "onPreExecute: taskDb.failsCount > 20, REMOVE");
                                    d();
                                    return atcVar;
                                }
                                bq bqVar5 = this.e;
                                if (bqVar5 == null) {
                                    bqVar5 = null;
                                }
                                bqVar5.a().y(this.h, Collections.singletonList(Long.valueOf(j6)));
                                bq bqVar6 = this.e;
                                ch3.G((bqVar6 != null ? bqVar6 : null).k().c().b().a, false, true, new aa2(j3, 27));
                                gm0.n("o3b", "onPreExecute: attaches not ready, SKIP");
                                return atcVar2;
                            }
                            sfaVarL = sfaVar;
                            j4 = j6;
                        }
                    }
                }
                sfa sfaVar2 = sfaVarL;
                if (!z || l70.a(sfaVar2)) {
                    return atc.a;
                }
                gm0.n("o3b", "onPreExecute: attaches not ready, SKIP");
                return atcVar2;
            }
            o3b o3bVar = (o3b) ((tjh) it.next()).f;
            long j7 = j;
            if (o3bVar.f == j2 && o3bVar.g == j7) {
                gm0.n("o3b", "onPreExecute: later edit task found, REMOVE");
                return atcVar;
            }
            j = j7;
        }
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        b50 b50Var;
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        rt2 rt2VarN = bqVar.c().N(this.f);
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        sfa sfaVarL = bqVar2.i().l(this.g);
        if (rt2VarN == null || sfaVarL == null) {
            return null;
        }
        if (this.m) {
            c46 c46Var = sfaVarL.n;
            bq bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            b50 b50VarD = pm9.d(c46Var, (wo6) bqVar3.V.getValue());
            if (b50VarD == null) {
                b50VarD = new b50();
            }
            b50Var = b50VarD;
        } else {
            b50Var = null;
        }
        List list = sfaVarL.D;
        return new h3b(rt2VarN.b.a, this.i, this.n, b50Var, list != null ? pm9.s(list) : null, sfaVarL.G, (Long) null, 64);
    }
}
