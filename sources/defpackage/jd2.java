package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface jd2 extends ndi, AutoCloseable {
    boolean F0();

    boolean J();

    Integer L0(CaptureRequest captureRequest, vb2 vb2Var);

    Integer O(ArrayList arrayList, vb2 vb2Var);

    boolean Q(List list);

    Integer f(CaptureRequest captureRequest, vb2 vb2Var);

    Surface getInputSurface();

    Integer m0(ArrayList arrayList, vb2 vb2Var);

    le2 n();
}
