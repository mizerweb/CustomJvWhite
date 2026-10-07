package com.vk.push.core.utils;

import android.app.NotificationManager;
import android.content.Context;
import defpackage.cqk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0005\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0002*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Landroid/content/Context;", "", "enabled", "Lsbi;", "setComponentEnabled", "(Landroid/content/Context;Z)V", "areNotificationsEnabled", "(Landroid/content/Context;)Z", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ContextExtensionsKt {
    public static final boolean areNotificationsEnabled(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            return notificationManager.areNotificationsEnabled();
        }
        return false;
    }

    public static final /* synthetic */ <T> void setComponentEnabled(Context context, boolean z) {
        try {
            if (z) {
                context.getPackageManager();
                cqk.F();
                throw null;
            }
            context.getPackageManager();
            cqk.F();
            throw null;
        } catch (RuntimeException unused) {
        }
    }
}
