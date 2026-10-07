package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public interface fb0 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean c();

    ByteBuffer d();

    void e(db0 db0Var);

    void f(ByteBuffer byteBuffer);

    cb0 g(cb0 cb0Var);

    void h();

    default long i(long j) {
        return j;
    }

    boolean isActive();

    void reset();
}
