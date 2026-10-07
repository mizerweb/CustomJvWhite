package defpackage;

import java.nio.file.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class s3c extends nq4 {
    public Path d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x3c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3c(x3c x3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = x3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        x3c.a(this.f, this);
        return hu4.a;
    }
}
