package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import androidx.media3.common.ParserException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xel {
    public static Bitmap a(byte[] bArr, int i, int i2, BitmapFactory.Options options) throws IOException {
        int i3 = 0;
        if (i2 != -1) {
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            se6 se6Var = new se6(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (se6Var.d(1, "Orientation")) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static Bitmap b(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }

    public static JSONObject c(vu8 vu8Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            vu8Var.p();
            while (vu8Var.peek() != 125) {
                jSONObject.put(vu8Var.name(), d(vu8Var, JSONObject.NULL));
            }
            vu8Var.t();
            return jSONObject;
        } catch (JSONException e) {
            c.e(e);
            return null;
        }
    }

    public static Object d(vu8 vu8Var, Object obj) {
        try {
            int iPeek = vu8Var.peek();
            if (iPeek == 34) {
                return vu8Var.F();
            }
            if (iPeek == 49) {
                String strE0 = vu8Var.E0();
                if (strE0.indexOf(46) >= 0 || strE0.indexOf(101) >= 0 || strE0.indexOf(69) >= 0) {
                    return Double.valueOf(Double.parseDouble(strE0));
                }
                long j = Long.parseLong(strE0);
                return (j < -2147483648L || j > 2147483647L) ? Long.valueOf(j) : Integer.valueOf((int) j);
            }
            if (iPeek == 91) {
                JSONArray jSONArray = new JSONArray();
                vu8Var.r();
                while (vu8Var.peek() != 93) {
                    jSONArray.put(d(vu8Var, null));
                }
                vu8Var.q();
                return jSONArray;
            }
            if (iPeek == 98) {
                return Boolean.valueOf(vu8Var.V());
            }
            if (iPeek == 110) {
                vu8Var.x();
                return obj;
            }
            if (iPeek == 123) {
                return c(vu8Var);
            }
            throw JsonStateException.d(iPeek);
        } catch (JsonTypeMismatchException e) {
            c.e(e);
            return null;
        }
    }
}
