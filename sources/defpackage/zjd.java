package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zjd extends nq4 {
    public dmd d;
    public /* synthetic */ Object e;
    public final /* synthetic */ akd f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjd(akd akdVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = akdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.k(null, this);
    }
}
