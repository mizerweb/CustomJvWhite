package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class alc implements Handler.Callback {
    public static final ExecutorService b;
    public static final ThreadLocal c;
    public final ExecutorService a = b;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        b = executorServiceNewSingleThreadExecutor;
        c = new ThreadLocal();
        executorServiceNewSingleThreadExecutor.execute(new ff(10));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        chk chkVar = (chk) message.obj;
        if (!chkVar.b) {
            int i = chkVar.c + 1;
            chkVar.c = i;
            if (i < 4) {
                ore.k("No task duration check thread");
                return false;
            }
        }
        return true;
    }
}
