package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class zc1 extends mdh implements wf7 {
    public /* synthetic */ a80 e;
    public /* synthetic */ ao1 f;
    public /* synthetic */ boolean g;
    public /* synthetic */ boolean h;
    public final /* synthetic */ jd1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc1(jd1 jd1Var, lq4 lq4Var) {
        super(5, lq4Var);
        this.i = jd1Var;
    }

    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        zc1 zc1Var = new zc1(this.i, (lq4) serializable);
        zc1Var.e = (a80) obj;
        zc1Var.f = (ao1) obj2;
        zc1Var.g = zBooleanValue;
        zc1Var.h = zBooleanValue2;
        sbi sbiVar = sbi.a;
        zc1Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        a80 a80Var = this.e;
        ao1 ao1Var = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        ch3.d0(obj);
        jd1 jd1Var = this.i;
        mjg mjgVar = jd1Var.o;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, jd1Var.B(a80Var, ao1Var, z, ao1Var.h, z2)));
        return sbi.a;
    }
}
