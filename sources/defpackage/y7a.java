package defpackage;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y7a {
    public static final Map a = wm9.Q0(new ylc("mkv", "video/x-matroska"), new ylc("glb", "model/gltf-binary"));

    public static final String a(String str) {
        int iY0 = r5h.Y0(str, '.', 0, 6);
        String strSubstring = (iY0 < 0 || iY0 == str.length() + (-1)) ? null : str.substring(iY0 + 1);
        if (strSubstring == null) {
            return null;
        }
        String lowerCase = strSubstring.toLowerCase(Locale.US);
        String mimeTypeFromExtension = (String) tya.b.get(lowerCase);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = tya.a.getMimeTypeFromExtension(lowerCase);
        }
        return mimeTypeFromExtension == null ? (String) a.get(lowerCase) : mimeTypeFromExtension;
    }

    public static final boolean b(String str) {
        if (str != null) {
            return z5h.K0(str, "video/", false);
        }
        return false;
    }
}
