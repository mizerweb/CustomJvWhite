package defpackage;

import android.util.Log;
import one.me.android.concurrent.UncaughtException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j94 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ j94(int i) {
        this.a = i;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.a) {
            case 0:
                UncaughtException uncaughtException = new UncaughtException(th);
                Log.wtf("UncaughtException", uncaughtException);
                ((t1c) ((ed6) m94.j.getValue())).a(uncaughtException);
                break;
            default:
                if (pfl.b(th)) {
                    nu7 nu7Var = nu7.a;
                    nu7.b(null);
                }
                break;
        }
    }
}
