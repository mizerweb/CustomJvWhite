package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mrf implements orf {
    public final int a = 4;

    @Override // defpackage.orf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.settings_devices_recycler_header_viewtype;
    }
}
