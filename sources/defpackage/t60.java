package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class t60 {
    public static final /* synthetic */ int j = 0;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final o60 f;
    public final e70 g;
    public final boolean h;
    public final boolean i;

    static {
        new s60().a();
    }

    public t60(s60 s60Var) {
        this.a = s60Var.a;
        this.b = s60Var.b;
        this.c = (String) s60Var.e;
        this.d = (String) s60Var.f;
        this.e = (String) s60Var.g;
        this.f = (o60) s60Var.h;
        this.g = (e70) s60Var.i;
        this.h = s60Var.c;
        this.i = s60Var.d;
    }

    public static s60 m() {
        return new s60();
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        d70 d70Var;
        String str;
        e70 e70Var = this.g;
        if (e70Var == null || (d70Var = e70Var.d) == null || (str = d70Var.i) == null) {
            return null;
        }
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return e70Var.d.i;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return null;
    }

    public final String c() {
        return this.e;
    }

    public final o60 d() {
        return this.f;
    }

    public final e70 e() {
        return this.g;
    }

    public final long f() {
        return this.a;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    public final boolean i() {
        return this.f != null;
    }

    public final boolean j() {
        String str;
        String str2 = this.c;
        boolean z = str2 == null || str2.isEmpty() || Objects.equals(this.b, str2);
        String str3 = this.e;
        return (str3 == null || str3.isEmpty()) && z && ((str = this.d) == null || str.isEmpty()) && !i();
    }

    public final boolean k() {
        return this.i;
    }

    public final boolean l() {
        return this.h;
    }
}
