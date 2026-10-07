package defpackage;

import android.media.MediaCodecInfo;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f75 implements r89, la5, gv9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f75(Object obj, int i, int i2) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.gv9
    public void c(e38 e38Var, int i) {
        e38Var.p(((iv9) this.c).a.c, i, this.a, this.b);
    }

    @Override // defpackage.la5
    public int d(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.c;
        int i = this.a;
        int i2 = this.b;
        Size sizeG = y86.g(mediaCodecInfo, str, i, i2);
        if (sizeG == null) {
            return Integer.MAX_VALUE;
        }
        return Math.abs((i * i2) - (sizeG.getHeight() * sizeG.getWidth()));
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((xf) obj).B((wf) this.c, this.a, this.b);
    }
}
