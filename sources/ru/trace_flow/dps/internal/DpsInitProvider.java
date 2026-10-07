package ru.trace_flow.dps.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import defpackage.dni;
import defpackage.gt3;
import defpackage.jt5;
import defpackage.mk5;
import defpackage.np0;
import defpackage.t95;
import defpackage.wk8;

/* JADX INFO: loaded from: classes3.dex */
public final class DpsInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Application application;
        String string;
        Application application2;
        Context context = getContext();
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application2 = (Application) applicationContext;
        } else {
            application = 0;
        }
        if (application == 0) {
            application = application2;
            return false;
        }
        if (context.getResources().getBoolean(context.getResources().getIdentifier(wk8.b("3b5c71e286012f6483042854bd183252962e39558313305e86"), wk8.b("ad3fe0d2b08f50c1"), context.getPackageName()))) {
            try {
                application = application2;
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), np0.m).metaData;
                if (bundle != null && (string = bundle.getString(wk8.b("ee30a31062d61e9a62c2538b4fc55c81678d549e638d71be59fc7bab49"))) != null && string.length() != 0) {
                    String string2 = bundle.getString(wk8.b("150dd2a5d7a72361d7b36e70fab4617ad2fc6965d6fc5846e080525ce1"));
                    String string3 = bundle.getString(wk8.b("bfd0a6ee9cd3fecb9cc7b3dab1c0bcd09988b4cf9d8893f3a7e39eebb1f095edbdef9ff1"));
                    jt5.a aVarT = new jt5.a().t(application);
                    if (application instanceof gt3) {
                        aVarT.w((gt3) application);
                    }
                    if (application instanceof dni) {
                        aVarT.L((dni) application);
                    }
                    if (application instanceof mk5) {
                        aVarT.y((mk5) application);
                    } else {
                        aVarT.y(new t95(application));
                    }
                    jt5.a aVarR = aVarT.r(string);
                    if (string2 != null) {
                        aVarR.K(string2);
                    }
                    if (string3 != null) {
                        aVarR.u(string3);
                    }
                    aVarR.e();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        application = application2;
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
