package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import one.me.sdk.database.OneMeRoomDatabase_Impl;
import org.apache.commons.logging.LogFactory;
import org.apache.http.cookie.ClientCookie;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final class a7c extends pic {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ rre e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7c(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }

    private final pse A(qxe qxeVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("attach_local_id", new bhh(0, 1, "attach_local_id", "TEXT", null, false));
        linkedHashMap.put("prepared_path", new bhh(0, 1, "prepared_path", "TEXT", null, false));
        linkedHashMap.put("file_name", new bhh(0, 1, "file_name", "TEXT", null, false));
        linkedHashMap.put(ApiProtocol.KEY_UPLOAD_URL, new bhh(0, 1, ApiProtocol.KEY_UPLOAD_URL, "TEXT", null, false));
        linkedHashMap.put("upload_progress", new bhh(0, 1, "upload_progress", "REAL", null, true));
        linkedHashMap.put("total_bytes", new bhh(0, 1, "total_bytes", "INTEGER", null, true));
        linkedHashMap.put("upload_status", new bhh(0, 1, "upload_status", "INTEGER", null, false));
        linkedHashMap.put("created_time", new bhh(0, 1, "created_time", "INTEGER", null, true));
        linkedHashMap.put("is_transload", new bhh(0, 1, "is_transload", "INTEGER", "false", true));
        linkedHashMap.put(ClientCookie.PATH_ATTR, new bhh(1, 1, ClientCookie.PATH_ATTR, "TEXT", null, true));
        linkedHashMap.put("last_modified", new bhh(2, 1, "last_modified", "INTEGER", null, true));
        linkedHashMap.put("upload_type", new bhh(3, 1, "upload_type", "INTEGER", null, true));
        linkedHashMap.put("photo_token", new bhh(0, 1, "photo_token", "TEXT", null, false));
        linkedHashMap.put("attach_id", new bhh(0, 1, "attach_id", "INTEGER", null, false));
        linkedHashMap.put("thumbhash_base64", new bhh(0, 1, "thumbhash_base64", "TEXT", null, false));
        ehh ehhVar = new ehh("uploads", linkedHashMap, ewi.h(linkedHashMap, "desired_uploader", new bhh(0, 1, "desired_uploader", "TEXT", null, false)), new LinkedHashSet());
        ehh ehhVarA = ovl.a(qxeVar, "uploads");
        if (!ehhVar.equals(ehhVarA)) {
            return new pse(false, ewi.e("uploads(one.me.sdk.transfer.upload.UploadDb).\n Expected:\n", ehhVar, "\n Found:\n", ehhVarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(ClientCookie.PATH_ATTR, new bhh(0, 1, ClientCookie.PATH_ATTR, "TEXT", null, false));
        linkedHashMap2.put("last_modified", new bhh(0, 1, "last_modified", "INTEGER", null, true));
        linkedHashMap2.put("upload_type", new bhh(0, 1, "upload_type", "INTEGER", null, false));
        linkedHashMap2.put("message_id", new bhh(1, 1, "message_id", "INTEGER", null, true));
        linkedHashMap2.put("chat_id", new bhh(2, 1, "chat_id", "INTEGER", null, true));
        linkedHashMap2.put("attach_id", new bhh(3, 1, "attach_id", "TEXT", null, true));
        linkedHashMap2.put("video_quality", new bhh(0, 1, "video_quality", "INTEGER", null, false));
        linkedHashMap2.put("video_start_trim_position", new bhh(0, 1, "video_start_trim_position", "REAL", null, false));
        linkedHashMap2.put("video_end_trim_position", new bhh(0, 1, "video_end_trim_position", "REAL", null, false));
        linkedHashMap2.put("video_fragments_paths", new bhh(0, 1, "video_fragments_paths", "TEXT", null, false));
        ehh ehhVar2 = new ehh("message_uploads", linkedHashMap2, ewi.h(linkedHashMap2, "mute", new bhh(0, 1, "mute", "INTEGER", "false", false)), new LinkedHashSet());
        ehh ehhVarA2 = ovl.a(qxeVar, "message_uploads");
        if (!ehhVar2.equals(ehhVarA2)) {
            return new pse(false, ewi.e("message_uploads(ru.ok.tamtam.android.upload.message.MessageUploadDb).\n Expected:\n", ehhVar2, "\n Found:\n", ehhVarA2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("finished", new bhh(0, 1, "finished", "INTEGER", null, true));
        linkedHashMap3.put("prepared_mime_type", new bhh(0, 1, "prepared_mime_type", "TEXT", null, false));
        linkedHashMap3.put("prepared_path", new bhh(0, 1, "prepared_path", "TEXT", null, false));
        linkedHashMap3.put("result_path", new bhh(0, 1, "result_path", "TEXT", null, false));
        linkedHashMap3.put("source_uri", new bhh(1, 1, "source_uri", "TEXT", null, true));
        linkedHashMap3.put("quality", new bhh(2, 1, "quality", "INTEGER", null, true));
        linkedHashMap3.put("start_trim_position", new bhh(3, 1, "start_trim_position", "REAL", null, true));
        linkedHashMap3.put("end_trim_position", new bhh(4, 1, "end_trim_position", "REAL", null, true));
        ehh ehhVar3 = new ehh("video_conversions", linkedHashMap3, ewi.h(linkedHashMap3, "mute", new bhh(5, 1, "mute", "INTEGER", "false", true)), new LinkedHashSet());
        ehh ehhVarA3 = ovl.a(qxeVar, "video_conversions");
        if (!ehhVar3.equals(ehhVarA3)) {
            return new pse(false, ewi.e("video_conversions(ru.ok.tamtam.android.video.converter.VideoConversionDb).\n Expected:\n", ehhVar3, "\n Found:\n", ehhVarA3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("attach_local_id", new bhh(1, 1, "attach_local_id", "TEXT", null, true));
        linkedHashMap4.put("result_path", new bhh(0, 1, "result_path", "TEXT", null, true));
        ehh ehhVar4 = new ehh("video_message_preparations", linkedHashMap4, ewi.h(linkedHashMap4, "unrecoverable_exception", new bhh(0, 1, "unrecoverable_exception", "TEXT", null, false)), new LinkedHashSet());
        ehh ehhVarA4 = ovl.a(qxeVar, "video_message_preparations");
        if (!ehhVar4.equals(ehhVarA4)) {
            return new pse(false, ewi.e("video_message_preparations(one.me.upload.videomsg.preparation.VideoMessagePreparationDb).\n Expected:\n", ehhVar4, "\n Found:\n", ehhVarA4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap5.put(SdkMetricStatEvent.NAME_KEY, new bhh(0, 1, SdkMetricStatEvent.NAME_KEY, "TEXT", null, false));
        linkedHashMap5.put("icon_url", new bhh(0, 1, "icon_url", "TEXT", null, false));
        linkedHashMap5.put("author_id", new bhh(0, 1, "author_id", "INTEGER", null, true));
        linkedHashMap5.put("created_time", new bhh(0, 1, "created_time", "INTEGER", null, true));
        linkedHashMap5.put("updated_time", new bhh(0, 1, "updated_time", "INTEGER", null, true));
        linkedHashMap5.put("link", new bhh(0, 1, "link", "TEXT", null, true));
        linkedHashMap5.put("stickers", new bhh(0, 1, "stickers", "TEXT", null, true));
        ehh ehhVar5 = new ehh("sticker_sets", linkedHashMap5, ewi.h(linkedHashMap5, "draft", new bhh(0, 1, "draft", "INTEGER", null, true)), new LinkedHashSet());
        ehh ehhVarA5 = ovl.a(qxeVar, "sticker_sets");
        if (!ehhVar5.equals(ehhVarA5)) {
            return new pse(false, ewi.e("sticker_sets(ru.ok.tamtam.android.stickers.sets.StickerSetDb).\n Expected:\n", ehhVar5, "\n Found:\n", ehhVarA5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        ehh ehhVar6 = new ehh("favorite_sticker_sets", linkedHashMap6, ewi.h(linkedHashMap6, "index", new bhh(0, 1, "index", "INTEGER", null, true)), new LinkedHashSet());
        ehh ehhVarA6 = ovl.a(qxeVar, "favorite_sticker_sets");
        if (!ehhVar6.equals(ehhVarA6)) {
            return new pse(false, ewi.e("favorite_sticker_sets(ru.ok.tamtam.android.stickers.sets.favorite.FavoriteStickerSetDb).\n Expected:\n", ehhVar6, "\n Found:\n", ehhVarA6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        ehh ehhVar7 = new ehh("favorite_stickers", linkedHashMap7, ewi.h(linkedHashMap7, "index", new bhh(0, 1, "index", "INTEGER", null, true)), new LinkedHashSet());
        ehh ehhVarA7 = ovl.a(qxeVar, "favorite_stickers");
        if (!ehhVar7.equals(ehhVarA7)) {
            return new pse(false, ewi.e("favorite_stickers(ru.ok.tamtam.android.stickers.favorite.FavoriteStickerDb).\n Expected:\n", ehhVar7, "\n Found:\n", ehhVarA7));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap8.put("recent_type", new bhh(0, 1, "recent_type", "INTEGER", null, true));
        linkedHashMap8.put("recent_time", new bhh(0, 1, "recent_time", "INTEGER", null, true));
        linkedHashMap8.put("server_id", new bhh(0, 1, "server_id", "INTEGER", "0", true));
        linkedHashMap8.put("sticker_id", new bhh(0, 1, "sticker_id", "INTEGER", null, false));
        linkedHashMap8.put("emoji", new bhh(0, 1, "emoji", "TEXT", null, false));
        linkedHashMap8.put("gif", new bhh(0, 1, "gif", "BLOB", null, false));
        ehh ehhVar8 = new ehh("recent", linkedHashMap8, ewi.h(linkedHashMap8, "gif_id", new bhh(0, 1, "gif_id", "INTEGER", null, false)), new LinkedHashSet());
        ehh ehhVarA8 = ovl.a(qxeVar, "recent");
        if (!ehhVar8.equals(ehhVarA8)) {
            return new pse(false, ewi.e("recent(ru.ok.tamtam.android.stickers.recents.RecentDb).\n Expected:\n", ehhVar8, "\n Found:\n", ehhVarA8));
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("message_id", new bhh(2, 1, "message_id", "INTEGER", null, true));
        linkedHashMap9.put("type", new bhh(0, 1, "type", "TEXT", null, true));
        linkedHashMap9.put("chat_title", new bhh(0, 1, "chat_title", "TEXT", null, false));
        linkedHashMap9.put("sender_user_name", new bhh(0, 1, "sender_user_name", "TEXT", null, false));
        linkedHashMap9.put("sender_user_id", new bhh(0, 1, "sender_user_id", "INTEGER", null, true));
        linkedHashMap9.put("time", new bhh(0, 1, "time", "INTEGER", null, true));
        linkedHashMap9.put("text", new bhh(0, 1, "text", "TEXT", null, true));
        linkedHashMap9.put("push_id", new bhh(0, 1, "push_id", "INTEGER", null, true));
        linkedHashMap9.put("event_key", new bhh(0, 1, "event_key", "TEXT", null, false));
        linkedHashMap9.put("large_image_url", new bhh(0, 1, "large_image_url", "TEXT", "NULL", false));
        linkedHashMap9.put("fire_m", new bhh(0, 1, "fire_m", "INTEGER", "0", true));
        linkedHashMap9.put("has_any_error", new bhh(0, 1, "has_any_error", "INTEGER", "0", true));
        linkedHashMap9.put(MLFeatureConfigProviderBase.URL_KEY, new bhh(0, 1, MLFeatureConfigProviderBase.URL_KEY, "TEXT", "NULL", false));
        linkedHashMap9.put("bmd", new bhh(0, 1, "bmd", "TEXT", "NULL", false));
        linkedHashMap9.put("source", new bhh(0, 1, "source", "INTEGER", null, true));
        linkedHashMap9.put("chat_id", new bhh(1, 1, "chat_id", "INTEGER", null, true));
        ehh ehhVar9 = new ehh("fcm_notifications", linkedHashMap9, ewi.h(linkedHashMap9, "post_id", new bhh(3, 1, "post_id", "INTEGER", "0", true)), new LinkedHashSet());
        ehh ehhVarA9 = ovl.a(qxeVar, "fcm_notifications");
        if (!ehhVar9.equals(ehhVarA9)) {
            return new pse(false, ewi.e("fcm_notifications(ru.ok.tamtam.android.notifications.messages.newpush.fcm.storage.model.FcmNotification).\n Expected:\n", ehhVar9, "\n Found:\n", ehhVarA9));
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("last_notify_msg_id", new bhh(0, 1, "last_notify_msg_id", "INTEGER", null, true));
        linkedHashMap10.put("chat_id", new bhh(1, 1, "chat_id", "INTEGER", null, true));
        ehh ehhVar10 = new ehh("fcm_notifications_history", linkedHashMap10, ewi.h(linkedHashMap10, "post_id", new bhh(2, 1, "post_id", "INTEGER", "0", true)), new LinkedHashSet());
        ehh ehhVarA10 = ovl.a(qxeVar, "fcm_notifications_history");
        if (!ehhVar10.equals(ehhVarA10)) {
            return new pse(false, ewi.e("fcm_notifications_history(ru.ok.tamtam.android.notifications.messages.newpush.fcm.history.model.FcmNotificationHistoryDb).\n Expected:\n", ehhVar10, "\n Found:\n", ehhVarA10));
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("push_id", new bhh(0, 1, "push_id", "INTEGER", null, true));
        linkedHashMap11.put("msg_id", new bhh(3, 1, "msg_id", "INTEGER", null, true));
        linkedHashMap11.put("analytics_status", new bhh(0, 1, "analytics_status", "INTEGER", null, true));
        linkedHashMap11.put("suid", new bhh(0, 1, "suid", "INTEGER", null, false));
        linkedHashMap11.put("content_length", new bhh(0, 1, "content_length", "INTEGER", null, true));
        linkedHashMap11.put("sent_time", new bhh(0, 1, "sent_time", "INTEGER", null, false));
        linkedHashMap11.put("event_key", new bhh(0, 1, "event_key", "TEXT", null, false));
        linkedHashMap11.put("fcm_sent_time", new bhh(0, 1, "fcm_sent_time", "INTEGER", null, true));
        linkedHashMap11.put("received_time", new bhh(0, 1, "received_time", "INTEGER", null, true));
        linkedHashMap11.put("push_type", new bhh(0, 1, "push_type", "TEXT", null, true));
        linkedHashMap11.put("time", new bhh(0, 1, "time", "INTEGER", null, true));
        linkedHashMap11.put("created_time", new bhh(0, 1, "created_time", "INTEGER", null, true));
        linkedHashMap11.put("chat_id", new bhh(1, 1, "chat_id", "INTEGER", null, true));
        ehh ehhVar11 = new ehh("fcm_notifications_analytics", linkedHashMap11, ewi.h(linkedHashMap11, "post_id", new bhh(2, 1, "post_id", "INTEGER", "0", true)), new LinkedHashSet());
        ehh ehhVarA11 = ovl.a(qxeVar, "fcm_notifications_analytics");
        if (!ehhVar11.equals(ehhVarA11)) {
            return new pse(false, ewi.e("fcm_notifications_analytics(ru.ok.tamtam.android.notifications.messages.newpush.fcm.analytics.model.FcmAnalyticsEntryDb).\n Expected:\n", ehhVar11, "\n Found:\n", ehhVarA11));
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("mark", new bhh(0, 1, "mark", "INTEGER", null, true));
        linkedHashMap12.put("chat_id", new bhh(1, 1, "chat_id", "INTEGER", null, true));
        ehh ehhVar12 = new ehh("notifications_read_marks", linkedHashMap12, ewi.h(linkedHashMap12, "post_id", new bhh(2, 1, "post_id", "INTEGER", "0", true)), new LinkedHashSet());
        ehh ehhVarA12 = ovl.a(qxeVar, "notifications_read_marks");
        if (!ehhVar12.equals(ehhVarA12)) {
            return new pse(false, ewi.e("notifications_read_marks(ru.ok.tamtam.android.notifications.messages.newpush.readmarks.model.NotificationReadMarkDb).\n Expected:\n", ehhVar12, "\n Found:\n", ehhVarA12));
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("message_id", new bhh(1, 1, "message_id", "INTEGER", null, true));
        linkedHashMap13.put("time", new bhh(0, 1, "time", "INTEGER", null, true));
        linkedHashMap13.put("push_source", new bhh(0, 1, "push_source", "INTEGER", "NULL", false));
        linkedHashMap13.put("drop_reason", new bhh(0, 1, "drop_reason", "TEXT", null, false));
        linkedHashMap13.put("push_type", new bhh(0, 1, "push_type", "TEXT", null, false));
        linkedHashMap13.put("show_analytics_sent", new bhh(0, 1, "show_analytics_sent", "INTEGER", "0", true));
        linkedHashMap13.put("chat_id", new bhh(2, 1, "chat_id", "INTEGER", null, true));
        ehh ehhVar13 = new ehh("notifications_tracker_messages", linkedHashMap13, ewi.h(linkedHashMap13, "post_id", new bhh(3, 1, "post_id", "INTEGER", "0", true)), new LinkedHashSet());
        ehh ehhVarA13 = ovl.a(qxeVar, "notifications_tracker_messages");
        if (!ehhVar13.equals(ehhVarA13)) {
            return new pse(false, ewi.e("notifications_tracker_messages(ru.ok.tamtam.android.notifications.messages.tracker.storage.model.NotificationsTrackerMessageDb).\n Expected:\n", ehhVar13, "\n Found:\n", ehhVarA13));
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("call_id", new bhh(1, 1, "call_id", "TEXT", null, true));
        linkedHashMap14.put("chat_id", new bhh(0, 1, "chat_id", "INTEGER", null, true));
        linkedHashMap14.put("push_source", new bhh(0, 1, "push_source", "INTEGER", null, true));
        linkedHashMap14.put("received_time", new bhh(0, 1, "received_time", "INTEGER", null, true));
        linkedHashMap14.put("push_id", new bhh(0, 1, "push_id", "INTEGER", null, false));
        linkedHashMap14.put("event_key", new bhh(0, 1, "event_key", "TEXT", null, false));
        linkedHashMap14.put("suid", new bhh(0, 1, "suid", "INTEGER", null, false));
        linkedHashMap14.put("sent_time", new bhh(0, 1, "sent_time", "INTEGER", null, false));
        linkedHashMap14.put("fcm_sent_time", new bhh(0, 1, "fcm_sent_time", "INTEGER", null, false));
        linkedHashMap14.put("drop_reason", new bhh(0, 1, "drop_reason", "TEXT", null, false));
        ehh ehhVar14 = new ehh("call_notifications_analytics", linkedHashMap14, ewi.h(linkedHashMap14, "created_time", new bhh(0, 1, "created_time", "INTEGER", null, true)), new LinkedHashSet());
        ehh ehhVarA14 = ovl.a(qxeVar, "call_notifications_analytics");
        if (!ehhVar14.equals(ehhVarA14)) {
            return new pse(false, ewi.e("call_notifications_analytics(one.me.calls.database.entity.CallAnalyticsEntryDb).\n Expected:\n", ehhVar14, "\n Found:\n", ehhVarA14));
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        linkedHashMap15.put("id", new bhh(1, 1, "id", "TEXT", null, true));
        linkedHashMap15.put("title", new bhh(0, 1, "title", "TEXT", null, true));
        linkedHashMap15.put("order", new bhh(0, 1, "order", "INTEGER", null, true));
        linkedHashMap15.put("emoji", new bhh(0, 1, "emoji", "TEXT", "NULL", false));
        linkedHashMap15.put("filters", new bhh(0, 1, "filters", "TEXT", null, true));
        linkedHashMap15.put("isHiddenForAllFolder", new bhh(0, 1, "isHiddenForAllFolder", "INTEGER", null, true));
        linkedHashMap15.put("elements", new bhh(0, 1, "elements", "BLOB", "NULL", false));
        linkedHashMap15.put("filterSubjects", new bhh(0, 1, "filterSubjects", "BLOB", "NULL", false));
        linkedHashMap15.put("widgets", new bhh(0, 1, "widgets", "BLOB", "NULL", false));
        linkedHashMap15.put("options", new bhh(0, 1, "options", "BLOB", "NULL", false));
        linkedHashMap15.put("updateTime", new bhh(0, 1, "updateTime", "INTEGER", "0", true));
        linkedHashMap15.put("favorites", new bhh(0, 1, "favorites", "BLOB", "NULL", false));
        linkedHashMap15.put("templateId", new bhh(0, 1, "templateId", "INTEGER", "NULL", false));
        LinkedHashSet linkedHashSetH = ewi.h(linkedHashMap15, "sourceId", new bhh(0, 1, "sourceId", "INTEGER", "NULL", false));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new dhh("index_chat_folder_filters", false, yab.k0("filters"), yab.k0("ASC")));
        ehh ehhVar15 = new ehh("chat_folder", linkedHashMap15, linkedHashSetH, linkedHashSet);
        ehh ehhVarA15 = ovl.a(qxeVar, "chat_folder");
        if (!ehhVar15.equals(ehhVarA15)) {
            return new pse(false, ewi.e("chat_folder(ru.ok.tamtam.android.folders.db.RoomChatFolder).\n Expected:\n", ehhVar15, "\n Found:\n", ehhVarA15));
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        linkedHashMap16.put(ApiProtocol.PARAM_CHAT_ID, new bhh(1, 1, ApiProtocol.PARAM_CHAT_ID, "INTEGER", null, true));
        ehh ehhVar16 = new ehh("folder_and_chats", linkedHashMap16, ewi.h(linkedHashMap16, "folderId", new bhh(2, 1, "folderId", "TEXT", null, true)), new LinkedHashSet());
        ehh ehhVarA16 = ovl.a(qxeVar, "folder_and_chats");
        if (!ehhVar16.equals(ehhVarA16)) {
            return new pse(false, ewi.e("folder_and_chats(ru.ok.tamtam.android.folders.db.ChatAndFolderCrossRef).\n Expected:\n", ehhVar16, "\n Found:\n", ehhVarA16));
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add("normalizedTitle");
        linkedHashSet2.add("originalTitle");
        linkedHashSet2.add("normalizedTitleWithoutEmoji");
        linkedHashSet2.add("originalTitleWithoutEmoji");
        linkedHashSet2.add("sortTime");
        we7 we7Var = new we7("chat_title", linkedHashSet2, "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)");
        we7 we7VarB = nzl.b(qxeVar, "chat_title");
        if (!we7Var.equals(we7VarB)) {
            return new pse(false, "chat_title(ru.ok.tamtam.android.chat.ChatTitle).\n Expected:\n" + we7Var + "\n Found:\n" + we7VarB);
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add("link");
        linkedHashSet3.add("allNormalizedTitles");
        linkedHashSet3.add("allOriginalTitles");
        linkedHashSet3.add("allNormalizedTitlesWithoutEmoji");
        linkedHashSet3.add("allOriginalTitlesWithoutEmoji");
        we7 we7Var2 = new we7("contact_title", linkedHashSet3, "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)");
        we7 we7VarB2 = nzl.b(qxeVar, "contact_title");
        if (!we7Var2.equals(we7VarB2)) {
            return new pse(false, "contact_title(ru.ok.tamtam.android.contacts.ContactTitle).\n Expected:\n" + we7Var2 + "\n Found:\n" + we7VarB2);
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        linkedHashMap17.put("uuid", new bhh(1, 1, "uuid", "TEXT", null, true));
        linkedHashMap17.put("uniqueWorkName", new bhh(0, 1, "uniqueWorkName", "TEXT", null, true));
        linkedHashMap17.put("existingWorkPolicy", new bhh(0, 1, "existingWorkPolicy", "TEXT", null, true));
        linkedHashMap17.put("tags", new bhh(0, 1, "tags", "TEXT", null, true));
        linkedHashMap17.put("time", new bhh(0, 1, "time", "INTEGER", null, true));
        linkedHashMap17.put("state", new bhh(0, 1, "state", "INTEGER", "0", true));
        linkedHashMap17.put("work_spec_id", new bhh(0, 1, "work_spec_id", "TEXT", null, true));
        linkedHashMap17.put("work_spec_state", new bhh(0, 1, "work_spec_state", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_worker_class_name", new bhh(0, 1, "work_spec_worker_class_name", "TEXT", null, true));
        linkedHashMap17.put("work_spec_input_merger_class_name", new bhh(0, 1, "work_spec_input_merger_class_name", "TEXT", null, true));
        linkedHashMap17.put("work_spec_input", new bhh(0, 1, "work_spec_input", "BLOB", null, true));
        linkedHashMap17.put("work_spec_output", new bhh(0, 1, "work_spec_output", "BLOB", null, true));
        linkedHashMap17.put("work_spec_initial_delay", new bhh(0, 1, "work_spec_initial_delay", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_interval_duration", new bhh(0, 1, "work_spec_interval_duration", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_flex_duration", new bhh(0, 1, "work_spec_flex_duration", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_run_attempt_count", new bhh(0, 1, "work_spec_run_attempt_count", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_backoff_policy", new bhh(0, 1, "work_spec_backoff_policy", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_backoff_delay_duration", new bhh(0, 1, "work_spec_backoff_delay_duration", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_last_enqueue_time", new bhh(0, 1, "work_spec_last_enqueue_time", "INTEGER", "-1", true));
        linkedHashMap17.put("work_spec_minimum_retention_duration", new bhh(0, 1, "work_spec_minimum_retention_duration", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_schedule_requested_at", new bhh(0, 1, "work_spec_schedule_requested_at", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_run_in_foreground", new bhh(0, 1, "work_spec_run_in_foreground", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_out_of_quota_policy", new bhh(0, 1, "work_spec_out_of_quota_policy", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_period_count", new bhh(0, 1, "work_spec_period_count", "INTEGER", "0", true));
        linkedHashMap17.put("work_spec_generation", new bhh(0, 1, "work_spec_generation", "INTEGER", "0", true));
        linkedHashMap17.put("work_spec_next_schedule_time_override", new bhh(0, 1, "work_spec_next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        linkedHashMap17.put("work_spec_next_schedule_time_override_generation", new bhh(0, 1, "work_spec_next_schedule_time_override_generation", "INTEGER", "0", true));
        linkedHashMap17.put("work_spec_stop_reason", new bhh(0, 1, "work_spec_stop_reason", "INTEGER", "-256", true));
        linkedHashMap17.put("work_spec_trace_tag", new bhh(0, 1, "work_spec_trace_tag", "TEXT", null, false));
        linkedHashMap17.put("work_spec_backoff_on_system_interruptions", new bhh(0, 1, "work_spec_backoff_on_system_interruptions", "INTEGER", null, false));
        linkedHashMap17.put("work_spec_required_network_type", new bhh(0, 1, "work_spec_required_network_type", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_required_network_request", new bhh(0, 1, "work_spec_required_network_request", "BLOB", "x''", true));
        linkedHashMap17.put("work_spec_requires_charging", new bhh(0, 1, "work_spec_requires_charging", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_requires_device_idle", new bhh(0, 1, "work_spec_requires_device_idle", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_requires_battery_not_low", new bhh(0, 1, "work_spec_requires_battery_not_low", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_requires_storage_not_low", new bhh(0, 1, "work_spec_requires_storage_not_low", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_trigger_content_update_delay", new bhh(0, 1, "work_spec_trigger_content_update_delay", "INTEGER", null, true));
        linkedHashMap17.put("work_spec_trigger_max_content_delay", new bhh(0, 1, "work_spec_trigger_max_content_delay", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH2 = ewi.h(linkedHashMap17, "work_spec_content_uri_triggers", new bhh(0, 1, "work_spec_content_uri_triggers", "BLOB", null, true));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new dhh("index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration", true, xw3.P0("uniqueWorkName", "work_spec_interval_duration"), xw3.P0("ASC", "ASC")));
        linkedHashSet4.add(new dhh("index_WorkerQueueItem_work_spec_schedule_requested_at", false, yab.k0("work_spec_schedule_requested_at"), yab.k0("ASC")));
        linkedHashSet4.add(new dhh("index_WorkerQueueItem_work_spec_last_enqueue_time", false, yab.k0("work_spec_last_enqueue_time"), yab.k0("ASC")));
        linkedHashSet4.add(new dhh("index_WorkerQueueItem_time", false, yab.k0("time"), yab.k0("ASC")));
        ehh ehhVar17 = new ehh("WorkerQueueItem", linkedHashMap17, linkedHashSetH2, linkedHashSet4);
        ehh ehhVarA17 = ovl.a(qxeVar, "WorkerQueueItem");
        if (!ehhVar17.equals(ehhVarA17)) {
            return new pse(false, ewi.e("WorkerQueueItem(androidx.work.impl.model.WorkerQueueItem).\n Expected:\n", ehhVar17, "\n Found:\n", ehhVarA17));
        }
        LinkedHashMap linkedHashMap18 = new LinkedHashMap();
        linkedHashMap18.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap18.put("type", new bhh(0, 1, "type", "INTEGER", null, true));
        linkedHashMap18.put("status", new bhh(0, 1, "status", "INTEGER", null, true));
        linkedHashMap18.put("fails_count", new bhh(0, 1, "fails_count", "INTEGER", null, true));
        linkedHashMap18.put("depends_request_id", new bhh(0, 1, "depends_request_id", "INTEGER", null, true));
        linkedHashMap18.put("dependency_type", new bhh(0, 1, "dependency_type", "INTEGER", null, true));
        linkedHashMap18.put("data", new bhh(0, 1, "data", "BLOB", null, true));
        ehh ehhVar18 = new ehh("tasks", linkedHashMap18, ewi.h(linkedHashMap18, "created_time", new bhh(0, 1, "created_time", "INTEGER", null, true)), new LinkedHashSet());
        ehh ehhVarA18 = ovl.a(qxeVar, "tasks");
        if (!ehhVar18.equals(ehhVarA18)) {
            return new pse(false, ewi.e("tasks(one.me.sdk.tasks.db.TaskEntity).\n Expected:\n", ehhVar18, "\n Found:\n", ehhVarA18));
        }
        LinkedHashMap linkedHashMap19 = new LinkedHashMap();
        linkedHashMap19.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap19.put("server_id", new bhh(0, 1, "server_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH3 = ewi.h(linkedHashMap19, "data", new bhh(0, 1, "data", "BLOB", null, true));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new dhh("index_contacts_server_id", true, yab.k0("server_id"), yab.k0("ASC")));
        ehh ehhVar19 = new ehh("contacts", linkedHashMap19, linkedHashSetH3, linkedHashSet5);
        ehh ehhVarA19 = ovl.a(qxeVar, "contacts");
        if (!ehhVar19.equals(ehhVarA19)) {
            return new pse(false, ewi.e("contacts(ru.ok.tamtam.android.contacts.db.ContactEntity).\n Expected:\n", ehhVar19, "\n Found:\n", ehhVarA19));
        }
        LinkedHashMap linkedHashMap20 = new LinkedHashMap();
        linkedHashMap20.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap20.put("phonebook_id", new bhh(0, 1, "phonebook_id", "INTEGER", null, true));
        linkedHashMap20.put("contact_id", new bhh(0, 1, "contact_id", "INTEGER", null, true));
        linkedHashMap20.put("phone", new bhh(0, 1, "phone", "TEXT", null, true));
        linkedHashMap20.put("phone_key", new bhh(0, 1, "phone_key", "TEXT", null, true));
        linkedHashMap20.put("server_phone", new bhh(0, 1, "server_phone", "INTEGER", null, true));
        linkedHashMap20.put("email", new bhh(0, 1, "email", "TEXT", null, false));
        linkedHashMap20.put("first_name", new bhh(0, 1, "first_name", "TEXT", null, true));
        linkedHashMap20.put("last_name", new bhh(0, 1, "last_name", "TEXT", null, false));
        linkedHashMap20.put("avatar_path", new bhh(0, 1, "avatar_path", "TEXT", null, false));
        LinkedHashSet linkedHashSetH4 = ewi.h(linkedHashMap20, "type", new bhh(0, 1, "type", "INTEGER", null, true));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new dhh("index_phones_phone_key", true, yab.k0("phone_key"), yab.k0("ASC")));
        linkedHashSet6.add(new dhh("index_phones_phonebook_id", false, yab.k0("phonebook_id"), yab.k0("ASC")));
        linkedHashSet6.add(new dhh("index_phones_type", false, yab.k0("type"), yab.k0("ASC")));
        linkedHashSet6.add(new dhh("index_phones_server_phone", false, yab.k0("server_phone"), yab.k0("ASC")));
        ehh ehhVar20 = new ehh("phones", linkedHashMap20, linkedHashSetH4, linkedHashSet6);
        ehh ehhVarA20 = ovl.a(qxeVar, "phones");
        if (!ehhVar20.equals(ehhVarA20)) {
            return new pse(false, ewi.e("phones(ru.ok.tamtam.android.phone.PhoneEntity).\n Expected:\n", ehhVar20, "\n Found:\n", ehhVarA20));
        }
        LinkedHashMap linkedHashMap21 = new LinkedHashMap();
        linkedHashMap21.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap21.put("timestamp", new bhh(0, 1, "timestamp", "INTEGER", null, true));
        ehh ehhVar21 = new ehh("stat_events", linkedHashMap21, ewi.h(linkedHashMap21, "entry", new bhh(0, 1, "entry", "BLOB", null, true)), new LinkedHashSet());
        ehh ehhVarA21 = ovl.a(qxeVar, "stat_events");
        if (!ehhVar21.equals(ehhVarA21)) {
            return new pse(false, ewi.e("stat_events(ru.ok.tamtam.android.stats.StatEntity).\n Expected:\n", ehhVar21, "\n Found:\n", ehhVarA21));
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        linkedHashMap22.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap22.put("sticker_id", new bhh(0, 1, "sticker_id", "INTEGER", null, true));
        linkedHashMap22.put("width", new bhh(0, 1, "width", "INTEGER", null, true));
        linkedHashMap22.put("height", new bhh(0, 1, "height", "INTEGER", null, true));
        linkedHashMap22.put(MLFeatureConfigProviderBase.URL_KEY, new bhh(0, 1, MLFeatureConfigProviderBase.URL_KEY, "TEXT", null, false));
        linkedHashMap22.put("update_time", new bhh(0, 1, "update_time", "INTEGER", null, true));
        linkedHashMap22.put("mp4_url", new bhh(0, 1, "mp4_url", "TEXT", null, false));
        linkedHashMap22.put("first_url", new bhh(0, 1, "first_url", "TEXT", null, false));
        linkedHashMap22.put("preview_url", new bhh(0, 1, "preview_url", "TEXT", null, false));
        linkedHashMap22.put("tags", new bhh(0, 1, "tags", "TEXT", null, true));
        linkedHashMap22.put("sticker_type", new bhh(0, 1, "sticker_type", "INTEGER", null, true));
        linkedHashMap22.put("set_id", new bhh(0, 1, "set_id", "INTEGER", null, true));
        linkedHashMap22.put("lottie_url", new bhh(0, 1, "lottie_url", "TEXT", null, false));
        linkedHashMap22.put(MediaStreamTrack.AUDIO_TRACK_KIND, new bhh(0, 1, MediaStreamTrack.AUDIO_TRACK_KIND, "INTEGER", null, true));
        linkedHashMap22.put("author_type", new bhh(0, 1, "author_type", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH5 = ewi.h(linkedHashMap22, "video_url", new bhh(0, 1, "video_url", "TEXT", null, false));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new dhh("index_stickers_sticker_id", true, yab.k0("sticker_id"), yab.k0("ASC")));
        ehh ehhVar22 = new ehh("stickers", linkedHashMap22, linkedHashSetH5, linkedHashSet7);
        ehh ehhVarA22 = ovl.a(qxeVar, "stickers");
        if (!ehhVar22.equals(ehhVarA22)) {
            return new pse(false, ewi.e("stickers(ru.ok.tamtam.android.stickers.db.StickerEntity).\n Expected:\n", ehhVar22, "\n Found:\n", ehhVarA22));
        }
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        linkedHashMap23.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap23.put("server_id", new bhh(0, 1, "server_id", "INTEGER", null, true));
        linkedHashMap23.put("data", new bhh(0, 1, "data", "BLOB", null, true));
        linkedHashMap23.put("favourite_index", new bhh(0, 1, "favourite_index", "INTEGER", null, true));
        linkedHashMap23.put("sort_time", new bhh(0, 1, "sort_time", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH6 = ewi.h(linkedHashMap23, "cid", new bhh(0, 1, "cid", "INTEGER", "0", true));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new dhh("index_chats_server_id", false, yab.k0("server_id"), yab.k0("ASC")));
        linkedHashSet8.add(new dhh("index_chats_cid", false, yab.k0("cid"), yab.k0("ASC")));
        linkedHashSet8.add(new dhh("index_chats_favourite_index", false, yab.k0("favourite_index"), yab.k0("ASC")));
        linkedHashSet8.add(new dhh("index_chats_favourite_index_sort_time_id", false, xw3.P0("favourite_index", "sort_time", "id"), xw3.P0("ASC", "DESC", "DESC")));
        ehh ehhVar23 = new ehh("chats", linkedHashMap23, linkedHashSetH6, linkedHashSet8);
        ehh ehhVarA23 = ovl.a(qxeVar, "chats");
        if (!ehhVar23.equals(ehhVarA23)) {
            return new pse(false, ewi.e("chats(ru.ok.tamtam.android.chat.ChatEntity).\n Expected:\n", ehhVar23, "\n Found:\n", ehhVarA23));
        }
        LinkedHashMap linkedHashMap24 = new LinkedHashMap();
        linkedHashMap24.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap24.put("server_id", new bhh(0, 1, "server_id", "INTEGER", null, true));
        linkedHashMap24.put("time", new bhh(0, 1, "time", "INTEGER", null, true));
        linkedHashMap24.put("update_time", new bhh(0, 1, "update_time", "INTEGER", null, true));
        linkedHashMap24.put("sender", new bhh(0, 1, "sender", "INTEGER", null, true));
        linkedHashMap24.put("cid", new bhh(0, 1, "cid", "INTEGER", null, true));
        linkedHashMap24.put("text", new bhh(0, 1, "text", "TEXT", null, false));
        linkedHashMap24.put("delivery_status", new bhh(0, 1, "delivery_status", "INTEGER", null, true));
        linkedHashMap24.put("status", new bhh(0, 1, "status", "INTEGER", null, true));
        linkedHashMap24.put("status_in_process", new bhh(0, 1, "status_in_process", "INTEGER", "0", true));
        linkedHashMap24.put("time_local", new bhh(0, 1, "time_local", "INTEGER", null, true));
        linkedHashMap24.put("error", new bhh(0, 1, "error", "TEXT", null, false));
        linkedHashMap24.put("localized_error", new bhh(0, 1, "localized_error", "TEXT", null, false));
        linkedHashMap24.put("attaches", new bhh(0, 1, "attaches", "BLOB", null, false));
        linkedHashMap24.put("media_type", new bhh(0, 1, "media_type", "INTEGER", null, true));
        linkedHashMap24.put("detect_share", new bhh(0, 1, "detect_share", "INTEGER", null, true));
        linkedHashMap24.put("msg_link_type", new bhh(0, 1, "msg_link_type", "INTEGER", null, true));
        linkedHashMap24.put("msg_link_id", new bhh(0, 1, "msg_link_id", "INTEGER", null, true));
        linkedHashMap24.put("inserted_from_msg_link", new bhh(0, 1, "inserted_from_msg_link", "INTEGER", null, true));
        linkedHashMap24.put("msg_link_chat_id", new bhh(0, 1, "msg_link_chat_id", "INTEGER", null, true));
        linkedHashMap24.put("msg_link_chat_name", new bhh(0, 1, "msg_link_chat_name", "TEXT", null, false));
        linkedHashMap24.put("msg_link_chat_link", new bhh(0, 1, "msg_link_chat_link", "TEXT", null, false));
        linkedHashMap24.put("msg_link_chat_icon_url", new bhh(0, 1, "msg_link_chat_icon_url", "TEXT", null, false));
        linkedHashMap24.put("msg_link_chat_access_type", new bhh(0, 1, "msg_link_chat_access_type", "INTEGER", null, false));
        linkedHashMap24.put("msg_link_out_chat_id", new bhh(0, 1, "msg_link_out_chat_id", "INTEGER", null, true));
        linkedHashMap24.put("msg_link_out_msg_id", new bhh(0, 1, "msg_link_out_msg_id", "INTEGER", null, true));
        linkedHashMap24.put("type", new bhh(0, 1, "type", "INTEGER", null, true));
        linkedHashMap24.put("chat_id", new bhh(0, 1, "chat_id", "INTEGER", null, true));
        linkedHashMap24.put("channel_views", new bhh(0, 1, "channel_views", "INTEGER", null, true));
        linkedHashMap24.put("channel_forwards", new bhh(0, 1, "channel_forwards", "INTEGER", null, true));
        linkedHashMap24.put("view_time", new bhh(0, 1, "view_time", "INTEGER", null, true));
        linkedHashMap24.put("options", new bhh(0, 1, "options", "INTEGER", null, true));
        linkedHashMap24.put("live_until", new bhh(0, 1, "live_until", "INTEGER", null, true));
        linkedHashMap24.put("elements", new bhh(0, 1, "elements", "BLOB", null, true));
        linkedHashMap24.put("reactions", new bhh(0, 1, "reactions", "BLOB", null, false));
        linkedHashMap24.put("delayed_attrs_time_to_fire", new bhh(0, 1, "delayed_attrs_time_to_fire", "INTEGER", null, false));
        linkedHashMap24.put("delayed_attrs_notify_sender", new bhh(0, 1, "delayed_attrs_notify_sender", "INTEGER", null, false));
        LinkedHashSet linkedHashSetH7 = ewi.h(linkedHashMap24, "reactions_update_time", new bhh(0, 1, "reactions_update_time", "INTEGER", "0", true));
        linkedHashSetH7.add(new chh("chats", "NO ACTION", "NO ACTION", yab.k0("chat_id"), yab.k0("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new dhh("index_messages_chat_id", false, yab.k0("chat_id"), yab.k0("ASC")));
        linkedHashSet9.add(new dhh("index_messages_cid", false, yab.k0("cid"), yab.k0("ASC")));
        linkedHashSet9.add(new dhh("index_messages_server_id", false, yab.k0("server_id"), yab.k0("ASC")));
        linkedHashSet9.add(new dhh("index_messages_chat_id_time", false, xw3.P0("chat_id", "time"), xw3.P0("ASC", "ASC")));
        linkedHashSet9.add(new dhh("index_messages_chat_id_media_type", false, xw3.P0("chat_id", "media_type"), xw3.P0("ASC", "ASC")));
        linkedHashSet9.add(new dhh("index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender", false, xw3.P0("delayed_attrs_time_to_fire", "delayed_attrs_notify_sender"), xw3.P0("ASC", "ASC")));
        linkedHashSet9.add(new dhh("index_messages_reactions_update_time", false, yab.k0("reactions_update_time"), yab.k0("ASC")));
        ehh ehhVar24 = new ehh("messages", linkedHashMap24, linkedHashSetH7, linkedHashSet9);
        ehh ehhVarA24 = ovl.a(qxeVar, "messages");
        if (!ehhVar24.equals(ehhVarA24)) {
            return new pse(false, ewi.e("messages(ru.ok.tamtam.android.messages.MessageEntity).\n Expected:\n", ehhVar24, "\n Found:\n", ehhVarA24));
        }
        LinkedHashMap linkedHashMap25 = new LinkedHashMap();
        linkedHashMap25.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap25.put("server_id", new bhh(0, 1, "server_id", "INTEGER", null, true));
        linkedHashMap25.put("time", new bhh(0, 1, "time", "INTEGER", null, true));
        linkedHashMap25.put("update_time", new bhh(0, 1, "update_time", "INTEGER", null, true));
        linkedHashMap25.put("sender", new bhh(0, 1, "sender", "INTEGER", null, true));
        linkedHashMap25.put("cid", new bhh(0, 1, "cid", "INTEGER", null, true));
        linkedHashMap25.put("text", new bhh(0, 1, "text", "TEXT", null, false));
        linkedHashMap25.put("delivery_status", new bhh(0, 1, "delivery_status", "INTEGER", null, true));
        linkedHashMap25.put("status", new bhh(0, 1, "status", "INTEGER", null, true));
        linkedHashMap25.put("status_in_process", new bhh(0, 1, "status_in_process", "INTEGER", "0", true));
        linkedHashMap25.put("time_local", new bhh(0, 1, "time_local", "INTEGER", null, true));
        linkedHashMap25.put("error", new bhh(0, 1, "error", "TEXT", null, false));
        linkedHashMap25.put("localized_error", new bhh(0, 1, "localized_error", "TEXT", null, false));
        linkedHashMap25.put("attaches", new bhh(0, 1, "attaches", "BLOB", null, false));
        linkedHashMap25.put("media_type", new bhh(0, 1, "media_type", "INTEGER", null, true));
        linkedHashMap25.put("message_type", new bhh(0, 1, "message_type", "INTEGER", null, true));
        linkedHashMap25.put("detect_share", new bhh(0, 1, "detect_share", "INTEGER", null, true));
        linkedHashMap25.put("msg_link_type", new bhh(0, 1, "msg_link_type", "INTEGER", null, true));
        linkedHashMap25.put("msg_link_id", new bhh(0, 1, "msg_link_id", "INTEGER", null, true));
        linkedHashMap25.put("inserted_from_msg_link", new bhh(0, 1, "inserted_from_msg_link", "INTEGER", null, true));
        linkedHashMap25.put("msg_link_out_chat_id", new bhh(0, 1, "msg_link_out_chat_id", "INTEGER", null, true));
        linkedHashMap25.put("msg_link_out_post_id", new bhh(0, 1, "msg_link_out_post_id", "INTEGER", null, true));
        linkedHashMap25.put("msg_link_out_msg_id", new bhh(0, 1, "msg_link_out_msg_id", "INTEGER", null, true));
        linkedHashMap25.put("options", new bhh(0, 1, "options", "INTEGER", null, true));
        linkedHashMap25.put("elements", new bhh(0, 1, "elements", "BLOB", null, true));
        linkedHashMap25.put("reactions", new bhh(0, 1, "reactions", "BLOB", null, false));
        linkedHashMap25.put("reactions_update_time", new bhh(0, 1, "reactions_update_time", "INTEGER", "0", true));
        linkedHashMap25.put("parent_chat_server_id", new bhh(0, 1, "parent_chat_server_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH8 = ewi.h(linkedHashMap25, "parent_message_server_id", new bhh(0, 1, "parent_message_server_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new dhh("index_comments_parent_chat_server_id_parent_message_server_id", false, xw3.P0("parent_chat_server_id", "parent_message_server_id"), xw3.P0("ASC", "ASC")));
        linkedHashSet10.add(new dhh("index_comments_parent_chat_server_id_parent_message_server_id_server_id", false, xw3.P0("parent_chat_server_id", "parent_message_server_id", "server_id"), xw3.P0("ASC", "ASC", "ASC")));
        linkedHashSet10.add(new dhh("index_comments_cid", false, yab.k0("cid"), yab.k0("ASC")));
        linkedHashSet10.add(new dhh("index_comments_server_id", false, yab.k0("server_id"), yab.k0("ASC")));
        linkedHashSet10.add(new dhh("index_comments_parent_chat_server_id_parent_message_server_id_time", false, xw3.P0("parent_chat_server_id", "parent_message_server_id", "time"), xw3.P0("ASC", "ASC", "ASC")));
        linkedHashSet10.add(new dhh("index_comments_parent_chat_server_id_parent_message_server_id_media_type", false, xw3.P0("parent_chat_server_id", "parent_message_server_id", "media_type"), xw3.P0("ASC", "ASC", "ASC")));
        linkedHashSet10.add(new dhh("index_comments_reactions_update_time", false, yab.k0("reactions_update_time"), yab.k0("ASC")));
        ehh ehhVar25 = new ehh("comments", linkedHashMap25, linkedHashSetH8, linkedHashSet10);
        ehh ehhVarA25 = ovl.a(qxeVar, "comments");
        if (!ehhVar25.equals(ehhVarA25)) {
            return new pse(false, ewi.e("comments(ru.ok.tamtam.android.messages.comments.CommentEntity).\n Expected:\n", ehhVar25, "\n Found:\n", ehhVarA25));
        }
        LinkedHashMap linkedHashMap26 = new LinkedHashMap();
        linkedHashMap26.put("message_id", new bhh(1, 1, "message_id", "INTEGER", null, true));
        linkedHashMap26.put("counter", new bhh(0, 1, "counter", "INTEGER", null, true));
        ehh ehhVar26 = new ehh("message_comments", linkedHashMap26, ewi.h(linkedHashMap26, "updated_at", new bhh(0, 1, "updated_at", "INTEGER", "0", true)), new LinkedHashSet());
        ehh ehhVarA26 = ovl.a(qxeVar, "message_comments");
        if (!ehhVar26.equals(ehhVarA26)) {
            return new pse(false, ewi.e("message_comments(ru.ok.tamtam.android.messages.comments.MessageCommentsEntity).\n Expected:\n", ehhVar26, "\n Found:\n", ehhVarA26));
        }
        LinkedHashMap linkedHashMap27 = new LinkedHashMap();
        linkedHashMap27.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap27.put("update_time", new bhh(0, 1, "update_time", "INTEGER", null, true));
        linkedHashMap27.put("emoji", new bhh(0, 1, "emoji", "TEXT", null, true));
        linkedHashMap27.put("lottie_url", new bhh(0, 1, "lottie_url", "TEXT", null, false));
        linkedHashMap27.put("lottie_play_url", new bhh(0, 1, "lottie_play_url", "TEXT", null, false));
        linkedHashMap27.put("set_id", new bhh(0, 1, "set_id", "INTEGER", null, false));
        ehh ehhVar27 = new ehh("animoji", linkedHashMap27, ewi.h(linkedHashMap27, "icon_url", new bhh(0, 1, "icon_url", "TEXT", "NULL", false)), new LinkedHashSet());
        ehh ehhVarA27 = ovl.a(qxeVar, "animoji");
        if (!ehhVar27.equals(ehhVarA27)) {
            return new pse(false, ewi.e("animoji(ru.ok.tamtam.android.animoji.db.AnimojiEntity).\n Expected:\n", ehhVar27, "\n Found:\n", ehhVarA27));
        }
        LinkedHashMap linkedHashMap28 = new LinkedHashMap();
        linkedHashMap28.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap28.put(SdkMetricStatEvent.NAME_KEY, new bhh(0, 1, SdkMetricStatEvent.NAME_KEY, "TEXT", null, true));
        linkedHashMap28.put("icon_url", new bhh(0, 1, "icon_url", "TEXT", null, true));
        linkedHashMap28.put("icon_lottie_url", new bhh(0, 1, "icon_lottie_url", "TEXT", null, false));
        linkedHashMap28.put("update_time", new bhh(0, 1, "update_time", "INTEGER", null, true));
        ehh ehhVar28 = new ehh("animoji_set", linkedHashMap28, ewi.h(linkedHashMap28, "animoji_ids", new bhh(0, 1, "animoji_ids", "TEXT", null, true)), new LinkedHashSet());
        ehh ehhVarA28 = ovl.a(qxeVar, "animoji_set");
        if (!ehhVar28.equals(ehhVarA28)) {
            return new pse(false, ewi.e("animoji_set(ru.ok.tamtam.android.animoji.db.AnimojiSetEntity).\n Expected:\n", ehhVar28, "\n Found:\n", ehhVarA28));
        }
        LinkedHashMap linkedHashMap29 = new LinkedHashMap();
        linkedHashMap29.put("id", new bhh(1, 1, "id", "TEXT", null, true));
        linkedHashMap29.put("update_time", new bhh(0, 1, "update_time", "INTEGER", null, true));
        ehh ehhVar29 = new ehh("reactions_section", linkedHashMap29, ewi.h(linkedHashMap29, "reactions", new bhh(0, 1, "reactions", "TEXT", null, true)), new LinkedHashSet());
        ehh ehhVarA29 = ovl.a(qxeVar, "reactions_section");
        if (!ehhVar29.equals(ehhVarA29)) {
            return new pse(false, ewi.e("reactions_section(ru.ok.tamtam.android.animoji.db.ReactionsSectionEntity).\n Expected:\n", ehhVar29, "\n Found:\n", ehhVarA29));
        }
        LinkedHashMap linkedHashMap30 = new LinkedHashMap();
        linkedHashMap30.put("user_id", new bhh(1, 1, "user_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH9 = ewi.h(linkedHashMap30, "chat_id", new bhh(0, 1, "chat_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        linkedHashSet11.add(new dhh("index_saved_msg_chat_chat_id", true, yab.k0("chat_id"), yab.k0("ASC")));
        ehh ehhVar30 = new ehh("saved_msg_chat", linkedHashMap30, linkedHashSetH9, linkedHashSet11);
        ehh ehhVarA30 = ovl.a(qxeVar, "saved_msg_chat");
        if (!ehhVar30.equals(ehhVarA30)) {
            return new pse(false, ewi.e("saved_msg_chat(ru.ok.tamtam.android.chat.SavedMessagesChatEntity).\n Expected:\n", ehhVar30, "\n Found:\n", ehhVarA30));
        }
        LinkedHashMap linkedHashMap31 = new LinkedHashMap();
        linkedHashMap31.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap31.put("user_id", new bhh(0, 1, "user_id", "INTEGER", null, true));
        linkedHashMap31.put("bot_id", new bhh(0, 1, "bot_id", "INTEGER", null, true));
        linkedHashMap31.put(ApiProtocol.KEY_TOKEN, new bhh(0, 1, ApiProtocol.KEY_TOKEN, "TEXT", null, false));
        linkedHashMap31.put("access_requested", new bhh(0, 1, "access_requested", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH10 = ewi.h(linkedHashMap31, "access_granted", new bhh(0, 1, "access_granted", "INTEGER", null, true));
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        linkedHashSet12.add(new dhh("index_webapp_biometry_user_id", false, yab.k0("user_id"), yab.k0("ASC")));
        linkedHashSet12.add(new dhh("index_webapp_biometry_bot_id", false, yab.k0("bot_id"), yab.k0("ASC")));
        ehh ehhVar31 = new ehh("webapp_biometry", linkedHashMap31, linkedHashSetH10, linkedHashSet12);
        ehh ehhVarA31 = ovl.a(qxeVar, "webapp_biometry");
        if (!ehhVar31.equals(ehhVarA31)) {
            return new pse(false, ewi.e("webapp_biometry(ru.ok.tamtam.android.webapp.WebAppBiometryEntity).\n Expected:\n", ehhVar31, "\n Found:\n", ehhVarA31));
        }
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        linkedHashMap32.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap32.put("server_id", new bhh(0, 1, "server_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH11 = ewi.h(linkedHashMap32, "profile", new bhh(0, 1, "profile", "BLOB", null, true));
        LinkedHashSet linkedHashSet13 = new LinkedHashSet();
        linkedHashSet13.add(new dhh("index_profile_server_id", true, yab.k0("server_id"), yab.k0("ASC")));
        ehh ehhVar32 = new ehh("profile", linkedHashMap32, linkedHashSetH11, linkedHashSet13);
        ehh ehhVarA32 = ovl.a(qxeVar, "profile");
        if (!ehhVar32.equals(ehhVarA32)) {
            return new pse(false, ewi.e("profile(ru.ok.tamtam.android.profile.db.ProfileEntity).\n Expected:\n", ehhVar32, "\n Found:\n", ehhVarA32));
        }
        LinkedHashMap linkedHashMap33 = new LinkedHashMap();
        linkedHashMap33.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap33.put("type_id", new bhh(0, 1, "type_id", "INTEGER", null, true));
        ehh ehhVar33 = new ehh("complain_reasons", linkedHashMap33, ewi.h(linkedHashMap33, "complain_reasons", new bhh(0, 1, "complain_reasons", "TEXT", null, true)), new LinkedHashSet());
        ehh ehhVarA33 = ovl.a(qxeVar, "complain_reasons");
        if (!ehhVar33.equals(ehhVarA33)) {
            return new pse(false, ewi.e("complain_reasons(ru.ok.tamtam.android.complain.ComplainReasonsEntity).\n Expected:\n", ehhVar33, "\n Found:\n", ehhVarA33));
        }
        LinkedHashMap linkedHashMap34 = new LinkedHashMap();
        linkedHashMap34.put("id", new bhh(1, 1, "id", "TEXT", null, true));
        linkedHashMap34.put("title", new bhh(0, 1, "title", "TEXT", null, true));
        linkedHashMap34.put("settings", new bhh(0, 1, "settings", "INTEGER", "0", true));
        linkedHashMap34.put("description", new bhh(0, 1, "description", "TEXT", null, false));
        linkedHashMap34.put(LogFactory.PRIORITY_KEY, new bhh(0, 1, LogFactory.PRIORITY_KEY, "INTEGER", null, true));
        linkedHashMap34.put("repeat", new bhh(0, 1, "repeat", "INTEGER", null, true));
        linkedHashMap34.put("rerun", new bhh(0, 1, "rerun", "INTEGER", null, true));
        linkedHashMap34.put("animoji_id", new bhh(0, 1, "animoji_id", "INTEGER", null, false));
        linkedHashMap34.put(MLFeatureConfigProviderBase.URL_KEY, new bhh(0, 1, MLFeatureConfigProviderBase.URL_KEY, "TEXT", null, false));
        linkedHashMap34.put("type", new bhh(0, 1, "type", "INTEGER", null, true));
        linkedHashMap34.put("click_time", new bhh(0, 1, "click_time", "INTEGER", "0", true));
        linkedHashMap34.put("show_time", new bhh(0, 1, "show_time", "INTEGER", "0", true));
        linkedHashMap34.put("close_time", new bhh(0, 1, "close_time", "INTEGER", "0", true));
        linkedHashMap34.put("show_count", new bhh(0, 1, "show_count", "INTEGER", "0", true));
        ehh ehhVar34 = new ehh("informer_banner", linkedHashMap34, ewi.h(linkedHashMap34, "button_text", new bhh(0, 1, "button_text", "TEXT", "NULL", false)), new LinkedHashSet());
        ehh ehhVarA34 = ovl.a(qxeVar, "informer_banner");
        if (!ehhVar34.equals(ehhVarA34)) {
            return new pse(false, ewi.e("informer_banner(ru.ok.tamtam.android.informer.InformerBannerEntity).\n Expected:\n", ehhVar34, "\n Found:\n", ehhVarA34));
        }
        LinkedHashMap linkedHashMap35 = new LinkedHashMap();
        linkedHashMap35.put("traceId", new bhh(1, 1, "traceId", "TEXT", null, true));
        linkedHashMap35.put("metricName", new bhh(0, 1, "metricName", "TEXT", null, true));
        linkedHashMap35.put("lastUpdatedTime", new bhh(0, 1, "lastUpdatedTime", "INTEGER", null, true));
        linkedHashMap35.put("spanAndPropertiesDump", new bhh(0, 1, "spanAndPropertiesDump", "BLOB", null, true));
        linkedHashMap35.put("attempt", new bhh(0, 1, "attempt", "INTEGER", "0", true));
        ehh ehhVar35 = new ehh("metrics", linkedHashMap35, ewi.h(linkedHashMap35, "isMarkedAsFailed", new bhh(0, 1, "isMarkedAsFailed", "INTEGER", "false", true)), new LinkedHashSet());
        ehh ehhVarA35 = ovl.a(qxeVar, "metrics");
        if (!ehhVar35.equals(ehhVarA35)) {
            return new pse(false, ewi.e("metrics(one.me.sdk.statistics.perf.database.metrics.MetricEntity).\n Expected:\n", ehhVar35, "\n Found:\n", ehhVarA35));
        }
        LinkedHashMap linkedHashMap36 = new LinkedHashMap();
        linkedHashMap36.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap36.put("sliceTime", new bhh(0, 1, "sliceTime", "INTEGER", null, true));
        linkedHashMap36.put(ApiProtocol.PARAM_PAYLOAD, new bhh(0, 1, ApiProtocol.PARAM_PAYLOAD, "BLOB", null, true));
        LinkedHashSet linkedHashSetH12 = ewi.h(linkedHashMap36, "type", new bhh(0, 1, "type", "INTEGER", null, true));
        LinkedHashSet linkedHashSet14 = new LinkedHashSet();
        linkedHashSet14.add(new dhh("index_perf_snapshots_type", false, yab.k0("type"), yab.k0("ASC")));
        ehh ehhVar36 = new ehh("perf_snapshots", linkedHashMap36, linkedHashSetH12, linkedHashSet14);
        ehh ehhVarA36 = ovl.a(qxeVar, "perf_snapshots");
        if (!ehhVar36.equals(ehhVarA36)) {
            return new pse(false, ewi.e("perf_snapshots(one.me.sdk.statistics.perf.database.snapshots.SnapshotEntity).\n Expected:\n", ehhVar36, "\n Found:\n", ehhVarA36));
        }
        LinkedHashMap linkedHashMap37 = new LinkedHashMap();
        linkedHashMap37.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap37.put(SdkMetricStatEvent.NAME_KEY, new bhh(0, 1, SdkMetricStatEvent.NAME_KEY, "TEXT", null, true));
        linkedHashMap37.put("description", new bhh(0, 1, "description", "TEXT", null, false));
        linkedHashMap37.put("parentId", new bhh(0, 1, "parentId", "INTEGER", null, false));
        linkedHashMap37.put("folderTemplateId", new bhh(0, 1, "folderTemplateId", "INTEGER", null, false));
        linkedHashMap37.put("updateTime", new bhh(0, 1, "updateTime", "INTEGER", null, true));
        linkedHashMap37.put("iconUrl", new bhh(0, 1, "iconUrl", "TEXT", null, false));
        ehh ehhVar37 = new ehh("organizations", linkedHashMap37, ewi.h(linkedHashMap37, "links", new bhh(0, 1, "links", "TEXT", null, false)), new LinkedHashSet());
        ehh ehhVarA37 = ovl.a(qxeVar, "organizations");
        if (!ehhVar37.equals(ehhVarA37)) {
            return new pse(false, ewi.e("organizations(one.me.organizations.OrganizationEntity).\n Expected:\n", ehhVar37, "\n Found:\n", ehhVarA37));
        }
        LinkedHashMap linkedHashMap38 = new LinkedHashMap();
        linkedHashMap38.put("history_id", new bhh(1, 1, "history_id", "INTEGER", null, true));
        linkedHashMap38.put("call_id", new bhh(0, 1, "call_id", "TEXT", null, true));
        linkedHashMap38.put("call_name", new bhh(0, 1, "call_name", "TEXT", null, false));
        linkedHashMap38.put("caller_id", new bhh(0, 1, "caller_id", "INTEGER", null, true));
        linkedHashMap38.put("message_id", new bhh(0, 1, "message_id", "INTEGER", null, false));
        linkedHashMap38.put("chat_id", new bhh(0, 1, "chat_id", "INTEGER", null, true));
        linkedHashMap38.put("call_type", new bhh(0, 1, "call_type", "TEXT", null, true));
        linkedHashMap38.put("hangup_type", new bhh(0, 1, "hangup_type", "TEXT", null, false));
        linkedHashMap38.put(ApiProtocol.KEY_JOIN_LINK, new bhh(0, 1, ApiProtocol.KEY_JOIN_LINK, "TEXT", null, false));
        linkedHashMap38.put("time", new bhh(0, 1, "time", "INTEGER", null, true));
        linkedHashMap38.put("duration_ms", new bhh(0, 1, "duration_ms", "INTEGER", null, false));
        LinkedHashSet linkedHashSetH13 = ewi.h(linkedHashMap38, "group_call_type", new bhh(0, 1, "group_call_type", "INTEGER", null, false));
        LinkedHashSet linkedHashSet15 = new LinkedHashSet();
        linkedHashSet15.add(new dhh("index_call_history_hangup_type_caller_id_time", false, xw3.P0("hangup_type", "caller_id", "time"), xw3.P0("ASC", "ASC", "ASC")));
        ehh ehhVar38 = new ehh("call_history", linkedHashMap38, linkedHashSetH13, linkedHashSet15);
        ehh ehhVarA38 = ovl.a(qxeVar, "call_history");
        if (!ehhVar38.equals(ehhVarA38)) {
            return new pse(false, ewi.e("call_history(ru.ok.tamtam.android.calls.CallHistoryEntity).\n Expected:\n", ehhVar38, "\n Found:\n", ehhVarA38));
        }
        LinkedHashMap linkedHashMap39 = new LinkedHashMap();
        linkedHashMap39.put("id", new bhh(1, 1, "id", "INTEGER", null, true));
        linkedHashMap39.put("chat_id", new bhh(0, 1, "chat_id", "INTEGER", null, true));
        linkedHashMap39.put("message_id", new bhh(0, 1, "message_id", "INTEGER", null, true));
        linkedHashMap39.put("attach_id", new bhh(0, 1, "attach_id", "INTEGER", null, true));
        linkedHashMap39.put("type", new bhh(0, 1, "type", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH14 = ewi.h(linkedHashMap39, "size", new bhh(0, 1, "size", "INTEGER", null, true));
        LinkedHashSet linkedHashSet16 = new LinkedHashSet();
        linkedHashSet16.add(new dhh("index_media_cache_chat_id_message_id_attach_id", true, xw3.P0("chat_id", "message_id", "attach_id"), xw3.P0("ASC", "ASC", "ASC")));
        linkedHashSet16.add(new dhh("index_media_cache_chat_id", false, yab.k0("chat_id"), yab.k0("ASC")));
        linkedHashSet16.add(new dhh("index_media_cache_type", false, yab.k0("type"), yab.k0("ASC")));
        ehh ehhVar39 = new ehh("media_cache", linkedHashMap39, linkedHashSetH14, linkedHashSet16);
        ehh ehhVarA39 = ovl.a(qxeVar, "media_cache");
        if (!ehhVar39.equals(ehhVarA39)) {
            return new pse(false, ewi.e("media_cache(one.me.sdk.media.cache.database.MediaCacheEntity).\n Expected:\n", ehhVar39, "\n Found:\n", ehhVarA39));
        }
        LinkedHashMap linkedHashMap40 = new LinkedHashMap();
        linkedHashMap40.put("draft_id", new bhh(1, 1, "draft_id", "INTEGER", null, true));
        linkedHashMap40.put("media_path", new bhh(0, 1, "media_path", "TEXT", null, true));
        linkedHashMap40.put("preview_path", new bhh(0, 1, "preview_path", "TEXT", null, false));
        linkedHashMap40.put("type", new bhh(0, 1, "type", "INTEGER", null, true));
        linkedHashMap40.put("expiration_ms", new bhh(0, 1, "expiration_ms", "INTEGER", null, true));
        linkedHashMap40.put("settings", new bhh(0, 1, "settings", "INTEGER", null, true));
        linkedHashMap40.put("canvas_width", new bhh(0, 1, "canvas_width", "INTEGER", null, true));
        linkedHashMap40.put("canvas_height", new bhh(0, 1, "canvas_height", "INTEGER", null, true));
        ehh ehhVar40 = new ehh("story_drafts", linkedHashMap40, ewi.h(linkedHashMap40, "created_at", new bhh(0, 1, "created_at", "INTEGER", null, true)), new LinkedHashSet());
        ehh ehhVarA40 = ovl.a(qxeVar, "story_drafts");
        if (!ehhVar40.equals(ehhVarA40)) {
            return new pse(false, ewi.e("story_drafts(one.me.stories.database.entity.StoryDraftEntity).\n Expected:\n", ehhVar40, "\n Found:\n", ehhVarA40));
        }
        LinkedHashMap linkedHashMap41 = new LinkedHashMap();
        linkedHashMap41.put("publish_id", new bhh(1, 1, "publish_id", "INTEGER", null, true));
        linkedHashMap41.put("draft_id", new bhh(0, 1, "draft_id", "INTEGER", null, true));
        linkedHashMap41.put("segment_index", new bhh(0, 1, "segment_index", "INTEGER", null, true));
        linkedHashMap41.put("story_id", new bhh(0, 1, "story_id", "INTEGER", null, true));
        linkedHashMap41.put("segment_path", new bhh(0, 1, "segment_path", "TEXT", null, true));
        linkedHashMap41.put("is_video", new bhh(0, 1, "is_video", "INTEGER", null, true));
        linkedHashMap41.put("upload_token", new bhh(0, 1, "upload_token", "TEXT", null, false));
        linkedHashMap41.put("status", new bhh(0, 1, "status", "INTEGER", "0", true));
        LinkedHashSet linkedHashSetH15 = ewi.h(linkedHashMap41, "created_at", new bhh(0, 1, "created_at", "INTEGER", null, true));
        LinkedHashSet linkedHashSet17 = new LinkedHashSet();
        linkedHashSet17.add(new dhh("index_story_publish_draft_id", false, yab.k0("draft_id"), yab.k0("ASC")));
        ehh ehhVar41 = new ehh("story_publish", linkedHashMap41, linkedHashSetH15, linkedHashSet17);
        ehh ehhVarA41 = ovl.a(qxeVar, "story_publish");
        if (!ehhVar41.equals(ehhVarA41)) {
            return new pse(false, ewi.e("story_publish(one.me.stories.database.entity.StoryPublishEntity).\n Expected:\n", ehhVar41, "\n Found:\n", ehhVarA41));
        }
        LinkedHashMap linkedHashMap42 = new LinkedHashMap();
        linkedHashMap42.put("layer_id", new bhh(2, 1, "layer_id", "INTEGER", null, true));
        linkedHashMap42.put("draft_id", new bhh(1, 1, "draft_id", "INTEGER", null, true));
        linkedHashMap42.put("position", new bhh(0, 1, "position", "INTEGER", "0", true));
        linkedHashMap42.put("align_mode", new bhh(0, 1, "align_mode", "TEXT", null, true));
        linkedHashMap42.put("text_color", new bhh(0, 1, "text_color", "INTEGER", null, true));
        linkedHashMap42.put("text_background_color", new bhh(0, 1, "text_background_color", "INTEGER", null, true));
        linkedHashMap42.put("text", new bhh(0, 1, "text", "TEXT", null, true));
        linkedHashMap42.put("text_style", new bhh(0, 1, "text_style", "TEXT", null, true));
        linkedHashMap42.put("layout_width", new bhh(0, 1, "layout_width", "INTEGER", null, true));
        linkedHashMap42.put("translation_x", new bhh(0, 1, "translation_x", "REAL", null, true));
        linkedHashMap42.put("translation_y", new bhh(0, 1, "translation_y", "REAL", null, true));
        linkedHashMap42.put("scale", new bhh(0, 1, "scale", "REAL", null, true));
        linkedHashMap42.put("rotation", new bhh(0, 1, "rotation", "REAL", null, true));
        linkedHashMap42.put("text_bounds_left", new bhh(0, 1, "text_bounds_left", "REAL", null, false));
        linkedHashMap42.put("text_bounds_top", new bhh(0, 1, "text_bounds_top", "REAL", null, false));
        linkedHashMap42.put("text_bounds_right", new bhh(0, 1, "text_bounds_right", "REAL", null, false));
        LinkedHashSet linkedHashSetH16 = ewi.h(linkedHashMap42, "text_bounds_bottom", new bhh(0, 1, "text_bounds_bottom", "REAL", null, false));
        linkedHashSetH16.add(new chh("story_drafts", "CASCADE", "NO ACTION", yab.k0("draft_id"), yab.k0("draft_id")));
        LinkedHashSet linkedHashSet18 = new LinkedHashSet();
        linkedHashSet18.add(new dhh("index_story_draft_text_layers_draft_id", false, yab.k0("draft_id"), yab.k0("ASC")));
        ehh ehhVar42 = new ehh("story_draft_text_layers", linkedHashMap42, linkedHashSetH16, linkedHashSet18);
        ehh ehhVarA42 = ovl.a(qxeVar, "story_draft_text_layers");
        if (!ehhVar42.equals(ehhVarA42)) {
            return new pse(false, ewi.e("story_draft_text_layers(one.me.stories.database.entity.StoryDraftTextLayerEntity).\n Expected:\n", ehhVar42, "\n Found:\n", ehhVarA42));
        }
        LinkedHashMap linkedHashMap43 = new LinkedHashMap();
        linkedHashMap43.put("draft_id", new bhh(1, 1, "draft_id", "INTEGER", null, true));
        linkedHashMap43.put("layer_id", new bhh(2, 1, "layer_id", "INTEGER", null, true));
        linkedHashMap43.put("position", new bhh(0, 1, "position", "INTEGER", null, true));
        linkedHashMap43.put("color", new bhh(0, 1, "color", "INTEGER", null, true));
        linkedHashMap43.put("width", new bhh(0, 1, "width", "REAL", null, true));
        linkedHashMap43.put("primitives", new bhh(0, 1, "primitives", "BLOB", null, true));
        linkedHashMap43.put("bounds_left", new bhh(0, 1, "bounds_left", "INTEGER", null, true));
        linkedHashMap43.put("bounds_top", new bhh(0, 1, "bounds_top", "INTEGER", null, true));
        linkedHashMap43.put("bounds_right", new bhh(0, 1, "bounds_right", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH17 = ewi.h(linkedHashMap43, "bounds_bottom", new bhh(0, 1, "bounds_bottom", "INTEGER", null, true));
        linkedHashSetH17.add(new chh("story_drafts", "CASCADE", "NO ACTION", yab.k0("draft_id"), yab.k0("draft_id")));
        LinkedHashSet linkedHashSet19 = new LinkedHashSet();
        linkedHashSet19.add(new dhh("index_story_draft_drawing_layers_draft_id", false, yab.k0("draft_id"), yab.k0("ASC")));
        ehh ehhVar43 = new ehh("story_draft_drawing_layers", linkedHashMap43, linkedHashSetH17, linkedHashSet19);
        ehh ehhVarA43 = ovl.a(qxeVar, "story_draft_drawing_layers");
        if (!ehhVar43.equals(ehhVarA43)) {
            return new pse(false, ewi.e("story_draft_drawing_layers(one.me.stories.database.entity.StoryDraftDrawingLayerEntity).\n Expected:\n", ehhVar43, "\n Found:\n", ehhVarA43));
        }
        LinkedHashMap linkedHashMap44 = new LinkedHashMap();
        linkedHashMap44.put("draft_id", new bhh(1, 1, "draft_id", "INTEGER", null, true));
        linkedHashMap44.put("duration_ms", new bhh(0, 1, "duration_ms", "INTEGER", null, true));
        linkedHashMap44.put("is_muted", new bhh(0, 1, "is_muted", "INTEGER", null, true));
        linkedHashMap44.put("trim_start_fraction", new bhh(0, 1, "trim_start_fraction", "REAL", null, true));
        LinkedHashSet linkedHashSetH18 = ewi.h(linkedHashMap44, "trim_end_fraction", new bhh(0, 1, "trim_end_fraction", "REAL", null, true));
        linkedHashSetH18.add(new chh("story_drafts", "CASCADE", "NO ACTION", yab.k0("draft_id"), yab.k0("draft_id")));
        ehh ehhVar44 = new ehh("story_draft_video_attrs", linkedHashMap44, linkedHashSetH18, new LinkedHashSet());
        ehh ehhVarA44 = ovl.a(qxeVar, "story_draft_video_attrs");
        if (!ehhVar44.equals(ehhVarA44)) {
            return new pse(false, ewi.e("story_draft_video_attrs(one.me.stories.database.entity.StoryDraftVideoAttrsEntity).\n Expected:\n", ehhVar44, "\n Found:\n", ehhVarA44));
        }
        LinkedHashMap linkedHashMap45 = new LinkedHashMap();
        linkedHashMap45.put("draft_id", new bhh(1, 1, "draft_id", "INTEGER", null, true));
        LinkedHashSet linkedHashSetH19 = ewi.h(linkedHashMap45, "background_id", new bhh(0, 1, "background_id", "TEXT", null, true));
        linkedHashSetH19.add(new chh("story_drafts", "CASCADE", "NO ACTION", yab.k0("draft_id"), yab.k0("draft_id")));
        ehh ehhVar45 = new ehh("story_draft_text_attrs", linkedHashMap45, linkedHashSetH19, new LinkedHashSet());
        ehh ehhVarA45 = ovl.a(qxeVar, "story_draft_text_attrs");
        if (!ehhVar45.equals(ehhVarA45)) {
            return new pse(false, ewi.e("story_draft_text_attrs(one.me.stories.database.entity.StoryDraftTextAttrsEntity).\n Expected:\n", ehhVar45, "\n Found:\n", ehhVarA45));
        }
        LinkedHashMap linkedHashMap46 = new LinkedHashMap();
        linkedHashMap46.put("draft_id", new bhh(1, 1, "draft_id", "INTEGER", null, true));
        linkedHashMap46.put("translation_x", new bhh(0, 1, "translation_x", "REAL", null, true));
        linkedHashMap46.put("translation_y", new bhh(0, 1, "translation_y", "REAL", null, true));
        linkedHashMap46.put("scale", new bhh(0, 1, "scale", "REAL", null, true));
        linkedHashMap46.put("rotation", new bhh(0, 1, "rotation", "REAL", null, true));
        linkedHashMap46.put("pivot_x", new bhh(0, 1, "pivot_x", "REAL", null, true));
        LinkedHashSet linkedHashSetH20 = ewi.h(linkedHashMap46, "pivot_y", new bhh(0, 1, "pivot_y", "REAL", null, true));
        linkedHashSetH20.add(new chh("story_drafts", "CASCADE", "NO ACTION", yab.k0("draft_id"), yab.k0("draft_id")));
        ehh ehhVar46 = new ehh("story_draft_media_transform", linkedHashMap46, linkedHashSetH20, new LinkedHashSet());
        ehh ehhVarA46 = ovl.a(qxeVar, "story_draft_media_transform");
        if (!ehhVar46.equals(ehhVarA46)) {
            return new pse(false, ewi.e("story_draft_media_transform(one.me.stories.database.entity.StoryDraftMediaTransformEntity).\n Expected:\n", ehhVar46, "\n Found:\n", ehhVarA46));
        }
        LinkedHashMap linkedHashMap47 = new LinkedHashMap();
        linkedHashMap47.put("attach_id", new bhh(1, 1, "attach_id", "INTEGER", null, true));
        ehh ehhVar47 = new ehh("gallery_saved_index", linkedHashMap47, ewi.h(linkedHashMap47, "type", new bhh(2, 1, "type", "INTEGER", null, true)), new LinkedHashSet());
        ehh ehhVarA47 = ovl.a(qxeVar, "gallery_saved_index");
        return !ehhVar47.equals(ehhVarA47) ? new pse(false, ewi.e("gallery_saved_index(one.me.sdk.media.cache.database.autosave.AutoSavedEntity).\n Expected:\n", ehhVar47, "\n Found:\n", ehhVarA47)) : new pse(true, (String) null);
    }

    private final void w() {
    }

    private final void x() {
    }

    private final void y() {
    }

    private final void z() {
    }

    @Override // defpackage.pic
    public final void a(qxe qxeVar) {
        switch (this.d) {
            case 0:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `uploads` (`attach_local_id` TEXT, `prepared_path` TEXT, `file_name` TEXT, `upload_url` TEXT, `upload_progress` REAL NOT NULL, `total_bytes` INTEGER NOT NULL, `upload_status` INTEGER, `created_time` INTEGER NOT NULL, `is_transload` INTEGER NOT NULL DEFAULT false, `path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER NOT NULL, `photo_token` TEXT, `attach_id` INTEGER, `thumbhash_base64` TEXT, `desired_uploader` TEXT, PRIMARY KEY(`path`, `last_modified`, `upload_type`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `message_uploads` (`path` TEXT, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER, `message_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `attach_id` TEXT NOT NULL, `video_quality` INTEGER, `video_start_trim_position` REAL, `video_end_trim_position` REAL, `video_fragments_paths` TEXT, `mute` INTEGER DEFAULT false, PRIMARY KEY(`message_id`, `chat_id`, `attach_id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `video_conversions` (`finished` INTEGER NOT NULL, `prepared_mime_type` TEXT, `prepared_path` TEXT, `result_path` TEXT, `source_uri` TEXT NOT NULL, `quality` INTEGER NOT NULL, `start_trim_position` REAL NOT NULL, `end_trim_position` REAL NOT NULL, `mute` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`source_uri`, `quality`, `start_trim_position`, `end_trim_position`, `mute`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `video_message_preparations` (`attach_local_id` TEXT NOT NULL, `result_path` TEXT NOT NULL, `unrecoverable_exception` TEXT, PRIMARY KEY(`attach_local_id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `sticker_sets` (`id` INTEGER NOT NULL, `name` TEXT, `icon_url` TEXT, `author_id` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, `updated_time` INTEGER NOT NULL, `link` TEXT NOT NULL, `stickers` TEXT NOT NULL, `draft` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `favorite_sticker_sets` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `favorite_stickers` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `recent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `recent_type` INTEGER NOT NULL, `recent_time` INTEGER NOT NULL, `server_id` INTEGER NOT NULL DEFAULT 0, `sticker_id` INTEGER, `emoji` TEXT, `gif` BLOB, `gif_id` INTEGER)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `fcm_notifications` (`message_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `chat_title` TEXT, `sender_user_name` TEXT, `sender_user_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `text` TEXT NOT NULL, `push_id` INTEGER NOT NULL, `event_key` TEXT, `large_image_url` TEXT DEFAULT NULL, `fire_m` INTEGER NOT NULL DEFAULT 0, `has_any_error` INTEGER NOT NULL DEFAULT 0, `url` TEXT DEFAULT NULL, `bmd` TEXT DEFAULT NULL, `source` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `post_id` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`chat_id`, `message_id`, `post_id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `fcm_notifications_history` (`last_notify_msg_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `post_id` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`chat_id`, `post_id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `fcm_notifications_analytics` (`push_id` INTEGER NOT NULL, `msg_id` INTEGER NOT NULL, `analytics_status` INTEGER NOT NULL, `suid` INTEGER, `content_length` INTEGER NOT NULL, `sent_time` INTEGER, `event_key` TEXT, `fcm_sent_time` INTEGER NOT NULL, `received_time` INTEGER NOT NULL, `push_type` TEXT NOT NULL, `time` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `post_id` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`chat_id`, `post_id`, `msg_id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `notifications_read_marks` (`mark` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `post_id` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`chat_id`, `post_id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `notifications_tracker_messages` (`message_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `push_source` INTEGER DEFAULT NULL, `drop_reason` TEXT, `push_type` TEXT, `show_analytics_sent` INTEGER NOT NULL DEFAULT 0, `chat_id` INTEGER NOT NULL, `post_id` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`message_id`, `chat_id`, `post_id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `call_notifications_analytics` (`call_id` TEXT NOT NULL, `chat_id` INTEGER NOT NULL, `push_source` INTEGER NOT NULL, `received_time` INTEGER NOT NULL, `push_id` INTEGER, `event_key` TEXT, `suid` INTEGER, `sent_time` INTEGER, `fcm_sent_time` INTEGER, `drop_reason` TEXT, `created_time` INTEGER NOT NULL, PRIMARY KEY(`call_id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `chat_folder` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `order` INTEGER NOT NULL, `emoji` TEXT DEFAULT NULL, `filters` TEXT NOT NULL, `isHiddenForAllFolder` INTEGER NOT NULL, `elements` BLOB DEFAULT NULL, `filterSubjects` BLOB DEFAULT NULL, `widgets` BLOB DEFAULT NULL, `options` BLOB DEFAULT NULL, `updateTime` INTEGER NOT NULL DEFAULT 0, `favorites` BLOB DEFAULT NULL, `templateId` INTEGER DEFAULT NULL, `sourceId` INTEGER DEFAULT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_chat_folder_filters` ON `chat_folder` (`filters`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `folder_and_chats` (`chatId` INTEGER NOT NULL, `folderId` TEXT NOT NULL, PRIMARY KEY(`chatId`, `folderId`))");
                n1g.u(qxeVar, "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)");
                n1g.u(qxeVar, "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `WorkerQueueItem` (`uuid` TEXT NOT NULL, `uniqueWorkName` TEXT NOT NULL, `existingWorkPolicy` TEXT NOT NULL, `tags` TEXT NOT NULL, `time` INTEGER NOT NULL, `state` INTEGER NOT NULL DEFAULT 0, `work_spec_id` TEXT NOT NULL, `work_spec_state` INTEGER NOT NULL, `work_spec_worker_class_name` TEXT NOT NULL, `work_spec_input_merger_class_name` TEXT NOT NULL, `work_spec_input` BLOB NOT NULL, `work_spec_output` BLOB NOT NULL, `work_spec_initial_delay` INTEGER NOT NULL, `work_spec_interval_duration` INTEGER NOT NULL, `work_spec_flex_duration` INTEGER NOT NULL, `work_spec_run_attempt_count` INTEGER NOT NULL, `work_spec_backoff_policy` INTEGER NOT NULL, `work_spec_backoff_delay_duration` INTEGER NOT NULL, `work_spec_last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `work_spec_minimum_retention_duration` INTEGER NOT NULL, `work_spec_schedule_requested_at` INTEGER NOT NULL, `work_spec_run_in_foreground` INTEGER NOT NULL, `work_spec_out_of_quota_policy` INTEGER NOT NULL, `work_spec_period_count` INTEGER NOT NULL DEFAULT 0, `work_spec_generation` INTEGER NOT NULL DEFAULT 0, `work_spec_next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `work_spec_next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `work_spec_stop_reason` INTEGER NOT NULL DEFAULT -256, `work_spec_trace_tag` TEXT, `work_spec_backoff_on_system_interruptions` INTEGER, `work_spec_required_network_type` INTEGER NOT NULL, `work_spec_required_network_request` BLOB NOT NULL DEFAULT x'', `work_spec_requires_charging` INTEGER NOT NULL, `work_spec_requires_device_idle` INTEGER NOT NULL, `work_spec_requires_battery_not_low` INTEGER NOT NULL, `work_spec_requires_storage_not_low` INTEGER NOT NULL, `work_spec_trigger_content_update_delay` INTEGER NOT NULL, `work_spec_trigger_max_content_delay` INTEGER NOT NULL, `work_spec_content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`uuid`))");
                n1g.u(qxeVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration` ON `WorkerQueueItem` (`uniqueWorkName`, `work_spec_interval_duration`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_schedule_requested_at` ON `WorkerQueueItem` (`work_spec_schedule_requested_at`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_last_enqueue_time` ON `WorkerQueueItem` (`work_spec_last_enqueue_time`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_time` ON `WorkerQueueItem` (`time`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `tasks` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `status` INTEGER NOT NULL, `fails_count` INTEGER NOT NULL, `depends_request_id` INTEGER NOT NULL, `dependency_type` INTEGER NOT NULL, `data` BLOB NOT NULL, `created_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `data` BLOB NOT NULL)");
                n1g.u(qxeVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_contacts_server_id` ON `contacts` (`server_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `phones` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `phonebook_id` INTEGER NOT NULL, `contact_id` INTEGER NOT NULL, `phone` TEXT NOT NULL, `phone_key` TEXT NOT NULL, `server_phone` INTEGER NOT NULL, `email` TEXT, `first_name` TEXT NOT NULL, `last_name` TEXT, `avatar_path` TEXT, `type` INTEGER NOT NULL)");
                n1g.u(qxeVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_phones_phone_key` ON `phones` (`phone_key`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_phones_phonebook_id` ON `phones` (`phonebook_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_phones_type` ON `phones` (`type`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_phones_server_phone` ON `phones` (`server_phone`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `stat_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `entry` BLOB NOT NULL)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL, `video_url` TEXT)");
                n1g.u(qxeVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_stickers_sticker_id` ON `stickers` (`sticker_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `chats` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `data` BLOB NOT NULL, `favourite_index` INTEGER NOT NULL, `sort_time` INTEGER NOT NULL, `cid` INTEGER NOT NULL DEFAULT 0)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index` ON `chats` (`favourite_index`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index_sort_time_id` ON `chats` (`favourite_index` ASC, `sort_time` DESC, `id` DESC)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `status_in_process` INTEGER NOT NULL DEFAULT 0, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_chat_icon_url` TEXT, `msg_link_chat_access_type` INTEGER, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, `reactions_update_time` INTEGER NOT NULL DEFAULT 0, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_messages_reactions_update_time` ON `messages` (`reactions_update_time`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `comments` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `status_in_process` INTEGER NOT NULL DEFAULT 0, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `message_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_post_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `options` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `reactions_update_time` INTEGER NOT NULL DEFAULT 0, `parent_chat_server_id` INTEGER NOT NULL, `parent_message_server_id` INTEGER NOT NULL)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_comments_parent_chat_server_id_parent_message_server_id` ON `comments` (`parent_chat_server_id`, `parent_message_server_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_comments_parent_chat_server_id_parent_message_server_id_server_id` ON `comments` (`parent_chat_server_id`, `parent_message_server_id`, `server_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_comments_cid` ON `comments` (`cid`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_comments_server_id` ON `comments` (`server_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_comments_parent_chat_server_id_parent_message_server_id_time` ON `comments` (`parent_chat_server_id`, `parent_message_server_id`, `time`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_comments_parent_chat_server_id_parent_message_server_id_media_type` ON `comments` (`parent_chat_server_id`, `parent_message_server_id`, `media_type`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_comments_reactions_update_time` ON `comments` (`reactions_update_time`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `message_comments` (`message_id` INTEGER NOT NULL, `counter` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`message_id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `animoji` (`id` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `emoji` TEXT NOT NULL, `lottie_url` TEXT, `lottie_play_url` TEXT, `set_id` INTEGER, `icon_url` TEXT DEFAULT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `animoji_set` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `icon_lottie_url` TEXT, `update_time` INTEGER NOT NULL, `animoji_ids` TEXT NOT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `reactions_section` (`id` TEXT NOT NULL, `update_time` INTEGER NOT NULL, `reactions` TEXT NOT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `saved_msg_chat` (`user_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, PRIMARY KEY(`user_id`))");
                n1g.u(qxeVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_saved_msg_chat_chat_id` ON `saved_msg_chat` (`chat_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `webapp_biometry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER NOT NULL, `bot_id` INTEGER NOT NULL, `token` TEXT, `access_requested` INTEGER NOT NULL, `access_granted` INTEGER NOT NULL)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_user_id` ON `webapp_biometry` (`user_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_bot_id` ON `webapp_biometry` (`bot_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `profile` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `profile` BLOB NOT NULL)");
                n1g.u(qxeVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_profile_server_id` ON `profile` (`server_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `complain_reasons` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type_id` INTEGER NOT NULL, `complain_reasons` TEXT NOT NULL)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `informer_banner` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `settings` INTEGER NOT NULL DEFAULT 0, `description` TEXT, `priority` INTEGER NOT NULL, `repeat` INTEGER NOT NULL, `rerun` INTEGER NOT NULL, `animoji_id` INTEGER, `url` TEXT, `type` INTEGER NOT NULL, `click_time` INTEGER NOT NULL DEFAULT 0, `show_time` INTEGER NOT NULL DEFAULT 0, `close_time` INTEGER NOT NULL DEFAULT 0, `show_count` INTEGER NOT NULL DEFAULT 0, `button_text` TEXT DEFAULT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `metrics` (`traceId` TEXT NOT NULL, `metricName` TEXT NOT NULL, `lastUpdatedTime` INTEGER NOT NULL, `spanAndPropertiesDump` BLOB NOT NULL, `attempt` INTEGER NOT NULL DEFAULT 0, `isMarkedAsFailed` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`traceId`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `perf_snapshots` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sliceTime` INTEGER NOT NULL, `payload` BLOB NOT NULL, `type` INTEGER NOT NULL)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_perf_snapshots_type` ON `perf_snapshots` (`type`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `organizations` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `parentId` INTEGER, `folderTemplateId` INTEGER, `updateTime` INTEGER NOT NULL, `iconUrl` TEXT, `links` TEXT, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `call_history` (`history_id` INTEGER NOT NULL, `call_id` TEXT NOT NULL, `call_name` TEXT, `caller_id` INTEGER NOT NULL, `message_id` INTEGER, `chat_id` INTEGER NOT NULL, `call_type` TEXT NOT NULL, `hangup_type` TEXT, `join_link` TEXT, `time` INTEGER NOT NULL, `duration_ms` INTEGER, `group_call_type` INTEGER, PRIMARY KEY(`history_id`))");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_call_history_hangup_type_caller_id_time` ON `call_history` (`hangup_type`, `caller_id`, `time`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `media_cache` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `attach_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `size` INTEGER NOT NULL)");
                n1g.u(qxeVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_media_cache_chat_id_message_id_attach_id` ON `media_cache` (`chat_id`, `message_id`, `attach_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_media_cache_chat_id` ON `media_cache` (`chat_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_media_cache_type` ON `media_cache` (`type`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `story_drafts` (`draft_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `media_path` TEXT NOT NULL, `preview_path` TEXT, `type` INTEGER NOT NULL, `expiration_ms` INTEGER NOT NULL, `settings` INTEGER NOT NULL, `canvas_width` INTEGER NOT NULL, `canvas_height` INTEGER NOT NULL, `created_at` INTEGER NOT NULL)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `story_publish` (`publish_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `draft_id` INTEGER NOT NULL, `segment_index` INTEGER NOT NULL, `story_id` INTEGER NOT NULL, `segment_path` TEXT NOT NULL, `is_video` INTEGER NOT NULL, `upload_token` TEXT, `status` INTEGER NOT NULL DEFAULT 0, `created_at` INTEGER NOT NULL)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_story_publish_draft_id` ON `story_publish` (`draft_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `story_draft_text_layers` (`layer_id` INTEGER NOT NULL, `draft_id` INTEGER NOT NULL, `position` INTEGER NOT NULL DEFAULT 0, `align_mode` TEXT NOT NULL, `text_color` INTEGER NOT NULL, `text_background_color` INTEGER NOT NULL, `text` TEXT NOT NULL, `text_style` TEXT NOT NULL, `layout_width` INTEGER NOT NULL, `translation_x` REAL NOT NULL, `translation_y` REAL NOT NULL, `scale` REAL NOT NULL, `rotation` REAL NOT NULL, `text_bounds_left` REAL, `text_bounds_top` REAL, `text_bounds_right` REAL, `text_bounds_bottom` REAL, PRIMARY KEY(`draft_id`, `layer_id`), FOREIGN KEY(`draft_id`) REFERENCES `story_drafts`(`draft_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_story_draft_text_layers_draft_id` ON `story_draft_text_layers` (`draft_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `story_draft_drawing_layers` (`draft_id` INTEGER NOT NULL, `layer_id` INTEGER NOT NULL, `position` INTEGER NOT NULL, `color` INTEGER NOT NULL, `width` REAL NOT NULL, `primitives` BLOB NOT NULL, `bounds_left` INTEGER NOT NULL, `bounds_top` INTEGER NOT NULL, `bounds_right` INTEGER NOT NULL, `bounds_bottom` INTEGER NOT NULL, PRIMARY KEY(`draft_id`, `layer_id`), FOREIGN KEY(`draft_id`) REFERENCES `story_drafts`(`draft_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_story_draft_drawing_layers_draft_id` ON `story_draft_drawing_layers` (`draft_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `story_draft_video_attrs` (`draft_id` INTEGER NOT NULL, `duration_ms` INTEGER NOT NULL, `is_muted` INTEGER NOT NULL, `trim_start_fraction` REAL NOT NULL, `trim_end_fraction` REAL NOT NULL, PRIMARY KEY(`draft_id`), FOREIGN KEY(`draft_id`) REFERENCES `story_drafts`(`draft_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `story_draft_text_attrs` (`draft_id` INTEGER NOT NULL, `background_id` TEXT NOT NULL, PRIMARY KEY(`draft_id`), FOREIGN KEY(`draft_id`) REFERENCES `story_drafts`(`draft_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `story_draft_media_transform` (`draft_id` INTEGER NOT NULL, `translation_x` REAL NOT NULL, `translation_y` REAL NOT NULL, `scale` REAL NOT NULL, `rotation` REAL NOT NULL, `pivot_x` REAL NOT NULL, `pivot_y` REAL NOT NULL, PRIMARY KEY(`draft_id`), FOREIGN KEY(`draft_id`) REFERENCES `story_drafts`(`draft_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `gallery_saved_index` (`attach_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`attach_id`, `type`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                n1g.u(qxeVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7b2e3e6369a9b524bf1aab8273b03c87')");
                break;
            default:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                n1g.u(qxeVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
        }
    }

    @Override // defpackage.pic
    public final void c(qxe qxeVar) {
        switch (this.d) {
            case 0:
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `uploads`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `message_uploads`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `video_conversions`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `video_message_preparations`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `sticker_sets`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `favorite_sticker_sets`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `favorite_stickers`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `recent`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `fcm_notifications`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `fcm_notifications_history`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `fcm_notifications_analytics`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `notifications_read_marks`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `notifications_tracker_messages`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `call_notifications_analytics`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `chat_folder`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `folder_and_chats`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `chat_title`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `contact_title`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `WorkerQueueItem`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `tasks`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `contacts`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `phones`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `stat_events`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `stickers`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `chats`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `messages`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `comments`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `message_comments`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `animoji`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `animoji_set`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `reactions_section`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `saved_msg_chat`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `webapp_biometry`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `profile`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `complain_reasons`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `informer_banner`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `metrics`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `perf_snapshots`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `organizations`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `call_history`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `media_cache`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `story_drafts`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `story_publish`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `story_draft_text_layers`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `story_draft_drawing_layers`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `story_draft_video_attrs`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `story_draft_text_attrs`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `story_draft_media_transform`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `gallery_saved_index`");
                break;
            default:
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `Dependency`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `WorkSpec`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `WorkTag`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `WorkName`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `WorkProgress`");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS `Preference`");
                break;
        }
    }

    @Override // defpackage.pic
    public final void r() {
        int i = this.d;
    }

    @Override // defpackage.pic
    public final void s(qxe qxeVar) {
        int i = this.d;
        rre rreVar = this.e;
        switch (i) {
            case 0:
                n1g.u(qxeVar, "PRAGMA foreign_keys = ON");
                ((OneMeRoomDatabase_Impl) rreVar).l(qxeVar);
                break;
            default:
                n1g.u(qxeVar, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) rreVar).l(qxeVar);
                break;
        }
    }

    @Override // defpackage.pic
    public final void t() {
        int i = this.d;
    }

    @Override // defpackage.pic
    public final void u(qxe qxeVar) {
        switch (this.d) {
            case 0:
                aql.b(qxeVar);
                break;
            default:
                aql.b(qxeVar);
                break;
        }
    }

    @Override // defpackage.pic
    public final pse v(qxe qxeVar) {
        switch (this.d) {
            case 0:
                return A(qxeVar);
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work_spec_id", new bhh(1, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSetH = ewi.h(linkedHashMap, "prerequisite_id", new bhh(2, 1, "prerequisite_id", "TEXT", null, true));
                linkedHashSetH.add(new chh("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
                linkedHashSetH.add(new chh("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("prerequisite_id"), Collections.singletonList("id")));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new dhh("index_Dependency_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
                linkedHashSet.add(new dhh("index_Dependency_prerequisite_id", false, Collections.singletonList("prerequisite_id"), Collections.singletonList("ASC")));
                ehh ehhVar = new ehh("Dependency", linkedHashMap, linkedHashSetH, linkedHashSet);
                ehh ehhVarA = ovl.a(qxeVar, "Dependency");
                if (!ehhVar.equals(ehhVarA)) {
                    return new pse(false, ewi.e("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", ehhVar, "\n Found:\n", ehhVarA));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new bhh(1, 1, "id", "TEXT", null, true));
                linkedHashMap2.put("state", new bhh(0, 1, "state", "INTEGER", null, true));
                linkedHashMap2.put("worker_class_name", new bhh(0, 1, "worker_class_name", "TEXT", null, true));
                linkedHashMap2.put("input_merger_class_name", new bhh(0, 1, "input_merger_class_name", "TEXT", null, true));
                linkedHashMap2.put("input", new bhh(0, 1, "input", "BLOB", null, true));
                linkedHashMap2.put("output", new bhh(0, 1, "output", "BLOB", null, true));
                linkedHashMap2.put("initial_delay", new bhh(0, 1, "initial_delay", "INTEGER", null, true));
                linkedHashMap2.put("interval_duration", new bhh(0, 1, "interval_duration", "INTEGER", null, true));
                linkedHashMap2.put("flex_duration", new bhh(0, 1, "flex_duration", "INTEGER", null, true));
                linkedHashMap2.put("run_attempt_count", new bhh(0, 1, "run_attempt_count", "INTEGER", null, true));
                linkedHashMap2.put("backoff_policy", new bhh(0, 1, "backoff_policy", "INTEGER", null, true));
                linkedHashMap2.put("backoff_delay_duration", new bhh(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                linkedHashMap2.put("last_enqueue_time", new bhh(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
                linkedHashMap2.put("minimum_retention_duration", new bhh(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                linkedHashMap2.put("schedule_requested_at", new bhh(0, 1, "schedule_requested_at", "INTEGER", null, true));
                linkedHashMap2.put("run_in_foreground", new bhh(0, 1, "run_in_foreground", "INTEGER", null, true));
                linkedHashMap2.put("out_of_quota_policy", new bhh(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                linkedHashMap2.put("period_count", new bhh(0, 1, "period_count", "INTEGER", "0", true));
                linkedHashMap2.put("generation", new bhh(0, 1, "generation", "INTEGER", "0", true));
                linkedHashMap2.put("next_schedule_time_override", new bhh(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                linkedHashMap2.put("next_schedule_time_override_generation", new bhh(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
                linkedHashMap2.put("stop_reason", new bhh(0, 1, "stop_reason", "INTEGER", "-256", true));
                linkedHashMap2.put("trace_tag", new bhh(0, 1, "trace_tag", "TEXT", null, false));
                linkedHashMap2.put("backoff_on_system_interruptions", new bhh(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
                linkedHashMap2.put("required_network_type", new bhh(0, 1, "required_network_type", "INTEGER", null, true));
                linkedHashMap2.put("required_network_request", new bhh(0, 1, "required_network_request", "BLOB", "x''", true));
                linkedHashMap2.put("requires_charging", new bhh(0, 1, "requires_charging", "INTEGER", null, true));
                linkedHashMap2.put("requires_device_idle", new bhh(0, 1, "requires_device_idle", "INTEGER", null, true));
                linkedHashMap2.put("requires_battery_not_low", new bhh(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                linkedHashMap2.put("requires_storage_not_low", new bhh(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                linkedHashMap2.put("trigger_content_update_delay", new bhh(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                linkedHashMap2.put("trigger_max_content_delay", new bhh(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                LinkedHashSet linkedHashSetH2 = ewi.h(linkedHashMap2, "content_uri_triggers", new bhh(0, 1, "content_uri_triggers", "BLOB", null, true));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new dhh("index_WorkSpec_schedule_requested_at", false, Collections.singletonList("schedule_requested_at"), Collections.singletonList("ASC")));
                linkedHashSet2.add(new dhh("index_WorkSpec_last_enqueue_time", false, Collections.singletonList("last_enqueue_time"), Collections.singletonList("ASC")));
                ehh ehhVar2 = new ehh("WorkSpec", linkedHashMap2, linkedHashSetH2, linkedHashSet2);
                ehh ehhVarA2 = ovl.a(qxeVar, "WorkSpec");
                if (!ehhVar2.equals(ehhVarA2)) {
                    return new pse(false, ewi.e("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", ehhVar2, "\n Found:\n", ehhVarA2));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("tag", new bhh(1, 1, "tag", "TEXT", null, true));
                LinkedHashSet linkedHashSetH3 = ewi.h(linkedHashMap3, "work_spec_id", new bhh(2, 1, "work_spec_id", "TEXT", null, true));
                linkedHashSetH3.add(new chh("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new dhh("index_WorkTag_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
                ehh ehhVar3 = new ehh("WorkTag", linkedHashMap3, linkedHashSetH3, linkedHashSet3);
                ehh ehhVarA3 = ovl.a(qxeVar, "WorkTag");
                if (!ehhVar3.equals(ehhVarA3)) {
                    return new pse(false, ewi.e("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", ehhVar3, "\n Found:\n", ehhVarA3));
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new bhh(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap4.put("generation", new bhh(2, 1, "generation", "INTEGER", "0", true));
                LinkedHashSet linkedHashSetH4 = ewi.h(linkedHashMap4, "system_id", new bhh(0, 1, "system_id", "INTEGER", null, true));
                linkedHashSetH4.add(new chh("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
                ehh ehhVar4 = new ehh("SystemIdInfo", linkedHashMap4, linkedHashSetH4, new LinkedHashSet());
                ehh ehhVarA4 = ovl.a(qxeVar, "SystemIdInfo");
                if (!ehhVar4.equals(ehhVarA4)) {
                    return new pse(false, ewi.e("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", ehhVar4, "\n Found:\n", ehhVarA4));
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put(SdkMetricStatEvent.NAME_KEY, new bhh(1, 1, SdkMetricStatEvent.NAME_KEY, "TEXT", null, true));
                LinkedHashSet linkedHashSetH5 = ewi.h(linkedHashMap5, "work_spec_id", new bhh(2, 1, "work_spec_id", "TEXT", null, true));
                linkedHashSetH5.add(new chh("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new dhh("index_WorkName_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
                ehh ehhVar5 = new ehh("WorkName", linkedHashMap5, linkedHashSetH5, linkedHashSet4);
                ehh ehhVarA5 = ovl.a(qxeVar, "WorkName");
                if (!ehhVar5.equals(ehhVarA5)) {
                    return new pse(false, ewi.e("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", ehhVar5, "\n Found:\n", ehhVarA5));
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new bhh(1, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSetH6 = ewi.h(linkedHashMap6, "progress", new bhh(0, 1, "progress", "BLOB", null, true));
                linkedHashSetH6.add(new chh("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
                ehh ehhVar6 = new ehh("WorkProgress", linkedHashMap6, linkedHashSetH6, new LinkedHashSet());
                ehh ehhVarA6 = ovl.a(qxeVar, "WorkProgress");
                if (!ehhVar6.equals(ehhVarA6)) {
                    return new pse(false, ewi.e("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", ehhVar6, "\n Found:\n", ehhVarA6));
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("key", new bhh(1, 1, "key", "TEXT", null, true));
                ehh ehhVar7 = new ehh("Preference", linkedHashMap7, ewi.h(linkedHashMap7, "long_value", new bhh(0, 1, "long_value", "INTEGER", null, false)), new LinkedHashSet());
                ehh ehhVarA7 = ovl.a(qxeVar, "Preference");
                return !ehhVar7.equals(ehhVarA7) ? new pse(false, ewi.e("Preference(androidx.work.impl.model.Preference).\n Expected:\n", ehhVar7, "\n Found:\n", ehhVarA7)) : new pse(true, (String) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7c(OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl) {
        super(75, "7b2e3e6369a9b524bf1aab8273b03c87", "3bade6bd02606a632e6ea1605770964f");
        this.e = oneMeRoomDatabase_Impl;
    }
}
