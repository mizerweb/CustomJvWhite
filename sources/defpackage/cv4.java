package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class cv4 {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public cv4(long j, int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final void a() {
        lu6.l0(new File(this.c));
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv4)) {
            return false;
        }
        cv4 cv4Var = (cv4) obj;
        return this.a == cv4Var.a && this.b == cv4Var.b && this.c.equals(cv4Var.c) && this.d.equals(cv4Var.d) && this.e.equals(cv4Var.e) && this.f.equals(cv4Var.f) && this.g.equals(cv4Var.g) && this.h.equals(cv4Var.h);
    }

    public final String f() {
        return this.e;
    }

    public final long g() {
        return this.a;
    }

    public final int h() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.hashCode() + zo5.d(zo5.d(zo5.d(zo5.d(zo5.d(c0a.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str;
        StringBuilder sbS = qt4.s(this.a, "CrashDescription(timestamp=", ", type=");
        switch (this.b) {
            case 1:
                str = "CRASH";
                break;
            case 2:
                str = "NON_FATAL";
                break;
            case 3:
                str = "FATAL";
                break;
            case 4:
                str = "ERROR";
                break;
            case 5:
                str = "WARNING";
                break;
            case 6:
                str = "NOTICE";
                break;
            case 7:
                str = "INFO";
                break;
            case 8:
                str = "DEBUG";
                break;
            case 9:
                str = "MINIDUMP";
                break;
            case 10:
                str = "ANR";
                break;
            default:
                str = "null";
                break;
        }
        sbS.append(str);
        sbS.append(", crashFilesDir=");
        sbS.append(this.c);
        sbS.append(", systemStatePath=");
        nbh.G(sbS, this.d, ", tagsPath=", this.e, ", stacktracePath=");
        nbh.G(sbS, this.f, ", allStacktracesPath=", this.g, ", logsPath=");
        return zo5.w(sbS, this.h, ")");
    }
}
