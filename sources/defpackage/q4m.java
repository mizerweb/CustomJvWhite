package defpackage;

import android.view.View;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q4m {
    /* JADX WARN: Code duplicated, block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[RETURN] */
    public static boolean a(Iterator it, ddd dddVar) {
        lvb.W(dddVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (dddVar.apply(it.next())) {
                if (i != -1) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return true;
        }
        return false;
    }

    public static Object b(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object c(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static final void d(View view, g74 g74Var) {
        view.setTag(R.id.report_drawn, g74Var);
    }

    public static zn8 e(Object obj) {
        return new zn8(obj);
    }
}
