package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.eu6;
import defpackage.fq;
import defpackage.hu8;
import defpackage.it0;
import defpackage.j95;
import defpackage.jsb;
import defpackage.jt0;
import defpackage.l6m;
import defpackage.lj8;
import defpackage.mv8;
import defpackage.np;
import defpackage.qf7;
import defpackage.rp;
import defpackage.up;
import defpackage.vo;
import defpackage.vp;
import defpackage.vu8;
import defpackage.zo;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversation;", "", "<init>", "()V", "Request", "Response", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JoinConversation {
    private static final String LOG_TAG = "JoinConversation";
    public static final String METHOD_NAME = "vchat.joinConversation";

    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0014H\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0016J\u0018\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\"\u0010\u0016J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b#\u0010!R\u001c\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0$8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010.\u001a\u00020+8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040/8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Request;", "Lrp;", "Ljsb;", "Lzo;", "Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response;", "", "cid", "", ApiProtocol.PARAM_PEER_ID, "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "Lkotlin/Function2;", "Lit0;", "Lsbi;", "callback", "<init>", "(Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lqf7;)V", "", "handleInterruptedIO", "()Ljava/lang/Object;", "", "canRepeat", "()Z", "shouldPost", "shouldGzip", "shouldReport", "shouldNeverPost", "shouldNeverGzip", "shouldNeverJson", "willWriteParams", "Lmv8;", "writer", "writeParams", "(Lmv8;)V", "willWriteSupplyParams", "writeSupplyParams", "Lhu8;", "getOkParser", "()Lhu8;", "okParser", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "failParser", "Lvp;", "getScopeAfter", "()Lvp;", "scopeAfter", "Lvo;", "getConfigExtractor", "()Lvo;", "configExtractor", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lup;", "getScope", "()Lup;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Request implements rp, jsb, zo {
        private final /* synthetic */ jt0 $$delegate_0;

        public Request(String str, long j, StartCallApiParams startCallApiParams, qf7 qf7Var) {
            it0 it0Var = new it0(fq.b(JoinConversation.METHOD_NAME));
            it0Var.b = up.c;
            it0Var.b(ApiProtocol.PARAM_CONVERSATION_ID, str);
            lj8 lj8Var = new lj8(ApiProtocol.PARAM_PEER_ID, j);
            np npVar = it0Var.c;
            npVar.a(lj8Var);
            it0Var.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.getIsVideo());
            it0Var.b(ApiProtocol.PARAM_CAPABILITIES, startCallApiParams.getHexCapability());
            Long chatId = startCallApiParams.getChatId();
            if (chatId != null) {
                npVar.a(new lj8(ApiProtocol.PARAM_CHAT_ID, chatId.longValue()));
            }
            if (startCallApiParams.getIsMultipleDevicesEnabled()) {
                GlobalRTCLogger.log(JoinConversation.LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
                npVar.a(new lj8(ApiProtocol.PARAM_PROTOCOL_VERSION, 6L));
            }
            qf7Var.invoke(startCallApiParams, it0Var);
            this.$$delegate_0 = it0Var.a(Response.INSTANCE.getPARSER());
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
            return new Response(false, "", "", 0);
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response;", "", "p2pForbidden", "", ApiProtocol.KEY_ENDPOINT, "", "wtEndpoint", "deviceIndex", "", "<init>", "(ZLjava/lang/String;Ljava/lang/String;I)V", "getP2pForbidden", "()Z", "getEndpoint", "()Ljava/lang/String;", "getWtEndpoint", "getDeviceIndex", "()I", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Response {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final hu8 PARSER = new eu6(25);
        private final int deviceIndex;
        private final String endpoint;
        private final boolean p2pForbidden;
        private final String wtEndpoint;

        public Response(boolean z, String str, String str2, int i) {
            this.p2pForbidden = z;
            this.endpoint = str;
            this.wtEndpoint = str2;
            this.deviceIndex = i;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static final Response PARSER$lambda$0(vu8 vu8Var) {
            vu8Var.p();
            boolean zV = false;
            String strF = "";
            String strF2 = strF;
            int iZ = 0;
            while (vu8Var.hasNext()) {
                String strName = vu8Var.name();
                switch (strName.hashCode()) {
                    case -17633304:
                        if (!strName.equals(ApiProtocol.KEY_P2P_FORBIDDEN)) {
                            vu8Var.F();
                        } else {
                            zV = vu8Var.V();
                        }
                        break;
                    case 781502804:
                        if (!strName.equals(ApiProtocol.KEY_DEVICE_IDX)) {
                            vu8Var.F();
                        } else {
                            iZ = vu8Var.z();
                        }
                        break;
                    case 1422043319:
                        if (!strName.equals(ApiProtocol.KEY_WT_ENDPOINT)) {
                            vu8Var.F();
                        } else {
                            strF2 = vu8Var.F();
                        }
                        break;
                    case 1741102485:
                        if (!strName.equals(ApiProtocol.KEY_ENDPOINT)) {
                            vu8Var.F();
                        } else {
                            strF = vu8Var.F();
                        }
                        break;
                    default:
                        vu8Var.F();
                        break;
                }
            }
            vu8Var.t();
            return new Response(zV, strF, strF2, iZ);
        }

        public final int getDeviceIndex() {
            return this.deviceIndex;
        }

        public final String getEndpoint() {
            return this.endpoint;
        }

        public final boolean getP2pForbidden() {
            return this.p2pForbidden;
        }

        public final String getWtEndpoint() {
            return this.wtEndpoint;
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response$Companion;", "", "<init>", "()V", "Lhu8;", "Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response;", "kotlin.jvm.PlatformType", "PARSER", "Lhu8;", "getPARSER", "()Lhu8;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j95 j95Var) {
                this();
            }

            public final hu8 getPARSER() {
                return Response.PARSER;
            }

            private Companion() {
            }
        }
    }
}
