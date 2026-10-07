package defpackage;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gol {
    public static final boolean a(fbc fbcVar, String str) {
        Long l = (Long) ((Map) ((AtomicReference) ((ifh) fbcVar.c).getValue()).get()).get(str);
        return l != null && System.currentTimeMillis() < l.longValue();
    }

    public static final void b(ul9 ul9Var, String str, Long l) {
        Long lValueOf;
        if (l.longValue() <= 0) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(l.longValue() + System.currentTimeMillis());
        }
        ul9Var.put(str, lValueOf);
    }

    public static final void c(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    public static final void e(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void f(String str) {
        throw new NoSuchElementException(str);
    }
}
