package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.fq;
import defpackage.hu8;
import defpackage.it0;
import defpackage.jsb;
import defpackage.jt0;
import defpackage.l6m;
import defpackage.lj8;
import defpackage.mv8;
import defpackage.rp;
import defpackage.up;
import defpackage.vf7;
import defpackage.vo;
import defpackage.vp;
import defpackage.zo;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/StartConversation;", "", "<init>", "()V", "Request", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StartConversation {
    private static final String LOG_TAG = "StartConversation";
    public static final String METHOD_NAME = "vchat.startConversation";

    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003Bq\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00120\u0010\u0014\u001a,\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b'\u0010\u001bJ\u0018\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b(\u0010&R\u001c\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040)8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001c\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0)8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0014\u00103\u001a\u0002008VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0004048VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/StartConversation$Request;", "Lrp;", "Ljsb;", "Lzo;", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "", "servers", "cid", "", "createLink", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "opponent", "", "opponentExternalIds", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "Lkotlin/Function4;", "Lit0;", "Lsbi;", "Lru/ok/android/externcalls/sdk/api/request/AddParamsByExternalOpponentIdsCallback;", "addParamsByExternalOpponentIdsCallback", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lvf7;)V", "", "handleInterruptedIO", "()Ljava/lang/Object;", "canRepeat", "()Z", "shouldPost", "shouldGzip", "shouldReport", "shouldNeverPost", "shouldNeverGzip", "shouldNeverJson", "willWriteParams", "Lmv8;", "writer", "writeParams", "(Lmv8;)V", "willWriteSupplyParams", "writeSupplyParams", "Lhu8;", "getOkParser", "()Lhu8;", "okParser", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "failParser", "Lvp;", "getScopeAfter", "()Lvp;", "scopeAfter", "Lvo;", "getConfigExtractor", "()Lvo;", "configExtractor", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lup;", "getScope", "()Lup;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Request implements rp, jsb, zo {
        private final /* synthetic */ jt0 $$delegate_0;

        public Request(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams, vf7 vf7Var) {
            it0 it0Var = new it0(fq.b(StartConversation.METHOD_NAME));
            it0Var.b = up.c;
            it0Var.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.getIsVideo());
            it0Var.b(ApiProtocol.PARAM_TURN_SERVERS, str);
            it0Var.b(ApiProtocol.PARAM_CONVERSATION_ID, str2);
            it0Var.c(ApiProtocol.PARAM_CREATE_JOIN_LINK, z);
            it0Var.c(ApiProtocol.PARAM_WAIT_FOR_ADMIN, startCallApiParams.getIsWaitForAdminEnabled());
            it0Var.b(ApiProtocol.PARAM_CAPABILITIES, startCallApiParams.getHexCapability());
            if (startCallApiParams.getIsMultipleDevicesEnabled()) {
                GlobalRTCLogger.log(StartConversation.LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
                it0Var.c.a(new lj8(ApiProtocol.PARAM_PROTOCOL_VERSION, 6L));
            }
            String domainId = startCallApiParams.getDomainId();
            if (domainId != null) {
                it0Var.b(ApiProtocol.PARAM_DOMAIN_ID, domainId);
            }
            String payload = startCallApiParams.getPayload();
            if (payload != null) {
                it0Var.b(ApiProtocol.PARAM_PAYLOAD, payload);
            }
            vf7Var.invoke(conversationParticipant, list, startCallApiParams, it0Var);
            it0Var.c(ApiProtocol.PARAM_ONLY_ADMIN_CAN_SHARE_MOVIE, !startCallApiParams.getIsWatchTogetherEnabledForAll());
            this.$$delegate_0 = it0Var.a(CallInfo.INSTANCE.getPARSER());
        }

        @Override // defpackage.op
        public boolean canRepeat() {
            return this.$$delegate_0.c.b;
        }

        @Override // defpackage.zo
        public vo getConfigExtractor() {
            this.$$delegate_0.getClass();
            return vo.M;
        }

        @Override // defpackage.zo
        public hu8 getFailParser() {
            this.$$delegate_0.getClass();
            return l6m.c;
        }

        @Override // defpackage.zo
        public hu8 getOkParser() {
            return this.$$delegate_0.d;
        }

        @Override // defpackage.op
        public int getPriority() {
            this.$$delegate_0.getClass();
            return 16;
        }

        @Override // defpackage.op
        public up getScope() {
            return this.$$delegate_0.b;
        }

        @Override // defpackage.zo
        public vp getScopeAfter() {
            this.$$delegate_0.getClass();
            return vp.a;
        }

        @Override // defpackage.op
        public Uri getUri() {
            return this.$$delegate_0.a;
        }

        @Override // defpackage.jsb
        public Object handleInterruptedIO() {
            return new CallInfo(null, null, null, null, null, null, null, null, false, null, null, false, 0, 8191, null);
        }

        public boolean shouldGzip() {
            this.$$delegate_0.getClass();
            return false;
        }

        @Override // defpackage.op
        public boolean shouldNeverGzip() {
            this.$$delegate_0.getClass();
            return false;
        }

        public boolean shouldNeverJson() {
            this.$$delegate_0.getClass();
            return false;
        }

        @Override // defpackage.op
        public boolean shouldNeverPost() {
            this.$$delegate_0.getClass();
            return false;
        }

        public boolean shouldPost() {
            return this.$$delegate_0.c.c;
        }

        public boolean shouldReport() {
            this.$$delegate_0.getClass();
            return true;
        }

        @Override // defpackage.op
        public boolean willWriteParams() {
            return this.$$delegate_0.c.d;
        }

        @Override // defpackage.op
        public boolean willWriteSupplyParams() {
            return this.$$delegate_0.c.e;
        }

        @Override // defpackage.op
        public void writeParams(mv8 writer) {
            this.$$delegate_0.writeParams(writer);
        }

        @Override // defpackage.op
        public void writeSupplyParams(mv8 writer) {
            this.$$delegate_0.writeSupplyParams(writer);
        }
    }
}
