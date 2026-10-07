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
import defpackage.oo6;
import defpackage.rp;
import defpackage.up;
import defpackage.vo;
import defpackage.vp;
import defpackage.vu8;
import defpackage.xz0;
import defpackage.zo;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId;", "", "<init>", "()V", "Request", "Response", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GetOkIdByExternalId {
    public static final String METHOD_NAME = "vchat.getOkIdByExternalId";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "", "okId", "", SdkMetricStatEvent.NAME_KEY, "", "error", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getOkId", "()J", "getName", "()Ljava/lang/String;", "getError", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Response {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final hu8 PARSER;
        private final String error;
        private final String name;
        private final long okId;

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            PARSER = new oo6(5, companion);
        }

        public /* synthetic */ Response(long j, String str, String str2, int i, j95 j95Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final String getError() {
            return this.error;
        }

        public final String getName() {
            return this.name;
        }

        public final long getOkId() {
            return this.okId;
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response$Companion;", "", "<init>", "()V", "Lvu8;", "reader", "Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "parse", "(Lvu8;)Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "Lhu8;", "PARSER", "Lhu8;", "getPARSER", "()Lhu8;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j95 j95Var) {
                this();
            }

            public final hu8 getPARSER() {
                return Response.PARSER;
            }

            public final Response parse(vu8 reader) {
                reader.p();
                String strF = null;
                long jV = 0;
                String strF2 = null;
                while (reader.hasNext()) {
                    String strName = reader.name();
                    int iHashCode = strName.hashCode();
                    if (iHashCode != 3373707) {
                        if (iHashCode != 96784904) {
                            if (iHashCode == 105793118 && strName.equals("ok_id")) {
                                jV = reader.v();
                            } else {
                                reader.x();
                            }
                        } else if (strName.equals("error")) {
                            strF2 = reader.F();
                        } else {
                            reader.x();
                        }
                    } else if (strName.equals(SdkMetricStatEvent.NAME_KEY)) {
                        strF = reader.F();
                    } else {
                        reader.x();
                    }
                }
                reader.t();
                return new Response(jV, strF, strF2);
            }

            private Companion() {
            }
        }

        public Response(long j, String str, String str2) {
            this.okId = j;
            this.name = str;
            this.error = str2;
        }

        public Response() {
            this(0L, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001bR\u001c\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0\u001e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0014\u0010(\u001a\u00020%8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040)8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Request;", "Lrp;", "Ljsb;", "Lzo;", "Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "", "id", "", "isAnon", "<init>", "(Ljava/lang/String;Z)V", "", "handleInterruptedIO", "()Ljava/lang/Object;", "canRepeat", "()Z", "shouldPost", "shouldGzip", "shouldReport", "shouldNeverPost", "shouldNeverGzip", "shouldNeverJson", "willWriteParams", "Lmv8;", "writer", "Lsbi;", "writeParams", "(Lmv8;)V", "willWriteSupplyParams", "writeSupplyParams", "Lhu8;", "getOkParser", "()Lhu8;", "okParser", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "failParser", "Lvp;", "getScopeAfter", "()Lvp;", "scopeAfter", "Lvo;", "getConfigExtractor", "()Lvo;", "configExtractor", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lup;", "getScope", "()Lup;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Request implements rp, jsb, zo {
        private final /* synthetic */ jt0 $$delegate_0;

        public Request(String str, boolean z) {
            Uri uriB = fq.b(GetOkIdByExternalId.METHOD_NAME);
            np npVar = new np();
            npVar.a(new j5h("externalId", str));
            npVar.a(new xz0("anonym", z));
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
            return new Response(0L, null, null, 7, null);
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

        public /* synthetic */ Request(String str, boolean z, int i, j95 j95Var) {
            this(str, (i & 2) != 0 ? false : z);
        }
    }
}
