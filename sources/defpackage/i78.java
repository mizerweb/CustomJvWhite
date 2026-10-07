package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class i78 implements k78 {
    public final /* synthetic */ int a = 0;
    public final ByteBuffer b;
    public final int c;

    public i78(int i, ByteBuffer byteBuffer) {
        this.c = i;
        this.b = byteBuffer;
    }

    @Override // defpackage.k78
    public final int D() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // defpackage.k78
    public final int P() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    @Override // defpackage.k78
    public final ByteBuffer getBuffer() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public i78(ByteBuffer byteBuffer, int i) {
        this.b = byteBuffer;
        this.c = i;
    }
}
