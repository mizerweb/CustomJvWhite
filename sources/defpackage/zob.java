package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zob {
    public final String a = zob.class.getName();
    public final ny8 b;

    public zob(ny8 ny8Var) {
        this.b = ny8Var;
    }

    public static void a(ul9 ul9Var, hn6 hn6Var) {
        long j = hn6Var.a;
        Long l = hn6Var.g;
        ul9Var.put("trid", Long.valueOf(j));
        Object obj = hn6Var.h;
        if (obj != null) {
            ul9Var.put("eKey", obj);
        }
        if (l != null) {
            ul9Var.put("ttime", l);
            ul9Var.put("dtime", Long.valueOf(hn6Var.j - l.longValue()));
            ul9Var.put("fcmdtime", Long.valueOf(hn6Var.i - l.longValue()));
        }
        Object obj2 = hn6Var.e;
        if (obj2 != null) {
            ul9Var.put("suid", obj2);
        }
    }

    public final ae9 b() {
        return (ae9) this.b.getValue();
    }

    public final void c(hn6 hn6Var, qv5 qv5Var) {
        ae9 ae9VarB = b();
        String str = hn6Var.k;
        if (str.length() == 0) {
            str = "Unknown";
        }
        ul9 ul9Var = new ul9();
        a(ul9Var, hn6Var);
        ul9Var.put("chat_id", Long.valueOf(hn6Var.b.a));
        ul9Var.put("message_id", Long.valueOf(hn6Var.c));
        ul9Var.put("p_op", "drop");
        ul9Var.put("p_dr", qv5Var.a);
        ae9.k(ae9VarB, "PUSH", str, ul9Var.b(), 8);
    }

    public final void d() {
        gm0.n(this.a, "onNotificationOpened");
        ae9.k(b(), "PUSH", "Action", ouk.a(new ylc("p_op", "open_chats")), 8);
    }

    public final void e(vyd vydVar) {
        gm0.m(this.a, "onNotificationOpenedForChat: %s", vydVar);
        String str = vydVar.b;
        if (str == null) {
            return;
        }
        ae9.k(b(), "PUSH", "Action", ouk.a(new ylc("trid", Long.valueOf(vydVar.a)), new ylc("eKey", str), new ylc("p_op", vydVar.i == null ? "open_chat" : "open_url")), 8);
    }

    public final void f(hn6 hn6Var, u3g u3gVar, ilb ilbVar, lzd lzdVar) {
        ae9 ae9VarB = b();
        String str = hn6Var.k;
        if (str.length() == 0) {
            str = "Unknown";
        }
        ul9 ul9Var = new ul9();
        a(ul9Var, hn6Var);
        ul9Var.put("p_op", "show");
        ul9Var.put("chat_id", Long.valueOf(ilbVar.a));
        ul9Var.put("message_id", Long.valueOf(hn6Var.c));
        ul9Var.put("show_source", Integer.valueOf(u3gVar.a));
        ul9Var.put("provider", Integer.valueOf(lzdVar.a));
        ae9.k(ae9VarB, "PUSH", str, ul9Var.b(), 8);
    }

    public final void g(int i) {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.h(i, "onNotificationsMaxCountReached: maxCount="), null);
        }
    }

    public final void h(String str, ilb ilbVar, long j) {
        ae9 ae9VarB = b();
        if (str.length() == 0) {
            str = "Unknown";
        }
        ul9 ul9Var = new ul9();
        ul9Var.put("p_op", "show");
        ul9Var.put("chat_id", Long.valueOf(ilbVar.a));
        ul9Var.put("message_id", Long.valueOf(j));
        ul9Var.put("show_source", 1);
        ae9.k(ae9VarB, "PUSH", str, ul9Var.b(), 8);
    }
}
