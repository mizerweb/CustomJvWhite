package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wad extends nq4 {
    public long d;
    public af7 e;
    public wfe f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zad h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wad(zad zadVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = zadVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(0L, null, this);
    }
}
