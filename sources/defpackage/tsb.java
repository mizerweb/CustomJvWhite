package defpackage;

import java.io.Closeable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class tsb implements Closeable {
    public static final Pattern b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"", 2);
    public final pne a;

    public tsb(pne pneVar) {
        this.a = pneVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String l() {
        int iY0;
        String strA = this.a.f.a("Content-Disposition");
        String strGroup = null;
        if (strA == null) {
            strA = null;
        }
        if (strA == null || strA.length() == 0) {
            gm0.Y(tsb.class.getName(), "Early return in fileName cuz of contentDisposition == null || contentDisposition.isEmpty()");
            return null;
        }
        try {
            Matcher matcher = b.matcher(strA);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            }
        } catch (IllegalStateException unused) {
        }
        return (strGroup == null || (iY0 = r5h.Y0(strGroup, '/', 0, 6) + 1) <= 0) ? strGroup : strGroup.substring(iY0);
    }
}
