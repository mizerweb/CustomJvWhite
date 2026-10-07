package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rlf extends zkf {
    public final String h;
    public final List i;

    public rlf(qlf qlfVar) {
        super(qlfVar);
        this.h = qlfVar.e;
        this.i = qlfVar.f;
    }

    @Override // defpackage.zkf
    public final jy3 C() {
        jy3 jy3Var = new jy3(this.b);
        jy3Var.g = this.h;
        jy3Var.u = false;
        jy3Var.b(Collections.unmodifiableList(this.i));
        return jy3Var;
    }

    @Override // defpackage.zkf
    public final String D() {
        return "ServiceTaskSendTextComment";
    }
}
