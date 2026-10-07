package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f26 extends mdh implements xf7 {
    public /* synthetic */ boolean e;
    public /* synthetic */ boolean f;
    public /* synthetic */ Long g;
    public /* synthetic */ omh h;
    public /* synthetic */ boolean i;

    public f26(lq4 lq4Var) {
        super(6, lq4Var);
    }

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
        f26 f26Var = new f26((lq4) obj6);
        f26Var.e = zBooleanValue;
        f26Var.f = zBooleanValue2;
        f26Var.g = (Long) obj3;
        f26Var.h = (omh) obj4;
        f26Var.i = zBooleanValue3;
        return f26Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.e;
        boolean z2 = this.f;
        Long l = this.g;
        omh omhVar = this.h;
        boolean z3 = this.i;
        ch3.d0(obj);
        return Boolean.valueOf(z && z2 && l == null && (omhVar instanceof mmh) && !z3);
    }
}
