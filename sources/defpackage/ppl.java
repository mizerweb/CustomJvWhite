package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.SM;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppl {
    public static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final b9b b(rfa rfaVar) {
        Iterable iterable;
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        c46 c46Var = rfaVar.n;
        if (c46Var == null || (iterable = (List) c46Var.a) == null) {
            iterable = r66.a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String strValueOf = String.valueOf(yvk.b((e70) it.next()));
            Integer num = (Integer) b9bVar.d(strValueOf);
            b9bVar.k(strValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
        return b9bVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    public static List c(k28 k28Var, hu7 hu7Var) {
        int i;
        ws4 ws4Var;
        ws4 ws4Var2;
        int size = hu7Var.size();
        int i2 = 0;
        ArrayList arrayList = null;
        while (true) {
            i = 2;
            if (i2 >= size) {
                break;
            }
            if (SM.SET_COOKIE.equalsIgnoreCase(hu7Var.b(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(hu7Var.f(i2));
            }
            i2++;
        }
        r66 r66Var = r66.a;
        List listUnmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : r66Var;
        int size2 = listUnmodifiableList.size();
        int i3 = 0;
        ArrayList arrayList2 = null;
        while (i3 < size2) {
            String str = (String) listUnmodifiableList.get(i3);
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int iH = uqi.h(str, ';', 0, 0, 6);
            char c2 = '=';
            int iH2 = uqi.h(str, '=', 0, iH, i);
            if (iH2 == iH) {
                ws4Var = null;
            } else {
                String strZ = uqi.z(0, iH2, str);
                if (strZ.length() != 0 && uqi.m(strZ) == -1) {
                    String strZ2 = uqi.z(iH2 + 1, iH, str);
                    if (uqi.m(strZ2) == -1) {
                        int i4 = iH + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long jD = 253402300799999L;
                        String str2 = null;
                        String strSubstring = null;
                        long j2 = -1;
                        boolean z4 = true;
                        while (true) {
                            long j3 = BuildConfig.MAX_TIME_TO_UPLOAD;
                            if (i4 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    if (j2 <= 9223372036854775L) {
                                        j3 = j2 * 1000;
                                    }
                                    long j4 = jCurrentTimeMillis + j3;
                                    if (j4 >= jCurrentTimeMillis && j4 <= 253402300799999L) {
                                        j = j4;
                                    }
                                } else {
                                    j = jD;
                                }
                                String str3 = k28Var.d;
                                if (str2 != null) {
                                    if (!cqk.d(str3, str2) && (!str3.endsWith(str2) || str3.charAt((str3.length() - str2.length()) - 1) != '.' || uqi.f.b(str3))) {
                                        ws4Var2 = null;
                                    }
                                    ws4Var = ws4Var2;
                                    break;
                                }
                                str2 = str3;
                                if (str3.length() == str2.length() || PublicSuffixDatabase.g.a(str2) != null) {
                                    if (strSubstring == null || !z5h.K0(strSubstring, "/", false)) {
                                        String strB = k28Var.b();
                                        int iY0 = r5h.Y0(strB, '/', 0, 6);
                                        strSubstring = iY0 != 0 ? strB.substring(0, iY0) : "/";
                                    }
                                    ws4Var2 = new ws4(strZ, strZ2, j, str2, strSubstring, z3, z, z2, z4);
                                } else {
                                    ws4Var2 = null;
                                }
                                ws4Var = ws4Var2;
                                break;
                            }
                            int iF = uqi.f(c, i4, length, str);
                            int iF2 = uqi.f(c2, i4, iF, str);
                            String strZ3 = uqi.z(i4, iF2, str);
                            String strZ4 = iF2 < iF ? uqi.z(iF2 + 1, iF, str) : "";
                            if (strZ3.equalsIgnoreCase(ClientCookie.EXPIRES_ATTR)) {
                                try {
                                    jD = d(strZ4.length(), strZ4);
                                    z2 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strZ3.equalsIgnoreCase(ClientCookie.MAX_AGE_ATTR)) {
                                try {
                                    j2 = Long.parseLong(strZ4);
                                    if (j2 <= 0) {
                                        j2 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    if (!Pattern.compile("-?\\d+").matcher(strZ4).matches()) {
                                        throw e;
                                    }
                                    if (z5h.K0(strZ4, "-", false)) {
                                        j3 = Long.MIN_VALUE;
                                    }
                                    j2 = j3;
                                }
                                z2 = true;
                            } else if (strZ3.equalsIgnoreCase(ClientCookie.DOMAIN_ATTR)) {
                                if (strZ4.endsWith(".")) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strF = np4.F(r5h.f1(strZ4, "."));
                                if (strF == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strF;
                                z4 = false;
                            } else if (strZ3.equalsIgnoreCase(ClientCookie.PATH_ATTR)) {
                                strSubstring = strZ4;
                            } else if (strZ3.equalsIgnoreCase(ClientCookie.SECURE_ATTR)) {
                                z3 = true;
                            } else if (strZ3.equalsIgnoreCase("httponly")) {
                                z = true;
                            }
                            i4 = iF + 1;
                            c = ';';
                            c2 = '=';
                        }
                    } else {
                        ws4Var = null;
                    }
                } else {
                    ws4Var = null;
                }
            }
            if (ws4Var != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(ws4Var);
            }
            i3++;
            i = 2;
        }
        return arrayList2 != null ? Collections.unmodifiableList(arrayList2) : r66Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    public static long d(int i, String str) {
        int iA = a(str, 0, i, false);
        Matcher matcher = ws4.m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iV0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iA < i) {
            int iA2 = a(str, iA + 1, i, true);
            matcher.region(iA, iA2);
            if (i3 == -1 && matcher.usePattern(ws4.m).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i5 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(ws4.l).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iV0 == -1) {
                Pattern pattern = ws4.k;
                if (matcher.usePattern(pattern).matches()) {
                    iV0 = r5h.V0(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(ws4.j).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iA = a(str, iA2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            ore.p("Failed requirement.");
            return 0L;
        }
        if (iV0 == -1) {
            ore.p("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            ore.p("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            ore.p("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            ore.p("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            ore.p("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(uqi.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iV0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
