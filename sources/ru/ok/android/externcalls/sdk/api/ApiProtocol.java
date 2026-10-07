package ru.ok.android.externcalls.sdk.api;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lru/ok/android/externcalls/sdk/api/ApiProtocol;", "", "<init>", "()V", "PARAM_CONVERSATION_ID", "", "PARAM_PEER_ID", "PARAM_ANONYM_TOKEN", "PARAM_IS_VIDEO", "PARAM_CHAT_ID", "PARAM_PROTOCOL_VERSION", "PARAM_TURN_SERVERS", "PARAM_CREATE_JOIN_LINK", "PARAM_WAIT_FOR_ADMIN", "PARAM_JOIN_LINK", "PARAM_UIDS", "PARAM_EXTERNAL_IDS", "PARAM_ONLY_ADMIN_CAN_SHARE_MOVIE", "PARAM_ONLY_ADMIN_CAN_RECORD", "PARAM_DOMAIN_ID", "PARAM_DEVICE_ID", "PARAM_CLIENT_APP_KEY", "PARAM_PAYLOAD", "PARAM_SDK_VERSION", "PARAM_PLATFORM", "PARAM_KEYS", "PARAM_VERSION", "PARAM_REASON", "PARAM_CAPABILITIES", "PARAM_WEB_RTC_PLATFORM", "PARAM_TYPE", "KEY_P2P_FORBIDDEN", "KEY_ENDPOINT", "KEY_WT_ENDPOINT", "KEY_DEVICE_IDX", "KEY_JOIN_LINK", "KEY_TURN_SERVER", "KEY_IS_CONCURRENT", "KEY_ID", "KEY_STUN_SERVER", "KEY_CLIENT_TYPE", "KEY_TOKEN", "KEY_UPLOAD_URL", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ApiProtocol {
    public static final ApiProtocol INSTANCE = new ApiProtocol();
    public static final String KEY_CLIENT_TYPE = "client_type";
    public static final String KEY_DEVICE_IDX = "device_idx";
    public static final String KEY_ENDPOINT = "endpoint";
    public static final String KEY_ID = "id";
    public static final String KEY_IS_CONCURRENT = "is_concurrent";
    public static final String KEY_JOIN_LINK = "join_link";
    public static final String KEY_P2P_FORBIDDEN = "p2p_forbidden";
    public static final String KEY_STUN_SERVER = "stun_server";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_TURN_SERVER = "turn_server";
    public static final String KEY_UPLOAD_URL = "upload_url";
    public static final String KEY_WT_ENDPOINT = "wt_endpoint";
    public static final String PARAM_ANONYM_TOKEN = "anonymToken";
    public static final String PARAM_CAPABILITIES = "capabilities";
    public static final String PARAM_CHAT_ID = "chatId";
    public static final String PARAM_CLIENT_APP_KEY = "clientAppKey";
    public static final String PARAM_CONVERSATION_ID = "conversationId";
    public static final String PARAM_CREATE_JOIN_LINK = "createJoinLink";
    public static final String PARAM_DEVICE_ID = "deviceId";
    public static final String PARAM_DOMAIN_ID = "domainId";
    public static final String PARAM_EXTERNAL_IDS = "externalIds";
    public static final String PARAM_IS_VIDEO = "isVideo";
    public static final String PARAM_JOIN_LINK = "joinLink";
    public static final String PARAM_KEYS = "keys";
    public static final String PARAM_ONLY_ADMIN_CAN_RECORD = "onlyAdminCanRecord";
    public static final String PARAM_ONLY_ADMIN_CAN_SHARE_MOVIE = "onlyAdminCanShareMovie";
    public static final String PARAM_PAYLOAD = "payload";
    public static final String PARAM_PEER_ID = "peerId";
    public static final String PARAM_PLATFORM = "platform";
    public static final String PARAM_PROTOCOL_VERSION = "protocolVersion";
    public static final String PARAM_REASON = "reason";
    public static final String PARAM_SDK_VERSION = "sdkVersion";
    public static final String PARAM_TURN_SERVERS = "turnServers";
    public static final String PARAM_TYPE = "type";
    public static final String PARAM_UIDS = "uids";
    public static final String PARAM_VERSION = "version";
    public static final String PARAM_WAIT_FOR_ADMIN = "waitForAdmin";
    public static final String PARAM_WEB_RTC_PLATFORM = "webrtcPlatform";

    private ApiProtocol() {
    }
}
