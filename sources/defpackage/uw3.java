package defpackage;

import android.text.BoringLayout;
import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uw3 implements Supplier {
    public final /* synthetic */ int a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ArrayList();
            default:
                return new BoringLayout.Metrics();
        }
    }
}
