package defpackage;

import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class r9c extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ t9c f;
    public final /* synthetic */ StartConversationDelegate.Params g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9c(t9c t9cVar, StartConversationDelegate.Params params, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = t9cVar;
        this.g = params;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new r9c(this.f, this.g, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((r9c) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        this.e = 1;
        Object objA = t9c.a(this.f, this.g, this);
        hu4 hu4Var = hu4.a;
        return objA == hu4Var ? hu4Var : objA;
    }
}
