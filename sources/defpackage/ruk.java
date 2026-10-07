package defpackage;

import java.lang.reflect.Array;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ruk {
    public static kwa a(String str, sr3 sr3Var) {
        kwa kwaVar;
        HashMap map = kwa.c;
        synchronized (map) {
            try {
                Object kwaVar2 = map.get(str);
                if (kwaVar2 == null) {
                    kwaVar2 = new kwa(str, sr3Var);
                    map.put(str, kwaVar2);
                }
                kwaVar = (kwa) kwaVar2;
                if (!kwaVar.b.equals(sr3Var)) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kwaVar;
    }

    public static Object[] b(Object[] objArr, int i) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
