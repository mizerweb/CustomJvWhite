package defpackage;

import com.vk.push.core.filedatastore.FileDataSource;

/* JADX INFO: loaded from: classes2.dex */
public final class lq6 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ FileDataSource e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq6(FileDataSource fileDataSource, lq4 lq4Var) {
        super(lq4Var);
        this.e = fileDataSource;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objM18getDataIoAF18A = this.e.m18getDataIoAF18A(this);
        return objM18getDataIoAF18A == hu4.a ? objM18getDataIoAF18A : new roe(objM18getDataIoAF18A);
    }
}
