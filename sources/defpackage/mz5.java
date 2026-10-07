package defpackage;

import java.util.List;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes3.dex */
public final class mz5 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public mz5(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(q24 q24Var, long j, String str, List list, wja wjaVar, nq4 nq4Var) {
        lz5 lz5Var;
        long j2;
        q24 q24Var2;
        s04 s04Var;
        long j3;
        long j4;
        q24 q24Var3;
        ky3 ky3Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof lz5) {
            lz5Var = (lz5) nq4Var;
            int i = lz5Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                lz5Var.j = i - Integer.MIN_VALUE;
            } else {
                lz5Var = new lz5(this, nq4Var);
            }
        } else {
            lz5Var = new lz5(this, nq4Var);
        }
        Object objR = lz5Var.h;
        hu4 hu4Var = hu4.a;
        int i2 = lz5Var.j;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                j3 = lz5Var.g;
                j2 = lz5Var.f;
                s04Var = lz5Var.e;
                q24Var2 = lz5Var.d;
                ch3.d0(objR);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = lz5Var.f;
                s04Var = lz5Var.e;
                q24Var3 = lz5Var.d;
                ch3.d0(objR);
            }
            ky3Var = (ky3) objR;
            if (ky3Var != null) {
                ((b) this.c.getValue()).d(s04Var, ky3Var);
            }
            ((p24) this.d.getValue()).a(new az3(q24Var3, c0a.s(j4), false));
            return sbiVar;
        }
        ch3.d0(objR);
        s04 s04Var2 = (s04) ((r8e) ((xn3) this.b.getValue()).c.i(q24Var)).a.getValue();
        if (s04Var2 == null) {
            String name = mz5.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "comments chat " + q24Var + " is null", null);
                }
            }
            return sbiVar;
        }
        ((b) this.c.getValue()).h.remove(Long.valueOf(j));
        long jF = ((s7f) ((et3) this.e.getValue())).f();
        l34 l34Var = (l34) this.a.getValue();
        lz5Var.d = q24Var;
        lz5Var.e = s04Var2;
        lz5Var.f = j;
        lz5Var.g = jF;
        lz5Var.j = 1;
        g24 g24VarM = l34Var.m();
        Object objI = ch3.I(lz5Var, g24VarM.a, false, true, new w14(g24VarM, i3, new qei(j, str, list, wjaVar, jF)));
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            j2 = j;
            q24Var2 = q24Var;
            s04Var = s04Var2;
            j3 = jF;
        }
        return hu4Var;
        l34 l34Var2 = (l34) this.a.getValue();
        lz5Var.d = q24Var2;
        lz5Var.e = s04Var;
        lz5Var.f = j2;
        lz5Var.g = j3;
        lz5Var.j = 2;
        objR = l34Var2.r(j2, lz5Var);
        if (objR != hu4Var) {
            j4 = j2;
            q24Var3 = q24Var2;
            ky3Var = (ky3) objR;
            if (ky3Var != null) {
                ((b) this.c.getValue()).d(s04Var, ky3Var);
            }
            ((p24) this.d.getValue()).a(new az3(q24Var3, c0a.s(j4), false));
            return sbiVar;
        }
        return hu4Var;
    }
}
