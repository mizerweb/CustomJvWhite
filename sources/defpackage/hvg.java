package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hvg extends mdh implements tf7 {
    public /* synthetic */ int e;
    public /* synthetic */ boolean f;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        hvg hvgVar = new hvg(3, (lq4) obj3);
        hvgVar.e = iIntValue;
        hvgVar.f = zBooleanValue;
        return hvgVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        boolean z = this.f;
        ch3.d0(obj);
        return Boolean.valueOf(i == 0 && !z);
    }
}
