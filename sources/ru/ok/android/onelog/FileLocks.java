package ru.ok.android.onelog;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes3.dex */
final class FileLocks {

    public static final class Holder implements Closeable {
        private final FileLock lock;
        private final RandomAccessFile raf;

        public Holder(RandomAccessFile randomAccessFile, FileLock fileLock) {
            this.raf = randomAccessFile;
            this.lock = fileLock;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                FileLock fileLock = this.lock;
                if (fileLock != null) {
                    fileLock.release();
                }
            } finally {
                FileLocks.closeQuietly(this.raf);
            }
        }
    }

    private FileLocks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Holder lock(File file) throws IOException {
        if (file == null || !file.exists()) {
            return null;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            return new Holder(randomAccessFile, randomAccessFile.getChannel().lock());
        } catch (Throwable th) {
            closeQuietly(randomAccessFile);
            throw th;
        }
    }
}
