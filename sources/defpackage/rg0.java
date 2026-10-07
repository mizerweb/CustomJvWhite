package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rg0 {
    public static final List f = Collections.unmodifiableList(Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public rg0(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final int a() {
        int i = this.d;
        qyj.h("Invalid channel count: " + i, i > 0);
        int i2 = this.e;
        if (i2 == 2) {
            return i * 2;
        }
        if (i2 == 3) {
            return i;
        }
        if (i2 != 4) {
            if (i2 == 21) {
                return i * 3;
            }
            if (i2 != 22) {
                ore.p(zo5.h(i2, "Invalid audio encoding: "));
                return 0;
            }
        }
        return i * 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rg0) {
            rg0 rg0Var = (rg0) obj;
            if (this.a == rg0Var.a && this.b == rg0Var.b && this.c == rg0Var.c && this.d == rg0Var.d && this.e == rg0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.a);
        sb.append(", captureSampleRate=");
        sb.append(this.b);
        sb.append(", encodeSampleRate=");
        sb.append(this.c);
        sb.append(", channelCount=");
        sb.append(this.d);
        sb.append(", audioFormat=");
        return zo5.t(sb, this.e, "}");
    }
}
