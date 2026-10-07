package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class xoh {
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static final Pattern i;
    public static final String[] j;
    public static final String[] k;

    static {
        Pattern patternCompile = Pattern.compile("@([A-Za-z0-9_-]+)");
        a = patternCompile;
        Pattern.compile("@([A-Za-z0-9_-]+)\\s");
        b = Pattern.compile("@([A-Za-z0-9_-]+)\\s/");
        Pattern patternCompile2 = Pattern.compile("[\\p{Punct}\\p{L}\\p{N}\\p{Sm}]+");
        c = Pattern.compile("(" + patternCompile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[\ufeff]?[\\p{L}\\p{N}_]+");
        d = Pattern.compile("(" + patternCompile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[\ufeff]?[\\p{L}\\p{N}_]+\\s(" + patternCompile2 + ")?");
        StringBuilder sb = new StringBuilder("(");
        sb.append(patternCompile);
        sb.append("\\s)(?<=\\s|\\p{Zs}|^)\\/[\ufeff]?[\\p{L}\\p{N}_]+");
        e = Pattern.compile(sb.toString());
        f = Pattern.compile("(" + patternCompile + "\\s)(?<=\\s|\\p{Zs}|^)\\/[\ufeff]?[\\p{L}\\p{N}_]+\\s(" + patternCompile2 + ")?");
        g = Pattern.compile("[\n\r]");
        h = Pattern.compile("\\s{2,}");
        i = Pattern.compile("\\r|[\\r\\u2028\\u2029\\u0085]");
        j = new String[]{"\r\n", "\r", "\n", "\u2028", "\u2029", "\u0085"};
        k = new String[]{" ", "\\t", "\\n", "\\r", "\\t", " ", "\u2000", "\u2001", "\u2002", "\u2003", "\u2004", "\u2005", "\u2006", " ", "\u2008", "\u2009", "\u200a", "\u200b", "\u200c", "\u200d", " ", "\u205f", "\u3000"};
    }

    public static String a(String str) {
        String rawPath = ch3.r(str) ? null : URI.create(str).getRawPath();
        if (rawPath == null) {
            return "";
        }
        return rawPath.length() < 2 ? str : rawPath.substring(1);
    }

    public static String b(String str) {
        if (ch3.r(str)) {
            return "";
        }
        return "@" + a(str);
    }

    public static String[] c(String str, p4c p4cVar) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (length < str.length()) {
            if (!daf.h(str.charAt(length))) {
                int i2 = length;
                while (i2 < str.length() && p4cVar.j(i2, str)) {
                    i2++;
                }
                String strSubstring = i2 > length ? str.substring(length, i2) : null;
                if (ch3.r(strSubstring)) {
                    int i3 = length;
                    while (i3 < str.length()) {
                        p4cVar.getClass();
                        if (daf.h(str.charAt(i3)) || p4cVar.j(i3, str)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 > length) {
                        arrayList.add(str.substring(length, i3));
                    }
                    length = i3;
                } else {
                    arrayList.add(strSubstring);
                    length += strSubstring.length() - 1;
                }
            }
            length++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String d(String str) {
        if (ch3.r(str)) {
            return str;
        }
        return h.matcher(g.matcher(str).replaceAll(" ")).replaceAll(" ");
    }
}
