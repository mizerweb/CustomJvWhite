package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jh8 extends mdh implements tf7 {
    public /* synthetic */ String e;
    public /* synthetic */ int f;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        jh8 jh8Var = new jh8(3, (lq4) obj3);
        jh8Var.e = (String) obj;
        jh8Var.f = iIntValue;
        return jh8Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String str = this.e;
        int i = this.f;
        ch3.d0(obj);
        return Boolean.valueOf(str.length() > 0 || i == -1);
    }
}
