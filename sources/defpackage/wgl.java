package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wgl {
    public static q1d a(int i) {
        Object next;
        y1 y1Var = new y1(0, q1d.e);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((q1d) next).a != i);
        if (next != null) {
            return (q1d) next;
        }
        ore.p("Required value was null.");
        return null;
    }

    public static n02 b(Intent intent) {
        Object next;
        int intExtra = intent.getIntExtra("ACTION", 0);
        y1 y1Var = new y1(0, n02.g);
        while (y1Var.hasNext()) {
            next = y1Var.next();
            if (((n02) next).a == intExtra) {
                return (n02) next;
            }
        }
        next = null;
        return (n02) next;
    }
}
