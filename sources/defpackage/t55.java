package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class t55 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = vqi.a;
        Locale locale = Locale.US;
        StringBuilder sbP = qv1.p("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        qt4.x(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbP);
        qt4.x(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbP);
        qt4.x(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbP);
        qt4.x(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbP);
        c0a.w(sbP, j, "\n videoFrameProcessingOffsetCount=", i11);
        sbP.append("\n}");
        return sbP.toString();
    }
}
