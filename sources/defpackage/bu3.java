package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class bu3 {
    public static final Logger a = Logger.getLogger(bu3.class.getName());

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream);
        } catch (IOException e) {
            c.e(e);
        }
    }
}
