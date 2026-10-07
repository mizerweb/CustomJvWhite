package defpackage;

import android.net.Uri;
import androidx.fragment.app.a;
import java.io.File;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class zo5 {
    public static StringBuilder A(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder B(String str, boolean z, String str2, boolean z2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static void C(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static int D(float f, float f2, int i) {
        return i - gm0.K(f * f2);
    }

    public static /* synthetic */ int a(int i) {
        if (i == 1) {
            return HttpStatus.SC_BAD_REQUEST;
        }
        if (i == 2) {
            return 500;
        }
        if (i == 3) {
            return 600;
        }
        if (i == 4) {
            return 700;
        }
        throw null;
    }

    public static int b(float f, float f2, int i) {
        return gm0.K(f * f2) + i;
    }

    public static int c(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int d(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static z8b e(age ageVar, Class cls, String str, String str2) {
        ageVar.getClass();
        return new z8b(cls, str, str2);
    }

    public static dwd f(age ageVar, Class cls, String str, String str2, int i) {
        ageVar.getClass();
        return new dwd(cls, str, str2, i);
    }

    public static String g(int i, long j, String str, String str2) {
        return str + j + str2 + i;
    }

    public static String h(int i, String str) {
        return str + i;
    }

    public static String i(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String j(long j, String str) {
        return str + j;
    }

    public static String k(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static String l(Uri uri, String str) {
        return str + uri;
    }

    public static String m(File file, String str) {
        return str + file;
    }

    public static String n(String str, a aVar, String str2) {
        return str + aVar + str2;
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, String str2, boolean z, boolean z2) {
        return str + z + str2 + z2;
    }

    public static String r(String str, Throwable th) {
        return str + th;
    }

    public static String s(String str, boolean z) {
        return str + z;
    }

    public static String t(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String u(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String v(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String w(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder x(int i, long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(j);
        return sb;
    }

    public static StringBuilder y(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder z(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }
}
