package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class m7b implements fxi {
    public final /* synthetic */ int a;
    public final rwi b;

    public m7b() {
        this.a = 1;
        this.b = new e3d();
    }

    @Override // defpackage.fxi
    public final hxi a(Context context, ex3 ex3Var, p51 p51Var, gxi gxiVar, Executor executor, long j, boolean z) {
        switch (this.a) {
            case 0:
                return new n7b(p51Var, ex3Var, this.b, gxiVar, context, executor, z);
            default:
                try {
                    return ((fxi) m8g.class.getConstructor(rwi.class).newInstance((e3d) this.b)).a(context, ex3Var, p51Var, gxiVar, executor, j, z);
                } catch (Exception e) {
                    qr7.w(e);
                    return null;
                }
        }
    }

    public m7b(rwi rwiVar) {
        this.a = 0;
        this.b = rwiVar;
    }
}
