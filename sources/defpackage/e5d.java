package defpackage;

import android.content.SharedPreferences;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONObject;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class e5d implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final /* synthetic */ zv8[] S6 = {c0a.i(e5d.class, "set-unread-timeout", "setUnreadTimeout()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "debug-mode", "debugMode()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "min-log-level", "getMin-log-level()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "user-debug-report", "userDebugReport()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "android-use-logcat-logger", "androidUseLogcatLogger()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "image-width", "imageWidth()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "image-height", "imageHeight()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "image-quality", "imageQuality()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "image-size", "imageSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-msg-length", "maxMsgLength()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-participants", "maxParticipants()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-added-participants", "maxAddedParticipants()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-audio-length", "maxAudioLength()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-theme-length", "maxThemeLength()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "app-update-type", "appUpdateType()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "recovery-url", "recoveryUrl()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-description-length", "maxDescriptionLength()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "edit-timeout", "editTimeout()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "edit-comment-timeout", "editCommentTimeout()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chats-page-size", "chatsPageSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "keep-connection", "keepConnection()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "invite-link", "inviteLink()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "invite-short", "inviteShort()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "invite-long", "inviteLong()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "invite-header", "inviteHeader()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "file-upload-max-size", "fileUploadMaxSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "file-upload-unsupported-types", "fileUploadUnsupportedTypes()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chats-preload-period", "chatsPreloadPeriod()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chats-preload-period-read-mark", "chatsPreloadPeriodReadMark()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-favorite-chats", "maxFavoriteChats()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "disconnect-timeout", "disconnectTimeout()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "hash", "hash()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-attach-count", "maxAttachCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "support-account", "supportAccount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "support-email", "supportEmail()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "wakelock-on-push", "wakelockOnPush()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "mentions_entity_names_limit", "mentions_entity_names_limit()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-readmarks", "maxReadmarks()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "delete-msg-fys-large-chat-disabled", "deleteMsgFysLargeChatDisabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-video-duration-download", "maxVideoDurationDownload()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-favorite-stickers", "maxFavoriteStickers()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-favorite-sticker-sets", "maxFavoriteStickerSets()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "min-sticker-size", "minStickerSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-sticker-size", "maxStickerSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "default-sticker-size", "defaultStickerSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "min-image-side-size", "minImageSideSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "min-duration-save-audio-start-time", "minDurationSaveAudioStartTime()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "min-duration-playback-speed", "minDurationPlaybackSpeed()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "audio-transcription-locales", "audioTranscriptionLocales()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "scheduled-faves-enabled", "scheduledFavesEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "delete-message-from-reply", "deleteMessageFromReply()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "tracer-non-fatal-crashed-enabled", "getTracer-non-fatal-crashed-enabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "subscription-timeout-seconds", "subscriptionTimeoutSeconds()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "reactions-max", "reactionsMax()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "react-errors", "reactErrors()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "msg-get-reactions-page-size", "msgGetReactionsPageSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "wm-workers-limit", "wmWorkersLimit()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "wm-check-workers-count-interval-sec", "wmCheckWorkersCountIntervalSec()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "wm-backlog-worker-check-delay-sec", "wmBacklogWorkerCheckDelaySec()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "wm-backlog-worker-backoff-delay-sec", "wmBacklogWorkerBackoffDelaySec()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "wm-workers-offset", "wmWorkersOffset()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "worker-progress-time-diff-for-notify-ms", "workerProgressTimeDiffForNotifyMs()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "max-downloaded-size-for-notify-kb", "maxDownloadedSizeForNotifyKb()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "progress-diff-for-notify", "progressDiffForNotify()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fb-exec-replace", "fbExecReplace()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fb-exec-modifiers-names", "fbExecModifiersNames()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "log-full", "logFull()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "log-sensitive", "logSensitive()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "anr-config", "getAnr-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "debug-profile-info", "debugProfileInfo()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-endpoint", "callsEndpoint()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fake-chats", "fakeChats()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channels-enabled", "channelsEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "available-complaints", "availableComplaints()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "in-app-review-triggers", "inAppReviewTriggers()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fake-in-app-review", "fakeInAppReview()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "invite-friends-sheet-frequency", "inviteFriendsSheetFrequency()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "welcome-sticker-ids", "welcomeStickerIds()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "money-transfer-botid", "moneyTransferBotid()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "non-contact-sync-time", "nonContactSyncTime()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "non-contact-max-chunk-size", "nonContactMaxChunkSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "non-contact-collection-interval", "nonContactCollectionInterval()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "edit-chat-type-screen-enabled", "editChatTypeScreenEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "group-call-part-limit", "groupCallPartLimit()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "gc-from-p2p", "gcFromP2p()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-participant-sort", "callsParticipantSort()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "gc-link-pre-settings", "gcLinkPreSettings()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "gc-wait-admin", "gcWaitAdmin()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "incoming-call-finish-activity", "incomingCallFinishActivity()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "outgoing-call-uri", "outgoingCallUri()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "account-nickname-enabled", "accountNicknameEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "send-location-enabled", "sendLocationEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "media-viewer-rotation-enabled", "mediaViewerRotationEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "mytracker-enabled", "mytrackerEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chat-video-autoplay-parallel-count", "chatVideoAutoplayParallelCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "bot-complaint-enabled", "botComplaintEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-am-speaker-fix", "callsSdkAmSpeakerFix()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-webrtc-logs", "callsSdkWebrtcLogs()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-traffic-markup", "callsSdkTrafficMarkup()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-ai-opus-bwe", "callsSdkAiOpusBwe()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-incall-stat", "callsSdkIncallStat()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-lla", "callsAndroidLla()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-nodws", "getCalls-android-nodws()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-ice-cps", "callsAndroidIceCps()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-h265-s", "callsAndroidH265S()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-fast-join", "callsAndroidFastJoin()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-delay-start", "getCalls-delay-start()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-ns", "getCalls-ns()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-ac", "getCalls-android-ac()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-ssr", "callsAndroidSsr()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-ncs", "callsAndroidNcs()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-ta", "getCalls-ta()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-rmsf", "getCalls-android-rmsf()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-asm", "callsAndroidAsm()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-h265-prioritized", "callsSdkH265Prioritized()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-wtp", "callsAndroidWtp()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-fgs", "getCalls-android-fgs()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-fast-hangup", "callsAndroidFastHangup()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "call-permissions-interval", "getCall-permissions-interval()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "call-phone-recall-timeout", "getCall-phone-recall-timeout()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-opponent-registration-timeout", "getCalls-android-opponent-registration-timeout()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "ios-gsm-redirect", "getIos-gsm-redirect()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "energy-saving-request-interval", "getEnergy-saving-request-interval()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "energy-saving-bottom-sheet", "energySavingBottomSheet()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "comments-push", "commentsPush()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-disable-pipeline", "callsSdkDisablePipeline()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-log-audio", "callsSdkLogAudio()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-dnt-disable-audio", "callsSdkDntDisableAudio()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-opus-adapt", "callsSdkOpusAdapt()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-gen-peerid", "callsAndroidGenPeerid()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "cfs", "cfs()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "ab-status", "abStatus()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "conn-timeouts", "connTimeouts()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "media-transform", "getMedia-transform()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "video-transcoding-class", "videoTranscodingClass()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "call-rate", "callRate()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "call-chat-members-load-config", "getCall-chat-members-load-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-history-new", "callsHistoryNew()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "send-queue-size", "sendQueueSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "webapp-ds-keys-count", "webappDsKeysCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "webapp-ss-keys-count", "webappSsKeysCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "create-channel-type-screen", "createChannelTypeScreen()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "edit-channel-type-screen-enabled", "editChannelTypeScreenEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fresco-threadsafe-refs", "frescoThreadsafeRefsEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fresco-native-webp-decoder", "frescoNativeWebpDecoderEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "video-msg-config", "videoMsgConfig()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stat-session-background-threshold", "statSessionBackgroundThreshold()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "bot-start-param", "botStartParam()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "migrate-unsafe-warn", "migrateUnsafeWarn()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "media-order", "mediaOrder()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "bad-networ-indicator-config", "badNetworIndicatorConfig()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "analytics-enabled", "analyticsEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "mytracker-log-level", "mytrackerLogLevel()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "search-webapps-showcase", "searchWebappsShowcase()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "player-load-control", "playerLoadControl()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "settings-entry-banners", "getSettings-entry-banners()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "folders-max-count", "foldersMaxCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "folders-warm-up", "getFolders-warm-up()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "net-client-dns-enabled", "netClientDnsEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "net-client-tls-timeout-enabled", "getNet-client-tls-timeout-enabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "net-dns-store-enabled", "getNet-dns-store-enabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "creation-2fa-config", "creation2faConfig()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "one-video-player", "oneVideoPlayer()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "one-video-failover", "oneVideoFailover()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "failover-hosts", "failoverHosts()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "failover-4xx", "failover4xx()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "download-failover", "getDownload-failover()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "download-failover-4xx", "getDownload-failover-4xx()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "one-video-uploader-config", "getOne-video-uploader-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "webview-cache-enabled", "webviewCacheEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "quotes-enabled", "quotesEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "upload-video-config", "getUpload-video-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "devnull", "getDevnull()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "perf-events", "getPerf-events()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "perf-registrar-config", "getPerf-registrar-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channels-complaint-enabled", "channelsComplaintEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "landscape", "getLandscape()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "net-stat-config", "getNet-stat-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "informer-enabled", "informerEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "camera-freeze-detector-timeout", "cameraFreezeDetectorTimeout()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "camera-photo-executor", "cameraPhotoExecutor()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "family-protection-botid", "familyProtectionBotid()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "enable-unknown-contact-bottom-sheet", "enableUnknownContactBottomSheet()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "contact-add-bottom-sheet", "contactAddBottomSheet()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "opcode-stat-config", "opcodeStatConfig()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "inline-ev-player", "inlineEvPlayer()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channel-statistics-botid", "channelStatisticsBotid()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "y-map", "getY-map()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "multiaccount", "getMultiaccount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "new-collage", "newCollage()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "reactions-sync-time", "reactionsSyncTime()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "min-sound-hearable-level", "minSoundHearableLevel()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "official-org", "officialOrg()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "org-profile", "orgProfile()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "p2p-business-status-paid", "p2pBusinessStatusPaid()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channels-bots-org-profile", "getChannels-bots-org-profile()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "orgs-excluded-to-show", "getOrgs-excluded-to-show()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "video-content-cache-ttl", "videoContentCacheTtl()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "audio-play-cache-ttl", "audioPlayCacheTtl()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chatlist-subtitle-ver", "chatlistSubtitleVer()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "join-requests", "joinRequests()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "new-year-theme-2026", "newYearTheme2026()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "horizontal-call-mode", "horizontalCallMode()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "call-screen-hide-gesture", "callScreenHideGesture()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "set-audio-device", "setAudioDevice()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "webapp-push-open", "webappPushOpen()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "webapp-exc", "getWebapp-exc()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "reactions-settings-enabled", "reactionsSettingsEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "default-reactions-settings", "getDefault-reactions-settings()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "non-contact-complaints-enabled", "nonContactComplaintsEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "ov-media-send-enabled", "ovMediaSendEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "typing-send-enabled", "isTypingSendEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "cis-enabled", "cisEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channels-suggests-folder", "channelsSuggestsFolder()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "video-fast-seek-enabled", "videoFastSeekEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "log-violations", "logViolations()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "host-reachability", "hostReachability()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "dps", "dps()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "error-stat-limit", "errorStatLimit()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "upload-hang-barrier", "uploadHangBarrier()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "memory-slice-interval", "memorySliceInterval()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "push-delivery", "getPush-delivery()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "battery-slice-interval", "batterySliceInterval()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "battery-lib", "getBattery-lib()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "render-polls", "renderPolls()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "polls-in-p2p-chats", "pollsInP2pChats()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "polls-in-p2g-chats", "pollsInP2gChats()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "polls-in-channels", "pollsInChannels()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "poll-ttl", "getPoll-ttl()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "polls-v2", "pollsV2()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chat-history-warm-opts", "chatHistoryWarmOpts()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chat-history-warm-fail-interval", "chatHistoryWarmFailInterval()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chat-history-notif-msg-strategy", "chatHistoryNotifMsgStrategy()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "single-chunks-clear-period", "singleChunksClearPeriod()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chat-max-chunks", "chatMaxChunks()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chat-history-persist", "chatHistoryPersist()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chat-history-login-count", "chatHistoryLoginCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "min-free-available-space-mb", "minFreeAvailableSpaceMb()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "space-threshold", "spaceThreshold()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "net-session-suppress-bad-disconnected-state", "netSessionSuppressBadDisconnectedState()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "net-ssl-session-validate", "netSslSessionValidate()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "net-ssl-use-api-tm", "getNet-ssl-use-api-tm()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "net-session-rbc-enabled", "netSessionRbcEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "net-session-use-exec-time", "netSessionUseExecTime()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "csnl", "csnl()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "bots-channel-adding", "botsChannelAdding()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "debug-broken-contact", "debugBrokenContact()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chats-multi-select", "chatsMultiSelect()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "db-query-ex-count", "dbQueryExCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "db-tr-ex-count", "dbTrExCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "wm-ex-count", "wmExCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "speedy-upload", "speedyUpload()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "audio-download-fallback", "audioDownloadFallback()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "audio-constant-cache", "audioConstantCache()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "audio-prefetch", "audioPrefetch()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "audio-prefetch-notif", "getAudio-prefetch-notif()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "video-prefetch", "videoPrefetch()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "video-prefetch-notif", "getVideo-prefetch-notif()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "prefetch-no-workers", "getPrefetch-no-workers()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "system-thread-pool-queue", "getSystem-thread-pool-queue()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "watchdog-config", "getWatchdog-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fresco-executor", "getFresco-executor()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "new-message-context-menu", "newMessageContextMenuEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "photo-pinch-to-zoom", "getPhoto-pinch-to-zoom()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stickers-botid", "stickersBotid()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "sticker-set-edit-enabled", "stickerSetEditEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "invalidate-db-msg-exception", "invalidateDbMsgException()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "invalidate-db-force", "invalidateDbForce()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "webapp-pr", "getWebapp-pr()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "log-messages-meta", "logMessagesMeta()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "log-chat-meta", "logChatMeta()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "presence-ttl", "presenceTtl()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "presence-external", "presenceExternal()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "presence-seen-eq", "presenceSeenEq()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "presence-stat", "presenceStat()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "presence-keep-bg-cache", "presenceKeepBgCache()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "notif-typing-presence", "getNotif-typing-presence()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "presence-offline-log", "getPresence-offline-log()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "presence-chat-members-fix", "getPresence-chat-members-fix()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chat-mark-batch-fail-interval", "chatMarkBatchFailInterval()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "pub-search-limit", "pubSearchLimit()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "client-conv-id", "clientConvId()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "settings-business", "settingsBusiness()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "enable-audio-messages-transcription", "enableAudioMessagesTranscription()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "enable-video-messages-transcription", "enableVideoMessagesTranscription()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "retry-transcribe-attempt", "retryTranscribeAttempt()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "retry-transcribe-timeout", "retryTranscribeTimeout()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "media-not-ready-retry-delay", "mediaNotReadyRetryDelay()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calc-audio-wave", "calcAudioWave()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calc-video-wave", "calcVideoWave()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "audio-peaks-count", "audioPeaksCount()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "keep-background-socket", "getKeep-background-socket()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "ping-background-interval", "pingBackgroundInterval()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "spin-lock-enabled", "spinLockEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "digitalid-botid", "digitalidBotid()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "did-onboarding", "didOnboarding()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories", "stories()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "edit-and-reply", "getEdit-and-reply()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-config", "getStories-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-force-update", "getStories-force-update()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-chats", "getStories-chats()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-profile", "getStories-profile()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-publish", "getStories-publish()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-video-render", "getStories-video-render()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-transcode-fallback", "getStories-transcode-fallback()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-portrait-encoding", "storiesPortraitEncoding()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-cbr-force", "getStories-cbr-force()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-vbr-fallback-quality", "getStories-vbr-fallback-quality()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-drawing-layers", "storiesDrawingLayers()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-photo-render", "getStories-photo-render()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-link", "getStories-link()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-link-limit", "getStories-link-limit()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stories-double-tap-reaction", "getStories-double-tap-reaction()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "opus-recorder-bitrate", "opusRecorderBitrate()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "opus-recorder-sample-rate", "opusRecorderSampleRate()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "glyph-warm", "glyphWarm()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "informer-divider-can-hidden", "informerDividerCanHidden()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "informer-coloring", "informerColoring()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "live-streams", "liveStreams()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "live-streams-url-prefix", "liveStreamsUrlPrefix()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "phone-privacy-config", "phonePrivacyConfig()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "contacts-settings-move", "contactsSettingsMove()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "new-intent-fix", "newIntentFix()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "push-check", "pushCheck()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "show-vpn-chat-bottomsheet", "showVpnChatBottomsheet()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "show-vpn-call-bottomsheet", "showVpnCallBottomsheet()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "not-contact-placeholder", "notContactPlaceholder()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "comments-enabled", "commentsEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "comments-counters-ttl", "getComments-counters-ttl()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "get-comments-updates-page-size", "getCommentsUpdatesPageSize()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "comments-reactions-enabled", "getComments-reactions-enabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "comments-notif-message", "getComments-notif-message()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "comments-notif-delete", "getComments-notif-delete()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "comments-notif-delete-range", "getComments-notif-delete-range()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "comments-notif-react", "getComments-notif-react()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "confirm-send", "confirmSend()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "cancel-stale-notifications", "getCancel-stale-notifications()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "mediasaves-context", "getMediasaves-context()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "mediasaves-menu", "getMediasaves-menu()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "show-vpn-snackbar", "getShow-vpn-snackbar()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-simulcast-sw-vp8", "getCalls-android-simulcast-sw-vp8()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-simulcast", "getCalls-sdk-simulcast()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-sdk-early-video", "getCalls-sdk-early-video()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channel-view-config", "getChannel-view-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "read-listener-fix", "getRead-listener-fix()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "media-thumbhash", "getMedia-thumbhash()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "webapp-phone-hash", "getWebapp-phone-hash()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-signaling-to", "getCalls-android-signaling-to()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "new-avatar-gradient-colors-enabled", "getNew-avatar-gradient-colors-enabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "avatar-use-cached-source", "getAvatar-use-cached-source()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-android-ssttl", "getCalls-android-ssttl()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fix-folders-counter", "getFix-folders-counter()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "blocked-users", "getBlocked-users()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "informer-icon-themed", "getInformer-icon-themed()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "informer-splash", "getInformer-splash()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "informer-splash-update-config", "getInformer-splash-update-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "organization-placeholder", "getOrganization-placeholder()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "ilm", "getIlm()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "video-transloader", "getVideo-transloader()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "sync-loop-fix", "isSyncLoopFixEnabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "call-ping-fix", "getCall-ping-fix()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fix-presense-lock", "getFix-presense-lock()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "default-session-restart", "getDefault-session-restart()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "fix-samsung-push-collissions", "getFix-samsung-push-collissions()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "request-cancel", "getRequest-cancel()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "photo-url-refresh", "getPhoto-url-refresh()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "photo-url-refresh-max-media-per-request", "getPhoto-url-refresh-max-media-per-request()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "merge-native-lib", "getMerge-native-lib()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "telecom-config", "getTelecom-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "call-ext-account-manager", "removeCallAccountOnEnd()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "suspend-native-media-download", "getSuspend-native-media-download()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "recreate-ringtone-player", "recreateRingtonePlayer()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "webview-restore-locale", "getWebview-restore-locale()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "release-cd-config", "getRelease-cd-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "unified-crop-helper", "getUnified-crop-helper()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "su-ch-unsubscribe", "getSu-ch-unsubscribe()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "split-call-services", "splitCallServices()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-hold-enabled", "parallelCalls()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "calls-hold-sound-frequency", "callsHoldSoundFrequency()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "open-channels", "getOpen-channels()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "open-channels-link", "getOpen-channels-link()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "open-channels-max-channel-count", "getOpen-channels-max-channel-count()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channel-name-check-debounce-ms", "getChannel-name-check-debounce-ms()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "open-channels-animoji-id", "getOpen-channels-animoji-id()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "rustore-push-mode", "rustorePushMode()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "rustore-log-ex", "getRustore-log-ex()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "app-update-strategy", "getApp-update-strategy()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "rustore-app-update-url", "getRustore-app-update-url()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "webapp-entry-from-chats-and-search-enabled", "getWebapp-entry-from-chats-and-search-enabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channels-folder-onboarding-enabled", "getChannels-folder-onboarding-enabled()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "pending-tasks-max-count", "getPending-tasks-max-count()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "chat-members-server", "getChat-members-server()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "crit-log-fix", "getCrit-log-fix()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channel-subscriptions-recs-limit", "getChannel-subscriptions-recs-limit()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "p2g-disable-forward", "p2gDisableForward()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "loader-skip-same-event", "getLoader-skip-same-event()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "hms-token-wait", "getHms-token-wait()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "pip-auto-enter", "pipAutoEnter()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "db-corrupt-logout", "getDb-corrupt-logout()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "hide-unavailable-chats-to-forward", "getHide-unavailable-chats-to-forward()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "call-service-foreground-fix", "callServiceForegroundFix()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "media-autosave", "getMedia-autosave()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "one-video-preload-config", "getOne-video-preload-config()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "one-video-okhttp", "getOne-video-okhttp()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "warning-links", "getWarning-links()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "forwarded-post-views", "getForwarded-post-views()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "business-channel-botid", "getBusiness-channel-botid()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "worker-service-new", "getWorker-service-new()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "multipin-dialog", "getMultipin-dialog()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "multipin-chat", "getMultipin-chat()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "multipin-channel", "getMultipin-channel()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "stat-network-params", "getStat-network-params()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "enable-chat-preview", "getEnable-chat-preview()Lone/me/sdk/prefs/PmsProperty;", 0), c0a.i(e5d.class, "channel-fake-pixel", "getChannel-fake-pixel()Lone/me/sdk/prefs/PmsProperty;", 0)};
    public final b5d A;
    public final b5d A0;
    public final b5d A1;
    public final b5d A2;
    public final b5d A3;
    public final b5d A4;
    public final b5d A5;
    public final b5d A6;
    public final b5d B;
    public final b5d B0;
    public final b5d B1;
    public final b5d B2;
    public final b5d B3;
    public final b5d B4;
    public final b5d B5;
    public final b5d B6;
    public final b5d C;
    public final b5d C0;
    public final b5d C1;
    public final b5d C2;
    public final b5d C3;
    public final b5d C4;
    public final b5d C5;
    public final b5d C6;
    public final b5d D;
    public final b5d D0;
    public final b5d D1;
    public final b5d D2;
    public final b5d D3;
    public final b5d D4;
    public final b5d D5;
    public final b5d D6;
    public final b5d E;
    public final b5d E0;
    public final b5d E1;
    public final b5d E2;
    public final b5d E3;
    public final b5d E4;
    public final b5d E5;
    public final b5d E6;
    public final b5d F;
    public final b5d F0;
    public final b5d F1;
    public final b5d F2;
    public final b5d F3;
    public final b5d F4;
    public final b5d F5;
    public final b5d F6;
    public final b5d G;
    public final b5d G0;
    public final b5d G1;
    public final b5d G2;
    public final b5d G3;
    public final b5d G4;
    public final b5d G5;
    public final b5d G6;
    public final b5d H;
    public final b5d H0;
    public final b5d H1;
    public final b5d H2;
    public final b5d H3;
    public final b5d H4;
    public final b5d H5;
    public final b5d H6;
    public final b5d I;
    public final b5d I0;
    public final b5d I1;
    public final b5d I2;
    public final b5d I3;
    public final b5d I4;
    public final b5d I5;
    public final b5d I6;
    public final b5d J;
    public final b5d J0;
    public final b5d J1;
    public final b5d J2;
    public final b5d J3;
    public final b5d J4;
    public final b5d J5;
    public final b5d J6;
    public final b5d K;
    public final b5d K0;
    public final b5d K1;
    public final b5d K2;
    public final b5d K3;
    public final b5d K4;
    public final b5d K5;
    public final b5d K6;
    public final b5d L;
    public final b5d L0;
    public final b5d L1;
    public final b5d L2;
    public final b5d L3;
    public final b5d L4;
    public final b5d L5;
    public final b5d L6;
    public final b5d M;
    public final b5d M0;
    public final b5d M1;
    public final b5d M2;
    public final b5d M3;
    public final b5d M4;
    public final b5d M5;
    public final b5d M6;
    public final b5d N;
    public final b5d N0;
    public final b5d N1;
    public final b5d N2;
    public final b5d N3;
    public final b5d N4;
    public final b5d N5;
    public final b5d N6;
    public final b5d O;
    public final b5d O0;
    public final b5d O1;
    public final b5d O2;
    public final b5d O3;
    public final b5d O4;
    public final b5d O5;
    public final b5d O6;
    public final b5d P;
    public final b5d P0;
    public final b5d P1;
    public final b5d P2;
    public final b5d P3;
    public final b5d P4;
    public final b5d P5;
    public final b5d P6;
    public final b5d Q;
    public final b5d Q0;
    public final b5d Q1;
    public final b5d Q2;
    public final b5d Q3;
    public final b5d Q4;
    public final b5d Q5;
    public final b5d Q6;
    public final b5d R;
    public final b5d R0;
    public final b5d R1;
    public final b5d R2;
    public final b5d R3;
    public final b5d R4;
    public final b5d R5;
    public final b5d R6;
    public final b5d S;
    public final b5d S0;
    public final b5d S1;
    public final b5d S2;
    public final b5d S3;
    public final b5d S4;
    public final b5d S5;
    public final b5d T;
    public final b5d T0;
    public final b5d T1;
    public final b5d T2;
    public final b5d T3;
    public final b5d T4;
    public final b5d T5;
    public final b5d U;
    public final b5d U0;
    public final b5d U1;
    public final b5d U2;
    public final b5d U3;
    public final b5d U4;
    public final b5d U5;
    public final b5d V;
    public final b5d V0;
    public final b5d V1;
    public final b5d V2;
    public final b5d V3;
    public final b5d V4;
    public final b5d V5;
    public final b5d W;
    public final b5d W0;
    public final b5d W1;
    public final b5d W2;
    public final b5d W3;
    public final b5d W4;
    public final b5d W5;
    public final b5d X;
    public final b5d X0;
    public final b5d X1;
    public final b5d X2;
    public final b5d X3;
    public final b5d X4;
    public final b5d X5;
    public final b5d Y;
    public final b5d Y0;
    public final b5d Y1;
    public final b5d Y2;
    public final b5d Y3;
    public final b5d Y4;
    public final b5d Y5;
    public final b5d Z;
    public final b5d Z0;
    public final b5d Z1;
    public final b5d Z2;
    public final b5d Z3;
    public final b5d Z4;
    public final b5d Z5;
    public final ifh a;
    public final b5d a0;
    public final b5d a1;
    public final b5d a2;
    public final b5d a3;
    public final b5d a4;
    public final b5d a5;
    public final b5d a6;
    public final b5d b0;
    public final b5d b1;
    public final b5d b2;
    public final b5d b3;
    public final b5d b4;
    public final b5d b5;
    public final b5d b6;
    public final b5d c0;
    public final b5d c1;
    public final b5d c2;
    public final b5d c3;
    public final b5d c4;
    public final b5d c5;
    public final b5d c6;
    public final b5d d0;
    public final b5d d1;
    public final b5d d2;
    public final b5d d3;
    public final b5d d4;
    public final b5d d5;
    public final b5d d6;
    public final ifh e;
    public final b5d e0;
    public final b5d e1;
    public final b5d e2;
    public final b5d e3;
    public final b5d e4;
    public final b5d e5;
    public final b5d e6;
    public final ifh f;
    public final b5d f0;
    public final b5d f1;
    public final b5d f2;
    public final b5d f3;
    public final b5d f4;
    public final b5d f5;
    public final b5d f6;
    public final ifh g;
    public final b5d g0;
    public final b5d g1;
    public final b5d g2;
    public final b5d g3;
    public final b5d g4;
    public final b5d g5;
    public final b5d g6;
    public final ifh h;
    public final b5d h0;
    public final b5d h1;
    public final b5d h2;
    public final b5d h3;
    public final b5d h4;
    public final b5d h5;
    public final b5d h6;
    public final b5d i;
    public final b5d i0;
    public final b5d i1;
    public final b5d i2;
    public final b5d i3;
    public final b5d i4;
    public final b5d i5;
    public final b5d i6;
    public final b5d j;
    public final b5d j0;
    public final b5d j1;
    public final b5d j2;
    public final b5d j3;
    public final b5d j4;
    public final b5d j5;
    public final b5d j6;
    public final b5d k;
    public final b5d k0;
    public final b5d k1;
    public final b5d k2;
    public final b5d k3;
    public final b5d k4;
    public final b5d k5;
    public final b5d k6;
    public final b5d l;
    public final b5d l0;
    public final b5d l1;
    public final b5d l2;
    public final b5d l3;
    public final b5d l4;
    public final b5d l5;
    public final b5d l6;
    public final b5d m;
    public final b5d m0;
    public final b5d m1;
    public final b5d m2;
    public final b5d m3;
    public final b5d m4;
    public final b5d m5;
    public final b5d m6;
    public final b5d n;
    public final b5d n0;
    public final b5d n1;
    public final b5d n2;
    public final b5d n3;
    public final b5d n4;
    public final b5d n5;
    public final b5d n6;
    public final b5d o;
    public final b5d o0;
    public final b5d o1;
    public final b5d o2;
    public final b5d o3;
    public final b5d o4;
    public final b5d o5;
    public final b5d o6;
    public final b5d p;
    public final b5d p0;
    public final b5d p1;
    public final b5d p2;
    public final b5d p3;
    public final b5d p4;
    public final b5d p5;
    public final b5d p6;
    public final b5d q;
    public final b5d q0;
    public final b5d q1;
    public final b5d q2;
    public final b5d q3;
    public final b5d q4;
    public final b5d q5;
    public final b5d q6;
    public final b5d r;
    public final b5d r0;
    public final b5d r1;
    public final b5d r2;
    public final b5d r3;
    public final b5d r4;
    public final b5d r5;
    public final b5d r6;
    public final b5d s;
    public final b5d s0;
    public final b5d s1;
    public final b5d s2;
    public final b5d s3;
    public final b5d s4;
    public final b5d s5;
    public final b5d s6;
    public final b5d t;
    public final b5d t0;
    public final b5d t1;
    public final b5d t2;
    public final b5d t3;
    public final b5d t4;
    public final b5d t5;
    public final b5d t6;
    public final b5d u;
    public final b5d u0;
    public final b5d u1;
    public final b5d u2;
    public final b5d u3;
    public final b5d u4;
    public final b5d u5;
    public final b5d u6;
    public final b5d v;
    public final b5d v0;
    public final b5d v1;
    public final b5d v2;
    public final b5d v3;
    public final b5d v4;
    public final b5d v5;
    public final b5d v6;
    public final b5d w;
    public final b5d w0;
    public final b5d w1;
    public final b5d w2;
    public final b5d w3;
    public final b5d w4;
    public final b5d w5;
    public final b5d w6;
    public final b5d x;
    public final b5d x0;
    public final b5d x1;
    public final b5d x2;
    public final b5d x3;
    public final b5d x4;
    public final b5d x5;
    public final b5d x6;
    public final b5d y;
    public final b5d y0;
    public final b5d y1;
    public final b5d y2;
    public final b5d y3;
    public final b5d y4;
    public final b5d y5;
    public final b5d y6;
    public final b5d z;
    public final b5d z0;
    public final b5d z1;
    public final b5d z2;
    public final b5d z3;
    public final b5d z4;
    public final b5d z5;
    public final b5d z6;
    public final pzf b = e9i.b(0, Integer.MAX_VALUE, 4);
    public final ifh c = rx8.Q(new j6(this, 2));
    public final ifh d = rx8.Q(new j6(this, 3));

    /* JADX WARN: Multi-variable type inference failed */
    public e5d(final ifh ifhVar, final ifh ifhVar2, final ifh ifhVar3, ny8 ny8Var) {
        this.a = rx8.Q(new fu(ny8Var, 10));
        final int i = 0;
        final int i2 = 4;
        final int i3 = 2;
        this.e = rx8.Q(new af7() { // from class: u4d
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i;
                e5d e5dVar = this;
                ifh ifhVar4 = ifhVar2;
                switch (i4) {
                    case 0:
                        SharedPreferences sharedPreferences = (SharedPreferences) ifhVar4.getValue();
                        sharedPreferences.registerOnSharedPreferenceChangeListener(e5dVar);
                        return sharedPreferences;
                    case 1:
                        SharedPreferences sharedPreferences2 = (SharedPreferences) ifhVar4.getValue();
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(e5dVar);
                        return sharedPreferences2;
                    default:
                        SharedPreferences sharedPreferences3 = (SharedPreferences) ifhVar4.getValue();
                        sharedPreferences3.registerOnSharedPreferenceChangeListener(e5dVar);
                        return sharedPreferences3;
                }
            }
        });
        final int i4 = 1;
        this.f = rx8.Q(new af7() { // from class: u4d
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                e5d e5dVar = this;
                ifh ifhVar4 = ifhVar3;
                switch (i5) {
                    case 0:
                        SharedPreferences sharedPreferences = (SharedPreferences) ifhVar4.getValue();
                        sharedPreferences.registerOnSharedPreferenceChangeListener(e5dVar);
                        return sharedPreferences;
                    case 1:
                        SharedPreferences sharedPreferences2 = (SharedPreferences) ifhVar4.getValue();
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(e5dVar);
                        return sharedPreferences2;
                    default:
                        SharedPreferences sharedPreferences3 = (SharedPreferences) ifhVar4.getValue();
                        sharedPreferences3.registerOnSharedPreferenceChangeListener(e5dVar);
                        return sharedPreferences3;
                }
            }
        });
        this.g = rx8.Q(new af7() { // from class: u4d
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i3;
                e5d e5dVar = this;
                ifh ifhVar4 = ifhVar;
                switch (i5) {
                    case 0:
                        SharedPreferences sharedPreferences = (SharedPreferences) ifhVar4.getValue();
                        sharedPreferences.registerOnSharedPreferenceChangeListener(e5dVar);
                        return sharedPreferences;
                    case 1:
                        SharedPreferences sharedPreferences2 = (SharedPreferences) ifhVar4.getValue();
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(e5dVar);
                        return sharedPreferences2;
                    default:
                        SharedPreferences sharedPreferences3 = (SharedPreferences) ifhVar4.getValue();
                        sharedPreferences3.registerOnSharedPreferenceChangeListener(e5dVar);
                        return sharedPreferences3;
                }
            }
        });
        final int i5 = 28;
        this.h = rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        });
        eg8 eg8Var = rx8.l;
        eg8 eg8Var2 = rx8.m;
        b5d b5dVar = new b5d(this, 31536000, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        zv8[] zv8VarArr = S6;
        b5dVar.b(zv8VarArr[0]);
        this.i = b5dVar;
        b5d b5dVar2 = new b5d(this, 0, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar2.b(zv8VarArr[1]);
        this.j = b5dVar2;
        final int i6 = 11;
        b5d b5dVar3 = new b5d(this, Integer.valueOf(je9.c.a()), false, false, zfe.a(Integer.class), 1, eg8Var, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }));
        b5dVar3.b(zv8VarArr[2]);
        this.k = b5dVar3;
        b5d b5dVar4 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar4.b(zv8VarArr[3]);
        this.l = b5dVar4;
        Boolean bool = Boolean.FALSE;
        b5d b5dVar5 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar5.b(zv8VarArr[4]);
        this.m = b5dVar5;
        b5d b5dVar6 = new b5d(this, 1920, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        final int i7 = 5;
        b5dVar6.b(zv8VarArr[5]);
        this.n = b5dVar6;
        b5d b5dVar7 = new b5d(this, 1920, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar7.b(zv8VarArr[6]);
        this.o = b5dVar7;
        b5d b5dVar8 = new b5d(this, Float.valueOf(0.8f), false, false, zfe.a(Float.class), 1, eg8Var, eg8Var2);
        b5dVar8.b(zv8VarArr[7]);
        this.p = b5dVar8;
        b5d b5dVar9 = new b5d(this, 40000000, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar9.b(zv8VarArr[8]);
        this.q = b5dVar9;
        b5d b5dVar10 = new b5d(this, Integer.valueOf(y5g.CLOSE_SOCKET_CODE_TIMEOUT), false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar10.b(zv8VarArr[9]);
        this.r = b5dVar10;
        b5d b5dVar11 = new b5d(this, 20000, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar11.b(zv8VarArr[10]);
        this.s = b5dVar11;
        b5d b5dVar12 = new b5d(this, 100, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar12.b(zv8VarArr[11]);
        this.t = b5dVar12;
        b5d b5dVar13 = new b5d(this, 3600, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        final int i8 = 12;
        b5dVar13.b(zv8VarArr[12]);
        this.u = b5dVar13;
        b5d b5dVar14 = new b5d(this, 200, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar14.b(zv8VarArr[13]);
        this.v = b5dVar14;
        b5d b5dVar15 = new b5d(this, 0, true, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar15.b(zv8VarArr[14]);
        this.w = b5dVar15;
        b5d b5dVar16 = new b5d(this, null, true, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar16.b(zv8VarArr[15]);
        this.x = b5dVar16;
        b5d b5dVar17 = new b5d(this, Integer.valueOf(HttpStatus.SC_BAD_REQUEST), false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar17.b(zv8VarArr[16]);
        this.y = b5dVar17;
        b5d b5dVar18 = new b5d(this, 86400, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar18.b(zv8VarArr[17]);
        this.z = b5dVar18;
        b5d b5dVar19 = new b5d(this, 93600, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar19.b(zv8VarArr[18]);
        this.A = b5dVar19;
        b5d b5dVar20 = new b5d(this, 50, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar20.b(zv8VarArr[19]);
        this.B = b5dVar20;
        b5d b5dVar21 = new b5d(this, 2, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar21.b(zv8VarArr[20]);
        this.C = b5dVar21;
        b5d b5dVar22 = new b5d(this, "https://max.ru", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar22.b(zv8VarArr[21]);
        this.D = b5dVar22;
        sr3 sr3VarA = zfe.a(String.class);
        ifh ifhVarQ = rx8.Q(new i94(12));
        String name = ((l72) zv8VarArr[22]).getName();
        o().put(name, new i5d(name, "null", 1, false, false, eg8Var, eg8Var2, sr3VarA, ifhVarQ, this));
        b5d b5dVar23 = new b5d(this, "null", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        final int i9 = 23;
        b5dVar23.b(zv8VarArr[23]);
        this.E = b5dVar23;
        b5d b5dVar24 = new b5d(this, "null", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar24.b(zv8VarArr[24]);
        this.F = b5dVar24;
        b5d b5dVar25 = new b5d(this, 4294967296L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar25.b(zv8VarArr[25]);
        this.G = b5dVar25;
        b5d b5dVar26 = new b5d(this, yab.k0("exe"), false, false, zfe.a(List.class), 1, eg8Var, eg8Var2, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }));
        b5dVar26.b(zv8VarArr[26]);
        this.H = b5dVar26;
        b5d b5dVar27 = new b5d(this, 15, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar27.b(zv8VarArr[27]);
        this.I = b5dVar27;
        b5d b5dVar28 = new b5d(this, 0, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar28.b(zv8VarArr[28]);
        this.J = b5dVar28;
        b5d b5dVar29 = new b5d(this, 5, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar29.b(zv8VarArr[29]);
        this.K = b5dVar29;
        b5d b5dVar30 = new b5d(this, 300, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar30.b(zv8VarArr[30]);
        this.L = b5dVar30;
        b5d b5dVar31 = new b5d(this, null, true, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar31.b(zv8VarArr[31]);
        this.M = b5dVar31;
        b5d b5dVar32 = new b5d(this, 10, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar32.b(zv8VarArr[32]);
        this.N = b5dVar32;
        b5d b5dVar33 = new b5d(this, "max.ru/support", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar33.b(zv8VarArr[33]);
        this.O = b5dVar33;
        b5d b5dVar34 = new b5d(this, "support@max.ru", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar34.b(zv8VarArr[34]);
        this.P = b5dVar34;
        b5d b5dVar35 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar35.b(zv8VarArr[35]);
        this.Q = b5dVar35;
        b5d b5dVar36 = new b5d(this, 3, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar36.b(zv8VarArr[36]);
        this.R = b5dVar36;
        b5d b5dVar37 = new b5d(this, 300, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar37.b(zv8VarArr[37]);
        this.S = b5dVar37;
        b5d b5dVar38 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar38.b(zv8VarArr[38]);
        this.T = b5dVar38;
        sr3 sr3VarA2 = zfe.a(Long.class);
        ifh ifhVarQ2 = rx8.Q(new i94(12));
        String name2 = ((l72) zv8VarArr[39]).getName();
        o().put(name2, new i5d(name2, 1200L, 1, false, false, eg8Var, eg8Var2, sr3VarA2, ifhVarQ2, this));
        b5d b5dVar39 = new b5d(this, 100, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar39.b(zv8VarArr[40]);
        this.U = b5dVar39;
        b5d b5dVar40 = new b5d(this, 100, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar40.b(zv8VarArr[41]);
        this.V = b5dVar40;
        b5d b5dVar41 = new b5d(this, 432, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar41.b(zv8VarArr[42]);
        this.W = b5dVar41;
        b5d b5dVar42 = new b5d(this, Integer.valueOf(np0.o), false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar42.b(zv8VarArr[43]);
        this.X = b5dVar42;
        sr3 sr3VarA3 = zfe.a(Integer.class);
        ifh ifhVar4 = new ifh(new i94(12));
        String name3 = ((l72) zv8VarArr[44]).getName();
        o().put(name3, new i5d(name3, 144, 1, false, false, eg8Var, eg8Var2, sr3VarA3, ifhVar4, this));
        b5d b5dVar43 = new b5d(this, 64, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar43.b(zv8VarArr[45]);
        this.Y = b5dVar43;
        sr3 sr3VarA4 = zfe.a(Integer.class);
        ifh ifhVarQ3 = rx8.Q(new i94(12));
        String name4 = ((l72) zv8VarArr[46]).getName();
        o().put(name4, new i5d(name4, 20, 1, false, false, eg8Var, eg8Var2, sr3VarA4, ifhVarQ3, this));
        sr3 sr3VarA5 = zfe.a(Integer.class);
        ifh ifhVarQ4 = rx8.Q(new i94(12));
        String name5 = ((l72) zv8VarArr[47]).getName();
        o().put(name5, new i5d(name5, 600, 1, false, false, eg8Var, eg8Var2, sr3VarA5, ifhVarQ4, this));
        ifh ifhVarQ5 = rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        });
        sr3 sr3VarA6 = zfe.a(List.class);
        String name6 = ((l72) zv8VarArr[48]).getName();
        r66 r66Var = r66.a;
        o().put(name6, new i5d(name6, r66Var, 1, false, false, eg8Var, eg8Var2, sr3VarA6, ifhVarQ5, this));
        b5d b5dVar44 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar44.b(zv8VarArr[49]);
        this.Z = b5dVar44;
        b5d b5dVar45 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar45.b(zv8VarArr[50]);
        this.a0 = b5dVar45;
        Boolean bool2 = Boolean.TRUE;
        b5d b5dVar46 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar46.b(zv8VarArr[51]);
        this.b0 = b5dVar46;
        b5d b5dVar47 = new b5d(this, 60, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar47.b(zv8VarArr[52]);
        this.c0 = b5dVar47;
        b5d b5dVar48 = new b5d(this, 8, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar48.b(zv8VarArr[53]);
        this.d0 = b5dVar48;
        final int i10 = 18;
        b5d b5dVar49 = new b5d(this, xw3.P0("error.comment.chat.access", "error.comment.invalid", "error.message.invalid", "error.message.chat.access", "error.message.like.unknown.like", "error.message.like.unknown.reaction"), false, true, zfe.a(List.class), 1, eg8Var, eg8Var2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }));
        b5dVar49.b(zv8VarArr[54]);
        this.e0 = b5dVar49;
        b5d b5dVar50 = new b5d(this, 40, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar50.b(zv8VarArr[55]);
        this.f0 = b5dVar50;
        b5d b5dVar51 = new b5d(this, 16, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar51.b(zv8VarArr[56]);
        this.g0 = b5dVar51;
        b5d b5dVar52 = new b5d(this, 10, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar52.b(zv8VarArr[57]);
        this.h0 = b5dVar52;
        b5d b5dVar53 = new b5d(this, 5, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar53.b(zv8VarArr[58]);
        this.i0 = b5dVar53;
        b5d b5dVar54 = new b5d(this, 10, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar54.b(zv8VarArr[59]);
        this.j0 = b5dVar54;
        b5d b5dVar55 = new b5d(this, 2, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar55.b(zv8VarArr[60]);
        this.k0 = b5dVar55;
        b5d b5dVar56 = new b5d(this, 10000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar56.b(zv8VarArr[61]);
        this.l0 = b5dVar56;
        b5d b5dVar57 = new b5d(this, 1024, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar57.b(zv8VarArr[62]);
        this.m0 = b5dVar57;
        b5d b5dVar58 = new b5d(this, new gvd(20.0f), false, false, zfe.a(gvd.class), 1, eg8Var, eg8Var2);
        b5dVar58.b(zv8VarArr[63]);
        this.n0 = b5dVar58;
        b5d b5dVar59 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar59.b(zv8VarArr[64]);
        this.o0 = b5dVar59;
        b5d b5dVar60 = new b5d(this, lof.b0("modifiers", "accessFlags"), false, false, zfe.a(Set.class), 1, eg8Var, eg8Var2);
        b5dVar60.b(zv8VarArr[65]);
        this.p0 = b5dVar60;
        b5d b5dVar61 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar61.b(zv8VarArr[66]);
        this.q0 = b5dVar61;
        b5d b5dVar62 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar62.b(zv8VarArr[67]);
        this.r0 = b5dVar62;
        b5d b5dVar63 = new b5d(this, null, false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar63.b(zv8VarArr[68]);
        this.s0 = b5dVar63;
        b5d b5dVar64 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar64.b(zv8VarArr[69]);
        this.t0 = b5dVar64;
        b5d b5dVar65 = new b5d(this, "null", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar65.b(zv8VarArr[70]);
        this.u0 = b5dVar65;
        b5d b5dVar66 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar66.b(zv8VarArr[71]);
        this.v0 = b5dVar66;
        b5d b5dVar67 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar67.b(zv8VarArr[72]);
        this.w0 = b5dVar67;
        ifh ifhVarQ6 = rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        });
        sr3 sr3VarA7 = zfe.a(List.class);
        String name7 = ((l72) zv8VarArr[73]).getName();
        o().put(name7, new i5d(name7, null, 1, false, false, eg8Var, eg8Var2, sr3VarA7, ifhVarQ6, this));
        b5d b5dVar68 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar68.b(zv8VarArr[74]);
        this.x0 = b5dVar68;
        b5d b5dVar69 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar69.b(zv8VarArr[75]);
        this.y0 = b5dVar69;
        final int i11 = 24;
        b5d b5dVar70 = new b5d(this, r66Var, false, false, zfe.a(List.class), 1, eg8Var, eg8Var2, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }));
        b5dVar70.b(zv8VarArr[76]);
        this.z0 = b5dVar70;
        final int i12 = 6;
        b5d b5dVar71 = new b5d(this, null, false, false, zfe.a(List.class), 1, eg8Var, eg8Var2, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }));
        b5dVar71.b(zv8VarArr[77]);
        this.A0 = b5dVar71;
        b5d b5dVar72 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar72.b(zv8VarArr[78]);
        this.B0 = b5dVar72;
        b5d b5dVar73 = new b5d(this, 86400L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar73.b(zv8VarArr[79]);
        this.C0 = b5dVar73;
        b5d b5dVar74 = new b5d(this, 10, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar74.b(zv8VarArr[80]);
        this.D0 = b5dVar74;
        b5d b5dVar75 = new b5d(this, 10000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar75.b(zv8VarArr[81]);
        this.E0 = b5dVar75;
        b5d b5dVar76 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar76.b(zv8VarArr[82]);
        this.F0 = b5dVar76;
        b5d b5dVar77 = new b5d(this, Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD), false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar77.b(zv8VarArr[83]);
        this.G0 = b5dVar77;
        final int i13 = 18;
        b5d b5dVar78 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar78.b(zv8VarArr[84]);
        this.H0 = b5dVar78;
        final int i14 = 0;
        b5d b5dVar79 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar79.b(zv8VarArr[85]);
        this.I0 = b5dVar79;
        b5d b5dVar80 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar80.b(zv8VarArr[86]);
        this.J0 = b5dVar80;
        final int i15 = 16;
        b5d b5dVar81 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar81.b(zv8VarArr[87]);
        this.K0 = b5dVar81;
        final int i16 = 17;
        b5d b5dVar82 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar82.b(zv8VarArr[88]);
        this.L0 = b5dVar82;
        final int i17 = 18;
        b5d b5dVar83 = new b5d(this, "https://max.ru", false, false, zfe.a(String.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar83.b(zv8VarArr[89]);
        this.M0 = b5dVar83;
        b5d b5dVar84 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar84.b(zv8VarArr[90]);
        this.N0 = b5dVar84;
        b5d b5dVar85 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar85.b(zv8VarArr[91]);
        this.O0 = b5dVar85;
        b5d b5dVar86 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar86.b(zv8VarArr[92]);
        this.P0 = b5dVar86;
        b5d b5dVar87 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar87.b(zv8VarArr[93]);
        this.Q0 = b5dVar87;
        b5d b5dVar88 = new b5d(this, r66Var, false, false, zfe.a(List.class), 1, eg8Var, eg8Var2);
        b5dVar88.b(zv8VarArr[94]);
        this.R0 = b5dVar88;
        b5d b5dVar89 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar89.b(zv8VarArr[95]);
        this.S0 = b5dVar89;
        final int i18 = 19;
        b5d b5dVar90 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar90.b(zv8VarArr[96]);
        this.T0 = b5dVar90;
        final int i19 = 20;
        b5d b5dVar91 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar91.b(zv8VarArr[97]);
        this.U0 = b5dVar91;
        b5d b5dVar92 = new b5d(this, "", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar92.b(zv8VarArr[98]);
        this.V0 = b5dVar92;
        final int i20 = 21;
        b5d b5dVar93 = new b5d(this, new af(), false, false, zfe.a(af.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2, rx8.Q(jr4.n));
        b5dVar93.b(zv8VarArr[99]);
        this.W0 = b5dVar93;
        final int i21 = 22;
        b5d b5dVar94 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar94.b(zv8VarArr[100]);
        this.X0 = b5dVar94;
        final int i22 = 23;
        b5d b5dVar95 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar95.b(zv8VarArr[101]);
        this.Y0 = b5dVar95;
        final int i23 = 25;
        b5d b5dVar96 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i23) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar96.b(zv8VarArr[102]);
        this.Z0 = b5dVar96;
        b5d b5dVar97 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar97.b(zv8VarArr[103]);
        this.a1 = b5dVar97;
        b5d b5dVar98 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar98.b(zv8VarArr[104]);
        this.b1 = b5dVar98;
        final int i24 = 26;
        b5d b5dVar99 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar99.b(zv8VarArr[105]);
        this.c1 = b5dVar99;
        final int i25 = 27;
        ifh ifhVarQ7 = rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        });
        sr3 sr3VarA8 = zfe.a(Map.class);
        s66 s66Var = s66.a;
        b5d b5dVar100 = new b5d(this, s66Var, false, false, sr3VarA8, 2, ifhVarQ7, eg8Var2);
        b5dVar100.b(zv8VarArr[106]);
        this.d1 = b5dVar100;
        final int i26 = 29;
        b5d b5dVar101 = new b5d(this, new yhb(), false, false, zfe.a(yhb.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), rx8.Q(jr4.y));
        b5dVar101.b(zv8VarArr[107]);
        this.e1 = b5dVar101;
        b5d b5dVar102 = new b5d(this, new a82(), false, false, zfe.a(a82.class), 2, eg8Var, eg8Var2, rx8.Q(jr4.E));
        b5dVar102.b(zv8VarArr[108]);
        this.f1 = b5dVar102;
        b5d b5dVar103 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, eg8Var, eg8Var2);
        b5dVar103.b(zv8VarArr[109]);
        this.g1 = b5dVar103;
        b5d b5dVar104 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new a5d(0)), eg8Var2);
        b5dVar104.b(zv8VarArr[110]);
        this.h1 = b5dVar104;
        b5d b5dVar105 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new a5d(1)), eg8Var2);
        b5dVar105.b(zv8VarArr[111]);
        this.i1 = b5dVar105;
        b5d b5dVar106 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new a5d(2)), eg8Var2);
        b5dVar106.b(zv8VarArr[112]);
        this.j1 = b5dVar106;
        b5d b5dVar107 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, eg8Var, eg8Var2);
        b5dVar107.b(zv8VarArr[113]);
        this.k1 = b5dVar107;
        b5d b5dVar108 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new a5d(3)), eg8Var2);
        b5dVar108.b(zv8VarArr[114]);
        this.l1 = b5dVar108;
        b5d b5dVar109 = new b5d(this, "", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar109.b(zv8VarArr[115]);
        this.m1 = b5dVar109;
        b5d b5dVar110 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new yxb(19)), eg8Var2);
        b5dVar110.b(zv8VarArr[116]);
        this.n1 = b5dVar110;
        b5d b5dVar111 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new yxb(20)), eg8Var2);
        b5dVar111.b(zv8VarArr[117]);
        this.o1 = b5dVar111;
        b5d b5dVar112 = new b5d(this, 0L, false, false, zfe.a(Long.class), 2, eg8Var, rx8.Q(new yxb(21)));
        b5dVar112.b(zv8VarArr[118]);
        this.p1 = b5dVar112;
        b5d b5dVar113 = new b5d(this, 0, false, false, zfe.a(Integer.class), 2, eg8Var, rx8.Q(new yxb(22)));
        b5dVar113.b(zv8VarArr[119]);
        this.q1 = b5dVar113;
        tgc.Companion.getClass();
        ifh ifhVarQ8 = rx8.Q(new yxb(23));
        ifh ifhVarQ9 = rx8.Q(d5d.b);
        b5d b5dVar114 = new b5d(this, tgc.d, false, false, zfe.a(tgc.class), 2, eg8Var, ifhVarQ8, ifhVarQ9);
        b5dVar114.b(zv8VarArr[120]);
        this.r1 = b5dVar114;
        final int i27 = 24;
        b5d b5dVar115 = new b5d(this, -1, false, false, zfe.a(Integer.class), 2, eg8Var, rx8.Q(new yxb(24)));
        b5dVar115.b(zv8VarArr[121]);
        this.s1 = b5dVar115;
        b5d b5dVar116 = new b5d(this, 604800L, false, false, zfe.a(Long.class), 2, eg8Var, rx8.Q(new yxb(25)));
        b5dVar116.b(zv8VarArr[122]);
        this.t1 = b5dVar116;
        b5d b5dVar117 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, rx8.Q(new yxb(26)));
        b5dVar117.b(zv8VarArr[123]);
        this.u1 = b5dVar117;
        b5d b5dVar118 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new yxb(27)), eg8Var2);
        b5dVar118.b(zv8VarArr[124]);
        this.v1 = b5dVar118;
        b5d b5dVar119 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new yxb(29)), eg8Var2);
        b5dVar119.b(zv8VarArr[125]);
        this.w1 = b5dVar119;
        b5d b5dVar120 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar120.b(zv8VarArr[126]);
        this.x1 = b5dVar120;
        final int i28 = 1;
        b5d b5dVar121 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar121.b(zv8VarArr[127]);
        this.y1 = b5dVar121;
        final int i29 = 2;
        b5d b5dVar122 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar122.b(zv8VarArr[128]);
        this.z1 = b5dVar122;
        final int i30 = 3;
        b5d b5dVar123 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i30) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar123.b(zv8VarArr[129]);
        this.A1 = b5dVar123;
        b5d b5dVar124 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar124.b(zv8VarArr[130]);
        this.B1 = b5dVar124;
        b5d b5dVar125 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar125.b(zv8VarArr[131]);
        this.C1 = b5dVar125;
        b5d b5dVar126 = new b5d(this, null, false, false, zfe.a(JSONObject.class), 1, eg8Var, eg8Var2);
        b5dVar126.b(zv8VarArr[132]);
        this.D1 = b5dVar126;
        b5d b5dVar127 = new b5d(this, new h6a(), false, false, zfe.a(h6a.class), 1, eg8Var, eg8Var2, rx8.Q(d5d.c));
        b5dVar127.b(zv8VarArr[133]);
        this.E1 = b5dVar127;
        final int i31 = 5;
        b5d b5dVar128 = new b5d(this, xw3.P0(2, 3), false, false, zfe.a(List.class), 1, eg8Var, eg8Var2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i31) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }));
        b5dVar128.b(zv8VarArr[134]);
        this.F1 = b5dVar128;
        b5d b5dVar129 = new b5d(this, "null", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar129.b(zv8VarArr[135]);
        this.G1 = b5dVar129;
        y63.Companion.getClass();
        ifh ifhVarQ10 = rx8.Q(d5d.d);
        b5d b5dVar130 = new b5d(this, y63.d, false, false, zfe.a(y63.class), 1, eg8Var, eg8Var2, ifhVarQ10);
        b5dVar130.b(zv8VarArr[136]);
        this.H1 = b5dVar130;
        final int i32 = 6;
        b5d b5dVar131 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2, rx8.Q(d5d.e));
        b5dVar131.b(zv8VarArr[137]);
        this.I1 = b5dVar131;
        b5d b5dVar132 = new b5d(this, 30, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar132.b(zv8VarArr[138]);
        this.J1 = b5dVar132;
        b5d b5dVar133 = new b5d(this, 100, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar133.b(zv8VarArr[139]);
        this.K1 = b5dVar133;
        b5d b5dVar134 = new b5d(this, 10, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar134.b(zv8VarArr[140]);
        this.L1 = b5dVar134;
        b5d b5dVar135 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar135.b(zv8VarArr[141]);
        this.M1 = b5dVar135;
        b5d b5dVar136 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar136.b(zv8VarArr[142]);
        this.N1 = b5dVar136;
        final int i33 = 7;
        b5d b5dVar137 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i33) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar137.b(zv8VarArr[143]);
        this.O1 = b5dVar137;
        final int i34 = 9;
        b5d b5dVar138 = new b5d(this, bool2, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i34) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar138.b(zv8VarArr[144]);
        this.P1 = b5dVar138;
        b5d b5dVar139 = new b5d(this, "", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar139.b(zv8VarArr[145]);
        this.Q1 = b5dVar139;
        b5d b5dVar140 = new b5d(this, 60000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar140.b(zv8VarArr[146]);
        this.R1 = b5dVar140;
        b5d b5dVar141 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar141.b(zv8VarArr[147]);
        this.S1 = b5dVar141;
        b5d b5dVar142 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar142.b(zv8VarArr[148]);
        this.T1 = b5dVar142;
        final int i35 = 10;
        b5d b5dVar143 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i35) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }));
        b5dVar143.b(zv8VarArr[149]);
        this.U1 = b5dVar143;
        b5d b5dVar144 = new b5d(this, "{ \n    \"rtt\":{ \n        \"step\":0.055, \n        \"baseline\":0.4, \n        \"stepWeight\":0.12, \n        \"weightUp\": 0.3, \n        \"weightDown\":0.8 \n    },\n     \"loss\":{ \n        \"step\":1.5, \n        \"baseline\":0.0, \n        \"stepWeight\":0.17, \n        \"weightUp\": 0.3, \n        \"weightDown\":0.6 \n    }\n}", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar144.b(zv8VarArr[150]);
        this.V1 = b5dVar144;
        b5d b5dVar145 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar145.b(zv8VarArr[151]);
        this.W1 = b5dVar145;
        b5d b5dVar146 = new b5d(this, 4, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar146.b(zv8VarArr[152]);
        this.X1 = b5dVar146;
        b5d b5dVar147 = new b5d(this, null, false, false, zfe.a(JSONObject.class), 1, eg8Var, eg8Var2);
        b5dVar147.b(zv8VarArr[153]);
        this.Y1 = b5dVar147;
        b5d b5dVar148 = new b5d(this, "null", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar148.b(zv8VarArr[154]);
        this.Z1 = b5dVar148;
        b5d b5dVar149 = new b5d(this, null, false, false, zfe.a(List.class), 1, eg8Var, eg8Var2, rx8.Q(d5d.f));
        b5dVar149.b(zv8VarArr[155]);
        this.a2 = b5dVar149;
        b5d b5dVar150 = new b5d(this, 30, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar150.b(zv8VarArr[156]);
        this.b2 = b5dVar150;
        b5d b5dVar151 = new b5d(this, bool2, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar151.b(zv8VarArr[157]);
        this.c2 = b5dVar151;
        sr3 sr3VarA9 = zfe.a(Boolean.class);
        ifh ifhVarQ11 = rx8.Q(new i94(12));
        String name8 = ((l72) zv8VarArr[158]).getName();
        o().put(name8, new i5d(name8, bool, 1, false, false, eg8Var, eg8Var2, sr3VarA9, ifhVarQ11, this));
        b5d b5dVar152 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar152.b(zv8VarArr[159]);
        this.d2 = b5dVar152;
        final int i36 = 12;
        b5d b5dVar153 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i36) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar153.b(zv8VarArr[160]);
        this.e2 = b5dVar153;
        b5d b5dVar154 = new b5d(this, "", true, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar154.b(zv8VarArr[161]);
        this.f2 = b5dVar154;
        b5d b5dVar155 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar155.b(zv8VarArr[162]);
        this.g2 = b5dVar155;
        b5d b5dVar156 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar156.b(zv8VarArr[163]);
        this.h2 = b5dVar156;
        b5d b5dVar157 = new b5d(this, s66Var, false, false, zfe.a(Map.class), 1, eg8Var, eg8Var2);
        b5dVar157.b(zv8VarArr[164]);
        this.i2 = b5dVar157;
        b5d b5dVar158 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar158.b(zv8VarArr[165]);
        this.j2 = b5dVar158;
        b5d b5dVar159 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar159.b(zv8VarArr[166]);
        this.k2 = b5dVar159;
        b5d b5dVar160 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar160.b(zv8VarArr[167]);
        this.l2 = b5dVar160;
        final int i37 = 13;
        b5d b5dVar161 = new b5d(this, new cfc(), false, false, zfe.a(cfc.class), 1, eg8Var, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i37) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), rx8.Q(d5d.g));
        b5dVar161.b(zv8VarArr[168]);
        this.m2 = b5dVar161;
        b5d b5dVar162 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar162.b(zv8VarArr[169]);
        this.n2 = b5dVar162;
        b5d b5dVar163 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar163.b(zv8VarArr[170]);
        this.o2 = b5dVar163;
        b5d b5dVar164 = new b5d(this, new vji(), false, false, zfe.a(vji.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.d));
        b5dVar164.b(zv8VarArr[171]);
        this.p2 = b5dVar164;
        bk5.b.getClass();
        b5d b5dVar165 = new b5d(this, ak5.e(), false, false, zfe.a(bk5.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.e));
        b5dVar165.b(zv8VarArr[172]);
        this.q2 = b5dVar165;
        xqc xqcVar = yqc.b;
        b5d b5dVar166 = new b5d(this, xqc.e(), false, false, zfe.a(yqc.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.f));
        b5dVar166.b(zv8VarArr[173]);
        this.r2 = b5dVar166;
        b5d b5dVar167 = new b5d(this, new hrc(), false, false, zfe.a(hrc.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.g));
        b5dVar167.b(zv8VarArr[174]);
        this.s2 = b5dVar167;
        b5d b5dVar168 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar168.b(zv8VarArr[175]);
        this.t2 = b5dVar168;
        b5d b5dVar169 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar169.b(zv8VarArr[176]);
        this.u2 = b5dVar169;
        jcb jcbVar = kcb.b;
        b5d b5dVar170 = new b5d(this, jcb.e(), false, false, zfe.a(kcb.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.h));
        b5dVar170.b(zv8VarArr[177]);
        this.v2 = b5dVar170;
        b5d b5dVar171 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar171.b(zv8VarArr[178]);
        this.w2 = b5dVar171;
        b5d b5dVar172 = new b5d(this, 30L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar172.b(zv8VarArr[179]);
        this.x2 = b5dVar172;
        b5d b5dVar173 = new b5d(this, 0, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar173.b(zv8VarArr[180]);
        this.y2 = b5dVar173;
        b5d b5dVar174 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar174.b(zv8VarArr[181]);
        this.z2 = b5dVar174;
        b5d b5dVar175 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar175.b(zv8VarArr[182]);
        this.A2 = b5dVar175;
        b5d b5dVar176 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar176.b(zv8VarArr[183]);
        this.B2 = b5dVar176;
        b5d b5dVar177 = new b5d(this, 5L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar177.b(zv8VarArr[184]);
        this.C2 = b5dVar177;
        b5d b5dVar178 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar178.b(zv8VarArr[185]);
        this.D2 = b5dVar178;
        b5d b5dVar179 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar179.b(zv8VarArr[186]);
        this.E2 = b5dVar179;
        b5d b5dVar180 = new b5d(this, null, false, false, zfe.a(zl9.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.i));
        b5dVar180.b(zv8VarArr[187]);
        this.F2 = b5dVar180;
        final int i38 = 14;
        b5d b5dVar181 = new b5d(this, 0, false, false, zfe.a(Integer.class), 1, eg8Var, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i38) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }));
        b5dVar181.b(zv8VarArr[188]);
        this.G2 = b5dVar181;
        b5d b5dVar182 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar182.b(zv8VarArr[189]);
        this.H2 = b5dVar182;
        b5d b5dVar183 = new b5d(this, 60000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar183.b(zv8VarArr[190]);
        this.I2 = b5dVar183;
        sr3 sr3VarA10 = zfe.a(Long.class);
        ifh ifhVarQ12 = rx8.Q(new i94(12));
        String name9 = ((l72) zv8VarArr[191]).getName();
        o().put(name9, new i5d(name9, 0L, 1, false, false, eg8Var, eg8Var2, sr3VarA10, ifhVarQ12, this));
        b5d b5dVar184 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar184.b(zv8VarArr[192]);
        this.J2 = b5dVar184;
        final int i39 = 15;
        b5d b5dVar185 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i39) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar185.b(zv8VarArr[193]);
        this.K2 = b5dVar185;
        final int i40 = 16;
        b5d b5dVar186 = new b5d(this, new x51(), false, false, zfe.a(x51.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i40) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2, rx8.Q(jr4.j));
        b5dVar186.b(zv8VarArr[194]);
        this.L2 = b5dVar186;
        final int i41 = 17;
        b5d b5dVar187 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i41) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar187.b(zv8VarArr[195]);
        this.M2 = b5dVar187;
        b5d b5dVar188 = new b5d(this, new long[0], false, false, zfe.a(long[].class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar188.b(zv8VarArr[196]);
        this.N2 = b5dVar188;
        b5d b5dVar189 = new b5d(this, 3600000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar189.b(zv8VarArr[197]);
        this.O2 = b5dVar189;
        b5d b5dVar190 = new b5d(this, 3600000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar190.b(zv8VarArr[198]);
        this.P2 = b5dVar190;
        b5d b5dVar191 = new b5d(this, 0L, false, true, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar191.b(zv8VarArr[199]);
        this.Q2 = b5dVar191;
        final int i42 = 20;
        b5d b5dVar192 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i42) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar192.b(zv8VarArr[200]);
        this.R2 = b5dVar192;
        sr3 sr3VarA11 = zfe.a(Boolean.class);
        ifh ifhVarQ13 = rx8.Q(new i94(12));
        String name10 = ((l72) zv8VarArr[201]).getName();
        o().put(name10, new i5d(name10, bool, 1, false, false, eg8Var, eg8Var2, sr3VarA11, ifhVarQ13, this));
        final int i43 = 21;
        b5d b5dVar193 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i43) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar193.b(zv8VarArr[202]);
        this.S2 = b5dVar193;
        final int i44 = 22;
        b5d b5dVar194 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar194.b(zv8VarArr[203]);
        this.T2 = b5dVar194;
        b5d b5dVar195 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar195.b(zv8VarArr[204]);
        this.U2 = b5dVar195;
        b5d b5dVar196 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar196.b(zv8VarArr[205]);
        this.V2 = b5dVar196;
        final int i45 = 23;
        b5d b5dVar197 = new b5d(this, new long[0], false, false, zfe.a(long[].class), 1, eg8Var, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i45) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }));
        b5dVar197.b(zv8VarArr[206]);
        this.W2 = b5dVar197;
        b5d b5dVar198 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar198.b(zv8VarArr[207]);
        this.X2 = b5dVar198;
        ad5.Companion.getClass();
        b5d b5dVar199 = new b5d(this, zc5.a(), false, false, zfe.a(ad5.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.k));
        b5dVar199.b(zv8VarArr[208]);
        this.Y2 = b5dVar199;
        b5d b5dVar200 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar200.b(zv8VarArr[209]);
        this.Z2 = b5dVar200;
        b5d b5dVar201 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar201.b(zv8VarArr[210]);
        this.a3 = b5dVar201;
        b5d b5dVar202 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar202.b(zv8VarArr[211]);
        this.b3 = b5dVar202;
        b5d b5dVar203 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar203.b(zv8VarArr[212]);
        this.c3 = b5dVar203;
        b5d b5dVar204 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar204.b(zv8VarArr[213]);
        this.d3 = b5dVar204;
        b5d b5dVar205 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar205.b(zv8VarArr[214]);
        this.e3 = b5dVar205;
        b5d b5dVar206 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar206.b(zv8VarArr[215]);
        this.f3 = b5dVar206;
        b5d b5dVar207 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar207.b(zv8VarArr[216]);
        this.g3 = b5dVar207;
        b5d b5dVar208 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar208.b(zv8VarArr[217]);
        this.h3 = b5dVar208;
        b5d b5dVar209 = new b5d(this, Integer.MAX_VALUE, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar209.b(zv8VarArr[218]);
        this.i3 = b5dVar209;
        b5d b5dVar210 = new b5d(this, 600000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar210.b(zv8VarArr[219]);
        this.j3 = b5dVar210;
        b5d b5dVar211 = new b5d(this, 60000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar211.b(zv8VarArr[220]);
        this.k3 = b5dVar211;
        b5d b5dVar212 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 6, eg8Var, eg8Var2);
        b5dVar212.b(zv8VarArr[221]);
        this.l3 = b5dVar212;
        ghb ghbVar = ew5.b;
        final int i46 = 1;
        b5d b5dVar213 = new b5d(this, Long.valueOf(ew5.g(qe7.O(1, lw5.MINUTES))), false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar213.b(zv8VarArr[222]);
        this.m3 = b5dVar213;
        b5d b5dVar214 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar214.b(zv8VarArr[223]);
        this.n3 = b5dVar214;
        b5d b5dVar215 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 8, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar215.b(zv8VarArr[224]);
        this.o3 = b5dVar215;
        final int i47 = 25;
        b5d b5dVar216 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 8, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i47) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar216.b(zv8VarArr[225]);
        this.p3 = b5dVar216;
        final int i48 = 26;
        b5d b5dVar217 = new b5d(this, 0, false, false, zfe.a(Integer.class), 8, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i48) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar217.b(zv8VarArr[226]);
        this.q3 = b5dVar217;
        final int i49 = 27;
        b5d b5dVar218 = new b5d(this, 0, false, false, zfe.a(Integer.class), 8, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i49) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar218.b(zv8VarArr[227]);
        this.r3 = b5dVar218;
        pad.Companion.getClass();
        ifh ifhVarQ14 = rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        });
        ifh ifhVarQ15 = rx8.Q(jr4.l);
        b5d b5dVar219 = new b5d(this, pad.d, false, false, zfe.a(pad.class), 8, ifhVarQ14, eg8Var2, ifhVarQ15);
        b5dVar219.b(zv8VarArr[228]);
        this.s3 = b5dVar219;
        b5d b5dVar220 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 8, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i46) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar220.b(zv8VarArr[229]);
        this.t3 = b5dVar220;
        b5d b5dVar221 = new b5d(this, -1, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar221.b(zv8VarArr[230]);
        this.u3 = b5dVar221;
        b5d b5dVar222 = new b5d(this, 5, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar222.b(zv8VarArr[231]);
        this.v3 = b5dVar222;
        b5d b5dVar223 = new b5d(this, 0, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar223.b(zv8VarArr[232]);
        this.w3 = b5dVar223;
        b5d b5dVar224 = new b5d(this, 0, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar224.b(zv8VarArr[233]);
        this.x3 = b5dVar224;
        b5d b5dVar225 = new b5d(this, 100, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar225.b(zv8VarArr[234]);
        this.y3 = b5dVar225;
        final int i50 = 2;
        b5d b5dVar226 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i50) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar226.b(zv8VarArr[235]);
        this.z3 = b5dVar226;
        final int i51 = 3;
        b5d b5dVar227 = new b5d(this, -1L, false, false, zfe.a(Long.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i51) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar227.b(zv8VarArr[236]);
        this.A3 = b5dVar227;
        b5d b5dVar228 = new b5d(this, 20L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar228.b(zv8VarArr[237]);
        this.B3 = b5dVar228;
        b5d b5dVar229 = new b5d(this, new rd7(), false, false, zfe.a(rd7.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.m));
        b5dVar229.b(zv8VarArr[238]);
        this.C3 = b5dVar229;
        b5d b5dVar230 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar230.b(zv8VarArr[239]);
        this.D3 = b5dVar230;
        final int i52 = 4;
        b5d b5dVar231 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i52) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar231.b(zv8VarArr[240]);
        this.E3 = b5dVar231;
        final int i53 = 5;
        b5d b5dVar232 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i53) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar232.b(zv8VarArr[241]);
        this.F3 = b5dVar232;
        final int i54 = 6;
        b5d b5dVar233 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i54) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar233.b(zv8VarArr[242]);
        this.G3 = b5dVar233;
        final int i55 = 7;
        b5d b5dVar234 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i55) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar234.b(zv8VarArr[243]);
        this.H3 = b5dVar234;
        b5d b5dVar235 = new b5d(this, 200L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar235.b(zv8VarArr[244]);
        this.I3 = b5dVar235;
        b5d b5dVar236 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar236.b(zv8VarArr[245]);
        this.J3 = b5dVar236;
        b5d b5dVar237 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar237.b(zv8VarArr[246]);
        this.K3 = b5dVar237;
        b5d b5dVar238 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar238.b(zv8VarArr[247]);
        this.L3 = b5dVar238;
        final int i56 = 8;
        ifh ifhVarQ16 = rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i56) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        });
        final int i57 = 9;
        b5d b5dVar239 = new b5d(this, -1, false, false, zfe.a(Integer.class), 3, ifhVarQ16, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i57) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }));
        b5dVar239.b(zv8VarArr[248]);
        this.M3 = b5dVar239;
        final int i58 = 12;
        final int i59 = 13;
        b5d b5dVar240 = new b5d(this, 1, false, false, zfe.a(Integer.class), 3, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i58) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i59) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }));
        b5dVar240.b(zv8VarArr[249]);
        this.N3 = b5dVar240;
        final int i60 = 14;
        b5d b5dVar241 = new b5d(this, -1, false, false, zfe.a(Integer.class), 4, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i60) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar241.b(zv8VarArr[250]);
        this.O3 = b5dVar241;
        final int i61 = 15;
        b5d b5dVar242 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i61) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar242.b(zv8VarArr[251]);
        this.P3 = b5dVar242;
        b5d b5dVar243 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar243.b(zv8VarArr[252]);
        this.Q3 = b5dVar243;
        b5d b5dVar244 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar244.b(zv8VarArr[253]);
        this.R3 = b5dVar244;
        b5d b5dVar245 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar245.b(zv8VarArr[254]);
        this.S3 = b5dVar245;
        b5d b5dVar246 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar246.b(zv8VarArr[255]);
        this.T3 = b5dVar246;
        b5d b5dVar247 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar247.b(zv8VarArr[256]);
        this.U3 = b5dVar247;
        b5d b5dVar248 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar248.b(zv8VarArr[257]);
        this.V3 = b5dVar248;
        b5d b5dVar249 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar249.b(zv8VarArr[258]);
        this.W3 = b5dVar249;
        final int i62 = 16;
        b5d b5dVar250 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 4, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i62) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar250.b(zv8VarArr[259]);
        this.X3 = b5dVar250;
        final int i63 = 17;
        ifh ifhVarQ17 = rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i63) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        });
        final int i64 = 18;
        b5d b5dVar251 = new b5d(this, null, false, false, zfe.a(String.class), 4, ifhVarQ17, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i64) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }));
        b5dVar251.b(zv8VarArr[260]);
        this.Y3 = b5dVar251;
        b5d b5dVar252 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 4, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar252.b(zv8VarArr[261]);
        this.Z3 = b5dVar252;
        final int i65 = 20;
        b5d b5dVar253 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 5, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i65) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar253.b(zv8VarArr[262]);
        this.a4 = b5dVar253;
        b5d b5dVar254 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 5, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar254.b(zv8VarArr[263]);
        this.b4 = b5dVar254;
        b5d b5dVar255 = new b5d(this, 0L, false, false, zfe.a(Long.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar255.b(zv8VarArr[264]);
        this.c4 = b5dVar255;
        final int i66 = 25;
        b5d b5dVar256 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i66) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar256.b(zv8VarArr[265]);
        this.d4 = b5dVar256;
        b5d b5dVar257 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar257.b(zv8VarArr[266]);
        this.e4 = b5dVar257;
        b5d b5dVar258 = new b5d(this, null, false, false, zfe.a(JSONObject.class), 1, eg8Var, eg8Var2);
        b5dVar258.b(zv8VarArr[267]);
        this.f4 = b5dVar258;
        b5d b5dVar259 = new b5d(this, ui9.a, false, false, zfe.a(m8b.class), 1, eg8Var, eg8Var2);
        b5dVar259.b(zv8VarArr[268]);
        this.g4 = b5dVar259;
        final int i67 = 26;
        b5d b5dVar260 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i67) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar260.b(zv8VarArr[269]);
        this.h4 = b5dVar260;
        b5d b5dVar261 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar261.b(zv8VarArr[270]);
        this.i4 = b5dVar261;
        final int i68 = 27;
        final int i69 = 28;
        b5d b5dVar262 = new b5d(this, 300, false, false, zfe.a(Integer.class), 7, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i68) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i69) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }));
        b5dVar262.b(zv8VarArr[271]);
        this.j4 = b5dVar262;
        final int i70 = 29;
        b5d b5dVar263 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 7, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i70) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar263.b(zv8VarArr[272]);
        this.k4 = b5dVar263;
        final int i71 = 0;
        b5d b5dVar264 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 7, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i71) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar264.b(zv8VarArr[273]);
        this.l4 = b5dVar264;
        b5d b5dVar265 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 7, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i46) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar265.b(zv8VarArr[274]);
        this.m4 = b5dVar265;
        b5d b5dVar266 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar266.b(zv8VarArr[275]);
        this.n4 = b5dVar266;
        final int i72 = 3;
        b5d b5dVar267 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 7, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i72) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar267.b(zv8VarArr[276]);
        this.o4 = b5dVar267;
        b5d b5dVar268 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 7, eg8Var, eg8Var2);
        b5dVar268.b(zv8VarArr[277]);
        this.p4 = b5dVar268;
        b5d b5dVar269 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 7, eg8Var, eg8Var2);
        b5dVar269.b(zv8VarArr[278]);
        this.q4 = b5dVar269;
        b5d b5dVar270 = new b5d(this, 5, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar270.b(zv8VarArr[279]);
        this.r4 = b5dVar270;
        b5d b5dVar271 = new b5d(this, 20L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar271.b(zv8VarArr[280]);
        this.s4 = b5dVar271;
        final int i73 = 4;
        b5d b5dVar272 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i73) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar272.b(zv8VarArr[281]);
        this.t4 = b5dVar272;
        b5d b5dVar273 = new b5d(this, "", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar273.b(zv8VarArr[282]);
        this.u4 = b5dVar273;
        b5d b5dVar274 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar274.b(zv8VarArr[283]);
        this.v4 = b5dVar274;
        b5d b5dVar275 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar275.b(zv8VarArr[284]);
        this.w4 = b5dVar275;
        b5d b5dVar276 = new b5d(this, 3, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar276.b(zv8VarArr[285]);
        this.x4 = b5dVar276;
        b5d b5dVar277 = new b5d(this, 10000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar277.b(zv8VarArr[286]);
        this.y4 = b5dVar277;
        b5d b5dVar278 = new b5d(this, 4000L, false, false, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar278.b(zv8VarArr[287]);
        this.z4 = b5dVar278;
        b5d b5dVar279 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar279.b(zv8VarArr[288]);
        this.A4 = b5dVar279;
        b5d b5dVar280 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar280.b(zv8VarArr[289]);
        this.B4 = b5dVar280;
        b5d b5dVar281 = new b5d(this, 80, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar281.b(zv8VarArr[290]);
        this.C4 = b5dVar281;
        sm0 sm0Var = sm0.INSTANCE;
        ifh ifhVarQ18 = rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        });
        final int i74 = 0;
        b5d b5dVar282 = new b5d(this, sm0Var, false, false, zfe.a(xm0.class), 1, ifhVarQ18, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i74) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), rx8.Q(jr4.o));
        b5dVar282.b(zv8VarArr[291]);
        this.D4 = b5dVar282;
        final int i75 = 11;
        b5d b5dVar283 = new b5d(this, -1L, false, false, zfe.a(Long.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i75) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }));
        b5dVar283.b(zv8VarArr[292]);
        this.E4 = b5dVar283;
        b5d b5dVar284 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i72) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar284.b(zv8VarArr[293]);
        this.F4 = b5dVar284;
        b5d b5dVar285 = new b5d(this, 0L, false, true, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar285.b(zv8VarArr[294]);
        this.G4 = b5dVar285;
        b5d b5dVar286 = new b5d(this, null, false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar286.b(zv8VarArr[295]);
        this.H4 = b5dVar286;
        b5d b5dVar287 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar287.b(zv8VarArr[296]);
        this.I4 = b5dVar287;
        b5d b5dVar288 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar288.b(zv8VarArr[297]);
        this.J4 = b5dVar288;
        final int i76 = 14;
        b5d b5dVar289 = new b5d(this, new vqg(), false, false, zfe.a(vqg.class), 1, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i76) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2, rx8.Q(jr4.p));
        b5dVar289.b(zv8VarArr[298]);
        this.K4 = b5dVar289;
        b5d b5dVar290 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar290.b(zv8VarArr[299]);
        this.L4 = b5dVar290;
        b5d b5dVar291 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar291.b(zv8VarArr[300]);
        this.M4 = b5dVar291;
        b5d b5dVar292 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new a5d(4)), eg8Var2);
        b5dVar292.b(zv8VarArr[301]);
        this.N4 = b5dVar292;
        b5d b5dVar293 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new yxb(28)), eg8Var2);
        b5dVar293.b(zv8VarArr[302]);
        this.O4 = b5dVar293;
        final int i77 = 8;
        b5d b5dVar294 = new b5d(this, new stg(), false, false, zfe.a(stg.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i77) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2, rx8.Q(jr4.q));
        b5dVar294.b(zv8VarArr[303]);
        this.P4 = b5dVar294;
        b5d b5dVar295 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: v4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i70) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Логгировать локальное аудио";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Не блокировать звук на старте";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Адаптивная complexity опус";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Генерировать peer-id на клиенте";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Быстрый старт через клиентский бекенд";
                    case 5:
                        return new fw(ij8.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Новое API истории звонков";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Threadsafe Fresco";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Конфиг рендеринга видео в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Native WebP decoder";
                    case 10:
                        return new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"};
                    case 11:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Control tls timeout in net client";
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Use dns store to keep ips";
                    case 13:
                        return new String[]{"Данные указывать в формате JsonObject { \"audio\": 0|1|2, \"video\": 0|1|2 }"};
                    case 14:
                        return new String[]{"0 - фича выключена, отвалятся даже уже подключенные аккаунты", "1 - максимум один аккаунт, но если их раньше было больше то они остануться", "2,3,4.. - максимум активных аккаунтов"};
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Плашка представителя организации в профиле";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Бизнес-статус в сабтайтле чата";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Плашка представителя организации в профиле каналов и ботов";
                    case 18:
                        return new fw(n5h.a);
                    case 19:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Организации, для которых не нужно показывать информацию";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Заявки в приватный канал";
                    case 21:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Включить горизонтальное отображение разметки";
                    case 22:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Включить вертикальный жест закрытия экрана звонка";
                    case 23:
                        return new String[]{"Боты-исключения из правила проверки пользовательского касания перед выполнением методов бриджа", "Id ботов указывать в формате JsonArray [123456,789012]", "Id бота для проверки пользовательских касаний:", "На тесте: 1496626", "На проде: 4810464"};
                    case 24:
                        zv8[] zv8VarArr110 = e5d.S6;
                        return "Отображение опросов";
                    case 25:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Создание опроса в диалоге";
                    case 26:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Лимит участников на создание опроса в чате";
                    case 27:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Лимит участников на создание опроса в канале";
                    case 28:
                        return new ArrayMap(HttpStatus.SC_BAD_REQUEST);
                    default:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Fallback разрешения транскода в историях";
                }
            }
        }), eg8Var2);
        b5dVar295.b(zv8VarArr[304]);
        this.Q4 = b5dVar295;
        final int i78 = 10;
        b5d b5dVar296 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i78) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar296.b(zv8VarArr[305]);
        this.R4 = b5dVar296;
        final int i79 = 21;
        b5d b5dVar297 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: w4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i79) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "TTL поллинга опросов";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Опросы 2.0";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "⛬ CHAT_HISTORY persist";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "max CHAT_HISTORY after login count";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Validate server ssl session";
                    case 5:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Use android platform-independent X509 tm";
                    case 6:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Reduce battery consumption in session";
                    case 7:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Use exec-time when check session timeout";
                    case 8:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Database query executor pool count";
                    case 9:
                        return new String[]{"-1: default (io)", ">0: threads count in pool"};
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Удаление поворота видео из метаданных в историях";
                    case 11:
                        return new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"};
                    case 12:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Database transaction executor pool count";
                    case 13:
                        return new String[]{"1: default (custom single executor)", ">1: threads count in pool"};
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "WorkManager db threadpool count";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Фейк прогресс для загрузки видео";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Disable LinkedTransferQueue34";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Watchdog config";
                    case 18:
                        return new String[]{"example:", "{\"enabled\":true,\"stuck\":1,\"hang\":3}"};
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Enable Fresco executor-hack";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Новое контекстное меню сообщений";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Форсировать CBR при транскоде историй";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Зум фотографий в сообщении";
                    case 23:
                        return new fw(n5h.a);
                    case 24:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Id бота для создания стикеров";
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Разрешить редактирование стикерсетов";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Сбор meta info видимых сообщений по клику";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Presence ttl";
                    case 28:
                        return new String[]{"300: default", "-: ttl timeout"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Presence external";
                }
            }
        }), eg8Var2);
        b5dVar297.b(zv8VarArr[306]);
        this.S4 = b5dVar297;
        final int i80 = 2;
        b5d b5dVar298 = new b5d(this, 720, false, false, zfe.a(Integer.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i80) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar298.b(zv8VarArr[307]);
        this.T4 = b5dVar298;
        final int i81 = 6;
        b5d b5dVar299 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i81) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar299.b(zv8VarArr[308]);
        this.U4 = b5dVar299;
        final int i82 = 7;
        b5d b5dVar300 = new b5d(this, new vsg(), false, false, zfe.a(vsg.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i82) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2, rx8.Q(jr4.r));
        b5dVar300.b(zv8VarArr[309]);
        this.V4 = b5dVar300;
        b5d b5dVar301 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar301.b(zv8VarArr[310]);
        this.W4 = b5dVar301;
        b5d b5dVar302 = new b5d(this, 1, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar302.b(zv8VarArr[311]);
        this.X4 = b5dVar302;
        final int i83 = 8;
        b5d b5dVar303 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i83) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar303.b(zv8VarArr[312]);
        this.Y4 = b5dVar303;
        b5d b5dVar304 = new b5d(this, 30720, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar304.b(zv8VarArr[313]);
        this.Z4 = b5dVar304;
        b5d b5dVar305 = new b5d(this, 48000, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar305.b(zv8VarArr[314]);
        this.a5 = b5dVar305;
        final int i84 = 9;
        b5d b5dVar306 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 4, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i84) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i78) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }));
        b5dVar306.b(zv8VarArr[315]);
        this.b5 = b5dVar306;
        final int i85 = 11;
        b5d b5dVar307 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i85) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }));
        b5dVar307.b(zv8VarArr[316]);
        this.c5 = b5dVar307;
        b5d b5dVar308 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar308.b(zv8VarArr[317]);
        this.d5 = b5dVar308;
        b5d b5dVar309 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar309.b(zv8VarArr[318]);
        this.e5 = b5dVar309;
        b5d b5dVar310 = new b5d(this, "https://vkvideo.ru/live", false, false, zfe.a(String.class), 1, eg8Var, eg8Var2);
        b5dVar310.b(zv8VarArr[319]);
        this.f5 = b5dVar310;
        final int i86 = 13;
        b5d b5dVar311 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i86) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar311.b(zv8VarArr[320]);
        this.g5 = b5dVar311;
        b5d b5dVar312 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar312.b(zv8VarArr[321]);
        this.h5 = b5dVar312;
        final int i87 = 14;
        b5d b5dVar313 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i87) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar313.b(zv8VarArr[322]);
        this.i5 = b5dVar313;
        b5d b5dVar314 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar314.b(zv8VarArr[323]);
        this.j5 = b5dVar314;
        b5d b5dVar315 = new b5d(this, 0, true, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar315.b(zv8VarArr[324]);
        this.k5 = b5dVar315;
        b5d b5dVar316 = new b5d(this, 0, true, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar316.b(zv8VarArr[325]);
        this.l5 = b5dVar316;
        final int i88 = 15;
        b5d b5dVar317 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i88) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar317.b(zv8VarArr[326]);
        this.m5 = b5dVar317;
        b5d b5dVar318 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar318.b(zv8VarArr[327]);
        this.n5 = b5dVar318;
        e14.Companion.getClass();
        ifh ifhVarQ19 = rx8.Q(jr4.s);
        b5d b5dVar319 = new b5d(this, e14.d, false, false, zfe.a(e14.class), 1, eg8Var, eg8Var2, ifhVarQ19);
        b5dVar319.b(zv8VarArr[328]);
        this.o5 = b5dVar319;
        b5d b5dVar320 = new b5d(this, 100, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar320.b(zv8VarArr[329]);
        this.p5 = b5dVar320;
        final int i89 = 16;
        b5d b5dVar321 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i89) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar321.b(zv8VarArr[330]);
        this.q5 = b5dVar321;
        final int i90 = 17;
        b5d b5dVar322 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i90) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar322.b(zv8VarArr[331]);
        this.r5 = b5dVar322;
        final int i91 = 18;
        b5d b5dVar323 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i91) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar323.b(zv8VarArr[332]);
        this.s5 = b5dVar323;
        final int i92 = 20;
        b5d b5dVar324 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i92) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar324.b(zv8VarArr[333]);
        this.t5 = b5dVar324;
        final int i93 = 21;
        b5d b5dVar325 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i93) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar325.b(zv8VarArr[334]);
        this.u5 = b5dVar325;
        b5d b5dVar326 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar326.b(zv8VarArr[335]);
        this.v5 = b5dVar326;
        b5d b5dVar327 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 6, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i44) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar327.b(zv8VarArr[336]);
        this.w5 = b5dVar327;
        b5d b5dVar328 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar328.b(zv8VarArr[337]);
        this.x5 = b5dVar328;
        b5d b5dVar329 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar329.b(zv8VarArr[338]);
        this.y5 = b5dVar329;
        b5d b5dVar330 = new b5d(this, bool, true, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar330.b(zv8VarArr[339]);
        this.z5 = b5dVar330;
        final int i94 = 23;
        b5d b5dVar331 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i94) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar331.b(zv8VarArr[340]);
        this.A5 = b5dVar331;
        final int i95 = 25;
        b5d b5dVar332 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i95) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar332.b(zv8VarArr[341]);
        this.B5 = b5dVar332;
        final int i96 = 26;
        b5d b5dVar333 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i96) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar333.b(zv8VarArr[342]);
        this.C5 = b5dVar333;
        hs2.Companion.getClass();
        gs2.a();
        b5d b5dVar334 = new b5d(this, hs2.e, false, false, zfe.a(hs2.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.t));
        b5dVar334.b(zv8VarArr[343]);
        this.D5 = b5dVar334;
        b5d b5dVar335 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.u));
        b5dVar335.b(zv8VarArr[344]);
        this.E5 = b5dVar335;
        b5d b5dVar336 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.v));
        b5dVar336.b(zv8VarArr[345]);
        this.F5 = b5dVar336;
        b5d b5dVar337 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar337.b(zv8VarArr[346]);
        this.G5 = b5dVar337;
        final int i97 = 27;
        final int i98 = 28;
        b5d b5dVar338 = new b5d(this, new ka2(), false, false, zfe.a(ka2.class), 2, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i97) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i98) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), rx8.Q(jr4.w));
        b5dVar338.b(zv8VarArr[347]);
        this.H5 = b5dVar338;
        b5d b5dVar339 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 5, rx8.Q(new af7() { // from class: x4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i70) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Presence не-legacy сравнение";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Presence stat";
                    case 2:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Качество историй при фолбеке на VBR";
                    case 3:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Presence: update by NOTIF_TYPING";
                    case 4:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Включить клиентское создание conversations id";
                    case 5:
                        return new fw(n5h.a);
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Перемещаемые слои рисования в сторис";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Конфиг рендеринга фото в историях";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Реакция по двойному тапу в историях";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Прогрев текста";
                    case 10:
                        return new String[]{"по умолчанию выключен"};
                    case 11:
                        return new String[]{"Скрытие дивайдера информера, заведен на всякий случай, default = true"};
                    case 12:
                        return new fw(n5h.a);
                    case 13:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Видимость номера";
                    case 14:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "onNewIntent NPE fix";
                    case 15:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Фейк-босс плашка в списке сообщений";
                    case 16:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Реакции в комментариях";
                    case 17:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Нотиф о новом комментарии";
                    case 18:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Нотиф удаления комментариев";
                    case 19:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "JSON конфиг работы в фоне. Пример: {\"alarm_interval_minutes\":10,\"suggestion_interval_minutes\":60,\"observe_check_interval_seconds\":10}";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Нотиф удаления диапазона комментариев";
                    case 21:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Нотифы реакций в комментариях";
                    case 22:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Отмена устаревших нотификаций в notifyAllChats";
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Включить sw VP8 simulcast";
                    case 24:
                        return new fw(ij8.a);
                    case 25:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Включить simulcast для всех кодеков";
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Включить ранний захват видео до установки WebRTC соединения";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Таймауты сигналинга";
                    case 28:
                        return new String[]{"Данные указывать в формате JsonObject { \"use\": boolean, \"cto\": long, \"ird\": long, \"rdsf\": float, \"mrd\": long }", "Подробнее в CALLS-4663"};
                    default:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Новая палитра градиентов аватаров";
                }
            }
        }), eg8Var2);
        b5dVar339.b(zv8VarArr[348]);
        this.I5 = b5dVar339;
        final int i99 = 1;
        b5d b5dVar340 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 5, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i99) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar340.b(zv8VarArr[349]);
        this.J5 = b5dVar340;
        final int i100 = 2;
        b5d b5dVar341 = new b5d(this, 0L, false, false, zfe.a(Long.class), 2, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i100) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar341.b(zv8VarArr[350]);
        this.K5 = b5dVar341;
        b5d b5dVar342 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i72) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar342.b(zv8VarArr[351]);
        this.L5 = b5dVar342;
        final int i101 = 4;
        b5d b5dVar343 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i101) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar343.b(zv8VarArr[352]);
        this.M5 = b5dVar343;
        b5d b5dVar344 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar344.b(zv8VarArr[353]);
        this.N5 = b5dVar344;
        b5d b5dVar345 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar345.b(zv8VarArr[354]);
        this.O5 = b5dVar345;
        b5d b5dVar346 = new b5d(this, null, false, false, zfe.a(ef8.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.x));
        b5dVar346.b(zv8VarArr[355]);
        this.P5 = b5dVar346;
        final int i102 = 5;
        b5d b5dVar347 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i102) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar347.b(zv8VarArr[356]);
        this.Q5 = b5dVar347;
        final int i103 = 7;
        b5d b5dVar348 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i103) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar348.b(zv8VarArr[357]);
        this.R5 = b5dVar348;
        final int i104 = 8;
        ifh ifhVarQ20 = rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i104) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        });
        final int i105 = 9;
        b5d b5dVar349 = new b5d(this, 0, false, false, zfe.a(Integer.class), 1, ifhVarQ20, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i105) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }));
        b5dVar349.b(zv8VarArr[358]);
        this.S5 = b5dVar349;
        b5d b5dVar350 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i78) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar350.b(zv8VarArr[359]);
        this.T5 = b5dVar350;
        b5d b5dVar351 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar351.b(zv8VarArr[360]);
        this.U5 = b5dVar351;
        b5d b5dVar352 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar352.b(zv8VarArr[361]);
        this.V5 = b5dVar352;
        final int i106 = 12;
        b5d b5dVar353 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i106) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar353.b(zv8VarArr[362]);
        this.W5 = b5dVar353;
        b5d b5dVar354 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar354.b(zv8VarArr[363]);
        this.X5 = b5dVar354;
        final int i107 = 13;
        b5d b5dVar355 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 10, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i107) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar355.b(zv8VarArr[364]);
        this.Y5 = b5dVar355;
        final int i108 = 14;
        b5d b5dVar356 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i108) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar356.b(zv8VarArr[365]);
        this.Z5 = b5dVar356;
        b5d b5dVar357 = new b5d(this, 100, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar357.b(zv8VarArr[366]);
        this.a6 = b5dVar357;
        b5d b5dVar358 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar358.b(zv8VarArr[367]);
        this.b6 = b5dVar358;
        final int i109 = 15;
        b5d b5dVar359 = new b5d(this, new llh(), false, false, zfe.a(llh.class), 2, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i109) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2, rx8.Q(jr4.z));
        b5dVar359.b(zv8VarArr[368]);
        this.c6 = b5dVar359;
        final int i110 = 16;
        b5d b5dVar360 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i110) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar360.b(zv8VarArr[369]);
        this.d6 = b5dVar360;
        final int i111 = 17;
        b5d b5dVar361 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i111) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar361.b(zv8VarArr[370]);
        this.e6 = b5dVar361;
        b5d b5dVar362 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar362.b(zv8VarArr[371]);
        this.f6 = b5dVar362;
        final int i112 = 20;
        b5d b5dVar363 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i112) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar363.b(zv8VarArr[372]);
        this.g6 = b5dVar363;
        b5d b5dVar364 = new b5d(this, null, false, false, zfe.a(vhe.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.A));
        b5dVar364.b(zv8VarArr[373]);
        this.h6 = b5dVar364;
        final int i113 = 21;
        b5d b5dVar365 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i113) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar365.b(zv8VarArr[374]);
        this.i6 = b5dVar365;
        b5d b5dVar366 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.B));
        b5dVar366.b(zv8VarArr[375]);
        this.j6 = b5dVar366;
        b5d b5dVar367 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i94) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar367.b(zv8VarArr[376]);
        this.k6 = b5dVar367;
        b5d b5dVar368 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar368.b(zv8VarArr[377]);
        this.l6 = b5dVar368;
        final int i114 = 25;
        b5d b5dVar369 = new b5d(this, 0, false, false, zfe.a(Integer.class), 2, eg8Var, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i114) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }));
        b5dVar369.b(zv8VarArr[378]);
        this.m6 = b5dVar369;
        final int i115 = 26;
        b5d b5dVar370 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i115) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar370.b(zv8VarArr[379]);
        this.n6 = b5dVar370;
        final int i116 = 27;
        b5d b5dVar371 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i116) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar371.b(zv8VarArr[380]);
        this.o6 = b5dVar371;
        final int i117 = 28;
        b5d b5dVar372 = new b5d(this, 5, false, false, zfe.a(Integer.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i117) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar372.b(zv8VarArr[381]);
        this.p6 = b5dVar372;
        b5d b5dVar373 = new b5d(this, 300L, false, false, zfe.a(Long.class), 1, rx8.Q(new af7() { // from class: y4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i70) {
                    case 0:
                        return new String[]{"{\"bg_interval_minutes\":10,\"suggestion_interval_minutes\":1,\"fg_interval_seconds\":10}"};
                    case 1:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Аватар из кэша другого размера вместо плейсхолдера";
                    case 2:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "Время жизни общих настроек звонка (сек)";
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Fix счётчиков папок";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Уведомление о заблокированных пользователях";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Плейсхолдер представителя организации в списке сообщений";
                    case 6:
                        return new fw(jpb.a);
                    case 7:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Отключить инвалидацию последних сообщений и заголовков при смене локали";
                    case 8:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "One-video транслоадер";
                    case 9:
                        return new String[]{"0: выключено", ">= 1: кол-во соединений аплоадера"};
                    case 10:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Фикс зацикливания синка контактов";
                    case 11:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Ping background interval";
                    case 12:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Использовать стандартный механизм перезапуска сессии при смене языка";
                    case 13:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "отмена запросов в очереди";
                    case 14:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Обновление ссылок";
                    case 15:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Расширенные состояния соединения в телеком";
                    case 16:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Использовать PhoneAccount общий account manager";
                    case 17:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Suspend версия скачивания стикеров";
                    case 18:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Переход из 1-1 звонка в групповой";
                    case 19:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Создавать новый плеер для каждого рингтона";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "Восстанавливать локаль после открытия webview";
                    case 21:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Единый CropHelper";
                    case 22:
                        return new String[]{"в секундах", "по умолчанию выключено, значение: -1"};
                    case 23:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Разделение сервисов звонков (TelecomCallService + VoIpCallService)";
                    case 24:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Параллельные звонки";
                    case 25:
                        return new String[]{"<= 0 - Звук отключен", "> 0 - Интервал повтора звука в секундах"};
                    case 26:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Публичные каналы с развилкой цида";
                    case 27:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Публичные каналы с префиксом ссылки";
                    case 28:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Максимально количество публичных каналов с ЦИД";
                    default:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Дебаунс на запрос проверки названия канала";
                }
            }
        }), eg8Var2);
        b5dVar373.b(zv8VarArr[382]);
        this.q6 = b5dVar373;
        final int i118 = 1;
        b5d b5dVar374 = new b5d(this, 15L, false, false, zfe.a(Long.class), 1, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i118) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar374.b(zv8VarArr[383]);
        this.r6 = b5dVar374;
        b5d b5dVar375 = new b5d(this, 0, false, true, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar375.b(zv8VarArr[384]);
        this.s6 = b5dVar375;
        b5d b5dVar376 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar376.b(zv8VarArr[385]);
        this.t6 = b5dVar376;
        final int i119 = 2;
        b5d b5dVar377 = new b5d(this, 0, false, false, zfe.a(Integer.class), 1, eg8Var, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i119) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }));
        b5dVar377.b(zv8VarArr[386]);
        this.u6 = b5dVar377;
        final int i120 = 4;
        b5d b5dVar378 = new b5d(this, "", false, false, zfe.a(String.class), 1, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i120) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar378.b(zv8VarArr[387]);
        this.v6 = b5dVar378;
        final int i121 = 5;
        b5d b5dVar379 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i121) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar379.b(zv8VarArr[388]);
        this.w6 = b5dVar379;
        final int i122 = 6;
        b5d b5dVar380 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i122) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar380.b(zv8VarArr[389]);
        this.x6 = b5dVar380;
        b5d b5dVar381 = new b5d(this, 2000, false, false, zfe.a(Integer.class), 1, eg8Var, eg8Var2);
        b5dVar381.b(zv8VarArr[390]);
        this.y6 = b5dVar381;
        b5d b5dVar382 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar382.b(zv8VarArr[391]);
        this.z6 = b5dVar382;
        b5d b5dVar383 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar383.b(zv8VarArr[392]);
        this.A6 = b5dVar383;
        final int i123 = 7;
        b5d b5dVar384 = new b5d(this, 20, false, true, zfe.a(Integer.class), 1, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i123) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar384.b(zv8VarArr[393]);
        this.B6 = b5dVar384;
        b5d b5dVar385 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar385.b(zv8VarArr[394]);
        this.C6 = b5dVar385;
        b5d b5dVar386 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar386.b(zv8VarArr[395]);
        this.D6 = b5dVar386;
        sr3 sr3VarA12 = zfe.a(Boolean.class);
        ifh ifhVarQ21 = rx8.Q(new i94(12));
        String name11 = ((l72) zv8VarArr[396]).getName();
        o().put(name11, new i5d(name11, bool2, 1, false, false, eg8Var, eg8Var2, sr3VarA12, ifhVarQ21, this));
        final int i124 = 8;
        b5d b5dVar387 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i124) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar387.b(zv8VarArr[397]);
        this.E6 = b5dVar387;
        b5d b5dVar388 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 3, eg8Var, eg8Var2);
        b5dVar388.b(zv8VarArr[398]);
        this.F6 = b5dVar388;
        b5d b5dVar389 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar389.b(zv8VarArr[399]);
        this.G6 = b5dVar389;
        final int i125 = 9;
        b5d b5dVar390 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 2, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i125) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar390.b(zv8VarArr[400]);
        this.H6 = b5dVar390;
        b5d b5dVar391 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar391.b(zv8VarArr[401]);
        this.I6 = b5dVar391;
        b5d b5dVar392 = new b5d(this, dec.INSTANCE, false, false, zfe.a(iec.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.C));
        b5dVar392.b(zv8VarArr[402]);
        this.J6 = b5dVar392;
        b5d b5dVar393 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar393.b(zv8VarArr[403]);
        this.K6 = b5dVar393;
        b5d b5dVar394 = new b5d(this, bool2, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar394.b(zv8VarArr[404]);
        this.L6 = b5dVar394;
        b5d b5dVar395 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i78) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        }), eg8Var2);
        b5dVar395.b(zv8VarArr[405]);
        this.M6 = b5dVar395;
        b5d b5dVar396 = new b5d(this, 0L, false, true, zfe.a(Long.class), 1, eg8Var, eg8Var2);
        b5dVar396.b(zv8VarArr[406]);
        this.N6 = b5dVar396;
        b5d b5dVar397 = new b5d(this, bool, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar397.b(zv8VarArr[407]);
        this.O6 = b5dVar397;
        final int i126 = 11;
        ifh ifhVarQ22 = rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i126) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        });
        sr3 sr3VarA13 = zfe.a(Boolean.class);
        ifh ifhVarQ23 = rx8.Q(new i94(12));
        String name12 = ((l72) zv8VarArr[408]).getName();
        o().put(name12, new i5d(name12, bool, 1, false, true, ifhVarQ22, eg8Var2, sr3VarA13, ifhVarQ23, this));
        final int i127 = 13;
        ifh ifhVarQ24 = rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i127) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        });
        sr3 sr3VarA14 = zfe.a(Boolean.class);
        ifh ifhVarQ25 = rx8.Q(new i94(12));
        String name13 = ((l72) zv8VarArr[409]).getName();
        o().put(name13, new i5d(name13, bool, 1, false, true, ifhVarQ24, eg8Var2, sr3VarA14, ifhVarQ25, this));
        final int i128 = 15;
        ifh ifhVarQ26 = rx8.Q(new af7() { // from class: z4d
            @Override // defpackage.af7
            public final Object invoke() {
                switch (i128) {
                    case 0:
                        zv8[] zv8VarArr2 = e5d.S6;
                        return "Новая сортировка участников в групповых звонках";
                    case 1:
                        zv8[] zv8VarArr3 = e5d.S6;
                        return "ID анимодзи в шапке флоу создания канала";
                    case 2:
                        return new String[]{"0 - поведение по умолчанию, без рустора", "1 - после ошибки от системного провайдера, сходим в рустор", "2 - сначала идем в рустор, потом фолбекаемся на системного провайдера"};
                    case 3:
                        zv8[] zv8VarArr4 = e5d.S6;
                        return "Enable SpinLock in concurrency";
                    case 4:
                        zv8[] zv8VarArr5 = e5d.S6;
                        return "Ссылка на приложение в русторе";
                    case 5:
                        zv8[] zv8VarArr6 = e5d.S6;
                        return "Мини-апп: точка входа из списка чатов и поиска";
                    case 6:
                        zv8[] zv8VarArr7 = e5d.S6;
                        return "Онбоординг папки с каналами";
                    case 7:
                        zv8[] zv8VarArr8 = e5d.S6;
                        return "Количество каналов для скрытия рекомендаций";
                    case 8:
                        zv8[] zv8VarArr9 = e5d.S6;
                        return "Автовход в PiP через setAutoEnterEnabled";
                    case 9:
                        zv8[] zv8VarArr10 = e5d.S6;
                        return "Фикс краша startForegroundService в звонках";
                    case 10:
                        zv8[] zv8VarArr11 = e5d.S6;
                        return "Подсчёт просмотров на пересланных постах";
                    case 11:
                        zv8[] zv8VarArr12 = e5d.S6;
                        return "Мультизакрепы в личных чатах";
                    case 12:
                        zv8[] zv8VarArr13 = e5d.S6;
                        return "Преднастройки группового звонка по ссылке";
                    case 13:
                        zv8[] zv8VarArr14 = e5d.S6;
                        return "Мультизакрепы в групповых чатах";
                    case 14:
                        zv8[] zv8VarArr15 = e5d.S6;
                        return "Конфигурация историй";
                    case 15:
                        zv8[] zv8VarArr16 = e5d.S6;
                        return "Мультизакрепы в каналах";
                    case 16:
                        zv8[] zv8VarArr17 = e5d.S6;
                        return "Комната ожидания администратора в групповых звонках";
                    case 17:
                        zv8[] zv8VarArr18 = e5d.S6;
                        return "Закрывать активити после звонка с экрана блокировки";
                    case 18:
                        zv8[] zv8VarArr19 = e5d.S6;
                        return "URI для исходящего звонка (Telecom)";
                    case 19:
                        zv8[] zv8VarArr20 = e5d.S6;
                        return "Последовательное переключение аудио устройств";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        zv8[] zv8VarArr21 = e5d.S6;
                        return "Логгирование WebRtc в звонках";
                    case 21:
                        zv8[] zv8VarArr22 = e5d.S6;
                        return "Конфигурация ai opus bwe";
                    case 22:
                        zv8[] zv8VarArr23 = e5d.S6;
                        return "Отправлять статистику во время звонка";
                    case 23:
                        zv8[] zv8VarArr24 = e5d.S6;
                        return "Использовать LL audio";
                    case 24:
                        zv8[] zv8VarArr25 = e5d.S6;
                        return "Включение историй на списке чата";
                    case 25:
                        zv8[] zv8VarArr26 = e5d.S6;
                        return "Отключить deprecated статистику webrtc";
                    case 26:
                        zv8[] zv8VarArr27 = e5d.S6;
                        return "Быстрое присоединение через клиентский бекенд";
                    case 27:
                        zv8[] zv8VarArr28 = e5d.S6;
                        return "Задержка перед стартом звонка";
                    case 28:
                        zv8[] zv8VarArr29 = e5d.S6;
                        return "Конфиг шумодава";
                    default:
                        return new String[]{"{\"use\":false,\"ver\":2,\"label\":\"optional\"}", "1 - Китайский оригинальный", "2 - Китайский ускоренный", "3 - df_tiny"};
                }
            }
        });
        sr3 sr3VarA15 = zfe.a(Boolean.class);
        ifh ifhVarQ27 = rx8.Q(new i94(12));
        String name14 = ((l72) zv8VarArr[410]).getName();
        o().put(name14, new i5d(name14, bool, 1, false, true, ifhVarQ26, eg8Var2, sr3VarA15, ifhVarQ27, this));
        ddb ddbVar = edb.d;
        ddb.e();
        b5d b5dVar398 = new b5d(this, edb.e, false, false, zfe.a(edb.class), 1, eg8Var, eg8Var2, rx8.Q(jr4.D));
        b5dVar398.b(zv8VarArr[411]);
        this.P6 = b5dVar398;
        b5d b5dVar399 = new b5d(this, bool, false, false, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar399.b(zv8VarArr[412]);
        this.Q6 = b5dVar399;
        b5d b5dVar400 = new b5d(this, bool2, false, true, zfe.a(Boolean.class), 1, eg8Var, eg8Var2);
        b5dVar400.b(zv8VarArr[413]);
        this.R6 = b5dVar400;
    }

    public final i5d A() {
        return this.k6.a(S6[376]);
    }

    public final i5d B() {
        return this.I4.a(S6[296]);
    }

    public final i5d C() {
        return this.U3.a(S6[256]);
    }

    public final i5d D() {
        return this.n2.a(S6[169]);
    }

    public final f5d a() {
        return (f5d) this.d.getValue();
    }

    public final g5d b() {
        return (g5d) this.c.getValue();
    }

    public final i5d c() {
        return this.I1.a(S6[137]);
    }

    public final i5d d() {
        return this.j.a(S6[1]);
    }

    public final void e(Map map, SharedPreferences.Editor editor, int i) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                d0g.e(editor, str, entry.getValue());
            } catch (Throwable th) {
                gm0.V(e5d.class.getName(), "fail!", new c5d(th));
            }
            i5d i5dVar = (i5d) o().get(str);
            if (i5dVar != null) {
                if (i5dVar.o != i) {
                    i5dVar = null;
                }
                if (i5dVar != null) {
                    arrayList.add(i5dVar);
                }
            }
        }
        editor.commit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((i5d) it.next()).k();
        }
    }

    public final i5d f() {
        return this.u1.a(S6[123]);
    }

    public final i5d g() {
        return this.i2.a(S6[164]);
    }

    public final i5d h() {
        return this.p1.a(S6[118]);
    }

    public final i5d i() {
        return this.M2.a(S6[195]);
    }

    public final i5d j() {
        return this.q2.a(S6[172]);
    }

    public final i5d k() {
        return this.I6.a(S6[401]);
    }

    public final i5d l() {
        return this.J6.a(S6[402]);
    }

    public final i5d m() {
        return this.m2.a(S6[168]);
    }

    public final i5d n() {
        return this.N2.a(S6[196]);
    }

    public final ArrayMap o() {
        return (ArrayMap) this.h.getValue();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        i5d i5dVar;
        if (str == null || (i5dVar = (i5d) o().get(str)) == null) {
            return;
        }
        i5dVar.k();
    }

    public final i5d p() {
        return this.t6.a(S6[385]);
    }

    public final SharedPreferences q() {
        return (SharedPreferences) this.e.getValue();
    }

    public final i5d r() {
        return this.K4.a(S6[298]);
    }

    public final i5d s() {
        return this.c6.a(S6[368]);
    }

    public final i5d t() {
        return this.g6.a(S6[372]);
    }

    public final i5d u() {
        return this.d5.a(S6[317]);
    }

    public final boolean v(Integer num) {
        zv8[] zv8VarArr = S6;
        if (!((Boolean) this.o3.a(zv8VarArr[224]).i()).booleanValue()) {
            return false;
        }
        if (num != null && num.intValue() == 2) {
            return ((Boolean) this.t3.a(zv8VarArr[229]).i()).booleanValue();
        }
        return true;
    }

    public final i5d w() {
        return this.T5.a(S6[359]);
    }

    public final i5d x() {
        return this.g2.a(S6[162]);
    }

    public final i5d y() {
        return this.l6.a(S6[377]);
    }

    public final i5d z() {
        return this.s6.a(S6[384]);
    }
}
