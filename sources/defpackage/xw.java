package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class xw {
    public static final iuc t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public final vtc i;
    public final String j;
    public final juc k;
    public juc l;
    public final StringBuilder a = new StringBuilder();
    public String b = "";
    public final StringBuilder c = new StringBuilder();
    public final StringBuilder d = new StringBuilder();
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int m = 0;
    public final StringBuilder n = new StringBuilder();
    public boolean o = false;
    public String p = "";
    public final StringBuilder q = new StringBuilder();
    public final ArrayList r = new ArrayList();
    public final v56 s = new v56(64);

    static {
        iuc iucVar = new iuc();
        iucVar.I = "<ignored>";
        iucVar.K = "NA";
        t = iucVar;
        u = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        v = Pattern.compile("[- ]");
        w = Pattern.compile("\u2008");
    }

    public xw(vtc vtcVar, String str) {
        this.i = vtcVar;
        this.j = str;
        juc jucVarG = vtcVar.g(vtcVar.k(vtcVar.e(str)));
        jucVarG = jucVarG == null ? t : jucVarG;
        this.l = jucVarG;
        this.k = jucVarG;
    }

    public final String a(String str) {
        StringBuilder sb = this.n;
        int length = sb.length();
        if (!this.o || length <= 0 || sb.charAt(length - 1) == ' ') {
            return ((Object) sb) + str;
        }
        return new String(sb) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb = this.q;
        if (sb.length() < 3) {
            return a(sb.toString());
        }
        String string = sb.toString();
        for (huc hucVar : (this.g && this.p.length() == 0 && this.l.w1.size() > 0) ? this.l.w1 : this.l.v1) {
            if (this.p.length() > 0) {
                String str = hucVar.e;
                if ((str.length() == 0 || vtc.v.matcher(str).matches()) && !hucVar.f && !hucVar.g) {
                }
            }
            if (this.p.length() == 0 && !this.g) {
                String str2 = hucVar.e;
                if (str2.length() == 0 || vtc.v.matcher(str2).matches() || hucVar.f) {
                }
            }
            if (u.matcher(hucVar.b).matches()) {
                this.r.add(hucVar);
            }
        }
        k(string);
        String strE = e();
        if (strE.length() > 0) {
            return strE;
        }
        return j() ? g() : this.c.toString();
    }

    public final boolean c() {
        StringBuilder sb;
        vtc vtcVar;
        int iC;
        StringBuilder sb2 = this.q;
        if (sb2.length() == 0 || (iC = (vtcVar = this.i).c(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        sb2.setLength(0);
        sb2.append((CharSequence) sb);
        String strK = vtcVar.k(iC);
        if ("001".equals(strK)) {
            this.l = vtcVar.f(iC);
        } else if (!strK.equals(this.j)) {
            juc jucVarG = vtcVar.g(vtcVar.k(vtcVar.e(strK)));
            if (jucVarG == null) {
                jucVarG = t;
            }
            this.l = jucVarG;
        }
        String string = Integer.toString(iC);
        StringBuilder sb3 = this.n;
        sb3.append(string);
        sb3.append(' ');
        this.p = "";
        return true;
    }

    public final boolean d() {
        Pattern patternD = this.s.D("\\+|" + this.l.K);
        StringBuilder sb = this.d;
        Matcher matcher = patternD.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.g = true;
        int iEnd = matcher.end();
        StringBuilder sb2 = this.q;
        sb2.setLength(0);
        sb2.append(sb.substring(iEnd));
        StringBuilder sb3 = this.n;
        sb3.setLength(0);
        sb3.append(sb.substring(0, iEnd));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    public final String e() {
        for (huc hucVar : this.r) {
            Matcher matcher = this.s.D(hucVar.a).matcher(this.q);
            if (matcher.matches()) {
                this.o = v.matcher(hucVar.e).find();
                String strA = a(matcher.replaceAll(hucVar.b));
                if (vtc.s(strA, vtc.i).contentEquals(this.d)) {
                    return strA;
                }
            }
        }
        return "";
    }

    public final void f() {
        this.c.setLength(0);
        this.d.setLength(0);
        this.a.setLength(0);
        this.m = 0;
        this.b = "";
        this.n.setLength(0);
        this.p = "";
        this.q.setLength(0);
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.r.clear();
        this.o = false;
        if (this.l.equals(this.k)) {
            return;
        }
        vtc vtcVar = this.i;
        juc jucVarG = vtcVar.g(vtcVar.k(vtcVar.e(this.j)));
        if (jucVarG == null) {
            jucVarG = t;
        }
        this.l = jucVarG;
    }

    public final String g() {
        StringBuilder sb = this.q;
        int length = sb.length();
        if (length <= 0) {
            return this.n.toString();
        }
        String strI = "";
        for (int i = 0; i < length; i++) {
            strI = i(sb.charAt(i));
        }
        return this.e ? a(strI) : this.c.toString();
    }

    public final String h(char c) {
        StringBuilder sb = this.c;
        sb.append(c);
        boolean zIsDigit = Character.isDigit(c);
        StringBuilder sb2 = this.d;
        StringBuilder sb3 = this.q;
        if (!zIsDigit && (sb.length() != 1 || !vtc.l.matcher(Character.toString(c)).matches())) {
            this.e = false;
            this.f = true;
        } else if (c == '+') {
            sb2.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            sb2.append(c);
            sb3.append(c);
        }
        boolean z = this.e;
        ArrayList arrayList = this.r;
        StringBuilder sb4 = this.n;
        if (!z) {
            if (this.f) {
                return sb.toString();
            }
            boolean zD = d();
            StringBuilder sb5 = this.a;
            if (!zD) {
                if (this.p.length() > 0) {
                    sb3.insert(0, this.p);
                    sb4.setLength(sb4.lastIndexOf(this.p));
                }
                if (!this.p.equals(l())) {
                    sb4.append(' ');
                    this.e = true;
                    this.h = false;
                    arrayList.clear();
                    this.m = 0;
                    sb5.setLength(0);
                    this.b = "";
                    return b();
                }
            } else if (c()) {
                this.e = true;
                this.h = false;
                arrayList.clear();
                this.m = 0;
                sb5.setLength(0);
                this.b = "";
                return b();
            }
            return sb.toString();
        }
        int length = sb2.length();
        if (length == 0 || length == 1 || length == 2) {
            return sb.toString();
        }
        if (length == 3) {
            if (!d()) {
                this.p = l();
                return b();
            }
            this.h = true;
        }
        if (this.h) {
            if (c()) {
                this.h = false;
            }
            return ((Object) sb4) + sb3.toString();
        }
        if (arrayList.size() <= 0) {
            return b();
        }
        String strI = i(c);
        String strE = e();
        if (strE.length() > 0) {
            return strE;
        }
        k(sb3.toString());
        if (j()) {
            return g();
        }
        return this.e ? a(strI) : sb.toString();
    }

    public final String i(char c) {
        Pattern pattern = w;
        StringBuilder sb = this.a;
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.find(this.m)) {
            if (this.r.size() == 1) {
                this.e = false;
            }
            this.b = "";
            return this.c.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c));
        sb.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.m = iStart;
        return sb.substring(0, iStart + 1);
    }

    public final boolean j() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            huc hucVar = (huc) it.next();
            String str = hucVar.a;
            if (this.b.equals(str)) {
                return false;
            }
            String str2 = hucVar.a;
            StringBuilder sb = this.a;
            sb.setLength(0);
            String str3 = hucVar.b;
            Matcher matcher = this.s.D(str2).matcher("999999999999999");
            matcher.find();
            String strGroup = matcher.group();
            String strReplaceAll = strGroup.length() < this.q.length() ? "" : strGroup.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb.append(strReplaceAll);
                this.b = str;
                this.o = v.matcher(hucVar.e).find();
                this.m = 0;
                return true;
            }
            it.remove();
        }
        this.e = false;
        return false;
    }

    public final void k(String str) {
        int length = str.length() - 3;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            huc hucVar = (huc) it.next();
            ArrayList arrayList = hucVar.c;
            ArrayList arrayList2 = hucVar.c;
            if (arrayList.size() != 0) {
                if (!this.s.D((String) arrayList2.get(Math.min(length, arrayList2.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    public final String l() {
        int i = this.l.J;
        StringBuilder sb = this.n;
        StringBuilder sb2 = this.q;
        int iEnd = 1;
        if (i != 1 || sb2.charAt(0) != '1' || sb2.charAt(1) == '0' || sb2.charAt(1) == '1') {
            juc jucVar = this.l;
            if (jucVar.q1) {
                Matcher matcher = this.s.D(jucVar.r1).matcher(sb2);
                if (!matcher.lookingAt() || matcher.end() <= 0) {
                    iEnd = 0;
                } else {
                    this.g = true;
                    iEnd = matcher.end();
                    sb.append(sb2.substring(0, iEnd));
                }
            } else {
                iEnd = 0;
            }
        } else {
            sb.append('1');
            sb.append(' ');
            this.g = true;
        }
        String strSubstring = sb2.substring(0, iEnd);
        sb2.delete(0, iEnd);
        return strSubstring;
    }
}
