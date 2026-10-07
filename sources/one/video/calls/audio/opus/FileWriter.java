package one.video.calls.audio.opus;

import defpackage.qr7;
import defpackage.qv1;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class FileWriter implements Closeable {
    private long nativePointer;

    public FileWriter(long j) {
        this.nativePointer = j;
    }

    private void checkForError() throws IOException {
        IOException error = getError();
        if (error != null) {
            throw error;
        }
    }

    private IOException getError() {
        return nativeGetError();
    }

    private static native FileWriter nativeAudioStartRecord(String str, int i, int i2);

    private native boolean nativeAudioWriteFrame(ByteBuffer byteBuffer, int i);

    private native IOException nativeGetError();

    private native void nativeRelease();

    public static FileWriter startRecord(String str, int i, int i2) throws IOException {
        try {
            FileWriter fileWriterNativeAudioStartRecord = nativeAudioStartRecord(str, i, i2);
            if (fileWriterNativeAudioStartRecord == null) {
                qr7.k(qv1.k("Can't open writer for path ", str));
                return null;
            }
            IOException error = fileWriterNativeAudioStartRecord.getError();
            if (error == null) {
                return fileWriterNativeAudioStartRecord;
            }
            fileWriterNativeAudioStartRecord.close();
            throw error;
        } catch (Throwable th) {
            throw new IOException(qv1.k("Can't open writer for path ", str), th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeRelease();
        this.nativePointer = 0L;
    }

    public long getNativeFileWriter() {
        return this.nativePointer;
    }

    public boolean writeFrame(ByteBuffer byteBuffer, int i) throws IOException {
        checkForError();
        if (i > byteBuffer.capacity()) {
            i = byteBuffer.capacity();
        }
        boolean zNativeAudioWriteFrame = nativeAudioWriteFrame(byteBuffer, i);
        checkForError();
        return zNativeAudioWriteFrame;
    }
}
