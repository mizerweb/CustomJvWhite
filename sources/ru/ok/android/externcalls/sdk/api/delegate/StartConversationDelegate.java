package ru.ok.android.externcalls.sdk.api.delegate;

import defpackage.cqk;
import defpackage.nbh;
import defpackage.qv1;
import defpackage.zo5;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0011\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate;", "", "invoke", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result;", "params", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Params;", "Params", "Result", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface StartConversationDelegate {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Params;", "", ApiProtocol.PARAM_CONVERSATION_ID, "", "calleeIds", "", ApiProtocol.PARAM_CHAT_ID, "", ApiProtocol.PARAM_IS_VIDEO, "", "internalParams", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;ZLjava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getCalleeIds", "()Ljava/util/List;", "getChatId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getInternalParams", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;ZLjava/lang/String;)Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Params;", "equals", "other", "hashCode", "", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Params {
        private final List<String> calleeIds;
        private final Long chatId;
        private final String conversationId;
        private final String internalParams;
        private final boolean isVideo;

        public Params(String str, List<String> list, Long l, boolean z, String str2) {
            this.conversationId = str;
            this.calleeIds = list;
            this.chatId = l;
            this.isVideo = z;
            this.internalParams = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Params copy$default(Params params, String str, List list, Long l, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = params.conversationId;
            }
            if ((i & 2) != 0) {
                list = params.calleeIds;
            }
            if ((i & 4) != 0) {
                l = params.chatId;
            }
            if ((i & 8) != 0) {
                z = params.isVideo;
            }
            if ((i & 16) != 0) {
                str2 = params.internalParams;
            }
            String str3 = str2;
            Long l2 = l;
            return params.copy(str, list, l2, z, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        public final List<String> component2() {
            return this.calleeIds;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getChatId() {
            return this.chatId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getInternalParams() {
            return this.internalParams;
        }

        public final Params copy(String conversationId, List<String> calleeIds, Long chatId, boolean isVideo, String internalParams) {
            return new Params(conversationId, calleeIds, chatId, isVideo, internalParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return cqk.d(this.conversationId, params.conversationId) && cqk.d(this.calleeIds, params.calleeIds) && cqk.d(this.chatId, params.chatId) && this.isVideo == params.isVideo && cqk.d(this.internalParams, params.internalParams);
        }

        public final List<String> getCalleeIds() {
            return this.calleeIds;
        }

        public final Long getChatId() {
            return this.chatId;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getInternalParams() {
            return this.internalParams;
        }

        public int hashCode() {
            int iC = qv1.c(this.conversationId.hashCode() * 31, 31, this.calleeIds);
            Long l = this.chatId;
            return this.internalParams.hashCode() + nbh.n((iC + (l == null ? 0 : l.hashCode())) * 31, 31, this.isVideo);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        public String toString() {
            String str = this.conversationId;
            List<String> list = this.calleeIds;
            Long l = this.chatId;
            boolean z = this.isVideo;
            String str2 = this.internalParams;
            StringBuilder sb = new StringBuilder("Params(conversationId=");
            sb.append(str);
            sb.append(", calleeIds=");
            sb.append(list);
            sb.append(", chatId=");
            sb.append(l);
            sb.append(", isVideo=");
            sb.append(z);
            sb.append(", internalParams=");
            return zo5.w(sb, str2, ")");
        }
    }

    Result invoke(Params params);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result;", "", "Success", "Error", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result$Error;", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result$Success;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Result {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result$Success;", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result;", ApiProtocol.PARAM_CONVERSATION_ID, "", "internalCallerParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getInternalCallerParams", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success implements Result {
            private final String conversationId;
            private final String internalCallerParams;

            public Success(String str, String str2) {
                this.conversationId = str;
                this.internalCallerParams = str2;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.conversationId;
                }
                if ((i & 2) != 0) {
                    str2 = success.internalCallerParams;
                }
                return success.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getConversationId() {
                return this.conversationId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getInternalCallerParams() {
                return this.internalCallerParams;
            }

            public final Success copy(String conversationId, String internalCallerParams) {
                return new Success(conversationId, internalCallerParams);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return cqk.d(this.conversationId, success.conversationId) && cqk.d(this.internalCallerParams, success.internalCallerParams);
            }

            public final String getConversationId() {
                return this.conversationId;
            }

            public final String getInternalCallerParams() {
                return this.internalCallerParams;
            }

            public int hashCode() {
                return this.internalCallerParams.hashCode() + (this.conversationId.hashCode() * 31);
            }

            public String toString() {
                return nbh.w("Success(conversationId=", this.conversationId, ", internalCallerParams=", this.internalCallerParams, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result$Error;", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate$Result;", "errorCode", "", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "(Ljava/lang/Throwable;)V", "getErrorCode", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Error implements Result {
            private final String errorCode;
            private final Throwable throwable;

            private Error(String str, Throwable th) {
                this.errorCode = str;
                this.throwable = th;
            }

            public final String getErrorCode() {
                return this.errorCode;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public Error(String str) {
                this(str, null);
            }

            public Error(Throwable th) {
                this(null, th);
            }
        }
    }
}
