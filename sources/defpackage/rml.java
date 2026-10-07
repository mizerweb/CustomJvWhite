package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rml {
    public static Class a(String str, boolean z) {
        if (z && TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (Exception e) {
            StringBuilder sbV = qt4.v("An exception occurred while finding class for name ", str, ". ");
            sbV.append(e.getMessage());
            throw new RuntimeException(sbV.toString());
        }
    }

    public static k0e b(Bundle bundle) {
        return (k0e) tre.f0(bundle, "mode", k0e.class);
    }

    public static k0e c(Integer num) {
        Object next;
        y1 y1Var = new y1(0, k0e.e);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((k0e) next).a != num.intValue());
        k0e k0eVar = (k0e) next;
        return k0eVar == null ? k0e.WEBAPP : k0eVar;
    }

    public static Object d(String str) {
        try {
            Class clsA = a(str, true);
            if (clsA != null) {
                return clsA.newInstance();
            }
            return null;
        } catch (Exception e) {
            StringBuilder sbV = qt4.v("An exception occurred while creating a new instance of ", str, ". ");
            sbV.append(e.getMessage());
            throw new RuntimeException(sbV.toString());
        }
    }
}
