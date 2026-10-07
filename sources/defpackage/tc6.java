package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tc6 implements jwa {
    public static final b87 g;
    public static final b87 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        a87 a87Var = new a87();
        a87Var.m = uya.n("application/id3");
        g = new b87(a87Var);
        a87 a87Var2 = new a87();
        a87Var2.m = uya.n("application/x-scte35");
        h = new b87(a87Var2);
    }

    public tc6(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.jwa
    public final b87 a() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.jwa
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tc6.class != obj.getClass()) {
            return false;
        }
        tc6 tc6Var = (tc6) obj;
        return this.c == tc6Var.c && this.d == tc6Var.d && Objects.equals(this.a, tc6Var.a) && this.b.equals(tc6Var.b) && Arrays.equals(this.e, tc6Var.e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int iD = zo5.d((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
            long j = this.c;
            int i = (iD + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
