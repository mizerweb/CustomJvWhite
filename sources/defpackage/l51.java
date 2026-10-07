package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l51 {
    public static final v2a a = new v2a("Auth.GOOGLE_SIGN_IN_API", new lkk(6), new xvc(14));

    public static ghe a(mf7 mf7Var, List list) {
        z88 z88VarL = c98.l();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            z88VarL.c(mf7Var.mo41apply(bundle));
        }
        return z88VarL.h();
    }

    public static boolean b(String str) {
        fp fpVar = fuj.a;
        Set<gp> setUnmodifiableSet = Collections.unmodifiableSet(gp.c);
        HashSet<gp> hashSet = new HashSet();
        for (gp gpVar : setUnmodifiableSet) {
            if (gpVar.a.equals(str)) {
                hashSet.add(gpVar);
            }
        }
        if (hashSet.isEmpty()) {
            ore.q("Unknown feature ".concat(str));
            return false;
        }
        for (gp gpVar2 : hashSet) {
            if (gpVar2.a() || gpVar2.b()) {
                return true;
            }
        }
        return false;
    }

    public static final void c(du8 du8Var, String str, Number number) {
        du8Var.b(kt8.b(number), str);
    }

    public static final void d(du8 du8Var, String str, String str2) {
        du8Var.b(kt8.c(str2), str);
    }

    public static ArrayList e(Collection collection, mf7 mf7Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) mf7Var.mo41apply(it.next()));
        }
        return arrayList;
    }

    public static SparseArray f(SparseArray sparseArray, o75 o75Var) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        if (sparseArray.size() <= 0) {
            return sparseArray2;
        }
        sparseArray.keyAt(0);
        qt4.A(sparseArray.valueAt(0));
        throw null;
    }
}
