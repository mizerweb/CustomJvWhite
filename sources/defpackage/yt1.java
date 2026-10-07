package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yt1 {
    public final long a;
    public final int b;
    public final int c;

    public yt1(int i, int i2, long j) {
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    public static yt1 a(String str) {
        long j = 0;
        int i = 1;
        int i2 = 0;
        for (String str2 : str.split(":")) {
            if (str2.startsWith("d")) {
                i2 = Integer.parseInt(str2.substring(1));
            } else {
                boolean zStartsWith = str2.startsWith("g");
                boolean zStartsWith2 = str2.startsWith("u");
                if (zStartsWith || zStartsWith2) {
                    i = zStartsWith ? 2 : 1;
                    j = Long.parseLong(str2.substring(1));
                } else {
                    char cCharAt = str2.charAt(0);
                    if (Character.isDigit(cCharAt) || cCharAt == '-') {
                        j = Long.parseLong(str2);
                    }
                }
            }
        }
        return new yt1(i, i2, j);
    }

    public final String b() {
        char c;
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        if (i == 1) {
            c = 'u';
        } else {
            if (i != 2) {
                throw null;
            }
            c = 'g';
        }
        sb.append(String.valueOf(c));
        sb.append(this.a);
        sb.append(":d");
        sb.append(this.c);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yt1.class != obj.getClass()) {
            return false;
        }
        yt1 yt1Var = (yt1) obj;
        return this.a == yt1Var.a && this.c == yt1Var.c && this.b == yt1Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), qt4.b(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return b();
    }
}
