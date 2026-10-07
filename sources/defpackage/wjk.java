package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wjk {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final ArrayList j;

    public wjk(String str, long j, String str2, String str3, int i, String str4, boolean z, String str5, String str6, ArrayList arrayList) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = z;
        this.h = str5;
        this.i = str6;
        this.j = arrayList;
    }

    public static void a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t') {
                sb.append(wk8.b("c9920b80dc7f"));
            } else if (cCharAt == '\n') {
                sb.append(wk8.b("c9920b7a2665"));
            } else if (cCharAt == '\r') {
                sb.append(wk8.b("c9920b7e2279"));
            } else if (cCharAt == '\"' || cCharAt == '\\') {
                sb.append('\\');
                sb.append(cCharAt);
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
    }
}
