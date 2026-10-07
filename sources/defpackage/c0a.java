package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c0a {
    public static /* synthetic */ String A(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "null" : "USER";
        }
        return "SYSTEM";
    }

    public static /* synthetic */ String B(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "STATIC";
        }
        if (i != 3) {
            return i != 4 ? "null" : "LOTTIE";
        }
        return "LIVE";
    }

    public static /* synthetic */ int a(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 20;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "SYSTEM";
        }
        if (i == 3) {
            return "USER";
        }
        throw null;
    }

    public static float c(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int d(float f, float f2, int i) {
        return gm0.K(f * f2) * i;
    }

    public static int e(float f, float f2, int i, int i2) {
        return gm0.K(f * f2) + i + i2;
    }

    public static int f(int i, int i2, int i3) {
        return (qt4.D(i) + i2) * i3;
    }

    public static int g(View view, int i, int i2) {
        return i2 - (view.getMeasuredHeight() / i);
    }

    public static dbc h(a8g a8gVar, Context context) {
        return a8gVar.e(context).m().getIcon();
    }

    public static dwd i(Class cls, String str, String str2, int i) {
        dwd dwdVar = new dwd(cls, str, str2, i);
        zfe.b(dwdVar);
        return dwdVar;
    }

    public static Object j(AccountInitializer accountInitializer, int i) {
        return accountInitializer.d().getAccessor().c(i);
    }

    public static String k(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String l(int i, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String m(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String n(Object obj, String str) {
        return str + obj;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder q(int i, long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(i);
        return sb;
    }

    public static StringBuilder r(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static List s(long j) {
        return Collections.singletonList(new Long(j));
    }

    public static void t(long j, ArrayList arrayList) {
        arrayList.add(new Long(j));
    }

    public static void u(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static void v(StringBuilder sb, int i, String str, long j) {
        sb.append(i);
        sb.append(str);
        sb.append(j);
    }

    public static void w(StringBuilder sb, long j, String str, int i) {
        sb.append(j);
        sb.append(str);
        sb.append(i);
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "Active";
        }
        if (i != 2) {
            return i != 3 ? "null" : "Disabled";
        }
        return "Inactive";
    }

    public static /* synthetic */ String z(int i) {
        if (i == 1) {
            return "AUTOMATIC";
        }
        if (i != 2) {
            return i != 3 ? "null" : "WRITE_AHEAD_LOGGING";
        }
        return "TRUNCATE";
    }
}
