package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pzl {
    public static final byte[] a(File file) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            egl.a(fileInputStream, gZIPOutputStream);
            fileInputStream.close();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final jt8 b(qs8 qs8Var, Object obj, aw8 aw8Var) {
        wfe wfeVar = new wfe();
        new ru8(qs8Var, new haa(1, wfeVar), 1).t(aw8Var, obj);
        Object obj2 = wfeVar.a;
        if (obj2 == null) {
            return null;
        }
        return (jt8) obj2;
    }
}
