package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yjd extends nq4 {
    public yhh d;
    public /* synthetic */ Object e;
    public final /* synthetic */ akd f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjd(akd akdVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = akdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.i(null, this);
    }
}
