package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x0m {
    public static final int a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                return new se6(inputStream).d(1, "Orientation");
            } catch (IOException e) {
                if (pj6.a.h(3)) {
                    pj6.a.d(e);
                }
            }
        } else if (pj6.a.h(3)) {
            pj6.a.d("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        return 0;
    }
}
