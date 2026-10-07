package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wsi {
    public final mw a;
    public final mw b;
    public final mw c;

    public wsi(mw mwVar, mw mwVar2, mw mwVar3) {
        this.a = mwVar;
        this.b = mwVar2;
        this.c = mwVar3;
    }

    public abstract xsi a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        mw mwVar = this.c;
        Class cls2 = (Class) mwVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(nbh.v(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        mwVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        mw mwVar = this.a;
        Method method = (Method) mwVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, wsi.class.getClassLoader()).getDeclaredMethod("read", wsi.class);
        mwVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        mw mwVar = this.b;
        Method method = (Method) mwVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, wsi.class);
        mwVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((xsi) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((xsi) this).e.readParcelable(xsi.class.getClassLoader());
    }

    public final ysi h() {
        String string = ((xsi) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (ysi) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            ore.h("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            ore.h("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ore.h("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            ore.h("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((xsi) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((xsi) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(ysi ysiVar) {
        if (ysiVar == null) {
            ((xsi) this).e.writeString(null);
            return;
        }
        try {
            ((xsi) this).e.writeString(b(ysiVar.getClass()).getName());
            xsi xsiVarA = a();
            try {
                d(ysiVar.getClass()).invoke(null, ysiVar, xsiVarA);
                Parcel parcel = xsiVarA.e;
                int i = xsiVarA.i;
                if (i >= 0) {
                    int i2 = xsiVarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                ore.h("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                ore.h("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                ore.h("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                ore.h("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            ore.h(ysiVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
