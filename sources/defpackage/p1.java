package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageStringCodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 extends q1 implements gri {
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;
    public volatile String b;
    public volatile CharacterCodingException c;

    public p1(byte[] bArr) {
        this.a = bArr;
    }

    public static void B(StringBuilder sb, String str) {
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ') {
                switch (cCharAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    case 11:
                    default:
                        E(sb, cCharAt);
                        break;
                    case '\f':
                        sb.append("\\f");
                        break;
                    case '\r':
                        sb.append("\\r");
                        break;
                }
            } else if (cCharAt <= 127) {
                if (cCharAt == '\"') {
                    sb.append("\\\"");
                } else if (cCharAt != '\\') {
                    sb.append(cCharAt);
                } else {
                    sb.append("\\\\");
                }
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                sb.append(cCharAt);
            } else {
                E(sb, cCharAt);
            }
        }
        sb.append("\"");
    }

    public static void E(StringBuilder sb, int i) {
        sb.append("\\u");
        char[] cArr = d;
        sb.append(cArr[(i >> 12) & 15]);
        sb.append(cArr[(i >> 8) & 15]);
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    public final String C() {
        if (this.b == null) {
            D();
        }
        if (this.c == null) {
            return this.b;
        }
        throw new MessageStringCodingException(this.c);
    }

    public final void D() {
        synchronized (this.a) {
            if (this.b != null) {
                return;
            }
            try {
                CharsetDecoder charsetDecoderNewDecoder = xia.a.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                this.b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
            } catch (CharacterCodingException e) {
                try {
                    CharsetDecoder charsetDecoderNewDecoder2 = xia.a.newDecoder();
                    CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
                    this.b = charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
                    this.c = e;
                } catch (CharacterCodingException e2) {
                    throw new MessageStringCodingException(e2);
                }
            }
        }
    }

    @Override // defpackage.gri
    public final String toJson() {
        StringBuilder sb = new StringBuilder();
        B(sb, toString());
        return sb.toString();
    }

    public final String toString() {
        if (this.b == null) {
            D();
        }
        return this.b;
    }
}
