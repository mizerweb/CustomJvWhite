package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface wna {
    static List a(wna wnaVar, long j) {
        toa toaVar = (toa) wnaVar;
        return (List) ch3.G(toaVar.a, true, false, new xna(j, toaVar, wja.DELETED, 2));
    }

    static zia b(wna wnaVar, gga ggaVar, zia ziaVar, long j, Long l, Long l2, int i) {
        String str = ggaVar.g;
        Long l3 = (i & 8) != 0 ? null : l;
        Long l4 = (i & 16) == 0 ? l2 : null;
        String strU = ziaVar.u();
        String str2 = ((strU != null && strU.length() != 0) || str == null || str.length() == 0) ? strU : str;
        long jM = ziaVar.m();
        if (jM == 0) {
            jM = ggaVar.r;
        }
        long j2 = jM;
        int iN = ziaVar.n();
        if (iN == 0) {
            iN = ggaVar.q;
        }
        int i2 = iN;
        long jL = ziaVar.l();
        if (jL == 0) {
            jL = ggaVar.t;
        }
        long j3 = jL;
        String strJ = ziaVar.j();
        if (strJ == null) {
            strJ = ggaVar.v;
        }
        String str3 = strJ;
        String strK = ziaVar.k();
        if (strK == null) {
            strK = ggaVar.u;
        }
        String str4 = strK;
        String strI = ziaVar.i();
        if (strI == null) {
            strI = ggaVar.w;
        }
        String str5 = strI;
        int iH = ziaVar.h();
        if (iH == 0) {
            iH = ggaVar.K;
        }
        int i3 = iH;
        kja kjaVarQ = ziaVar.q();
        if (kjaVarQ == null) {
            kjaVarQ = ggaVar.G;
        }
        return zia.a(ziaVar, ggaVar.a, l3 != null ? l3.longValue() : ziaVar.s(), j, l4 != null ? l4.longValue() : ziaVar.c(), str2, kjaVarQ, i2, j2, ggaVar.s && ziaVar.f(), j3, str4, str3, str5, i3, 33292596);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object c(wna wnaVar, Map map, nq4 nq4Var) {
        vna vnaVar;
        Iterator it;
        int i;
        Object obj;
        hu4 hu4Var;
        if (nq4Var instanceof vna) {
            vnaVar = (vna) nq4Var;
            int i2 = vnaVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vnaVar.i = i2 - Integer.MIN_VALUE;
            } else {
                vnaVar = new vna(wnaVar, nq4Var);
            }
        } else {
            vnaVar = new vna(wnaVar, nq4Var);
        }
        Object obj2 = vnaVar.g;
        int i3 = vnaVar.i;
        if (i3 == 0) {
            ch3.d0(obj2);
            it = map.entrySet().iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = vnaVar.f;
            Iterator it2 = vnaVar.e;
            wna wnaVar2 = vnaVar.d;
            ch3.d0(obj2);
            it = it2;
            i = i4;
            wnaVar = wnaVar2;
        }
        do {
            boolean zHasNext = it.hasNext();
            obj = sbi.a;
            if (!zHasNext) {
                return obj;
            }
            Map.Entry entry = (Map.Entry) it.next();
            long jLongValue = ((Number) entry.getKey()).longValue();
            vja vjaVar = (vja) entry.getValue();
            int i5 = vjaVar.a;
            int i6 = vjaVar.b;
            vnaVar.d = wnaVar;
            vnaVar.e = it;
            vnaVar.f = i;
            vnaVar.i = 1;
            Object objI = ch3.I(vnaVar, ((toa) wnaVar).a, false, true, new zna(jLongValue, i5, i6, 0));
            hu4Var = hu4.a;
            if (objI == hu4Var) {
                obj = objI;
            }
        } while (obj != hu4Var);
        return hu4Var;
    }
}
