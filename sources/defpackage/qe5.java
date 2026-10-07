package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes2.dex */
public final class qe5 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ ve5 a;

    public qe5(ve5 ve5Var) {
        this.a = ve5Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        ohc ohcVar = ve5.k;
        this.a.h();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        ohc ohcVar = ve5.k;
        this.a.h();
    }
}
