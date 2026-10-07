package defpackage;

import android.os.Bundle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mol {
    public static jc4 a(ynh ynhVar, Bundle bundle, y3f y3fVar, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            y3fVar = null;
        }
        return new jc4(ynhVar, bundle, y3fVar);
    }

    public static void b(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file2));
            try {
                egl.a(fileInputStream, gZIPOutputStream);
                gZIPOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(gZIPOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rx8.n(fileInputStream, th3);
                throw th4;
            }
        }
    }
}
