package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class p {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "PRESET_AVATAR";
        }
        if (i == 2) {
            return "USER_AVATAR";
        }
        throw null;
    }

    public static long b(long j) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j;
    }

    public static jc4 c(int i, Bundle bundle, y3f y3fVar, int i2) {
        return mol.a(new tnh(i), bundle, y3fVar, i2);
    }

    public static dbc d(TextView textView, noh nohVar, a8g a8gVar, TextView textView2) {
        q9i.a(nohVar, textView);
        return a8gVar.h(textView2).getText();
    }

    public static String e(String str, String str2, float f) {
        return str + f + str2;
    }

    public static String f(Object[] objArr, int i, Locale locale, String str, StringBuilder sb) {
        sb.append(String.format(locale, str, Arrays.copyOf(objArr, i)));
        return sb.toString();
    }

    public static HashMap g(Class cls, z30 z30Var) {
        HashMap map = new HashMap();
        map.put(cls, z30Var);
        return map;
    }

    public static Map h(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void i(h1b h1bVar) {
        boolean zIsTerminated;
        ExecutorService executorService = h1bVar.a;
        if (h1bVar == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        h1bVar.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    h1bVar.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void j(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void k(boolean z, lve lveVar, boolean z2, String str) {
        lveVar.c(new r7g(z));
        lveVar.a(new r7g(z2));
        lveVar.e(str);
    }

    public static /* synthetic */ boolean l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, p41 p41Var, gcf gcfVar, gcf gcfVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(p41Var, gcfVar, gcfVar2)) {
            if (atomicReferenceFieldUpdater.get(p41Var) != gcfVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "EARPIECE";
        }
        if (i == 2) {
            return "SPEAKER_PHONE";
        }
        if (i == 3) {
            return "BLUETOOTH";
        }
        if (i == 4) {
            return "WIRED_HEADSET";
        }
        if (i == 5) {
            return "NONE";
        }
        throw null;
    }

    public static /* synthetic */ String n(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "BACKWARD";
        }
        return "FORWARD";
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "NEW";
            case 3:
                return "ADD";
            case 4:
                return "REMOVE";
            case 5:
                return "LEAVE";
            case 6:
                return "TITLE";
            case 7:
                return "ICON";
            case 8:
                return "SYSTEM";
            case 9:
                return "JOIN_BY_LINK";
            case 10:
                return "PIN";
            case 11:
                return "BOT_STARTED";
            case 12:
                return "COMMENTS_START";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "EARPIECE";
        }
        if (i == 2) {
            return "SPEAKER_PHONE";
        }
        if (i == 3) {
            return "BLUETOOTH";
        }
        if (i != 4) {
            return i != 5 ? "null" : "NONE";
        }
        return "WIRED_HEADSET";
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "CONFIGURED";
        }
        if (i != 2) {
            return i != 3 ? "null" : "RELEASED";
        }
        return "STARTED";
    }

    public static /* synthetic */ String r(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "MediaGallery";
        }
        return "Camera";
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "None";
        }
        if (i != 2) {
            return i != 3 ? "null" : "Immediate";
        }
        return "Animated";
    }
}
