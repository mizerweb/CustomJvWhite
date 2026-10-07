package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r5h extends z5h {
    public static boolean L0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (V0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (T0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean M0(CharSequence charSequence, char c) {
        return U0(charSequence, c, 0, 2) >= 0;
    }

    public static boolean N0(String str, char c) {
        return str.length() > 0 && tre.U(str.charAt(Q0(str)), c, false);
    }

    public static boolean O0(String str, CharSequence charSequence) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : e1(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static Character P0(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static int Q0(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static Character R0(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static final int S0(int i, CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? T0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int T0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        fj8 fj8Var;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iQ0 = Q0(charSequence);
            if (i3 > iQ0) {
                i3 = iQ0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            fj8Var = new fj8(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            fj8Var = new hj8(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = fj8Var.c;
        int i6 = fj8Var.b;
        int i7 = fj8Var.a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!e1(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static int U0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? W0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int V0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return S0(i, charSequence, str, z);
    }

    public static final int W0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                ore.f("Array is empty.");
                return 0;
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            }
            ore.p("Array has more than one element.");
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        int iQ0 = Q0(charSequence);
        if (i > iQ0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (tre.U(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iQ0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean X0(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!tre.l0(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int Y0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = Q0(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int iQ0 = Q0(charSequence);
        if (i > iQ0) {
            i = iQ0;
        }
        while (-1 < i) {
            if (tre.U(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int Z0(String str, CharSequence charSequence, int i) {
        int iQ0 = (i & 2) != 0 ? Q0(charSequence) : 0;
        return !(charSequence instanceof String) ? T0(charSequence, str, iQ0, 0, false, true) : ((String) charSequence).lastIndexOf(str, iQ0);
    }

    public static List a1(String str) {
        c29 c29Var = new c29(str);
        if (!c29Var.hasNext()) {
            return r66.a;
        }
        Object next = c29Var.next();
        if (!c29Var.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c29Var.hasNext()) {
            arrayList.add(c29Var.next());
        }
        return arrayList;
    }

    public static String b1(int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            ore.p(c0a.k(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String c1(String str, int i, char c) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            ore.p(c0a.k(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static mh5 d1(CharSequence charSequence, String[] strArr, final boolean z, int i) {
        i1(i);
        final List listAsList = Arrays.asList(strArr);
        return new mh5(charSequence, i, new qf7() { // from class: a6h
            @Override // defpackage.qf7
            public final Object invoke(Object obj, Object obj2) {
                Object next;
                ylc ylcVar;
                String str;
                boolean z2;
                ylc ylcVar2;
                Object next2;
                String str2;
                String str3;
                int length;
                Object objK1;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                List list = listAsList;
                boolean z3 = z;
                if (z3 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    hj8 hj8Var = new hj8(iIntValue, charSequence2.length(), 1);
                    boolean z4 = charSequence2 instanceof String;
                    int i2 = hj8Var.c;
                    int i3 = hj8Var.b;
                    if (z4) {
                        if ((i2 > 0 && iIntValue <= i3) || (i2 < 0 && i3 <= iIntValue)) {
                            int i4 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it.next();
                                    str2 = (String) next2;
                                    str3 = (String) charSequence2;
                                    length = str2.length();
                                } while (!(!z3 ? str2.regionMatches(0, str3, i4, length) : str2.regionMatches(z3, 0, str3, i4, length)));
                                String str4 = (String) next2;
                                if (str4 != null) {
                                    ylcVar = new ylc(Integer.valueOf(i4), str4);
                                    ylcVar2 = ylcVar;
                                } else if (i4 != i3) {
                                    i4 += i2;
                                }
                            }
                        }
                    } else {
                        if ((i2 > 0 && iIntValue <= i3) || (i2 < 0 && i3 <= iIntValue)) {
                            int i5 = iIntValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    str = (String) next;
                                    z2 = z3;
                                    z3 = z2;
                                } while (!r5h.e1(str, 0, charSequence2, i5, str.length(), z2));
                                String str5 = (String) next;
                                if (str5 != null) {
                                    ylcVar = new ylc(Integer.valueOf(i5), str5);
                                    ylcVar2 = ylcVar;
                                } else if (i5 != i3) {
                                    i5 += i2;
                                }
                            }
                        }
                    }
                } else {
                    List list2 = list;
                    if (list2 instanceof List) {
                        objK1 = ww3.K1(list2);
                    } else {
                        Iterator it3 = list2.iterator();
                        if (!it3.hasNext()) {
                            ore.f("Collection is empty.");
                            return null;
                        }
                        Object next3 = it3.next();
                        if (it3.hasNext()) {
                            ore.p("Collection has more than one element.");
                            return null;
                        }
                        objK1 = next3;
                    }
                    String str6 = (String) objK1;
                    int iV0 = r5h.V0(charSequence2, str6, iIntValue, false, 4);
                    ylcVar2 = iV0 < 0 ? null : new ylc(Integer.valueOf(iV0), str6);
                }
                if (ylcVar2 != null) {
                    return new ylc(ylcVar2.a, Integer.valueOf(((String) ylcVar2.b).length()));
                }
                return null;
            }
        });
    }

    public static final boolean e1(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!tre.U(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String f1(String str, String str2) {
        return n1(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String g1(String str, String str2) {
        return O0(str2, str) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static StringBuilder h1(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            c.r(nbh.u("End index (", i2, ") is less than start index (", i, ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void i1(int i) {
        if (i >= 0) {
            return;
        }
        c.o(zo5.h(i, "Limit must be non-negative, but was "));
    }

    public static char j1(String str) {
        int length = str.length();
        if (length == 0) {
            ore.f("Char sequence is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return str.charAt(0);
        }
        ore.p("Char sequence has more than one element.");
        return (char) 0;
    }

    public static final List k1(int i, CharSequence charSequence, String str, boolean z) {
        i1(i);
        int length = 0;
        int iS0 = S0(0, charSequence, str, z);
        if (iS0 == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iS0).toString());
            length = str.length() + iS0;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iS0 = S0(length, charSequence, str, z);
        } while (iS0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List l1(CharSequence charSequence, char[] cArr) {
        if (cArr.length == 1) {
            return k1(0, charSequence, String.valueOf(cArr[0]), false);
        }
        i1(0);
        s18<hj8> s18Var = new s18(1, new mh5(charSequence, 0, new s81(24, cArr)));
        ArrayList arrayList = new ArrayList(yw3.W0(s18Var, 10));
        for (hj8 hj8Var : s18Var) {
            arrayList.add(charSequence.subSequence(hj8Var.a, hj8Var.b + 1).toString());
        }
        return arrayList;
    }

    public static List m1(CharSequence charSequence, String[] strArr, int i) {
        boolean z = (i & 2) == 0;
        int i2 = (i & 4) != 0 ? 0 : 2;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return k1(i2, charSequence, str, z);
            }
        }
        s18<hj8> s18Var = new s18(1, d1(charSequence, strArr, z, i2));
        ArrayList arrayList = new ArrayList(yw3.W0(s18Var, 10));
        for (hj8 hj8Var : s18Var) {
            arrayList.add(charSequence.subSequence(hj8Var.a, hj8Var.b + 1).toString());
        }
        return arrayList;
    }

    public static boolean n1(CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? e1(charSequence, 0, str, 0, str.length(), z) : z5h.K0((String) charSequence, str, false);
    }

    public static boolean o1(String str, char c) {
        return str.length() > 0 && tre.U(str.charAt(0), c, false);
    }

    public static String p1(char c, String str, String str2) {
        int iU0 = U0(str, c, 0, 6);
        return iU0 == -1 ? str2 : str.substring(iU0 + 1, str.length());
    }

    public static String q1(String str, String str2, String str3) {
        int iV0 = V0(str, str2, 0, false, 6);
        return iV0 == -1 ? str3 : str.substring(str2.length() + iV0, str.length());
    }

    public static String r1(char c, String str, String str2) {
        int iY0 = Y0(str, c, 0, 6);
        return iY0 == -1 ? str2 : str.substring(iY0 + 1, str.length());
    }

    public static String s1(String str, String str2) {
        int iV0 = V0(str, str2, 0, false, 6);
        return iV0 == -1 ? str : str.substring(0, iV0);
    }

    public static CharSequence t1(int i, CharSequence charSequence) {
        if (i < 0) {
            c.o(c0a.k(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String u1(int i, String str) {
        if (i < 0) {
            c.o(c0a.k(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String v1(int i, String str) {
        if (i < 0) {
            c.o(c0a.k(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static boolean w1(String str) {
        if (str.equals("true")) {
            return true;
        }
        if (str.equals("false")) {
            return false;
        }
        ore.p("The string doesn't represent a boolean value: ".concat(str));
        return false;
    }

    public static Boolean x1(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence y1(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zL0 = tre.l0(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zL0) {
                    break;
                }
                length--;
            } else if (zL0) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence z1(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!tre.l0(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }
}
