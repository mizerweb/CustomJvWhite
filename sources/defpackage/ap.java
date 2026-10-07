package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ap implements zo {
    public final op a;
    public final hu8 b;
    public final hu8 c;

    public ap(op opVar, hu8 hu8Var) {
        l6m l6mVar = l6m.c;
        this.a = opVar;
        this.b = hu8Var;
        this.c = l6mVar;
    }

    @Override // defpackage.op
    public final boolean canRepeat() {
        return this.a.canRepeat();
    }

    @Override // defpackage.zo
    public final hu8 getFailParser() {
        return this.c;
    }

    @Override // defpackage.zo
    public final hu8 getOkParser() {
        return this.b;
    }

    @Override // defpackage.op
    public final int getPriority() {
        return this.a.getPriority();
    }

    @Override // defpackage.op
    public final up getScope() {
        return this.a.getScope();
    }

    @Override // defpackage.op
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.op
    public final boolean shouldNeverGzip() {
        return this.a.shouldNeverGzip();
    }

    @Override // defpackage.op
    public final boolean shouldNeverPost() {
        return this.a.shouldNeverPost();
    }

    @Override // defpackage.op
    public final boolean willWriteParams() {
        return this.a.willWriteParams();
    }

    @Override // defpackage.op
    public final boolean willWriteSupplyParams() {
        return this.a.willWriteSupplyParams();
    }

    @Override // defpackage.op
    public final void writeParams(mv8 mv8Var) {
        this.a.writeParams(mv8Var);
    }

    @Override // defpackage.op
    public final void writeSupplyParams(mv8 mv8Var) {
        this.a.writeSupplyParams(mv8Var);
    }
}
