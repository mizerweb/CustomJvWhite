package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ax0 implements k46 {
    public Context a;

    public ax0(Context context, int i) {
        switch (i) {
            case 2:
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.k46
    public void a(svl svlVar) {
        g94 g94Var = new g94("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), g94Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new i0(this, svlVar, threadPoolExecutor, 28));
    }

    public b15 b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        b15 b15Var = new b15();
        b15Var.a = ep5.a(ui6.a);
        yv4 yv4Var = new yv4(1, context);
        b15Var.b = yv4Var;
        b15Var.c = ep5.a(new owa(yv4Var, new yv4(0, yv4Var), 0));
        yv4 yv4Var2 = b15Var.b;
        b15Var.d = new wc6(yv4Var2, 1);
        Provider providerA = ep5.a(new wc6(yv4Var2, 0));
        b15Var.e = providerA;
        Provider providerA2 = ep5.a(new owa(b15Var.d, providerA, 1));
        b15Var.f = providerA2;
        nd6 nd6Var = new nd6(1);
        yv4 yv4Var3 = b15Var.b;
        k3f k3fVar = new k3f(yv4Var3, providerA2, nd6Var, 0);
        Provider provider = b15Var.a;
        Provider provider2 = b15Var.c;
        b15Var.g = ep5.a(new k3f(new jd5(provider, provider2, k3fVar, providerA2, providerA2), new eki(yv4Var3, provider2, providerA2, k3fVar, provider, providerA2, providerA2), new nyj(provider, providerA2, k3fVar, providerA2), 1));
        return b15Var;
    }
}
