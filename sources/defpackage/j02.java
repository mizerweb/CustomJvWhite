package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j02 {
    public final ny8 a;

    public j02(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public static String a(String str) {
        if (z5h.K0(str, "websocket", true)) {
            return "ws";
        }
        if (z5h.K0(str, "webtransport", true)) {
            return "wt";
        }
        return null;
    }
}
