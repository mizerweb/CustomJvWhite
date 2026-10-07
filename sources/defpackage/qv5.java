package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum qv5 {
    DO_NOT_DISTURB_MODE("do_not_disturb_mode"),
    CHAT_MUTED("chat_muted"),
    NOTIFICATIONS_READ_MARK("notif_read_mark"),
    SKIPPED_NOTIF_MESSAGE("skipped_notif_message"),
    SHOWN_FROM_SOCKET("shown_from_socket"),
    NOTIFICATIONS_LIMIT("notifications_limit"),
    MESSAGES_LIMIT("messages_limit"),
    NOTIFICATION_CHANNEL_DISABLED("notif_channel_disabled"),
    NOTIFICATION_GROUP_CHANNEL_DISABLED("notif_group_channel_disabled"),
    SYSTEM_APP_NOTIF_DISABLED("system_app_notif_disabled"),
    SHOWED_FROM_ANOTHER_PROVIDER("showed_from_another_provider"),
    SYSTEM_DO_NOT_DISTURB_MODE("system_do_not_disturb_mode"),
    ACTIVE_CALL_LIMIT("active_call_limit"),
    CALL_APP_LOGIC("call_app_logic");

    public static final qv5[] b = values();
    public final String a;

    qv5(String str) {
        this.a = str;
    }
}
