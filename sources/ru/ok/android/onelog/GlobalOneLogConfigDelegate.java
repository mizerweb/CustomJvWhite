package ru.ok.android.onelog;

import defpackage.no;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class GlobalOneLogConfigDelegate implements OneLogConfig.Delegate {
    @Override // ru.ok.android.onelog.OneLogConfig.Delegate
    public void attachApiClient(String str, Provider<no> provider) {
        OneLogImpl.getInstance().attachApiClient(str, provider);
    }

    @Override // ru.ok.android.onelog.OneLogConfig.Delegate
    public void setMaxUploadFileSize(long j) {
        OneLogImpl.getInstance().setMaxUploadFileSize(j);
    }
}
