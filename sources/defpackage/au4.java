package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class au4 {
    public static final Collection a;

    static {
        try {
            a = yhf.w0(new nf4(new tw(4, Arrays.asList(new AndroidExceptionPreHandler(), new bd6()).iterator())));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
