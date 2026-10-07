package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class iei {
    public final l7f a;
    public final ny8 b;
    public final String c = iei.class.getName();

    public iei(ny8 ny8Var, l7f l7fVar) {
        this.a = l7fVar;
        this.b = ny8Var;
    }

    public final void a(long j, tw2 tw2Var, sfa sfaVar) {
        uw2 uw2Var = uw2.c;
        h60 h60VarQ = sfaVar.q();
        String str = this.c;
        if (h60VarQ == null) {
            gm0.Y(str, "could not apply usecase for not control message");
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                long j2 = tw2Var.a;
                int i = h60VarQ.a;
                StringBuilder sbS = qt4.s(j2, "onControlMessage, chatId = ", ", messageDb.event = ");
                sbS.append(p.o(i));
                a4cVar.c(je9Var, str, sbS.toString(), null);
            }
        }
        rt2 rt2Var = (rt2) ((xn3) this.b.getValue()).k(j).a.getValue();
        if (rt2Var == null) {
            gm0.Y(this.c, "chat is null!");
            return;
        }
        long jA = this.a.a();
        int i2 = h60VarQ.a;
        switch (i2 == 0 ? -1 : hei.$EnumSwitchMapping$0[qt4.D(i2)]) {
            case 1:
            case 2:
                for (Long l : h60VarQ.c) {
                    if (!rt2Var.b.C.contains(uw2Var)) {
                        Map map = tw2Var.e;
                        mw mwVarV = map instanceof mw ? (mw) map : oc9.V(map);
                        mwVarV.put(l, 0L);
                        tw2Var.e = mwVarV;
                    }
                }
                break;
            case 3:
                if (!rt2Var.b.C.contains(uw2Var)) {
                    Map map2 = tw2Var.e;
                    mw mwVarV2 = map2 instanceof mw ? (mw) map2 : oc9.V(map2);
                    mwVarV2.remove(Long.valueOf(h60VarQ.b));
                    tw2Var.e = mwVarV2;
                }
                if (h60VarQ.b == jA) {
                    tw2Var.c = kx2.b;
                }
                break;
            case 4:
                Map map3 = tw2Var.e;
                mw mwVarV3 = map3 instanceof mw ? (mw) map3 : oc9.V(map3);
                mwVarV3.remove(Long.valueOf(sfaVar.e));
                tw2Var.e = mwVarV3;
                if (sfaVar.e == jA) {
                    tw2Var.c = kx2.d;
                }
                break;
            case 5:
                if (!rt2Var.b.C.contains(uw2.a)) {
                    tw2Var.g = h60VarQ.d;
                }
                break;
            case 6:
                if (!rt2Var.b.C.contains(uw2.b)) {
                    tw2Var.h = h60VarQ.f;
                }
                break;
        }
    }
}
