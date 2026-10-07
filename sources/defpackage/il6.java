package defpackage;

import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;

/* JADX INFO: loaded from: classes3.dex */
public final class il6 implements ActionParams {
    public final String a;
    public final StartCallApiParams b;

    public il6(String str, StartCallApiParams startCallApiParams) {
        this.a = str;
        this.b = startCallApiParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il6)) {
            return false;
        }
        il6 il6Var = (il6) obj;
        return cqk.d(this.a, il6Var.a) && cqk.d(this.b, il6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Params(joinLink=" + this.a + ", startCallApiParams=" + this.b + ")";
    }
}
