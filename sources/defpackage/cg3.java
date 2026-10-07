package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class cg3 extends aq implements qih, btc {
    public final long f;
    public final long g;
    public final int h;
    public final String i;
    public final boolean j;
    public final String k;
    public final Map l;
    public final String m;
    public final String n;
    public final r60 o;
    public final Long p;
    public final boolean q;

    public cg3(long j, long j2, long j3, int i, String str, boolean z, String str2, Map map, String str3, String str4, r60 r60Var, Long l, boolean z2) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = str;
        this.j = z;
        this.k = str2;
        this.l = map;
        this.m = str3;
        this.n = str4;
        this.o = r60Var;
        this.p = l;
        this.q = z2;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        dg3 dg3Var = (dg3) kihVar;
        if (dg3Var.c != null) {
            w();
            p().c0(Collections.singletonList(dg3Var.c));
        }
        o().c(new eg3(this.a));
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (!p90.C(yhhVar.b)) {
            w();
            if (this.m != null || this.n != null || this.p != null || this.k != null) {
                d();
            }
            n().f(this.g);
        }
        o().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChatUpdate chatUpdate = new Tasks.ChatUpdate();
        chatUpdate.requestId = this.a;
        chatUpdate.chatId = this.f;
        chatUpdate.chatServerId = this.g;
        String str = this.m;
        if (str != null) {
            chatUpdate.theme = str;
        } else {
            chatUpdate.themeIsNull = true;
        }
        String str2 = this.n;
        if (str2 != null) {
            chatUpdate.photoToken = str2;
        } else {
            chatUpdate.photoTokenIsNull = true;
        }
        r60 r60Var = this.o;
        if (r60Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = r60Var.b;
            rect.top = r60Var.c;
            rect.right = r60Var.d;
            rect.bottom = r60Var.e;
            chatUpdate.crop = rect;
        }
        Long l = this.p;
        if (l != null) {
            chatUpdate.pinMessageId = l.longValue();
        } else {
            chatUpdate.pinMessageIdIsNull = true;
        }
        chatUpdate.notifyPin = this.q;
        String str3 = this.k;
        if (str3 != null) {
            chatUpdate.description = str3;
        } else {
            chatUpdate.descriptionIsNull = true;
        }
        return sia.toByteArray(chatUpdate);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHAT_UPDATE;
    }

    @Override // defpackage.btc
    public final atc j() {
        rt2 rt2VarN = p().N(this.f);
        if (rt2VarN == null) {
            return atc.c;
        }
        return (rt2VarN.b.a != 0 || rt2VarN.y0()) ? atc.a : atc.b;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        int i;
        Long l = this.p;
        if (l != null && l.longValue() == -1) {
            l = new Long(0L);
        }
        Long l2 = l;
        int i2 = this.h;
        if (i2 != 0) {
            i = qt4.D(i2) != 0 ? 3 : 2;
        } else {
            i = 0;
        }
        return new wy2(this.g, i, this.i, this.j, this.k, this.l, this.m, this.n, this.o, l2, this.q, 0L);
    }

    public final void w() {
        String str = this.n;
        long j = this.f;
        if (str != null) {
            p().Z(j, uw2.b);
        }
        if (this.m != null) {
            p().Z(j, uw2.a);
        }
        if (this.p != null) {
            p().Z(j, uw2.d);
        }
    }
}
