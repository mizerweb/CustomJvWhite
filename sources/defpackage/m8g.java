package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class m8g implements fxi {
    public final rwi a;

    public m8g(rwi rwiVar) {
        this.a = rwiVar;
    }

    @Override // defpackage.fxi
    public final hxi a(Context context, ex3 ex3Var, p51 p51Var, gxi gxiVar, Executor executor, long j, boolean z) {
        return new n8g(p51Var, ex3Var, this.a, gxiVar, context, executor, z);
    }
}
