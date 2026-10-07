package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cx2 {
    public static final cx2 h;
    public final long a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    static {
        List listAsList = Arrays.asList(xw2.a, xw2.b, xw2.c);
        bx2 bx2Var = new bx2();
        bx2Var.a = 0L;
        bx2Var.c = 0L;
        bx2Var.d = 0L;
        bx2Var.b = listAsList;
        bx2Var.f = 0L;
        bx2Var.g = 0L;
        h = new cx2(bx2Var);
    }

    public cx2(bx2 bx2Var) {
        this.a = bx2Var.a;
        List list = bx2Var.b;
        this.b = list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
        this.c = bx2Var.c;
        this.d = bx2Var.d;
        this.e = bx2Var.e;
        this.f = bx2Var.f;
        this.g = bx2Var.g;
    }

    public final bx2 a() {
        bx2 bx2Var = new bx2();
        bx2Var.a = this.a;
        bx2Var.b = new ArrayList(this.b);
        bx2Var.c = this.c;
        bx2Var.d = this.d;
        bx2Var.e = this.e;
        bx2Var.f = this.f;
        bx2Var.g = this.g;
        return bx2Var;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("ChatSettings{dontDisturbUntil=");
        sb.append(this.a);
        sb.append(", options=");
        List list = this.b;
        if (list == null) {
            string = "[]";
        } else {
            ik4 ik4Var = new ik4(11);
            StringBuilder sb2 = new StringBuilder();
            ww3.x1(list, sb2, ",", "[", "]", -1, "...", ik4Var);
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(", lastNotifMark=");
        sb.append(this.c);
        sb.append(", lastNotifMessageId=");
        sb.append(this.d);
        sb.append(", favoriteIndex=");
        sb.append(this.e);
        sb.append(", hideMyLiveLocationPanelBeforeTime=");
        sb.append(this.f);
        sb.append(", hideLiveLocationPanelBeforeTime=");
        return zo5.u(sb, this.g, '}');
    }
}
