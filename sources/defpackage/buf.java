package defpackage;

import one.me.settings.media.SettingsMediaScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buf implements rtf {
    public final /* synthetic */ SettingsMediaScreen a;

    public buf(SettingsMediaScreen settingsMediaScreen) {
        this.a = settingsMediaScreen;
    }

    @Override // defpackage.rtf
    public final void c(long j) {
        zv8[] zv8VarArr = SettingsMediaScreen.h;
        this.a.o1().G((int) j);
    }

    @Override // defpackage.rtf
    public final void l(long j, boolean z) {
        zv8[] zv8VarArr = SettingsMediaScreen.h;
        euf eufVarO1 = this.a.o1();
        if (((int) j) != R.id.oneme_settings_media_item_load_in_roaming) {
            eufVarO1.getClass();
            return;
        }
        eufVarO1.getClass();
        eufVarO1.w.B(eufVarO1, euf.z[5], a8j.t(eufVarO1, null, new in(eufVarO1, z, null, 5), 1));
    }
}
