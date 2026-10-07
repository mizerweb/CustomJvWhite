package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class dqb extends qkk implements m38 {
    public final Object d;

    public dqb(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 3);
        this.d = obj;
    }

    public static m38 n0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof m38 ? (m38) iInterfaceQueryLocalInterface : new nqk(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object o0(m38 m38Var) {
        if (m38Var instanceof dqb) {
            return ((dqb) m38Var).d;
        }
        IBinder iBinderAsBinder = m38Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            ore.p(zo5.v(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
            return null;
        }
        yab.s(field);
        if (field.isAccessible()) {
            ore.p("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
