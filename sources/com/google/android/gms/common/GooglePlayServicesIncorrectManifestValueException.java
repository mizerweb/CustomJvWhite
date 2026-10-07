package com.google.android.gms.common;

import com.vk.push.core.base.AidlException;
import defpackage.go7;
import defpackage.zo5;

/* JADX INFO: loaded from: classes2.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        int i2 = go7.a;
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + AidlException.SDK_IS_NOT_INITIALIZED + String.valueOf(i).length() + 194);
        zo5.C(i2, i, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", sb);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(sb.toString());
    }
}
