package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class j78 extends w97 {
    public final k78[] d;
    public final int e;
    public final int f;

    public j78(l78 l78Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(l78Var);
        this.d = new k78[]{new i78(i, byteBuffer), new i78(byteBuffer2, i), new i78(byteBuffer3, i)};
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.w97, defpackage.l78
    public final k78[] e0() {
        return this.d;
    }

    @Override // defpackage.w97, defpackage.l78
    public final int getHeight() {
        return this.f;
    }

    @Override // defpackage.w97, defpackage.l78
    public final int getWidth() {
        return this.e;
    }
}
