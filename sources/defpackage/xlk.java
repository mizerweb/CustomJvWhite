package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class xlk extends a {
    public final olh y;

    public xlk(Context context, Looper looper, s80 s80Var, olh olhVar, skk skkVar, skk skkVar2) {
        super(context, looper, 270, s80Var, skkVar, skkVar2, 0);
        this.y = olhVar;
    }

    @Override // defpackage.fo
    public final int i() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof rlk ? (rlk) iInterfaceQueryLocalInterface : new rlk(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final do6[] n() {
        return rx8.o;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle o() {
        olh olhVar = this.y;
        olhVar.getClass();
        Bundle bundle = new Bundle();
        String str = olhVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean s() {
        return true;
    }
}
