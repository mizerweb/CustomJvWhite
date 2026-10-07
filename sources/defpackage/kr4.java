package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class kr4 {
    public static final /* synthetic */ zv8[] a;
    public static final j55 b;

    static {
        cwd cwdVar = new cwd(l72.NO_RECEIVER, kr4.class, "methodRemoveViewReference", "getMethodRemoveViewReference()Ljava/lang/reflect/Method;", 1);
        zfe.a.getClass();
        a = new zv8[]{cwdVar};
        b = new j55(jr4.b, "removeViewReference", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1));
    }

    public static final boolean a(br4 br4Var) {
        return br4Var.viewState != null;
    }

    public static final void b(br4 br4Var, Context context) throws IllegalAccessException, InvocationTargetException {
        Method method = (Method) b.m(null, a[0]);
        if (method != null) {
            method.invoke(br4Var, context);
        } else {
            ore.p("Required value was null.");
        }
    }
}
