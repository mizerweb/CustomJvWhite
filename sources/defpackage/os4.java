package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class os4 {
    public final ny8 a;

    public os4(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final String a() {
        if (!((Boolean) ((f5d) ((wo6) this.a.getValue())).a.t4.a(e5d.S6[281]).i()).booleanValue()) {
            ifh ifhVar = ns4.b;
            return oc9.b0();
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        ifh ifhVar2 = ns4.b;
        return uuidRandomUUID.toString();
    }
}
