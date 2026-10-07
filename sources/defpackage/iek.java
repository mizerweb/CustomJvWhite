package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class iek extends o9b {
    public ByteBuffer a;

    public final String toString() {
        return c0a.k(this.a.limit() - this.a.position(), "DataFrame[", "]");
    }
}
