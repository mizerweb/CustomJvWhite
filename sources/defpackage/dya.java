package defpackage;

import android.database.Cursor;
import one.me.sdk.database.migration.DbMigrationException;

/* JADX INFO: loaded from: classes.dex */
public final class dya extends zxa {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dya(int i) {
        super(35, 36);
        this.c = i;
        switch (i) {
            case 3:
                super(14, 15);
                this.d = new ghb(14);
                break;
            default:
                this.d = new bya();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [long] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [long] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.zxa
    public void a(id7 id7Var) {
        a4c a4cVar;
        String name;
        boolean zB;
        String strT;
        Throwable th;
        switch (this.c) {
            case 0:
                String str = "CREATE UNIQUE INDEX IF NOT EXISTS `index_contacts_server_id` ON `contacts` (`server_id`)";
                ?? r4 = "ALTER TABLE `_new_contacts` RENAME TO `contacts`";
                je9 je9Var = je9.d;
                je9 je9Var2 = je9.e;
                ghb ghbVar = ew5.b;
                long jNanoTime = System.nanoTime();
                lw5 lw5Var = lw5.NANOSECONDS;
                long jP = qe7.P(jNanoTime, lw5Var);
                str = "finish migration ";
                gm0.n(dya.class.getName(), "start migration");
                try {
                    try {
                        Cursor cursorY = id7Var.Y("SELECT COUNT(*) FROM contacts");
                        try {
                            cursorY.moveToFirst();
                            r4 = jP;
                            try {
                                int i = cursorY.getInt(0);
                                try {
                                    cursorY.close();
                                    a4c a4cVar2 = gm0.f;
                                    if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, "Migration29to30", "count before = " + i, null);
                                    }
                                    id7Var.I("CREATE TABLE IF NOT EXISTS `_new_contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `presence_seen` INTEGER NOT NULL, `presence_status` INTEGER NOT NULL DEFAULT 0, `data` BLOB NOT NULL)");
                                    id7Var.I("INSERT INTO `_new_contacts` SELECT * FROM `contacts` WHERE `id` IN (SELECT MAX(`id`) FROM `contacts` GROUP BY `server_id`)");
                                    Cursor cursorY2 = id7Var.Y("SELECT COUNT(*) FROM _new_contacts");
                                    try {
                                        cursorY2.moveToFirst();
                                        int i2 = cursorY2.getInt(0);
                                        a4c a4cVar3 = gm0.f;
                                        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                                            try {
                                                a4cVar3.c(je9Var2, "Migration29to30", "_new_contacts count = " + i2, null);
                                                break;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                try {
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    rx8.n(cursorY2, th);
                                                    throw th3;
                                                }
                                            }
                                        }
                                        cursorY2.close();
                                        id7Var.I("DROP TABLE `contacts`");
                                        id7Var.I("ALTER TABLE `_new_contacts` RENAME TO `contacts`");
                                        id7Var.I("CREATE UNIQUE INDEX IF NOT EXISTS `index_contacts_server_id` ON `contacts` (`server_id`)");
                                        Cursor cursorY3 = id7Var.Y("SELECT COUNT(*) FROM contacts");
                                        try {
                                            cursorY3.moveToFirst();
                                            int i3 = cursorY3.getInt(0);
                                            cursorY3.close();
                                            a4c a4cVar4 = gm0.f;
                                            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                                                a4cVar4.c(je9Var2, "Migration29to30", "countBefore=" + i + ", countAfter=" + i3, null);
                                            }
                                            id7Var.I("CREATE TABLE IF NOT EXISTS `presence` (`contactServerId` INTEGER NOT NULL, `seen` INTEGER NOT NULL, `status` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`contactServerId`))");
                                            id7Var.I("INSERT INTO `presence` (`contactServerId`,`seen`,`status`) SELECT `server_id`,`presence_seen`,`presence_status` FROM `contacts`");
                                            id7Var.I("CREATE TABLE IF NOT EXISTS `_new_contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `data` BLOB NOT NULL)");
                                            id7Var.I("INSERT INTO `_new_contacts` (`id`,`server_id`,`data`) SELECT `id`,`server_id`,`data` FROM `contacts`");
                                            id7Var.I("DROP TABLE `contacts`");
                                            id7Var.I("ALTER TABLE `_new_contacts` RENAME TO `contacts`");
                                            id7Var.I("CREATE UNIQUE INDEX IF NOT EXISTS `index_contacts_server_id` ON `contacts` (`server_id`)");
                                            name = dya.class.getName();
                                            a4c a4cVar5 = gm0.f;
                                            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                                                strT = ew5.t(ew5.o(qe7.P(System.nanoTime(), lw5Var), r4));
                                                str = str;
                                                a4cVar5.c(je9Var, name, str.concat(strT), null);
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th4) {
                                            str = str;
                                            r4 = r4;
                                            try {
                                                throw th4;
                                            } catch (Throwable th5) {
                                                rx8.n(cursorY3, th4);
                                                throw th5;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    str = str;
                                    r4 = r4;
                                    try {
                                        gm0.V("Migration29to30", "fail", new DbMigrationException("migration_29_30", th));
                                        ((eh9) this.d).b();
                                        name = dya.class.getName();
                                        a4cVar = gm0.f;
                                        if (a4cVar == null) {
                                            return;
                                        }
                                        if (!zB) {
                                            return;
                                        }
                                        ghb ghbVar2 = ew5.b;
                                        strT = ew5.t(ew5.o(qe7.P(System.nanoTime(), lw5Var), r4));
                                    } finally {
                                        String name2 = dya.class.getName();
                                        a4cVar = gm0.f;
                                        if (a4cVar != null && a4cVar.b(je9Var)) {
                                            ghb ghbVar3 = ew5.b;
                                            a4cVar.c(je9Var, name2, str.concat(ew5.t(ew5.o(qe7.P(System.nanoTime(), lw5Var), r4))), null);
                                        }
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                r4 = r4;
                                str = str;
                                Throwable th9 = th;
                                try {
                                    throw th9;
                                } catch (Throwable th10) {
                                    rx8.n(cursorY, th9);
                                    throw th10;
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            r4 = jP;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        r4 = jP;
                        str = str;
                    }
                } catch (Throwable th13) {
                    th = th13;
                }
                break;
            default:
                super.a(id7Var);
                return;
        }
    }

    @Override // defpackage.zxa
    public void b(qxe qxeVar) {
        syd sydVar;
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 1:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_notifications_tracker_messages` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `drop_reason` TEXT, `push_type` TEXT, `show_analytics_sent` INTEGER NOT NULL DEFAULT 0, `push_source` INTEGER DEFAULT NULL, PRIMARY KEY(`message_id`, `chat_id`))");
                n1g.u(qxeVar, "INSERT INTO `_notifications_tracker_messages`(`chat_id`,`message_id`,`time`,`drop_reason`,`push_type`,`show_analytics_sent`) SELECT `chat_id`,`message_id`,`time`,`drop_reason`,`push_type`,`show_analytics_sent` FROM `notifications_tracker_messages`");
                n1g.u(qxeVar, "DROP TABLE `notifications_tracker_messages`");
                n1g.u(qxeVar, "ALTER TABLE `_notifications_tracker_messages` RENAME TO `notifications_tracker_messages`");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_fcm_notifications` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `chat_title` TEXT, `sender_user_name` TEXT, `sender_user_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `text` TEXT NOT NULL, `push_id` INTEGER NOT NULL, `event_key` TEXT, `large_image_url` TEXT DEFAULT NULL, `fire_m` INTEGER NOT NULL DEFAULT 0, `has_any_error` INTEGER NOT NULL DEFAULT 0, `url` TEXT DEFAULT NULL, `bmd` TEXT DEFAULT NULL, `source` INT NOT NULL, PRIMARY KEY(`chat_id`, `message_id`))");
                ((wxb) ((ny8) obj).getValue()).getClass();
                int iOrdinal = ((j51) wxb.b.getValue()).ordinal();
                if (iOrdinal == 0) {
                    sydVar = syd.GCM;
                } else if (iOrdinal != 1) {
                    ore.o();
                } else {
                    sydVar = syd.HUAWEI;
                }
                n1g.u(qxeVar, "INSERT INTO `_fcm_notifications` (`chat_id`, `message_id`, `type`, `chat_title`, `sender_user_name`, `sender_user_id`, `time`, `text`, `push_id`, `event_key`, `large_image_url`, `fire_m`, `has_any_error`, `url`, `bmd`,`source`) SELECT `chat_id`, `message_id`, `type`, `chat_title`, `sender_user_name`, `sender_user_id`, `time`, `text`, `push_id`, `event_key`, `large_image_url`, `fire_m`, `has_any_error`, `url`, `bmd`, " + lml.a(sydVar) + " FROM `fcm_notifications`");
                n1g.u(qxeVar, "DROP TABLE `fcm_notifications`");
                n1g.u(qxeVar, "ALTER TABLE `_fcm_notifications` RENAME TO `fcm_notifications`");
                break;
            case 2:
                n1g.u(qxeVar, "ALTER TABLE `informer_banner` ADD COLUMN `settings` INTEGER NOT NULL DEFAULT 0");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_new_informer_banner` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `settings` INTEGER NOT NULL DEFAULT 0, `description` TEXT, `priority` INTEGER NOT NULL, `repeat` INTEGER NOT NULL, `rerun` INTEGER NOT NULL, `animoji_id` INTEGER NOT NULL, `url` TEXT NOT NULL, `type` INTEGER NOT NULL, `click_time` INTEGER NOT NULL DEFAULT 0, `show_time` INTEGER NOT NULL DEFAULT 0, `close_time` INTEGER NOT NULL DEFAULT 0, `show_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "INSERT INTO `_new_informer_banner` (`id`,`title`,`description`,`priority`,`repeat`,`rerun`,`animoji_id`,`url`,`type`,`click_time`,`show_time`,`close_time`,`show_count`) SELECT `id`,`title`,`description`,`priority`,`repeat`,`rerun`,`animoji_id`,`url`,`type`,`click_time`,`show_time`,`close_time`,`show_count` FROM `informer_banner`");
                n1g.u(qxeVar, "DROP TABLE `informer_banner`");
                n1g.u(qxeVar, "ALTER TABLE `_new_informer_banner` RENAME TO `informer_banner`");
                ((bya) obj).f(qxeVar);
                break;
            case 3:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                n1g.u(qxeVar, "DROP TABLE `WorkSpec`");
                n1g.u(qxeVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                ((ghb) obj).f(qxeVar);
                break;
            default:
                super.b(qxeVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dya(eh9 eh9Var) {
        super(29, 30);
        this.c = 0;
        this.d = eh9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dya(ny8 ny8Var) {
        super(68, 69);
        this.c = 1;
        this.d = ny8Var;
    }
}
