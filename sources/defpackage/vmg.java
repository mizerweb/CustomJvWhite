package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final class vmg extends kih {
    public String c;

    public vmg(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        if (str.equals(MLFeatureConfigProviderBase.URL_KEY)) {
            this.c = fkaVar.S0();
        } else {
            fkaVar.x();
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.o("{url='", this.c, "'}");
    }
}
