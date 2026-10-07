package defpackage;

import android.content.Context;
import android.media.MediaDrm;
import android.provider.Settings;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class t95 implements mk5 {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final Context a;
    public volatile String b;

    public t95(Context context) {
        this.a = context;
    }

    public static String b(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance(wk8.b("dde502aaf94aa4f09837d3")).digest(bArr);
        char[] cArr = new char[16];
        for (int i = 0; i < 8; i++) {
            byte b = bArrDigest[i];
            int i2 = i * 2;
            char[] cArr2 = c;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e A[PHI: r1
  0x002e: PHI (r1v8 java.lang.String) = (r1v0 java.lang.String), (r1v2 java.lang.String) binds: [B:12:0x002c, B:24:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.mk5
    public final String a() {
        String strB;
        String str;
        String str2 = this.b;
        if (str2 != null) {
            return str2;
        }
        try {
            MediaDrm mediaDrm = new MediaDrm(UUID.fromString(wk8.b("c6681ae4817e0da0dc7809ffc92d51a2d2375ca7877f45a7d77950ebd62d0ca5802f59a2d62b0da2")));
            byte[] propertyByteArray = mediaDrm.getPropertyByteArray(wk8.b("7e01152a4e707717497054104364741b6371"));
            mediaDrm.release();
            strB = propertyByteArray.length == 0 ? null : b(propertyByteArray);
        } catch (Exception unused) {
        }
        if (strB == null) {
            try {
                String string = Settings.Secure.getString(this.a.getContentResolver(), wk8.b("5c3f88d3b2e65b2ebce15b03baec"));
                strB = (string == null || r5h.X0(string) || string.equals(wk8.b("d42fa040799718e0249519b076981db1759416b7"))) ? null : b(string.getBytes(pt2.a));
            } catch (Exception unused2) {
            }
            str = strB != null ? strB : null;
        }
        if (str != null) {
            this.b = str;
        }
        return str;
    }
}
