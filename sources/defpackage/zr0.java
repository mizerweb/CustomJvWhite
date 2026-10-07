package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes4.dex */
public final class zr0 extends bmk {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", zo5.h(i, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).c(Status.h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            ore.m();
            return;
        }
        try {
            throw null;
        } catch (RuntimeException e) {
            h45 h45Var = BasePendingResult.j;
            throw e;
        }
    }
}
