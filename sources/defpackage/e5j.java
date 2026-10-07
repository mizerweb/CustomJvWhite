package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e5j extends mdh implements tf7 {
    public /* synthetic */ float e;
    public /* synthetic */ float f;
    public final /* synthetic */ x6a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5j(x6a x6aVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.g = x6aVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        e5j e5jVar = new e5j(this.g, (lq4) obj3);
        e5jVar.e = fFloatValue;
        e5jVar.f = fFloatValue2;
        sbi sbiVar = sbi.a;
        e5jVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        float f = this.e;
        float f2 = this.f;
        ch3.d0(obj);
        x6a x6aVar = this.g;
        if (x6aVar.g != f || x6aVar.h != f2) {
            x6aVar.g = oc9.u(f, 0.0f, 1.0f);
            x6aVar.h = oc9.u(f2, 0.0f, 1.0f);
            x6aVar.e();
            x6aVar.invalidate();
        }
        return sbi.a;
    }
}
