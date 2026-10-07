package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class uc7 extends ds0 {
    public final rui c;
    public final long d;
    public final String e = uc7.class.getName();

    public uc7(rui ruiVar, long j) {
        this.c = ruiVar;
        this.d = j;
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final au3 a(Bitmap bitmap, k2d k2dVar) {
        rui ruiVar = this.c;
        c70 c70VarG = ruiVar.g();
        if (c70VarG == null) {
            gm0.Y(this.e, "No video collage");
            return k2dVar.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), null, false);
        }
        int i = c70VarG.c;
        int i2 = c70VarG.d;
        int duration = ((int) ruiVar.getDuration()) / i2;
        int width = bitmap.getWidth() / i;
        int i3 = ((int) this.d) / duration;
        int i4 = i2 - 1;
        int iMin = (Math.min(i3, i4) % width) * i;
        int iMin2 = Math.min(i3, i4) / width;
        int i5 = c70VarG.b;
        return k2dVar.b(bitmap, iMin, iMin2 * i5, c70VarG.c, i5, null, false);
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final v71 b() {
        StringBuilder sbS = qt4.s(this.c.k(), "videoId=", ", millis=");
        sbS.append(this.d);
        return new l6g(sbS.toString());
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final String getName() {
        return uc7.class.getSimpleName();
    }
}
