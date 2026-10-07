package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class evj {
    public final ny8 a;
    public final ny8 b;

    public evj(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var2;
        this.b = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(nq4 nq4Var) {
        dvj dvjVar;
        String[] strArr;
        Long lC0;
        if (nq4Var instanceof dvj) {
            dvjVar = (dvj) nq4Var;
            int i = dvjVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvjVar.f = i - Integer.MIN_VALUE;
            } else {
                dvjVar = new dvj(this, nq4Var);
            }
        } else {
            dvjVar = new dvj(this, nq4Var);
        }
        Object objA = dvjVar.d;
        int i2 = dvjVar.f;
        if (i2 == 0) {
            ch3.d0(objA);
            List list = (List) ((g5d) ((gjf) this.b.getValue())).a.A0.a(e5d.S6[77]).i();
            if (list == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            if (strArr.length == 0) {
                gm0.Y(evj.class.getName(), "Early return in invoke cuz of stickers.isEmpty()");
                return null;
            }
            h4e h4eVar = i4e.a;
            if (strArr.length == 0) {
                ore.f("Array is empty.");
                return null;
            }
            String str = strArr[i4e.b.d(strArr.length)];
            if (str == null || (lC0 = y5h.C0(str)) == null) {
                gm0.Y(evj.class.getName(), "Early return in invoke cuz of stickers.random()?.toLongOrNull() is null");
                return null;
            }
            long jLongValue = lC0.longValue();
            ing ingVar = (ing) this.a.getValue();
            dvjVar.f = 1;
            objA = ingVar.a(jLongValue, dvjVar);
            Object obj = hu4.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objA);
        }
        clg clgVar = (clg) objA;
        if (clgVar == null) {
            return null;
        }
        long j = clgVar.a;
        long j2 = clgVar.k;
        return new tlg(j, j2, j2, clgVar.h, clgVar.l, clgVar.o, clgVar.b, clgVar.c, false, false, 0L, 0, 15936);
    }
}
