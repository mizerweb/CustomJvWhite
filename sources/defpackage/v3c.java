package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v3c extends mdh implements cf7 {
    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new v3c(1, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        v3c v3cVar = (v3c) create((lq4) obj);
        sbi sbiVar = sbi.a;
        v3cVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        return sbi.a;
    }
}
