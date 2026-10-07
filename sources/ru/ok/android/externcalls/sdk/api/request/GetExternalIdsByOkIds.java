package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.fq;
import defpackage.hu8;
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
import defpackage.ww3;
import defpackage.x27;
import defpackage.yt1;
import defpackage.zo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ExternalIdsResponse;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetExternalIdsByOkIds;", "", "<init>", "()V", "Request", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GetExternalIdsByOkIds {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String METHOD_NAME = "vchat.getExternalIdsByOkIds";

    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001cR\u001c\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u001c\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\u001f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0014\u0010)\u001a\u00020&8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040*8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetExternalIdsByOkIds$Request;", "Lrp;", "Ljsb;", "Lzo;", "Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;", "", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "candidates", "<init>", "(Ljava/util/List;)V", "", "handleInterruptedIO", "()Ljava/lang/Object;", "", "canRepeat", "()Z", "shouldPost", "shouldGzip", "shouldReport", "shouldNeverPost", "shouldNeverGzip", "shouldNeverJson", "willWriteParams", "Lmv8;", "writer", "Lsbi;", "writeParams", "(Lmv8;)V", "willWriteSupplyParams", "writeSupplyParams", "Lhu8;", "getOkParser", "()Lhu8;", "okParser", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "failParser", "Lvp;", "getScopeAfter", "()Lvp;", "scopeAfter", "Lvo;", "getConfigExtractor", "()Lvo;", "configExtractor", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lup;", "getScope", "()Lup;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Request implements rp, jsb, zo {
        private final /* synthetic */ jt0 $$delegate_0;

        public Request(List<yt1> list) {
            Uri uriB = fq.b(GetExternalIdsByOkIds.METHOD_NAME);
            np npVar = new np();
            npVar.a(GetExternalIdsByOkIds.INSTANCE.mapToStringApiParam(list));
            this.$$delegate_0 = new jt0(uriB, up.c, npVar, ExternalIdsResponse.INSTANCE);
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
            return new ExternalIdsResponse(new LinkedHashMap());
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetExternalIdsByOkIds$Companion;", "", "<init>", "()V", "", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lj5h;", "mapToStringApiParam", "(Ljava/util/List;)Lj5h;", "", "METHOD_NAME", "Ljava/lang/String;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final j5h mapToStringApiParam(List<yt1> list) {
            return new j5h(ApiProtocol.PARAM_UIDS, ww3.z1(list, ",", null, null, new x27(2), 30));
        }

        public static final CharSequence mapToStringApiParam$lambda$0(yt1 yt1Var) {
            return String.valueOf(yt1Var.a);
        }

        private Companion() {
        }
    }
}
