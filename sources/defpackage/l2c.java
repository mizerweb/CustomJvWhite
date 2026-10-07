package defpackage;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes.dex */
public final class l2c extends nq4 {
    public Path d;
    public Closeable e;
    public BufferedWriter f;
    public h41 g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ m2c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2c(m2c m2cVar, nq4 nq4Var) {
        super(nq4Var);
        this.k = m2cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return m2c.b(this.k, null, this);
    }
}
