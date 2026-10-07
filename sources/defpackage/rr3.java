package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class rr3 implements uwa {
    public static final Logger a = Logger.getLogger(rr3.class.getName());

    @Override // defpackage.uwa
    public final InputStream b(String str) {
        InputStream resourceAsStream = rr3.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
