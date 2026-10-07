package defpackage;

import androidx.fragment.app.Fragment$InstantiationException;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class bb7 {
    public static final h6g b = new h6g(0);
    public final /* synthetic */ c a;

    public bb7(c cVar) {
        this.a = cVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        h6g h6gVar = b;
        h6g h6gVar2 = (h6g) h6gVar.get(classLoader);
        if (h6gVar2 == null) {
            h6gVar2 = new h6g(0);
            h6gVar.put(classLoader, h6gVar2);
        }
        Class cls = (Class) h6gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        h6gVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(c0a.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(c0a.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final a a(String str) {
        try {
            return (a) c(this.a.v.h.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(c0a.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(c0a.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(c0a.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(c0a.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
