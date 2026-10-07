package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpHost;
import org.apache.http.auth.AUTH;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class uqi {
    public static final byte[] a;
    public static final hu7 b = e9i.n0(new String[0]);
    public static final qne c;
    public static final chc d;
    public static final TimeZone e;
    public static final lge f;
    public static final String g;

    static {
        int i = 0;
        byte[] bArr = new byte[0];
        a = bArr;
        l31 l31Var = new l31();
        l31Var.k0(0, bArr);
        c = new qne(0L, l31Var);
        c(0L, 0L, 0L);
        d71[] d71VarArr = {qyj.u("efbbbf"), qyj.u("feff"), qyj.u("fffe"), qyj.u("0000ffff"), qyj.u("ffff0000")};
        ArrayList arrayList = new ArrayList(new wv(d71VarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            d71 d71Var = d71VarArr[i2];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList arrayListR0 = xw3.R0(Arrays.copyOf(numArr, numArr.length));
        int i3 = 0;
        int i4 = 0;
        while (i3 < 5) {
            arrayListR0.set(xw3.M0(arrayList, d71VarArr[i3]), Integer.valueOf(i4));
            i3++;
            i4++;
        }
        if (((d71) arrayList.get(0)).a() <= 0) {
            ore.p("the empty byte string is not a supported option");
            return;
        }
        int i5 = 0;
        while (i5 < arrayList.size()) {
            d71 d71Var2 = (d71) arrayList.get(i5);
            int i6 = i5 + 1;
            int i7 = i6;
            while (i7 < arrayList.size()) {
                d71 d71Var3 = (d71) arrayList.get(i7);
                d71Var3.getClass();
                if (!d71Var3.n(d71Var2.a(), d71Var2)) {
                    break;
                }
                if (d71Var3.a() == d71Var2.a()) {
                    ore.e(d71Var3, "duplicate option: ");
                    return;
                } else if (((Number) arrayListR0.get(i7)).intValue() > ((Number) arrayListR0.get(i5)).intValue()) {
                    arrayList.remove(i7);
                    arrayListR0.remove(i7);
                } else {
                    i7++;
                }
            }
            i5 = i6;
        }
        l31 l31Var2 = new l31();
        tre.I(0L, l31Var2, 0, arrayList, 0, arrayList.size(), arrayListR0);
        int[] iArr = new int[(int) (l31Var2.b / 4)];
        while (!l31Var2.l()) {
            iArr[i] = l31Var2.readInt();
            i++;
        }
        d = new chc((d71[]) Arrays.copyOf(d71VarArr, 5), iArr);
        e = TimeZone.getTimeZone("GMT");
        f = new lge("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = r5h.g1(r5h.f1(qsb.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(k28 k28Var, k28 k28Var2) {
        return cqk.d(k28Var.d, k28Var2.d) && k28Var.e == k28Var2.e && cqk.d(k28Var.a, k28Var2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            ore.c("timeout".concat(" < 0"));
            return 0;
        }
        if (timeUnit == null) {
            ore.k("unit == null");
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            c.o("timeout".concat(" too large."));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        c.o("timeout".concat(" too small."));
        return 0;
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!cqk.d(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(char c2, int i, int i2, String str) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (r5h.M0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int h(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return f(c2, i, i2, str);
    }

    public static final String i(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                int i = 0;
                while (true) {
                    if (i < strArr2.length) {
                        int i2 = i + 1;
                        try {
                            if (comparator.compare(str, strArr2[i]) == 0) {
                                return true;
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            ore.f(e2.getMessage());
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(pne pneVar) {
        String strA = pneVar.f.a(HTTP.CONTENT_LEN);
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(xw3.P0(Arrays.copyOf(objArr2, objArr2.length)));
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cqk.i(cCharAt, 31) <= 0 || cqk.i(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int n(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int o(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String str) {
        return str.equalsIgnoreCase(AUTH.WWW_AUTH_RESP) || str.equalsIgnoreCase(SM.COOKIE) || str.equalsIgnoreCase(AUTH.PROXY_AUTH_RESP) || str.equalsIgnoreCase(SM.SET_COOKIE);
    }

    public static final int r(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset s(y41 y41Var, Charset charset) {
        int iK0 = y41Var.K0(d);
        if (iK0 == -1) {
            return charset;
        }
        if (iK0 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iK0 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iK0 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iK0 == 3) {
            Charset charset2 = pt2.a;
            Charset charset3 = pt2.f;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            pt2.f = charsetForName;
            return charsetForName;
        }
        if (iK0 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = pt2.a;
        Charset charset5 = pt2.e;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        pt2.e = charsetForName2;
        return charsetForName2;
    }

    public static final int t(y41 y41Var) {
        return (y41Var.readByte() & 255) | ((y41Var.readByte() & 255) << 16) | ((y41Var.readByte() & 255) << 8);
    }

    public static final boolean u(mdg mdgVar, int i) {
        long jNanoTime = System.nanoTime();
        long jC = mdgVar.m().e() ? mdgVar.m().c() - jNanoTime : Long.MAX_VALUE;
        mdgVar.m().d(Math.min(jC, TimeUnit.MILLISECONDS.toNanos(i)) + jNanoTime);
        try {
            l31 l31Var = new l31();
            while (mdgVar.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var) != -1) {
                l31Var.skip(l31Var.b);
            }
            if (jC == BuildConfig.MAX_TIME_TO_UPLOAD) {
                mdgVar.m().a();
                return true;
            }
            mdgVar.m().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == BuildConfig.MAX_TIME_TO_UPLOAD) {
                mdgVar.m().a();
                return false;
            }
            mdgVar.m().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == BuildConfig.MAX_TIME_TO_UPLOAD) {
                mdgVar.m().a();
            } else {
                mdgVar.m().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final hu7 v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bu7 bu7Var = (bu7) it.next();
            d71 d71VarA = bu7Var.a();
            d71 d71VarB = bu7Var.b();
            String strP = d71VarA.p();
            String strP2 = d71VarB.p();
            arrayList.add(strP);
            arrayList.add(r5h.y1(strP2).toString());
        }
        return new hu7((String[]) arrayList.toArray(new String[0]));
    }

    public static final String w(k28 k28Var, boolean z) {
        int i;
        int i2 = k28Var.e;
        String strG = k28Var.d;
        if (r5h.L0(strG, ":", false)) {
            strG = qv1.g(']', "[", strG);
        }
        if (!z) {
            String str = k28Var.a;
            if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                i = 80;
            } else {
                i = str.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return strG;
            }
        }
        return strG + ':' + i2;
    }

    public static final List x(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final int y(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String z(int i, int i2, String str) {
        int iN = n(i, i2, str);
        return str.substring(iN, o(iN, i2, str));
    }
}
