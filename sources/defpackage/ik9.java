package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ik9 extends mdh implements qf7 {
    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ik9(2, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        ik9 ik9Var = (ik9) create((sbi) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        ik9Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        return sbi.a;
    }
}
