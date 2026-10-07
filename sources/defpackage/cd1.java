package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class cd1 extends mdh implements wf7 {
    public /* synthetic */ boolean e;
    public /* synthetic */ boolean f;
    public /* synthetic */ boolean g;
    public /* synthetic */ boolean h;

    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        cd1 cd1Var = new cd1(5, (lq4) serializable);
        cd1Var.e = zBooleanValue;
        cd1Var.f = zBooleanValue2;
        cd1Var.g = zBooleanValue3;
        cd1Var.h = zBooleanValue4;
        return cd1Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        ch3.d0(obj);
        boolean z5 = false;
        if (z4 && !z3 && z2 && z) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
