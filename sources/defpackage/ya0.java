package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 extends mdh implements tf7 {
    public /* synthetic */ lza e;
    public /* synthetic */ float f;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        ya0 ya0Var = new ya0(3, (lq4) obj3);
        ya0Var.e = (lza) obj;
        ya0Var.f = fFloatValue;
        return ya0Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        lza lzaVar = this.e;
        float f = this.f;
        ch3.d0(obj);
        if (!(lzaVar instanceof kza) || !((kza) lzaVar).i) {
            f = 0.0f;
        }
        return new Float(f);
    }
}
