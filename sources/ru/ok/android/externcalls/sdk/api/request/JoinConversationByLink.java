package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.fq;
import defpackage.hu8;
import defpackage.j5h;
import defpackage.jsb;
import defpackage.jt0;
import defpackage.l6m;
import defpackage.lcd;
import defpackage.lj8;
import defpackage.mv8;
import defpackage.np;
import defpackage.r66;
import defpackage.rp;
import defpackage.up;
import defpackage.vo;
import defpackage.vp;
import defpackage.xz0;
import defpackage.zo;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.JoinByLinkResponse;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversationByLink;", "", "<init>", "()V", "Request", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JoinConversationByLink {
    public static final String METHOD_NAME = "vchat.joinConversationByLink";

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B+\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b \u0010\u0013J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b!\u0010\u001fR\u001c\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0\"8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0014\u0010,\u001a\u00020)8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040-8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/JoinConversationByLink$Request;", "Lrp;", "Ljsb;", "Lzo;", "Lru/ok/android/externcalls/sdk/api/JoinByLinkResponse;", "", "initialJoinLink", "anonToken", "", ApiProtocol.PARAM_PEER_ID, "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)V", "", "handleInterruptedIO", "()Ljava/lang/Object;", "", "canRepeat", "()Z", "shouldPost", "shouldGzip", "shouldReport", "shouldNeverPost", "shouldNeverGzip", "shouldNeverJson", "willWriteParams", "Lmv8;", "writer", "Lsbi;", "writeParams", "(Lmv8;)V", "willWriteSupplyParams", "writeSupplyParams", "Lhu8;", "getOkParser", "()Lhu8;", "okParser", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "failParser", "Lvp;", "getScopeAfter", "()Lvp;", "scopeAfter", "Lvo;", "getConfigExtractor", "()Lvo;", "configExtractor", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lup;", "getScope", "()Lup;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Request implements rp, jsb, zo {
        private final /* synthetic */ jt0 $$delegate_0;

        public Request(String str, String str2, long j, StartCallApiParams startCallApiParams) {
            Uri uriB = fq.b(JoinConversationByLink.METHOD_NAME);
            np npVar = new np();
            npVar.a(new j5h(ApiProtocol.PARAM_JOIN_LINK, str));
            npVar.a(new xz0(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.getIsVideo()));
            npVar.a(new lj8(ApiProtocol.PARAM_PEER_ID, j));
            npVar.a(new j5h(ApiProtocol.PARAM_ANONYM_TOKEN, str2));
            npVar.a(new j5h(ApiProtocol.PARAM_CAPABILITIES, startCallApiParams.getHexCapability()));
            if (startCallApiParams.getPayload() != null) {
                npVar.a(new lcd(ApiProtocol.PARAM_PAYLOAD, startCallApiParams.getPayload()));
            }
            if (startCallApiParams.getIsMultipleDevicesEnabled()) {
                npVar.a(new lj8(ApiProtocol.PARAM_PROTOCOL_VERSION, 6L));
            }
            this.$$delegate_0 = new jt0(uriB, up.c, npVar, JoinByLinkResponse.PARSER);
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
            r66 r66Var = r66.a;
            return new JoinByLinkResponse("", r66Var, r66Var, "", "", "", "", false, 0);
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
