package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class eh5 extends r6g implements w7h {
    public final d8h n;

    public eh5(d8h d8hVar) {
        super(new a8h[2], new po2[2]);
        int i = this.g;
        u55[] u55VarArr = this.e;
        lvb.b0(i == u55VarArr.length);
        for (u55 u55Var : u55VarArr) {
            u55Var.s(1024);
        }
        this.n = d8hVar;
    }

    @Override // defpackage.w7h
    public final void a(long j) {
    }

    @Override // defpackage.r6g
    public final u55 f() {
        return new a8h(1);
    }

    @Override // defpackage.r6g
    public final v55 g() {
        return new po2(this, 2);
    }

    @Override // defpackage.r6g
    public final DecoderException h(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.r6g
    public final DecoderException i(u55 u55Var, v55 v55Var, boolean z) {
        a8h a8hVar = (a8h) u55Var;
        po2 po2Var = (po2) v55Var;
        try {
            ByteBuffer byteBuffer = a8hVar.d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            d8h d8hVar = this.n;
            if (z) {
                d8hVar.reset();
            }
            po2Var.s(a8hVar.f, d8hVar.h(0, bArrArray, iLimit), a8hVar.i);
            po2Var.c = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }
}
