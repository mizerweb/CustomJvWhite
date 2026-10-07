package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class xq0 {
    public static final vq0 d;
    public final uq0 a;
    public final Character b;
    public volatile xq0 c;

    static {
        new wq0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new wq0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new xq0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new xq0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new vq0(new uq0("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public xq0(uq0 uq0Var, Character ch) {
        boolean z;
        this.a = uq0Var;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = uq0Var.g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        lvb.S(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final void a(StringBuilder sb, byte[] bArr, int i, int i2) {
        lvb.Y(i, i + i2, bArr.length);
        uq0 uq0Var = this.a;
        int i3 = uq0Var.f;
        int i4 = uq0Var.d;
        int i5 = 0;
        lvb.R(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(uq0Var.b[((int) (j >>> (i7 - i5))) & uq0Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < uq0Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        lvb.Y(0, i, bArr.length);
        while (i2 < i) {
            uq0 uq0Var = this.a;
            a(sb, bArr, i2, Math.min(uq0Var.f, i - i2));
            i2 += uq0Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xq0) {
            xq0 xq0Var = (xq0) obj;
            if (this.a.equals(xq0Var.a) && Objects.equals(this.b, xq0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        uq0 uq0Var = this.a;
        sb.append(uq0Var);
        if (8 % uq0Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public xq0(String str, String str2) {
        this(new uq0(str, str2.toCharArray()), (Character) '=');
    }
}
