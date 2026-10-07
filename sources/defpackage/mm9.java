package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes2.dex */
public final class mm9 {
    public static final /* synthetic */ zv8[] i = {new z8b(mm9.class, "messageDb", "getMessageDb()Lru/ok/tamtam/messages/MessageDb;"), zo5.e(zfe.a, mm9.class, "messageModel", "getMessageModel()Lone/me/messages/list/loader/MessageModel;"), new z8b(mm9.class, "senderContact", "getSenderContact()Lru/ok/tamtam/contacts/Contact;"), new z8b(mm9.class, "messageModels", "getMessageModels()Ljava/util/List;")};
    public final rt2 a;
    public final rt2 b;
    public final c c;
    public final int d;
    public final v56 e = new v56(11, (byte) 0);
    public final v56 f = new v56(11, (byte) 0);
    public final v56 g = new v56(11, (byte) 0);
    public final v56 h = new v56(11, (byte) 0);

    public mm9(rt2 rt2Var, rt2 rt2Var2, c cVar, int i2) {
        this.a = rt2Var;
        this.b = rt2Var2;
        this.c = cVar;
        this.d = i2;
    }

    public final int a() {
        boolean z = b().e == e().v();
        lx2 lx2Var = this.a.b.b;
        return sfl.c(sfl.b(0, (lx2Var == lx2.b || lx2Var == lx2.e) && z), z);
    }

    public final sfa b() {
        return (sfa) this.e.m(this, i[0]);
    }

    public final MessageModel c() {
        return (MessageModel) this.f.m(this, i[1]);
    }

    public final List d() {
        return (List) this.h.m(this, i[3]);
    }

    public final vg4 e() {
        return (vg4) this.g.m(this, i[2]);
    }
}
