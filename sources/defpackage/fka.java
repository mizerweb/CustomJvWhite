package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.conn.params.ConnManagerParams;
import org.msgpack.core.MessageFormatException;
import org.msgpack.core.MessageInsufficientBufferException;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessageNeverUsedFormatException;
import org.msgpack.core.MessagePackException;
import org.msgpack.core.MessageSizeException;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeException;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.MessageBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class fka implements Closeable {
    public static final MessageBuffer o = MessageBuffer.wrap(new byte[0]);
    public final boolean a;
    public final boolean b;
    public final CodingErrorAction c;
    public final CodingErrorAction d;
    public final int e;
    public final int f;
    public final ArrayBufferInput g;
    public int i;
    public int k;
    public StringBuilder l;
    public CharsetDecoder m;
    public CharBuffer n;
    public MessageBuffer h = o;
    public final MessageBuffer j = MessageBuffer.allocate(8);

    public fka(ArrayBufferInput arrayBufferInput, wia wiaVar) {
        this.g = arrayBufferInput;
        wiaVar.getClass();
        this.a = true;
        this.b = true;
        this.c = wiaVar.a;
        this.d = wiaVar.b;
        this.e = wiaVar.c;
        this.f = wiaVar.e;
    }

    public static MessageIntegerOverflowException I(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(((long) (i & Integer.MAX_VALUE)) + 2147483648L));
    }

    public static MessageIntegerOverflowException K(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
    }

    public static MessagePackException r0(byte b, String str) {
        uga ugaVar = uga.X[b & 255];
        if (ugaVar == uga.NEVER_USED) {
            return new MessageNeverUsedFormatException(c0a.o("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"));
        }
        String strH = nbh.H(ugaVar.a());
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, strH.substring(0, 1) + strH.substring(1).toLowerCase(), Byte.valueOf(b)));
    }

    public final void A(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.c == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.d == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    public final int D0() {
        byte b = readByte();
        if (lvb.u0(b)) {
            return b;
        }
        switch (b) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int i = readInt();
                if (i >= 0) {
                    return i;
                }
                throw I(i);
            case -49:
                long j = readLong();
                if (j < 0 || j > 2147483647L) {
                    throw K(j);
                }
                return (int) j;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long j2 = readLong();
                if (j2 < -2147483648L || j2 > 2147483647L) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(j2));
                }
                return (int) j2;
            default:
                throw r0(b, "Integer");
        }
    }

    public final void E() throws IOException {
        MessageBuffer next = this.g.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.h.size();
        this.h = next;
        this.i = 0;
    }

    public final long I0() {
        byte b = readByte();
        if (lvb.u0(b)) {
            return b;
        }
        switch (b) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int i = readInt();
                return i < 0 ? ((long) (i & Integer.MAX_VALUE)) + 2147483648L : i;
            case -49:
                long j = readLong();
                if (j >= 0) {
                    return j;
                }
                throw K(j);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw r0(b, "Integer");
        }
    }

    public final MessageBuffer P(int i) throws IOException {
        int size = this.h.size();
        int i2 = this.i;
        int i3 = size - i2;
        if (i3 >= i) {
            this.k = i2;
            this.i = i2 + i;
            return this.h;
        }
        MessageBuffer messageBuffer = this.j;
        if (i3 > 0) {
            messageBuffer.putMessageBuffer(0, this.h, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            E();
            int size2 = this.h.size();
            MessageBuffer messageBuffer2 = this.h;
            if (size2 >= i) {
                messageBuffer.putMessageBuffer(i3, messageBuffer2, 0, i);
                this.i = i;
                this.k = 0;
                return messageBuffer;
            }
            messageBuffer.putMessageBuffer(i3, messageBuffer2, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    public final int P0() {
        byte b = readByte();
        if ((b & (-16)) == -128) {
            return b & 15;
        }
        if (b == -34) {
            return W();
        }
        if (b == -33) {
            return Y();
        }
        throw r0(b, "Map");
    }

    public final int R0() {
        int iW;
        byte b = readByte();
        if ((b & (-32)) == -96) {
            return b & 31;
        }
        int iW2 = -1;
        switch (b) {
            case -39:
                iW = readByte() & 255;
                break;
            case -38:
                iW = W();
                break;
            case -37:
                iW = Y();
                break;
            default:
                iW = -1;
                break;
        }
        if (iW >= 0) {
            return iW;
        }
        if (this.b) {
            switch (b) {
                case -60:
                    iW2 = readByte() & 255;
                    break;
                case -59:
                    iW2 = W();
                    break;
                case -58:
                    iW2 = Y();
                    break;
            }
            if (iW2 >= 0) {
                return iW2;
            }
        }
        throw r0(b, "String");
    }

    public final String S0() throws IOException {
        int iRemaining;
        MessageBuffer messageBuffer;
        int iR0 = R0();
        if (iR0 == 0) {
            return "";
        }
        int i = this.e;
        if (iR0 > i) {
            throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", Integer.valueOf(i), Integer.valueOf(iR0)));
        }
        CharsetDecoder charsetDecoder = this.m;
        if (charsetDecoder == null) {
            this.n = CharBuffer.allocate(this.f);
            this.m = xia.a.newDecoder().onMalformedInput(this.c).onUnmappableCharacter(this.d);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb = this.l;
        if (sb == null) {
            this.l = new StringBuilder();
        } else {
            sb.setLength(0);
        }
        if (this.h.size() - this.i >= iR0) {
            return b(iR0);
        }
        while (iR0 > 0) {
            try {
                int size = this.h.size();
                int i2 = this.i;
                int i3 = size - i2;
                if (i3 >= iR0) {
                    this.l.append(b(iR0));
                    break;
                }
                if (i3 == 0) {
                    E();
                } else {
                    ByteBuffer byteBufferSliceAsByteBuffer = this.h.sliceAsByteBuffer(i2, i3);
                    int iPosition = byteBufferSliceAsByteBuffer.position();
                    this.n.clear();
                    CoderResult coderResultDecode = this.m.decode(byteBufferSliceAsByteBuffer, this.n, false);
                    int iPosition2 = byteBufferSliceAsByteBuffer.position() - iPosition;
                    this.i += iPosition2;
                    iR0 -= iPosition2;
                    this.l.append(this.n.flip());
                    if (coderResultDecode.isError()) {
                        A(coderResultDecode);
                    }
                    if (coderResultDecode.isUnderflow() && iPosition2 < i3) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Integer.numberOfLeadingZeros((~(this.h.getByte(this.i) & 255)) << 24));
                        MessageBuffer messageBuffer2 = this.h;
                        messageBuffer2.getBytes(this.i, messageBuffer2.size() - this.i, byteBufferAllocate);
                        while (true) {
                            E();
                            iRemaining = byteBufferAllocate.remaining();
                            int size2 = this.h.size();
                            messageBuffer = this.h;
                            if (size2 >= iRemaining) {
                                break;
                            }
                            messageBuffer.getBytes(0, messageBuffer.size(), byteBufferAllocate);
                            this.i = this.h.size();
                        }
                        messageBuffer.getBytes(0, iRemaining, byteBufferAllocate);
                        this.i = iRemaining;
                        byteBufferAllocate.position(0);
                        this.n.clear();
                        CoderResult coderResultDecode2 = this.m.decode(byteBufferAllocate, this.n, false);
                        if (coderResultDecode2.isError()) {
                            A(coderResultDecode2);
                        }
                        if (coderResultDecode2.isOverflow() || (coderResultDecode2.isUnderflow() && byteBufferAllocate.position() < byteBufferAllocate.limit())) {
                            try {
                                coderResultDecode2.throwException();
                                throw new MessageFormatException("Unexpected UTF-8 multibyte sequence");
                            } catch (Exception e) {
                                throw new MessageFormatException("Unexpected UTF-8 multibyte sequence", e);
                            }
                        }
                        iR0 -= byteBufferAllocate.limit();
                        this.l.append(this.n.flip());
                    }
                }
            } catch (CharacterCodingException e2) {
                throw new MessageStringCodingException(e2);
            }
        }
        return this.l.toString();
    }

    public final q1 T0() throws IOException {
        BigInteger bigIntegerValueOf;
        double d;
        di6 di6Var;
        di6 di6Var2;
        uga ugaVarY = y();
        int i = 0;
        switch (qt4.D(ugaVarY.a())) {
            case 0:
                readByte();
                return r98.a;
            case 1:
                return v0() ? o88.b : o88.c;
            case 2:
                if (ugaVarY != uga.UINT64) {
                    return new e98(I0());
                }
                byte b = readByte();
                if (lvb.u0(b)) {
                    bigIntegerValueOf = BigInteger.valueOf(b);
                } else {
                    switch (b) {
                        case -52:
                            bigIntegerValueOf = BigInteger.valueOf(readByte() & 255);
                            break;
                        case -51:
                            bigIntegerValueOf = BigInteger.valueOf(readShort() & 65535);
                            break;
                        case -50:
                            int i2 = readInt();
                            bigIntegerValueOf = i2 >= 0 ? BigInteger.valueOf(i2) : BigInteger.valueOf(((long) (i2 & Integer.MAX_VALUE)) + 2147483648L);
                            break;
                        case -49:
                            long j = readLong();
                            bigIntegerValueOf = j >= 0 ? BigInteger.valueOf(j) : BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63);
                            break;
                        case -48:
                            bigIntegerValueOf = BigInteger.valueOf(readByte());
                            break;
                        case -47:
                            bigIntegerValueOf = BigInteger.valueOf(readShort());
                            break;
                        case -46:
                            bigIntegerValueOf = BigInteger.valueOf(readInt());
                            break;
                        case -45:
                            bigIntegerValueOf = BigInteger.valueOf(readLong());
                            break;
                        default:
                            throw r0(b, "Integer");
                    }
                }
                return new m88(bigIntegerValueOf);
            case 3:
                byte b2 = readByte();
                if (b2 == -54) {
                    d = P(4).getFloat(this.k);
                } else {
                    if (b2 != -53) {
                        throw r0(b2, "Float");
                    }
                    d = P(8).getDouble(this.k);
                }
                return new t88(d);
            case 4:
                return new w98(k0(R0()));
            case 5:
                return new n88(k0(u0()));
            case 6:
                int iT0 = t0();
                gri[] griVarArr = new gri[iT0];
                while (i < iT0) {
                    griVarArr[i] = T0();
                    i++;
                }
                return iT0 == 0 ? k88.b : new k88(griVarArr);
            case 7:
                int iP0 = P0() * 2;
                gri[] griVarArr2 = new gri[iP0];
                while (i < iP0) {
                    griVarArr2[i] = T0();
                    griVarArr2[i + 1] = T0();
                    i += 2;
                }
                return iP0 == 0 ? k98.b : new k98(griVarArr2);
            case 8:
                byte b3 = readByte();
                switch (b3) {
                    case -57:
                        MessageBuffer messageBufferP = P(2);
                        di6Var = new di6(messageBufferP.getByte(this.k) & 255, messageBufferP.getByte(this.k + 1));
                        return new w88(di6Var.b(), k0(di6Var.a()));
                    case -56:
                        MessageBuffer messageBufferP2 = P(3);
                        di6Var2 = new di6(messageBufferP2.getShort(this.k) & 65535, messageBufferP2.getByte(this.k + 2));
                        di6Var = di6Var2;
                        return new w88(di6Var.b(), k0(di6Var.a()));
                    case -55:
                        MessageBuffer messageBufferP3 = P(5);
                        int i3 = messageBufferP3.getInt(this.k);
                        if (i3 < 0) {
                            throw new MessageSizeException();
                        }
                        di6Var2 = new di6(i3, messageBufferP3.getByte(this.k + 4));
                        di6Var = di6Var2;
                        return new w88(di6Var.b(), k0(di6Var.a()));
                    default:
                        switch (b3) {
                            case -44:
                                di6Var2 = new di6(1, readByte());
                                di6Var = di6Var2;
                                return new w88(di6Var.b(), k0(di6Var.a()));
                            case -43:
                                di6Var = new di6(2, readByte());
                                return new w88(di6Var.b(), k0(di6Var.a()));
                            case -42:
                                di6Var = new di6(4, readByte());
                                return new w88(di6Var.b(), k0(di6Var.a()));
                            case -41:
                                di6Var = new di6(8, readByte());
                                return new w88(di6Var.b(), k0(di6Var.a()));
                            case -40:
                                di6Var = new di6(16, readByte());
                                return new w88(di6Var.b(), k0(di6Var.a()));
                            default:
                                throw r0(b3, "Ext");
                        }
                }
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public final int W() {
        return readShort() & 65535;
    }

    public final int Y() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new MessageSizeException();
    }

    public final String b(int i) {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        if (this.c == codingErrorAction && this.d == codingErrorAction && this.h.hasArray()) {
            String str = new String(this.h.array(), this.h.arrayOffset() + this.i, i, xia.a);
            this.i += i;
            return str;
        }
        try {
            CharBuffer charBufferDecode = this.m.decode(this.h.sliceAsByteBuffer(this.i, i));
            this.i += i;
            return charBufferDecode.toString();
        } catch (CharacterCodingException e) {
            throw new MessageStringCodingException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.h = o;
        this.i = 0;
        this.g.close();
    }

    public final byte[] k0(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int size = this.h.size();
            int i3 = this.i;
            int i4 = size - i3;
            MessageBuffer messageBuffer = this.h;
            if (i4 >= i) {
                messageBuffer.getBytes(i3, bArr, i2, i);
                this.i += i;
                return bArr;
            }
            messageBuffer.getBytes(i3, bArr, i2, i4);
            i2 += i4;
            i -= i4;
            this.i += i4;
            E();
        }
    }

    public final boolean l() throws IOException {
        while (this.h.size() <= this.i) {
            MessageBuffer next = this.g.next();
            if (next == null) {
                return false;
            }
            this.h.size();
            this.h = next;
            this.i = 0;
        }
        return true;
    }

    public final void o0(int i) throws IOException {
        while (true) {
            int size = this.h.size();
            int i2 = this.i;
            int i3 = size - i2;
            if (i3 >= i) {
                this.i = i2 + i;
                return;
            } else {
                this.i = i2 + i3;
                i -= i3;
                E();
            }
        }
    }

    public final byte readByte() {
        int size = this.h.size();
        int i = this.i;
        if (size > i) {
            byte b = this.h.getByte(i);
            this.i++;
            return b;
        }
        E();
        if (this.h.size() <= 0) {
            return readByte();
        }
        byte b2 = this.h.getByte(0);
        this.i = 1;
        return b2;
    }

    public final int readInt() {
        return P(4).getInt(this.k);
    }

    public final long readLong() {
        return P(8).getLong(this.k);
    }

    public final short readShort() {
        return P(2).getShort(this.k);
    }

    public final int t0() {
        byte b = readByte();
        if ((b & (-16)) == -112) {
            return b & 15;
        }
        if (b == -36) {
            return W();
        }
        if (b == -35) {
            return Y();
        }
        throw r0(b, "Array");
    }

    public final int u0() {
        int iW;
        byte b = readByte();
        if ((b & (-32)) == -96) {
            return b & 31;
        }
        int iW2 = -1;
        switch (b) {
            case -60:
                iW = readByte() & 255;
                break;
            case -59:
                iW = W();
                break;
            case -58:
                iW = Y();
                break;
            default:
                iW = -1;
                break;
        }
        if (iW >= 0) {
            return iW;
        }
        if (this.a) {
            switch (b) {
                case -39:
                    iW2 = readByte() & 255;
                    break;
                case -38:
                    iW2 = W();
                    break;
                case -37:
                    iW2 = Y();
                    break;
            }
            if (iW2 >= 0) {
                return iW2;
            }
        }
        throw r0(b, "Binary");
    }

    public final boolean v0() {
        byte b = readByte();
        if (b == -62) {
            return false;
        }
        if (b == -61) {
            return true;
        }
        throw r0(b, "boolean");
    }

    public final void x() {
        int iW;
        int iW2;
        int i = 1;
        while (i > 0) {
            byte b = readByte();
            switch (uga.X[b & 255].ordinal()) {
                case 1:
                    iW = b & 15;
                    iW2 = iW * 2;
                    i += iW2;
                    i--;
                    break;
                case 2:
                    i += b & 15;
                    i--;
                    break;
                case 3:
                    o0(b & 31);
                    i--;
                    break;
                case 4:
                case 6:
                default:
                    i--;
                    break;
                case 5:
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                case 7:
                case 28:
                    o0(readByte() & 255);
                    i--;
                    break;
                case 8:
                case 29:
                    o0(W());
                    i--;
                    break;
                case 9:
                case 30:
                    o0(Y());
                    i--;
                    break;
                case 10:
                    o0((readByte() & 255) + 1);
                    i--;
                    break;
                case 11:
                    o0(W() + 1);
                    i--;
                    break;
                case 12:
                    o0(Y() + 1);
                    i--;
                    break;
                case 13:
                case 17:
                case 21:
                    o0(4);
                    i--;
                    break;
                case 14:
                case 18:
                case 22:
                    o0(8);
                    i--;
                    break;
                case 15:
                case 19:
                    o0(1);
                    i--;
                    break;
                case 16:
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    o0(2);
                    i--;
                    break;
                case 23:
                    o0(2);
                    i--;
                    break;
                case 24:
                    o0(3);
                    i--;
                    break;
                case 25:
                    o0(5);
                    i--;
                    break;
                case 26:
                    o0(9);
                    i--;
                    break;
                case 27:
                    o0(17);
                    i--;
                    break;
                case 31:
                    iW2 = W();
                    i += iW2;
                    i--;
                    break;
                case 32:
                    iW2 = Y();
                    i += iW2;
                    i--;
                    break;
                case 33:
                    iW = W();
                    iW2 = iW * 2;
                    i += iW2;
                    i--;
                    break;
                case 34:
                    iW = Y();
                    iW2 = iW * 2;
                    i += iW2;
                    i--;
                    break;
            }
        }
    }

    public final byte x0() {
        long j;
        byte b = readByte();
        if (lvb.u0(b)) {
            return b;
        }
        switch (b) {
            case -52:
                byte b2 = readByte();
                if (b2 >= 0) {
                    return b2;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(b2 & 255));
            case -51:
                short s = readShort();
                if (s < 0 || s > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(s & 65535));
                }
                return (byte) s;
            case -50:
                int i = readInt();
                if (i < 0 || i > 127) {
                    throw I(i);
                }
                return (byte) i;
            case -49:
                j = readLong();
                if (j < 0 || j > 127) {
                    throw K(j);
                }
                break;
            case -48:
                return readByte();
            case -47:
                short s2 = readShort();
                if (s2 < -128 || s2 > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(s2));
                }
                return (byte) s2;
            case -46:
                int i2 = readInt();
                if (i2 < -128 || i2 > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(i2));
                }
                return (byte) i2;
            case -45:
                j = readLong();
                if (j < -128 || j > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(j));
                }
                break;
            default:
                throw r0(b, "Integer");
        }
        return (byte) j;
    }

    public final uga y() {
        if (!l()) {
            throw new MessageInsufficientBufferException();
        }
        return uga.X[this.h.getByte(this.i) & 255];
    }

    public final float z0() {
        byte b = readByte();
        if (b == -54) {
            return P(4).getFloat(this.k);
        }
        if (b == -53) {
            return (float) P(8).getDouble(this.k);
        }
        throw r0(b, "Float");
    }
}
