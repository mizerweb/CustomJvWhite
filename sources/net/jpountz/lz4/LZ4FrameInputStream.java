package net.jpountz.lz4;

import defpackage.a1k;
import defpackage.b1k;
import defpackage.c;
import defpackage.ore;
import defpackage.qr7;
import defpackage.qt4;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class LZ4FrameInputStream extends FilterInputStream {
    static final String BLOCK_HASH_MISMATCH = "Block checksum mismatch";
    static final String DESCRIPTOR_HASH_MISMATCH = "Stream frame descriptor corrupted";
    static final int MAGIC_SKIPPABLE_BASE = 407710288;
    static final String NOT_SUPPORTED = "Stream unsupported";
    static final String PREMATURE_EOS = "Stream ended prematurely";
    private ByteBuffer buffer;
    private final a1k checksum;
    private byte[] compressedBuffer;
    private final LZ4SafeDecompressor decompressor;
    private long expectedContentSize;
    private LZ4FrameOutputStream.FrameInfo frameInfo;
    private final byte[] headerArray;
    private final ByteBuffer headerBuffer;
    private int maxBlockSize;
    private byte[] rawBuffer;
    private final ByteBuffer readNumberBuff;
    private final boolean readSingleFrame;
    private long totalContentSize;

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, a1k a1kVar, boolean z) throws IOException {
        super(inputStream);
        byte[] bArr = new byte[15];
        this.headerArray = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.headerBuffer = byteBufferWrap.order(byteOrder);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1L;
        this.totalContentSize = 0L;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(byteOrder);
        this.decompressor = lZ4SafeDecompressor;
        this.readSingleFrame = z;
        nextFrameInfo();
    }

    private boolean nextFrameInfo() throws IOException {
        while (true) {
            int i = 0;
            do {
                int i2 = ((FilterInputStream) this).in.read(this.readNumberBuff.array(), i, 4 - i);
                if (i2 < 0) {
                    return false;
                }
                i += i2;
            } while (i < 4);
            int i3 = this.readNumberBuff.getInt(0);
            if (i3 == 407708164) {
                readHeader();
                return true;
            }
            if ((i3 >>> 4) != 25481893) {
                qr7.k(NOT_SUPPORTED);
                return false;
            }
            skippableFrame();
        }
    }

    private void readBlock() throws IOException {
        int i = readInt(((FilterInputStream) this).in);
        boolean z = (Integer.MIN_VALUE & i) == 0;
        int iDecompress = i & Integer.MAX_VALUE;
        if (iDecompress == 0) {
            if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM) && readInt(((FilterInputStream) this).in) != this.frameInfo.currentStreamHash()) {
                qr7.k("Content checksum mismatch");
                return;
            } else if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE) || this.expectedContentSize == this.totalContentSize) {
                this.frameInfo.finish();
                return;
            } else {
                qr7.k("Size check mismatch");
                return;
            }
        }
        byte[] bArr = z ? this.compressedBuffer : this.rawBuffer;
        if (iDecompress > this.maxBlockSize) {
            Locale locale = Locale.ROOT;
            qr7.k(qt4.l("Block size ", iDecompress, this.maxBlockSize, " exceeded max: "));
            return;
        }
        int i2 = 0;
        while (i2 < iDecompress) {
            int i3 = ((FilterInputStream) this).in.read(bArr, i2, iDecompress - i2);
            if (i3 < 0) {
                qr7.k(PREMATURE_EOS);
                return;
            }
            i2 += i3;
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.BLOCK_CHECKSUM)) {
            readInt(((FilterInputStream) this).in);
            throw null;
        }
        if (z) {
            try {
                LZ4SafeDecompressor lZ4SafeDecompressor = this.decompressor;
                byte[] bArr2 = this.rawBuffer;
                iDecompress = lZ4SafeDecompressor.decompress(bArr, 0, iDecompress, bArr2, 0, bArr2.length);
            } catch (LZ4Exception e) {
                throw new IOException(e);
            }
        }
        if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(this.rawBuffer, 0, iDecompress);
        }
        this.totalContentSize += (long) iDecompress;
        this.buffer.limit(iDecompress);
        this.buffer.rewind();
    }

    private void readHeader() throws IOException {
        this.headerBuffer.rewind();
        int i = ((FilterInputStream) this).in.read();
        if (i < 0) {
            throw new IOException(PREMATURE_EOS);
        }
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 < 0) {
            throw new IOException(PREMATURE_EOS);
        }
        byte b = (byte) (i & 255);
        LZ4FrameOutputStream.FLG flgFromByte = LZ4FrameOutputStream.FLG.fromByte(b);
        this.headerBuffer.put(b);
        byte b2 = (byte) (i2 & 255);
        LZ4FrameOutputStream.BD bdFromByte = LZ4FrameOutputStream.BD.fromByte(b2);
        this.headerBuffer.put(b2);
        this.frameInfo = new LZ4FrameOutputStream.FrameInfo(flgFromByte, bdFromByte);
        if (flgFromByte.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE)) {
            long j = readLong(((FilterInputStream) this).in);
            this.expectedContentSize = j;
            this.headerBuffer.putLong(j);
        }
        this.totalContentSize = 0L;
        this.headerBuffer.position();
        throw null;
    }

    private int readInt(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int i2 = inputStream.read(this.readNumberBuff.array(), i, 4 - i);
            if (i2 < 0) {
                qr7.k(PREMATURE_EOS);
                return 0;
            }
            i += i2;
        } while (i < 4);
        return this.readNumberBuff.getInt(0);
    }

    private long readLong(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int i2 = inputStream.read(this.readNumberBuff.array(), i, 8 - i);
            if (i2 < 0) {
                qr7.k(PREMATURE_EOS);
                return 0L;
            }
            i += i2;
        } while (i < 8);
        return this.readNumberBuff.getLong(0);
    }

    private void skippableFrame() throws IOException {
        int i = readInt(((FilterInputStream) this).in);
        byte[] bArr = new byte[1024];
        while (i > 0) {
            int i2 = ((FilterInputStream) this).in.read(bArr, 0, Math.min(i, 1024));
            if (i2 < 0) {
                qr7.k(PREMATURE_EOS);
                return;
            }
            i -= i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.buffer.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
    }

    public long getExpectedContentSize() {
        if (this.readSingleFrame) {
            return this.expectedContentSize;
        }
        c.i("Operation not permitted when multiple frames can be read");
        return 0L;
    }

    public boolean isExpectedContentSizeDefined() {
        return this.readSingleFrame && this.expectedContentSize >= 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            ore.i();
            return 0;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
        int iMin = Math.min(i2, this.buffer.remaining());
        this.buffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return 0L;
            }
            readBlock();
        }
        long jMin = Math.min(j, this.buffer.remaining());
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + ((int) jMin));
        return jMin;
    }

    public LZ4FrameInputStream(InputStream inputStream, boolean z) throws IOException {
        LZ4Factory.fastestInstance().safeDecompressor();
        b1k.z();
        throw null;
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, a1k a1kVar) throws IOException {
        this(inputStream, lZ4SafeDecompressor, a1kVar, false);
    }

    public LZ4FrameInputStream(InputStream inputStream) throws IOException {
        LZ4Factory.fastestInstance().safeDecompressor();
        b1k.z();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
        return this.buffer.get() & 255;
    }
}
