package defpackage;

import androidx.work.OverwritingInputMerger;

/* JADX INFO: loaded from: classes.dex */
public final class kya extends zxa {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kya(int i) {
        super(17, 18);
        this.c = i;
        switch (i) {
            case 2:
                super(54, 55);
                this.d = new bya();
                break;
            default:
                this.d = new bya();
                break;
        }
    }

    public static void c(qxe qxeVar) {
        n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `WorkerQueueItem_new_WorkSpec` (`uuid` TEXT NOT NULL, `uniqueWorkName` TEXT NOT NULL, `existingWorkPolicy` TEXT NOT NULL, `tags` TEXT NOT NULL, `time` INTEGER NOT NULL, `state` INTEGER NOT NULL DEFAULT 0, `work_spec_id` TEXT NOT NULL, `work_spec_state` INTEGER NOT NULL, `work_spec_worker_class_name` TEXT NOT NULL, `work_spec_input_merger_class_name` TEXT NOT NULL, `work_spec_input` BLOB NOT NULL, `work_spec_output` BLOB NOT NULL, `work_spec_initial_delay` INTEGER NOT NULL, `work_spec_interval_duration` INTEGER NOT NULL, `work_spec_flex_duration` INTEGER NOT NULL, `work_spec_run_attempt_count` INTEGER NOT NULL, `work_spec_backoff_policy` INTEGER NOT NULL, `work_spec_backoff_delay_duration` INTEGER NOT NULL, `work_spec_last_enqueue_time` INTEGER NOT NULL, `work_spec_minimum_retention_duration` INTEGER NOT NULL, `work_spec_schedule_requested_at` INTEGER NOT NULL, `work_spec_run_in_foreground` INTEGER NOT NULL, `work_spec_out_of_quota_policy` INTEGER NOT NULL, `work_spec_period_count` INTEGER NOT NULL DEFAULT 0, `work_spec_generation` INTEGER NOT NULL DEFAULT 0, `work_spec_required_network_type` INTEGER NOT NULL, `work_spec_requires_charging` INTEGER NOT NULL, `work_spec_requires_device_idle` INTEGER NOT NULL, `work_spec_requires_battery_not_low` INTEGER NOT NULL, `work_spec_requires_storage_not_low` INTEGER NOT NULL, `work_spec_trigger_content_update_delay` INTEGER NOT NULL, `work_spec_trigger_max_content_delay` INTEGER NOT NULL, `work_spec_content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(uuid))");
        n1g.u(qxeVar, "INSERT OR REPLACE INTO `WorkerQueueItem_new_WorkSpec` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) SELECT `uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,COALESCE(`work_spec_input_merger_class_name`, '" + OverwritingInputMerger.class.getName() + "'),`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers` FROM `WorkerQueueItem`");
        n1g.u(qxeVar, "DROP TABLE `WorkerQueueItem`");
        n1g.u(qxeVar, "ALTER TABLE `WorkerQueueItem_new_WorkSpec` RENAME TO `WorkerQueueItem`");
        n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_schedule_requested_at` ON `WorkerQueueItem` (`work_spec_schedule_requested_at`)");
        n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_last_enqueue_time` ON `WorkerQueueItem` (`work_spec_last_enqueue_time`)");
    }

    @Override // defpackage.zxa
    public final void b(qxe qxeVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                try {
                    c(qxeVar);
                    n1g.u(qxeVar, "ALTER TABLE `WorkerQueueItem` ADD COLUMN `work_spec_next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                    n1g.u(qxeVar, "ALTER TABLE `WorkerQueueItem` ADD COLUMN `work_spec_next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                    n1g.u(qxeVar, "ALTER TABLE `WorkerQueueItem` ADD COLUMN `work_spec_stop_reason` INTEGER NOT NULL DEFAULT -256");
                    n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `WorkerQueueItem_new_WorkSpec` (`uuid` TEXT NOT NULL, `uniqueWorkName` TEXT NOT NULL, `existingWorkPolicy` TEXT NOT NULL, `tags` TEXT NOT NULL, `time` INTEGER NOT NULL, `state` INTEGER NOT NULL DEFAULT 0, `work_spec_id` TEXT NOT NULL, `work_spec_state` INTEGER NOT NULL, `work_spec_worker_class_name` TEXT NOT NULL, `work_spec_input_merger_class_name` TEXT NOT NULL, `work_spec_input` BLOB NOT NULL, `work_spec_output` BLOB NOT NULL, `work_spec_initial_delay` INTEGER NOT NULL, `work_spec_interval_duration` INTEGER NOT NULL, `work_spec_flex_duration` INTEGER NOT NULL, `work_spec_run_attempt_count` INTEGER NOT NULL, `work_spec_backoff_policy` INTEGER NOT NULL, `work_spec_backoff_delay_duration` INTEGER NOT NULL, `work_spec_last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `work_spec_minimum_retention_duration` INTEGER NOT NULL,`work_spec_schedule_requested_at` INTEGER NOT NULL, `work_spec_run_in_foreground` INTEGER NOT NULL, `work_spec_out_of_quota_policy` INTEGER NOT NULL, `work_spec_period_count` INTEGER NOT NULL DEFAULT 0, `work_spec_generation` INTEGER NOT NULL DEFAULT 0, `work_spec_next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `work_spec_next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `work_spec_stop_reason` INTEGER NOT NULL DEFAULT -256, `work_spec_required_network_type` INTEGER NOT NULL, `work_spec_requires_charging` INTEGER NOT NULL, `work_spec_requires_device_idle` INTEGER NOT NULL, `work_spec_requires_battery_not_low` INTEGER NOT NULL, `work_spec_requires_storage_not_low` INTEGER NOT NULL, `work_spec_trigger_content_update_delay` INTEGER NOT NULL, `work_spec_trigger_max_content_delay` INTEGER NOT NULL, `work_spec_content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(uuid))");
                    n1g.u(qxeVar, "INSERT INTO `WorkerQueueItem_new_WorkSpec` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_next_schedule_time_override`,`work_spec_next_schedule_time_override_generation`,`work_spec_stop_reason`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) SELECT `uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_next_schedule_time_override`,`work_spec_next_schedule_time_override_generation`,`work_spec_stop_reason`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers` FROM `WorkerQueueItem`");
                    n1g.u(qxeVar, "DROP TABLE `WorkerQueueItem`");
                    n1g.u(qxeVar, "ALTER TABLE `WorkerQueueItem_new_WorkSpec` RENAME TO `WorkerQueueItem`");
                    n1g.u(qxeVar, "UPDATE WorkerQueueItem SET `work_spec_last_enqueue_time` = -1 WHERE `work_spec_last_enqueue_time` = 0");
                    n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_schedule_requested_at` ON `WorkerQueueItem` (`work_spec_schedule_requested_at`)");
                    n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_last_enqueue_time` ON `WorkerQueueItem` (`work_spec_last_enqueue_time`)");
                    n1g.u(qxeVar, "ALTER TABLE `WorkerQueueItem` ADD COLUMN `work_spec_required_network_request` BLOB NOT NULL DEFAULT x''");
                    n1g.u(qxeVar, "ALTER TABLE `WorkerQueueItem` ADD COLUMN `work_spec_trace_tag` TEXT DEFAULT NULL");
                    n1g.u(qxeVar, "ALTER TABLE `WorkerQueueItem` ADD COLUMN `work_spec_backoff_on_system_interruptions` INTEGER DEFAULT NULL");
                    n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_time` ON `WorkerQueueItem` (`time`)");
                    n1g.u(qxeVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration` ON `WorkerQueueItem` (`uniqueWorkName`,`work_spec_interval_duration`)");
                } catch (Throwable th) {
                    gm0.V(kya.class.getName(), "fail to migrate workmanager", th);
                    ((eh9) obj).b();
                    return;
                }
                break;
            case 1:
                n1g.u(qxeVar, "DROP TABLE `events`");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `stat_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `entry` BLOB NOT NULL)");
                ((bya) obj).f(qxeVar);
                break;
            default:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_new_video_message_preparations` (`attach_local_id` TEXT NOT NULL, `result_path` TEXT NOT NULL, `unrecoverable_exception` TEXT, PRIMARY KEY(`attach_local_id`))");
                n1g.u(qxeVar, "INSERT INTO `_new_video_message_preparations` (`attach_local_id`,`result_path`) SELECT `attach_local_id`,`result_path` FROM `video_message_preparations`");
                n1g.u(qxeVar, "DROP TABLE `video_message_preparations`");
                n1g.u(qxeVar, "ALTER TABLE `_new_video_message_preparations` RENAME TO `video_message_preparations`");
                ((bya) obj).f(qxeVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kya(eh9 eh9Var) {
        super(62, 63);
        this.c = 0;
        this.d = eh9Var;
    }
}
