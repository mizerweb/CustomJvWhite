package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j2c extends mdh implements cf7 {
    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new j2c(1, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        j2c j2cVar = (j2c) create((lq4) obj);
        sbi sbiVar = sbi.a;
        j2cVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        return sbi.a;
    }
}
