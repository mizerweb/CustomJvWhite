package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class l9g extends nq4 {
    public m9g d;
    public File e;
    public FileOutputStream f;
    public FileOutputStream g;
    public /* synthetic */ Object h;
    public final /* synthetic */ m9g i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9g(m9g m9gVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = m9gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.j(null, this);
    }
}
