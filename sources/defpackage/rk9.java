package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class rk9 {
    public static final lk9 a;

    static {
        String property;
        int i = agh.a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            List listW0 = yhf.w0(new nf4(new tw(4, Arrays.asList(new AndroidDispatcherFactory(), new TestMainDispatcherFactory()).iterator())));
            Iterator it = listW0.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iB = ((qk9) next).b();
                    do {
                        Object next2 = it.next();
                        int iB2 = ((qk9) next2).b();
                        if (iB < iB2) {
                            next = next2;
                            iB = iB2;
                        }
                    } while (it.hasNext());
                }
            }
            qk9 qk9Var = (qk9) next;
            if (qk9Var != null) {
                a = qk9Var.a(listW0);
            } else {
                ore.k("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
