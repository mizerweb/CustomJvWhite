package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes3.dex */
public final class u4b {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;

    public u4b(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        this.g = ny8Var7;
    }

    public final void a(long j, long j2, gda gdaVar, int i, long j3) {
        int i2;
        qfa qfaVar = (qfa) this.a.getValue();
        long j4 = gdaVar.f;
        ose oseVar = (ose) qfaVar.b.c();
        toa toaVar = (toa) oseVar.h();
        gga ggaVar = (gga) ch3.G(toaVar.a, true, false, new koa(j, j4, toaVar, 0));
        sfa sfaVarB = ggaVar != null ? oseVar.b(ggaVar) : null;
        if (sfaVarB == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MsgSendLogic", c0a.m(j, " not found!", qt4.s(gdaVar.f, "message cid=", " for chatId=")), null);
                return;
            }
            return;
        }
        if (sfaVarB.b == 0 || sfaVarB.N()) {
            qfa qfaVar2 = (qfa) this.a.getValue();
            List list = xfa.b;
            qfaVar2.getClass();
            uoa uoaVarC = qfaVar2.b.c();
            long jT = qfaVar2.d.a.t();
            ose oseVar2 = (ose) uoaVarC;
            oseVar2.getClass();
            oseVar2.D(gdaVar, j, false, null, jT, dnl.a(null));
            ((qfa) this.a.getValue()).o(sfaVarB, pm9.e(gdaVar.h, (m7f) this.b.getValue()));
            qfa qfaVar3 = (qfa) this.a.getValue();
            long j5 = gdaVar.f;
            ose oseVar3 = (ose) qfaVar3.b.c();
            toa toaVar2 = (toa) oseVar3.h();
            i2 = 0;
            gga ggaVar2 = (gga) ch3.G(toaVar2.a, true, false, new koa(j, j5, toaVar2, 0));
            sfaVarB = ggaVar2 != null ? oseVar3.b(ggaVar2) : null;
        } else {
            i2 = 0;
        }
        gm0.n("MsgSendLogic", "onMsgSend " + sfaVarB);
        if (sfaVarB == null) {
            return;
        }
        sfa sfaVar = sfaVarB;
        rt2 rt2VarA = ((eei) this.g.getValue()).a(j, j2, sfaVar, i, j3);
        ((b) this.c.getValue()).d(rt2VarA, sfaVar);
        if (rt2VarA != null) {
            if (rt2VarA.d0()) {
                long j6 = sfaVar.h;
                List listSingletonList = Collections.singletonList(Long.valueOf(sfaVar.b));
                pvb pvbVar = (pvb) this.e.getValue();
                String str = pvbVar.a;
                int size = listSingletonList.size();
                StringBuilder sbS = qt4.s(j6, "msgGetStat: chatId=", ", chatServerId=");
                long j7 = j2;
                sbS.append(j7);
                sbS.append(", messageIds.size=");
                sbS.append(size);
                gm0.n(str, sbS.toString());
                if (pvbVar.j(j6) && !listSingletonList.isEmpty()) {
                    ArrayList arrayListY1 = ww3.Y1(listSingletonList, 100, 100);
                    int size2 = arrayListY1.size();
                    long[] jArr = new long[size2];
                    while (i2 < size2) {
                        long[] jArr2 = jArr;
                        jArr2[i2] = pvb.s(pvbVar, new y3b(pvbVar.u().a.g(), j6, j7, (List) arrayListY1.get(i2)));
                        i2++;
                        size2 = size2;
                        jArr = jArr2;
                        j7 = j2;
                    }
                }
            }
            ((t51) this.d.getValue()).c(new kfi(rt2VarA.a, sfaVar.a, false));
            fda fdaVar = rt2VarA.c;
            if (fdaVar != null && fdaVar.a.a == sfaVar.a) {
                ((t51) this.d.getValue()).c(new wo3((Collection) Collections.singletonList(Long.valueOf(rt2VarA.a)), false, false, (mg5) null, (cid) null, (Set) null, 124));
            }
        }
        c46 c46Var = sfaVar.n;
        if (c46Var == null || c46Var.i() <= 0) {
            return;
        }
        for (e70 e70Var : (List) c46Var.a) {
            o60 o60Var = e70Var.b;
            if (o60Var != null && o60Var.e) {
                if (e70Var.u.length() > 0) {
                    String str2 = e70Var.u;
                    int i3 = rx8.p;
                    if (!str2.endsWith(".mp4")) {
                    }
                }
                long j8 = sfaVar.a;
                String str3 = e70Var.t;
                o60 o60Var2 = e70Var.b;
                ((wp6) this.f.getValue()).b(new pjh(j8, str3, 0L, 0L, o60Var2.i, 0L, o60Var2.j, false, false, 0L, "", 0, false, false, ns5.AUTOLOAD, null));
            }
        }
    }
}
