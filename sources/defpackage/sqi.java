package defpackage;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes3.dex */
public final class sqi {
    public final CodingErrorAction a = CodingErrorAction.REPLACE;
    public final byte b = 63;
    public char c = 0;

    public final long a(char[] cArr, int i, int i2, byte[] bArr, int i3) throws CharacterCodingException {
        int i4;
        char c;
        int i5;
        int i6;
        char c2 = this.c;
        int i7 = i2 + i;
        int i8 = i3 - 4;
        int iB = 0;
        while (i < i7 && iB <= i8) {
            i++;
            char c3 = cArr[i];
            if (c3 < 55296 || c3 > 56319) {
                if (c3 < 56320 || c3 > 57343) {
                    if (c2 != 0) {
                        iB = b(iB, bArr);
                        c2 = 0;
                    }
                    i4 = iB;
                    c = c2;
                    i5 = c3;
                } else if (c2 == 0) {
                    iB = b(iB, bArr);
                } else {
                    i5 = (((c2 & 1023) << 10) | (c3 & 1023)) + 65536;
                    i4 = iB;
                    c = 0;
                }
                if (i5 <= 127) {
                    bArr[i4] = (byte) c3;
                    i6 = i4 + 1;
                } else if (i5 <= 2047) {
                    int i9 = i4 + 1;
                    bArr[i4] = (byte) ((i5 >> 6) | 192);
                    i6 = i4 + 2;
                    bArr[i9] = (byte) ((i5 & 63) | np0.m);
                } else if (i5 <= 65535) {
                    bArr[i4] = (byte) ((i5 >> 12) | 224);
                    int i10 = i4 + 2;
                    bArr[i4 + 1] = (byte) (((i5 >> 6) & 63) | np0.m);
                    i6 = i4 + 3;
                    bArr[i10] = (byte) ((i5 & 63) | np0.m);
                } else {
                    bArr[i4] = (byte) ((i5 >> 18) | 240);
                    bArr[i4 + 1] = (byte) (((i5 >> 12) & 63) | np0.m);
                    int i11 = i4 + 3;
                    bArr[i4 + 2] = (byte) (((i5 >> 6) & 63) | np0.m);
                    i6 = i4 + 4;
                    bArr[i11] = (byte) ((i5 & 63) | np0.m);
                }
                c2 = c;
                iB = i6;
            } else {
                if (c2 != 0) {
                    iB = b(iB, bArr);
                }
                c2 = c3;
            }
        }
        this.c = c2;
        return (((long) i) << 32) | ((long) iB);
    }

    public final int b(int i, byte[] bArr) throws CharacterCodingException {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CodingErrorAction codingErrorAction2 = this.a;
        if (codingErrorAction2 == codingErrorAction) {
            int i2 = i + 1;
            bArr[i] = this.b;
            return i2;
        }
        if (codingErrorAction2 != CodingErrorAction.REPORT) {
            return i;
        }
        throw new CharacterCodingException();
    }
}
