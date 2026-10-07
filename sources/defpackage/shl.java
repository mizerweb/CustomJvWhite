package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class shl {
    public static final bh0 a(CaptureRequest.Key key) {
        return new bh0("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static final void b(int i, int i2, fif fifVar) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(fifVar.f(i4));
            }
            i3 >>>= 1;
        }
        String strI = fifVar.i();
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? nbh.y(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strI, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strI + "', but they were missing", null);
    }

    public static final LinkedHashMap c(t94 t94Var) {
        Object objI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (bh0 bh0Var : t94Var.c()) {
            Object obj = bh0Var.c;
            CaptureRequest.Key key = obj instanceof CaptureRequest.Key ? (CaptureRequest.Key) obj : null;
            if (key != null && (objI = t94Var.i(bh0Var)) != null) {
                linkedHashMap.put(key, objI);
            }
        }
        return linkedHashMap;
    }
}
