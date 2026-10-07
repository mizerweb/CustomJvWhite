package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes2.dex */
public final class pr6 implements Closeable, x18 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public pr6(File file) throws IOException {
        this.a = 0;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.b = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.c = fileLockLock;
        } catch (Throwable th) {
            ((FileOutputStream) this.b).close();
            throw th;
        }
    }

    private final void l() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                FileOutputStream fileOutputStream = (FileOutputStream) this.b;
                try {
                    FileLock fileLock = (FileLock) obj;
                    if (fileLock != null) {
                        fileLock.release();
                        break;
                    }
                    return;
                } finally {
                    fileOutputStream.close();
                }
            case 1:
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.x18
    public long getContentLength() {
        return ((byte[]) this.c).length;
    }

    @Override // defpackage.x18
    public String getContentType() {
        return (String) this.b;
    }

    @Override // defpackage.x18
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) this.c);
    }

    public byte[] y() {
        return (byte[]) this.c;
    }

    public /* synthetic */ pr6(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
