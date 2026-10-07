package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class guj {
    public static final luj a;

    static {
        luj er3Var;
        try {
            er3Var = new yki((WebViewProviderFactoryBoundaryInterface) l21.b(WebViewProviderFactoryBoundaryInterface.class, xd2.g()));
        } catch (ClassNotFoundException unused) {
            er3Var = new er3();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            qr7.o(e);
            return;
        }
        a = er3Var;
    }
}
