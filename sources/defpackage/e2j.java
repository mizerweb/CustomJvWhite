package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e2j extends mdh implements tf7 {
    public /* synthetic */ long e;
    public /* synthetic */ boolean f;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        e2j e2jVar = new e2j(3, (lq4) obj3);
        e2jVar.e = jLongValue;
        e2jVar.f = zBooleanValue;
        return e2jVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j = this.e;
        boolean z = this.f;
        ch3.d0(obj);
        if (z) {
            return new Long(j);
        }
        return null;
    }
}
