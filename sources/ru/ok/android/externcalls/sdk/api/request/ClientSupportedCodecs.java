package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.afl;
import defpackage.fq;
import defpackage.hu8;
import defpackage.jsb;
import defpackage.l6m;
import defpackage.mv8;
import defpackage.p51;
import defpackage.rp;
import defpackage.up;
import defpackage.vo;
import defpackage.vp;
import defpackage.vu8;
import defpackage.xel;
import defpackage.zo;
import java.io.IOException;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonSerializeException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs;", "", "<init>", "()V", "Request", "Response", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ClientSupportedCodecs {
    public static final String METHOD_NAME = "vchat.clientSupportedCodecs";

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs$Request;", "Lrp;", "Ljsb;", "Lzo;", "Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs$Response;", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "", "shouldPost", "()Z", "shouldGzip", "shouldReport", "canRepeat", "Lmv8;", "writer", "Lsbi;", "writeParams", "(Lmv8;)V", "", "handleInterruptedIO", "()Ljava/lang/Object;", "Lorg/json/JSONObject;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lup;", "getScope", "()Lup;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "Lhu8;", "getOkParser", "()Lhu8;", "okParser", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Request implements rp, jsb, zo {
        private final JSONObject json;

        public Request(JSONObject jSONObject) {
            this.json = jSONObject;
        }

        public static final Response _get_okParser_$lambda$0(vu8 vu8Var) {
            return new Response(xel.c(vu8Var).optBoolean("success", false));
        }

        @Override // defpackage.op
        public boolean canRepeat() {
            return true;
        }

        @Override // defpackage.zo
        public /* bridge */ vo getConfigExtractor() {
            return vo.M;
        }

        @Override // defpackage.zo
        public /* bridge */ hu8 getFailParser() {
            return l6m.c;
        }

        @Override // defpackage.zo
        public hu8 getOkParser() {
            return new p51(27);
        }

        @Override // defpackage.op
        public int getPriority() {
            return 2;
        }

        @Override // defpackage.op
        public up getScope() {
            return up.c;
        }

        @Override // defpackage.zo
        public /* bridge */ vp getScopeAfter() {
            return vp.a;
        }

        @Override // defpackage.op
        public Uri getUri() {
            return fq.b(ClientSupportedCodecs.METHOD_NAME);
        }

        @Override // defpackage.jsb
        public Object handleInterruptedIO() {
            return new Response(false);
        }

        public boolean shouldGzip() {
            return true;
        }

        @Override // defpackage.op
        public /* bridge */ boolean shouldNeverGzip() {
            return false;
        }

        public /* bridge */ boolean shouldNeverJson() {
            return false;
        }

        @Override // defpackage.op
        public /* bridge */ boolean shouldNeverPost() {
            return false;
        }

        public boolean shouldPost() {
            return true;
        }

        public boolean shouldReport() {
            return false;
        }

        @Override // defpackage.op
        public /* bridge */ boolean willWriteParams() {
            return true;
        }

        @Override // defpackage.op
        public /* bridge */ boolean willWriteSupplyParams() {
            return false;
        }

        @Override // defpackage.op
        public void writeParams(mv8 writer) throws JsonSerializeException, IOException {
            writer.a0("data");
            afl.d(writer, this.json);
        }

        @Override // defpackage.op
        public /* bridge */ void writeSupplyParams(mv8 mv8Var) {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs$Response;", "", "success", "", "<init>", "(Z)V", "getSuccess", "()Z", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Response {
        private final boolean success;

        public Response(boolean z) {
            this.success = z;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }
}
