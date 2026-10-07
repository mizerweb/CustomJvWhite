package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class tje extends Handler {
    public final int a;
    public final /* synthetic */ uje b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tje(uje ujeVar, Looper looper) {
        super(looper);
        this.b = ujeVar;
        this.a = 1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == this.a) {
            this.b.b();
        }
    }
}
