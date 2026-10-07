package com.vk.push.core.utils;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/app/NotificationManager;", "", "channelId", "Landroid/app/NotificationChannel;", "getNotificationChannelCompat", "(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;", "", "getNotificationChannelImportanceCompat", "(Landroid/app/NotificationManager;Ljava/lang/String;)Ljava/lang/Integer;", "channel", "Lsbi;", "createNotificationChannelCompat", "(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class NotificationManagerExtensionsKt {
    public static final void createNotificationChannelCompat(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static final NotificationChannel getNotificationChannelCompat(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static final Integer getNotificationChannelImportanceCompat(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            return Integer.valueOf(notificationChannel.getImportance());
        }
        return null;
    }
}
