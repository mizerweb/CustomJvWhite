package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.vk.push.core.network.http.HttpClient;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uel {
    public static ArrayList a(byte[] bArr) {
        long jD = (((long) d(bArr)) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(jD).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final Bitmap b(fy0 fy0Var, Context context, int i) {
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            ore.p("Required value was null.");
            return null;
        }
        Bitmap bitmap = (Bitmap) fy0Var.get(drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        bitmap.reconfigure(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }

    public static long c(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? HttpClient.DEFAULT_TIMEOUT_IN_MILLIS : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    public static int d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean e(long j, long j2) {
        return j - j2 <= 80000;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b2 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b2; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + 27 + i;
        return (int) ((c(byteBuffer.get(i6), byteBuffer.limit() - i6 > 1 ? byteBuffer.get(i6 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int g(ByteBuffer byteBuffer) {
        return (int) ((c(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }
}
