package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes.dex */
public final class k28 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;
    public final boolean i;

    public k28(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(r5h.U0(str, ':', length, 4) + 1, r5h.U0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iU0 = r5h.U0(str, '/', length, 4);
        return str.substring(iU0, uqi.g(str, iU0, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iU0 = r5h.U0(str, '/', length, 4);
        int iG = uqi.g(str, iU0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iU0 < iG) {
            int i = iU0 + 1;
            int iF = uqi.f('/', i, iG, str);
            arrayList.add(str.substring(i, iF));
            iU0 = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int iU0 = r5h.U0(str, '?', 0, 6) + 1;
        return str.substring(iU0, uqi.f('#', iU0, str.length(), str));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, uqi.g(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k28) && ((k28) obj).h.equals(this.h);
    }

    public final String f() {
        return this.d;
    }

    public final t84 g() {
        int i;
        t84 t84Var = new t84();
        ArrayList arrayList = (ArrayList) t84Var.c;
        String str = this.a;
        t84Var.e = str;
        t84Var.f = e();
        t84Var.g = a();
        t84Var.h = this.d;
        if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
            i = 80;
        } else {
            i = str.equals("https") ? 443 : -1;
        }
        int i2 = this.e;
        t84Var.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        t84Var.d = strD != null ? ghb.s(ghb.e(0, 0, 211, strD, " \"'<>#")) : null;
        if (this.g != null) {
            String str2 = this.h;
            strSubstring = str2.substring(r5h.U0(str2, '#', 0, 6) + 1);
        }
        t84Var.i = strSubstring;
        return t84Var;
    }

    public final String h() {
        t84 t84Var;
        try {
            t84Var = new t84();
            t84Var.n(this, "/...");
        } catch (IllegalArgumentException unused) {
            t84Var = null;
        }
        t84Var.getClass();
        t84Var.f = ghb.e(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        t84Var.g = ghb.e(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        return t84Var.c().h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final URI i() {
        t84 t84VarG = g();
        ArrayList arrayList = (ArrayList) t84VarG.c;
        String str = (String) t84VarG.h;
        t84VarG.h = str != null ? Pattern.compile("[\"<>^`{|}]").matcher(str).replaceAll("") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, ghb.e(0, 0, 227, (String) arrayList.get(i), "[]"));
        }
        ArrayList arrayList2 = (ArrayList) t84VarG.d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? ghb.e(0, 0, 195, str2, "\\^`{|}") : null);
            }
        }
        String str3 = (String) t84VarG.i;
        t84VarG.i = str3 != null ? ghb.e(0, 0, 163, str3, " \"#<>\\^`{|}") : null;
        String string = t84VarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                qr7.o(e);
                return null;
            }
        }
    }

    public final String toString() {
        return this.h;
    }
}
