package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes2.dex */
public final class jv6 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final String g = jv6.class.getName();

    public jv6(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    /* JADX WARN: Code duplicated, block: B:56:0x017a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(long j, long j2, nq4 nq4Var) throws TamErrorException {
        iv6 iv6Var;
        rt2 rt2Var;
        sfa sfaVar;
        long j3;
        long j4;
        gda gdaVar;
        String str;
        a4c a4cVar;
        je9 je9Var;
        long j5 = j;
        long j6 = j2;
        je9 je9Var2 = je9.f;
        if (nq4Var instanceof iv6) {
            iv6Var = (iv6) nq4Var;
            int i = iv6Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                iv6Var.j = i - Integer.MIN_VALUE;
            } else {
                iv6Var = new iv6(this, nq4Var);
            }
        } else {
            iv6Var = new iv6(this, nq4Var);
        }
        Object objF = iv6Var.h;
        hu4 hu4Var = hu4.a;
        int i2 = iv6Var.j;
        if (i2 != 0) {
            if (i2 == 1) {
                long j7 = iv6Var.e;
                long j8 = iv6Var.d;
                rt2Var = iv6Var.f;
                ch3.d0(objF);
                j6 = j7;
                j5 = j8;
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = iv6Var.e;
                j4 = iv6Var.d;
                sfaVar = iv6Var.g;
                ch3.d0(objF);
            }
            gdaVar = ((p3b) objF).c;
            if (gdaVar == null) {
                str = this.g;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, c0a.m(j3, ") cuz response.message is null", qt4.s(j4, "finish poll cancelled for chat(", ") and message(")), null);
                    }
                }
                throw new TamErrorException(new shh());
            }
            sua suaVar = (sua) this.d.getValue();
            c46 c46VarE = pm9.e(gdaVar.h, (m7f) this.e.getValue());
            ((ose) suaVar.a).C(sfaVar.a, new oo(sfaVar, c46VarE, suaVar, 17));
            ((t51) this.b.getValue()).c(new kfi(j4, j3, false));
            return sbi.a;
        }
        ch3.d0(objF);
        rt2Var = (rt2) ((xn3) this.c.getValue()).k(j5).a.getValue();
        if (rt2Var == null) {
            String str2 = this.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, c0a.m(j6, ") cuz chat is null", qt4.s(j5, "finish poll cancelled for chat(", ") and message(")), null);
            }
            throw new TamErrorException(new shh());
        }
        sua suaVar2 = (sua) this.d.getValue();
        iv6Var.f = rt2Var;
        iv6Var.d = j5;
        iv6Var.e = j6;
        iv6Var.j = 1;
        objF = suaVar2.f(j6, iv6Var);
        if (objF == hu4Var) {
            return hu4Var;
        }
        sfa sfaVar2 = (sfa) objF;
        if (sfaVar2 == null) {
            String str3 = this.g;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, str3, c0a.m(j6, ") cuz message is null", qt4.s(j5, "finish poll cancelled for chat(", ") and message(")), null);
            }
            throw new TamErrorException(new shh());
        }
        o5d o5dVarU = sfaVar2.u();
        if (o5dVarU == null) {
            String str4 = this.g;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                a4cVar4.c(je9Var2, str4, c0a.m(j6, ") cuz poll is null", qt4.s(j5, "finish poll cancelled for chat(", ") and message(")), null);
            }
            throw new TamErrorException(new shh());
        }
        o5d o5dVarA = o5d.a(o5dVarU, o5dVarU.d | 8, null, 55);
        c60 c60Var = new c60();
        c60Var.a = y60.o;
        c60Var.x = o5dVarA;
        e70 e70VarA = c60Var.a();
        f70 f70Var = new f70();
        f70Var.a(e70VarA);
        b50 b50VarD = pm9.d(f70Var.c(), (wo6) this.f.getValue());
        ghb ghbVar = ew5.b;
        long jO = qe7.O(5, lw5.SECONDS);
        long j9 = j5;
        long j10 = j6;
        vk4 vk4Var = new vk4(17, (lq4) null, this, rt2Var, sfaVar2, b50VarD);
        iv6Var.f = null;
        iv6Var.g = sfaVar2;
        iv6Var.d = j9;
        iv6Var.e = j10;
        iv6Var.j = 2;
        objF = lvb.K0(jO, vk4Var, iv6Var);
        if (objF == hu4Var) {
            return hu4Var;
        }
        sfaVar = sfaVar2;
        j3 = j10;
        j4 = j9;
        gdaVar = ((p3b) objF).c;
        if (gdaVar == null) {
            str = this.g;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, c0a.m(j3, ") cuz response.message is null", qt4.s(j4, "finish poll cancelled for chat(", ") and message(")), null);
                }
            }
            throw new TamErrorException(new shh());
        }
        sua suaVar3 = (sua) this.d.getValue();
        c46 c46VarE2 = pm9.e(gdaVar.h, (m7f) this.e.getValue());
        ((ose) suaVar3.a).C(sfaVar.a, new oo(sfaVar, c46VarE2, suaVar3, 17));
        ((t51) this.b.getValue()).c(new kfi(j4, j3, false));
        return sbi.a;
    }
}
