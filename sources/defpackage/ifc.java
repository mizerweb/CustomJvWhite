package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ifc {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Pattern c = Pattern.compile("<\\d{2}:\\d{2}:\\d{2}\\.\\d{3}>");
    public static final Map d;
    public static final Map e;

    static {
        HashMap map = new HashMap();
        ewi.m(255, 255, 255, map, "white");
        ewi.m(0, 255, 0, map, "lime");
        ewi.m(0, 255, 255, map, "cyan");
        ewi.m(255, 0, 0, map, "red");
        ewi.m(255, 255, 0, map, "yellow");
        ewi.m(255, 0, 255, map, "magenta");
        ewi.m(0, 0, 255, map, "blue");
        ewi.m(0, 0, 0, map, "black");
        d = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        ewi.m(255, 255, 255, map2, "bg_white");
        ewi.m(0, 255, 0, map2, "bg_lime");
        ewi.m(0, 255, 255, map2, "bg_cyan");
        ewi.m(255, 0, 0, map2, "bg_red");
        ewi.m(255, 255, 0, map2, "bg_yellow");
        ewi.m(255, 0, 255, map2, "bg_magenta");
        ewi.m(0, 0, 255, map2, "bg_blue");
        ewi.m(0, 0, 0, map2, "bg_black");
        e = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, ffc ffcVar, List list, SpannableStringBuilder spannableStringBuilder, ArrayList arrayList) {
        int i = ffcVar.b;
        int length = spannableStringBuilder.length();
        String str2 = ffcVar.a;
        str2.getClass();
        int i2 = -1;
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : ffcVar.d) {
                    Map map = d;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = e;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                int iC = c(arrayList, str, ffcVar);
                ArrayList arrayList2 = new ArrayList(list.size());
                arrayList2.addAll(list);
                Collections.sort(arrayList2, efc.c);
                int i3 = ffcVar.b;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList2.size()) {
                    if ("rt".equals(((efc) arrayList2.get(i4)).a.a)) {
                        efc efcVar = (efc) arrayList2.get(i4);
                        int iC2 = c(arrayList, str, efcVar.a);
                        if (iC2 == i2) {
                            iC2 = iC != i2 ? iC : 1;
                        }
                        int i5 = efcVar.a.b - length2;
                        int i6 = efcVar.b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        spannableStringBuilder.setSpan(new qwe(charSequenceSubSequence.toString(), iC2), i3, i5, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i3 = i5;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(arrayList, str, ffcVar);
        for (int i7 = 0; i7 < arrayListB.size(); i7++) {
            ruj rujVar = ((gfc) arrayListB.get(i7)).b;
            if (rujVar.b() != -1) {
                arl.a(spannableStringBuilder, new StyleSpan(rujVar.b()), i, length);
            }
            if (rujVar.j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (rujVar.k == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (rujVar.g) {
                if (!rujVar.g) {
                    ore.k("Font color not defined");
                    return;
                }
                arl.a(spannableStringBuilder, new ForegroundColorSpan(rujVar.f), i, length);
            }
            if (rujVar.i) {
                if (!rujVar.i) {
                    ore.k("Background color not defined.");
                    return;
                }
                arl.a(spannableStringBuilder, new BackgroundColorSpan(rujVar.h), i, length);
            }
            if (rujVar.e != null) {
                arl.a(spannableStringBuilder, new TypefaceSpan(rujVar.e), i, length);
            }
            int i8 = rujVar.n;
            if (i8 == 1) {
                arl.a(spannableStringBuilder, new AbsoluteSizeSpan((int) rujVar.o, true), i, length);
            } else if (i8 == 2) {
                arl.a(spannableStringBuilder, new RelativeSizeSpan(rujVar.o), i, length);
            } else if (i8 == 3) {
                arl.a(spannableStringBuilder, new RelativeSizeSpan(rujVar.o / 100.0f), i, length);
            }
            if (rujVar.q) {
                spannableStringBuilder.setSpan(new bz7(), i, length, 33);
            }
        }
    }

    public static ArrayList b(ArrayList arrayList, String str, ffc ffcVar) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            ruj rujVar = (ruj) arrayList.get(i);
            int iA = rujVar.a(str, ffcVar.a, ffcVar.d, ffcVar.c);
            if (iA > 0) {
                arrayList2.add(new gfc(iA, rujVar));
            }
        }
        Collections.sort(arrayList2);
        return arrayList2;
    }

    public static int c(ArrayList arrayList, String str, ffc ffcVar) {
        ArrayList arrayListB = b(arrayList, str, ffcVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((gfc) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00d9. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ArrayList d(String str, Matcher matcher, nmc nmcVar, ArrayList arrayList) {
        int i;
        int i2;
        int i3;
        int i4;
        hfc hfcVar = new hfc();
        hfcVar.a = 0L;
        hfcVar.b = 0L;
        int i5 = 2;
        hfcVar.c = 2;
        hfcVar.d = -3.4028235E38f;
        int i6 = 1;
        hfcVar.e = 1;
        int iEnd = 0;
        hfcVar.f = 0;
        hfcVar.g = -3.4028235E38f;
        hfcVar.h = Integer.MIN_VALUE;
        hfcVar.i = 1.0f;
        hfcVar.j = Integer.MIN_VALUE;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            hfcVar.a = yuj.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            hfcVar.b = yuj.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            Matcher matcher2 = b.matcher(strGroup3);
            while (matcher2.find()) {
                String strGroup4 = matcher2.group(i6);
                strGroup4.getClass();
                String strGroup5 = matcher2.group(i5);
                strGroup5.getClass();
                try {
                    if ("line".equals(strGroup4)) {
                        f(strGroup5, hfcVar);
                        i = i6;
                    } else {
                        int i7 = 5;
                        i = i6;
                        int i8 = -1;
                        if ("align".equals(strGroup4)) {
                            switch (strGroup5.hashCode()) {
                                case -1364013995:
                                    if (strGroup5.equals("center")) {
                                        i8 = 0;
                                    }
                                    break;
                                case -1074341483:
                                    if (strGroup5.equals("middle")) {
                                        i8 = i;
                                    }
                                    break;
                                case 100571:
                                    if (strGroup5.equals("end")) {
                                        i8 = 2;
                                    }
                                    break;
                                case 3317767:
                                    if (strGroup5.equals("left")) {
                                        i8 = 3;
                                    }
                                    break;
                                case 108511772:
                                    if (strGroup5.equals("right")) {
                                        i8 = 4;
                                    }
                                    break;
                                case 109757538:
                                    if (strGroup5.equals("start")) {
                                        i8 = 5;
                                    }
                                    break;
                            }
                            switch (i8) {
                                case 0:
                                case 1:
                                    i4 = 2;
                                    hfcVar.c = i4;
                                    break;
                                case 2:
                                    i4 = 3;
                                    hfcVar.c = i4;
                                    break;
                                case 3:
                                    i4 = 4;
                                    hfcVar.c = i4;
                                    break;
                                case 4:
                                    i4 = 5;
                                    hfcVar.c = i4;
                                    break;
                                case 5:
                                    i4 = i;
                                    hfcVar.c = i4;
                                    break;
                                default:
                                    try {
                                        lvb.G0("WebvttCueParser", "Invalid alignment value: ".concat(strGroup5));
                                        i4 = 2;
                                        hfcVar.c = i4;
                                    } catch (NumberFormatException unused) {
                                        lvb.G0("WebvttCueParser", "Skipping bad cue setting: " + matcher2.group());
                                    }
                                    break;
                            }
                        } else if ("position".equals(strGroup4)) {
                            int iIndexOf = strGroup5.indexOf(44);
                            if (iIndexOf != -1) {
                                String strSubstring = strGroup5.substring(iIndexOf + 1);
                                switch (strSubstring.hashCode()) {
                                    case -1842484672:
                                        i7 = !strSubstring.equals("line-left") ? -1 : 0;
                                        break;
                                    case -1364013995:
                                        i7 = !strSubstring.equals("center") ? -1 : i;
                                        break;
                                    case -1276788989:
                                        i7 = !strSubstring.equals("line-right") ? -1 : 2;
                                        break;
                                    case -1074341483:
                                        i7 = !strSubstring.equals("middle") ? -1 : 3;
                                        break;
                                    case 100571:
                                        i7 = !strSubstring.equals("end") ? -1 : 4;
                                        break;
                                    case 109757538:
                                        if (!strSubstring.equals("start")) {
                                            i7 = -1;
                                        }
                                        break;
                                    default:
                                        i7 = -1;
                                        break;
                                }
                                switch (i7) {
                                    case 0:
                                    case 5:
                                        i3 = 0;
                                        break;
                                    case 1:
                                    case 3:
                                        i3 = i;
                                        break;
                                    case 2:
                                    case 4:
                                        i3 = 2;
                                        break;
                                    default:
                                        lvb.G0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                        i3 = Integer.MIN_VALUE;
                                        break;
                                }
                                hfcVar.h = i3;
                                strGroup5 = strGroup5.substring(0, iIndexOf);
                            }
                            hfcVar.g = yuj.b(strGroup5);
                        } else if ("size".equals(strGroup4)) {
                            hfcVar.i = yuj.b(strGroup5);
                        } else if ("vertical".equals(strGroup4)) {
                            if (strGroup5.equals("lr")) {
                                i2 = 2;
                            } else if (strGroup5.equals("rl")) {
                                i2 = i;
                            } else {
                                lvb.G0("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup5));
                                i2 = Integer.MIN_VALUE;
                            }
                            hfcVar.j = i2;
                        } else {
                            lvb.G0("WebvttCueParser", "Unknown cue setting " + strGroup4 + ":" + strGroup5);
                        }
                    }
                } catch (NumberFormatException unused2) {
                    i = i6;
                }
                i6 = i;
                i5 = 2;
            }
            StringBuilder sb = new StringBuilder();
            nmcVar.getClass();
            String strN = nmcVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strN.trim());
                strN = nmcVar.n(StandardCharsets.UTF_8);
            }
            ArrayList arrayList2 = new ArrayList();
            long j = hfcVar.a;
            long j2 = hfcVar.b;
            String string = sb.toString();
            Matcher matcher3 = c.matcher(string);
            StringBuilder sb2 = new StringBuilder();
            while (matcher3.find()) {
                long jC = yuj.c(string.substring(matcher3.start() + 1, matcher3.end() - 1));
                sb2.append(string.substring(iEnd, matcher3.start()));
                iEnd = matcher3.end();
                hfcVar.a = j;
                hfcVar.b = jC;
                hfcVar.k = e(str, sb2.toString(), arrayList);
                arrayList2.add(hfcVar.a());
                j = jC;
            }
            sb2.append(string.substring(iEnd));
            hfcVar.a = j;
            hfcVar.b = j2;
            hfcVar.k = e(str, sb2.toString(), arrayList);
            arrayList2.add(hfcVar.a());
            return arrayList2;
        } catch (NumberFormatException unused3) {
            lvb.G0("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static SpannedString e(String str, String str2, ArrayList arrayList) {
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (ffc) arrayDeque.pop(), arrayList2, spannableStringBuilder, arrayList);
                }
                a(str, new ffc("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, arrayList);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            lvb.G0("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        lvb.R(!strTrim2.isEmpty());
                        String str3 = vqi.a;
                        String str4 = strTrim2.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        lvb.R(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c2 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c2 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c2];
                                        HashSet hashSet = new HashSet();
                                        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                                            hashSet.add(strArrSplit[i4]);
                                        }
                                        arrayDeque.push(new ffc(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        ffc ffcVar = (ffc) arrayDeque.pop();
                                        a(str, ffcVar, arrayList2, spannableStringBuilder, arrayList);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList2.clear();
                                        } else {
                                            arrayList2.add(new efc(ffcVar, spannableStringBuilder.length()));
                                        }
                                        if (ffcVar.a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static void f(String str, hfc hfcVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    lvb.G0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            hfcVar.f = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            hfcVar.d = yuj.b(str);
            hfcVar.e = 0;
        } else {
            hfcVar.d = Integer.parseInt(str);
            hfcVar.e = 1;
        }
    }
}
