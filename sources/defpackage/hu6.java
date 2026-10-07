package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class hu6 extends nq4 {
    public Closeable d;
    public InputStream e;
    public Closeable f;
    public OutputStream g;
    public byte[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ku6 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu6(ku6 ku6Var, nq4 nq4Var) {
        super(nq4Var);
        this.o = ku6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.u(null, null, this);
    }
}
