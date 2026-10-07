package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ale extends ble {
    public final l4e f;
    public final rj5 g;

    public ale(b87 b87Var, c98 c98Var, lcf lcfVar, ArrayList arrayList) {
        super(b87Var, c98Var, lcfVar, arrayList);
        Uri.parse(((ws0) c98Var.get(0)).a);
        long j = lcfVar.e;
        l4e l4eVar = j <= 0 ? null : new l4e(null, lcfVar.d, j);
        this.f = l4eVar;
        this.g = l4eVar == null ? new rj5(25, new l4e(null, 0L, -1L)) : null;
    }

    @Override // defpackage.ble
    public final String a() {
        return null;
    }

    @Override // defpackage.ble
    public final x15 c() {
        return this.g;
    }

    @Override // defpackage.ble
    public final l4e e() {
        return this.f;
    }
}
