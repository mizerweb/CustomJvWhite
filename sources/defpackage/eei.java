package defpackage;

import java.util.Map;
import ru.ok.tamtam.messages.ChatException;

/* JADX INFO: loaded from: classes3.dex */
public final class eei {
    public final l7f a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public eei(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, l7f l7fVar) {
        this.a = l7fVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public final rt2 a(final long j, long j2, sfa sfaVar, int i, long j3) {
        long j4;
        final int i2;
        long j5;
        sfa sfaVar2;
        String name = eei.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            j4 = j2;
            sfaVar2 = sfaVar;
            i2 = i;
            j5 = j3;
        } else {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbS = qt4.s(j, "chatId=", ", serverChatId=");
                j4 = j2;
                i2 = i;
                c0a.w(sbS, j4, ", unread=", i2);
                j5 = j3;
                qt4.z(j5, ", readMark=", ", messageDb=", sbS);
                sfaVar2 = sfaVar;
                sbS.append(sfaVar2);
                a4cVar.c(je9Var, name, sbS.toString(), null);
            } else {
                j4 = j2;
                sfaVar2 = sfaVar;
                i2 = i;
                j5 = j3;
            }
        }
        xn3 xn3Var = (xn3) this.b.getValue();
        final sfa sfaVar3 = sfaVar2;
        final long j6 = j4;
        final long j7 = j5;
        return xn3Var.j().v(j, true, new tg4() { // from class: dei
            @Override // defpackage.tg4
            public final void accept(Object obj) {
                long j8;
                fda fdaVar;
                tw2 tw2Var = (tw2) obj;
                if (tw2Var.a == 0) {
                    tw2Var.a = j6;
                }
                sfa sfaVar4 = sfaVar3;
                boolean zM = sfaVar4.M();
                long j9 = sfaVar4.h;
                eei eeiVar = this;
                long j10 = j;
                if (zM) {
                    ((iei) eeiVar.d.getValue()).a(j10, tw2Var, sfaVar4);
                }
                sb8.u(tw2Var.n, sfaVar4);
                mg5 mg5Var = sfaVar4.H;
                mg5 mg5Var2 = mg5.REGULAR;
                if (mg5Var != mg5Var2) {
                    return;
                }
                rt2 rt2Var = (rt2) ((xn3) eeiVar.b.getValue()).k(j10).a.getValue();
                if (rt2Var == null || (fdaVar = rt2Var.c) == null) {
                    j8 = 0;
                } else {
                    j8 = 0;
                    if (fdaVar.a.b < sfaVar4.b) {
                        if (j9 != j10) {
                            ((s7f) ((et3) eeiVar.c.getValue())).E(true);
                            StringBuilder sb = new StringBuilder("invalid chatId=");
                            sb.append(j10);
                            gm0.V(eei.class.getName(), zo5.k(j9, " messageDb.chatId=", ",place=UpdateChatAfterMessageSendUseCase", sb), new ChatException.WrongLastMessage(j10, sfaVar4));
                        }
                        tw2Var.e(sfaVar4);
                    }
                }
                if (rt2Var != null) {
                    nx2 nx2Var = rt2Var.b;
                    if (nx2Var.y == j8 && nx2Var.n.d(mg5Var2) == 0 && rt2Var.c == null) {
                        gm0.n(eei.class.getName(), "try find firstMessage after msgSend because chunks is empty");
                        ((xn3) eeiVar.b.getValue()).j().G(j10, tw2Var, 0L);
                    }
                }
                long jA = eeiVar.a.a();
                long j11 = j7;
                if (j11 >= j8 && jA != -1) {
                    Map map = tw2Var.e;
                    mw mwVarV = map instanceof mw ? (mw) map : oc9.V(map);
                    mwVarV.put(Long.valueOf(jA), Long.valueOf(j11));
                    tw2Var.e = mwVarV;
                }
                int i3 = i2;
                if (i3 >= 0) {
                    tw2Var.m = i3;
                }
            }
        });
    }
}
