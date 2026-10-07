package ru.ok.android.externcalls.sdk.di;

import defpackage.gsb;
import defpackage.mo;
import defpackage.nxe;
import defpackage.yo;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/di/ApiModule;", "", "Lnxe;", "getRxApiClient", "()Lnxe;", "Lyo;", "getDeviceIdProvider", "()Lyo;", "Lmo;", "getAppKeyProvider", "()Lmo;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "getOkApiServiceInternal", "()Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Lgsb;", "getOkApiHolder", "()Lgsb;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ApiModule {
    mo getAppKeyProvider();

    yo getDeviceIdProvider();

    gsb getOkApiHolder();

    OkApiServiceInternal getOkApiServiceInternal();

    nxe getRxApiClient();
}
