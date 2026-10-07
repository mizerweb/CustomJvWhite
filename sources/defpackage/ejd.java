package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ejd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fjd b;
    public final /* synthetic */ mi0 c;

    public /* synthetic */ ejd(fjd fjdVar, mi0 mi0Var, int i) {
        this.a = i;
        this.b = fjdVar;
        this.c = mi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i = this.a;
        mi0 mi0Var = this.c;
        fjd fjdVar = this.b;
        switch (i) {
            case 0:
                hjd hjdVar = mi0Var.a;
                try {
                    hi0 hi0Var = (hi0) fjdVar.c.apply(mi0Var);
                    int i2 = hi0Var.c;
                    qyj.h("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + i2, i2 == 35 || i2 == 256 || i2 == 4101);
                    zjl.d().execute(new i7b(hjdVar, 20, (Bitmap) fjdVar.i.n(hi0Var)));
                    return;
                } catch (Exception e) {
                    mi0Var.b.close();
                    tvj.d("ProcessingNode", "process postview input packet failed.", e);
                    return;
                }
            case 1:
                ejd ejdVar = new ejd(fjdVar, mi0Var, 2);
                cqk.f("CX:".concat("processInputPacket"));
                try {
                    ejdVar.run();
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                hjd hjdVar2 = mi0Var.a;
                try {
                    fjdVar.b.d.size();
                    mi0Var.a.getClass();
                    zjl.d().execute(new i7b(hjdVar2, 21, fjdVar.a(mi0Var)));
                    return;
                } catch (ImageCaptureException e2) {
                    zjl.d().execute(new i7b(hjdVar2, 22, e2));
                    return;
                } catch (OutOfMemoryError e3) {
                    zjl.d().execute(new i7b(hjdVar2, 22, new ImageCaptureException(0, "Processing failed due to low memory.", e3)));
                    return;
                } catch (RuntimeException e4) {
                    zjl.d().execute(new i7b(hjdVar2, 22, new ImageCaptureException(0, "Processing failed.", e4)));
                    return;
                }
        }
    }
}
