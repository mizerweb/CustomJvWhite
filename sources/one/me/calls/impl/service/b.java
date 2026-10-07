package one.me.calls.impl.service;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import defpackage.e5d;
import defpackage.gm0;
import defpackage.jjf;
import defpackage.k42;
import defpackage.m02;
import defpackage.qe;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements m02 {
    public static Handler b;
    public static final Set c = kotlin.collections.a.p1(new Integer[]{Integer.valueOf(jjf.f), Integer.valueOf(jjf.b), Integer.valueOf(jjf.c), Integer.valueOf(jjf.e), Integer.valueOf(jjf.d)});
    public final e5d a;

    public b(e5d e5dVar) {
        this.a = e5dVar;
    }

    public static void f(Context context) {
        gm0.n("CallServiceTag", "doStopService");
        try {
            Intent intent = new Intent(context, (Class<?>) CallServiceImpl.class);
            intent.putExtra("ACTION", 1);
            context.stopService(intent);
        } catch (IllegalStateException e) {
            CallServiceImpl.CallServiceException callServiceException = new CallServiceImpl.CallServiceException("cant stop foreground service", e);
            gm0.V("CallServiceTag", callServiceException.getMessage(), callServiceException);
        }
    }

    @Override // defpackage.m02
    public final void a(Context context, k42 k42Var) {
        a.a(context, new Intent(context, (Class<?>) CallServiceImpl.class).putExtra("ACTION", 3), k42Var);
    }

    @Override // defpackage.m02
    public final void c(Context context, k42 k42Var) {
        a.a(context, new Intent(context, (Class<?>) CallServiceImpl.class).putExtra("ACTION", 0), k42Var);
    }

    @Override // defpackage.m02
    public final void d(Context context) {
        a.e().post(new qe(this, 24, context));
    }

    @Override // defpackage.m02
    public final void e(Context context, k42 k42Var) {
        a.a(context, new Intent(context, (Class<?>) CallServiceImpl.class).putExtra("ACTION", 5), k42Var);
    }
}
