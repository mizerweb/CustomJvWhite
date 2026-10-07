package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class nfh implements qt3 {
    public final sfh a(Looper looper, Handler.Callback callback) {
        return new sfh(new Handler(looper, callback));
    }
}
