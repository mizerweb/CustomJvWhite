package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wkf extends ilf {
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public final /* synthetic */ int l = 0;
    public final long m;

    public wkf(yjf yjfVar) {
        super(yjfVar);
        this.m = yjfVar.i.a;
        this.i = null;
    }

    @Override // defpackage.ilf, defpackage.mjf
    public void B() throws Throwable {
        c46 c46Var;
        List<e70> list;
        String str;
        c46 c46Var2;
        List<e70> list2;
        String str2;
        switch (this.l) {
            case 0:
                long j = this.m;
                njf njfVar = this.a;
                if (njfVar == null) {
                    njfVar = null;
                }
                this.k = njfVar.g().E(this.j, "ServiceTaskResendMessage", true, "msg_round_trip");
                sfa sfaVarL = r().l(j);
                if (sfaVarL == null || sfaVarL.j == wja.DELETED) {
                    gm0.n("wkf", "process: skip deleted message");
                    njf njfVar2 = this.a;
                    if (njfVar2 == null) {
                        njfVar2 = null;
                    }
                    qrc.m(njfVar2.g(), f4b.NON_EXISTED_MESSAGE_IN_SERVICE_TASK, this.k, null, 28);
                } else {
                    rt2 rt2VarN = c().N(this.c);
                    if (rt2VarN == null) {
                        njf njfVar3 = this.a;
                        if (njfVar3 == null) {
                            njfVar3 = null;
                        }
                        ((t1c) ((ed6) njfVar3.p.getValue())).a(new IllegalStateException("chat is null"));
                        njf njfVar4 = this.a;
                        if (njfVar4 == null) {
                            njfVar4 = null;
                        }
                        qrc.m(njfVar4.g(), f4b.NON_EXISTED_CHAT_IN_SERVICE_TASK, this.k, null, 28);
                    } else {
                        if (sfaVarL.C() && !sfaVarL.E() && (c46Var = sfaVarL.n) != null && (list = (List) c46Var.a) != null) {
                            for (e70 e70Var : list) {
                                o60 o60Var = e70Var.b;
                                if (o60Var == null || (str = o60Var.h) == null || str.length() == 0) {
                                    njf njfVar5 = this.a;
                                    if (njfVar5 == null) {
                                        njfVar5 = null;
                                    }
                                    ((ygg) njfVar5.z.getValue()).a(this.c, this.m, e70Var);
                                }
                            }
                        }
                        r().p(sfaVarL, xfa.SENDING);
                        G(rt2VarN, j, this.k);
                        njf njfVar6 = this.a;
                        if (njfVar6 == null) {
                            njfVar6 = null;
                        }
                        ((t51) njfVar6.d.getValue()).c(new kfi(this.c, this.m, false));
                        njf njfVar7 = this.a;
                        (njfVar7 != null ? njfVar7 : null).g().G(this.k);
                    }
                }
                break;
            case 1:
                gm0.n("wkf", "process for message");
                sfa sfaVarL2 = r().l(this.m);
                ng5 ng5Var = sfaVarL2 != null ? sfaVarL2.G : null;
                if (sfaVarL2 == null) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "wkf", "message is null", null);
                        }
                    }
                    njf njfVar8 = this.a;
                    (njfVar8 != null ? njfVar8 : null).g().B(f4b.NON_EXISTED_MESSAGE_IN_SERVICE_TASK, this.j);
                } else if (ng5Var == null) {
                    gm0.Y("wkf", "delayed attrs are null");
                    njf njfVar9 = this.a;
                    (njfVar9 != null ? njfVar9 : null).g().B(f4b.EMPTY_DELAYED_ATTRS, this.j);
                } else {
                    rt2 rt2VarN2 = c().N(this.c);
                    if (rt2VarN2 == null) {
                        gm0.Y("wkf", "chat is null");
                        njf njfVar10 = this.a;
                        (njfVar10 != null ? njfVar10 : null).g().B(f4b.NON_EXISTED_CHAT_IN_SERVICE_TASK, this.j);
                    } else {
                        xfa xfaVar = sfaVarL2.i;
                        if (xfaVar == xfa.ERROR || xfaVar == xfa.SENDING || xfaVar == xfa.UNKNOWN) {
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9 je9Var2 = je9.d;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, "wkf", "process: skipped deleting of message cuz it in status -> " + sfaVarL2.i, null);
                                }
                            }
                            njf njfVar11 = this.a;
                            if (njfVar11 == null) {
                                njfVar11 = null;
                            }
                            yab.A0(((n0c) njfVar11.f()).b(), new gce(this, sfaVarL2, null, 19));
                        } else {
                            njf njfVar12 = this.a;
                            if (njfVar12 == null) {
                                njfVar12 = null;
                            }
                            ((sih) njfVar12.j.getValue()).c(new g3b(t().a.g(), this.c, rt2VarN2.b.a, Collections.singletonList(Long.valueOf(sfaVarL2.a)), Collections.singletonList(Long.valueOf(sfaVarL2.b)), 0, true, mg5.DELAYED, true), (12 & 2) != 0 ? false : false, 0L, (12 & 8) == 0 ? 1 : 0);
                        }
                        super.B();
                        sfa sfaVarL3 = r().l(this.m);
                        if (sfaVarL3 != null && sfaVarL3.C() && !sfaVarL3.E() && (c46Var2 = sfaVarL3.n) != null && (list2 = (List) c46Var2.a) != null) {
                            for (e70 e70Var2 : list2) {
                                o60 o60Var2 = e70Var2.b;
                                if (o60Var2 == null || (str2 = o60Var2.h) == null || str2.length() == 0) {
                                    njf njfVar13 = this.a;
                                    if (njfVar13 == null) {
                                        njfVar13 = null;
                                    }
                                    ((ygg) njfVar13.z.getValue()).a(this.c, this.m, e70Var2);
                                }
                            }
                        }
                        njf njfVar14 = this.a;
                        ((t51) (njfVar14 != null ? njfVar14 : null).d.getValue()).c(new j3b(this.c, Collections.singletonList(Long.valueOf(this.m)), mg5.DELAYED));
                    }
                }
                break;
            default:
                super.B();
                break;
        }
    }

    @Override // defpackage.ilf
    public final rfa C() {
        switch (this.l) {
            case 0:
                return null;
            case 1:
                je9 je9Var = je9.d;
                sfa sfaVarL = r().l(this.m);
                if (sfaVarL == null) {
                    return null;
                }
                rfa rfaVarC0 = sfaVarL.c0();
                sfa sfaVar = sfaVarL.q;
                if (sfaVar != null) {
                    if (sfaVarL.o == 2 && sfaVarL.x == 0) {
                        rfaVarC0.x = sfaVarL.p;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "wkf", sfaVarL.a + ": set outgoing link chat id = " + sfaVarL.p, null);
                        }
                    }
                    if (sfaVarL.y == 0) {
                        rfaVarC0.y = sfaVar.b;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, "wkf", sfaVarL.a + ": set outgoing link message id = " + sfaVar.b, null);
                        }
                    }
                }
                rfaVarC0.F = null;
                rfaVarC0.A = 0L;
                rfaVarC0.f = 0L;
                rfaVarC0.b = 0L;
                rfaVarC0.i = xfa.SENDING;
                rfaVarC0.j = wja.ACTIVE;
                return rfaVarC0;
            default:
                njf njfVar = this.a;
                if (njfVar == null) {
                    njfVar = null;
                }
                vdh vdhVar = (vdh) njfVar.m.getValue();
                long j = this.m;
                clg clgVarC = vdhVar.c(j);
                if (clgVarC == null) {
                    gm0.W("ServiceTaskSendStickerMessage", zo5.j(j, "sticker not found, skipping task. stickerId="), new Object[0]);
                    return null;
                }
                w60 w60VarP = pm9.p(clgVarC);
                c60 c60Var = new c60();
                c60Var.f = w60VarP;
                c60Var.a = y60.f;
                e70 e70VarA = c60Var.a();
                f70 f70Var = new f70();
                f70Var.a = Collections.singletonList(e70VarA);
                c46 c46VarC = f70Var.c();
                rfa rfaVar = new rfa();
                rfaVar.n = c46VarC;
                return rfaVar;
        }
    }

    @Override // defpackage.ilf
    public final String D() {
        switch (this.l) {
            case 0:
                return "ServiceTaskResendMessage";
            case 1:
                return "ServiceTaskSendScheduledMessageAsRegular";
            default:
                return "ServiceTaskSendStickerMessage";
        }
    }

    @Override // defpackage.ilf
    public long E(sfa sfaVar) {
        switch (this.l) {
            case 1:
                long j = sfaVar.a;
                if (j == 0) {
                    gm0.Y("wkf", "message id is zero, " + sfaVar);
                    return super.E(sfaVar);
                }
                qfa qfaVarR = r();
                qfaVarR.getClass();
                gm0.m("qfa", "updateMessage, %s", sfaVar);
                wna wnaVarH = ((ose) qfaVarR.b.c()).h();
                long j2 = sfaVar.a;
                long j3 = sfaVar.b;
                long j4 = sfaVar.f;
                long j5 = sfaVar.c;
                long j6 = sfaVar.k;
                long j7 = sfaVar.A;
                int i = sfaVar.B;
                long j8 = sfaVar.C;
                xfa xfaVar = sfaVar.i;
                wja wjaVar = sfaVar.j;
                ng5 ng5Var = sfaVar.G;
                toa toaVar = (toa) wnaVarH;
                ch3.G(toaVar.a, false, true, new iaa(toaVar, 9, new jfi(j2, j3, j4, j5, j6, j7, i, j8, xfaVar, wjaVar, ng5Var != null ? Long.valueOf(ng5Var.a) : null, ng5Var != null ? Boolean.valueOf(ng5Var.b) : null, sfaVar.x, sfaVar.y)));
                qfaVarR.f.g.remove(Long.valueOf(j));
                return j;
            default:
                return super.E(sfaVar);
        }
    }

    public wkf(vkf vkfVar) {
        super(vkfVar);
        this.m = vkfVar.i;
    }

    public wkf(vkf vkfVar, byte b) {
        super(vkfVar);
        this.m = vkfVar.i;
    }
}
