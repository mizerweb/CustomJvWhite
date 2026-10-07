package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class nbh {
    public static StringBuilder A(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder B(long j, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static StringBuilder C(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static EnumMap D(float f, int i, EnumMap enumMap, bx5 bx5Var, Class cls) {
        enumMap.put(bx5Var, new vl5(vl5.b(i, f)));
        return new EnumMap(cls);
    }

    public static void E(float f, int i, EnumMap enumMap, bx5 bx5Var) {
        enumMap.put(bx5Var, new vl5(vl5.b(i, f)));
    }

    public static /* synthetic */ void F(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                ore.a();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void G(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String H(int i) {
        switch (i) {
            case 1:
                return "NIL";
            case 2:
                return "BOOLEAN";
            case 3:
                return "INTEGER";
            case 4:
                return "FLOAT";
            case 5:
                return "STRING";
            case 6:
                return "BINARY";
            case 7:
                return "ARRAY";
            case 8:
                return "MAP";
            case 9:
                return "EXTENSION";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String I(int i) {
        if (i == 1) {
            return "ALL";
        }
        if (i == 2) {
            return "NONE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "CONTACTS";
        }
        return "NOBODY";
    }

    public static /* synthetic */ String J(int i) {
        if (i == 1) {
            return "SMALL";
        }
        if (i != 2) {
            return i != 3 ? "null" : "LARGE";
        }
        return "MEDIUM";
    }

    public static int a(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 2527) {
                str.equals("ON");
                return 1;
            }
            if (iHashCode == 78159 && str.equals("OFF")) {
                return 2;
            }
        }
        return 1;
    }

    public static int b(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 2527) {
                str.equals("ON");
                return 1;
            }
            if (iHashCode == 78159 && str.equals("OFF")) {
                return 2;
            }
        }
        return 1;
    }

    public static int c(String str) {
        str.getClass();
        switch (str) {
            case "NOBODY":
            case "_NONE_":
                return 2;
            case "CONTACTS":
                return 4;
            default:
                return 1;
        }
    }

    public static int d(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 2527) {
                str.equals("ON");
                return 1;
            }
            if (iHashCode == 78159 && str.equals("OFF")) {
                return 2;
            }
        }
        return 1;
    }

    public static /* synthetic */ int e(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2 || i == 3) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ boolean f(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 6:
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "vector";
        }
        if (i == 2) {
            return "group";
        }
        if (i == 3) {
            return ClientCookie.PATH_ATTR;
        }
        if (i == 4) {
            return "clip-path";
        }
        throw null;
    }

    public static /* synthetic */ int h(int i) {
        if (i == 1) {
            return 12;
        }
        if (i == 2) {
            return 16;
        }
        if (i == 3) {
            return 24;
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw null;
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "ALL";
        }
        if (i == 2) {
            return "_NONE_";
        }
        if (i == 3) {
            return "NOBODY";
        }
        if (i == 4) {
            return "CONTACTS";
        }
        throw null;
    }

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw null;
    }

    public static int m(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int n(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int o(Set set, int i, int i2) {
        return (set.hashCode() + i) * i2;
    }

    public static wfe p(Object obj) {
        ch3.d0(obj);
        return new wfe();
    }

    public static String q(int i, String str) {
        return (str + i).toString();
    }

    public static String r(int i, String str, String str2, String str3) {
        return str + str2 + str3 + i;
    }

    public static String s(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String t(String str, int i, char c) {
        return str + i + c;
    }

    public static String u(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String v(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String w(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String x(String str, StringBuilder sb, List list) {
        vd7.b(sb, list.size());
        sb.append(str);
        return sb.toString();
    }

    public static String y(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String z(StringBuilder sb, String str, boolean z, String str2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        return sb.toString();
    }
}
