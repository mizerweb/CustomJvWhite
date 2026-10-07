package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class j09 {
    public static final bo7 b = new bo7("LibraryVersion", "");
    public static final j09 c = new j09();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    public final String a(String str) throws Throwable {
        IOException e;
        ?? r2;
        InputStream resourceAsStream;
        String property;
        bo7 bo7Var = b;
        yab.q(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        ?? r6 = 0;
        r6 = 0;
        r6 = 0;
        InputStream inputStream = null;
        try {
            try {
                resourceAsStream = j09.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb.append(str);
                        sb.append(" version is ");
                        sb.append(property);
                        String string = sb.toString();
                        if (Log.isLoggable(bo7Var.a, 2)) {
                            r6 = property;
                            Log.v("LibraryVersion", bo7Var.f(string));
                            r6 = property;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb2.append("Failed to get app version for libraryName: ");
                        sb2.append(str);
                        bo7Var.e("LibraryVersion", sb2.toString());
                    }
                    r6 = property;
                } catch (IOException e2) {
                    e = e2;
                    ?? r8 = r6;
                    inputStream = resourceAsStream;
                    r2 = r8;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb3.append("Failed to get app version for libraryName: ");
                    sb3.append(str);
                    bo7Var.c("LibraryVersion", sb3.toString(), e);
                    InputStream inputStream2 = inputStream;
                    r6 = r2;
                    resourceAsStream = inputStream2;
                } catch (Throwable th) {
                    th = th;
                    r6 = resourceAsStream;
                    if (r6 != 0) {
                        n2m.a(r6);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                r2 = 0;
            }
            if (resourceAsStream != null) {
                n2m.a(resourceAsStream);
            }
            if (r6 == 0) {
                bo7Var.a("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                r6 = "UNKNOWN";
            }
            concurrentHashMap.put(str, r6);
            return r6;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
