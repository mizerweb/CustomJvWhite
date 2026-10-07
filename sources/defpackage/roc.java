package defpackage;

import java.nio.file.Path;

/* JADX INFO: loaded from: classes.dex */
public abstract class roc extends cqk {
    public static String S(Path path) {
        String string;
        Path fileName = path.getFileName();
        if (fileName == null || (string = fileName.toString()) == null) {
            return "";
        }
        int iZ0 = r5h.Z0(".", string, 6);
        return iZ0 == -1 ? string : string.substring(0, iZ0);
    }
}
