package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mc2 implements jme {
    public final jd2 a;
    public final CaptureRequest b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final ArrayMap f;
    public final boolean g;
    public final fle h;
    public final long i;

    public mc2(jd2 jd2Var, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, fle fleVar, long j) {
        this.a = jd2Var;
        this.b = captureRequest;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = arrayMap;
        this.g = z;
        this.h = fleVar;
        this.i = j;
    }

    @Override // defpackage.jme
    public final long E() {
        return this.i;
    }

    @Override // defpackage.jme
    public final fle K() {
        return this.h;
    }

    @Override // defpackage.ndi
    public final Object W(sr3 sr3Var) {
        if (sr3Var.equals(zfe.a(CaptureRequest.class))) {
            return this.b;
        }
        boolean zEquals = sr3Var.equals(zfe.a(CameraCaptureSession.class));
        jd2 jd2Var = this.a;
        if (zEquals) {
            Object objW = jd2Var.W(zfe.a(CameraCaptureSession.class));
            if (objW != null) {
                return objW;
            }
        } else if (sr3Var.equals(zfe.a(f82.D()))) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object objW2 = jd2Var.W(zfe.a(f82.D()));
                if (objW2 != null) {
                    return objW2;
                }
            } else {
                ore.k("Check failed.");
            }
        }
        return null;
    }

    @Override // defpackage.mwa
    public final Object a(kwa kwaVar) {
        Map map = this.h.c;
        Map map2 = this.e;
        if (map2.containsKey(kwaVar)) {
            return map2.get(kwaVar);
        }
        if (map.containsKey(kwaVar)) {
            return map.get(kwaVar);
        }
        Map map3 = this.d;
        return map3.containsKey(kwaVar) ? map3.get(kwaVar) : this.c.get(kwaVar);
    }

    @Override // defpackage.mwa
    public final Object b(kwa kwaVar, ghh ghhVar) {
        Object objA = a(kwaVar);
        return objA == null ? ghhVar : objA;
    }

    @Override // defpackage.jme
    public final Map t0() {
        return this.f;
    }

    @Override // defpackage.jme
    public final boolean x0() {
        return this.g;
    }
}
