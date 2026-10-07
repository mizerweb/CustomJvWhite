package defpackage;

import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public abstract class pt2 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b = Charset.forName(HTTP.UTF_16);
    public static final Charset c;
    public static final Charset d;
    public static volatile Charset e;
    public static volatile Charset f;

    static {
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        c = Charset.forName("US-ASCII");
        d = Charset.forName("ISO-8859-1");
    }
}
