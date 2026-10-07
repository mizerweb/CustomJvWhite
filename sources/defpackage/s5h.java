package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class s5h extends sb8 {
    public static String w0(String str) {
        return yhf.r0(new m2i(new sw(3, str), new qo1("    ", 14)), "\n");
    }

    public static String x0(String str) {
        int length;
        List listA1 = r5h.a1(str);
        List list = listA1;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!r5h.X0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!tre.l0(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) ww3.E1(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listA1.size();
        int iO0 = xw3.O0(listA1);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            String strSubstring = null;
            if (!it2.hasNext()) {
                StringBuilder sb = new StringBuilder(length3);
                ww3.y1(arrayList3, sb, "\n", null, 124);
                return sb.toString();
            }
            Object next = it2.next();
            int i = length + 1;
            if (length < 0) {
                xw3.V0();
                throw null;
            }
            String str3 = (String) next;
            if ((length != 0 && length != iO0) || !r5h.X0(str3)) {
                if (iIntValue < 0) {
                    c.o(c0a.k(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i;
        }
    }

    public static String y0(String str) {
        if (r5h.X0("|")) {
            ore.p("marginPrefix must be non-blank string.");
            return null;
        }
        List listA1 = r5h.a1(str);
        int length = str.length();
        listA1.size();
        int iO0 = xw3.O0(listA1);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listA1) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == iO0) && r5h.X0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!tre.l0(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        ww3.y1(arrayList, sb, "\n", null, 124);
        return sb.toString();
    }
}
