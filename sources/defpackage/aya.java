package defpackage;

import androidx.work.OverwritingInputMerger;
import one.me.sdk.database.migration.DbMigrationException;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class aya extends zxa {
    public static final aya d = new aya(11, 12, 0);
    public static final aya e = new aya(12, 13, 1);
    public static final aya f = new aya(15, 16, 2);
    public static final aya g = new aya(16, 17, 3);
    public static final aya h = new aya(1, 2, 4);
    public static final aya i = new aya(3, 4, 5);
    public static final aya j = new aya(4, 5, 6);
    public static final aya k = new aya(6, 7, 7);
    public static final aya l = new aya(7, 8, 8);
    public static final aya m = new aya(8, 9, 9);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aya(int i2, int i3, int i4) {
        super(i2, i3);
        this.c = i4;
    }

    private final void c(id7 id7Var) {
    }

    private final void d(id7 id7Var) {
    }

    @Override // defpackage.zxa
    public void a(id7 id7Var) {
        switch (this.c) {
            case 0:
                id7Var.I("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                id7Var.I("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                id7Var.I("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                id7Var.I("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                id7Var.I("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                id7Var.I("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                id7Var.I("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                id7Var.I("DROP TABLE `SystemIdInfo`");
                id7Var.I("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case 3:
                id7Var.I(s5h.x0("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                id7Var.I("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                id7Var.I("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                id7Var.I("DROP TABLE `WorkSpec`");
                id7Var.I("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                return;
            case 4:
                id7Var.I("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                id7Var.I("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                id7Var.I("DROP TABLE IF EXISTS alarmInfo");
                id7Var.I("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case 5:
                id7Var.I("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case 6:
                id7Var.I("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                id7Var.I("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 7:
                id7Var.I("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case 8:
                id7Var.I("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case 9:
                id7Var.I("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 10:
                id7Var.l();
                try {
                    id7Var.I("CREATE TABLE IF NOT EXISTS profile (\n    id INTEGER PRIMARY KEY NOT NULL,\n    server_id INTEGER NOT NULL,\n    profile BLOB NOT NULL\n)");
                    id7Var.I("CREATE UNIQUE INDEX index_profile_server_id ON profile(server_id)");
                    id7Var.o0();
                    break;
                } catch (Throwable th) {
                    try {
                        gm0.V("Migration_14_15", "Migration error!", new DbMigrationException("migration_14_15", th));
                    } finally {
                        id7Var.E();
                    }
                    break;
                }
                return;
            case 11:
                id7Var.I("DROP TABLE IF EXISTS battery");
                id7Var.I("CREATE TABLE IF NOT EXISTS `battery` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    `sliceTime` INTEGER NOT NULL,\n    `payload` BLOB NOT NULL\n)");
                return;
            case 12:
                return;
            case 13:
                id7Var.I("CREATE TABLE IF NOT EXISTS `perf_snapshots` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    `sliceTime` INTEGER NOT NULL,\n    `payload` BLOB NOT NULL,\n    `type` INTEGER NOT NULL\n)");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_perf_snapshots_type_sliceTime`\nON `perf_snapshots` (`type`)");
                id7Var.I("INSERT INTO `perf_snapshots` (`id`, `sliceTime`, `payload`, `type`)\nSELECT `id`, `sliceTime`, `payload`, 1\nFROM `battery`");
                id7Var.I("DROP TABLE `battery`");
                return;
            case 14:
                return;
            default:
                super.a(id7Var);
                return;
        }
    }

    @Override // defpackage.zxa
    public void b(qxe qxeVar) {
        switch (this.c) {
            case 15:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `animoji_set` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `icon_lottie_url` TEXT, `update_time` INTEGER NOT NULL, `animoji_ids` TEXT NOT NULL, PRIMARY KEY(`id`))");
                break;
            case 16:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `saved_msg_chat` (`user_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, PRIMARY KEY(`user_id`))");
                n1g.u(qxeVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_saved_msg_chat_chat_id` ON `saved_msg_chat` (`chat_id`)");
                break;
            case 17:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `webapp_biometry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER NOT NULL, `bot_id` INTEGER NOT NULL, `token` TEXT, `access_requested` INTEGER NOT NULL, `access_granted` INTEGER NOT NULL)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_user_id` ON `webapp_biometry` (`user_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_bot_id` ON `webapp_biometry` (`bot_id`)");
                break;
            case 18:
                n1g.u(qxeVar, "ALTER TABLE `stickers` ADD COLUMN `video_url` TEXT DEFAULT NULL");
                break;
            case 19:
                n1g.u(qxeVar, "ALTER TABLE `messages` ADD COLUMN `msg_link_chat_icon_url` TEXT DEFAULT NULL");
                n1g.u(qxeVar, "ALTER TABLE `messages` ADD COLUMN `msg_link_chat_access_type` INTEGER DEFAULT NULL");
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `complain_reasons` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type_id` INTEGER NOT NULL, `complain_reasons` TEXT NOT NULL)");
                break;
            case 21:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `informer_banner` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `is_title_animated` INTEGER NOT NULL, `description` TEXT, `priority` INTEGER NOT NULL, `repeat` INTEGER NOT NULL, `rerun` INTEGER NOT NULL, `animoji_id` INTEGER NOT NULL, `url` TEXT NOT NULL, `type` INTEGER NOT NULL, `click_time` INTEGER NOT NULL DEFAULT 0, `show_time` INTEGER NOT NULL DEFAULT 0, `close_time` INTEGER NOT NULL DEFAULT 0, `show_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
                break;
            case 22:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_new_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_chat_icon_url` TEXT, `msg_link_chat_access_type` INTEGER, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, `reactions_update_time` INTEGER NOT NULL DEFAULT 0, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                n1g.u(qxeVar, "INSERT INTO `_new_messages` (`id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_chat_icon_url`,`msg_link_chat_access_type`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`channel_views`,`channel_forwards`,`view_time`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender`) SELECT `id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_chat_icon_url`,`msg_link_chat_access_type`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`channel_views`,`channel_forwards`,`view_time`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender` FROM `messages`");
                n1g.u(qxeVar, "DROP TABLE `messages`");
                n1g.u(qxeVar, "ALTER TABLE `_new_messages` RENAME TO `messages`");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_reactions_update_time` ON `messages` (`reactions_update_time`)");
                aql.c(qxeVar);
                break;
            case 23:
                n1g.u(qxeVar, "ALTER TABLE `fcm_notifications` ADD COLUMN `url` TEXT DEFAULT NULL");
                break;
            case 24:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `metrics` (`traceId` TEXT NOT NULL, `metricName` TEXT NOT NULL, `lastUpdatedTime` INTEGER NOT NULL, `spanAndPropertiesDump` BLOB NOT NULL, PRIMARY KEY(`traceId`))");
                break;
            case 25:
                n1g.u(qxeVar, "ALTER TABLE `fcm_notifications` ADD COLUMN `bmd` TEXT DEFAULT NULL");
                break;
            case 26:
                n1g.u(qxeVar, "ALTER TABLE `metrics` ADD COLUMN `attempt` INTEGER NOT NULL DEFAULT 0");
                n1g.u(qxeVar, "ALTER TABLE `metrics` ADD COLUMN `isMarkedAsFailed` INTEGER NOT NULL DEFAULT false");
                break;
            case 27:
                n1g.u(qxeVar, "ALTER TABLE `messages` ADD COLUMN `status_in_process` INTEGER NOT NULL DEFAULT 0");
                break;
            case 28:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `battery` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sliceTime` INTEGER NOT NULL, `utime` INTEGER NOT NULL, `stime` INTEGER NOT NULL, `batteryCapacity` INTEGER NOT NULL, `instantAmperage` INTEGER NOT NULL)");
                break;
            case 29:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `organizations` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `parentId` INTEGER, `folderTemplateId` INTEGER, `updateTime` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                break;
            default:
                super.b(qxeVar);
                break;
        }
    }
}
