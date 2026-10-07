package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* JADX INFO: loaded from: classes.dex */
public final class yia implements Closeable, Flushable {
    public static final boolean h;
    public final int a;
    public final int b;
    public final boolean c;
    public final OutputStreamBufferOutput d;
    public MessageBuffer e;
    public int f;
    public CharsetEncoder g;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i = cls.getField("SDK_INT").getInt(cls.getConstructor(null).newInstance(null));
            if (i >= 14 && i < 21) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        h = z;
    }

    public yia(OutputStreamBufferOutput outputStreamBufferOutput, via viaVar) {
        this.d = outputStreamBufferOutput;
        viaVar.getClass();
        this.a = np0.o;
        this.b = 8192;
        this.c = true;
        this.f = 0;
    }

    public final void A(int i) throws IOException {
        if (i < -32) {
            if (i < -32768) {
                o0(i, (byte) -46);
                return;
            } else if (i < -128) {
                t0((byte) -47, (short) i);
                return;
            } else {
                k0((byte) -48, (byte) i);
                return;
            }
        }
        if (i < 128) {
            Y((byte) i);
            return;
        }
        if (i < 256) {
            k0((byte) -52, (byte) i);
        } else if (i < 65536) {
            t0((byte) -51, (short) i);
        } else {
            o0(i, (byte) -50);
        }
    }

    public final void E(long j) throws IOException {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    r0(j, (byte) -45);
                    return;
                } else {
                    o0((int) j, (byte) -46);
                    return;
                }
            }
            if (j < -128) {
                t0((byte) -47, (short) j);
                return;
            } else {
                k0((byte) -48, (byte) j);
                return;
            }
        }
        if (j < 128) {
            Y((byte) j);
            return;
        }
        if (j < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            if (j < 256) {
                k0((byte) -52, (byte) j);
                return;
            } else {
                t0((byte) -51, (short) j);
                return;
            }
        }
        if (j < 4294967296L) {
            o0((int) j, (byte) -50);
        } else {
            r0(j, (byte) -49);
        }
    }

    public final void I(int i) throws IOException {
        if (i < 0) {
            ore.p("map size must be >= 0");
            return;
        }
        if (i < 16) {
            Y((byte) (i | (-128)));
        } else if (i < 65536) {
            t0((byte) -34, (short) i);
        } else {
            o0(i, (byte) -33);
        }
    }

    public final void K(int i) throws IOException {
        if (i < 32) {
            Y((byte) (i | (-96)));
            return;
        }
        if (this.c && i < 256) {
            k0((byte) -39, (byte) i);
        } else if (i < 65536) {
            t0((byte) -38, (short) i);
        } else {
            o0(i, (byte) -37);
        }
    }

    public final void P(String str) throws IOException {
        if (str.length() <= 0) {
            K(0);
            return;
        }
        if (h || str.length() < this.a) {
            W(str);
            return;
        }
        if (str.length() < 256) {
            g((str.length() * 6) + 3);
            int iB = b(this.f + 2, str);
            if (iB >= 0) {
                if (this.c && iB < 256) {
                    MessageBuffer messageBuffer = this.e;
                    int i = this.f;
                    this.f = i + 1;
                    messageBuffer.putByte(i, (byte) -39);
                    MessageBuffer messageBuffer2 = this.e;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    messageBuffer2.putByte(i2, (byte) iB);
                    this.f += iB;
                    return;
                }
                if (iB >= 65536) {
                    ore.p("Unexpected UTF-8 encoder state");
                    return;
                }
                MessageBuffer messageBuffer3 = this.e;
                int i3 = this.f;
                messageBuffer3.putMessageBuffer(i3 + 3, messageBuffer3, i3 + 2, iB);
                MessageBuffer messageBuffer4 = this.e;
                int i4 = this.f;
                this.f = i4 + 1;
                messageBuffer4.putByte(i4, (byte) -38);
                this.e.putShort(this.f, (short) iB);
                this.f = this.f + 2 + iB;
                return;
            }
        } else if (str.length() < 65536) {
            g((str.length() * 6) + 5);
            int iB2 = b(this.f + 3, str);
            if (iB2 >= 0) {
                if (iB2 < 65536) {
                    MessageBuffer messageBuffer5 = this.e;
                    int i5 = this.f;
                    this.f = i5 + 1;
                    messageBuffer5.putByte(i5, (byte) -38);
                    this.e.putShort(this.f, (short) iB2);
                    this.f = this.f + 2 + iB2;
                    return;
                }
                if (iB2 >= 4294967296L) {
                    ore.p("Unexpected UTF-8 encoder state");
                    return;
                }
                MessageBuffer messageBuffer6 = this.e;
                int i6 = this.f;
                messageBuffer6.putMessageBuffer(i6 + 5, messageBuffer6, i6 + 3, iB2);
                MessageBuffer messageBuffer7 = this.e;
                int i7 = this.f;
                this.f = i7 + 1;
                messageBuffer7.putByte(i7, (byte) -37);
                this.e.putInt(this.f, iB2);
                this.f = this.f + 4 + iB2;
                return;
            }
        }
        W(str);
    }

    public final void W(String str) throws IOException {
        byte[] bytes = str.getBytes(xia.a);
        K(bytes.length);
        int length = bytes.length;
        MessageBuffer messageBuffer = this.e;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i = this.f;
            if (size - i >= length && length <= this.b) {
                this.e.putBytes(i, bytes, 0, length);
                this.f += length;
                return;
            }
        }
        flush();
        this.d.add(bytes, 0, length);
    }

    public final void Y(byte b) throws IOException {
        g(1);
        MessageBuffer messageBuffer = this.e;
        int i = this.f;
        this.f = i + 1;
        messageBuffer.putByte(i, b);
    }

    public final int b(int i, String str) {
        if (this.g == null) {
            CharsetEncoder charsetEncoderNewEncoder = xia.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.g = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.g.reset();
        MessageBuffer messageBuffer = this.e;
        ByteBuffer byteBufferSliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i, messageBuffer.size() - i);
        int iPosition = byteBufferSliceAsByteBuffer.position();
        CoderResult coderResultEncode = this.g.encode(CharBuffer.wrap(str), byteBufferSliceAsByteBuffer, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
        if (coderResultEncode.isUnderflow() && !coderResultEncode.isOverflow() && this.g.flush(byteBufferSliceAsByteBuffer).isUnderflow()) {
            return byteBufferSliceAsByteBuffer.position() - iPosition;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStreamBufferOutput outputStreamBufferOutput = this.d;
        try {
            flush();
        } finally {
            outputStreamBufferOutput.close();
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f;
        OutputStreamBufferOutput outputStreamBufferOutput = this.d;
        if (i > 0) {
            outputStreamBufferOutput.writeBuffer(i);
            this.e = null;
            this.f = 0;
        }
        outputStreamBufferOutput.flush();
    }

    public final void g(int i) throws IOException {
        MessageBuffer messageBuffer = this.e;
        OutputStreamBufferOutput outputStreamBufferOutput = this.d;
        if (messageBuffer == null) {
            this.e = outputStreamBufferOutput.next(i);
        } else if (this.f + i >= messageBuffer.size()) {
            outputStreamBufferOutput.writeBuffer(this.f);
            this.e = null;
            this.f = 0;
            this.e = outputStreamBufferOutput.next(i);
        }
    }

    public final void k0(byte b, byte b2) throws IOException {
        g(2);
        MessageBuffer messageBuffer = this.e;
        int i = this.f;
        this.f = i + 1;
        messageBuffer.putByte(i, b);
        MessageBuffer messageBuffer2 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        messageBuffer2.putByte(i2, b2);
    }

    public final void l(int i) throws IOException {
        if (i < 0) {
            ore.p("array size must be >= 0");
            return;
        }
        if (i < 16) {
            Y((byte) (i | (-112)));
        } else if (i < 65536) {
            t0((byte) -36, (short) i);
        } else {
            o0(i, (byte) -35);
        }
    }

    public final void o0(int i, byte b) throws IOException {
        g(5);
        MessageBuffer messageBuffer = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        messageBuffer.putByte(i2, b);
        this.e.putInt(this.f, i);
        this.f += 4;
    }

    public final void r0(long j, byte b) throws IOException {
        g(9);
        MessageBuffer messageBuffer = this.e;
        int i = this.f;
        this.f = i + 1;
        messageBuffer.putByte(i, b);
        this.e.putLong(this.f, j);
        this.f += 8;
    }

    public final void t0(byte b, short s) throws IOException {
        g(3);
        MessageBuffer messageBuffer = this.e;
        int i = this.f;
        this.f = i + 1;
        messageBuffer.putByte(i, b);
        this.e.putShort(this.f, s);
        this.f += 2;
    }

    public final void y(boolean z) throws IOException {
        Y(z ? (byte) -61 : (byte) -62);
    }
}
