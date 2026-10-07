package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pr8 extends nq4 {
    public int d;
    public int e;
    public Integer f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ sr8 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr8(sr8 sr8Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = sr8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.B(0, null, 0, false, this);
    }
}
