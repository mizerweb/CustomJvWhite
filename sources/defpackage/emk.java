package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes2.dex */
public final class emk extends a {
    @Override // defpackage.fo
    public final int i() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof llk ? (llk) iInterfaceQueryLocalInterface : new llk(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final do6[] n() {
        return tqk.b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean s() {
        return true;
    }
}
