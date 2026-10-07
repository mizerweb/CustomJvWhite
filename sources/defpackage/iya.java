package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iya extends zxa {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iya(int i) {
        super(44, 45);
        this.c = i;
        switch (i) {
            case 1:
                super(15, 16);
                this.d = new bya();
                break;
            case 2:
                super(37, 38);
                this.d = new bya();
                break;
            case 3:
                super(19, 20);
                this.d = new khb(14);
                break;
            default:
                this.d = iya.class.getName();
                break;
        }
    }

    @Override // defpackage.zxa
    public void a(id7 id7Var) {
        switch (this.c) {
            case 0:
                String str = (String) this.d;
                gm0.x(str, "start migration 44 to 45", null);
                id7Var.I("\n            CREATE TABLE IF NOT EXISTS informer_banner_new (\n                id TEXT NOT NULL,\n                title TEXT NOT NULL,\n                settings INTEGER NOT NULL DEFAULT 0,\n                description TEXT,\n                priority INTEGER NOT NULL,\n                repeat INTEGER NOT NULL,\n                rerun INTEGER NOT NULL,\n                animoji_id INTEGER,\n                url TEXT,\n                type INTEGER NOT NULL,\n                click_time INTEGER NOT NULL DEFAULT 0,\n                show_time INTEGER NOT NULL DEFAULT 0,\n                close_time INTEGER NOT NULL DEFAULT 0,\n                show_count INTEGER NOT NULL DEFAULT 0,\n                PRIMARY KEY(id)\n            )\n        ");
                id7Var.I("\n            INSERT INTO informer_banner_new (\n                id, title, settings, description, priority, repeat, rerun,\n                animoji_id, url, type, click_time, show_time, close_time, show_count\n            )\n            SELECT \n                id, title, settings, description, priority, repeat, rerun,\n                animoji_id, url, type, click_time, show_time, close_time, show_count\n            FROM informer_banner\n        ");
                id7Var.I("DROP TABLE informer_banner");
                id7Var.I("ALTER TABLE informer_banner_new RENAME TO informer_banner");
                gm0.x(str, "finish migration 44 to 45", null);
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
                n1g.u(qxeVar, "ALTER TABLE `chat_folder` ADD COLUMN `updateTime` INTEGER NOT NULL DEFAULT 0");
                n1g.u(qxeVar, "ALTER TABLE `chat_folder` ADD COLUMN `favorites` BLOB DEFAULT NULL");
                n1g.u(qxeVar, "ALTER TABLE `chat_folder` ADD COLUMN `templateId` INTEGER DEFAULT NULL");
                n1g.u(qxeVar, "ALTER TABLE `chat_folder` ADD COLUMN `sourceId` INTEGER DEFAULT NULL");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_new_chat_folder` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `order` INTEGER NOT NULL, `emoji` TEXT DEFAULT NULL, `filters` TEXT NOT NULL, `isHiddenForAllFolder` INTEGER NOT NULL, `elements` BLOB DEFAULT NULL, `filterSubjects` BLOB DEFAULT NULL, `widgets` BLOB DEFAULT NULL, `options` BLOB DEFAULT NULL, `updateTime` INTEGER NOT NULL DEFAULT 0, `favorites` BLOB DEFAULT NULL, `templateId` INTEGER DEFAULT NULL, `sourceId` INTEGER DEFAULT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "INSERT INTO `_new_chat_folder` (`id`,`title`,`order`,`emoji`,`filters`,`isHiddenForAllFolder`,`elements`,`filterSubjects`,`widgets`,`options`) SELECT `id`,`title`,`order`,`emoji`,`filters`,`isHiddenForAllFolder`,`elements`,`filterSubjects`,`widgets`,`options` FROM `chat_folder`");
                n1g.u(qxeVar, "DROP TABLE `chat_folder`");
                n1g.u(qxeVar, "ALTER TABLE `_new_chat_folder` RENAME TO `chat_folder`");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_chat_folder_filters` ON `chat_folder` (`filters`)");
                ((bya) obj).f(qxeVar);
                break;
            case 2:
                n1g.u(qxeVar, "DROP TABLE `default_emoji`");
                ((bya) obj).f(qxeVar);
                break;
            case 3:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                n1g.u(qxeVar, "DROP TABLE `WorkSpec`");
                n1g.u(qxeVar, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                ((khb) obj).f(qxeVar);
                break;
            default:
                super.b(qxeVar);
                break;
        }
    }
}
