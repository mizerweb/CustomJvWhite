package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class b45 {
    public static final Pattern d = Pattern.compile("\\|[^\\|]*\\|");
    public static final Pattern e = Pattern.compile("f{1,9}");
    public static final ArrayList f;
    public final String a;
    public ArrayList b;
    public ArrayList c;

    static {
        ArrayList arrayList = new ArrayList();
        f = arrayList;
        arrayList.add("YYYY");
        arrayList.add("YY");
        arrayList.add("MMMM");
        arrayList.add("MMM");
        arrayList.add("MM");
        arrayList.add("M");
        arrayList.add("DD");
        arrayList.add("D");
        arrayList.add("WWWW");
        arrayList.add("WWW");
        arrayList.add("hh12");
        arrayList.add("h12");
        arrayList.add("hh");
        arrayList.add("h");
        arrayList.add("mm");
        arrayList.add("m");
        arrayList.add("ss");
        arrayList.add("s");
        arrayList.add("a");
        arrayList.add("fffffffff");
        arrayList.add("ffffffff");
        arrayList.add("fffffff");
        arrayList.add("ffffff");
        arrayList.add("fffff");
        arrayList.add("ffff");
        arrayList.add("fff");
        arrayList.add("ff");
        arrayList.add("f");
    }

    public b45(String str) {
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        this.a = str;
        if (l2m.c(str)) {
            return;
        }
        ore.p("DateTime format has no content.");
        throw null;
    }

    public static String a(String str) {
        return (l2m.c(str) && str.length() == 1) ? "0".concat(str) : str;
    }

    public static String c(Object obj) {
        return obj != null ? String.valueOf(obj) : "";
    }

    public final String b(y35 y35Var) {
        int i;
        int i2;
        String strSubstring;
        this.c = new ArrayList();
        this.b = new ArrayList();
        Pattern pattern = d;
        String str = this.a;
        Matcher matcher = pattern.matcher(str);
        while (true) {
            i = 1;
            if (!matcher.find()) {
                break;
            }
            z35 z35Var = new z35();
            z35Var.a = matcher.start();
            z35Var.b = matcher.end() - 1;
            this.c.add(z35Var);
        }
        Iterator it = f.iterator();
        String strReplace = str;
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder();
                while (i3 < str.length()) {
                    String strSubstring2 = str.substring(i3, i3 + 1);
                    a45 a45Var = null;
                    for (a45 a45Var2 : this.b) {
                        if (a45Var2.a == i3) {
                            a45Var = a45Var2;
                        }
                    }
                    if (a45Var != null) {
                        sb.append(a45Var.c);
                        i3 = a45Var.b;
                    } else if (!"|".equals(strSubstring2)) {
                        sb.append(strSubstring2);
                    }
                    i3++;
                }
                return sb.toString();
            }
            String str2 = (String) it.next();
            Matcher matcher2 = Pattern.compile(str2).matcher(strReplace);
            while (matcher2.find()) {
                a45 a45Var3 = new a45();
                a45Var3.a = matcher2.start();
                a45Var3.b = matcher2.end() - i;
                Iterator it2 = this.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = i;
                        String strGroup = matcher2.group();
                        if ("YYYY".equals(strGroup)) {
                            strSubstring = c(y35Var.a);
                        } else if ("YY".equals(strGroup)) {
                            String strC = c(y35Var.a);
                            strSubstring = l2m.c(strC) ? strC.substring(2) : "";
                        } else {
                            if ("MMMM".equals(strGroup)) {
                                y35Var.b.getClass();
                                ore.p("Your date pattern requires either a Locale, or your own custom localizations for text:".concat(l2m.b(str)));
                                return null;
                            }
                            if ("MMM".equals(strGroup)) {
                                y35Var.b.getClass();
                                ore.p("Your date pattern requires either a Locale, or your own custom localizations for text:".concat(l2m.b(str)));
                                return null;
                            }
                            if ("MM".equals(strGroup)) {
                                strSubstring = a(c(y35Var.b));
                            } else if ("M".equals(strGroup)) {
                                strSubstring = c(y35Var.b);
                            } else if ("DD".equals(strGroup)) {
                                strSubstring = a(c(y35Var.c));
                            } else if ("D".equals(strGroup)) {
                                strSubstring = c(y35Var.c);
                            } else {
                                if ("WWWW".equals(strGroup)) {
                                    y35Var.m();
                                    y35Var.i();
                                    ore.p("Your date pattern requires either a Locale, or your own custom localizations for text:".concat(l2m.b(str)));
                                    return null;
                                }
                                if ("WWW".equals(strGroup)) {
                                    y35Var.m();
                                    y35Var.i();
                                    ore.p("Your date pattern requires either a Locale, or your own custom localizations for text:".concat(l2m.b(str)));
                                    return null;
                                }
                                if ("hh".equals(strGroup)) {
                                    strSubstring = a(c(y35Var.d));
                                } else if ("h".equals(strGroup)) {
                                    strSubstring = c(y35Var.d);
                                } else if ("h12".equals(strGroup)) {
                                    Integer numValueOf = y35Var.d;
                                    if (numValueOf != null) {
                                        if (numValueOf.intValue() == 0) {
                                            numValueOf = 12;
                                        } else if (numValueOf.intValue() > 12) {
                                            numValueOf = Integer.valueOf(numValueOf.intValue() - 12);
                                        }
                                    }
                                    strSubstring = c(numValueOf);
                                } else if ("hh12".equals(strGroup)) {
                                    Integer numValueOf2 = y35Var.d;
                                    if (numValueOf2 != null) {
                                        if (numValueOf2.intValue() == 0) {
                                            numValueOf2 = 12;
                                        } else if (numValueOf2.intValue() > 12) {
                                            numValueOf2 = Integer.valueOf(numValueOf2.intValue() - 12);
                                        }
                                    }
                                    strSubstring = a(c(numValueOf2));
                                } else {
                                    if ("a".equals(strGroup)) {
                                        y35Var.d.getClass();
                                        ore.p("Your date pattern requires either a Locale, or your own custom localizations for text:".concat(l2m.b(str)));
                                        return null;
                                    }
                                    if ("mm".equals(strGroup)) {
                                        strSubstring = a(c(y35Var.e));
                                    } else if ("m".equals(strGroup)) {
                                        strSubstring = c(y35Var.e);
                                    } else if ("ss".equals(strGroup)) {
                                        strSubstring = a(c(y35Var.f));
                                    } else if ("s".equals(strGroup)) {
                                        strSubstring = c(y35Var.f);
                                    } else {
                                        if (!strGroup.startsWith("f")) {
                                            ore.p("Unknown token in date formatting pattern: ".concat(strGroup));
                                            return null;
                                        }
                                        if (!e.matcher(strGroup).matches()) {
                                            ore.p("Unknown token in date formatting pattern: ".concat(strGroup));
                                            return null;
                                        }
                                        String strC2 = c(y35Var.g);
                                        while (strC2.length() < 9) {
                                            strC2 = "0".concat(strC2);
                                        }
                                        int length = strGroup.length();
                                        strSubstring = (!l2m.c(strC2) || strC2.length() < length) ? strC2 : strC2.substring(0, length);
                                    }
                                }
                            }
                        }
                        a45Var3.c = strSubstring;
                        this.b.add(a45Var3);
                        break;
                    }
                    z35 z35Var2 = (z35) it2.next();
                    int i4 = z35Var2.a;
                    i2 = i;
                    int i5 = a45Var3.a;
                    if (i4 <= i5 && i5 <= z35Var2.b) {
                        break;
                    }
                    i = i2;
                }
                i = i2;
            }
            int i6 = i;
            StringBuilder sb2 = new StringBuilder();
            for (int i7 = i6; i7 <= str2.length(); i7++) {
                sb2.append("@");
            }
            strReplace = strReplace.replace(str2, sb2.toString());
            i = i6;
        }
    }
}
