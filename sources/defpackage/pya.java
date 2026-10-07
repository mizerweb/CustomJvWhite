package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.RectF;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import one.me.sdk.database.migration.DbMigrationException;

/* JADX INFO: loaded from: classes.dex */
public final class pya extends zxa {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pya(int i) {
        super(74, 75);
        this.c = i;
        switch (i) {
            case 2:
                super(2, 3);
                this.d = new bya();
                break;
            default:
                this.d = pya.class.getName();
                break;
        }
    }

    public static void c(id7 id7Var, long j, a36 a36Var, nya nyaVar) {
        int i = 0;
        for (Object obj : a36Var.b()) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            iy8 iy8Var = (iy8) obj;
            id7Var.K("\n                INSERT INTO story_draft_drawing_layers\n                    (draft_id, layer_id, position, color, width, primitives,\n                     bounds_left, bounds_top, bounds_right, bounds_bottom)\n                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)\n                ", new Serializable[]{Long.valueOf(j), Long.valueOf(-(((long) i) + 1)), Integer.valueOf(i), Integer.valueOf(iy8Var.a()), Float.valueOf(iy8Var.c()), msl.c(iy8Var.b()), Integer.valueOf(nyaVar.b()), Integer.valueOf(nyaVar.d()), Integer.valueOf(nyaVar.c()), Integer.valueOf(nyaVar.a())});
            i = i2;
        }
    }

    @Override // defpackage.zxa
    public void a(id7 id7Var) throws IOException {
        Cursor cursor;
        Long lValueOf;
        a36 a36VarB;
        nya nyaVar;
        this = this;
        int i = 1;
        switch (this.c) {
            case 0:
                String str = (String) this.d;
                gm0.x(str, "start migration 74 to 75", null);
                id7Var.I("\n            CREATE TABLE IF NOT EXISTS `story_draft_drawing_layers` (\n                `draft_id` INTEGER NOT NULL,\n                `layer_id` INTEGER NOT NULL,\n                `position` INTEGER NOT NULL,\n                `color` INTEGER NOT NULL,\n                `width` REAL NOT NULL,\n                `primitives` BLOB NOT NULL,\n                `bounds_left` INTEGER NOT NULL,\n                `bounds_top` INTEGER NOT NULL,\n                `bounds_right` INTEGER NOT NULL,\n                `bounds_bottom` INTEGER NOT NULL,\n                PRIMARY KEY(`draft_id`, `layer_id`),\n                FOREIGN KEY(`draft_id`) REFERENCES `story_drafts`(`draft_id`) ON UPDATE NO ACTION ON DELETE CASCADE\n            )\n            ");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_story_draft_drawing_layers_draft_id` ON `story_draft_drawing_layers` (`draft_id`)");
                id7Var.I("ALTER TABLE story_draft_text_layers ADD COLUMN position INTEGER NOT NULL DEFAULT 0");
                Cursor cursorY = id7Var.Y("SELECT draft_id, LENGTH(editor_state_blob) AS editor_state_blob_length, canvas_width, canvas_height FROM story_drafts WHERE editor_state_blob IS NOT NULL");
                while (cursorY.moveToNext()) {
                    try {
                        long j = cursorY.getLong(0);
                        byte[] bArrD = this.d(id7Var, j, cursorY.getLong(i));
                        if (bArrD != null && (a36VarB = msl.b(bArrD)) != null) {
                            int i2 = cursorY.getInt(2);
                            int i3 = cursorY.getInt(3);
                            RectF rectFA = a36VarB.a();
                            if (rectFA != null) {
                                int iFloor = (int) Math.floor(rectFA.left);
                                int iFloor2 = (int) Math.floor(rectFA.top);
                                int iCeil = (int) Math.ceil(rectFA.right);
                                cursor = cursorY;
                                try {
                                    int iCeil2 = (int) Math.ceil(rectFA.bottom);
                                    if (iCeil > iFloor && iCeil2 > iFloor2) {
                                        nyaVar = new nya(iFloor, iFloor2, iCeil, iCeil2);
                                    }
                                    c(id7Var, j, a36VarB, nyaVar);
                                    cursorY = cursor;
                                    i = 1;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        rx8.n(cursor, th2);
                                        throw th3;
                                    }
                                }
                            } else {
                                cursor = cursorY;
                            }
                            nyaVar = new nya(0, 0, i2, i3);
                            c(id7Var, j, a36VarB, nyaVar);
                            cursorY = cursor;
                            i = 1;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor = cursorY;
                    }
                }
                cursorY.close();
                id7Var.I("\n            UPDATE story_draft_text_layers SET position =\n                (SELECT COUNT(*) FROM story_draft_drawing_layers d\n                    WHERE d.draft_id = story_draft_text_layers.draft_id) +\n                (SELECT COUNT(*) FROM story_draft_text_layers t\n                    WHERE t.draft_id = story_draft_text_layers.draft_id\n                        AND t.layer_id < story_draft_text_layers.layer_id)\n            ");
                id7Var.I("\n            CREATE TABLE `story_draft_text_layers_new` (\n                `layer_id` INTEGER NOT NULL,\n                `draft_id` INTEGER NOT NULL,\n                `position` INTEGER NOT NULL DEFAULT 0,\n                `align_mode` TEXT NOT NULL,\n                `text_color` INTEGER NOT NULL,\n                `text_background_color` INTEGER NOT NULL,\n                `text` TEXT NOT NULL,\n                `text_style` TEXT NOT NULL,\n                `layout_width` INTEGER NOT NULL,\n                `translation_x` REAL NOT NULL,\n                `translation_y` REAL NOT NULL,\n                `scale` REAL NOT NULL,\n                `rotation` REAL NOT NULL,\n                `text_bounds_left` REAL,\n                `text_bounds_top` REAL,\n                `text_bounds_right` REAL,\n                `text_bounds_bottom` REAL,\n                PRIMARY KEY(`draft_id`, `layer_id`),\n                FOREIGN KEY(`draft_id`) REFERENCES `story_drafts`(`draft_id`) ON UPDATE NO ACTION ON DELETE CASCADE\n            )\n            ");
                id7Var.I("\n            INSERT INTO story_draft_text_layers_new (\n                layer_id, draft_id, position, align_mode, text_color, text_background_color,\n                text, text_style, layout_width, translation_x, translation_y, scale, rotation,\n                text_bounds_left, text_bounds_top, text_bounds_right, text_bounds_bottom\n            )\n            SELECT\n                layer_id, draft_id, position, align_mode, text_color, text_background_color,\n                text, text_style, layout_width, translation_x, translation_y, scale, rotation,\n                text_bounds_left, text_bounds_top, text_bounds_right, text_bounds_bottom\n            FROM story_draft_text_layers\n            ");
                id7Var.I("DROP TABLE story_draft_text_layers");
                id7Var.I("ALTER TABLE story_draft_text_layers_new RENAME TO story_draft_text_layers");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_story_draft_text_layers_draft_id` ON `story_draft_text_layers` (`draft_id`)");
                Cursor cursorY2 = id7Var.Y("SELECT seq FROM sqlite_sequence WHERE name = 'story_drafts'");
                try {
                    if (cursorY2.moveToFirst()) {
                        lValueOf = Long.valueOf(cursorY2.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    cursorY2.close();
                    id7Var.I("\n            CREATE TABLE `story_drafts_new` (\n                `draft_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                `media_path` TEXT NOT NULL,\n                `preview_path` TEXT,\n                `type` INTEGER NOT NULL,\n                `expiration_ms` INTEGER NOT NULL,\n                `settings` INTEGER NOT NULL,\n                `canvas_width` INTEGER NOT NULL,\n                `canvas_height` INTEGER NOT NULL,\n                `created_at` INTEGER NOT NULL\n            )\n            ");
                    id7Var.I("\n            INSERT INTO story_drafts_new (\n                draft_id, media_path, preview_path, type, expiration_ms, settings,\n                canvas_width, canvas_height, created_at\n            )\n            SELECT\n                draft_id, media_path, preview_path, type, expiration_ms, settings,\n                canvas_width, canvas_height, created_at\n            FROM story_drafts\n            ");
                    id7Var.I("DROP TABLE story_drafts");
                    id7Var.I("ALTER TABLE story_drafts_new RENAME TO story_drafts");
                    if (lValueOf != null) {
                        id7Var.I("DELETE FROM sqlite_sequence WHERE name = 'story_drafts'");
                        id7Var.K("INSERT INTO sqlite_sequence (name, seq) VALUES ('story_drafts', ?)", new Object[]{lValueOf});
                    }
                    id7Var.I("DELETE FROM story_publish WHERE draft_id NOT IN (SELECT draft_id FROM story_drafts)");
                    gm0.x(str, "finish migration 74 to 75", null);
                    return;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        rx8.n(cursorY2, th5);
                        throw th6;
                    }
                }
            case 1:
                gm0.n("Migration_27_28", "start");
                try {
                    id7Var.I("DROP TABLE IF EXISTS phones");
                    id7Var.I("CREATE TABLE IF NOT EXISTS phones (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    phonebook_id INTEGER NOT NULL,\n    contact_id INTEGER NOT NULL,\n    phone TEXT NOT NULL,\n    phone_key TEXT NOT NULL,\n    server_phone INTEGER NOT NULL,\n    email TEXT,\n    first_name TEXT NOT NULL,\n    last_name TEXT,\n    avatar_path TEXT,\n    type INTEGER NOT NULL\n)");
                    id7Var.I("CREATE UNIQUE INDEX IF NOT EXISTS index_phones_phone_key ON phones(phone_key)");
                    id7Var.I("CREATE INDEX IF NOT EXISTS index_phones_phonebook_id ON phones(phonebook_id)");
                    id7Var.I("CREATE INDEX IF NOT EXISTS index_phones_type ON phones(type)");
                    id7Var.I("CREATE INDEX IF NOT EXISTS index_phones_server_phone ON phones(server_phone)");
                    a4c a4cVar = gm0.f;
                    if (a4cVar == null) {
                        return;
                    }
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "Migration_27_28", "finished migrate phones", null);
                        return;
                    }
                    return;
                } catch (Throwable th7) {
                    gm0.V("Migration_27_28", "unexpected error!", new DbMigrationException("migration_27_28", th7));
                    ((eh9) this.d).b();
                    return;
                }
            case 2:
            default:
                super.a(id7Var);
                return;
            case 3:
                if (this.b >= 10) {
                    id7Var.K("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    ((Context) this.d).getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
        }
    }

    @Override // defpackage.zxa
    public void b(qxe qxeVar) {
        switch (this.c) {
            case 2:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_new_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                n1g.u(qxeVar, "INSERT INTO `_new_messages` (`id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`ttl`,`channel_views`,`channel_forwards`,`view_time`,`zoom`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender`) SELECT `id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`ttl`,`channel_views`,`channel_forwards`,`view_time`,`zoom`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender` FROM `messages`");
                n1g.u(qxeVar, "DROP TABLE `messages`");
                n1g.u(qxeVar, "ALTER TABLE `_new_messages` RENAME TO `messages`");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_new_stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL)");
                n1g.u(qxeVar, "INSERT INTO `_new_stickers` (`id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type`) SELECT `id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type` FROM `stickers`");
                n1g.u(qxeVar, "DROP TABLE `stickers`");
                n1g.u(qxeVar, "ALTER TABLE `_new_stickers` RENAME TO `stickers`");
                aql.c(qxeVar);
                ((bya) this.d).f(qxeVar);
                break;
            default:
                super.b(qxeVar);
                break;
        }
    }

    public byte[] d(id7 id7Var, long j, long j2) {
        ArrayList<byte[]> arrayList = new ArrayList();
        long j3 = 0;
        while (j3 < j2) {
            long jMin = Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, j2 - j3);
            Cursor cursorK0 = id7Var.k0("SELECT SUBSTR(editor_state_blob, ?, ?) AS chunk FROM story_drafts WHERE draft_id = ?", new Long[]{Long.valueOf(1 + j3), Long.valueOf(jMin), Long.valueOf(j)});
            try {
                if (cursorK0.moveToFirst()) {
                    arrayList.add(cursorK0.getBlob(0));
                }
                cursorK0.close();
                j3 += jMin;
            } catch (Throwable th) {
                try {
                    gm0.V((String) this.d, "fail to parse message attaches", new oya("Blob length = " + j2, th));
                    return null;
                } finally {
                    cursorK0.close();
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[(int) j2];
        int length = 0;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pya(eh9 eh9Var) {
        super(27, 28);
        this.c = 1;
        this.d = eh9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pya(int i, int i2, Context context) {
        super(i, i2);
        this.c = 3;
        this.d = context;
    }
}
