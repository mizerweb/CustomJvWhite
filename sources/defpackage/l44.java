package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l44 {
    public final qs8 a;
    public final ny8 b;
    public jdj c;

    public l44(qs8 qs8Var, ny8 ny8Var) {
        this.a = qs8Var;
        this.b = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(hr2 hr2Var, ms8 ms8Var, pkj pkjVar, String str, lq4 lq4Var) {
        k44 k44Var;
        String str2;
        pkj pkjVar2;
        ms8 ms8Var2 = ms8Var;
        if (lq4Var instanceof k44) {
            k44Var = (k44) lq4Var;
            int i = k44Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                k44Var.i = i - Integer.MIN_VALUE;
            } else {
                k44Var = new k44(this, lq4Var);
            }
        } else {
            k44Var = new k44(this, lq4Var);
        }
        Object obj = k44Var.g;
        int i2 = k44Var.i;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.n(l44.class.getName(), "Error in method: " + pkjVar.h() + " - " + ms8Var2.a(pkjVar.i()));
            if (str == null) {
                gm0.Y(l44.class.getName(), "No request id or wrong type");
                return sbiVar;
            }
            String strH = pkjVar.h();
            ya6 ya6Var = new ya6(str, new xa6(ms8Var2.a(pkjVar.i())));
            qs8 qs8Var = this.a;
            qs8Var.getClass();
            Object fs8Var = new fs8(strH, qs8Var.b(ya6.Companion.serializer(), ya6Var), pkjVar.k());
            k44Var.d = ms8Var2;
            k44Var.e = pkjVar;
            k44Var.f = strH;
            k44Var.i = 1;
            Object objA = hr2Var.a(k44Var, fs8Var);
            Object obj2 = hu4.a;
            if (objA == obj2) {
                return obj2;
            }
            str2 = strH;
            pkjVar2 = pkjVar;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = k44Var.f;
            pkjVar2 = k44Var.e;
            ms8 ms8Var3 = k44Var.d;
            ch3.d0(obj);
            str2 = str3;
            ms8Var2 = ms8Var3;
        }
        int i3 = ms8Var2.b;
        Integer numA = pkjVar2.a();
        ns8 ns8VarB = ms8Var2.b();
        Integer num = ns8VarB != null ? new Integer(ns8VarB.b) : null;
        jdj jdjVar = this.c;
        if (jdjVar != null) {
            fgj.a((fgj) this.b.getValue(), str2, jdjVar.a, jdjVar.b, false, i3, numA, num, np0.m);
        }
        return sbiVar;
    }
}
