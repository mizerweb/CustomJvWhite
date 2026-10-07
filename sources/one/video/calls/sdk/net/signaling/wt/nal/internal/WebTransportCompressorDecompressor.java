package one.video.calls.sdk.net.signaling.wt.nal.internal;

import defpackage.pt2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Metadata;
import one.video.calls.sdk.net.signaling.wt.nal.NALLog;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001e¨\u0006("}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportCompressorDecompressor;", "Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor;", "Lone/video/calls/sdk/net/signaling/wt/nal/NALLog;", "log", "<init>", "(Lone/video/calls/sdk/net/signaling/wt/nal/NALLog;)V", "", "rawData", "", "offset", "length", "Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor$CompressedOutProvider;", "output", "Lsbi;", "compress", "([BIILone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportSocket$CompressorDecompressor$CompressedOutProvider;)V", "compressedData", "", "decompress", "([BII)Ljava/lang/String;", "release", "()V", "Lone/video/calls/sdk/net/signaling/wt/nal/NALLog;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Ljava/io/ByteArrayOutputStream;", "deflaterOutput", "Ljava/io/ByteArrayOutputStream;", "deflaterBuffer", "[B", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportCompressorDecompressor$DecompressorOutputStream;", "inflaterOutput", "Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportCompressorDecompressor$DecompressorOutputStream;", "inflaterBuffer", "Companion", "DecompressorOutputStream", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebTransportCompressorDecompressor implements WebTransportSocket.CompressorDecompressor {
    private static final int BUFFER_SIZE = 512;
    public static final String COMPRESSION_NAME = "deflate-raw";
    private static final String TAG = "WebTransportCompressorDecompressor";
    private final NALLog log;
    private final Deflater deflater = new Deflater(-1, true);
    private final ByteArrayOutputStream deflaterOutput = new ByteArrayOutputStream();
    private final byte[] deflaterBuffer = new byte[512];
    private final Inflater inflater = new Inflater(true);
    private final DecompressorOutputStream inflaterOutput = new DecompressorOutputStream();
    private final byte[] inflaterBuffer = new byte[512];

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/internal/WebTransportCompressorDecompressor$DecompressorOutputStream;", "Ljava/io/ByteArrayOutputStream;", "<init>", "()V", "asString", "", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DecompressorOutputStream extends ByteArrayOutputStream {
        public final String asString() {
            return new String(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, pt2.a);
        }
    }

    public WebTransportCompressorDecompressor(NALLog nALLog) {
        this.log = nALLog;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket.CompressorDecompressor
    public final void compress(byte[] rawData, int offset, int length, WebTransportSocket.CompressorDecompressor.CompressedOutProvider output) throws IOException {
        this.deflater.reset();
        this.deflater.setInput(rawData, offset, length);
        this.deflater.finish();
        this.deflaterOutput.reset();
        while (!this.deflater.finished()) {
            this.deflaterOutput.write(this.deflaterBuffer, 0, this.deflater.deflate(this.deflaterBuffer));
        }
        ByteArrayOutputStream byteArrayOutputStream = this.deflaterOutput;
        byteArrayOutputStream.writeTo(output.getOutputStream(byteArrayOutputStream.size()));
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket.CompressorDecompressor
    public final String decompress(byte[] compressedData, int offset, int length) throws DataFormatException, IOException {
        this.inflater.reset();
        this.inflater.setInput(compressedData, offset, length);
        this.inflaterOutput.reset();
        while (!this.inflater.finished()) {
            this.inflaterOutput.write(this.inflaterBuffer, 0, this.inflater.inflate(this.inflaterBuffer));
        }
        return this.inflaterOutput.asString();
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket.CompressorDecompressor
    public final void release() {
        try {
            this.deflater.end();
            this.log.log(TAG, "deflater released");
        } catch (Throwable th) {
            this.log.logException(TAG, "Error finalizing deflater", th);
        }
        try {
            this.inflater.end();
            this.log.log(TAG, "inflater released");
        } catch (Throwable th2) {
            this.log.logException(TAG, "Error finalizing inflater", th2);
        }
    }
}
