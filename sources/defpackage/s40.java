package defpackage;

import ru.ok.tamtam.messages.a;

/* JADX INFO: loaded from: classes3.dex */
public final class s40 extends mdh implements qf7 {
    public yf5 e;
    public String f;
    public String g;
    public Integer h;
    public boolean i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ t40 m;
    public final /* synthetic */ sfa n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Long p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(t40 t40Var, sfa sfaVar, int i, Long l, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = t40Var;
        this.n = sfaVar;
        this.o = i;
        this.p = l;
        this.q = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        s40 s40Var = new s40(this.m, this.n, this.o, this.p, this.q, lq4Var);
        s40Var.l = obj;
        return s40Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((s40) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ec  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zA;
        int i;
        yf5 yf5VarH;
        Object objP;
        String str;
        Object objZ0;
        Integer num;
        String str2;
        boolean z;
        Integer num2;
        gu4 gu4Var = (gu4) this.l;
        int i2 = this.k;
        sfa sfaVar = this.n;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            t40 t40Var = this.m;
            fda fdaVarA = a.a((a) t40Var.e.getValue(), sfaVar);
            zA = ((tt7) t40Var.i.getValue()).a(sfaVar);
            yf5 yf5VarH2 = yab.h(gu4Var, null, 0, new r40(this.m, this.n, this.p, this.q, null), 3);
            int iH = this.o;
            if (iH == 0) {
                iH = ((p4c) t40Var.h.getValue()).h();
            }
            i = iH;
            yf5VarH = yab.h(gu4Var, null, 0, new q40(this.m, fdaVarA, this.p, i, zA, (lq4) null), 3);
            this.l = null;
            this.e = yf5VarH;
            this.i = zA;
            this.j = i;
            this.k = 1;
            objP = yf5VarH2.p(this);
            if (objP != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            int i3 = this.j;
            boolean z2 = this.i;
            yf5VarH = this.e;
            ch3.d0(obj);
            i = i3;
            zA = z2;
            objP = obj;
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = this.i;
            Integer num3 = this.h;
            str = this.g;
            String str3 = this.f;
            ch3.d0(obj);
            objZ0 = obj;
            z = z3;
            num = num3;
            str2 = str3;
        }
        String str4 = str;
        CharSequence charSequence = (CharSequence) objZ0;
        Integer num4 = new Integer(sfaVar.m());
        int iIntValue = num4.intValue();
        if (this.p == null || iIntValue <= 1) {
            num2 = null;
        } else {
            num2 = num4;
        }
        return new n40(charSequence, str2, str4, num, num2, sfaVar.I(), z);
        o40 o40Var = (o40) objP;
        String str5 = o40Var.a;
        str = o40Var.b;
        Integer num5 = o40Var.c;
        this.l = null;
        this.e = null;
        this.f = str5;
        this.g = str;
        this.h = num5;
        this.i = zA;
        this.j = i;
        this.k = 2;
        objZ0 = yf5VarH.z0(this);
        if (objZ0 != hu4Var) {
            num = num5;
            str2 = str5;
            z = zA;
            String str6 = str;
            CharSequence charSequence2 = (CharSequence) objZ0;
            Integer num6 = new Integer(sfaVar.m());
            int iIntValue2 = num6.intValue();
            if (this.p == null) {
                num2 = null;
            } else {
                num2 = null;
            }
            return new n40(charSequence2, str2, str6, num, num2, sfaVar.I(), z);
        }
        return hu4Var;
    }
}
