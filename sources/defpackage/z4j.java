package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z4j extends mdh implements tf7 {
    public /* synthetic */ long e;
    public /* synthetic */ long f;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        z4j z4jVar = new z4j(3, (lq4) obj3);
        z4jVar.e = jLongValue;
        z4jVar.f = jLongValue2;
        return z4jVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j = this.e;
        long j2 = this.f;
        ch3.d0(obj);
        return new Float(oc9.u(j2 / j, 0.0f, 1.0f));
    }
}
