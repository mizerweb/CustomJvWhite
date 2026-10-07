package one.me.callssdk;

import android.content.Context;
import android.os.Build;
import defpackage.o6;
import defpackage.rx8;
import defpackage.ww3;
import defpackage.z5h;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0086 J(\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0014\u0010\u0011\u001a\u00020\u0005*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¨\u0006\u0014"}, d2 = {"Lone/me/callssdk/CallsSdkInitializer;", "", "<init>", "()V", "initializeSessionSeed", "", "context", "Landroid/content/Context;", "seed", ApiProtocol.PARAM_DEVICE_ID, "calculateMeta", "ext", "", "sizeLimit", "", "filterByArch", "", "readExactly", "Ljava/io/InputStream;", "size", "integrity-protection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallsSdkInitializer {
    public static final CallsSdkInitializer INSTANCE = new CallsSdkInitializer();

    private CallsSdkInitializer() {
    }

    public static final byte[] calculateMeta(Context context, String ext, int sizeLimit, boolean filterByArch) throws NoSuchAlgorithmException, IOException {
        String[] strArr;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        calculateMeta$calculateForZip(filterByArch, ext, sizeLimit, messageDigest, context.getApplicationInfo().sourceDir);
        if (filterByArch && (strArr = context.getApplicationInfo().splitSourceDirs) != null) {
            for (String str : strArr) {
                calculateMeta$calculateForZip(filterByArch, ext, sizeLimit, messageDigest, str);
            }
        }
        return messageDigest.digest();
    }

    private static final void calculateMeta$calculateForZip(boolean z, String str, int i, MessageDigest messageDigest, String str2) throws IOException {
        ZipFile zipFile = new ZipFile(str2);
        try {
            ArrayList list = Collections.list(zipFile.entries());
            if (z) {
                String str3 = (String) a.b1(Build.SUPPORTED_ABIS);
                if (str3 == null) {
                    str3 = "UNKNOWN";
                }
                String str4 = "lib/" + str3 + "/";
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (z5h.K0(((ZipEntry) obj).getName(), str4, false)) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((ZipEntry) obj2).getName().endsWith(str)) {
                    arrayList2.add(obj2);
                }
            }
            for (ZipEntry zipEntry : ww3.M1(arrayList2, new o6(1))) {
                int size = i < 0 ? (int) zipEntry.getSize() : Math.min(i, (int) zipEntry.getSize());
                InputStream inputStream = zipFile.getInputStream(zipEntry);
                try {
                    messageDigest.update(INSTANCE.readExactly(inputStream, size));
                    rx8.n(inputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(inputStream, th);
                        throw th2;
                    }
                }
            }
            zipFile.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rx8.n(zipFile, th3);
                throw th4;
            }
        }
    }

    private final byte[] readExactly(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        do {
            i2 += inputStream.read(bArr, i2, i - i2);
        } while (i2 < i);
        return bArr;
    }

    public final byte[] initializeSessionSeed(Context context, byte[] seed, byte[] deviceId) throws NoSuchAlgorithmException {
        byte[] bArr = new byte[96];
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(new byte[]{22, -124, 65, 64, 51, -21, 38, 62, 44, 97, 95, -117, 125, -11, -19, -121, -109, -123, 10, 7, 101, 99, 4, -103, 127, -65, 7, -23, -30, 30, 30, -109});
        messageDigest.update(seed);
        messageDigest.update(deviceId);
        System.arraycopy(messageDigest.digest(), 0, bArr, 0, 32);
        messageDigest.update(new byte[]{32, 36, -115, -100, 6, 116, 90, -66, 1, -63, -100, -48, 25, -9, -84, 17, -32, -92, 61, -64, 46, 73, -8, 121, 25, -16, 27, 114, 12, 40, -77, 15});
        messageDigest.update(seed);
        messageDigest.update(deviceId);
        System.arraycopy(messageDigest.digest(), 0, bArr, 32, 32);
        String str = Build.SUPPORTED_ABIS[0];
        byte[] bArr2 = {-102, 125, 108, 63, 45, 61, 1, -54, 94, -122, -110, -14, 84, -66, -110, 48, 109, 55, -6, -37, 7, 70, -110, 71, -101, -33, -106, 25, 67, 103, 95, 122};
        if (str.equals("armeabi-v7a")) {
            // fill-array-data instruction
            bArr2[0] = -65;
            bArr2[1] = -59;
            bArr2[2] = -84;
            bArr2[3] = 93;
            bArr2[4] = -13;
            bArr2[5] = 67;
            bArr2[6] = 87;
            bArr2[7] = -6;
            bArr2[8] = -127;
            bArr2[9] = 124;
            bArr2[10] = 74;
            bArr2[11] = -116;
            bArr2[12] = -28;
            bArr2[13] = 105;
            bArr2[14] = 108;
            bArr2[15] = -39;
            bArr2[16] = 91;
            bArr2[17] = 44;
            bArr2[18] = 52;
            bArr2[19] = -7;
            bArr2[20] = 3;
            bArr2[21] = -39;
            bArr2[22] = 30;
            bArr2[23] = -15;
            bArr2[24] = 94;
            bArr2[25] = -88;
            bArr2[26] = 100;
            bArr2[27] = 99;
            bArr2[28] = -58;
            bArr2[29] = 0;
            bArr2[30] = -66;
            bArr2[31] = -6;
        } else if (str.equals("x86_64")) {
            // fill-array-data instruction
            bArr2[0] = -82;
            bArr2[1] = 56;
            bArr2[2] = 120;
            bArr2[3] = 109;
            bArr2[4] = 44;
            bArr2[5] = 5;
            bArr2[6] = 65;
            bArr2[7] = -60;
            bArr2[8] = -46;
            bArr2[9] = -61;
            bArr2[10] = 5;
            bArr2[11] = 2;
            bArr2[12] = 101;
            bArr2[13] = -29;
            bArr2[14] = 11;
            bArr2[15] = -34;
            bArr2[16] = 104;
            bArr2[17] = -33;
            bArr2[18] = 22;
            bArr2[19] = 48;
            bArr2[20] = 42;
            bArr2[21] = -21;
            bArr2[22] = -59;
            bArr2[23] = 48;
            bArr2[24] = 36;
            bArr2[25] = 50;
            bArr2[26] = -127;
            bArr2[27] = 63;
            bArr2[28] = -14;
            bArr2[29] = 15;
            bArr2[30] = -123;
            bArr2[31] = -116;
        } else if (str.equals("x86")) {
            // fill-array-data instruction
            bArr2[0] = -111;
            bArr2[1] = -114;
            bArr2[2] = -84;
            bArr2[3] = -85;
            bArr2[4] = 79;
            bArr2[5] = -92;
            bArr2[6] = -32;
            bArr2[7] = 77;
            bArr2[8] = -112;
            bArr2[9] = -89;
            bArr2[10] = -6;
            bArr2[11] = 102;
            bArr2[12] = 107;
            bArr2[13] = -61;
            bArr2[14] = -106;
            bArr2[15] = 51;
            bArr2[16] = -82;
            bArr2[17] = 71;
            bArr2[18] = -5;
            bArr2[19] = -70;
            bArr2[20] = 112;
            bArr2[21] = -74;
            bArr2[22] = -127;
            bArr2[23] = 123;
            bArr2[24] = 93;
            bArr2[25] = -3;
            bArr2[26] = 31;
            bArr2[27] = 98;
            bArr2[28] = 35;
            bArr2[29] = 63;
            bArr2[30] = -85;
            bArr2[31] = -114;
        }
        messageDigest.update(bArr2);
        messageDigest.update(seed);
        messageDigest.update(deviceId);
        System.arraycopy(messageDigest.digest(), 0, bArr, 64, 32);
        return bArr;
    }
}
