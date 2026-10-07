package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class mxa extends cli {
    public final Size u;
    public final Object v;
    public imf w;
    public i88 x;

    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    public mxa(kg2 kg2Var, lxa lxaVar, fo5 fo5Var) {
        Size[] outputSizes;
        Size[] sizeArr;
        super(lxaVar);
        Size size = nxa.a;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qb2) kg2Var.b).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Size size2 = null;
        if (streamConfigurationMap == null) {
            if (tvj.f(6, "CXCP")) {
                Log.e("CXCP", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            }
            outputSizes = null;
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size size3 = kbh.a;
            if (((RepeatingStreamConstraintForVideoRecordingQuirk) uk5.a(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
                sizeArr = outputSizes;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Size size4 : outputSizes) {
                    if (kbh.b.compare(size4, kbh.a) >= 0) {
                        arrayList.add(size4);
                    }
                }
                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
            }
            if (sizeArr.length != 0) {
                outputSizes = sizeArr;
            } else if (tvj.f(5, "CXCP")) {
                Log.w("CXCP", "No supported output size list, fallback to current list");
            }
            if (outputSizes.length > 1) {
                xa8 xa8Var = new xa8(8);
                if (outputSizes.length > 1) {
                    Arrays.sort(outputSizes, xa8Var);
                }
            }
            Size sizeC = fo5Var.c();
            long jMin = Math.min(307200L, ((long) sizeC.getWidth()) * ((long) sizeC.getHeight()));
            int length = outputSizes.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Size size5 = outputSizes[i];
                    long width = ((long) size5.getWidth()) * ((long) size5.getHeight());
                    if (width == jMin) {
                        size = size5;
                    } else if (width <= jMin) {
                        i++;
                        size2 = size5;
                    } else if (size2 != null) {
                        size = size2;
                    }
                }
                if (size2 == null) {
                    size = outputSizes[0];
                } else {
                    size = size2;
                }
            }
        }
        this.u = size;
        this.v = new Object();
    }

    @Override // defpackage.cli
    public final yi0 B(yi0 yi0Var, yi0 yi0Var2) {
        Size size = this.u;
        H(Collections.singletonList(K(size).c()));
        tw5 tw5VarB = yi0Var.b();
        tw5VarB.a = size;
        return tw5VarB.j();
    }

    @Override // defpackage.cli
    public final void C() {
        imf imfVar = this.w;
        if (imfVar != null) {
            imfVar.b();
        }
        this.w = null;
        synchronized (this.v) {
            try {
                i88 i88Var = this.x;
                if (i88Var != null) {
                    i88Var.a();
                }
                this.x = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i88 J(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        i88 i88Var = this.x;
        if (i88Var != null) {
            i88Var.a();
        }
        i88 i88Var2 = new i88(surface, size, this.i.getInputFormat());
        this.x = i88Var2;
        o9b.g(i88Var2.e).b(new su6(surface, 29, surfaceTexture), zjl.a());
        return i88Var2;
    }

    public final hmf K(Size size) {
        i88 i88VarJ;
        synchronized (this.v) {
            i88VarJ = J(size);
        }
        imf imfVar = this.w;
        if (imfVar != null) {
            imfVar.b();
        }
        imf imfVar2 = new imf(new o48(this, size, 1));
        this.w = imfVar2;
        hmf hmfVarD = hmf.d(new lxa(), size);
        hmfVarD.b.b = 1;
        hmfVarD.b(i88VarJ, fx5.d, -1);
        hmfVarD.f = imfVar2;
        return hmfVarD;
    }

    @Override // defpackage.cli
    public final cmi h(boolean z, fmi fmiVar) {
        return new lxa();
    }

    @Override // defpackage.cli
    public final bmi n(t94 t94Var) {
        return new lu8();
    }
}
