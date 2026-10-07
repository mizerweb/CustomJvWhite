package defpackage;

import android.util.DisplayMetrics;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class mw7 {
    public static final boolean a(int i, int i2) {
        return (b(i) & i2) != 0;
    }

    public static final int b(int i) {
        return 1 << qt4.D(i);
    }

    public static /* synthetic */ long c(int i) {
        if (i == 1) {
            return 0L;
        }
        if (i == 2) {
            return 1L;
        }
        if (i == 3) {
            return 2L;
        }
        throw null;
    }

    public static /* synthetic */ int d(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        throw null;
    }

    public static int e(int i, int i2, int i3, int i4) {
        return vu3.n(i) + i2 + i3 + i4;
    }

    public static int f(int i, int i2, CharSequence charSequence) {
        return (charSequence.hashCode() + i) * i2;
    }

    public static DisplayMetrics g(float f, float f2, c8b c8bVar, int i) {
        c8bVar.e(i, gm0.K(f * f2));
        return yl5.d().getDisplayMetrics();
    }

    public static /* synthetic */ void h(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void i(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, md9 md9Var, od9 od9Var, od9 od9Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(md9Var, od9Var, od9Var2) && atomicReferenceFieldUpdater.get(md9Var) == od9Var) {
        }
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "GOOD";
        }
        if (i == 2) {
            return "BAD_LEVEL_1";
        }
        if (i == 3) {
            return "BAD_LEVEL_2";
        }
        throw null;
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "GOOGLE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "FAKE";
        }
        return "HUAWEI";
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "REGULAR";
            case 2:
                return "BOLD";
            case 3:
                return "ITALIC";
            case 4:
                return "UNDERLINE";
            case 5:
                return "MONOSPACE";
            case 6:
                return "LINK";
            case 7:
                return "STRIKETHROUGH";
            case 8:
                return "HEADING";
            case 9:
                return "CODE";
            case 10:
                return "QUOTE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "CONFIGURED";
        }
        if (i == 3) {
            return "STARTED";
        }
        if (i != 4) {
            return i != 5 ? "null" : "RELEASED";
        }
        return "STOPPED";
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "GOOD";
        }
        if (i != 2) {
            return i != 3 ? "null" : "BAD_LEVEL_2";
        }
        return "BAD_LEVEL_1";
    }

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "ANDROID_MEDIA";
        }
        return "MEDIA_3";
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "CONFIGURED";
        }
        if (i == 3) {
            return "STARTED";
        }
        if (i != 4) {
            return i != 5 ? "null" : "RELEASED";
        }
        return "STOPPED";
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "HIDDEN";
        }
        if (i == 2) {
            return "CALLING";
        }
        if (i == 3) {
            return "NOT_CONTACT_CALLING";
        }
        if (i != 4) {
            return i != 5 ? "null" : "NO_CONNECTION";
        }
        return "ACTIVE";
    }

    public static /* synthetic */ String r(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "UPDATE";
        }
        return "DOWNLOAD";
    }
}
