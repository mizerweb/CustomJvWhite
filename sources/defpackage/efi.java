package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class efi extends nq4 {
    public m8b d;
    public c9b e;
    public Object[] f;
    public long[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ffi p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efi(ffi ffiVar, nq4 nq4Var) {
        super(nq4Var);
        this.p = ffiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.h(null, null, null, this);
    }
}
