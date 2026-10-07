package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class idl {
    public static void d(int i, String str) {
        if (i > 0) {
            return;
        }
        ore.p(qt4.j(i, str, " > 0 required but it was "));
    }

    public abstract void a(ByteBuffer byteBuffer);

    public abstract void b();

    public abstract int c(ByteBuffer byteBuffer, boolean z);
}
