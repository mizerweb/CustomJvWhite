package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface le2 extends ndi {
    CaptureRequest.Builder A(int i);

    boolean D0(ArrayList arrayList, id2 id2Var);

    boolean I(rg8 rg8Var, ArrayList arrayList, id2 id2Var);

    void I0();

    boolean P(bi6 bi6Var);

    boolean P0(InputConfiguration inputConfiguration, ArrayList arrayList, id2 id2Var);

    String Y();

    CaptureRequest.Builder k0(TotalCaptureResult totalCaptureResult);

    void o0(int i);

    boolean u0(omf omfVar);

    boolean v0(ArrayList arrayList, id2 id2Var);

    void y();

    boolean z0(List list, id2 id2Var);
}
