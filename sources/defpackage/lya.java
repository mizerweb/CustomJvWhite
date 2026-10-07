package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lya extends zxa {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lya(int i) {
        super(70, 71);
        this.c = i;
        switch (i) {
            case 1:
                super(20, 21);
                this.d = new bya();
                break;
            case 2:
                super(55, 56);
                this.d = new bya();
                break;
            default:
                this.d = lya.class.getName();
                break;
        }
    }

    @Override // defpackage.zxa
    public void a(id7 id7Var) {
        switch (this.c) {
            case 0:
                String str = (String) this.d;
                gm0.x(str, "start migration 70 to 71", null);
                id7Var.I("\n            CREATE TABLE IF NOT EXISTS `fcm_notifications_new` (\n                `message_id` INTEGER NOT NULL, \n                `type` TEXT NOT NULL, \n                `chat_title` TEXT, \n                `sender_user_name` TEXT, \n                `sender_user_id` INTEGER NOT NULL, \n                `time` INTEGER NOT NULL, \n                `text` TEXT NOT NULL, \n                `push_id` INTEGER NOT NULL, \n                `event_key` TEXT, \n                `large_image_url` TEXT DEFAULT NULL, \n                `fire_m` INTEGER NOT NULL DEFAULT 0, \n                `has_any_error` INTEGER NOT NULL DEFAULT 0, \n                `url` TEXT DEFAULT NULL, \n                `bmd` TEXT DEFAULT NULL,\n                `source` INT NOT NULL,\n                `chat_id` INTEGER NOT NULL, \n                `post_id` INTEGER NOT NULL DEFAULT 0, \n                PRIMARY KEY(`chat_id`, `message_id`, `post_id`)\n                )\n            ");
                id7Var.I("\n            INSERT INTO fcm_notifications_new (\n                chat_id, message_id, type, chat_title, sender_user_name, sender_user_id,\n                time, text, push_id, event_key, large_image_url, fire_m, has_any_error, url, bmd,source\n            )\n            SELECT\n                chat_id, message_id, type, chat_title, sender_user_name, sender_user_id,\n                time, text, push_id, event_key, large_image_url, fire_m, has_any_error, url, bmd,source\n            FROM fcm_notifications\n            ");
                id7Var.I("DROP TABLE fcm_notifications");
                id7Var.I("ALTER TABLE fcm_notifications_new RENAME TO fcm_notifications");
                id7Var.I("\n            CREATE TABLE IF NOT EXISTS fcm_notifications_analytics_new (\n                `push_id` INTEGER NOT NULL,\n                `chat_id` INTEGER NOT NULL,\n                `msg_id` INTEGER NOT NULL,\n                `post_id` INTEGER NOT NULL DEFAULT 0,\n                `analytics_status` INTEGER NOT NULL,\n                `suid` INTEGER,\n                `content_length` INTEGER NOT NULL,\n                `sent_time` INTEGER,\n                `event_key` TEXT,\n                `fcm_sent_time` INTEGER NOT NULL,\n                `received_time` INTEGER NOT NULL,\n                `push_type` TEXT NOT NULL,\n                `time` INTEGER NOT NULL,\n                `created_time` INTEGER NOT NULL,\n                PRIMARY KEY(`chat_id`, `post_id`, `msg_id`)\n            )\n            ");
                id7Var.I("\n            INSERT INTO fcm_notifications_analytics_new (\n                push_id, chat_id, msg_id, analytics_status, suid, content_length,\n                sent_time, event_key, fcm_sent_time, received_time, push_type, time, created_time\n            )\n            SELECT\n                push_id, chat_id, msg_id, analytics_status, suid, content_length,\n                sent_time, event_key, fcm_sent_time, received_time, push_type, time, created_time\n            FROM fcm_notifications_analytics\n            ");
                id7Var.I("DROP TABLE fcm_notifications_analytics");
                id7Var.I("ALTER TABLE fcm_notifications_analytics_new RENAME TO fcm_notifications_analytics");
                id7Var.I("\n            CREATE TABLE IF NOT EXISTS notifications_read_marks_new (\n                `chat_id` INTEGER NOT NULL,\n                `mark` INTEGER NOT NULL,\n                `post_id` INTEGER NOT NULL DEFAULT 0,\n                PRIMARY KEY(`chat_id`, `post_id`)\n            )\n            ");
                id7Var.I("\n            INSERT INTO notifications_read_marks_new (chat_id, mark)\n            SELECT chat_id, mark FROM notifications_read_marks\n            ");
                id7Var.I("DROP TABLE notifications_read_marks");
                id7Var.I("ALTER TABLE notifications_read_marks_new RENAME TO notifications_read_marks");
                id7Var.I("\n            CREATE TABLE IF NOT EXISTS notifications_tracker_messages_new (\n                `chat_id` INTEGER NOT NULL,\n                `message_id` INTEGER NOT NULL,\n                `post_id` INTEGER NOT NULL DEFAULT 0,\n                `time` INTEGER NOT NULL,\n                `push_source` INTEGER DEFAULT NULL,\n                `drop_reason` TEXT,\n                `push_type` TEXT,\n                `show_analytics_sent` INTEGER NOT NULL DEFAULT 0,\n                PRIMARY KEY(`message_id`, `chat_id`, `post_id`)\n            )\n            ");
                id7Var.I("\n            INSERT INTO notifications_tracker_messages_new (\n                chat_id, message_id, time, push_source, drop_reason, push_type, show_analytics_sent\n            )\n            SELECT\n                chat_id, message_id, time, push_source, drop_reason, push_type, show_analytics_sent\n            FROM notifications_tracker_messages\n            ");
                id7Var.I("DROP TABLE notifications_tracker_messages");
                id7Var.I("ALTER TABLE notifications_tracker_messages_new RENAME TO notifications_tracker_messages");
                id7Var.I("\n            CREATE TABLE IF NOT EXISTS fcm_notifications_history_new (\n                `chat_id` INTEGER NOT NULL,\n                `post_id` INTEGER NOT NULL DEFAULT 0,\n                `last_notify_msg_id` INTEGER NOT NULL,\n                PRIMARY KEY(`chat_id`, `post_id`)\n            )\n            ");
                id7Var.I("\n            INSERT INTO fcm_notifications_history_new (chat_id, last_notify_msg_id)\n            SELECT chat_id, last_notify_msg_id FROM fcm_notifications_history\n            ");
                id7Var.I("DROP TABLE fcm_notifications_history");
                id7Var.I("ALTER TABLE fcm_notifications_history_new RENAME TO fcm_notifications_history");
                gm0.x(str, "finish migration 70 to 71", null);
                break;
            default:
                super.a(id7Var);
                break;
        }
    }

    @Override // defpackage.zxa
    public void b(qxe qxeVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 1:
                n1g.u(qxeVar, "DROP TABLE `call_links`");
                ((bya) obj).f(qxeVar);
                break;
            case 2:
                n1g.u(qxeVar, "DROP TABLE `draft_uploads`");
                ((bya) obj).f(qxeVar);
                break;
            default:
                super.b(qxeVar);
                break;
        }
    }
}
