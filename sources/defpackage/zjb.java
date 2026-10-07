package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zjb {
    public final zed a;
    public final t51 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final String g = zjb.class.getName();

    public zjb(ny8 ny8Var, zed zedVar, t51 t51Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = zedVar;
        this.b = t51Var;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(xjb xjbVar, nq4 nq4Var) {
        yjb yjbVar;
        xjb xjbVar2;
        rt2 rt2Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof yjb) {
            yjbVar = (yjb) nq4Var;
            int i = yjbVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                yjbVar.h = i - Integer.MIN_VALUE;
            } else {
                yjbVar = new yjb(this, nq4Var);
            }
        } else {
            yjbVar = new yjb(this, nq4Var);
        }
        yjb yjbVar2 = yjbVar;
        Object obj = yjbVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = yjbVar2.h;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onNotifMark, response = " + xjbVar, null);
                }
            }
            rt2 rt2VarK = ((qw2) this.d.getValue()).K(xjbVar.c);
            if (rt2VarK == null) {
                String str2 = this.g;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "onNotifMark chat not found", null);
                        return sbiVar;
                    }
                }
            } else {
                lei leiVar = (lei) this.f.getValue();
                long j = rt2VarK.a;
                long j2 = xjbVar.d;
                long j3 = xjbVar.e;
                int i3 = xjbVar.f;
                yjbVar2.d = xjbVar;
                yjbVar2.e = rt2VarK;
                yjbVar2.h = 1;
                if (leiVar.a(j, j2, j3, (32 & 8) != 0 ? -1 : i3, (32 & 16) == 0, false, yjbVar2) == hu4Var) {
                    return hu4Var;
                }
                xjbVar2 = xjbVar;
                rt2Var = rt2VarK;
            }
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rt2Var = yjbVar2.e;
        xjbVar2 = yjbVar2.d;
        ch3.d0(obj);
        ((wzj) this.c.getValue()).c(new vlf(rt2Var.a));
        if (xjbVar2.d == this.a.a.t()) {
            String str3 = this.g;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var3 = je9.e;
                if (a4cVar3.b(je9Var3)) {
                    a4cVar3.c(je9Var3, str3, "onNotifMark, already read from another device", null);
                }
            }
            this.b.c(new wo3((Collection) xw3.R0(new Long(rt2Var.a)), false, false, (mg5) null, (cid) null, (Set) null, 124));
            int i4 = xjbVar2.f;
            ny8 ny8Var = this.e;
            if (i4 <= 0) {
                ((h5c) ny8Var.getValue()).b(rt2Var.b.a);
                return sbiVar;
            }
            ((h5c) ny8Var.getValue()).g(rt2Var.b.a, null);
        }
        return sbiVar;
    }
}
