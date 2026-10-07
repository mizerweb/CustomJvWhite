package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nz2 extends kih {
    public List c;
    public st2 d;
    public pj4 e;

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        switch (str) {
            case "chat":
                this.d = st2.b(fkaVar);
                break;
            case "user":
                this.e = pj4.e(fkaVar);
                break;
            case "chats":
                this.c = b50.b(fkaVar);
                break;
            default:
                fkaVar.x();
                break;
        }
    }

    @Override // defpackage.sq0
    public final String toString() {
        String strValueOf = String.valueOf(Integer.valueOf(tre.O(this.c)));
        String strValueOf2 = String.valueOf(this.d);
        return zo5.w(qv1.q("{chats=", strValueOf, ", chat=", strValueOf2, ", contact="), String.valueOf(this.e), "}");
    }
}
