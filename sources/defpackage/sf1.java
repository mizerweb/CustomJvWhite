package defpackage;

import android.os.Handler;
import android.os.Looper;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.dev.CallsSDKException;
import ru.ok.android.externcalls.sdk.dev.DebugManager;

/* JADX INFO: loaded from: classes3.dex */
public final class sf1 implements rf1 {
    public final ny8 a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public sf1(ny8 ny8Var) {
        this.a = ny8Var;
    }

    @Override // defpackage.rf1
    public final void a() {
        ff ffVar = new ff(4);
        if (Looper.getMainLooper().isCurrentThread()) {
            ffVar.run();
            throw null;
        }
        this.b.post(ffVar);
    }

    @Override // defpackage.rf1
    public final void b() {
        DebugManager debugManager;
        Conversation conversationA = ((f9) this.a.getValue()).a();
        if (conversationA == null || (debugManager = conversationA.getDebugManager()) == null) {
            return;
        }
        debugManager.reportError(new CallsSDKException("It's test application crash... Please don't worry!", null, 2, null));
    }
}
