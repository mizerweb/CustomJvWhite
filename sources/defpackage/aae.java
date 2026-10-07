package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aae {
    public final rre a;
    public final ig0 b = new ig0(10);
    public final onb c = new onb(1);

    public aae(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(aae aaeVar, ArrayList arrayList, nq4 nq4Var) {
        x9e x9eVar;
        if (nq4Var instanceof x9e) {
            x9eVar = (x9e) nq4Var;
            int i = x9eVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                x9eVar.h = i - Integer.MIN_VALUE;
            } else {
                x9eVar = new x9e(aaeVar, nq4Var);
            }
        } else {
            x9eVar = new x9e(aaeVar, nq4Var);
        }
        Object obj = x9eVar.f;
        int i2 = x9eVar.h;
        int i3 = 0;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            x9eVar.d = aaeVar;
            x9eVar.e = arrayList;
            x9eVar.h = 1;
            Object objI = ch3.I(x9eVar, aaeVar.a, false, true, new skd(15));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = x9eVar.e;
        aaeVar = x9eVar.d;
        ch3.d0(obj);
        x9eVar.d = null;
        x9eVar.e = null;
        x9eVar.h = 2;
        Object objI2 = ch3.I(x9eVar, aaeVar.a, false, true, new y9e(aaeVar, arrayList, i3));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        return objI2 == hu4Var ? hu4Var : sbiVar;
    }

    public final r07 a(List list) {
        tj1 tj1Var = new tj1(6, nbh.x(") ORDER BY `recent_time` DESC", nbh.C("SELECT * FROM recent WHERE recent_type IN ("), list), list);
        return ch3.i(this.a, new String[]{"recent"}, tj1Var);
    }
}
