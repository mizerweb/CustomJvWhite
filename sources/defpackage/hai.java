package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class hai {
    private final URL a;

    public hai(String str) throws MalformedURLException {
        this.a = new URL(str);
    }

    public URLConnection a() throws IOException {
        return this.a.openConnection();
    }
}
