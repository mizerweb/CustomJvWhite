package defpackage;

import androidx.media3.common.ParserException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h21 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, UploadConfig.DEFAULT_MAX_EVENT_COUNT, UploadConfig.DEFAULT_MAX_EVENT_COUNT, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, np0.q};

    public static i21 a() {
        if (i21.d) {
            return new i21();
        }
        return null;
    }

    public static void b(int i, nmc nmcVar) {
        nmcVar.K(7);
        byte[] bArr = nmcVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static final int c(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static final int d(InputStream inputStream) {
        int i;
        boolean z;
        int iA;
        int i2;
        int i3;
        while (true) {
            try {
                if (ntl.a(inputStream, 1, false) == 255) {
                    int iA2 = 255;
                    while (iA2 == 255) {
                        iA2 = ntl.a(inputStream, 1, false);
                    }
                    if (iA2 == 225) {
                        int iA3 = ntl.a(inputStream, 2, false);
                        if (iA3 - 2 > 6) {
                            int iA4 = ntl.a(inputStream, 4, false);
                            int iA5 = ntl.a(inputStream, 2, false);
                            i = iA3 - 8;
                            if (iA4 != 1165519206 || iA5 != 0) {
                                break;
                            }
                            break;
                        }
                    } else if (iA2 != 1 && iA2 != 216) {
                        if (iA2 != 217 && iA2 != 218) {
                            inputStream.skip(ntl.a(inputStream, 2, false) - 2);
                        }
                    }
                }
                i = 0;
                break;
            } catch (IOException unused) {
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i > 8) {
            int iA6 = ntl.a(inputStream, 4, false);
            if (iA6 == 1229531648 || iA6 == 1296891946) {
                z = iA6 == 1229531648;
                iA = ntl.a(inputStream, 4, z);
                i2 = i - 8;
                if (iA < 8 || iA - 8 > i2) {
                    pj6.b("Invalid offset", srh.class);
                    i2 = 0;
                }
            } else {
                pj6.b("Invalid TIFF header", srh.class);
                i2 = 0;
                z = false;
                iA = 0;
            }
        } else {
            i2 = 0;
            z = false;
            iA = 0;
        }
        int i4 = iA - 8;
        if (i2 != 0 && i4 <= i2) {
            inputStream.skip(i4);
            int i5 = i2 - i4;
            if (i5 < 14) {
                i3 = 0;
                break;
            }
            int iA7 = ntl.a(inputStream, 2, z);
            int i6 = i5 - 2;
            while (true) {
                int i7 = iA7 - 1;
                if (iA7 <= 0 || i6 < 12) {
                    i3 = 0;
                    break;
                }
                i3 = i6 - 2;
                if (ntl.a(inputStream, 2, z) == 274) {
                    break;
                }
                inputStream.skip(10L);
                i6 -= 12;
                iA7 = i7;
            }
            if (i3 >= 10 && ntl.a(inputStream, 2, z) == 3 && ntl.a(inputStream, 4, z) == 1) {
                return ntl.a(inputStream, 2, z);
            }
        }
        return 0;
    }

    public static boolean e() {
        return i21.d;
    }

    public static int f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return g(new mo2(16, bArr)).d;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static td0 g(mo2 mo2Var) {
        int i;
        int i2;
        int i3 = mo2Var.i(16);
        int i4 = mo2Var.i(16);
        if (i4 == 65535) {
            i4 = mo2Var.i(24);
            i = 7;
        } else {
            i = 4;
        }
        int i5 = i4 + i;
        if (i3 == 44097) {
            i5 += 2;
        }
        if (mo2Var.i(2) == 3) {
            do {
                mo2Var.i(2);
            } while (mo2Var.h());
        }
        int i6 = mo2Var.i(10);
        if (mo2Var.h() && mo2Var.i(3) > 0) {
            mo2Var.t(2);
        }
        int i7 = mo2Var.h() ? 48000 : 44100;
        int i8 = mo2Var.i(4);
        int[] iArr = a;
        if (i7 == 44100 && i8 == 13) {
            i2 = iArr[i8];
        } else if (i7 != 48000 || i8 >= 14) {
            i2 = 0;
        } else {
            int i9 = iArr[i8];
            int i10 = i6 % 5;
            if (i10 == 1) {
                if (i8 != 3 || i8 == 8) {
                    i2 = i9 + 1;
                } else {
                    i2 = i9;
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i8 != 3) {
                    }
                    i2 = i9 + 1;
                } else if (i10 == 4 && (i8 == 3 || i8 == 8 || i8 == 11)) {
                    i2 = i9 + 1;
                } else {
                    i2 = i9;
                }
            } else if (i8 == 8 || i8 == 11) {
                i2 = i9 + 1;
            } else {
                i2 = i9;
            }
        }
        return new td0(i7, i5, i2, 1);
    }

    public static void h(mo2 mo2Var, i4 i4Var) throws ParserException {
        int i = mo2Var.i(5);
        mo2Var.t(2);
        if (mo2Var.h()) {
            mo2Var.t(5);
        }
        if (i >= 7 && i <= 10) {
            mo2Var.s();
        }
        if (mo2Var.h()) {
            int i2 = mo2Var.i(3);
            if (i4Var.b == -1 && i >= 0 && i <= 15 && (i2 == 0 || i2 == 1)) {
                i4Var.b = i;
            }
            if (mo2Var.h()) {
                j(mo2Var);
            }
        }
    }

    public static void i(mo2 mo2Var, i4 i4Var) throws ParserException {
        mo2Var.t(2);
        boolean zH = mo2Var.h();
        int i = mo2Var.i(8);
        for (int i2 = 0; i2 < i; i2++) {
            mo2Var.t(2);
            if (mo2Var.h()) {
                mo2Var.t(5);
            }
            if (zH) {
                mo2Var.t(24);
            } else {
                if (mo2Var.h()) {
                    if (!mo2Var.h()) {
                        mo2Var.t(4);
                    }
                    i4Var.c = mo2Var.i(6) + 1;
                }
                mo2Var.t(4);
            }
        }
        if (mo2Var.h()) {
            mo2Var.t(3);
            if (mo2Var.h()) {
                j(mo2Var);
            }
        }
    }

    public static void j(mo2 mo2Var) throws ParserException {
        int i = mo2Var.i(6);
        if (i < 2 || i > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i)));
        }
        mo2Var.t(i * 8);
    }
}
