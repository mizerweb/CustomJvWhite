package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e26 extends mdh implements xf7 {
    public /* synthetic */ boolean e;
    public /* synthetic */ List f;
    public /* synthetic */ omh g;
    public /* synthetic */ boolean h;
    public /* synthetic */ y26 i;

    public e26(lq4 lq4Var) {
        super(6, lq4Var);
    }

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        e26 e26Var = new e26((lq4) obj6);
        e26Var.e = zBooleanValue;
        e26Var.f = (List) obj2;
        e26Var.g = (omh) obj3;
        e26Var.h = zBooleanValue2;
        e26Var.i = (y26) obj5;
        return e26Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.e;
        List list = this.f;
        omh omhVar = this.g;
        boolean z2 = this.h;
        y26 y26Var = this.i;
        ch3.d0(obj);
        return Boolean.valueOf(z && list.isEmpty() && (omhVar instanceof mmh) && !z2 && (y26Var == null || y26Var.a.isEmpty()));
    }
}
