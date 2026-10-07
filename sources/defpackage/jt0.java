package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class jt0 implements zo {
    public final Uri a;
    public final up b;
    public final np c;
    public final hu8 d;

    public jt0(Uri uri, up upVar, np npVar, hu8 hu8Var) {
        this.a = uri;
        this.b = upVar;
        this.c = npVar;
        this.d = hu8Var;
    }

    @Override // defpackage.op
    public final boolean canRepeat() {
        return this.c.b;
    }

    @Override // defpackage.zo
    public final hu8 getOkParser() {
        return this.d;
    }

    @Override // defpackage.op
    public final int getPriority() {
        return 16;
    }

    @Override // defpackage.op
    public final up getScope() {
        return this.b;
    }

    @Override // defpackage.op
    public final Uri getUri() {
        return this.a;
    }

    @Override // defpackage.op
    public final boolean willWriteParams() {
        return this.c.d;
    }

    @Override // defpackage.op
    public final boolean willWriteSupplyParams() {
        return this.c.e;
    }

    @Override // defpackage.op
    public final void writeParams(mv8 mv8Var) {
        this.c.c(mv8Var);
    }

    @Override // defpackage.op
    public final void writeSupplyParams(mv8 mv8Var) {
        this.c.d(mv8Var);
    }
}
