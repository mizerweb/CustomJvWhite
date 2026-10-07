package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final class ng9 extends ar0 {
    public final List a = xw3.P0("class", "connection_type", MLFeatureConfigProviderBase.URL_KEY);
    public final int b = 7;

    @Override // defpackage.ar0
    public final List b() {
        return this.a;
    }

    @Override // defpackage.ar0
    public final boolean c(b9b b9bVar, List list) {
        boolean zB = b9bVar.b("warm_start");
        int i = this.b;
        if (zB) {
            i--;
        }
        if (b9bVar.b("cached_dns")) {
            i--;
        }
        return i == list.size();
    }
}
