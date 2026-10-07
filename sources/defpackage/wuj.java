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
public abstract class wuj {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

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
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        ewi.m(255, 255, 255, map2, "bg_white");
        ewi.m(0, 255, 0, map2, "bg_lime");
        ewi.m(0, 255, 255, map2, "bg_cyan");
        ewi.m(255, 0, 0, map2, "bg_red");
        ewi.m(255, 255, 0, map2, "bg_yellow");
        ewi.m(255, 0, 255, map2, "bg_magenta");
        ewi.m(0, 0, 255, map2, "bg_blue");
        ewi.m(0, 0, 0, map2, "bg_black");
        d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, uuj uujVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = uujVar.b;
        int length = spannableStringBuilder.length();
        String str2 = uujVar.a;
        str2.getClass();
        int i2 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : uujVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = d;
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
            case "v":
                spannableStringBuilder.setSpan(new waj(uujVar.c), i, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, uujVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, tuj.c);
                int i3 = uujVar.b;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((tuj) arrayList.get(i4)).a.a)) {
                        tuj tujVar = (tuj) arrayList.get(i4);
                        int iC2 = c(list2, str, tujVar.a);
                        if (iC2 == i2) {
                            iC2 = iC != i2 ? iC : 1;
                        }
                        int i5 = tujVar.a.b - length2;
                        int i6 = tujVar.b - length2;
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
        ArrayList arrayListB = b(list2, str, uujVar);
        for (int i7 = 0; i7 < arrayListB.size(); i7++) {
            ruj rujVar = ((vuj) arrayListB.get(i7)).b;
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

    public static ArrayList b(List list, String str, uuj uujVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ruj rujVar = (ruj) list.get(i);
            int iA = rujVar.a(str, uujVar.a, uujVar.d, uujVar.c);
            if (iA > 0) {
                arrayList.add(new vuj(iA, rujVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, uuj uujVar) {
        ArrayList arrayListB = b(list, str, uujVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((vuj) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static suj d(String str, Matcher matcher, nmc nmcVar, ArrayList arrayList) {
        hfc hfcVar = new hfc();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            hfcVar.a = yuj.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            hfcVar.b = yuj.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, hfcVar);
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
            hfcVar.k = f(str, sb.toString(), arrayList);
            return new suj(hfcVar.b().a(), hfcVar.a, hfcVar.b);
        } catch (IllegalArgumentException unused) {
            lvb.G0("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, hfc hfcVar) {
        int i;
        int i2;
        int i3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, hfcVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                lvb.G0("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        hfcVar.c = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i2 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i2 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i2 = 2;
                                    break;
                                default:
                                    lvb.G0("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            hfcVar.h = i2;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        hfcVar.g = yuj.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        hfcVar.i = yuj.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i3 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i3 = 1;
                        } else {
                            lvb.G0("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i3 = Integer.MIN_VALUE;
                        }
                        hfcVar.j = i3;
                    } else {
                        lvb.G0("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                lvb.G0("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List list) {
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (uuj) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new uuj("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
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
                                        arrayDeque.push(new uuj(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        uuj uujVar = (uuj) arrayDeque.pop();
                                        a(str, uujVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new tuj(uujVar, spannableStringBuilder.length()));
                                        }
                                        if (uujVar.a.equals(str4)) {
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

    public static void g(String str, hfc hfcVar) {
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
