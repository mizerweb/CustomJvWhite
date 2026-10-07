package ru.ok.android.onelog;

import android.net.Uri;
import defpackage.fq;
import defpackage.hu8;
import defpackage.l6m;
import defpackage.mv8;
import defpackage.nu8;
import defpackage.u21;
import defpackage.up;
import defpackage.vo;
import defpackage.vp;
import defpackage.zo;
import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes3.dex */
final class OneLogApiRequest implements zo {
    private static final Uri URI = fq.b("log.externalLog");
    private final String application;
    private final u21 items;
    private final String platform;

    public OneLogApiRequest(String str, String str2, u21 u21Var) {
        this.application = str;
        this.platform = str2;
        this.items = u21Var;
    }

    @Override // defpackage.op
    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    @Override // defpackage.zo
    public /* bridge */ /* synthetic */ vo getConfigExtractor() {
        return vo.M;
    }

    @Override // defpackage.zo
    public /* bridge */ /* synthetic */ hu8 getFailParser() {
        return l6m.c;
    }

    @Override // defpackage.zo
    public hu8 getOkParser() {
        return nu8.a;
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
    public /* bridge */ /* synthetic */ vp getScopeAfter() {
        return vp.a;
    }

    @Override // defpackage.op
    public Uri getUri() {
        return URI;
    }

    public /* bridge */ /* synthetic */ boolean shouldGzip() {
        return false;
    }

    @Override // defpackage.op
    public /* bridge */ /* synthetic */ boolean shouldNeverGzip() {
        return false;
    }

    public boolean shouldNeverJson() {
        return OneLogImpl.getInstance().getShouldNeverJson();
    }

    @Override // defpackage.op
    public /* bridge */ /* synthetic */ boolean shouldNeverPost() {
        return false;
    }

    public /* bridge */ /* synthetic */ boolean shouldPost() {
        return false;
    }

    public boolean shouldReport() {
        return false;
    }

    @Override // defpackage.op
    public /* bridge */ /* synthetic */ boolean willWriteParams() {
        return true;
    }

    @Override // defpackage.op
    public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
        return false;
    }

    @Override // defpackage.op
    public void writeParams(mv8 mv8Var) throws JsonSerializeException, IOException {
        mv8Var.a0("data");
        mv8Var.p();
        mv8Var.a0(CallAnalyticsApiRequest.KEY_APPLICATION);
        mv8Var.p0(this.application);
        mv8Var.a0("platform");
        mv8Var.p0(this.platform);
        mv8Var.a0(CallAnalyticsApiRequest.KEY_ITEMS);
        this.items.write(mv8Var);
        mv8Var.t();
    }

    @Override // defpackage.op
    public /* bridge */ /* synthetic */ void writeSupplyParams(mv8 mv8Var) throws JsonSerializeException, IOException {
    }
}
