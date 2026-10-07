package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xml {
    public static vfk a(boolean z, String[] strArr, y3e y3eVar) {
        String str = z ? "m=audio " : "m=video ";
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = -1;
                break;
            }
            if (strArr[i].startsWith(str)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            y3eVar.log("CodecPrefUtil", "parseMSection: didn't find section: ".concat(z ? "m=audio" : "m=video"));
            return null;
        }
        vfk vfkVarA = vfk.a(i, strArr[i]);
        if (vfkVarA == null) {
            y3eVar.log("CodecPrefUtil", "parseMSection: failed to parse line: ".concat(z ? "m=audio" : "m=video"));
            return null;
        }
        while (true) {
            i++;
            if (i >= strArr.length || strArr[i].startsWith("m=")) {
                break;
            }
            vfkVarA.e(i, strArr[i]);
        }
        return vfkVarA;
    }

    public static String b(String str, String str2, String str3, y3e y3eVar) {
        int i;
        String string;
        wze wzeVar;
        int iIndexOf;
        String strSubstring;
        String[] strArrSplit = str.split("\r\n");
        int i2 = 0;
        while (true) {
            if (i2 >= strArrSplit.length) {
                i2 = -1;
                break;
            }
            if (strArrSplit[i2].startsWith("m=audio")) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            y3eVar.reportException("CodecPrefUtil", "failed to find m=audio line in sdp", new IllegalStateException("failed to find m=audio line in sdp"));
            return str;
        }
        vfk vfkVarA = vfk.a(i2, strArrSplit[i2]);
        if (vfkVarA == null) {
            y3eVar.reportException("CodecPrefUtil", "failed to parse m=audio line", new IllegalStateException("failed to parse m=audio line"));
            return str;
        }
        for (int i3 = i2 + 1; i3 < strArrSplit.length && !strArrSplit[i3].startsWith("m=audio"); i3++) {
            vfkVarA.e(i3, strArrSplit[i3]);
        }
        if (vfkVarA.b("opus").isEmpty()) {
            y3eVar.reportException("CodecPrefUtil", "failed to find desired codec: opus", new IllegalStateException("failed to find desired codec: opus"));
            return str;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListB = vfkVarA.b("opus");
        int size = arrayListB.size();
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        while (i4 < size) {
            Object obj = arrayListB.get(i4);
            i4++;
            dfk dfkVar = (dfk) obj;
            String str6 = dfkVar.a;
            ArrayList arrayList2 = dfkVar.c;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                int i6 = i5 + 1;
                String str7 = (String) obj2;
                arrayList.add(str7);
                if (str7.startsWith("a=fmtp:")) {
                    str5 = str7;
                }
                i5 = i6;
            }
            str4 = str6;
        }
        if (str4 == null) {
            y3eVar.reportException("CodecPrefUtil", "failed to find desired lines", new IllegalStateException("failed to find desired lines"));
            return str;
        }
        if (str5 != null) {
            if (str5.startsWith("a=fmtp:") && (iIndexOf = str5.indexOf(32, 6)) >= 0) {
                String strSubstring2 = str5.substring(0, iIndexOf);
                String strSubstring3 = str5.substring(iIndexOf + 1);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String[] strArrSplit2 = strSubstring3.split(";");
                int i7 = 0;
                for (int length = strArrSplit2.length; i7 < length; length = length) {
                    String strTrim = strArrSplit2[i7].trim();
                    String[] strArr = strArrSplit2;
                    int iIndexOf2 = strTrim.indexOf(61);
                    if (iIndexOf2 < 0) {
                        strSubstring = null;
                    } else {
                        String strSubstring4 = strTrim.substring(0, iIndexOf2);
                        strSubstring = strTrim.substring(iIndexOf2 + 1);
                        strTrim = strSubstring4;
                    }
                    linkedHashMap.put(strTrim, strSubstring);
                    i7++;
                    strArrSplit2 = strArr;
                }
                i = 0;
                wzeVar = new wze(strSubstring2, linkedHashMap);
            } else {
                wzeVar = null;
                i = 0;
            }
            if (wzeVar == null || !wzeVar.b(y3eVar, str2, str3)) {
                return str;
            }
            string = wzeVar.toString();
        } else {
            i = 0;
            string = null;
        }
        StringBuilder sb = new StringBuilder();
        if (string == null) {
            int i8 = i;
            while (i8 < strArrSplit.length) {
                String str8 = strArrSplit[i8];
                sb.append(str8);
                sb.append("\r\n");
                i8++;
                int i9 = i8 < strArrSplit.length ? 1 : i;
                if (arrayList.contains(str8) && (i9 == 0 || !arrayList.contains(strArrSplit[i8]))) {
                    wze wzeVar2 = new wze("a=fmtp:".concat(str4), null);
                    if (wzeVar2.b(y3eVar, str2, str3)) {
                        sb.append(wzeVar2);
                        sb.append("\r\n");
                    }
                }
            }
        } else {
            int length2 = strArrSplit.length;
            while (i < length2) {
                String str9 = strArrSplit[i];
                if (str9.equals(str5)) {
                    sb.append(string);
                } else {
                    sb.append(str9);
                }
                sb.append("\r\n");
                i++;
            }
        }
        return sb.toString();
    }

    public static void c(String str, y3e y3eVar) {
        String[] strArrSplit = str.split("\r\n");
        vfk vfkVarA = a(true, strArrSplit, y3eVar);
        if (vfkVarA == null) {
            y3eVar.log("CodecPrefUtil", "dumpCodecs: failed to parse m=audio line");
        } else {
            y3eVar.log("CodecPrefUtil", "dumpCodecs: m=audio section priority:");
            Iterator it = vfkVarA.d.entrySet().iterator();
            while (it.hasNext()) {
                y3eVar.log("CodecPrefUtil", "dumpCodecs: " + ((dfk) ((Map.Entry) it.next()).getValue()).b);
            }
        }
        vfk vfkVarA2 = a(false, strArrSplit, y3eVar);
        if (vfkVarA2 == null) {
            y3eVar.log("CodecPrefUtil", "dumpCodecs: failed to parse m=video line");
            return;
        }
        y3eVar.log("CodecPrefUtil", "dumpCodecs: m=video section priority:");
        Iterator it2 = vfkVarA2.d.entrySet().iterator();
        while (it2.hasNext()) {
            y3eVar.log("CodecPrefUtil", "dumpCodecs: " + ((dfk) ((Map.Entry) it2.next()).getValue()).b);
        }
    }

    public static a6e d(int i) {
        Object next;
        y1 y1Var = new y1(0, a6e.d);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((a6e) next).a != i);
        a6e a6eVar = (a6e) next;
        if (a6eVar != null) {
            return a6eVar;
        }
        ore.p(zo5.h(i, "Unknown reactionType = "));
        return null;
    }

    public static String e(String str, List list, String str2, boolean z, y3e y3eVar) {
        String[] strArrSplit = str.split("\r\n");
        String strConcat = "m=".concat(str2);
        int i = 0;
        while (true) {
            if (i >= strArrSplit.length) {
                i = -1;
                break;
            }
            if (strArrSplit[i].startsWith(strConcat)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            String strO = c0a.o("failed to find ", strConcat, " line in sdp");
            y3eVar.reportException("CodecPrefUtil", strO, new IllegalStateException(strO));
            return str;
        }
        vfk vfkVarA = vfk.a(i, strArrSplit[i]);
        if (vfkVarA == null) {
            String strO2 = c0a.o("failed to parse ", strConcat, " line");
            y3eVar.reportException("CodecPrefUtil", strO2, new IllegalStateException(strO2));
            return str;
        }
        int i2 = vfkVarA.c;
        boolean z2 = true;
        for (int i3 = i + 1; i3 < strArrSplit.length && !strArrSplit[i3].startsWith(strConcat); i3++) {
            vfkVarA.e(i3, strArrSplit[i3]);
        }
        if (vfkVarA.d(list)) {
            StringBuilder sb = new StringBuilder();
            boolean z3 = false;
            for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                if (i4 == i2) {
                    vfkVarA.f(sb, list, false);
                } else if (i4 != i2 && !vfkVarA.a.contains(Integer.valueOf(i4))) {
                    sb.append(strArrSplit[i4]);
                    sb.append("\r\n");
                } else if (!z3) {
                    vfkVarA.c(sb, list, false);
                    z3 = true;
                }
            }
            return sb.toString();
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder("failed to find any desired codecs: ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (z2) {
                    z2 = false;
                } else {
                    sb3.append(",");
                }
                if (str3 == null) {
                    sb3.append("-");
                } else {
                    sb3.append(str3);
                }
            }
            sb2.append(sb3.toString());
            String string = sb2.toString();
            y3eVar.reportException("CodecPrefUtil", string, new IllegalStateException(string));
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031 A[PHI: r3
  0x0031: PHI (r3v1 vfk) = (r3v0 vfk), (r3v3 vfk), (r3v3 vfk) binds: [B:12:0x001f, B:14:0x0025, B:17:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0087 A[SYNTHETIC] */
    public static String f(String str, boolean z, List list, LinkedList linkedList, y3e y3eVar) {
        vfk vfkVarA;
        boolean z2;
        boolean z3;
        StringBuilder sb;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        String[] strArrSplit = str.split("\r\n");
        vfk vfkVarA2 = null;
        if (list != null) {
            vfkVarA = a(true, strArrSplit, y3eVar);
            if (vfkVarA != null && (vfkVarA.d(list) || z)) {
                z2 = true;
            }
            if (linkedList == null && (vfkVarA2 = a(false, strArrSplit, y3eVar)) != null && (vfkVarA2.d(linkedList) || z)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && !z3) {
                return str;
            }
            sb = new StringBuilder();
            z4 = false;
            z5 = false;
            for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                if (!z2) {
                    i2 = vfkVarA.c;
                    if (i3 == i2) {
                        vfkVarA.f(sb, list, z);
                    } else if (i3 != i2 || vfkVarA.a.contains(Integer.valueOf(i3))) {
                        if (!z4) {
                            vfkVarA.c(sb, list, z);
                            z4 = true;
                        }
                    } else if (z3) {
                        i = vfkVarA2.c;
                        if (i3 == i) {
                            vfkVarA2.f(sb, linkedList, z);
                        } else {
                            if (i3 == i) {
                            }
                            if (!z5) {
                                vfkVarA2.c(sb, linkedList, z);
                                z5 = true;
                            }
                        }
                    } else {
                        sb.append(strArrSplit[i3]);
                        sb.append("\r\n");
                    }
                } else if (z3) {
                    sb.append(strArrSplit[i3]);
                    sb.append("\r\n");
                } else {
                    i = vfkVarA2.c;
                    if (i3 == i) {
                        vfkVarA2.f(sb, linkedList, z);
                    } else if (i3 == i && !vfkVarA2.a.contains(Integer.valueOf(i3))) {
                        sb.append(strArrSplit[i3]);
                        sb.append("\r\n");
                    } else if (!z5) {
                        vfkVarA2.c(sb, linkedList, z);
                        z5 = true;
                    }
                }
            }
            return sb.toString();
        }
        vfkVarA = null;
        z2 = false;
        if (linkedList == null) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (z2) {
        }
        sb = new StringBuilder();
        z4 = false;
        z5 = false;
        while (i3 < strArrSplit.length) {
            if (!z2) {
                i2 = vfkVarA.c;
                if (i3 == i2) {
                    vfkVarA.f(sb, list, z);
                } else {
                    if (i3 != i2) {
                    }
                    if (!z4) {
                        vfkVarA.c(sb, list, z);
                        z4 = true;
                    }
                }
            } else if (z3) {
                sb.append(strArrSplit[i3]);
                sb.append("\r\n");
            } else {
                i = vfkVarA2.c;
                if (i3 == i) {
                    vfkVarA2.f(sb, linkedList, z);
                } else {
                    if (i3 == i) {
                    }
                    if (!z5) {
                        vfkVarA2.c(sb, linkedList, z);
                        z5 = true;
                    }
                }
            }
        }
        return sb.toString();
    }
}
