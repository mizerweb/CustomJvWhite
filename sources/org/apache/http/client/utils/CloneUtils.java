package org.apache.http.client.utils;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class CloneUtils {
    private CloneUtils() {
    }

    public static Object clone(Object obj) throws CloneNotSupportedException {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Cloneable)) {
            throw new CloneNotSupportedException();
        }
        try {
            try {
                return obj.getClass().getMethod("clone", null).invoke(obj, null);
            } catch (IllegalAccessException e) {
                throw new IllegalAccessError(e.getMessage());
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof CloneNotSupportedException) {
                    throw ((CloneNotSupportedException) cause);
                }
                throw new Error("Unexpected exception", cause);
            }
        } catch (NoSuchMethodException e3) {
            throw new NoSuchMethodError(e3.getMessage());
        }
    }
}
