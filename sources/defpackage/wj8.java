package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wj8 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw InvalidProtocolBufferException.f();
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ore.n(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static d c(Object obj, Object obj2) {
        d dVar = (d) ((a) obj);
        mj7 mj7Var = (mj7) dVar.d(5);
        mj7Var.c();
        mj7.d(mj7Var.b, dVar);
        a aVar = (a) obj2;
        if (!mj7Var.a.getClass().isInstance(aVar)) {
            ore.p("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        mj7Var.c();
        mj7.d(mj7Var.b, (d) aVar);
        return mj7Var.b();
    }
}
