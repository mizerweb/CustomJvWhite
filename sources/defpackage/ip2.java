package defpackage;

import java.io.File;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ip2 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public ip2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var3;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(long j, String str, r60 r60Var, nq4 nq4Var) {
        hp2 hp2Var;
        String str2;
        r60 r60Var2;
        Object poeVar;
        Object objF;
        long j2 = j;
        if (nq4Var instanceof hp2) {
            hp2Var = (hp2) nq4Var;
            int i = hp2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                hp2Var.i = i - Integer.MIN_VALUE;
            } else {
                hp2Var = new hp2(this, nq4Var);
            }
        } else {
            hp2Var = new hp2(this, nq4Var);
        }
        Object objD = hp2Var.g;
        int i2 = hp2Var.i;
        int i3 = 2;
        lq4 lq4Var = null;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objD);
            ny8 ny8Var = this.a;
            ((xn3) ny8Var.getValue()).j().r(j2, uw2.b);
            xn3 xn3Var = (xn3) ny8Var.getValue();
            c9 c9Var = new c9(i3, lq4Var, 6);
            hp2Var.e = str;
            hp2Var.f = r60Var;
            hp2Var.d = j2;
            hp2Var.i = 1;
            objD = xn3Var.d(j2, c9Var, hp2Var);
            if (objD != hu4Var) {
                str2 = str;
                r60Var2 = r60Var;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objD);
                return objD;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = hp2Var.d;
        r60 r60Var3 = hp2Var.f;
        String str3 = hp2Var.e;
        ch3.d0(objD);
        r60Var2 = r60Var3;
        str2 = str3;
        long j3 = j2;
        if (((rt2) objD) == null) {
            return new Long(0L);
        }
        ((t51) this.c.getValue()).c(new wo3((Collection) c0a.s(j3), false, false, (mg5) null, (cid) null, (Set) null, 124));
        pvb pvbVar = (pvb) this.b.getValue();
        hp2Var.e = null;
        hp2Var.f = null;
        hp2Var.d = j3;
        hp2Var.i = 2;
        long jG = pvbVar.u().a.g();
        try {
            poeVar = Long.valueOf(new File(str2).lastModified());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = 0L;
        }
        op2 op2Var = new op2(jG, str2, j3, r60Var2, ((Number) poeVar).longValue());
        wzj wzjVar = (wzj) pvbVar.d.getValue();
        if (wzjVar instanceof yz8) {
            objF = new Long(((yz8) wzjVar).e(op2Var));
        } else {
            if (!(wzjVar instanceof jgb)) {
                qr7.v(wzjVar, "unknown implementation ");
                return null;
            }
            objF = ((jgb) wzjVar).f(op2Var, hp2Var);
        }
        return objF == hu4Var ? hu4Var : objF;
    }
}
