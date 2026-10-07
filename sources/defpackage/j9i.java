package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class j9i extends i9i {
    @Override // defpackage.i9i, defpackage.f83
    public final Typeface j(Context context, Typeface typeface, int i) {
        return Typeface.create(typeface, i, false);
    }

    @Override // defpackage.i9i
    public final Typeface q(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.i.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            qr7.o(e);
            return null;
        }
    }

    @Override // defpackage.i9i
    public final Method u(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
