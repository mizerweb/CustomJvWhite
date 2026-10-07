package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vo0 extends mdh implements tf7 {
    public /* synthetic */ boolean e;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        vo0 vo0Var = new vo0(3, (lq4) obj3);
        vo0Var.e = zBooleanValue;
        return vo0Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.e;
        ch3.d0(obj);
        return Boolean.valueOf(z);
    }
}
