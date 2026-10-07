package org.webrtc;

import android.graphics.Matrix;
import defpackage.ore;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final Long compactParticipantId;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        default int getBufferType() {
            return 0;
        }

        int getHeight();

        int getWidth();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();

        I420Buffer toI420();
    }

    public interface I420Buffer extends Buffer {
        @Override // org.webrtc.VideoFrame.Buffer
        default int getBufferType() {
            return 1;
        }

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {

        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        default TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2) {
            throw new UnsupportedOperationException("Not implemented");
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        default int getUnscaledHeight() {
            return getHeight();
        }

        default int getUnscaledWidth() {
            return getWidth();
        }
    }

    public VideoFrame(Buffer buffer, int i, long j, Long l) {
        if (buffer == null) {
            ore.p("buffer not allowed to be null");
            throw null;
        }
        if (i % 90 != 0) {
            ore.p("rotation must be a multiple of 90");
            throw null;
        }
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
        this.compactParticipantId = l;
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public Long getCompactParticipantId() {
        return this.compactParticipantId;
    }

    public int getRotatedHeight() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getHeight() : buffer.getWidth();
    }

    public int getRotatedWidth() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getWidth() : buffer.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        this(buffer, i, j, null);
    }
}
