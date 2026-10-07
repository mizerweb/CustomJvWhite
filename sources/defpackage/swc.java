package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class swc extends mdh implements qf7 {
    public double e;
    public double f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ wwc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swc(wwc wwcVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = wwcVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        swc swcVar = new swc(this.i, lq4Var);
        swcVar.h = obj;
        return swcVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((swc) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        double d;
        double d2;
        Object objB;
        ylc ylcVar = (ylc) this.h;
        int i = this.g;
        if (i == 0) {
            ch3.d0(obj);
            double dDoubleValue = ((Number) ylcVar.a).doubleValue();
            double dDoubleValue2 = ((Number) ylcVar.b).doubleValue();
            wwc wwcVar = this.i;
            rwc rwcVar = (rwc) wwcVar.m.a.getValue();
            mjg mjgVar = wwcVar.l;
            rwc rwcVarA = rwc.a((rwc) mjgVar.getValue(), null, null, null, null, null, null, true, 63);
            mjgVar.getClass();
            mjgVar.j(null, rwcVarA);
            fih fihVar = (fih) wwcVar.f.getValue();
            Double d3 = rwcVar.a;
            double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
            Double d4 = rwcVar.b;
            double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
            this.h = null;
            this.e = dDoubleValue;
            this.f = dDoubleValue2;
            this.g = 1;
            d = dDoubleValue2;
            d2 = dDoubleValue;
            objB = fihVar.b(d2, d, dDoubleValue3, dDoubleValue4, this);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d5 = this.f;
            double d6 = this.e;
            ch3.d0(obj);
            d = d5;
            d2 = d6;
            objB = obj;
        }
        return new e5i(new Double(d2), new Double(d), (String) objB);
    }
}
