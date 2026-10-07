package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jnh extends mdh implements tf7 {
    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        jnh jnhVar = new jnh(3, (lq4) obj3);
        sbi sbiVar = sbi.a;
        jnhVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        return sbi.a;
    }
}
