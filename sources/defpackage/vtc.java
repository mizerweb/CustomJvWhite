package defpackage;

import io.michaelrocks.libphonenumber.android.MissingMetadataException;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class vtc {
    public static final Logger h = Logger.getLogger(vtc.class.getName());
    public static final Map i;
    public static final Map j;
    public static final Map k;
    public static final Pattern l;
    public static final Pattern m;
    public static final Pattern n;
    public static final Pattern o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public final qg7 a;
    public final HashMap b;
    public final p3c c = new p3c(18);
    public final HashSet d = new HashSet(35);
    public final v56 e = new v56(100);
    public final HashSet f = new HashSet(320);
    public final HashSet g = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        j = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        k = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        i = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map7 = j;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        l = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        m = Pattern.compile("(\\p{Nd})");
        n = Pattern.compile("[+＋\\p{Nd}]");
        o = Pattern.compile("[\\\\/] *x");
        p = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        q = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strO = c0a.o("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strA = a(true);
        a(false);
        r = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strConcat = string.concat("\\p{Nd}");
        s = Pattern.compile("^(" + nbh.w("[", strConcat, "]+((\\-)*[", strConcat, "])*") + "\\.)*" + nbh.w("[", string, "]+((\\-)*[", strConcat, "])*") + "\\.?$");
        StringBuilder sb2 = new StringBuilder("(?:");
        sb2.append(strA);
        sb2.append(")$");
        t = Pattern.compile(sb2.toString(), 66);
        u = Pattern.compile(strO + "(?:" + strA + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        v = Pattern.compile("\\(?\\$1\\)?");
    }

    public vtc(qg7 qg7Var, HashMap map) {
        this.a = qg7Var;
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.g.add((Integer) entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll((Collection) map.get(1));
    }

    public static String a(boolean z) {
        String strConcat = ";ext=".concat(b(20));
        String str = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + b(20) + "#?";
        String str2 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + b(9) + "#?";
        String str3 = "[- ]+" + b(6) + "#";
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat);
        sb.append("|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        String strW = zo5.w(sb, "|", str3);
        if (!z) {
            return strW;
        }
        return strW + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + b(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + b(9) + "#?");
    }

    public static String b(int i2) {
        return c0a.k(i2, "(\\p{Nd}{1,", "})");
    }

    public static String h(luc lucVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (lucVar.g && (i2 = lucVar.i) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(lucVar.c);
        return sb.toString();
    }

    public static kuc i(juc jucVar, int i2) {
        switch (qt4.D(i2)) {
            case 0:
            case 2:
                return jucVar.d;
            case 1:
                return jucVar.f;
            case 3:
                return jucVar.h;
            case 4:
                return jucVar.j;
            case 5:
                return jucVar.l;
            case 6:
                return jucVar.p;
            case 7:
                return jucVar.n;
            case 8:
                return jucVar.r;
            case 9:
                return jucVar.t;
            case 10:
                return jucVar.x;
            default:
                return jucVar.b;
        }
    }

    public static void q(StringBuilder sb) {
        if (q.matcher(sb).matches()) {
            sb.replace(0, sb.length(), s(sb, k));
        } else {
            sb.replace(0, sb.length(), r(sb));
        }
    }

    public static String r(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int iDigit = Character.digit(charSequence.charAt(i2), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    public static String s(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static int u(StringBuilder sb, juc jucVar, int i2) {
        kuc kucVarI = i(jucVar, i2);
        ArrayList arrayList = kucVarI.c.isEmpty() ? jucVar.b.c : kucVarI.c;
        ArrayList arrayList2 = kucVarI.d;
        if (i2 == 3) {
            kuc kucVarI2 = i(jucVar, 1);
            if (kucVarI2.c.size() == 1 && ((Integer) kucVarI2.c.get(0)).intValue() == -1) {
                return u(sb, jucVar, 2);
            }
            kuc kucVarI3 = i(jucVar, 2);
            ArrayList arrayList3 = kucVarI3.c;
            ArrayList arrayList4 = kucVarI3.c;
            boolean z = (arrayList3.size() == 1 && ((Integer) arrayList4.get(0)).intValue() == -1) ? false : true;
            ArrayList arrayList5 = kucVarI3.d;
            if (z) {
                ArrayList arrayList6 = new ArrayList(arrayList);
                if (arrayList4.size() == 0) {
                    arrayList4 = jucVar.b.c;
                }
                arrayList6.addAll(arrayList4);
                Collections.sort(arrayList6);
                if (arrayList2.isEmpty()) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList7 = new ArrayList(arrayList2);
                    arrayList7.addAll(arrayList5);
                    Collections.sort(arrayList7);
                    arrayList2 = arrayList7;
                }
                arrayList = arrayList6;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = sb.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return 2;
        }
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if (iIntValue != length) {
            if (iIntValue > length) {
                return 4;
            }
            if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
                return 6;
            }
            if (!arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length))) {
                return 5;
            }
        }
        return 1;
    }

    public final int c(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                int i3 = Integer.parseInt(sb.substring(0, i2));
                if (this.b.containsKey(Integer.valueOf(i3))) {
                    sb2.append(sb.substring(i2));
                    return i3;
                }
            }
        }
        return 0;
    }

    public final String d(luc lucVar) {
        v56 v56Var;
        huc hucVar;
        if (lucVar.c == 0) {
            String str = lucVar.j;
            if (str.length() > 0 || !lucVar.a) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i2 = lucVar.b;
        String strH = h(lucVar);
        if (this.b.containsKey(Integer.valueOf(i2))) {
            String strK = k(i2);
            juc jucVarF = "001".equals(strK) ? f(i2) : g(strK);
            Iterator it = (jucVarF.w1.size() != 0 ? jucVarF.w1 : jucVarF.v1).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                v56Var = this.e;
                if (!zHasNext) {
                    hucVar = null;
                    break;
                }
                hucVar = (huc) it.next();
                int size = hucVar.c.size();
                if (size != 0) {
                    if (!v56Var.D((String) hucVar.c.get(size - 1)).matcher(strH).lookingAt()) {
                        continue;
                    }
                }
                if (v56Var.D(hucVar.a).matcher(strH).matches()) {
                    break;
                }
            }
            if (hucVar != null) {
                strH = v56Var.D(hucVar.a).matcher(strH).replaceAll(hucVar.b);
            }
            sb.append(strH);
            if (lucVar.d && lucVar.e.length() > 0) {
                if (jucVarF.o1) {
                    sb.append(jucVarF.p1);
                    sb.append(lucVar.e);
                } else {
                    sb.append(" ext. ");
                    sb.append(lucVar.e);
                }
            }
            int iD = qt4.D(2);
            if (iD == 0) {
                sb.insert(0, i2).insert(0, '+');
            } else if (iD == 1) {
                sb.insert(0, " ").insert(0, i2).insert(0, '+');
            } else if (iD == 3) {
                sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
            }
        } else {
            sb.append(strH);
        }
        return sb.toString();
    }

    public final int e(String str) {
        if (n(str)) {
            juc jucVarG = g(str);
            if (jucVarG != null) {
                return jucVarG.J;
            }
            ore.p(qv1.k("Invalid region code: ", str));
            return 0;
        }
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(") provided.");
        h.log(level, sb.toString());
        return 0;
    }

    public final juc f(int i2) {
        if (!this.g.contains(Integer.valueOf(i2))) {
            return null;
        }
        qg7 qg7Var = this.a;
        qg7Var.getClass();
        List list = (List) p90.r().get(Integer.valueOf(i2));
        if (list != null && !list.contains("001")) {
            throw new IllegalArgumentException(i2 + " calling code belongs to a geo entity");
        }
        juc jucVar = (juc) ((ConcurrentHashMap) ((qg7) ((v2a) ((gvb) qg7Var.c).E(((c5b) qg7Var.b).a(Integer.valueOf(i2)))).b).b).get(Integer.valueOf(i2));
        String strH = zo5.h(i2, "Missing metadata for country code ");
        if (jucVar != null) {
            return jucVar;
        }
        throw new MissingMetadataException(strH);
    }

    public final juc g(String str) {
        if (!n(str)) {
            return null;
        }
        qg7 qg7Var = this.a;
        qg7Var.getClass();
        if (str.equals("001")) {
            ore.p(str.concat(" region code is a non-geo entity"));
            return null;
        }
        juc jucVar = (juc) ((ConcurrentHashMap) ((qg7) ((v2a) ((gvb) qg7Var.c).E(((c5b) qg7Var.b).a(str))).c).b).get(str);
        String strConcat = "Missing metadata for region code ".concat(str);
        if (jucVar != null) {
            return jucVar;
        }
        throw new MissingMetadataException(strConcat);
    }

    public final int j(String str, juc jucVar) {
        if (!l(str, jucVar.b)) {
            return 12;
        }
        if (l(str, jucVar.j)) {
            return 5;
        }
        if (l(str, jucVar.h)) {
            return 4;
        }
        if (l(str, jucVar.l)) {
            return 6;
        }
        if (l(str, jucVar.p)) {
            return 7;
        }
        if (l(str, jucVar.n)) {
            return 8;
        }
        if (l(str, jucVar.r)) {
            return 9;
        }
        if (l(str, jucVar.t)) {
            return 10;
        }
        if (l(str, jucVar.x)) {
            return 11;
        }
        boolean zL = l(str, jucVar.d);
        boolean z = jucVar.u1;
        if (zL) {
            return (z || l(str, jucVar.f)) ? 3 : 1;
        }
        return (z || !l(str, jucVar.f)) ? 12 : 2;
    }

    public final String k(int i2) {
        List list = (List) this.b.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final boolean l(String str, kuc kucVar) {
        int length = str.length();
        ArrayList arrayList = kucVar.c;
        if (arrayList.size() <= 0 || arrayList.contains(Integer.valueOf(length))) {
            return this.c.l(str, kucVar);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae A[RETURN] */
    public final boolean m(luc lucVar) {
        int i2 = lucVar.b;
        List<String> list = (List) this.b.get(Integer.valueOf(i2));
        String str = null;
        if (list != null) {
            if (list.size() != 1) {
                String strH = h(lucVar);
                for (String str2 : list) {
                    juc jucVarG = g(str2);
                    if (!jucVarG.y1) {
                        if (j(strH, jucVarG) != 12) {
                            str = str2;
                            break;
                        }
                    } else {
                        if (this.e.D(jucVarG.z1).matcher(strH).lookingAt()) {
                            str = str2;
                            break;
                        }
                    }
                }
            } else {
                str = (String) list.get(0);
            }
        } else {
            h.log(Level.INFO, "Missing/invalid country_code (" + i2 + ")");
        }
        int i3 = lucVar.b;
        juc jucVarF = "001".equals(str) ? f(i3) : g(str);
        if (jucVarF != null) {
            if (!"001".equals(str)) {
                juc jucVarG2 = g(str);
                if (jucVarG2 == null) {
                    ore.p(qv1.k("Invalid region code: ", str));
                    return false;
                }
                if (i3 == jucVarG2.J) {
                    if (j(h(lucVar), jucVarF) != 12) {
                        return true;
                    }
                }
            } else if (j(h(lucVar), jucVarF) != 12) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(String str) {
        return str != null && this.f.contains(str);
    }

    public final int o(CharSequence charSequence, juc jucVar, StringBuilder sb, luc lucVar) throws NumberParseException {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = jucVar != null ? jucVar.K : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = l.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                q(sb2);
            } else {
                Pattern patternD = this.e.D(str);
                q(sb2);
                Matcher matcher2 = patternD.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    Matcher matcher3 = m.matcher(sb2.substring(iEnd));
                    if (!matcher3.find() || !r(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, iEnd);
                    }
                }
            }
            if (sb2.length() <= 2) {
                throw new NumberParseException(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int iC = c(sb2, sb);
            if (iC == 0) {
                throw new NumberParseException(1, "Country calling code supplied was not recognised.");
            }
            lucVar.a = true;
            lucVar.b = iC;
            return iC;
        }
        if (jucVar != null) {
            int i2 = jucVar.J;
            String strValueOf = String.valueOf(i2);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                kuc kucVar = jucVar.b;
                p(sb3, jucVar, null);
                p3c p3cVar = this.c;
                if ((!p3cVar.l(sb2, kucVar) && p3cVar.l(sb3, kucVar)) || u(sb2, jucVar, 12) == 6) {
                    sb.append((CharSequence) sb3);
                    lucVar.a = true;
                    lucVar.b = i2;
                    return i2;
                }
            }
        }
        lucVar.a = true;
        lucVar.b = 0;
        return 0;
    }

    public final void p(StringBuilder sb, juc jucVar, StringBuilder sb2) {
        int length = sb.length();
        String str = jucVar.r1;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.e.D(str).matcher(sb);
        if (matcher.lookingAt()) {
            kuc kucVar = jucVar.b;
            p3c p3cVar = this.c;
            boolean zL = p3cVar.l(sb, kucVar);
            int iGroupCount = matcher.groupCount();
            String str2 = jucVar.t1;
            if (str2 == null || str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!zL || p3cVar.l(sb.substring(matcher.end()), kucVar)) {
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(str2));
            if (!zL || p3cVar.l(sb3.toString(), kucVar)) {
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final luc t(String str, String str2) {
        String strSubstring;
        CharSequence charSequenceSubSequence;
        int iO;
        luc lucVar = new luc();
        lucVar.b = 0;
        lucVar.c = 0L;
        String strGroup = "";
        lucVar.e = "";
        lucVar.g = false;
        lucVar.i = 1;
        lucVar.j = "";
        lucVar.l = "";
        lucVar.k = 5;
        if (str == null) {
            throw new NumberParseException(2, "The phone number supplied was null.");
        }
        if (str.length() > 250) {
            throw new NumberParseException(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = str.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i2 = iIndexOf + 15;
            if (i2 >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i2);
                strSubstring = iIndexOf2 != -1 ? string.substring(i2, iIndexOf2) : string.substring(i2);
            }
        }
        if (strSubstring != null && (strSubstring.length() == 0 || !(r.matcher(strSubstring).matches() || s.matcher(strSubstring).matches()))) {
            throw new NumberParseException(2, "The phone-context value is invalid.");
        }
        if (strSubstring != null) {
            if (strSubstring.charAt(0) == '+') {
                sb.append(strSubstring);
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = n.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = p.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = o.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb.delete(iIndexOf4, sb.length());
        }
        int length = sb.length();
        Pattern pattern = u;
        if (!(length < 2 ? false : pattern.matcher(sb).matches())) {
            throw new NumberParseException(2, "The string supplied did not seem to be a phone number.");
        }
        boolean zN = n(str2);
        Pattern pattern2 = l;
        if (!zN && (sb.length() == 0 || !pattern2.matcher(sb).lookingAt())) {
            throw new NumberParseException(1, "Missing or invalid default region.");
        }
        Matcher matcher4 = t.matcher(sb);
        if (matcher4.find()) {
            String strSubstring2 = sb.substring(0, matcher4.start());
            if (strSubstring2.length() < 2 ? false : pattern.matcher(strSubstring2).matches()) {
                int iGroupCount = matcher4.groupCount();
                for (int i3 = 1; i3 <= iGroupCount; i3++) {
                    if (matcher4.group(i3) != null) {
                        strGroup = matcher4.group(i3);
                        sb.delete(matcher4.start(), sb.length());
                        break;
                    }
                }
            }
        }
        if (strGroup.length() > 0) {
            lucVar.d = true;
            lucVar.e = strGroup;
        }
        juc jucVarG = g(str2);
        StringBuilder sb2 = new StringBuilder();
        try {
            iO = o(sb, jucVarG, sb2, lucVar);
        } catch (NumberParseException e) {
            Matcher matcher5 = pattern2.matcher(sb);
            int i4 = e.a;
            if (i4 != 1 || !matcher5.lookingAt()) {
                throw new NumberParseException(i4, e.getMessage());
            }
            iO = o(sb.substring(matcher5.end()), jucVarG, sb2, lucVar);
            if (iO == 0) {
                throw new NumberParseException(1, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iO != 0) {
            String strK = k(iO);
            if (!strK.equals(str2)) {
                jucVarG = "001".equals(strK) ? f(iO) : g(strK);
            }
        } else {
            q(sb);
            sb2.append((CharSequence) sb);
            if (str2 != null) {
                int i5 = jucVarG.J;
                lucVar.a = true;
                lucVar.b = i5;
            }
        }
        if (sb2.length() < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (jucVarG != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            p(sb4, jucVarG, sb3);
            int iU = u(sb4, jucVarG, 12);
            if (iU != 4 && iU != 2 && iU != 5) {
                sb2 = sb4;
            }
        }
        int length2 = sb2.length();
        if (length2 < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(5, "The string supplied is too long to be a phone number.");
        }
        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
            lucVar.f = true;
            lucVar.g = true;
            int i6 = 1;
            while (i6 < sb2.length() - 1 && sb2.charAt(i6) == '0') {
                i6++;
            }
            if (i6 != 1) {
                lucVar.h = true;
                lucVar.i = i6;
            }
        }
        lucVar.c = Long.parseLong(sb2.toString());
        return lucVar;
    }
}
