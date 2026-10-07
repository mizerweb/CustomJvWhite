package defpackage;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class xt8 implements Serializable {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final ep4 e;
    public transient String f;

    static {
        new xt8(ep4.c, -1L, -1L, -1, -1);
    }

    public xt8(ep4 ep4Var, long j, long j2, int i, int i2) {
        this.e = ep4Var == null ? ep4.c : ep4Var;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof xt8)) {
            return false;
        }
        xt8 xt8Var = (xt8) obj;
        ep4 ep4Var = xt8Var.e;
        ep4 ep4Var2 = this.e;
        if (ep4Var2 == null) {
            if (ep4Var != null) {
                return false;
            }
        } else if (!ep4Var2.equals(ep4Var)) {
            return false;
        }
        return this.c == xt8Var.c && this.d == xt8Var.d && this.b == xt8Var.b && this.a == xt8Var.a;
    }

    public final int hashCode() {
        return ((((this.e == null ? 1 : 2) ^ this.c) + this.d) ^ ((int) this.b)) + ((int) this.a);
    }

    public final String toString() {
        String str;
        String str2 = this.f;
        ep4 ep4Var = this.e;
        if (str2 == null) {
            StringBuilder sb = new StringBuilder(200);
            Object obj = ep4Var.a;
            if (obj != null) {
                Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                String name = cls.getName();
                if (name.startsWith("java.")) {
                    name = cls.getSimpleName();
                } else if (obj instanceof byte[]) {
                    name = "byte[]";
                } else if (obj instanceof char[]) {
                    name = "char[]";
                }
                sb.append('(');
                sb.append(name);
                sb.append(')');
                if (ep4Var.b) {
                    int[] iArr = {-1, -1};
                    String str3 = " chars";
                    if (obj instanceof CharSequence) {
                        CharSequence charSequence = (CharSequence) obj;
                        ep4.a(charSequence.length(), iArr);
                        int i = iArr[0];
                        str = charSequence.subSequence(i, Math.min(iArr[1], 500) + i).toString();
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        ep4.a(cArr.length, iArr);
                        str = new String(cArr, iArr[0], Math.min(iArr[1], 500));
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        ep4.a(bArr.length, iArr);
                        str3 = " bytes";
                        str = new String(bArr, iArr[0], Math.min(iArr[1], 500), StandardCharsets.UTF_8);
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        sb.append('\"');
                        int length = str.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            char cCharAt = str.charAt(i2);
                            if (!Character.isISOControl(cCharAt) || cCharAt == '\r' || cCharAt == '\n') {
                                sb.append(cCharAt);
                            } else {
                                sb.append("\\u");
                                char[] cArr2 = lt2.a;
                                sb.append(cArr2[(cCharAt >> '\f') & 15]);
                                sb.append(cArr2[(cCharAt >> '\b') & 15]);
                                sb.append(cArr2[(cCharAt >> 4) & 15]);
                                sb.append(cArr2[cCharAt & 15]);
                            }
                        }
                        sb.append('\"');
                        if (iArr[1] > 500) {
                            sb.append("[truncated ");
                            sb.append(iArr[1] - 500);
                            sb.append(str3);
                            sb.append(']');
                        }
                    }
                } else if (obj instanceof byte[]) {
                    int length2 = ((byte[]) obj).length;
                    sb.append('[');
                    sb.append(length2);
                    sb.append(" bytes]");
                }
            } else if (ep4Var == ep4.d) {
                sb.append("REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled)");
            } else {
                sb.append("UNKNOWN");
            }
            this.f = sb.toString();
        }
        String str4 = this.f;
        StringBuilder sb2 = new StringBuilder(str4.length() + 40);
        p.j(sb2, "[Source: ", str4, "; ");
        boolean z = ep4Var.b;
        int i3 = this.d;
        int i4 = this.c;
        if (z) {
            sb2.append("line: ");
            if (i4 >= 0) {
                sb2.append(i4);
            } else {
                sb2.append("UNKNOWN");
            }
            sb2.append(", column: ");
            if (i3 >= 0) {
                sb2.append(i3);
            } else {
                sb2.append("UNKNOWN");
            }
        } else if (i4 > 0) {
            sb2.append("line: ");
            sb2.append(i4);
            if (i3 > 0) {
                sb2.append(", column: ");
                sb2.append(i3);
            }
        } else {
            sb2.append("byte offset: #");
            long j = this.a;
            if (j >= 0) {
                sb2.append(j);
            } else {
                sb2.append("UNKNOWN");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
