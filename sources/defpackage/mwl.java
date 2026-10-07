package defpackage;

import android.graphics.Typeface;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mwl {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public abstract void b(int i);

    public abstract void c(Typeface typeface, boolean z);
}
