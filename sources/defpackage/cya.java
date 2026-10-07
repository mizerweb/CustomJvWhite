package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.sdk.database.migration.DbMigrationException;

/* JADX INFO: loaded from: classes.dex */
public final class cya extends zxa {
    public final eh9 c;
    public final i1c d;

    public cya(eh9 eh9Var, i1c i1cVar) {
        super(1, 2);
        this.c = eh9Var;
        this.d = i1cVar;
    }

    @Override // defpackage.zxa
    public final void a(id7 id7Var) {
        gm0.n("Migration_1_2", "start");
        vo3 vo3Var = new vo3(this.d);
        ArrayList arrayList = new ArrayList();
        id7Var.l();
        try {
            Cursor cursorY = id7Var.Y("SELECT * FROM chats");
            try {
                int columnIndex = cursorY.getColumnIndex("id");
                int columnIndex2 = cursorY.getColumnIndex("data");
                while (cursorY.moveToNext()) {
                    if (!cursorY.isNull(columnIndex2)) {
                        long j = cursorY.getLong(columnIndex);
                        try {
                            arrayList.add(new Long[]{Long.valueOf(vo3Var.c(cursorY.getBlob(columnIndex2)).l), Long.valueOf(j)});
                        } catch (Throwable unused) {
                            gm0.Y("Migration_1_2", "could not parse blob for chat #" + j);
                        }
                    }
                }
                cursorY.close();
                if (arrayList.isEmpty()) {
                    id7Var.o0();
                    gm0.n("Migration_1_2", "no data, finished!");
                    id7Var.E();
                    return;
                }
                id7Var.I("DROP INDEX IF EXISTS index_chats_server_id");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)");
                id7Var.I("ALTER TABLE chats ADD COLUMN cid INTEGER NOT NULL DEFAULT 0");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    id7Var.K("UPDATE chats SET cid = ? WHERE id = ?", (Long[]) it.next());
                }
                id7Var.I("CREATE TABLE IF NOT EXISTS `temp_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `constructor_id` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                id7Var.I("INSERT INTO temp_messages SELECT * FROM messages");
                id7Var.I("DROP TABLE messages");
                id7Var.I("ALTER TABLE temp_messages RENAME TO messages");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
                id7Var.o0();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "Migration_1_2", "finish! migrate " + arrayList.size() + " chats", null);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(cursorY, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                gm0.V("Migration_1_2", "unexpected error!", new DbMigrationException("migration_1_2", th3));
                this.c.b();
            } finally {
                id7Var.E();
            }
        }
    }
}
