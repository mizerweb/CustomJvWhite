package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class hlk extends bmk {
    public final Context a;
    public final /* synthetic */ fo7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlk(fo7 fo7Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.b = fo7Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = go7.a;
        fo7 fo7Var = this.b;
        Context context = this.a;
        int iC = fo7Var.c(context, i2);
        AtomicBoolean atomicBoolean = xo7.a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = fo7Var.b(iC, context, "n");
            fo7Var.e(context, iC, intentB == null ? null : qgl.a(context, intentB));
        }
    }
}
