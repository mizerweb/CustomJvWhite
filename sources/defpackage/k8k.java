package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class k8k extends o8k {
    public int a;

    public k8k(int i) {
        this.a = i;
    }

    @Override // defpackage.o8k
    public final int a() {
        return this.a;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[this.a]);
    }

    @Override // defpackage.o8k
    public final boolean h() {
        return false;
    }

    public final String toString() {
        return c0a.k(this.a, "Padding(", ")");
    }
}
