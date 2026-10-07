package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class so8 implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public so8(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (cqk.d(name, "supports") && cqk.d(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (cqk.d(name, "unsupported") && cqk.d(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean zD = cqk.d(name, "protocols");
        ArrayList arrayList = this.a;
        if (zD && objArr.length == 0) {
            return arrayList;
        }
        if ((cqk.d(name, "selectProtocol") || cqk.d(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        String str = (String) list.get(i);
                        if (arrayList.contains(str)) {
                            this.c = str;
                            return str;
                        }
                        if (i != size) {
                            i++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((!cqk.d(name, "protocolSelected") && !cqk.d(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        this.c = (String) objArr[0];
        return null;
    }
}
