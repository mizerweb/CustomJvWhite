package defpackage;

import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class s9c extends nq4 {
    public StartConversationDelegate.Params d;
    public /* synthetic */ Object e;
    public final /* synthetic */ t9c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9c(t9c t9cVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = t9cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return t9c.a(this.f, null, this);
    }
}
