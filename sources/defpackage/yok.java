package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yok {
    public static final String[] a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static long a(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(c0a.m(j2, ")", qt4.s(j, "overflow: checkedAdd(", ", ")));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long b(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (ii9.a[roundingMode.ordinal()]) {
            case 1:
                qqk.b(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                throw new AssertionError();
        }
    }

    public static long c(long j, long j2) {
        qqk.a(j, "a");
        qqk.a(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    public static final Set d(String str) {
        Character ch;
        if (str.length() == 0) {
            return c76.a;
        }
        String strSubstring = str.substring(r5h.U0(str, '(', 0, 6) + 1, r5h.Y0(str, ')', 0, 6));
        ArrayList arrayList = new ArrayList();
        zv zvVar = new zv();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < strSubstring.length()) {
            char cCharAt = strSubstring.charAt(i2);
            int i4 = i3 + 1;
            if (cCharAt == '\"' || cCharAt == '\'') {
                if (zvVar.isEmpty()) {
                    zvVar.addFirst(Character.valueOf(cCharAt));
                } else {
                    ch = (Character) (zvVar.isEmpty() ? null : zvVar.b[zvVar.a]);
                    if (ch != null && ch.charValue() == cCharAt) {
                        cx3.f1(zvVar);
                    }
                }
            } else if (cCharAt != ',') {
                if (cCharAt != '[') {
                    if (cCharAt != ']') {
                        if (cCharAt == '`') {
                            if (zvVar.isEmpty()) {
                                zvVar.addFirst(Character.valueOf(cCharAt));
                            } else {
                                ch = (Character) (zvVar.isEmpty() ? null : zvVar.b[zvVar.a]);
                                if (ch != null) {
                                    cx3.f1(zvVar);
                                }
                            }
                        }
                    } else if (!zvVar.isEmpty()) {
                        Character ch2 = (Character) (zvVar.isEmpty() ? null : zvVar.b[zvVar.a]);
                        if (ch2 != null && ch2.charValue() == '[') {
                            cx3.f1(zvVar);
                        }
                    }
                } else if (zvVar.isEmpty()) {
                    zvVar.addFirst(Character.valueOf(cCharAt));
                }
            } else if (zvVar.isEmpty()) {
                String strSubstring2 = strSubstring.substring(i + 1, i3);
                int length = strSubstring2.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (i5 <= length) {
                    boolean z2 = cqk.i(strSubstring2.charAt(!z ? i5 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i5++;
                    } else {
                        z = true;
                    }
                }
                arrayList.add(strSubstring2.subSequence(i5, length + 1).toString());
                i = i3;
            }
            i2++;
            i3 = i4;
        }
        arrayList.add(r5h.y1(strSubstring.substring(i + 1)).toString());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str2 = (String) obj;
            for (int i6 = 0; i6 < 9; i6++) {
                if (z5h.K0(str2, a[i6], false)) {
                    arrayList2.add(obj);
                    break;
                }
            }
        }
        return ww3.X1(arrayList2);
    }

    public static final List e(vxe vxeVar) {
        int iN = qyj.n(vxeVar, "id");
        int iN2 = qyj.n(vxeVar, "seq");
        int iN3 = qyj.n(vxeVar, "from");
        int iN4 = qyj.n(vxeVar, "to");
        c79 c79VarW = yab.w();
        while (vxeVar.M0()) {
            c79VarW.add(new v77(vxeVar.B0(iN3), (int) vxeVar.getLong(iN), (int) vxeVar.getLong(iN2), vxeVar.B0(iN4)));
        }
        return ww3.L1(yab.j(c79VarW));
    }

    public static final dhh f(qxe qxeVar, String str, boolean z) {
        vxe vxeVarO0 = qxeVar.O0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iN = qyj.n(vxeVarO0, "seqno");
            int iN2 = qyj.n(vxeVarO0, "cid");
            int iN3 = qyj.n(vxeVarO0, SdkMetricStatEvent.NAME_KEY);
            int iN4 = qyj.n(vxeVarO0, "desc");
            if (iN != -1 && iN2 != -1 && iN3 != -1 && iN4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (vxeVarO0.M0()) {
                    if (((int) vxeVarO0.getLong(iN2)) >= 0) {
                        int i = (int) vxeVarO0.getLong(iN);
                        String strB0 = vxeVarO0.B0(iN3);
                        String str2 = vxeVarO0.getLong(iN4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strB0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listM1 = ww3.M1(linkedHashMap.entrySet(), new xa8(22));
                ArrayList arrayList = new ArrayList(yw3.W0(listM1, 10));
                Iterator it = listM1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listT1 = ww3.T1(arrayList);
                List listM2 = ww3.M1(linkedHashMap2.entrySet(), new xa8(23));
                ArrayList arrayList2 = new ArrayList(yw3.W0(listM2, 10));
                Iterator it2 = listM2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                dhh dhhVar = new dhh(str, z, listT1, ww3.T1(arrayList2));
                p90.f(vxeVarO0, null);
                return dhhVar;
            }
            p90.f(vxeVarO0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public static long g(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public static long h(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + BuildConfig.MAX_TIME_TO_UPLOAD;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static long i(long j, long j2) {
        long j3 = j - j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) >= 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public static String j(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(k(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(k(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String k(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strQ = qt4.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strQ), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strQ.length() + 8 + name2.length() + 1);
            nbh.G(sb, "<", strQ, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
