package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.eu6;
import defpackage.fq;
import defpackage.hu8;
import defpackage.it7;
import defpackage.j5h;
import defpackage.j95;
import defpackage.jsb;
import defpackage.jt0;
import defpackage.l6m;
import defpackage.mv8;
import defpackage.np;
import defpackage.rp;
import defpackage.up;
import defpackage.vo;
import defpackage.vp;
import defpackage.vu8;
import defpackage.zo;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/HangupConversation;", "", "<init>", "()V", "Request", "Response", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HangupConversation {
    public static final String METHOD_NAME = "vchat.hangupConversation";

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001dR\u001c\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0 8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0014\u0010*\u001a\u00020'8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040+8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/HangupConversation$Request;", "Lrp;", "Ljsb;", "Lzo;", "Lru/ok/android/externcalls/sdk/api/request/HangupConversation$Response;", "", "cId", "Lit7;", "reason", "anonToken", "<init>", "(Ljava/lang/String;Lit7;Ljava/lang/String;)V", "", "handleInterruptedIO", "()Ljava/lang/Object;", "", "canRepeat", "()Z", "shouldPost", "shouldGzip", "shouldReport", "shouldNeverPost", "shouldNeverGzip", "shouldNeverJson", "willWriteParams", "Lmv8;", "writer", "Lsbi;", "writeParams", "(Lmv8;)V", "willWriteSupplyParams", "writeSupplyParams", "Lhu8;", "getOkParser", "()Lhu8;", "okParser", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "failParser", "Lvp;", "getScopeAfter", "()Lvp;", "scopeAfter", "Lvo;", "getConfigExtractor", "()Lvo;", "configExtractor", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lup;", "getScope", "()Lup;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Request implements rp, jsb, zo {
        private final /* synthetic */ jt0 $$delegate_0;

        public Request(String str, it7 it7Var, String str2) {
            Uri uriB = fq.b(HangupConversation.METHOD_NAME);
            np npVar = new np();
            npVar.a(new j5h(ApiProtocol.PARAM_CONVERSATION_ID, str));
            npVar.a(new j5h("reason", it7Var.toString()));
            npVar.a(new j5h(ApiProtocol.PARAM_ANONYM_TOKEN, str2));
            this.$$delegate_0 = new jt0(uriB, up.c, npVar, Response.INSTANCE.getPARSER());
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
            return new Response();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/HangupConversation$Response;", "", "<init>", "()V", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Response {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final hu8 PARSER = new eu6(17);

        public static final Response PARSER$lambda$0(vu8 vu8Var) {
            return new Response();
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/HangupConversation$Response$Companion;", "", "<init>", "()V", "Lhu8;", "Lru/ok/android/externcalls/sdk/api/request/HangupConversation$Response;", "kotlin.jvm.PlatformType", "PARSER", "Lhu8;", "getPARSER", "()Lhu8;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
