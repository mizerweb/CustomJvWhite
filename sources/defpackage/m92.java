package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m92 {
    public static final ny8 a = rx8.P(3, new k82(1));

    public static final boolean a(hve hveVar) {
        Object objPrevious;
        ArrayList arrayListE = hveVar.e();
        ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
        loop0: while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            lve lveVar = (lve) objPrevious;
            List<String> list = (List) a.getValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    String str2 = lveVar.b;
                    if (str2 != null && r5h.L0(str2, str, false)) {
                        break loop0;
                    }
                }
            }
        }
        lve lveVar2 = (lve) objPrevious;
        String str3 = lveVar2 != null ? lveVar2.b : null;
        if (str3 != null) {
            hveVar.F(str3);
        }
        return str3 != null;
    }

    public static final boolean b(hve hveVar) {
        Object next;
        Iterator it = hveVar.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = ((lve) next).b;
            if (str != null && r5h.L0(str, ":call-incoming", false)) {
                break;
            }
        }
        lve lveVar = (lve) next;
        String str2 = lveVar != null ? lveVar.b : null;
        if (str2 != null) {
            hveVar.F(str2);
        }
        return str2 != null;
    }

    public static final boolean c(String str) {
        List list = (List) a.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (r5h.L0(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void d(hve hveVar) {
        ArrayList<lve> arrayListE = hveVar.e();
        Collection<?> pwVar = new pw(0);
        for (lve lveVar : arrayListE) {
            if (ww3.j1((List) a.getValue(), lveVar.b)) {
                pwVar.add(lveVar);
            }
        }
        arrayListE.removeAll(pwVar);
        hveVar.R(arrayListE, null);
    }
}
