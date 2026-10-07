package androidx.datastore.preferences.protobuf;

import defpackage.b1k;
import defpackage.l3f;
import defpackage.ldi;
import defpackage.ore;
import defpackage.pwd;
import defpackage.vu3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends a {
    private static Map<Object, d> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected j unknownFields;

    public d() {
        this.memoizedHashCode = 0;
        this.unknownFields = j.f;
        this.memoizedSerializedSize = -1;
    }

    public static d e(Class cls) {
        d dVar = defaultInstanceMap.get(cls);
        if (dVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                dVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                ore.l("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = (d) ((d) ldi.a(cls)).d(6);
        if (dVar2 != null) {
            defaultInstanceMap.put(cls, dVar2);
            return dVar2;
        }
        defpackage.c.t();
        return null;
    }

    public static Object f(Method method, d dVar, Object... objArr) {
        try {
            return method.invoke(dVar, objArr);
        } catch (IllegalAccessException e) {
            ore.h("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            ore.h("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void h(Class cls, d dVar) {
        defaultInstanceMap.put(cls, dVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            pwd pwdVar = pwd.c;
            pwdVar.getClass();
            this.memoizedSerializedSize = pwdVar.a(getClass()).b(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void c(vu3 vu3Var) {
        pwd pwdVar = pwd.c;
        pwdVar.getClass();
        l3f l3fVarA = pwdVar.a(getClass());
        b1k b1kVar = vu3Var.a;
        if (b1kVar == null) {
            b1kVar = new b1k(vu3Var);
        }
        l3fVarA.g(this, b1kVar);
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((d) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        pwd pwdVar = pwd.c;
        pwdVar.getClass();
        return pwdVar.a(getClass()).i(this, (d) obj);
    }

    public final boolean g() {
        byte bByteValue = ((Byte) d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        pwd pwdVar = pwd.c;
        pwdVar.getClass();
        boolean zC = pwdVar.a(getClass()).c(this);
        d(2);
        return zC;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        pwd pwdVar = pwd.c;
        pwdVar.getClass();
        int iH = pwdVar.a(getClass()).h(this);
        this.memoizedHashCode = iH;
        return iH;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        e.c(this, sb, 0);
        return sb.toString();
    }
}
