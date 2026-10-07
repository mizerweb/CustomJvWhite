package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class a3h extends mdh implements vf7 {
    public /* synthetic */ Throwable e;
    public final /* synthetic */ b3h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3h(b3h b3hVar, lq4 lq4Var) {
        super(4, lq4Var);
        this.f = b3hVar;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        a3h a3hVar = new a3h(this.f, (lq4) obj4);
        a3hVar.e = (Throwable) obj2;
        return a3hVar.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.e;
        ch3.d0(obj);
        return Boolean.valueOf((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b));
    }
}
