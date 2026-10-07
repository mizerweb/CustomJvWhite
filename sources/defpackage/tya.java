package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tya {
    public static final MimeTypeMap a = MimeTypeMap.getSingleton();
    public static final Map b;

    static {
        h98.b("image/heif", "heif", "image/heic", "heic");
        b = h98.b("heif", "image/heif", "heic", "image/heic");
    }
}
