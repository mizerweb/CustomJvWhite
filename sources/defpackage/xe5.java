package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class xe5 {
    public final String a;
    public final vn7 b;

    public xe5(Set set, vn7 vn7Var) {
        this.a = b(set);
        this.b = vn7Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            wh0 wh0Var = (wh0) it.next();
            sb.append(wh0Var.a);
            sb.append('/');
            sb.append(wh0Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        vn7 vn7Var = this.b;
        synchronized (((HashSet) vn7Var.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) vn7Var.b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) vn7Var.b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) vn7Var.b);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
