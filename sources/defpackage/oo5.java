package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class oo5 implements ko5 {
    public static final oo5 a;
    public static final /* synthetic */ oo5[] b;

    static {
        oo5 oo5Var = new oo5("DISPOSED", 0);
        a = oo5Var;
        b = new oo5[]{oo5Var};
    }

    public static void a(AtomicReference atomicReference) {
        ko5 ko5Var;
        ko5 ko5Var2 = (ko5) atomicReference.get();
        oo5 oo5Var = a;
        if (ko5Var2 == oo5Var || (ko5Var = (ko5) atomicReference.getAndSet(oo5Var)) == oo5Var || ko5Var == null) {
            return;
        }
        ko5Var.dispose();
    }

    public static boolean b(ko5 ko5Var) {
        return ko5Var == a;
    }

    public static boolean d(AtomicReference atomicReference, ko5 ko5Var) {
        while (true) {
            ko5 ko5Var2 = (ko5) atomicReference.get();
            if (ko5Var2 != a) {
                while (!atomicReference.compareAndSet(ko5Var2, ko5Var)) {
                    if (atomicReference.get() != ko5Var2) {
                    }
                }
                return true;
            }
            if (ko5Var == null) {
                return false;
            }
            ko5Var.dispose();
            return false;
        }
    }

    public static boolean e(AtomicReference atomicReference, ko5 ko5Var) {
        Objects.requireNonNull(ko5Var, "d is null");
        while (!atomicReference.compareAndSet(null, ko5Var)) {
            if (atomicReference.get() != null) {
                ko5Var.dispose();
                if (atomicReference.get() == a) {
                    return false;
                }
                tre.s0(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(ko5 ko5Var, ko5 ko5Var2) {
        if (ko5Var2 == null) {
            tre.s0(new NullPointerException("next is null"));
            return false;
        }
        if (ko5Var == null) {
            return true;
        }
        ko5Var2.dispose();
        tre.s0(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static oo5 valueOf(String str) {
        return (oo5) Enum.valueOf(oo5.class, str);
    }

    public static oo5[] values() {
        return (oo5[]) b.clone();
    }

    @Override // defpackage.ko5
    public final void dispose() {
    }
}
