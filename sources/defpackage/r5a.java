package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.OneLogImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r5a {
    public static final int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        throw null;
                    }
                }
            }
        }
        return i2;
    }

    public static final boolean b(int i) {
        return i == 4;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1 || i == 2) {
            return "so";
        }
        if (i == 3) {
            return "dylib";
        }
        if (i == 4) {
            return "so";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "win32";
        }
        if (i == 2) {
            return "linux";
        }
        if (i == 3) {
            return "darwin";
        }
        if (i == 4) {
            return "solaris";
        }
        throw null;
    }

    public static /* synthetic */ int e(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 20;
        }
        if (i == 4) {
            return 30;
        }
        if (i == 5) {
            return 40;
        }
        throw null;
    }

    public static int f(float f, float f2, int i, int i2) {
        return i2 - (gm0.K(f * f2) * i);
    }

    public static int g(int i, int i2, int i3) {
        return vu3.m(i) + i2 + i3;
    }

    public static /* synthetic */ void h(sab sabVar) {
        throw null;
    }

    public static /* synthetic */ boolean i(AtomicReference atomicReference, OneLogImpl.MaxTimeToUploadRecord maxTimeToUploadRecord, OneLogImpl.MaxTimeToUploadRecord maxTimeToUploadRecord2) {
        while (!atomicReference.compareAndSet(maxTimeToUploadRecord, maxTimeToUploadRecord2)) {
            if (atomicReference.get() != maxTimeToUploadRecord) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "PUSH_NOTIFICATION";
        }
        if (i == 2) {
            return "LINK";
        }
        if (i != 3) {
            return i != 4 ? "null" : "PIP_CLOSE";
        }
        return "FOLDER_CHANGE";
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "INVALID_COUNTRY_CODE";
        }
        if (i == 2) {
            return "NOT_A_NUMBER";
        }
        if (i == 3) {
            return "TOO_SHORT_AFTER_IDD";
        }
        if (i != 4) {
            return i != 5 ? "null" : "TOO_LONG";
        }
        return "TOO_SHORT_NSN";
    }

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "null" : "FORWARD";
        }
        return "REPLY";
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "USER";
        }
        if (i == 3) {
            return "GROUP";
        }
        if (i != 4) {
            return i != 5 ? "null" : "CHANNEL_ADMIN";
        }
        return "CHANNEL";
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "EDIT";
        }
        if (i != 2) {
            return i != 3 ? "null" : "FORWARD";
        }
        return "REPLY";
    }

    public static /* synthetic */ String o(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "VIDEO_MSG";
        }
        return "AUDIO";
    }
}
