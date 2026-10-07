package defpackage;

import android.net.Uri;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hvb implements zo {
    private final String application;
    private final String collector;
    private final String platform;
    private final hu8 okParser = nu8.a;
    private final Uri uri = fq.b("log.externalLog");
    private final up scope = up.c;
    private final int priority = 2;

    public hvb(String str, String str2, String str3) {
        this.collector = str;
        this.application = str2;
        this.platform = str3;
    }

    @Override // defpackage.zo
    public hu8 getOkParser() {
        return this.okParser;
    }

    @Override // defpackage.op
    public int getPriority() {
        return this.priority;
    }

    @Override // defpackage.op
    public up getScope() {
        return this.scope;
    }

    @Override // defpackage.op
    public Uri getUri() {
        return this.uri;
    }

    public boolean shouldGzip() {
        return true;
    }

    public boolean shouldPost() {
        return true;
    }

    public boolean shouldReport() {
        return false;
    }

    public abstract void writeItems(mv8 mv8Var);

    @Override // defpackage.op
    public void writeParams(mv8 mv8Var) {
        mv8Var.a0("collector");
        mv8Var.p0(this.collector);
        mv8Var.a0("data");
        mv8Var.p();
        mv8Var.a0(CallAnalyticsApiRequest.KEY_APPLICATION);
        mv8Var.p0(this.application);
        mv8Var.a0("platform");
        mv8Var.p0(this.platform);
        mv8Var.a0(CallAnalyticsApiRequest.KEY_ITEMS);
        writeItems(mv8Var);
        mv8Var.t();
    }
}
