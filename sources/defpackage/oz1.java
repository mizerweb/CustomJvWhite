package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oz1 extends mdh implements xf7 {
    public /* synthetic */ long e;
    public /* synthetic */ boolean f;
    public /* synthetic */ boolean g;
    public /* synthetic */ cd h;
    public /* synthetic */ boolean i;

    public oz1(lq4 lq4Var) {
        super(6, lq4Var);
    }

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        long jLongValue = ((Number) obj).longValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
        oz1 oz1Var = new oz1((lq4) obj6);
        oz1Var.e = jLongValue;
        oz1Var.f = zBooleanValue;
        oz1Var.g = zBooleanValue2;
        oz1Var.h = (cd) obj4;
        oz1Var.i = zBooleanValue3;
        return oz1Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        cd cdVar = this.h;
        boolean z3 = this.i;
        ch3.d0(obj);
        return Boolean.valueOf(z3 && z && !z2 && !cdVar.b.isEmpty() && j < cdVar.c && !cdVar.a.isEmpty());
    }
}
