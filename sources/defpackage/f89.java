package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f89 implements s72 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ String b;
    public final /* synthetic */ af7 c;

    public /* synthetic */ f89(Executor executor, String str, af7 af7Var) {
        this.a = executor;
        this.b = str;
        this.c = af7Var;
    }

    @Override // defpackage.s72
    public final Object Q(r72 r72Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        r72Var.a(new g89(atomicBoolean, 0), hm5.a);
        this.a.execute(new h89(atomicBoolean, r72Var, this.c, 0));
        return this.b;
    }
}
