package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class wwa {
    public static final Logger a = Logger.getLogger(wwa.class.getName());

    /* JADX WARN: Code duplicated, block: B:40:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static List a(InputStream inputStream) throws Throwable {
        Throwable th;
        IOException e;
        Logger logger = a;
        if (inputStream == null) {
            return Collections.EMPTY_LIST;
        }
        InputStream inputStream2 = null;
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                try {
                    ArrayList arrayList = new ArrayList();
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        juc jucVar = new juc();
                        jucVar.readExternal(objectInputStream);
                        arrayList.add(jucVar);
                    }
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    try {
                        objectInputStream.close();
                        return arrayList;
                    } catch (IOException e2) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e2);
                        return arrayList;
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IllegalStateException("Unable to parse metadata file", e);
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        inputStream2.close();
                    } catch (IOException e5) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e5);
                    }
                } else {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e6);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                inputStream2.close();
            } else {
                inputStream.close();
            }
            throw th;
        }
    }
}
