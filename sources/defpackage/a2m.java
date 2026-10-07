package defpackage;

import android.util.Range;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a2m {
    public static ljf a;

    public static ljf a() {
        return new ljf(15);
    }

    public static final void b(nf2 nf2Var, ec1 ec1Var, rj5 rj5Var) {
        ljf ljfVar = a;
        if (ljfVar == null) {
            ore.k("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        pf2 pf2VarB = ((dh2) ljfVar.b).b(nf2Var.g());
        ja jaVar = new ja(pf2VarB.j(), td2.a);
        uvc uvcVar = uvc.d;
        mi2 mi2Var = new mi2(pf2VarB, null, jaVar, null, uvcVar, uvcVar, (je2) ljfVar.c, (h6f) ljfVar.e, (fmi) ljfVar.d);
        b9j b9jVar = (b9j) ec1Var.c;
        synchronized (mi2Var.m) {
            mi2Var.h = b9jVar;
        }
        List list = (List) ec1Var.d;
        synchronized (mi2Var.m) {
            mi2Var.i = list;
        }
        int iF = ec1Var.f();
        synchronized (mi2Var.m) {
            mi2Var.j = iF;
        }
        Range range = (Range) ec1Var.e;
        synchronized (mi2Var.m) {
            mi2Var.k = range;
        }
        List list2 = (List) ec1Var.h;
        tvj.a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + rj5Var);
        synchronized (mi2Var.m) {
            ka kaVar = mi2Var.a;
            pd2 pd2Var = mi2Var.l;
            kaVar.f(pd2Var);
            ka kaVar2 = mi2Var.b;
            if (kaVar2 != null) {
                kaVar2.f(pd2Var);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(mi2Var.e);
            linkedHashSet.addAll(list2);
            HashMap mapL = mi2.l(linkedHashSet, rj5Var);
            try {
                try {
                    mi2Var.s(linkedHashSet, mi2Var.b != null);
                    mi2.B(mapL);
                } catch (IllegalArgumentException e) {
                    throw new CameraUseCaseAdapter$CameraException(e);
                }
            } catch (Throwable th) {
                mi2.B(mapL);
                throw th;
            }
        }
    }
}
