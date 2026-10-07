package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class daf {
    public static final fgb b = new fgb();
    public final ny8 a;

    public daf(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0050 A[FALL_THROUGH, RETURN] */
    public static boolean h(char c) {
        if (!Character.isWhitespace(c) && c != '[' && c != '{' && c != 160 && c != 8239 && c != 8287 && c != 8470 && c != 12288 && c != ']' && c != '^' && c != '}' && c != '~' && c != 8232 && c != 8233) {
            switch (c) {
                default:
                    switch (c) {
                        default:
                            switch (c) {
                                default:
                                    switch (c) {
                                        default:
                                            switch (c) {
                                                default:
                                                    switch (c) {
                                                        case 8192:
                                                        case 8193:
                                                        case 8194:
                                                        case 8195:
                                                        case 8196:
                                                        case 8197:
                                                        case 8198:
                                                        case 8199:
                                                        case 8200:
                                                        case 8201:
                                                        case 8202:
                                                        case 8203:
                                                        case 8204:
                                                        case 8205:
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                                case '>':
                                                case '?':
                                                case '@':
                                                    return true;
                                            }
                                        case ':':
                                        case ';':
                                        case '<':
                                            return true;
                                    }
                                case ',':
                                case '-':
                                case '.':
                                case '/':
                                    return true;
                            }
                        case '(':
                        case ')':
                        case '*':
                            return true;
                    }
                case '!':
                case '\"':
                case vg8.l /* 35 */:
                    return true;
            }
        }
        return true;
    }

    public static int i(String str, int i, String str2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length() && i3 < i) {
            if (Character.isLetter(str.charAt(i2))) {
                boolean z2 = false;
                int i4 = i3;
                int i5 = i2;
                while (i2 < Math.min(i5 + 3, str.length()) && !z2) {
                    int i6 = i2 + 1;
                    String strJ = j(str.substring(i5, i6));
                    int i7 = i4;
                    while (i7 < Math.min(i4 + 3, str2.length())) {
                        int i8 = i7 + 1;
                        if (strJ.equals(str2.substring(i4, i8))) {
                            if (z && i4 + 1 >= i) {
                                return i5;
                            }
                            i5 = i2;
                            z2 = true;
                            i4 = i7;
                            break;
                        }
                        i7 = i8;
                    }
                    i2 = i6;
                }
                if (!z2) {
                    StringBuilder sbQ = qv1.q("cannot correctly find composed index: original ", str, ", query = ", str2, ", index = ");
                    sbQ.append(str2);
                    gm0.q("daf", sbQ.toString());
                    return -1;
                }
                i2 = i5;
                i3 = i4;
            }
            i2++;
            i3++;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0178  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:145:0x0219  */
    /* JADX WARN: Code duplicated, block: B:153:0x0244  */
    /* JADX WARN: Code duplicated, block: B:154:0x024b  */
    /* JADX WARN: Code duplicated, block: B:158:0x025d  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:192:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:194:0x0303  */
    /* JADX WARN: Code duplicated, block: B:195:0x0308  */
    /* JADX WARN: Code duplicated, block: B:196:0x030f  */
    /* JADX WARN: Code duplicated, block: B:198:0x031b  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    /* JADX WARN: Code duplicated, block: B:83:0x0114  */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0139  */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x00d2. Please report as an issue. */
    public static String j(String str) {
        char c;
        char c2;
        char c3;
        char c4;
        String string = "";
        if (ch3.r(str)) {
            return "";
        }
        String upperCase = yab.B(str).toUpperCase();
        b.getClass();
        if (upperCase == null || upperCase.isEmpty()) {
            string = upperCase;
        } else {
            StringBuilder sb = new StringBuilder(upperCase.length());
            int i = 0;
            boolean z = true;
            int i2 = 0;
            boolean z2 = false;
            char c5 = 0;
            while (true) {
                c = '9';
                c2 = '0';
                if (i2 >= upperCase.length()) {
                    break;
                }
                char upperCase2 = Character.toUpperCase(upperCase.charAt(i2));
                if ('0' > upperCase2 || upperCase2 > '9') {
                    if (Character.isLetter(upperCase2) && upperCase2 != c5) {
                        sb.append(upperCase2);
                        if (!z2 && 1024 <= upperCase2 && upperCase2 < 1536) {
                            z2 = true;
                        }
                        if (z) {
                            z = false;
                        }
                    }
                    i2++;
                } else {
                    sb.append(upperCase2);
                }
                c5 = upperCase2;
                i2++;
            }
            char c6 = z ? (char) 1 : z2 ? (char) 2 : (char) 3;
            if (sb.length() != 0) {
                if (c6 == 1) {
                    string = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder(upperCase);
                    boolean z3 = c6 == 2;
                    StringBuilder sb3 = new StringBuilder(sb2.length());
                    while (i < sb2.length()) {
                        char cCharAt = sb2.charAt(i);
                        if (cCharAt != c2) {
                            Object obj = "CH";
                            if (cCharAt != '4') {
                                if (cCharAt == '6') {
                                    sb3.append('S');
                                } else if (cCharAt == 1025) {
                                    sb3.append("E");
                                } else if (cCharAt == 1028) {
                                    sb3.append('E');
                                } else if (cCharAt == 1168) {
                                    sb3.append('G');
                                } else if (cCharAt == 1030) {
                                    sb3.append('I');
                                } else if (cCharAt != 1031) {
                                    switch (cCharAt) {
                                        case 'A':
                                            sb3.append('A');
                                            break;
                                        case 'B':
                                            sb3.append('B');
                                            break;
                                        case 'C':
                                            if (z3 || sb2.length() == 1) {
                                                sb3.append('S');
                                            } else if (!fgb.a(sb2, i, 'H')) {
                                                sb3.append('C');
                                            } else {
                                                sb3.append("CH");
                                                i++;
                                            }
                                            break;
                                        case 'D':
                                            sb3.append('D');
                                            break;
                                        case 'E':
                                            sb3.append('E');
                                            break;
                                        case 'F':
                                            sb3.append('F');
                                            break;
                                        case 'G':
                                            sb3.append('G');
                                            break;
                                        case 'H':
                                            if (z3) {
                                                sb3.append('N');
                                            } else if ((i == 0 || sb2.charAt(i - 1) != 'S') && (i == 0 || sb2.charAt(i - 1) != 'Z')) {
                                                sb3.append('H');
                                            }
                                            break;
                                        case 'I':
                                            sb3.append('I');
                                            break;
                                        case 'J':
                                            if (fgb.a(sb2, i, 'E')) {
                                                sb3.append("JE");
                                            } else if (fgb.a(sb2, i, 'A')) {
                                                sb3.append("JA");
                                            } else if (fgb.a(sb2, i, 'U')) {
                                                sb3.append("JU");
                                            } else if (!fgb.a(sb2, i, 'O')) {
                                                sb3.append('J');
                                            } else {
                                                sb3.append("JO");
                                            }
                                            i++;
                                            break;
                                        case 'K':
                                            if (!fgb.a(sb2, i, 'H')) {
                                                sb3.append('K');
                                            } else {
                                                sb3.append('H');
                                                i++;
                                            }
                                            break;
                                        case 'L':
                                            sb3.append('L');
                                            break;
                                        case 'M':
                                            sb3.append('M');
                                            break;
                                        case 'N':
                                            sb3.append('N');
                                            break;
                                        case 'O':
                                            c4 = '0';
                                            c3 = '9';
                                            break;
                                        case 'P':
                                            if (!fgb.a(sb2, i, 'H')) {
                                                sb3.append('P');
                                            } else {
                                                sb3.append('F');
                                                i++;
                                            }
                                            break;
                                        case 'Q':
                                            sb3.append("KU");
                                            break;
                                        case 'R':
                                            sb3.append('R');
                                            break;
                                        case 'S':
                                            if (fgb.a(sb2, i, 'C') && fgb.a(sb2, i + 1, 'H')) {
                                                sb3.append("SH");
                                                i += 2;
                                            } else {
                                                if (fgb.a(sb2, i, 'C')) {
                                                    sb3.append("SC");
                                                } else if (!fgb.a(sb2, i, 'H')) {
                                                    sb3.append('S');
                                                } else {
                                                    sb3.append("SH");
                                                }
                                                i++;
                                            }
                                            break;
                                        case 'T':
                                            if (fgb.a(sb2, i, 'H')) {
                                                i++;
                                                sb3.append('T');
                                            } else if (!fgb.a(sb2, i, 'S')) {
                                                sb3.append('T');
                                            } else {
                                                i++;
                                                sb3.append('C');
                                            }
                                            break;
                                        case 'U':
                                            sb3.append('U');
                                            break;
                                        case 'V':
                                        case 'W':
                                            sb3.append('V');
                                            break;
                                        case 'X':
                                            sb3.append("KS");
                                            break;
                                        case 'Y':
                                            if (fgb.a(sb2, i, 'A')) {
                                                sb3.append("YA");
                                            } else if (fgb.a(sb2, i, 'E') || fgb.a(sb2, i, 'O')) {
                                                sb3.append("E");
                                            } else {
                                                sb3.append('Y');
                                            }
                                            i++;
                                            break;
                                        case 'Z':
                                            if (!fgb.a(sb2, i, 'H')) {
                                                sb3.append('Z');
                                            } else {
                                                sb3.append('J');
                                                i++;
                                            }
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 1040:
                                                    sb3.append('A');
                                                    break;
                                                case 1041:
                                                    sb3.append('B');
                                                    break;
                                                case 1042:
                                                    sb3.append('V');
                                                    break;
                                                case 1043:
                                                    sb3.append('G');
                                                    break;
                                                case 1044:
                                                    sb3.append('D');
                                                    break;
                                                case 1045:
                                                    sb3.append("E");
                                                    break;
                                                case 1046:
                                                    sb3.append('J');
                                                    break;
                                                case 1047:
                                                    sb3.append('Z');
                                                    break;
                                                case 1048:
                                                    sb3.append('I');
                                                    break;
                                                case 1049:
                                                    if (fgb.a(sb2, i, (char) 1040)) {
                                                        sb3.append("YA");
                                                    } else if (fgb.a(sb2, i, (char) 1045) || fgb.a(sb2, i, (char) 1054)) {
                                                        sb3.append("E");
                                                    } else {
                                                        sb3.append('Y');
                                                    }
                                                    i++;
                                                    break;
                                                case 1050:
                                                    sb3.append('K');
                                                    break;
                                                case 1051:
                                                    sb3.append('L');
                                                    break;
                                                case 1052:
                                                    sb3.append('M');
                                                    break;
                                                case 1053:
                                                    sb3.append('N');
                                                    break;
                                                case 1054:
                                                    if (i != 0 && sb2.charAt(i - 1) == 1068) {
                                                        sb3.append("E");
                                                    } else {
                                                        sb3.append('O');
                                                    }
                                                    break;
                                                case 1055:
                                                    sb3.append('P');
                                                    break;
                                                case 1056:
                                                    sb3.append('R');
                                                    break;
                                                case 1057:
                                                    sb3.append('S');
                                                    break;
                                                case 1058:
                                                    sb3.append('T');
                                                    break;
                                                case 1059:
                                                    sb3.append('U');
                                                    break;
                                                case 1060:
                                                    sb3.append('F');
                                                    break;
                                                case 1061:
                                                    sb3.append('H');
                                                    break;
                                                case 1062:
                                                    sb3.append('C');
                                                    break;
                                                case 1063:
                                                    break;
                                                case 1064:
                                                    sb3.append("SH");
                                                    break;
                                                case 1065:
                                                    sb3.append("SH");
                                                    break;
                                                case 1066:
                                                case 1068:
                                                    if (i + 1 >= sb2.length() || sb2.length() <= 1) {
                                                        sb3.append(cCharAt);
                                                    }
                                                    break;
                                                case 1067:
                                                    sb3.append('Y');
                                                    break;
                                                case 1069:
                                                    sb3.append('E');
                                                    break;
                                                case 1070:
                                                    sb3.append("YU");
                                                    break;
                                                case 1071:
                                                    sb3.append("YA");
                                                    break;
                                                default:
                                                    sb3.append(cCharAt);
                                                    break;
                                            }
                                            break;
                                    }
                                    i++;
                                    c2 = c4;
                                    c = c3;
                                } else {
                                    sb3.append('Y');
                                }
                                c4 = '0';
                                c3 = '9';
                                i++;
                                c2 = c4;
                                c = c3;
                            }
                            if (z3) {
                                int i3 = i + 1;
                                if (i3 < sb2.length()) {
                                    char cCharAt2 = sb2.charAt(i3);
                                    c4 = '0';
                                    c3 = '9';
                                    if ('0' <= cCharAt2 && cCharAt2 <= '9') {
                                    }
                                } else {
                                    c4 = '0';
                                    c3 = '9';
                                }
                                sb3.append(obj);
                                i++;
                                c2 = c4;
                                c = c3;
                            } else {
                                c4 = '0';
                                c3 = '9';
                            }
                            obj = '4';
                            sb3.append(obj);
                            i++;
                            c2 = c4;
                            c = c3;
                        } else {
                            c3 = c;
                            c4 = c2;
                        }
                        sb3.append('O');
                        i++;
                        c2 = c4;
                        c = c3;
                    }
                    string = sb3.toString();
                }
            }
        }
        return ch3.r(string) ? str : string;
    }

    public final f9f a(rt2 rt2Var, String str) {
        List listD = d(rt2Var.F(), str);
        if (listD.isEmpty()) {
            String strB = xoh.b(rt2Var.b.J);
            if (!ch3.r(strB)) {
                listD = d(strB, str);
            }
            vg4 vg4VarW = rt2Var.w();
            if (listD.isEmpty() && vg4VarW != null) {
                listD = b(vg4VarW, str).c;
            }
        }
        return f9f.a(rt2Var, listD, null);
    }

    public final f9f b(vg4 vg4Var, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = vg4Var.q().iterator();
        while (it.hasNext()) {
            String strA = ((fi4) it.next()).a();
            if (!ch3.r(strA)) {
                arrayList.add(strA);
            }
        }
        String strR = vg4Var.r();
        if (!ch3.r(strR)) {
            arrayList.add(strR);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.addAll(d((String) it2.next(), str));
        }
        return f9f.b(vg4Var, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    public final List c(String str, List list) {
        if (ch3.r(str)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!ch3.r(str2)) {
                int iIndexOf = str.toLowerCase().indexOf(str2.toLowerCase(), 0);
                while (iIndexOf >= 0 && iIndexOf < str.length()) {
                    if (iIndexOf != 0) {
                        int i = iIndexOf - 1;
                        if (h(str.charAt(i)) || h(str.charAt(iIndexOf))) {
                            arrayList.add(new caf(iIndexOf, str2.length() + iIndexOf));
                        } else if (iIndexOf >= 0 && iIndexOf < str.length()) {
                            ny8 ny8Var = this.a;
                            if (((p4c) ny8Var.getValue()).j(i, str) || ((p4c) ny8Var.getValue()).j(iIndexOf - 2, str)) {
                                arrayList.add(new caf(iIndexOf, str2.length() + iIndexOf));
                            }
                        }
                    } else {
                        arrayList.add(new caf(iIndexOf, str2.length() + iIndexOf));
                    }
                    iIndexOf = str.toLowerCase().indexOf(str2.toLowerCase(), iIndexOf + 1);
                }
            }
        }
        return arrayList;
    }

    public final List d(String str, String str2) {
        int i;
        int i2;
        if (ch3.r(str) || ch3.r(str2)) {
            return Collections.EMPTY_LIST;
        }
        HashSet hashSet = new HashSet();
        String[] strArrK = k(str);
        String[] strArrK2 = k(str2);
        for (String str3 : strArrK) {
            String strJ = j(str3);
            for (String str4 : strArrK2) {
                if (str3.regionMatches(true, 0, str4, 0, str4.length())) {
                    hashSet.add(str4);
                } else {
                    String strJ2 = j(str4);
                    if (strJ.startsWith(strJ2) && (i = i(str3, 0, strJ, true)) >= 0 && (i2 = i(str3, strJ2.length(), strJ, false)) > i) {
                        hashSet.add(str3.substring(i, i2));
                    }
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public final boolean e(rt2 rt2Var, String str) {
        if (g(rt2Var.F(), str) || g(xoh.a(rt2Var.b.J), str)) {
            return true;
        }
        return rt2Var.w() != null && f(rt2Var.w(), str);
    }

    public final boolean f(vg4 vg4Var, String str) {
        if (ch3.r(str)) {
            return true;
        }
        List listQ = vg4Var.q();
        String strR = vg4Var.r();
        if (ch3.r(str)) {
            return true;
        }
        baf bafVar = new baf(this, 0, str);
        if (bafVar.test(xoh.a(strR))) {
            return true;
        }
        return listQ.stream().map(new f05(12)).anyMatch(bafVar);
    }

    public final boolean g(String str, String str2) {
        if (!ch3.r(str2)) {
            String strTrim = str.trim();
            String[] strArrK = k(str2.trim());
            if (strArrK.length != 0) {
                String[] strArr = new String[strArrK.length];
                for (int i = 0; i < strArrK.length; i++) {
                    strArr[i] = j(strArrK[i]);
                }
                String[] strArrK2 = k(strTrim);
                for (int i2 = 0; i2 < strArrK.length; i2++) {
                    String str3 = strArrK[i2];
                    String str4 = strArr[i2];
                    boolean z = false;
                    for (String str5 : strArrK2) {
                        if (str5.regionMatches(true, 0, str3, 0, str3.length()) || j(str5).startsWith(str4)) {
                            z = true;
                        }
                    }
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String[] k(String str) {
        return xoh.c(str, (p4c) this.a.getValue());
    }
}
