package defpackage;

import android.util.Base64;
import androidx.media3.common.ParserException;
import com.vk.push.core.base.AidlException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t01 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, np0.m, 160, 192, 224, np0.n, 320, 384, 448, np0.o, 576, 640};
    public static final int[] f = {69, 87, AidlException.SDK_IS_NOT_INITIALIZED, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static uo8 a() {
        if (uo8.c) {
            return new uo8();
        }
        return null;
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            String str = vqi.a;
            int iReverseBytes = byteBuffer.getInt(i + 4);
            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                iReverseBytes = Integer.reverseBytes(iReverseBytes);
            }
            if ((iReverseBytes & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static int c(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f[i3]) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static int[] d(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * np0.n;
        }
        return 1536;
    }

    public static int f(int i, ByteBuffer byteBuffer) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static lwa g(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = vqi.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                lvb.G0("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(ezc.d(new nmc(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    lvb.H0("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new cbj(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new lwa(arrayList);
    }

    public static rai h(nmc nmcVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            i(3, nmcVar, false);
        }
        nmcVar.y((int) nmcVar.r(), StandardCharsets.UTF_8);
        long jR = nmcVar.r();
        String[] strArr = new String[(int) jR];
        for (int i = 0; i < jR; i++) {
            strArr[i] = nmcVar.y((int) nmcVar.r(), StandardCharsets.UTF_8);
        }
        if (z2 && (nmcVar.A() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new rai(strArr);
    }

    public static boolean i(int i, nmc nmcVar, boolean z) throws ParserException {
        if (nmcVar.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + nmcVar.a());
        }
        if (nmcVar.A() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (nmcVar.A() == 118 && nmcVar.A() == 111 && nmcVar.A() == 114 && nmcVar.A() == 98 && nmcVar.A() == 105 && nmcVar.A() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
