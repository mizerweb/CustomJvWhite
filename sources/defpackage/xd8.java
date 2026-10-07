package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xd8 extends mdh implements tf7 {
    public /* synthetic */ boolean e;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        xd8 xd8Var = new xd8(3, (lq4) obj3);
        xd8Var.e = zBooleanValue;
        return xd8Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.e;
        ch3.d0(obj);
        return Boolean.valueOf(z);
    }
}
