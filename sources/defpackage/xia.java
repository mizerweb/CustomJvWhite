package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.buffer.ArrayBufferInput;

/* JADX INFO: loaded from: classes.dex */
public abstract class xia {
    public static final Charset a = Charset.forName("UTF-8");
    public static final via b = new via();
    public static final wia c;

    static {
        wia wiaVar = new wia();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        wiaVar.a = codingErrorAction;
        wiaVar.b = codingErrorAction;
        wiaVar.c = Integer.MAX_VALUE;
        wiaVar.d = 8192;
        wiaVar.e = 8192;
        c = wiaVar;
    }

    public static fka a(byte[] bArr) {
        wia wiaVar = c;
        wiaVar.getClass();
        return new fka(new ArrayBufferInput(bArr), wiaVar);
    }
}
